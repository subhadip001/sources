package com.google.firebase.database.connection;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import com.google.firebase.database.connection.util.StringListReader;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.tubesock.WebSocket;
import com.google.firebase.database.tubesock.WebSocketEventHandler;
import com.google.firebase.database.tubesock.WebSocketException;
import com.google.firebase.database.tubesock.WebSocketMessage;
import com.google.firebase.database.util.JsonMapper;
import f.a.b.a.a;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class WebsocketConnection {
    private static final long CONNECT_TIMEOUT_MS = 30000;
    private static final long KEEP_ALIVE_TIMEOUT_MS = 45000;
    private static final int MAX_FRAME_SIZE = 16384;
    private static long connectionId;
    private WSClient conn;
    private ScheduledFuture<?> connectTimeout;
    private final ConnectionContext connectionContext;
    private Delegate delegate;
    private final ScheduledExecutorService executorService;
    private StringListReader frameReader;
    private ScheduledFuture<?> keepAlive;
    private final LogWrapper logger;
    private boolean everConnected = false;
    private boolean isClosed = false;
    private long totalFrames = 0;

    /* loaded from: classes2.dex */
    public interface Delegate {
        void onDisconnect(boolean z);

        void onMessage(Map<String, Object> map);
    }

    /* loaded from: classes2.dex */
    public interface WSClient {
        void close();

        void connect();

        void send(String str);
    }

    /* loaded from: classes2.dex */
    public class WSClientTubesock implements WSClient, WebSocketEventHandler {
        private WebSocket ws;

        private void shutdown() {
            this.ws.close();
            try {
                this.ws.blockClose();
            } catch (InterruptedException e2) {
                WebsocketConnection.this.logger.error("Interrupted while shutting down websocket threads", e2);
            }
        }

        @Override // com.google.firebase.database.connection.WebsocketConnection.WSClient
        public void close() {
            this.ws.close();
        }

        @Override // com.google.firebase.database.connection.WebsocketConnection.WSClient
        public void connect() {
            try {
                this.ws.connect();
            } catch (WebSocketException e2) {
                if (WebsocketConnection.this.logger.logsDebug()) {
                    WebsocketConnection.this.logger.debug("Error connecting", e2, new Object[0]);
                }
                shutdown();
            }
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public void onClose() {
            WebsocketConnection.this.executorService.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.3
                @Override // java.lang.Runnable
                public void run() {
                    if (WebsocketConnection.this.logger.logsDebug()) {
                        WebsocketConnection.this.logger.debug("closed", new Object[0]);
                    }
                    WebsocketConnection.this.onClosed();
                }
            });
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public void onError(final WebSocketException webSocketException) {
            WebsocketConnection.this.executorService.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.4
                @Override // java.lang.Runnable
                public void run() {
                    if (webSocketException.getCause() == null || !(webSocketException.getCause() instanceof EOFException)) {
                        WebsocketConnection.this.logger.debug("WebSocket error.", webSocketException, new Object[0]);
                    } else {
                        WebsocketConnection.this.logger.debug("WebSocket reached EOF.", new Object[0]);
                    }
                    WebsocketConnection.this.onClosed();
                }
            });
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public void onLogMessage(String str) {
            if (WebsocketConnection.this.logger.logsDebug()) {
                WebsocketConnection.this.logger.debug(a.p("Tubesock: ", str), new Object[0]);
            }
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public void onMessage(WebSocketMessage webSocketMessage) {
            final String text = webSocketMessage.getText();
            if (WebsocketConnection.this.logger.logsDebug()) {
                WebsocketConnection.this.logger.debug(a.p("ws message: ", text), new Object[0]);
            }
            WebsocketConnection.this.executorService.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.2
                @Override // java.lang.Runnable
                public void run() {
                    WebsocketConnection.this.handleIncomingFrame(text);
                }
            });
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public void onOpen() {
            WebsocketConnection.this.executorService.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.1
                @Override // java.lang.Runnable
                public void run() {
                    WebsocketConnection.this.connectTimeout.cancel(false);
                    WebsocketConnection.this.everConnected = true;
                    if (WebsocketConnection.this.logger.logsDebug()) {
                        WebsocketConnection.this.logger.debug("websocket opened", new Object[0]);
                    }
                    WebsocketConnection.this.resetKeepAlive();
                }
            });
        }

        @Override // com.google.firebase.database.connection.WebsocketConnection.WSClient
        public void send(String str) {
            this.ws.send(str);
        }

        private WSClientTubesock(WebSocket webSocket) {
            this.ws = webSocket;
            webSocket.setEventHandler(this);
        }
    }

    public WebsocketConnection(ConnectionContext connectionContext, HostInfo hostInfo, String str, String str2, Delegate delegate, String str3) {
        this.connectionContext = connectionContext;
        this.executorService = connectionContext.getExecutorService();
        this.delegate = delegate;
        long j2 = connectionId;
        connectionId = 1 + j2;
        this.logger = new LogWrapper(connectionContext.getLogger(), "WebSocket", a.l("ws_", j2));
        this.conn = createConnection(hostInfo, str, str2, str3);
    }

    private void appendFrame(String str) {
        this.frameReader.addString(str);
        long j2 = this.totalFrames - 1;
        this.totalFrames = j2;
        if (j2 == 0) {
            try {
                this.frameReader.freeze();
                Map<String, Object> parseJson = JsonMapper.parseJson(this.frameReader.toString());
                this.frameReader = null;
                if (this.logger.logsDebug()) {
                    LogWrapper logWrapper = this.logger;
                    logWrapper.debug("handleIncomingFrame complete frame: " + parseJson, new Object[0]);
                }
                this.delegate.onMessage(parseJson);
            } catch (IOException e2) {
                LogWrapper logWrapper2 = this.logger;
                StringBuilder A = a.A("Error parsing frame: ");
                A.append(this.frameReader.toString());
                logWrapper2.error(A.toString(), e2);
                close();
                shutdown();
            } catch (ClassCastException e3) {
                LogWrapper logWrapper3 = this.logger;
                StringBuilder A2 = a.A("Error parsing frame (cast error): ");
                A2.append(this.frameReader.toString());
                logWrapper3.error(A2.toString(), e3);
                close();
                shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeIfNeverConnected() {
        if (this.everConnected || this.isClosed) {
            return;
        }
        if (this.logger.logsDebug()) {
            this.logger.debug("timed out on connect", new Object[0]);
        }
        this.conn.close();
    }

    private WSClient createConnection(HostInfo hostInfo, String str, String str2, String str3) {
        if (str == null) {
            str = hostInfo.getHost();
        }
        URI connectionUrl = HostInfo.getConnectionUrl(str, hostInfo.isSecure(), hostInfo.getNamespace(), str3);
        HashMap hashMap = new HashMap();
        hashMap.put(DefaultSettingsSpiCall.HEADER_USER_AGENT, this.connectionContext.getUserAgent());
        hashMap.put("X-Firebase-GMPID", this.connectionContext.getApplicationId());
        hashMap.put("X-Firebase-AppCheck", str2);
        return new WSClientTubesock(new WebSocket(this.connectionContext, connectionUrl, null, hashMap));
    }

    private String extractFrameCount(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    handleNewFrameCount(parseInt);
                    return null;
                }
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        handleNewFrameCount(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIncomingFrame(String str) {
        if (this.isClosed) {
            return;
        }
        resetKeepAlive();
        if (isBuffering()) {
            appendFrame(str);
            return;
        }
        String extractFrameCount = extractFrameCount(str);
        if (extractFrameCount != null) {
            appendFrame(extractFrameCount);
        }
    }

    private void handleNewFrameCount(int i2) {
        this.totalFrames = i2;
        this.frameReader = new StringListReader();
        if (this.logger.logsDebug()) {
            LogWrapper logWrapper = this.logger;
            StringBuilder A = a.A("HandleNewFrameCount: ");
            A.append(this.totalFrames);
            logWrapper.debug(A.toString(), new Object[0]);
        }
    }

    private boolean isBuffering() {
        return this.frameReader != null;
    }

    private Runnable nop() {
        return new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.2
            @Override // java.lang.Runnable
            public void run() {
                if (WebsocketConnection.this.conn != null) {
                    WebsocketConnection.this.conn.send(CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
                    WebsocketConnection.this.resetKeepAlive();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClosed() {
        if (!this.isClosed) {
            if (this.logger.logsDebug()) {
                this.logger.debug("closing itself", new Object[0]);
            }
            shutdown();
        }
        this.conn = null;
        ScheduledFuture<?> scheduledFuture = this.keepAlive;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetKeepAlive() {
        if (this.isClosed) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.keepAlive;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (this.logger.logsDebug()) {
                LogWrapper logWrapper = this.logger;
                StringBuilder A = a.A("Reset keepAlive. Remaining: ");
                A.append(this.keepAlive.getDelay(TimeUnit.MILLISECONDS));
                logWrapper.debug(A.toString(), new Object[0]);
            }
        } else if (this.logger.logsDebug()) {
            this.logger.debug("Reset keepAlive", new Object[0]);
        }
        this.keepAlive = this.executorService.schedule(nop(), KEEP_ALIVE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
    }

    private void shutdown() {
        this.isClosed = true;
        this.delegate.onDisconnect(this.everConnected);
    }

    private static String[] splitIntoFrames(String str, int i2) {
        int i3 = 0;
        if (str.length() <= i2) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i3 < str.length()) {
            int i4 = i3 + i2;
            arrayList.add(str.substring(i3, Math.min(i4, str.length())));
            i3 = i4;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void close() {
        if (this.logger.logsDebug()) {
            this.logger.debug("websocket is being closed", new Object[0]);
        }
        this.isClosed = true;
        this.conn.close();
        ScheduledFuture<?> scheduledFuture = this.connectTimeout;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture2 = this.keepAlive;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public void open() {
        this.conn.connect();
        this.connectTimeout = this.executorService.schedule(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.1
            @Override // java.lang.Runnable
            public void run() {
                WebsocketConnection.this.closeIfNeverConnected();
            }
        }, CONNECT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
    }

    public void send(Map<String, Object> map) {
        resetKeepAlive();
        try {
            String[] splitIntoFrames = splitIntoFrames(JsonMapper.serializeJson(map), MAX_FRAME_SIZE);
            if (splitIntoFrames.length > 1) {
                this.conn.send("" + splitIntoFrames.length);
            }
            for (String str : splitIntoFrames) {
                this.conn.send(str);
            }
        } catch (IOException e2) {
            LogWrapper logWrapper = this.logger;
            StringBuilder A = a.A("Failed to serialize message: ");
            A.append(map.toString());
            logWrapper.error(A.toString(), e2);
            shutdown();
        }
    }

    public void start() {
    }
}

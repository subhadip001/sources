package com.google.firebase.database.connection;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.database.connection.WebsocketConnection;
import com.google.firebase.database.logging.LogWrapper;
import f.a.b.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Connection implements WebsocketConnection.Delegate {
    private static final String REQUEST_PAYLOAD = "d";
    private static final String REQUEST_TYPE = "t";
    private static final String REQUEST_TYPE_DATA = "d";
    private static final String SERVER_CONTROL_MESSAGE = "c";
    private static final String SERVER_CONTROL_MESSAGE_DATA = "d";
    private static final String SERVER_CONTROL_MESSAGE_HELLO = "h";
    private static final String SERVER_CONTROL_MESSAGE_RESET = "r";
    private static final String SERVER_CONTROL_MESSAGE_SHUTDOWN = "s";
    private static final String SERVER_CONTROL_MESSAGE_TYPE = "t";
    private static final String SERVER_DATA_MESSAGE = "d";
    private static final String SERVER_ENVELOPE_DATA = "d";
    private static final String SERVER_ENVELOPE_TYPE = "t";
    private static final String SERVER_HELLO_HOST = "h";
    private static final String SERVER_HELLO_SESSION_ID = "s";
    private static final String SERVER_HELLO_TIMESTAMP = "ts";
    private static long connectionIds;
    private WebsocketConnection conn;
    private Delegate delegate;
    private HostInfo hostInfo;
    private final LogWrapper logger;
    private State state;

    /* loaded from: classes2.dex */
    public interface Delegate {
        void onCacheHost(String str);

        void onDataMessage(Map<String, Object> map);

        void onDisconnect(DisconnectReason disconnectReason);

        void onKill(String str);

        void onReady(long j2, String str);
    }

    /* loaded from: classes2.dex */
    public enum DisconnectReason {
        SERVER_RESET,
        OTHER
    }

    /* loaded from: classes2.dex */
    public enum State {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public Connection(ConnectionContext connectionContext, HostInfo hostInfo, String str, Delegate delegate, String str2, String str3) {
        long j2 = connectionIds;
        connectionIds = 1 + j2;
        this.hostInfo = hostInfo;
        this.delegate = delegate;
        this.logger = new LogWrapper(connectionContext.getLogger(), "Connection", a.l("conn_", j2));
        this.state = State.REALTIME_CONNECTING;
        this.conn = new WebsocketConnection(connectionContext, hostInfo, str, str3, this, str2);
    }

    private void onConnectionReady(long j2, String str) {
        if (this.logger.logsDebug()) {
            this.logger.debug("realtime connection established", new Object[0]);
        }
        this.state = State.REALTIME_CONNECTED;
        this.delegate.onReady(j2, str);
    }

    private void onConnectionShutdown(String str) {
        if (this.logger.logsDebug()) {
            this.logger.debug("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.delegate.onKill(str);
        close();
    }

    private void onControlMessage(Map<String, Object> map) {
        if (this.logger.logsDebug()) {
            LogWrapper logWrapper = this.logger;
            StringBuilder A = a.A("Got control message: ");
            A.append(map.toString());
            logWrapper.debug(A.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str != null) {
                if (str.equals("s")) {
                    onConnectionShutdown((String) map.get(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG));
                    return;
                } else if (str.equals(SERVER_CONTROL_MESSAGE_RESET)) {
                    onReset((String) map.get(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG));
                    return;
                } else if (str.equals("h")) {
                    onHandshake((Map) map.get(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG));
                    return;
                } else if (this.logger.logsDebug()) {
                    LogWrapper logWrapper2 = this.logger;
                    logWrapper2.debug("Ignoring unknown control message: " + str, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            if (this.logger.logsDebug()) {
                LogWrapper logWrapper3 = this.logger;
                logWrapper3.debug("Got invalid control message: " + map.toString(), new Object[0]);
            }
            close();
        } catch (ClassCastException e2) {
            if (this.logger.logsDebug()) {
                LogWrapper logWrapper4 = this.logger;
                StringBuilder A2 = a.A("Failed to parse control message: ");
                A2.append(e2.toString());
                logWrapper4.debug(A2.toString(), new Object[0]);
            }
            close();
        }
    }

    private void onDataMessage(Map<String, Object> map) {
        if (this.logger.logsDebug()) {
            LogWrapper logWrapper = this.logger;
            StringBuilder A = a.A("received data message: ");
            A.append(map.toString());
            logWrapper.debug(A.toString(), new Object[0]);
        }
        this.delegate.onDataMessage(map);
    }

    private void onHandshake(Map<String, Object> map) {
        long longValue = ((Long) map.get(SERVER_HELLO_TIMESTAMP)).longValue();
        this.delegate.onCacheHost((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.state == State.REALTIME_CONNECTING) {
            this.conn.start();
            onConnectionReady(longValue, str);
        }
    }

    private void onReset(String str) {
        if (this.logger.logsDebug()) {
            LogWrapper logWrapper = this.logger;
            StringBuilder A = a.A("Got a reset; killing connection to ");
            A.append(this.hostInfo.getHost());
            A.append("; Updating internalHost to ");
            A.append(str);
            logWrapper.debug(A.toString(), new Object[0]);
        }
        this.delegate.onCacheHost(str);
        close(DisconnectReason.SERVER_RESET);
    }

    private void sendData(Map<String, Object> map, boolean z) {
        if (this.state != State.REALTIME_CONNECTED) {
            this.logger.debug("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.logger.debug("Sending data (contents hidden)", new Object[0]);
        } else {
            this.logger.debug("Sending data: %s", map);
        }
        this.conn.send(map);
    }

    public void close(DisconnectReason disconnectReason) {
        State state = this.state;
        State state2 = State.REALTIME_DISCONNECTED;
        if (state != state2) {
            if (this.logger.logsDebug()) {
                this.logger.debug("closing realtime connection", new Object[0]);
            }
            this.state = state2;
            WebsocketConnection websocketConnection = this.conn;
            if (websocketConnection != null) {
                websocketConnection.close();
                this.conn = null;
            }
            this.delegate.onDisconnect(disconnectReason);
        }
    }

    public void injectConnectionFailure() {
        close();
    }

    @Override // com.google.firebase.database.connection.WebsocketConnection.Delegate
    public void onDisconnect(boolean z) {
        this.conn = null;
        if (!z && this.state == State.REALTIME_CONNECTING) {
            if (this.logger.logsDebug()) {
                this.logger.debug("Realtime connection failed", new Object[0]);
            }
        } else if (this.logger.logsDebug()) {
            this.logger.debug("Realtime connection lost", new Object[0]);
        }
        close();
    }

    @Override // com.google.firebase.database.connection.WebsocketConnection.Delegate
    public void onMessage(Map<String, Object> map) {
        try {
            String str = (String) map.get("t");
            if (str != null) {
                if (str.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG)) {
                    onDataMessage((Map) map.get(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG));
                    return;
                } else if (str.equals(SERVER_CONTROL_MESSAGE)) {
                    onControlMessage((Map) map.get(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG));
                    return;
                } else if (this.logger.logsDebug()) {
                    LogWrapper logWrapper = this.logger;
                    logWrapper.debug("Ignoring unknown server message type: " + str, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            if (this.logger.logsDebug()) {
                LogWrapper logWrapper2 = this.logger;
                logWrapper2.debug("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
            }
            close();
        } catch (ClassCastException e2) {
            if (this.logger.logsDebug()) {
                LogWrapper logWrapper3 = this.logger;
                StringBuilder A = a.A("Failed to parse server message: ");
                A.append(e2.toString());
                logWrapper3.debug(A.toString(), new Object[0]);
            }
            close();
        }
    }

    public void open() {
        if (this.logger.logsDebug()) {
            this.logger.debug("Opening a connection", new Object[0]);
        }
        this.conn.open();
    }

    public void sendRequest(Map<String, Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);
        hashMap.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, map);
        sendData(hashMap, z);
    }

    public void close() {
        close(DisconnectReason.OTHER);
    }
}

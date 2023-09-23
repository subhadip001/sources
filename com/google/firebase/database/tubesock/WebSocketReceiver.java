package com.google.firebase.database.tubesock;

import com.google.firebase.database.tubesock.MessageBuilderFactory;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class WebSocketReceiver {
    private MessageBuilderFactory.Builder pendingBuilder;
    private WebSocket websocket;
    private DataInputStream input = null;
    private WebSocketEventHandler eventHandler = null;
    private byte[] inputHeader = new byte[112];
    private volatile boolean stop = false;

    public WebSocketReceiver(WebSocket webSocket) {
        this.websocket = null;
        this.websocket = webSocket;
    }

    private void appendBytes(boolean z, byte b, byte[] bArr) {
        if (b == 9) {
            if (z) {
                handlePing(bArr);
                return;
            }
            throw new WebSocketException("PING must not fragment across frames");
        }
        MessageBuilderFactory.Builder builder = this.pendingBuilder;
        if (builder != null && b != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        }
        if (builder == null && b == 0) {
            throw new WebSocketException("Received continuing frame, but there's nothing to continue");
        }
        if (builder == null) {
            this.pendingBuilder = MessageBuilderFactory.builder(b);
        }
        if (!this.pendingBuilder.appendBytes(bArr)) {
            throw new WebSocketException("Failed to decode frame");
        }
        if (z) {
            WebSocketMessage message = this.pendingBuilder.toMessage();
            this.pendingBuilder = null;
            if (message != null) {
                this.eventHandler.onMessage(message);
                return;
            }
            throw new WebSocketException("Failed to decode whole message");
        }
    }

    private void handleError(WebSocketException webSocketException) {
        stopit();
        this.websocket.handleReceiverError(webSocketException);
    }

    private void handlePing(byte[] bArr) {
        if (bArr.length <= 125) {
            this.websocket.pong(bArr);
            return;
        }
        throw new WebSocketException("PING frame too long");
    }

    private long parseLong(byte[] bArr, int i2) {
        return (bArr[i2 + 0] << 56) + ((bArr[i2 + 1] & 255) << 48) + ((bArr[i2 + 2] & 255) << 40) + ((bArr[i2 + 3] & 255) << 32) + ((bArr[i2 + 4] & 255) << 24) + ((bArr[i2 + 5] & 255) << 16) + ((bArr[i2 + 6] & 255) << 8) + ((bArr[i2 + 7] & 255) << 0);
    }

    private int read(byte[] bArr, int i2, int i3) {
        this.input.readFully(bArr, i2, i3);
        return i3;
    }

    public boolean isRunning() {
        return !this.stop;
    }

    public void run() {
        int read;
        byte[] bArr;
        boolean z;
        this.eventHandler = this.websocket.getEventHandler();
        while (!this.stop) {
            try {
                read = read(this.inputHeader, 0, 1) + 0;
                bArr = this.inputHeader;
                z = (bArr[0] & 128) != 0;
            } catch (WebSocketException e2) {
                handleError(e2);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e3) {
                handleError(new WebSocketException("IO Error", e3));
            }
            if (!((bArr[0] & 112) != 0)) {
                byte b = (byte) (bArr[0] & 15);
                int read2 = read + read(bArr, read, 1);
                byte[] bArr2 = this.inputHeader;
                byte b2 = bArr2[1];
                long j2 = 0;
                if (b2 < 126) {
                    j2 = b2;
                } else if (b2 == 126) {
                    read(bArr2, read2, 2);
                    byte[] bArr3 = this.inputHeader;
                    j2 = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
                } else if (b2 == Byte.MAX_VALUE) {
                    j2 = parseLong(this.inputHeader, (read2 + read(bArr2, read2, 8)) - 8);
                }
                int i2 = (int) j2;
                byte[] bArr4 = new byte[i2];
                read(bArr4, 0, i2);
                if (b == 8) {
                    this.websocket.onCloseOpReceived();
                } else if (b != 10) {
                    if (b != 1 && b != 2 && b != 9 && b != 0) {
                        throw new WebSocketException("Unsupported opcode: " + ((int) b));
                    }
                    appendBytes(z, b, bArr4);
                }
            } else {
                throw new WebSocketException("Invalid frame received");
            }
        }
    }

    public void setInput(DataInputStream dataInputStream) {
        this.input = dataInputStream;
    }

    public void stopit() {
        this.stop = true;
    }
}

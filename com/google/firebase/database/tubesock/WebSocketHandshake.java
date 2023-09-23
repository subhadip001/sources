package com.google.firebase.database.tubesock;

import android.util.Base64;
import f.a.b.a.a;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebSocketHandshake {
    private static final String WEBSOCKET_VERSION = "13";
    private Map<String, String> extraHeaders;
    private String nonce;
    private String protocol;
    private URI url;

    public WebSocketHandshake(URI uri, String str, Map<String, String> map) {
        this.url = null;
        this.protocol = null;
        this.nonce = null;
        this.extraHeaders = null;
        this.url = uri;
        this.protocol = str;
        this.extraHeaders = map;
        this.nonce = createNonce();
    }

    private String createNonce() {
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) rand(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    private String generateHeader(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = a.u(a.E(str, str2, ": "), linkedHashMap.get(str2), "\r\n");
        }
        return str;
    }

    private int rand(int i2, int i3) {
        return (int) ((Math.random() * i3) + i2);
    }

    public byte[] getHandshake() {
        String path = this.url.getPath();
        String query = this.url.getQuery();
        StringBuilder A = a.A(path);
        A.append(query == null ? "" : a.p("?", query));
        String sb = A.toString();
        String host = this.url.getHost();
        if (this.url.getPort() != -1) {
            StringBuilder D = a.D(host, ":");
            D.append(this.url.getPort());
            host = D.toString();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", WEBSOCKET_VERSION);
        linkedHashMap.put("Sec-WebSocket-Key", this.nonce);
        String str = this.protocol;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map<String, String> map = this.extraHeaders;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, this.extraHeaders.get(str2));
                }
            }
        }
        StringBuilder A2 = a.A(a.q("GET ", sb, " HTTP/1.1\r\n"));
        A2.append(generateHeader(linkedHashMap));
        byte[] bytes = a.p(A2.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public void verifyServerHandshakeHeaders(HashMap<String, String> hashMap) {
        if ("websocket".equals(hashMap.get("upgrade"))) {
            if (!"upgrade".equals(hashMap.get("connection"))) {
                throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
            }
            return;
        }
        throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
    }

    public void verifyServerStatusLine(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new WebSocketException("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new WebSocketException("connection failed: 404 not found");
        }
        if (parseInt != 101) {
            throw new WebSocketException(a.i("connection failed: unknown status code ", parseInt));
        }
    }
}

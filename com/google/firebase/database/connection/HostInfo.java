package com.google.firebase.database.connection;

import f.a.b.a.a;
import java.net.URI;

/* loaded from: classes2.dex */
public class HostInfo {
    private static final String LAST_SESSION_ID_PARAM = "ls";
    private static final String VERSION_PARAM = "v";
    private final String host;
    private final String namespace;
    private final boolean secure;

    public HostInfo(String str, String str2, boolean z) {
        this.host = str;
        this.namespace = str2;
        this.secure = z;
    }

    public static URI getConnectionUrl(String str, boolean z, String str2, String str3) {
        String w = a.w(a.F(z ? "wss" : "ws", "://", str, "/.ws?ns=", str2), "&", VERSION_PARAM, "=", "5");
        if (str3 != null) {
            w = a.q(w, "&ls=", str3);
        }
        return URI.create(w);
    }

    public String getHost() {
        return this.host;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder A = a.A("http");
        A.append(this.secure ? "s" : "");
        A.append("://");
        A.append(this.host);
        return A.toString();
    }
}

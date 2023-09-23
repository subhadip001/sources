package com.google.firebase.database.core;

import com.google.firebase.database.annotations.Nullable;
import com.google.firebase.emulators.EmulatedServiceSettings;
import f.a.b.a.a;
import java.net.URI;

/* loaded from: classes2.dex */
public final class RepoInfo {
    private static final String LAST_SESSION_ID_PARAM = "ls";
    private static final String VERSION_PARAM = "v";
    public String host;
    public String internalHost;
    public String namespace;
    public boolean secure;

    public void applyEmulatorSettings(@Nullable EmulatedServiceSettings emulatedServiceSettings) {
        if (emulatedServiceSettings == null) {
            return;
        }
        String str = emulatedServiceSettings.getHost() + ":" + emulatedServiceSettings.getPort();
        this.host = str;
        this.internalHost = str;
        this.secure = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RepoInfo.class != obj.getClass()) {
            return false;
        }
        RepoInfo repoInfo = (RepoInfo) obj;
        if (this.secure == repoInfo.secure && this.host.equals(repoInfo.host)) {
            return this.namespace.equals(repoInfo.namespace);
        }
        return false;
    }

    public URI getConnectionURL(String str) {
        StringBuilder D = a.D(this.secure ? "wss" : "ws", "://");
        D.append(this.internalHost);
        D.append("/.ws?ns=");
        a.R(D, this.namespace, "&", VERSION_PARAM, "=");
        D.append("5");
        String sb = D.toString();
        if (str != null) {
            sb = a.q(sb, "&ls=", str);
        }
        return URI.create(sb);
    }

    public int hashCode() {
        return this.namespace.hashCode() + (((this.host.hashCode() * 31) + (this.secure ? 1 : 0)) * 31);
    }

    public boolean isCacheableHost() {
        return this.internalHost.startsWith("s-");
    }

    public boolean isCustomHost() {
        return (this.host.contains(".firebaseio.com") || this.host.contains(".firebaseio-demo.com")) ? false : true;
    }

    public boolean isDemoHost() {
        return this.host.contains(".firebaseio-demo.com");
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toDebugString() {
        StringBuilder A = a.A("(host=");
        A.append(this.host);
        A.append(", secure=");
        A.append(this.secure);
        A.append(", ns=");
        A.append(this.namespace);
        A.append(" internal=");
        return a.u(A, this.internalHost, ")");
    }

    public String toString() {
        StringBuilder A = a.A("http");
        A.append(this.secure ? "s" : "");
        A.append("://");
        A.append(this.host);
        return A.toString();
    }
}

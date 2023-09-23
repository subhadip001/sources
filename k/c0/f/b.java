package k.c0.f;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import k.g;
import k.i;
import k.t;

/* compiled from: ConnectionSpecSelector.java */
/* loaded from: classes2.dex */
public final class b {
    public final List<i> a;
    public int b = 0;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8911d;

    public b(List<i> list) {
        this.a = list;
    }

    public i a(SSLSocket sSLSocket) {
        i iVar;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                iVar = null;
                break;
            }
            iVar = this.a.get(i2);
            if (iVar.a(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (iVar != null) {
            int i3 = this.b;
            while (true) {
                if (i3 >= this.a.size()) {
                    z = false;
                    break;
                } else if (this.a.get(i3).a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.c = z;
            k.c0.a aVar = k.c0.a.a;
            boolean z2 = this.f8911d;
            Objects.requireNonNull((t.a) aVar);
            if (iVar.c != null) {
                enabledCipherSuites = k.c0.c.q(g.b, sSLSocket.getEnabledCipherSuites(), iVar.c);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            if (iVar.f9119d != null) {
                enabledProtocols = k.c0.c.q(k.c0.c.f8881f, sSLSocket.getEnabledProtocols(), iVar.f9119d);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            Comparator<String> comparator = g.b;
            byte[] bArr = k.c0.c.a;
            int length = supportedCipherSuites.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                if (((g.a) comparator).compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i4++;
            }
            if (z2 && i4 != -1) {
                String str = supportedCipherSuites[i4];
                int length2 = enabledCipherSuites.length + 1;
                String[] strArr = new String[length2];
                System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                strArr[length2 - 1] = str;
                enabledCipherSuites = strArr;
            }
            boolean z3 = iVar.a;
            if (z3) {
                if (enabledCipherSuites.length != 0) {
                    String[] strArr2 = (String[]) enabledCipherSuites.clone();
                    if (z3) {
                        if (enabledProtocols.length != 0) {
                            String[] strArr3 = (String[]) enabledProtocols.clone();
                            if (strArr3 != null) {
                                sSLSocket.setEnabledProtocols(strArr3);
                            }
                            if (strArr2 != null) {
                                sSLSocket.setEnabledCipherSuites(strArr2);
                            }
                            return iVar;
                        }
                        throw new IllegalArgumentException("At least one TLS version is required");
                    }
                    throw new IllegalStateException("no TLS versions for cleartext connections");
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        StringBuilder A = f.a.b.a.a.A("Unable to find acceptable protocols. isFallback=");
        A.append(this.f8911d);
        A.append(", modes=");
        A.append(this.a);
        A.append(", supported protocols=");
        A.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(A.toString());
    }
}

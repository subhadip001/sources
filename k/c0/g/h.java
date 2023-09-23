package k.c0.g;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k.c0.f.e;
import k.r;
import k.s;
import k.t;
import k.v;
import k.x;
import k.y;

/* compiled from: RetryAndFollowUpInterceptor.java */
/* loaded from: classes2.dex */
public final class h implements s {
    public final t a;
    public final boolean b;
    public Object c;

    public h(t tVar, boolean z) {
        this.a = tVar;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
        if (r5.equals("HEAD") == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    @Override // k.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k.y a(k.s.a r15) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.g.h.a(k.s$a):k.y");
    }

    public final k.a b(r rVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        k.f fVar;
        if (rVar.a.equals("https")) {
            t tVar = this.a;
            SSLSocketFactory sSLSocketFactory2 = tVar.p;
            HostnameVerifier hostnameVerifier2 = tVar.r;
            fVar = tVar.s;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        String str = rVar.f9134d;
        int i2 = rVar.f9135e;
        t tVar2 = this.a;
        return new k.a(str, i2, tVar2.w, tVar2.o, sSLSocketFactory, hostnameVerifier, fVar, tVar2.t, null, tVar2.f9152g, tVar2.f9153h, tVar2.f9157l);
    }

    public final boolean c(IOException iOException, k.c0.f.f fVar, boolean z, v vVar) {
        e.a aVar;
        fVar.h(iOException);
        if (this.a.z) {
            if (z) {
                x xVar = vVar.f9175d;
            }
            if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z))) {
                return fVar.c != null || (((aVar = fVar.b) != null && aVar.a()) || fVar.f8931h.b());
            }
            return false;
        }
        return false;
    }

    public final int d(y yVar, int i2) {
        String a = yVar.f9185k.a("Retry-After");
        if (a == null) {
            a = null;
        }
        return a == null ? i2 : a.matches("\\d+") ? Integer.valueOf(a).intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final boolean e(y yVar, r rVar) {
        r rVar2 = yVar.f9180f.a;
        return rVar2.f9134d.equals(rVar.f9134d) && rVar2.f9135e == rVar.f9135e && rVar2.a.equals(rVar.a);
    }
}

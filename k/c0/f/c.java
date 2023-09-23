package k.c0.f;

import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k.b0;
import k.c0.h.a;
import k.c0.i.e;
import k.c0.i.n;
import k.h;
import k.i;
import k.p;
import k.q;
import k.s;
import k.t;
import k.v;
import k.y;
import l.g;
import l.o;
import l.r;
import l.t;
import l.z;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: RealConnection.java */
/* loaded from: classes2.dex */
public final class c extends e.d {
    public final h b;
    public final b0 c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f8912d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f8913e;

    /* renamed from: f  reason: collision with root package name */
    public p f8914f;

    /* renamed from: g  reason: collision with root package name */
    public Protocol f8915g;

    /* renamed from: h  reason: collision with root package name */
    public k.c0.i.e f8916h;

    /* renamed from: i  reason: collision with root package name */
    public l.h f8917i;

    /* renamed from: j  reason: collision with root package name */
    public g f8918j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8919k;

    /* renamed from: l  reason: collision with root package name */
    public int f8920l;

    /* renamed from: m  reason: collision with root package name */
    public int f8921m = 1;
    public final List<Reference<f>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(h hVar, b0 b0Var) {
        this.b = hVar;
        this.c = b0Var;
    }

    @Override // k.c0.i.e.d
    public void a(k.c0.i.e eVar) {
        synchronized (this.b) {
            this.f8921m = eVar.l();
        }
    }

    @Override // k.c0.i.e.d
    public void b(n nVar) {
        nVar.c(ErrorCode.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b A[EDGE_INSN: B:99:0x012b->B:83:0x012b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r16, int r17, int r18, int r19, boolean r20, k.e r21, k.n r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.f.c.c(int, int, int, int, boolean, k.e, k.n):void");
    }

    public final void d(int i2, int i3, k.e eVar, k.n nVar) {
        Socket createSocket;
        b0 b0Var = this.c;
        Proxy proxy = b0Var.b;
        k.a aVar = b0Var.a;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = aVar.c.createSocket();
        }
        this.f8912d = createSocket;
        InetSocketAddress inetSocketAddress = this.c.c;
        Objects.requireNonNull(nVar);
        this.f8912d.setSoTimeout(i3);
        try {
            k.c0.k.f.a.f(this.f8912d, this.c.c, i2);
            try {
                this.f8917i = new t(o.h(this.f8912d));
                this.f8918j = new r(o.e(this.f8912d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder A = f.a.b.a.a.A("Failed to connect to ");
            A.append(this.c.c);
            ConnectException connectException = new ConnectException(A.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void e(int i2, int i3, int i4, k.e eVar, k.n nVar) {
        v.a aVar = new v.a();
        aVar.e(this.c.a.a);
        aVar.b("Host", k.c0.c.m(this.c.a.a, true));
        q.a aVar2 = aVar.c;
        aVar2.c("Proxy-Connection", "Keep-Alive");
        aVar2.e("Proxy-Connection");
        aVar2.a.add("Proxy-Connection");
        aVar2.a.add("Keep-Alive");
        q.a aVar3 = aVar.c;
        aVar3.c(DefaultSettingsSpiCall.HEADER_USER_AGENT, "okhttp/3.10.0");
        aVar3.e(DefaultSettingsSpiCall.HEADER_USER_AGENT);
        aVar3.a.add(DefaultSettingsSpiCall.HEADER_USER_AGENT);
        aVar3.a.add("okhttp/3.10.0");
        v a = aVar.a();
        k.r rVar = a.a;
        d(i2, i3, eVar, nVar);
        String str = "CONNECT " + k.c0.c.m(rVar, true) + " HTTP/1.1";
        l.h hVar = this.f8917i;
        k.c0.h.a aVar4 = new k.c0.h.a(null, null, hVar, this.f8918j);
        z d2 = hVar.d();
        long j2 = i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d2.g(j2, timeUnit);
        this.f8918j.d().g(i4, timeUnit);
        aVar4.k(a.c, str);
        aVar4.f8949d.flush();
        y.a d3 = aVar4.d(false);
        d3.a = a;
        y a2 = d3.a();
        long a3 = k.c0.g.e.a(a2);
        if (a3 == -1) {
            a3 = 0;
        }
        l.y h2 = aVar4.h(a3);
        k.c0.c.t(h2, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
        ((a.f) h2).close();
        int i5 = a2.f9182h;
        if (i5 == 200) {
            if (!this.f8917i.b().s() || !this.f8918j.b().s()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else if (i5 == 407) {
            Objects.requireNonNull(this.c.a.f8846d);
            throw new IOException("Failed to authenticate with proxy");
        } else {
            StringBuilder A = f.a.b.a.a.A("Unexpected response code for CONNECT: ");
            A.append(a2.f9182h);
            throw new IOException(A.toString());
        }
    }

    public final void f(b bVar, int i2, k.e eVar, k.n nVar) {
        SSLSocket sSLSocket;
        Protocol protocol;
        int a;
        if (this.c.a.f8851i == null) {
            this.f8915g = Protocol.HTTP_1_1;
            this.f8913e = this.f8912d;
            return;
        }
        Objects.requireNonNull(nVar);
        k.a aVar = this.c.a;
        SSLSocketFactory sSLSocketFactory = aVar.f8851i;
        try {
            try {
                Socket socket = this.f8912d;
                k.r rVar = aVar.a;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, rVar.f9134d, rVar.f9135e, true);
                try {
                    i a2 = bVar.a(sSLSocket);
                    if (a2.b) {
                        k.c0.k.f.a.e(sSLSocket, aVar.a.f9134d, aVar.f8847e);
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    if (("NONE".equals(session.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) ? false : true) {
                        p a3 = p.a(session);
                        if (aVar.f8852j.verify(aVar.a.f9134d, session)) {
                            aVar.f8853k.a(aVar.a.f9134d, a3.c);
                            String h2 = a2.b ? k.c0.k.f.a.h(sSLSocket) : null;
                            this.f8913e = sSLSocket;
                            this.f8917i = new t(o.h(sSLSocket));
                            this.f8918j = new r(o.e(this.f8913e));
                            this.f8914f = a3;
                            if (h2 != null) {
                                protocol = Protocol.get(h2);
                            } else {
                                protocol = Protocol.HTTP_1_1;
                            }
                            this.f8915g = protocol;
                            k.c0.k.f.a.a(sSLSocket);
                            if (this.f8915g == Protocol.HTTP_2) {
                                this.f8913e.setSoTimeout(0);
                                e.c cVar = new e.c(true);
                                Socket socket2 = this.f8913e;
                                String str = this.c.a.a.f9134d;
                                l.h hVar = this.f8917i;
                                g gVar = this.f8918j;
                                cVar.a = socket2;
                                cVar.b = str;
                                cVar.c = hVar;
                                cVar.f9013d = gVar;
                                cVar.f9014e = this;
                                cVar.f9015f = i2;
                                k.c0.i.e eVar2 = new k.c0.i.e(cVar);
                                this.f8916h = eVar2;
                                k.c0.i.o oVar = eVar2.w;
                                synchronized (oVar) {
                                    if (!oVar.f9078j) {
                                        if (oVar.f9075g) {
                                            Logger logger = k.c0.i.o.f9073l;
                                            if (logger.isLoggable(Level.FINE)) {
                                                logger.fine(k.c0.c.l(">> CONNECTION %s", k.c0.i.c.a.l()));
                                            }
                                            oVar.f9074f.V(k.c0.i.c.a.s());
                                            oVar.f9074f.flush();
                                        }
                                    } else {
                                        throw new IOException("closed");
                                    }
                                }
                                k.c0.i.o oVar2 = eVar2.w;
                                k.c0.i.r rVar2 = eVar2.s;
                                synchronized (oVar2) {
                                    if (!oVar2.f9078j) {
                                        oVar2.f(0, Integer.bitCount(rVar2.a) * 6, (byte) 4, (byte) 0);
                                        int i3 = 0;
                                        while (i3 < 10) {
                                            if (((1 << i3) & rVar2.a) != 0) {
                                                oVar2.f9074f.k(i3 == 4 ? 3 : i3 == 7 ? 4 : i3);
                                                oVar2.f9074f.m(rVar2.b[i3]);
                                            }
                                            i3++;
                                        }
                                        oVar2.f9074f.flush();
                                    } else {
                                        throw new IOException("closed");
                                    }
                                }
                                if (eVar2.s.a() != 65535) {
                                    eVar2.w.B(0, a - 65535);
                                }
                                new Thread(eVar2.x).start();
                                return;
                            }
                            return;
                        }
                        X509Certificate x509Certificate = (X509Certificate) a3.c.get(0);
                        throw new SSLPeerUnverifiedException("Hostname " + aVar.a.f9134d + " not verified:\n    certificate: " + k.f.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + k.c0.l.d.a(x509Certificate));
                    }
                    throw new IOException("a valid ssl session was not established");
                } catch (AssertionError e2) {
                    e = e2;
                    if (!k.c0.c.r(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        k.c0.k.f.a.a(sSLSocket);
                    }
                    k.c0.c.e(sSLSocket);
                    throw th;
                }
            } catch (AssertionError e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    public boolean g(k.a aVar, b0 b0Var) {
        if (this.n.size() < this.f8921m && !this.f8919k) {
            k.c0.a aVar2 = k.c0.a.a;
            k.a aVar3 = this.c.a;
            Objects.requireNonNull((t.a) aVar2);
            if (!aVar3.a(aVar)) {
                return false;
            }
            if (aVar.a.f9134d.equals(this.c.a.a.f9134d)) {
                return true;
            }
            if (this.f8916h == null || b0Var == null || b0Var.b.type() != Proxy.Type.DIRECT || this.c.b.type() != Proxy.Type.DIRECT || !this.c.c.equals(b0Var.c) || b0Var.a.f8852j != k.c0.l.d.a || !j(aVar.a)) {
                return false;
            }
            try {
                aVar.f8853k.a(aVar.a.f9134d, this.f8914f.c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public boolean h() {
        return this.f8916h != null;
    }

    public k.c0.g.c i(k.t tVar, s.a aVar, f fVar) {
        if (this.f8916h != null) {
            return new k.c0.i.d(tVar, aVar, fVar, this.f8916h);
        }
        k.c0.g.f fVar2 = (k.c0.g.f) aVar;
        this.f8913e.setSoTimeout(fVar2.f8944j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f8917i.d().g(fVar2.f8944j, timeUnit);
        this.f8918j.d().g(fVar2.f8945k, timeUnit);
        return new k.c0.h.a(tVar, fVar, this.f8917i, this.f8918j);
    }

    public boolean j(k.r rVar) {
        int i2 = rVar.f9135e;
        k.r rVar2 = this.c.a.a;
        if (i2 != rVar2.f9135e) {
            return false;
        }
        if (rVar.f9134d.equals(rVar2.f9134d)) {
            return true;
        }
        p pVar = this.f8914f;
        return pVar != null && k.c0.l.d.a.c(rVar.f9134d, (X509Certificate) pVar.c.get(0));
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Connection{");
        A.append(this.c.a.a.f9134d);
        A.append(":");
        A.append(this.c.a.a.f9135e);
        A.append(", proxy=");
        A.append(this.c.b);
        A.append(" hostAddress=");
        A.append(this.c.c);
        A.append(" cipherSuite=");
        p pVar = this.f8914f;
        A.append(pVar != null ? pVar.b : "none");
        A.append(" protocol=");
        A.append(this.f8915g);
        A.append('}');
        return A.toString();
    }
}

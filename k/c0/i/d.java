package k.c0.i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k.a0;
import k.c0.i.n;
import k.q;
import k.s;
import k.t;
import k.v;
import k.y;
import l.x;
import l.y;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: Http2Codec.java */
/* loaded from: classes2.dex */
public final class d implements k.c0.g.c {

    /* renamed from: e  reason: collision with root package name */
    public static final l.i f8986e;

    /* renamed from: f  reason: collision with root package name */
    public static final l.i f8987f;

    /* renamed from: g  reason: collision with root package name */
    public static final l.i f8988g;

    /* renamed from: h  reason: collision with root package name */
    public static final l.i f8989h;

    /* renamed from: i  reason: collision with root package name */
    public static final l.i f8990i;

    /* renamed from: j  reason: collision with root package name */
    public static final l.i f8991j;

    /* renamed from: k  reason: collision with root package name */
    public static final l.i f8992k;

    /* renamed from: l  reason: collision with root package name */
    public static final l.i f8993l;

    /* renamed from: m  reason: collision with root package name */
    public static final List<l.i> f8994m;
    public static final List<l.i> n;
    public final s.a a;
    public final k.c0.f.f b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public n f8995d;

    /* compiled from: Http2Codec.java */
    /* loaded from: classes2.dex */
    public class a extends l.k {

        /* renamed from: g  reason: collision with root package name */
        public boolean f8996g;

        /* renamed from: h  reason: collision with root package name */
        public long f8997h;

        public a(y yVar) {
            super(yVar);
            this.f8996g = false;
            this.f8997h = 0L;
        }

        public final void a(IOException iOException) {
            if (this.f8996g) {
                return;
            }
            this.f8996g = true;
            d dVar = d.this;
            dVar.b.i(false, dVar, this.f8997h, iOException);
        }

        @Override // l.k, l.y
        public long a0(l.f fVar, long j2) {
            try {
                long a0 = this.f9237f.a0(fVar, j2);
                if (a0 > 0) {
                    this.f8997h += a0;
                }
                return a0;
            } catch (IOException e2) {
                a(e2);
                throw e2;
            }
        }

        @Override // l.k, l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            a(null);
        }
    }

    static {
        l.i j2 = l.i.j("connection");
        f8986e = j2;
        l.i j3 = l.i.j("host");
        f8987f = j3;
        l.i j4 = l.i.j("keep-alive");
        f8988g = j4;
        l.i j5 = l.i.j("proxy-connection");
        f8989h = j5;
        l.i j6 = l.i.j("transfer-encoding");
        f8990i = j6;
        l.i j7 = l.i.j("te");
        f8991j = j7;
        l.i j8 = l.i.j("encoding");
        f8992k = j8;
        l.i j9 = l.i.j("upgrade");
        f8993l = j9;
        f8994m = k.c0.c.o(j2, j3, j4, j5, j7, j6, j8, j9, k.c0.i.a.f8971f, k.c0.i.a.f8972g, k.c0.i.a.f8973h, k.c0.i.a.f8974i);
        n = k.c0.c.o(j2, j3, j4, j5, j7, j6, j8, j9);
    }

    public d(t tVar, s.a aVar, k.c0.f.f fVar, e eVar) {
        this.a = aVar;
        this.b = fVar;
        this.c = eVar;
    }

    @Override // k.c0.g.c
    public void a() {
        ((n.a) this.f8995d.e()).close();
    }

    @Override // k.c0.g.c
    public void b(v vVar) {
        int i2;
        n nVar;
        if (this.f8995d != null) {
            return;
        }
        boolean z = false;
        boolean z2 = vVar.f9175d != null;
        k.q qVar = vVar.c;
        ArrayList arrayList = new ArrayList(qVar.d() + 4);
        arrayList.add(new k.c0.i.a(k.c0.i.a.f8971f, vVar.b));
        arrayList.add(new k.c0.i.a(k.c0.i.a.f8972g, f.n.a.n.i.S(vVar.a)));
        String a2 = vVar.c.a("Host");
        if (a2 != null) {
            arrayList.add(new k.c0.i.a(k.c0.i.a.f8974i, a2));
        }
        arrayList.add(new k.c0.i.a(k.c0.i.a.f8973h, vVar.a.a));
        int d2 = qVar.d();
        for (int i3 = 0; i3 < d2; i3++) {
            l.i j2 = l.i.j(qVar.b(i3).toLowerCase(Locale.US));
            if (!f8994m.contains(j2)) {
                arrayList.add(new k.c0.i.a(j2, qVar.e(i3)));
            }
        }
        e eVar = this.c;
        boolean z3 = !z2;
        synchronized (eVar.w) {
            synchronized (eVar) {
                if (eVar.f9004k > 1073741823) {
                    eVar.v(ErrorCode.REFUSED_STREAM);
                }
                if (!eVar.f9005l) {
                    i2 = eVar.f9004k;
                    eVar.f9004k = i2 + 2;
                    nVar = new n(i2, eVar, z3, false, arrayList);
                    z = (!z2 || eVar.r == 0 || nVar.b == 0) ? true : true;
                    if (nVar.g()) {
                        eVar.f9001h.put(Integer.valueOf(i2), nVar);
                    }
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            o oVar = eVar.w;
            synchronized (oVar) {
                if (!oVar.f9078j) {
                    oVar.l(z3, i2, arrayList);
                } else {
                    throw new IOException("closed");
                }
            }
        }
        if (z) {
            eVar.w.flush();
        }
        this.f8995d = nVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nVar.f9059j.g(((k.c0.g.f) this.a).f8944j, timeUnit);
        this.f8995d.f9060k.g(((k.c0.g.f) this.a).f8945k, timeUnit);
    }

    @Override // k.c0.g.c
    public a0 c(k.y yVar) {
        Objects.requireNonNull(this.b.f8929f);
        String a2 = yVar.f9185k.a("Content-Type");
        if (a2 == null) {
            a2 = null;
        }
        long a3 = k.c0.g.e.a(yVar);
        a aVar = new a(this.f8995d.f9057h);
        Logger logger = l.o.a;
        return new k.c0.g.g(a2, a3, new l.t(aVar));
    }

    @Override // k.c0.g.c
    public y.a d(boolean z) {
        List<k.c0.i.a> list;
        n nVar = this.f8995d;
        synchronized (nVar) {
            if (nVar.f()) {
                nVar.f9059j.i();
                while (nVar.f9055f == null && nVar.f9061l == null) {
                    nVar.i();
                }
                nVar.f9059j.n();
                list = nVar.f9055f;
                if (list != null) {
                    nVar.f9055f = null;
                } else {
                    throw new StreamResetException(nVar.f9061l);
                }
            } else {
                throw new IllegalStateException("servers cannot read response headers");
            }
        }
        q.a aVar = new q.a();
        int size = list.size();
        k.c0.g.i iVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            k.c0.i.a aVar2 = list.get(i2);
            if (aVar2 == null) {
                if (iVar != null && iVar.b == 100) {
                    aVar = new q.a();
                    iVar = null;
                }
            } else {
                l.i iVar2 = aVar2.a;
                String t = aVar2.b.t();
                if (iVar2.equals(k.c0.i.a.f8970e)) {
                    iVar = k.c0.g.i.a("HTTP/1.1 " + t);
                } else if (!n.contains(iVar2)) {
                    k.c0.a.a.a(aVar, iVar2.t(), t);
                }
            }
        }
        if (iVar != null) {
            y.a aVar3 = new y.a();
            aVar3.b = Protocol.HTTP_2;
            aVar3.c = iVar.b;
            aVar3.f9188d = iVar.c;
            List<String> list2 = aVar.a;
            q.a aVar4 = new q.a();
            Collections.addAll(aVar4.a, (String[]) list2.toArray(new String[list2.size()]));
            aVar3.f9190f = aVar4;
            if (z) {
                Objects.requireNonNull((t.a) k.c0.a.a);
                if (aVar3.c == 100) {
                    return null;
                }
            }
            return aVar3;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // k.c0.g.c
    public void e() {
        this.c.w.flush();
    }

    @Override // k.c0.g.c
    public x f(v vVar, long j2) {
        return this.f8995d.e();
    }
}

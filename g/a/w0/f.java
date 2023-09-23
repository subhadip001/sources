package g.a.w0;

import com.google.common.io.BaseEncoding;
import g.a.a0;
import g.a.i0;
import g.a.s0;
import g.a.v0.a;
import g.a.v0.e;
import g.a.v0.e2;
import g.a.v0.r2;
import g.a.v0.v0;
import g.a.v0.v2;
import g.a.v0.x2;
import g.a.z;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: OkHttpClientStream.java */
/* loaded from: classes2.dex */
public class f extends g.a.v0.a {
    public static final l.f q = new l.f();

    /* renamed from: g  reason: collision with root package name */
    public final MethodDescriptor<?, ?> f8019g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8020h;

    /* renamed from: i  reason: collision with root package name */
    public final r2 f8021i;

    /* renamed from: j  reason: collision with root package name */
    public String f8022j;

    /* renamed from: k  reason: collision with root package name */
    public Object f8023k;

    /* renamed from: l  reason: collision with root package name */
    public volatile int f8024l;

    /* renamed from: m  reason: collision with root package name */
    public final b f8025m;
    public final a n;
    public final g.a.a o;
    public boolean p;

    /* compiled from: OkHttpClientStream.java */
    /* loaded from: classes2.dex */
    public class a implements a.b {
        public a() {
        }

        public void a(i0 i0Var, byte[] bArr) {
            g.b.a aVar = g.b.c.a;
            Objects.requireNonNull(aVar);
            String str = "/" + f.this.f8019g.b;
            if (bArr != null) {
                f.this.p = true;
                StringBuilder D = f.a.b.a.a.D(str, "?");
                D.append(BaseEncoding.a.c(bArr));
                str = D.toString();
            }
            try {
                synchronized (f.this.f8025m.y) {
                    b.l(f.this.f8025m, i0Var, str);
                }
                Objects.requireNonNull(aVar);
            } catch (Throwable th) {
                Objects.requireNonNull(g.b.c.a);
                throw th;
            }
        }
    }

    /* compiled from: OkHttpClientStream.java */
    /* loaded from: classes2.dex */
    public class b extends v0 {
        public l.f A;
        public boolean B;
        public boolean C;
        public boolean D;
        public int E;
        public int F;
        public final g.a.w0.b G;
        public final n H;
        public final g I;
        public boolean J;
        public final g.b.d K;
        public final int x;
        public final Object y;
        public List<g.a.w0.p.i.c> z;

        public b(int i2, r2 r2Var, Object obj, g.a.w0.b bVar, n nVar, g gVar, int i3, String str) {
            super(i2, r2Var, f.this.a);
            this.A = new l.f();
            this.B = false;
            this.C = false;
            this.D = false;
            this.J = true;
            f.h.b.c.a.x(obj, "lock");
            this.y = obj;
            this.G = bVar;
            this.H = nVar;
            this.I = gVar;
            this.E = i3;
            this.F = i3;
            this.x = i3;
            Objects.requireNonNull(g.b.c.a);
            this.K = g.b.a.a;
        }

        public static void l(b bVar, i0 i0Var, String str) {
            boolean z;
            f fVar = f.this;
            String str2 = fVar.f8022j;
            String str3 = fVar.f8020h;
            boolean z2 = fVar.p;
            boolean z3 = bVar.I.z == null;
            g.a.w0.p.i.c cVar = c.a;
            f.h.b.c.a.x(i0Var, "headers");
            f.h.b.c.a.x(str, "defaultPath");
            f.h.b.c.a.x(str2, "authority");
            i0Var.b(GrpcUtil.f8702g);
            i0Var.b(GrpcUtil.f8703h);
            i0.f<String> fVar2 = GrpcUtil.f8704i;
            i0Var.b(fVar2);
            ArrayList arrayList = new ArrayList(i0Var.b + 7);
            if (z3) {
                arrayList.add(c.b);
            } else {
                arrayList.add(c.a);
            }
            if (z2) {
                arrayList.add(c.f8004d);
            } else {
                arrayList.add(c.c);
            }
            arrayList.add(new g.a.w0.p.i.c(g.a.w0.p.i.c.f8085h, str2));
            arrayList.add(new g.a.w0.p.i.c(g.a.w0.p.i.c.f8083f, str));
            arrayList.add(new g.a.w0.p.i.c(fVar2.b, str3));
            arrayList.add(c.f8005e);
            arrayList.add(c.f8006f);
            Logger logger = v2.a;
            Charset charset = z.a;
            int i2 = i0Var.b * 2;
            byte[][] bArr = new byte[i2];
            Object[] objArr = i0Var.a;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, i2);
            } else {
                for (int i3 = 0; i3 < i0Var.b; i3++) {
                    int i4 = i3 * 2;
                    bArr[i4] = i0Var.g(i3);
                    bArr[i4 + 1] = i0Var.k(i3);
                }
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6 += 2) {
                byte[] bArr2 = bArr[i6];
                byte[] bArr3 = bArr[i6 + 1];
                if (v2.a(bArr2, v2.b)) {
                    bArr[i5] = bArr2;
                    bArr[i5 + 1] = z.b.c(bArr3).getBytes(f.h.c.a.c.a);
                } else {
                    for (byte b : bArr3) {
                        if (b < 32 || b > 126) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        bArr[i5] = bArr2;
                        bArr[i5 + 1] = bArr3;
                    } else {
                        String str4 = new String(bArr2, f.h.c.a.c.a);
                        Logger logger2 = v2.a;
                        StringBuilder E = f.a.b.a.a.E("Metadata key=", str4, ", value=");
                        E.append(Arrays.toString(bArr3));
                        E.append(" contains invalid ASCII characters");
                        logger2.warning(E.toString());
                    }
                }
                i5 += 2;
            }
            if (i5 != i2) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i5);
            }
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                l.i m2 = l.i.m(bArr[i7]);
                String t = m2.t();
                if ((t.startsWith(":") || GrpcUtil.f8702g.b.equalsIgnoreCase(t) || GrpcUtil.f8704i.b.equalsIgnoreCase(t)) ? false : true) {
                    arrayList.add(new g.a.w0.p.i.c(m2, l.i.m(bArr[i7 + 1])));
                }
            }
            bVar.z = arrayList;
            g gVar = bVar.I;
            f fVar3 = f.this;
            Status status = gVar.t;
            if (status != null) {
                fVar3.f8025m.i(status, ClientStreamListener.RpcProgress.REFUSED, true, new i0());
            } else if (gVar.f8035m.size() >= gVar.B) {
                gVar.C.add(fVar3);
                gVar.u(fVar3);
            } else {
                gVar.x(fVar3);
            }
        }

        public static void m(b bVar, l.f fVar, boolean z, boolean z2) {
            if (bVar.D) {
                return;
            }
            if (bVar.J) {
                bVar.A.J(fVar, (int) fVar.f9230g);
                bVar.B |= z;
                bVar.C |= z2;
                return;
            }
            f.h.b.c.a.C(f.this.f8024l != -1, "streamId should be set");
            bVar.H.a(z, f.this.f8024l, fVar, z2);
        }

        @Override // g.a.v0.a.c, g.a.v0.v1.b
        public void b(boolean z) {
            if (!this.o) {
                this.I.k(f.this.f8024l, null, ClientStreamListener.RpcProgress.PROCESSED, false, ErrorCode.CANCEL, null);
            } else {
                this.I.k(f.this.f8024l, null, ClientStreamListener.RpcProgress.PROCESSED, false, null, null);
            }
            f.h.b.c.a.C(this.p, "status should have been reported on deframer closed");
            this.f7586m = true;
            if (this.q && z) {
                i(Status.f8692m.h("Encountered end-of-stream mid-frame"), ClientStreamListener.RpcProgress.PROCESSED, true, new i0());
            }
            Runnable runnable = this.n;
            if (runnable != null) {
                runnable.run();
                this.n = null;
            }
        }

        @Override // g.a.v0.v1.b
        public void c(int i2) {
            int i3 = this.F - i2;
            this.F = i3;
            int i4 = this.x;
            if (i3 <= i4 * 0.5f) {
                int i5 = i4 - i3;
                this.E += i5;
                this.F = i3 + i5;
                this.G.B(f.this.f8024l, i5);
            }
        }

        @Override // g.a.v0.v1.b
        public void d(Throwable th) {
            n(Status.e(th), true, new i0());
        }

        @Override // g.a.v0.h.d
        public void e(Runnable runnable) {
            synchronized (this.y) {
                runnable.run();
            }
        }

        public final void n(Status status, boolean z, i0 i0Var) {
            if (this.D) {
                return;
            }
            this.D = true;
            if (this.J) {
                g gVar = this.I;
                f fVar = f.this;
                gVar.C.remove(fVar);
                gVar.r(fVar);
                this.z = null;
                this.A.a();
                this.J = false;
                if (i0Var == null) {
                    i0Var = new i0();
                }
                i(status, ClientStreamListener.RpcProgress.PROCESSED, true, i0Var);
                return;
            }
            this.I.k(f.this.f8024l, status, ClientStreamListener.RpcProgress.PROCESSED, z, ErrorCode.CANCEL, i0Var);
        }

        public void o(l.f fVar, boolean z) {
            int i2 = this.E - ((int) fVar.f9230g);
            this.E = i2;
            if (i2 < 0) {
                this.G.p0(f.this.f8024l, ErrorCode.FLOW_CONTROL_ERROR);
                this.I.k(f.this.f8024l, Status.f8692m.h("Received data size exceeded our receiving window size"), ClientStreamListener.RpcProgress.PROCESSED, false, null, null);
                return;
            }
            j jVar = new j(fVar);
            Status status = this.r;
            boolean z2 = false;
            if (status != null) {
                StringBuilder A = f.a.b.a.a.A("DATA-----------------------------\n");
                Charset charset = this.t;
                int i3 = e2.a;
                f.h.b.c.a.x(charset, "charset");
                f.h.b.c.a.x(jVar, "buffer");
                int c = jVar.c();
                byte[] bArr = new byte[c];
                jVar.G(bArr, 0, c);
                A.append(new String(bArr, charset));
                this.r = status.b(A.toString());
                jVar.f8067f.a();
                if (this.r.b.length() > 1000 || z) {
                    n(this.r, false, this.s);
                }
            } else if (!this.u) {
                n(Status.f8692m.h("headers not received before payload"), false, new i0());
            } else {
                f.h.b.c.a.x(jVar, "frame");
                try {
                    if (this.p) {
                        g.a.v0.a.f7576f.log(Level.INFO, "Received data on closed stream");
                        jVar.f8067f.a();
                    } else {
                        try {
                            this.a.q(jVar);
                        } catch (Throwable th) {
                            try {
                                d(th);
                            } catch (Throwable th2) {
                                th = th2;
                                if (z2) {
                                    jVar.f8067f.a();
                                }
                                throw th;
                            }
                        }
                    }
                    if (z) {
                        this.r = Status.f8692m.h("Received unexpected EOS on DATA frame from server.");
                        i0 i0Var = new i0();
                        this.s = i0Var;
                        i(this.r, ClientStreamListener.RpcProgress.PROCESSED, false, i0Var);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z2 = true;
                }
            }
        }

        /* JADX WARN: Finally extract failed */
        public void p(List<g.a.w0.p.i.c> list, boolean z) {
            Status status;
            StringBuilder sb;
            Status b;
            Status h2;
            Status b2;
            if (z) {
                byte[][] a = o.a(list);
                Charset charset = z.a;
                i0 i0Var = new i0(a);
                f.h.b.c.a.x(i0Var, "trailers");
                if (this.r == null && !this.u) {
                    Status k2 = k(i0Var);
                    this.r = k2;
                    if (k2 != null) {
                        this.s = i0Var;
                    }
                }
                Status status2 = this.r;
                if (status2 != null) {
                    Status b3 = status2.b("trailers: " + i0Var);
                    this.r = b3;
                    n(b3, false, this.s);
                    return;
                }
                i0.f<Status> fVar = a0.b;
                Status status3 = (Status) i0Var.d(fVar);
                if (status3 != null) {
                    b2 = status3.h((String) i0Var.d(a0.a));
                } else if (this.u) {
                    b2 = Status.f8687h.h("missing GRPC status in response");
                } else {
                    Integer num = (Integer) i0Var.d(v0.w);
                    if (num != null) {
                        h2 = GrpcUtil.f(num.intValue());
                    } else {
                        h2 = Status.f8692m.h("missing HTTP status code");
                    }
                    b2 = h2.b("missing GRPC status, inferred error from HTTP status code");
                }
                i0Var.b(v0.w);
                i0Var.b(fVar);
                i0Var.b(a0.a);
                f.h.b.c.a.x(b2, "status");
                f.h.b.c.a.x(i0Var, "trailers");
                if (this.p) {
                    g.a.v0.a.f7576f.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{b2, i0Var});
                    return;
                }
                for (s0 s0Var : this.f7581h.a) {
                    Objects.requireNonNull((g.a.h) s0Var);
                }
                i(b2, ClientStreamListener.RpcProgress.PROCESSED, false, i0Var);
                return;
            }
            byte[][] a2 = o.a(list);
            Charset charset2 = z.a;
            i0 i0Var2 = new i0(a2);
            f.h.b.c.a.x(i0Var2, "headers");
            Status status4 = this.r;
            if (status4 != null) {
                this.r = status4.b("headers: " + i0Var2);
                return;
            }
            try {
                if (this.u) {
                    status = Status.f8692m.h("Received headers twice");
                    this.r = status;
                    sb = new StringBuilder();
                } else {
                    i0.f<Integer> fVar2 = v0.w;
                    Integer num2 = (Integer) i0Var2.d(fVar2);
                    if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                        status = this.r;
                        if (status == null) {
                            return;
                        }
                        sb = new StringBuilder();
                    } else {
                        this.u = true;
                        Status k3 = k(i0Var2);
                        this.r = k3;
                        if (k3 != null) {
                            b = k3.b("headers: " + i0Var2);
                            this.r = b;
                            this.s = i0Var2;
                            this.t = v0.j(i0Var2);
                        }
                        i0Var2.b(fVar2);
                        i0Var2.b(a0.b);
                        i0Var2.b(a0.a);
                        h(i0Var2);
                        status = this.r;
                        if (status == null) {
                            return;
                        }
                        sb = new StringBuilder();
                    }
                }
                sb.append("headers: ");
                sb.append(i0Var2);
                b = status.b(sb.toString());
                this.r = b;
                this.s = i0Var2;
                this.t = v0.j(i0Var2);
            } catch (Throwable th) {
                Status status5 = this.r;
                if (status5 != null) {
                    this.r = status5.b("headers: " + i0Var2);
                    this.s = i0Var2;
                    this.t = v0.j(i0Var2);
                }
                throw th;
            }
        }
    }

    public f(MethodDescriptor<?, ?> methodDescriptor, i0 i0Var, g.a.w0.b bVar, g gVar, n nVar, Object obj, int i2, int i3, String str, String str2, r2 r2Var, x2 x2Var, g.a.b bVar2, boolean z) {
        super(new m(), r2Var, x2Var, i0Var, bVar2, z && methodDescriptor.f8681h);
        this.f8024l = -1;
        this.n = new a();
        this.p = false;
        f.h.b.c.a.x(r2Var, "statsTraceCtx");
        this.f8021i = r2Var;
        this.f8019g = methodDescriptor;
        this.f8022j = str;
        this.f8020h = str2;
        this.o = gVar.s;
        this.f8025m = new b(i2, r2Var, obj, bVar, nVar, gVar, i3, methodDescriptor.b);
    }

    @Override // g.a.v0.a, g.a.v0.e
    public e.a e() {
        return this.f8025m;
    }

    @Override // g.a.v0.v
    public void k(String str) {
        f.h.b.c.a.x(str, "authority");
        this.f8022j = str;
    }

    @Override // g.a.v0.a
    public a.b q() {
        return this.n;
    }

    @Override // g.a.v0.a
    public a.c r() {
        return this.f8025m;
    }
}

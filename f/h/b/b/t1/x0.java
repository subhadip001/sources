package f.h.b.b.t1;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import f.h.b.b.b2.z;
import f.h.b.b.q1;
import java.util.Arrays;

/* compiled from: AnalyticsListener.java */
/* loaded from: classes.dex */
public interface x0 {

    /* compiled from: AnalyticsListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final q1 b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final z.a f4500d;

        /* renamed from: e  reason: collision with root package name */
        public final long f4501e;

        /* renamed from: f  reason: collision with root package name */
        public final q1 f4502f;

        /* renamed from: g  reason: collision with root package name */
        public final int f4503g;

        /* renamed from: h  reason: collision with root package name */
        public final z.a f4504h;

        /* renamed from: i  reason: collision with root package name */
        public final long f4505i;

        /* renamed from: j  reason: collision with root package name */
        public final long f4506j;

        public a(long j2, q1 q1Var, int i2, z.a aVar, long j3, q1 q1Var2, int i3, z.a aVar2, long j4, long j5) {
            this.a = j2;
            this.b = q1Var;
            this.c = i2;
            this.f4500d = aVar;
            this.f4501e = j3;
            this.f4502f = q1Var2;
            this.f4503g = i3;
            this.f4504h = aVar2;
            this.f4505i = j4;
            this.f4506j = j5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.f4501e == aVar.f4501e && this.f4503g == aVar.f4503g && this.f4505i == aVar.f4505i && this.f4506j == aVar.f4506j && f.h.b.c.a.i0(this.b, aVar.b) && f.h.b.c.a.i0(this.f4500d, aVar.f4500d) && f.h.b.c.a.i0(this.f4502f, aVar.f4502f) && f.h.b.c.a.i0(this.f4504h, aVar.f4504h);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.f4500d, Long.valueOf(this.f4501e), this.f4502f, Integer.valueOf(this.f4503g), this.f4504h, Long.valueOf(this.f4505i), Long.valueOf(this.f4506j)});
        }
    }

    /* compiled from: AnalyticsListener.java */
    /* loaded from: classes.dex */
    public static final class b extends f.h.b.b.g2.q {
        public final SparseArray<a> b = new SparseArray<>(0);
    }

    @Deprecated
    void A();

    void B();

    void C();

    void D();

    void E();

    void F();

    void G();

    void H();

    void I();

    @Deprecated
    void J();

    void K();

    void L();

    void M();

    void N();

    void O();

    void P(a aVar, boolean z);

    void Q(a aVar, Format format);

    void R();

    void S();

    void T();

    void U(a aVar, Format format);

    void V();

    void W();

    void X();

    @Deprecated
    void a();

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    @Deprecated
    void j();

    void k();

    void l();

    void m();

    void n();

    void o();

    void p();

    void q();

    void r();

    void s();

    void t();

    @Deprecated
    void u();

    void v();

    void w();

    void x();

    void y();

    @Deprecated
    void z();
}

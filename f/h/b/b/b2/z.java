package f.h.b.b.b2;

import android.os.Handler;
import f.h.b.b.q1;
import f.h.b.b.u0;

/* compiled from: MediaSource.java */
/* loaded from: classes.dex */
public interface z {

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends x {
        public a(Object obj) {
            super(obj);
        }

        public a b(Object obj) {
            return new a(this.a.equals(obj) ? this : new x(obj, this.b, this.c, this.f3914d, this.f3915e));
        }

        public a(Object obj, long j2, int i2) {
            super(obj, j2, i2);
        }

        public a(Object obj, int i2, int i3, long j2) {
            super(obj, i2, i3, j2);
        }

        public a(x xVar) {
            super(xVar);
        }
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(z zVar, q1 q1Var);
    }

    void a(b bVar);

    void b(Handler handler, a0 a0Var);

    void c(a0 a0Var);

    void d(b bVar);

    u0 e();

    void f(Handler handler, f.h.b.b.x1.a aVar);

    void g();

    boolean h();

    void i(w wVar);

    q1 j();

    void k(b bVar, f.h.b.b.f2.t tVar);

    void l(b bVar);

    w m(a aVar, f.h.b.b.f2.k kVar, long j2);
}

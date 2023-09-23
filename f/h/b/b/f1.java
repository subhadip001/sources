package f.h.b.b;

import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* compiled from: Player.java */
/* loaded from: classes.dex */
public interface f1 {

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public interface a {
        void A(u0 u0Var, int i2);

        void G(boolean z, int i2);

        void I(TrackGroupArray trackGroupArray, f.h.b.b.d2.k kVar);

        void K(c1 c1Var);

        void O(boolean z);

        @Deprecated
        void a();

        void d(int i2);

        void e(int i2);

        void h(List<Metadata> list);

        void j(ExoPlaybackException exoPlaybackException);

        void m(boolean z);

        void n(q1 q1Var, int i2);

        void p(int i2);

        void t(boolean z);

        void u(f1 f1Var, b bVar);

        void w(boolean z);

        @Deprecated
        void x(boolean z, int i2);

        void z(int i2);
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class b extends f.h.b.b.g2.q {
        public boolean a(int i2) {
            return this.a.get(i2);
        }

        public boolean b(int... iArr) {
            for (int i2 : iArr) {
                if (a(i2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    int A();

    TrackGroupArray B();

    int C();

    q1 D();

    Looper E();

    boolean F();

    long G();

    f.h.b.b.d2.k H();

    int I(int i2);

    long J();

    c K();

    c1 c();

    void d();

    boolean e();

    long f();

    void g(int i2, long j2);

    long getDuration();

    boolean h();

    boolean hasNext();

    boolean hasPrevious();

    void i(boolean z);

    List<Metadata> j();

    int k();

    boolean l();

    void m(a aVar);

    int n();

    void o(a aVar);

    int p();

    ExoPlaybackException q();

    void r(boolean z);

    d s();

    long t();

    int u();

    int v();

    boolean w();

    int x();

    void y(int i2);

    int z();
}

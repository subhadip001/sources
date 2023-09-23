package f.h.b.d.a.b;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class d3 {
    public abstract int a();

    public abstract long b();

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract byte[] f();

    public final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith("/");
    }

    public final boolean h() {
        return a() == 0;
    }
}

package f.h.b.b.v1;

/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f  reason: collision with root package name */
    public int f4610f;

    public final void i(int i2) {
        this.f4610f = i2 | this.f4610f;
    }

    public final boolean j(int i2) {
        return (this.f4610f & i2) == i2;
    }

    public final boolean k() {
        return j(268435456);
    }

    public final boolean l() {
        return j(Integer.MIN_VALUE);
    }

    public final boolean m() {
        return j(4);
    }

    public final boolean n() {
        return j(1);
    }
}

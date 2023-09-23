package f.h.b.b;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: d  reason: collision with root package name */
    public static final c1 f3917d = new c1(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public c1(float f2, float f3) {
        f.h.b.b.e2.j.c(f2 > 0.0f);
        f.h.b.b.e2.j.c(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.a == c1Var.a && this.b == c1Var.b;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public String toString() {
        return f.h.b.b.g2.b0.k("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}

package f.h.b.b.u1;

/* compiled from: AuxEffectInfo.java */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final float b;

    public t(int i2, float f2) {
        this.a = i2;
        this.b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && Float.compare(tVar.b, this.b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b) + ((527 + this.a) * 31);
    }
}

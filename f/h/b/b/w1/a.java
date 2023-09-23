package f.h.b.b.w1;

/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final int b;
    public final int c;

    public a(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }
}

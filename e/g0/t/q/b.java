package e.g0.t.q;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public class b {
    public boolean a;
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2298d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f2298d = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.f2298d == bVar.f2298d;
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.a ? 1 : 0;
        if (this.b) {
            i2 += 16;
        }
        if (this.c) {
            i2 += 256;
        }
        return this.f2298d ? i2 + 4096 : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.f2298d));
    }
}

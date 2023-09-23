package e.i.d;

import android.graphics.Insets;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2450e = new b(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2451d;

    public b(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.f2451d = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.a, bVar2.a), Math.max(bVar.b, bVar2.b), Math.max(bVar.c, bVar2.c), Math.max(bVar.f2451d, bVar2.f2451d));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return f2450e;
        }
        return new b(i2, i3, i4, i5);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return Insets.of(this.a, this.b, this.c, this.f2451d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2451d == bVar.f2451d && this.a == bVar.a && this.c == bVar.c && this.b == bVar.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.f2451d;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Insets{left=");
        A.append(this.a);
        A.append(", top=");
        A.append(this.b);
        A.append(", right=");
        A.append(this.c);
        A.append(", bottom=");
        A.append(this.f2451d);
        A.append('}');
        return A.toString();
    }
}

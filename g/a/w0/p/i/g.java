package g.a.w0.p.i;

/* compiled from: Settings.java */
/* loaded from: classes2.dex */
public final class g {
    public int a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f8110d = new int[10];

    public boolean a(int i2) {
        return ((1 << i2) & this.a) != 0;
    }

    public g b(int i2, int i3, int i4) {
        int[] iArr = this.f8110d;
        if (i2 >= iArr.length) {
            return this;
        }
        int i5 = 1 << i2;
        this.a |= i5;
        if ((i3 & 1) != 0) {
            this.b |= i5;
        } else {
            this.b &= ~i5;
        }
        if ((i3 & 2) != 0) {
            this.c |= i5;
        } else {
            this.c &= ~i5;
        }
        iArr[i2] = i4;
        return this;
    }
}

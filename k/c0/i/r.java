package k.c0.i;

/* compiled from: Settings.java */
/* loaded from: classes2.dex */
public final class r {
    public int a;
    public final int[] b = new int[10];

    public int a() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public r b(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }
}

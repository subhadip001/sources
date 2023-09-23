package f.h.b.b.u1;

/* compiled from: Ac3Util.java */
/* loaded from: classes.dex */
public final class l {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4572d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4573e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4574f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 >= 0) {
            int[] iArr = b;
            if (i2 >= iArr.length || i3 < 0) {
                return -1;
            }
            int[] iArr2 = f4574f;
            if (i4 >= iArr2.length) {
                return -1;
            }
            int i5 = iArr[i2];
            if (i5 == 44100) {
                return ((i3 % 2) + iArr2[i4]) * 2;
            }
            int i6 = f4573e[i4];
            return i5 == 32000 ? i6 * 6 : i6 * 4;
        }
        return -1;
    }
}

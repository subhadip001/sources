package f.h.b.b.u1;

/* compiled from: MpegAudioUtil.java */
/* loaded from: classes.dex */
public final class z {
    public static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {44100, 48000, 32000};
    public static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4602d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4603e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4604f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f4605g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public String b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4606d;

        /* renamed from: e  reason: collision with root package name */
        public int f4607e;

        /* renamed from: f  reason: collision with root package name */
        public int f4608f;

        /* renamed from: g  reason: collision with root package name */
        public int f4609g;

        public boolean a(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!z.c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.a = i3;
            this.b = z.a[3 - i4];
            int i7 = z.b[i6];
            this.f4606d = i7;
            if (i3 == 2) {
                this.f4606d = i7 / 2;
            } else if (i3 == 0) {
                this.f4606d = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.f4609g = z.b(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? z.c[i5 - 1] : z.f4602d[i5 - 1];
                this.f4608f = i9;
                this.c = (((i9 * 12) / this.f4606d) + i8) * 4;
            } else {
                if (i3 == 3) {
                    int i10 = i4 == 2 ? z.f4603e[i5 - 1] : z.f4604f[i5 - 1];
                    this.f4608f = i10;
                    this.c = ((i10 * 144) / this.f4606d) + i8;
                } else {
                    int i11 = z.f4605g[i5 - 1];
                    this.f4608f = i11;
                    this.c = (((i4 == 1 ? 72 : 144) * i11) / this.f4606d) + i8;
                }
            }
            this.f4607e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = b[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? c[i5 - 1] : f4602d[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? f4603e[i5 - 1] : f4604f[i5 - 1];
        } else {
            i7 = f4605g[i5 - 1];
        }
        if (i3 == 3) {
            return f.a.b.a.a.m(i7, 144, i8, i9);
        }
        return f.a.b.a.a.m(i4 == 1 ? 72 : 144, i7, i8, i9);
    }

    public static int b(int i2, int i3) {
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        } else if (i3 != 2) {
            if (i3 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    public static boolean c(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    public static int d(int i2) {
        int i3;
        int i4;
        if (!c(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return b(i3, i4);
    }
}

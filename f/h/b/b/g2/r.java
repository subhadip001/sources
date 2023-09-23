package f.h.b.b.g2;

import java.util.Arrays;

/* compiled from: NalUnitUtil.java */
/* loaded from: classes.dex */
public final class r {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f4289d = new int[10];

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i2, int i3, boolean z) {
            this.a = i2;
            this.b = i3;
            this.c = z;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4290d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4291e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4292f;

        /* renamed from: g  reason: collision with root package name */
        public final float f4293g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f4294h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f4295i;

        /* renamed from: j  reason: collision with root package name */
        public final int f4296j;

        /* renamed from: k  reason: collision with root package name */
        public final int f4297k;

        /* renamed from: l  reason: collision with root package name */
        public final int f4298l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f4299m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.f4290d = i5;
            this.f4291e = i6;
            this.f4292f = i7;
            this.f4293g = f2;
            this.f4294h = z;
            this.f4295i = z2;
            this.f4296j = i8;
            this.f4297k = i9;
            this.f4298l = i10;
            this.f4299m = z3;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        f.h.b.b.e2.j.g(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i2 - 2;
        } else if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i2 - 1;
        } else {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                if ((bArr[i6] & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && bArr[i6] == 1) {
                        zArr[0] = false;
                        zArr[1] = false;
                        zArr[2] = false;
                        return i7;
                    }
                    i6 -= 2;
                }
                i6 += 3;
            }
            zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
            zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
            zArr[2] = bArr[i5] == 0;
            return i3;
        }
    }

    public static a c(byte[] bArr, int i2, int i3) {
        u uVar = new u(bArr, i2, i3);
        uVar.k(8);
        int f2 = uVar.f();
        int f3 = uVar.f();
        uVar.j();
        return new a(f2, f3, uVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f.h.b.b.g2.r.b d(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.g2.r.d(byte[], int, int):f.h.b.b.g2.r$b");
    }

    public static int e(byte[] bArr, int i2) {
        int i3;
        synchronized (c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    } else if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = f4289d;
                    if (iArr.length <= i5) {
                        f4289d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f4289d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = f4289d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}

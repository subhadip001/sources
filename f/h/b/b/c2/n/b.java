package f.h.b.b.c2.n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.s;

/* compiled from: DvbParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f3981h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f3982i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f3983j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;

    /* renamed from: d  reason: collision with root package name */
    public final C0104b f3984d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3985e;

    /* renamed from: f  reason: collision with root package name */
    public final h f3986f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f3987g;

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f3988d;

        public a(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i2;
            this.b = iArr;
            this.c = iArr2;
            this.f3988d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    /* renamed from: f.h.b.b.c2.n.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0104b {
        public final int a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3989d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3990e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3991f;

        public C0104b(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.f3989d = i5;
            this.f3990e = i6;
            this.f3991f = i7;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f3992d;

        public c(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i2;
            this.b = z;
            this.c = bArr;
            this.f3992d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i2, int i3, int i4, SparseArray<e> sparseArray) {
            this.a = i3;
            this.b = i4;
            this.c = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3993d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3994e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3995f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3996g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3997h;

        /* renamed from: i  reason: collision with root package name */
        public final int f3998i;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<g> f3999j;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.f3993d = i4;
            this.f3994e = i6;
            this.f3995f = i7;
            this.f3996g = i8;
            this.f3997h = i9;
            this.f3998i = i10;
            this.f3999j = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class g {
        public final int a;
        public final int b;

        public g(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.a = i4;
            this.b = i5;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f4000d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f4001e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f4002f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f4003g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0104b f4004h;

        /* renamed from: i  reason: collision with root package name */
        public d f4005i;

        public h(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public b(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.f3984d = new C0104b(719, 575, 0, 719, 0, 575);
        this.f3985e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f3986f = new h(i2, i3);
    }

    public static byte[] a(int i2, int i3, s sVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) sVar.g(i3);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = d(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b A[LOOP:3: B:87:0x0163->B:118:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141 A[LOOP:2: B:41:0x00ab->B:74:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.n.b.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(s sVar, int i2) {
        int g2;
        int g3;
        int g4;
        int g5;
        int i3 = 8;
        int g6 = sVar.g(8);
        sVar.m(8);
        int i4 = i2 - 2;
        int i5 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b = b();
        int[] c2 = c();
        while (i4 > 0) {
            int g7 = sVar.g(i3);
            int g8 = sVar.g(i3);
            int i6 = i4 - 2;
            int[] iArr2 = (g8 & 128) != 0 ? iArr : (g8 & 64) != 0 ? b : c2;
            if ((g8 & 1) != 0) {
                g4 = sVar.g(i3);
                g2 = sVar.g(i3);
                g5 = sVar.g(i3);
                g3 = sVar.g(i3);
                i4 = i6 - 4;
            } else {
                i4 = i6 - 2;
                g2 = sVar.g(i5) << i5;
                g3 = sVar.g(2) << 6;
                g4 = sVar.g(6) << 2;
                g5 = sVar.g(i5) << i5;
            }
            if (g4 == 0) {
                g2 = 0;
                g5 = 0;
                g3 = 255;
            }
            double d2 = g4;
            double d3 = g2 - 128;
            double d4 = g5 - 128;
            iArr2[g7] = d((byte) (255 - (g3 & 255)), b0.h((int) ((1.402d * d3) + d2), 0, 255), b0.h((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), b0.h((int) ((d4 * 1.772d) + d2), 0, 255));
            iArr = iArr;
            g6 = g6;
            i3 = 8;
            i5 = 4;
        }
        return new a(g6, iArr, b, c2);
    }

    public static c g(s sVar) {
        byte[] bArr;
        int g2 = sVar.g(16);
        sVar.m(4);
        int g3 = sVar.g(2);
        boolean f2 = sVar.f();
        sVar.m(1);
        byte[] bArr2 = b0.f4270f;
        if (g3 == 1) {
            sVar.m(sVar.g(8) * 16);
        } else if (g3 == 0) {
            int g4 = sVar.g(16);
            int g5 = sVar.g(16);
            if (g4 > 0) {
                bArr2 = new byte[g4];
                sVar.i(bArr2, 0, g4);
            }
            if (g5 > 0) {
                bArr = new byte[g5];
                sVar.i(bArr, 0, g5);
                return new c(g2, f2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(g2, f2, bArr2, bArr);
    }
}

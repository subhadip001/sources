package f.h.b.b.b2;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder.java */
/* loaded from: classes.dex */
public interface i0 {
    int a();

    i0 b(int i2, int i3);

    int c();

    int d(int i2);

    int e(int i2);

    i0 f(int i2, int i3);

    int g();

    i0 h();

    /* compiled from: ShuffleOrder.java */
    /* loaded from: classes.dex */
    public static class a implements i0 {
        public final Random a;
        public final int[] b;
        public final int[] c;

        public a(int[] iArr, Random random) {
            this.b = iArr;
            this.a = random;
            this.c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.c[iArr[i2]] = i2;
            }
        }

        @Override // f.h.b.b.b2.i0
        public int a() {
            return this.b.length;
        }

        @Override // f.h.b.b.b2.i0
        public i0 b(int i2, int i3) {
            int i4 = i3 - i2;
            int[] iArr = new int[this.b.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i5 < iArr2.length) {
                    if (iArr2[i5] < i2 || iArr2[i5] >= i3) {
                        iArr[i5 - i6] = iArr2[i5] >= i2 ? iArr2[i5] - i4 : iArr2[i5];
                    } else {
                        i6++;
                    }
                    i5++;
                } else {
                    return new a(iArr, new Random(this.a.nextLong()));
                }
            }
        }

        @Override // f.h.b.b.b2.i0
        public int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // f.h.b.b.b2.i0
        public int d(int i2) {
            int i3 = this.c[i2] - 1;
            if (i3 >= 0) {
                return this.b[i3];
            }
            return -1;
        }

        @Override // f.h.b.b.b2.i0
        public int e(int i2) {
            int i3 = this.c[i2] + 1;
            int[] iArr = this.b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // f.h.b.b.b2.i0
        public i0 f(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.a.nextInt(this.b.length + 1);
                int i6 = i5 + 1;
                int nextInt = this.a.nextInt(i6);
                iArr2[i5] = iArr2[nextInt];
                iArr2[nextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i4 < iArr4.length + i3) {
                    if (i7 < i3 && i8 == iArr[i7]) {
                        iArr3[i4] = iArr2[i7];
                        i7++;
                    } else {
                        int i9 = i8 + 1;
                        iArr3[i4] = iArr4[i8];
                        if (iArr3[i4] >= i2) {
                            iArr3[i4] = iArr3[i4] + i3;
                        }
                        i8 = i9;
                    }
                    i4++;
                } else {
                    return new a(iArr3, new Random(this.a.nextLong()));
                }
            }
        }

        @Override // f.h.b.b.b2.i0
        public int g() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // f.h.b.b.b2.i0
        public i0 h() {
            return new a(0, new Random(this.a.nextLong()));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r6, java.util.Random r7) {
            /*
                r5 = this;
                int[] r0 = new int[r6]
                r1 = 0
            L3:
                if (r1 >= r6) goto L13
                int r2 = r1 + 1
                int r3 = r7.nextInt(r2)
                r4 = r0[r3]
                r0[r1] = r4
                r0[r3] = r1
                r1 = r2
                goto L3
            L13:
                r5.<init>(r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.i0.a.<init>(int, java.util.Random):void");
        }
    }
}

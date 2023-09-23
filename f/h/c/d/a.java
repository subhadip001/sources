package f.h.c.d;

import java.math.RoundingMode;

/* compiled from: IntMath.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: IntMath.java */
    /* renamed from: f.h.c.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0138a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r1 > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r5 > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r5 < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(int r5, int r6, java.math.RoundingMode r7) {
        /*
            java.util.Objects.requireNonNull(r7)
            if (r6 == 0) goto L63
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = f.h.c.d.a.C0138a.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L57;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L57
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = 1
            goto L43
        L42:
            r7 = 0
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L56
            goto L57
        L47:
            if (r1 <= 0) goto L56
            goto L57
        L4a:
            if (r5 <= 0) goto L56
            goto L57
        L4d:
            if (r5 >= 0) goto L56
            goto L57
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            if (r2 == 0) goto L5b
        L56:
            r2 = 0
        L57:
            if (r2 == 0) goto L5a
            int r0 = r0 + r5
        L5a:
            return r0
        L5b:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "mode was UNNECESSARY, but rounding was necessary"
            r5.<init>(r6)
            throw r5
        L63:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.d.a.a(int, int, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(int i2, RoundingMode roundingMode) {
        if (i2 > 0) {
            switch (C0138a.a[roundingMode.ordinal()]) {
                case 1:
                    if (!((i2 > 0) & (((i2 + (-1)) & i2) == 0))) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i2 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i2))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i2);
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("x");
        sb.append(" (");
        sb.append(i2);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }
}

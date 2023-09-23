package f.h.b.b.g2;

/* compiled from: CodecSpecificDataUtil.java */
/* loaded from: classes.dex */
public final class g {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};

    public static String a(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String b(u uVar) {
        uVar.k(24);
        int e2 = uVar.e(2);
        boolean d2 = uVar.d();
        int e3 = uVar.e(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (uVar.d()) {
                i2 |= 1 << i3;
            }
        }
        int i4 = 6;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = uVar.e(8);
        }
        int e4 = uVar.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = b[e2];
        objArr[1] = Integer.valueOf(e3);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Character.valueOf(d2 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(e4);
        StringBuilder sb = new StringBuilder(b0.k("hvc1.%s%d.%X.%c%d", objArr));
        while (i4 > 0) {
            int i6 = i4 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i4 = i6;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }
}

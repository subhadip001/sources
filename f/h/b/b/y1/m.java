package f.h.b.b.y1;

/* compiled from: FlacFrameReader.java */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: FlacFrameReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public long a;
    }

    public static boolean a(f.h.b.b.g2.t tVar, o oVar, boolean z, a aVar) {
        try {
            long x = tVar.x();
            if (!z) {
                x *= oVar.b;
            }
            aVar.a = x;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r7 == r18.f5102f) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
        if ((r17.r() * 1000) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00aa, code lost:
        if (r4 == r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(f.h.b.b.g2.t r17, f.h.b.b.y1.o r18, int r19, f.h.b.b.y1.m.a r20) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.m.b(f.h.b.b.g2.t, f.h.b.b.y1.o, int, f.h.b.b.y1.m$a):boolean");
    }

    public static int c(f.h.b.b.g2.t tVar, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return tVar.r() + 1;
            case 7:
                return tVar.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }
}

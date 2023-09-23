package e.i.g;

import java.util.Comparator;

/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
public class d {
    public static final Comparator<byte[]> a = new a();

    /* compiled from: FontProvider.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i2;
            int i3;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                i2 = bArr3.length;
                i3 = bArr4.length;
            } else {
                for (int i4 = 0; i4 < bArr3.length; i4++) {
                    if (bArr3[i4] != bArr4[i4]) {
                        i2 = bArr3[i4];
                        i3 = bArr4[i4];
                    }
                }
                return 0;
            }
            return i2 - i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[LOOP:1: B:15:0x004b->B:30:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0094 A[EDGE_INSN: B:79:0x0094->B:32:0x0094 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.i.g.k a(android.content.Context r20, e.i.g.e r21, android.os.CancellationSignal r22) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.g.d.a(android.content.Context, e.i.g.e, android.os.CancellationSignal):e.i.g.k");
    }
}

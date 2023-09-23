package f.h.b.b.h2;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig.java */
/* loaded from: classes.dex */
public final class m {
    public final List<byte[]> a;
    public final int b;
    public final String c;

    public m(List<byte[]> list, int i2, String str) {
        this.a = list;
        this.b = i2;
        this.c = str;
    }

    public static m a(f.h.b.b.g2.t tVar) {
        try {
            tVar.D(21);
            int r = tVar.r() & 3;
            int r2 = tVar.r();
            int i2 = tVar.b;
            int i3 = 0;
            for (int i4 = 0; i4 < r2; i4++) {
                tVar.D(1);
                int w = tVar.w();
                for (int i5 = 0; i5 < w; i5++) {
                    int w2 = tVar.w();
                    i3 += w2 + 4;
                    tVar.D(w2);
                }
            }
            tVar.C(i2);
            byte[] bArr = new byte[i3];
            String str = null;
            int i6 = 0;
            for (int i7 = 0; i7 < r2; i7++) {
                int r3 = tVar.r() & 127;
                int w3 = tVar.w();
                for (int i8 = 0; i8 < w3; i8++) {
                    int w4 = tVar.w();
                    byte[] bArr2 = f.h.b.b.g2.r.a;
                    System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                    int length = i6 + bArr2.length;
                    System.arraycopy(tVar.a, tVar.b, bArr, length, w4);
                    if (r3 == 33 && i8 == 0) {
                        str = f.h.b.b.g2.g.b(new f.h.b.b.g2.u(bArr, length, length + w4));
                    }
                    i6 = length + w4;
                    tVar.D(w4);
                }
            }
            return new m(i3 == 0 ? null : Collections.singletonList(bArr), r + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing HEVC config", e2);
        }
    }
}

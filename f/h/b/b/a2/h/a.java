package f.h.b.b.a2.h;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import f.h.b.b.a2.d;
import f.h.b.b.a2.g;
import f.h.b.b.g2.s;
import f.h.c.a.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes.dex */
public final class a extends g {
    @Override // f.h.b.b.a2.g
    public Metadata b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            s sVar = new s(byteBuffer.array(), byteBuffer.limit());
            sVar.m(12);
            int d2 = (sVar.d() + sVar.g(12)) - 4;
            sVar.m(44);
            sVar.n(sVar.g(12));
            sVar.m(16);
            ArrayList arrayList = new ArrayList();
            while (sVar.d() < d2) {
                sVar.m(48);
                int g2 = sVar.g(8);
                sVar.m(4);
                int d3 = sVar.d() + sVar.g(12);
                String str = null;
                String str2 = null;
                while (sVar.d() < d3) {
                    int g3 = sVar.g(8);
                    int g4 = sVar.g(8);
                    int d4 = sVar.d() + g4;
                    if (g3 == 2) {
                        int g5 = sVar.g(16);
                        sVar.m(8);
                        if (g5 != 3) {
                        }
                        while (sVar.d() < d4) {
                            int g6 = sVar.g(8);
                            Charset charset = c.a;
                            byte[] bArr = new byte[g6];
                            sVar.i(bArr, 0, g6);
                            str = new String(bArr, charset);
                            int g7 = sVar.g(8);
                            for (int i2 = 0; i2 < g7; i2++) {
                                sVar.n(sVar.g(8));
                            }
                        }
                    } else if (g3 == 21) {
                        Charset charset2 = c.a;
                        byte[] bArr2 = new byte[g4];
                        sVar.i(bArr2, 0, g4);
                        str2 = new String(bArr2, charset2);
                    }
                    sVar.k(d4 * 8);
                }
                sVar.k(d3 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(g2, str2.length() != 0 ? str.concat(str2) : new String(str)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}

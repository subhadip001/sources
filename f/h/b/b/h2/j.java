package f.h.b.b.h2;

import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AvcConfig.java */
/* loaded from: classes.dex */
public final class j {
    public final List<byte[]> a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4346d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4347e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4348f;

    public j(List<byte[]> list, int i2, int i3, int i4, float f2, String str) {
        this.a = list;
        this.b = i2;
        this.c = i3;
        this.f4346d = i4;
        this.f4347e = f2;
        this.f4348f = str;
    }

    public static byte[] a(f.h.b.b.g2.t tVar) {
        int w = tVar.w();
        int i2 = tVar.b;
        tVar.D(w);
        byte[] bArr = tVar.a;
        byte[] bArr2 = f.h.b.b.g2.g.a;
        byte[] bArr3 = new byte[bArr2.length + w];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, w);
        return bArr3;
    }

    public static j b(f.h.b.b.g2.t tVar) {
        String str;
        int i2;
        int i3;
        float f2;
        try {
            tVar.D(4);
            int r = (tVar.r() & 3) + 1;
            if (r != 3) {
                ArrayList arrayList = new ArrayList();
                int r2 = tVar.r() & 31;
                for (int i4 = 0; i4 < r2; i4++) {
                    arrayList.add(a(tVar));
                }
                int r3 = tVar.r();
                for (int i5 = 0; i5 < r3; i5++) {
                    arrayList.add(a(tVar));
                }
                if (r2 > 0) {
                    r.b d2 = f.h.b.b.g2.r.d((byte[]) arrayList.get(0), r, ((byte[]) arrayList.get(0)).length);
                    int i6 = d2.f4291e;
                    int i7 = d2.f4292f;
                    float f3 = d2.f4293g;
                    str = f.h.b.b.g2.g.a(d2.a, d2.b, d2.c);
                    i2 = i6;
                    i3 = i7;
                    f2 = f3;
                } else {
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    f2 = 1.0f;
                }
                return new j(arrayList, r, i2, i3, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing AVC config", e2);
        }
    }
}

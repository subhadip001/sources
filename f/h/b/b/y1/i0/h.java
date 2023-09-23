package f.h.b.b.y1.i0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.g2.t;
import f.h.b.b.y1.i0.i;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: OpusReader.java */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    @Override // f.h.b.b.y1.i0.i
    public long c(t tVar) {
        byte[] bArr = tVar.a;
        int i2 = bArr[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        return a(i4 * (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? 10000 << (i6 & 1) : i6 == 3 ? 60000 : 10000 << i6));
    }

    @Override // f.h.b.b.y1.i0.i
    public boolean d(t tVar, long j2, i.b bVar) {
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(tVar.a, tVar.c);
            List<byte[]> b = f.c.a.a.i.b(copyOf);
            Format.b bVar2 = new Format.b();
            bVar2.f722k = "audio/opus";
            bVar2.x = copyOf[9] & 255;
            bVar2.y = 48000;
            bVar2.f724m = b;
            bVar.a = bVar2.a();
            this.n = true;
            return true;
        }
        Objects.requireNonNull(bVar.a);
        boolean z = tVar.f() == 1332770163;
        tVar.C(0);
        return z;
    }

    @Override // f.h.b.b.y1.i0.i
    public void e(boolean z) {
        super.e(z);
        if (z) {
            this.n = false;
        }
    }
}

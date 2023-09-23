package f.h.b.b.y1;

import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.a2.k.b;
import java.io.EOFException;

/* compiled from: Id3Peeker.java */
/* loaded from: classes.dex */
public final class q {
    public final f.h.b.b.g2.t a = new f.h.b.b.g2.t(10);

    public Metadata a(i iVar, b.a aVar) {
        Metadata metadata = null;
        int i2 = 0;
        while (true) {
            try {
                iVar.o(this.a.a, 0, 10);
                this.a.C(0);
                if (this.a.t() != 4801587) {
                    break;
                }
                this.a.D(3);
                int q = this.a.q();
                int i3 = q + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    iVar.o(bArr, 10, q);
                    metadata = new f.h.b.b.a2.k.b(aVar).d(bArr, i3);
                } else {
                    iVar.g(q);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        iVar.l();
        iVar.g(i2);
        return metadata;
    }
}

package f.h.b.b.y1;

import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.w;
import java.io.EOFException;

/* compiled from: DummyTrackOutput.java */
/* loaded from: classes.dex */
public final class g implements w {
    public final byte[] a = new byte[4096];

    @Override // f.h.b.b.y1.w
    public int a(f.h.b.b.f2.f fVar, int i2, boolean z, int i3) {
        int b = fVar.b(this.a, 0, Math.min(this.a.length, i2));
        if (b == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return b;
    }

    @Override // f.h.b.b.y1.w
    public /* synthetic */ int b(f.h.b.b.f2.f fVar, int i2, boolean z) {
        return v.a(this, fVar, i2, z);
    }

    @Override // f.h.b.b.y1.w
    public /* synthetic */ void c(f.h.b.b.g2.t tVar, int i2) {
        v.b(this, tVar, i2);
    }

    @Override // f.h.b.b.y1.w
    public void d(long j2, int i2, int i3, int i4, w.a aVar) {
    }

    @Override // f.h.b.b.y1.w
    public void e(Format format) {
    }

    @Override // f.h.b.b.y1.w
    public void f(f.h.b.b.g2.t tVar, int i2, int i3) {
        tVar.C(tVar.b + i2);
    }
}

package f.h.b.b.h2.x;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import f.h.b.b.g0;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes.dex */
public final class b extends g0 {
    public final DecoderInputBuffer q;
    public final t r;
    public long s;
    public a t;
    public long u;

    public b() {
        super(6);
        this.q = new DecoderInputBuffer(1);
        this.r = new t();
    }

    @Override // f.h.b.b.g0
    public void B() {
        a aVar = this.t;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // f.h.b.b.g0
    public void D(long j2, boolean z) {
        this.u = Long.MIN_VALUE;
        a aVar = this.t;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // f.h.b.b.g0
    public void H(Format[] formatArr, long j2, long j3) {
        this.s = j3;
    }

    @Override // f.h.b.b.k1
    public int a(Format format) {
        return "application/x-camera-motion".equals(format.q) ? 4 : 0;
    }

    @Override // f.h.b.b.j1
    public boolean b() {
        return i();
    }

    @Override // f.h.b.b.j1
    public boolean e() {
        return true;
    }

    @Override // f.h.b.b.j1, f.h.b.b.k1
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // f.h.b.b.j1
    public void q(long j2, long j3) {
        float[] fArr;
        while (!i() && this.u < 100000 + j2) {
            this.q.o();
            if (I(A(), this.q, false) != -4 || this.q.m()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.q;
            this.u = decoderInputBuffer.f754j;
            if (this.t != null && !decoderInputBuffer.l()) {
                this.q.r();
                ByteBuffer byteBuffer = this.q.f752h;
                int i2 = b0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.r.A(byteBuffer.array(), byteBuffer.limit());
                    this.r.C(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i3 = 0; i3 < 3; i3++) {
                        fArr2[i3] = Float.intBitsToFloat(this.r.h());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.t.a(this.u - this.s, fArr);
                }
            }
        }
    }

    @Override // f.h.b.b.g0, f.h.b.b.g1.b
    public void r(int i2, Object obj) {
        if (i2 == 7) {
            this.t = (a) obj;
        }
    }
}

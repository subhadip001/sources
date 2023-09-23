package f.h.b.b.z1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import f.h.b.b.g2.b0;
import f.h.b.b.h2.n;
import f.h.b.b.z1.r;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class u implements r {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public static final class b implements r.a {
        @Override // f.h.b.b.z1.r.a
        public r a(MediaCodec mediaCodec) {
            return new u(mediaCodec, null);
        }
    }

    public u(MediaCodec mediaCodec, a aVar) {
        this.a = mediaCodec;
    }

    @Override // f.h.b.b.z1.r
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        this.a.configure(mediaFormat, surface, mediaCrypto, i2);
    }

    @Override // f.h.b.b.z1.r
    public void b(int i2, int i3, f.h.b.b.v1.b bVar, long j2, int i4) {
        this.a.queueSecureInputBuffer(i2, i3, bVar.f4616i, j2, i4);
    }

    @Override // f.h.b.b.z1.r
    public MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // f.h.b.b.z1.r
    public void d(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // f.h.b.b.z1.r
    public void e(int i2, long j2) {
        this.a.releaseOutputBuffer(i2, j2);
    }

    @Override // f.h.b.b.z1.r
    public int f() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // f.h.b.b.z1.r
    public void flush() {
        this.a.flush();
    }

    @Override // f.h.b.b.z1.r
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && b0.a < 21) {
                this.c = this.a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // f.h.b.b.z1.r
    public void h(final r.b bVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: f.h.b.b.z1.i
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                u uVar = u.this;
                r.b bVar2 = bVar;
                Objects.requireNonNull(uVar);
                ((n.b) bVar2).b(uVar, j2, j3);
            }
        }, handler);
    }

    @Override // f.h.b.b.z1.r
    public void i(int i2, boolean z) {
        this.a.releaseOutputBuffer(i2, z);
    }

    @Override // f.h.b.b.z1.r
    public void j(int i2) {
        this.a.setVideoScalingMode(i2);
    }

    @Override // f.h.b.b.z1.r
    public ByteBuffer k(int i2) {
        if (b0.a >= 21) {
            return this.a.getInputBuffer(i2);
        }
        return this.b[i2];
    }

    @Override // f.h.b.b.z1.r
    public void l(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // f.h.b.b.z1.r
    public void m(int i2, int i3, int i4, long j2, int i5) {
        this.a.queueInputBuffer(i2, i3, i4, j2, i5);
    }

    @Override // f.h.b.b.z1.r
    public ByteBuffer n(int i2) {
        if (b0.a >= 21) {
            return this.a.getOutputBuffer(i2);
        }
        return this.c[i2];
    }

    @Override // f.h.b.b.z1.r
    public void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // f.h.b.b.z1.r
    public void start() {
        this.a.start();
        if (b0.a < 21) {
            this.b = this.a.getInputBuffers();
            this.c = this.a.getOutputBuffers();
        }
    }
}

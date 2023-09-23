package f.h.b.b.z1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import f.h.b.b.g2.b0;
import f.h.b.b.h2.n;
import f.h.b.b.z1.n;
import f.h.b.b.z1.r;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class l implements r {
    public final MediaCodec a;
    public final o b;
    public final n c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5118d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5119e;

    /* renamed from: f  reason: collision with root package name */
    public int f5120f = 0;

    public l(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2, a aVar) {
        this.a = mediaCodec;
        this.b = new o(handlerThread);
        this.c = new n(mediaCodec, handlerThread2, z);
        this.f5118d = z2;
    }

    public static String o(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // f.h.b.b.z1.r
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        o oVar = this.b;
        MediaCodec mediaCodec = this.a;
        f.h.b.b.e2.j.g(oVar.c == null);
        oVar.b.start();
        Handler handler = new Handler(oVar.b.getLooper());
        mediaCodec.setCallback(oVar, handler);
        oVar.c = handler;
        this.a.configure(mediaFormat, surface, mediaCrypto, i2);
        this.f5120f = 1;
    }

    @Override // f.h.b.b.z1.r
    public void b(int i2, int i3, f.h.b.b.v1.b bVar, long j2, int i4) {
        n nVar = this.c;
        nVar.f();
        n.a e2 = n.e();
        e2.a = i2;
        e2.b = i3;
        e2.c = 0;
        e2.f5128e = j2;
        e2.f5129f = i4;
        MediaCodec.CryptoInfo cryptoInfo = e2.f5127d;
        cryptoInfo.numSubSamples = bVar.f4613f;
        cryptoInfo.numBytesOfClearData = n.c(bVar.f4611d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = n.c(bVar.f4612e, cryptoInfo.numBytesOfEncryptedData);
        byte[] b = n.b(bVar.b, cryptoInfo.key);
        Objects.requireNonNull(b);
        cryptoInfo.key = b;
        byte[] b2 = n.b(bVar.a, cryptoInfo.iv);
        Objects.requireNonNull(b2);
        cryptoInfo.iv = b2;
        cryptoInfo.mode = bVar.c;
        if (b0.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f4614g, bVar.f4615h));
        }
        nVar.c.obtainMessage(1, e2).sendToTarget();
    }

    @Override // f.h.b.b.z1.r
    public MediaFormat c() {
        MediaFormat mediaFormat;
        o oVar = this.b;
        synchronized (oVar.a) {
            mediaFormat = oVar.f5134h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // f.h.b.b.z1.r
    public void d(Bundle bundle) {
        p();
        this.a.setParameters(bundle);
    }

    @Override // f.h.b.b.z1.r
    public void e(int i2, long j2) {
        this.a.releaseOutputBuffer(i2, j2);
    }

    @Override // f.h.b.b.z1.r
    public int f() {
        int i2;
        o oVar = this.b;
        synchronized (oVar.a) {
            i2 = -1;
            if (!oVar.b()) {
                IllegalStateException illegalStateException = oVar.f5139m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = oVar.f5136j;
                    if (codecException == null) {
                        f.h.b.b.g2.k kVar = oVar.f5130d;
                        if (!(kVar.c == 0)) {
                            i2 = kVar.b();
                        }
                    } else {
                        oVar.f5136j = null;
                        throw codecException;
                    }
                } else {
                    oVar.f5139m = null;
                    throw illegalStateException;
                }
            }
        }
        return i2;
    }

    @Override // f.h.b.b.z1.r
    public void flush() {
        this.c.d();
        this.a.flush();
        final o oVar = this.b;
        final MediaCodec mediaCodec = this.a;
        Objects.requireNonNull(mediaCodec);
        final Runnable runnable = new Runnable() { // from class: f.h.b.b.z1.j
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        };
        synchronized (oVar.a) {
            oVar.f5137k++;
            Handler handler = oVar.c;
            int i2 = b0.a;
            handler.post(new Runnable() { // from class: f.h.b.b.z1.d
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar2 = o.this;
                    Runnable runnable2 = runnable;
                    synchronized (oVar2.a) {
                        if (!oVar2.f5138l) {
                            long j2 = oVar2.f5137k - 1;
                            oVar2.f5137k = j2;
                            int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                            if (i3 <= 0) {
                                if (i3 < 0) {
                                    oVar2.c(new IllegalStateException());
                                } else {
                                    oVar2.a();
                                    try {
                                        runnable2.run();
                                    } catch (IllegalStateException e2) {
                                        oVar2.c(e2);
                                    } catch (Exception e3) {
                                        oVar2.c(new IllegalStateException(e3));
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // f.h.b.b.z1.r
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int i2;
        o oVar = this.b;
        synchronized (oVar.a) {
            i2 = -1;
            if (!oVar.b()) {
                IllegalStateException illegalStateException = oVar.f5139m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = oVar.f5136j;
                    if (codecException == null) {
                        f.h.b.b.g2.k kVar = oVar.f5131e;
                        if (!(kVar.c == 0)) {
                            i2 = kVar.b();
                            if (i2 >= 0) {
                                f.h.b.b.e2.j.i(oVar.f5134h);
                                MediaCodec.BufferInfo remove = oVar.f5132f.remove();
                                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                            } else if (i2 == -2) {
                                oVar.f5134h = oVar.f5133g.remove();
                            }
                        }
                    } else {
                        oVar.f5136j = null;
                        throw codecException;
                    }
                } else {
                    oVar.f5139m = null;
                    throw illegalStateException;
                }
            }
        }
        return i2;
    }

    @Override // f.h.b.b.z1.r
    public void h(final r.b bVar, Handler handler) {
        p();
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: f.h.b.b.z1.c
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                l lVar = l.this;
                r.b bVar2 = bVar;
                Objects.requireNonNull(lVar);
                ((n.b) bVar2).b(lVar, j2, j3);
            }
        }, handler);
    }

    @Override // f.h.b.b.z1.r
    public void i(int i2, boolean z) {
        this.a.releaseOutputBuffer(i2, z);
    }

    @Override // f.h.b.b.z1.r
    public void j(int i2) {
        p();
        this.a.setVideoScalingMode(i2);
    }

    @Override // f.h.b.b.z1.r
    public ByteBuffer k(int i2) {
        return this.a.getInputBuffer(i2);
    }

    @Override // f.h.b.b.z1.r
    public void l(Surface surface) {
        p();
        this.a.setOutputSurface(surface);
    }

    @Override // f.h.b.b.z1.r
    public void m(int i2, int i3, int i4, long j2, int i5) {
        n nVar = this.c;
        nVar.f();
        n.a e2 = n.e();
        e2.a = i2;
        e2.b = i3;
        e2.c = i4;
        e2.f5128e = j2;
        e2.f5129f = i5;
        Handler handler = nVar.c;
        int i6 = b0.a;
        handler.obtainMessage(0, e2).sendToTarget();
    }

    @Override // f.h.b.b.z1.r
    public ByteBuffer n(int i2) {
        return this.a.getOutputBuffer(i2);
    }

    public final void p() {
        if (this.f5118d) {
            try {
                this.c.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // f.h.b.b.z1.r
    public void release() {
        try {
            if (this.f5120f == 2) {
                n nVar = this.c;
                if (nVar.f5126g) {
                    nVar.d();
                    nVar.b.quit();
                }
                nVar.f5126g = false;
            }
            int i2 = this.f5120f;
            if (i2 == 1 || i2 == 2) {
                o oVar = this.b;
                synchronized (oVar.a) {
                    oVar.f5138l = true;
                    oVar.b.quit();
                    oVar.a();
                }
            }
            this.f5120f = 3;
        } finally {
            if (!this.f5119e) {
                this.a.release();
                this.f5119e = true;
            }
        }
    }

    @Override // f.h.b.b.z1.r
    public void start() {
        n nVar = this.c;
        if (!nVar.f5126g) {
            nVar.b.start();
            nVar.c = new m(nVar, nVar.b.getLooper());
            nVar.f5126g = true;
        }
        this.a.start();
        this.f5120f = 2;
    }
}

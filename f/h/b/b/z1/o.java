package f.h.b.b.z1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: classes.dex */
public final class o extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f5134h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f5135i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f5136j;

    /* renamed from: k  reason: collision with root package name */
    public long f5137k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5138l;

    /* renamed from: m  reason: collision with root package name */
    public IllegalStateException f5139m;
    public final Object a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.g2.k f5130d = new f.h.b.b.g2.k();

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.b.g2.k f5131e = new f.h.b.b.g2.k();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f5132f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f5133g = new ArrayDeque<>();

    public o(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        if (!this.f5133g.isEmpty()) {
            this.f5135i = this.f5133g.getLast();
        }
        f.h.b.b.g2.k kVar = this.f5130d;
        kVar.a = 0;
        kVar.b = -1;
        kVar.c = 0;
        f.h.b.b.g2.k kVar2 = this.f5131e;
        kVar2.a = 0;
        kVar2.b = -1;
        kVar2.c = 0;
        this.f5132f.clear();
        this.f5133g.clear();
        this.f5136j = null;
    }

    public final boolean b() {
        return this.f5137k > 0 || this.f5138l;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.f5139m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.f5136j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.a) {
            this.f5130d.a(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.f5135i;
            if (mediaFormat != null) {
                this.f5131e.a(-2);
                this.f5133g.add(mediaFormat);
                this.f5135i = null;
            }
            this.f5131e.a(i2);
            this.f5132f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.f5131e.a(-2);
            this.f5133g.add(mediaFormat);
            this.f5135i = null;
        }
    }
}

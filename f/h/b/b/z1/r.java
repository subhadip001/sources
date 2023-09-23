package f.h.b.b.z1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import f.h.b.b.z1.u;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes.dex */
public interface r {

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public interface a {
        public static final a a = new u.b();

        r a(MediaCodec mediaCodec);
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2);

    void b(int i2, int i3, f.h.b.b.v1.b bVar, long j2, int i4);

    MediaFormat c();

    void d(Bundle bundle);

    void e(int i2, long j2);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(b bVar, Handler handler);

    void i(int i2, boolean z);

    void j(int i2);

    ByteBuffer k(int i2);

    void l(Surface surface);

    void m(int i2, int i3, int i4, long j2, int i5);

    ByteBuffer n(int i2);

    void release();

    void start();
}

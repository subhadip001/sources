package f.h.b.b.v1;

import android.media.MediaCodec;
import f.h.b.b.g2.b0;

/* compiled from: CryptoInfo.java */
/* loaded from: classes.dex */
public final class b {
    public byte[] a;
    public byte[] b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f4611d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f4612e;

    /* renamed from: f  reason: collision with root package name */
    public int f4613f;

    /* renamed from: g  reason: collision with root package name */
    public int f4614g;

    /* renamed from: h  reason: collision with root package name */
    public int f4615h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f4616i;

    /* renamed from: j  reason: collision with root package name */
    public final C0109b f4617j;

    /* compiled from: CryptoInfo.java */
    /* renamed from: f.h.b.b.v1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0109b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public C0109b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.a = cryptoInfo;
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f4616i = cryptoInfo;
        this.f4617j = b0.a >= 24 ? new C0109b(cryptoInfo, null) : null;
    }
}

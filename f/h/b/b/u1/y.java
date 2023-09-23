package f.h.b.b.u1;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import f.h.b.b.c1;
import f.h.b.b.j1;
import f.h.b.b.l1;
import f.h.b.b.s0;
import f.h.b.b.u1.q;
import f.h.b.b.z1.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes.dex */
public class y extends MediaCodecRenderer implements f.h.b.b.g2.o {
    public final Context K0;
    public final q.a L0;
    public final AudioSink M0;
    public int N0;
    public boolean O0;
    public Format P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public j1.a U0;

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes.dex */
    public final class b implements AudioSink.a {
        public b(a aVar) {
        }
    }

    public y(Context context, f.h.b.b.z1.t tVar, boolean z, Handler handler, q qVar, AudioSink audioSink) {
        super(1, r.a.a, tVar, z, 44100.0f);
        this.K0 = context.getApplicationContext();
        this.M0 = audioSink;
        this.L0 = new q.a(handler, qVar);
        audioSink.t(new b(null));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0
    public void B() {
        this.T0 = true;
        try {
            this.M0.flush();
            try {
                super.B();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.B();
                throw th;
            } finally {
            }
        }
    }

    @Override // f.h.b.b.g0
    public void C(boolean z, boolean z2) {
        final f.h.b.b.v1.d dVar = new f.h.b.b.v1.d();
        this.F0 = dVar;
        final q.a aVar = this.L0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.u1.i
                @Override // java.lang.Runnable
                public final void run() {
                    q.a aVar2 = q.a.this;
                    f.h.b.b.v1.d dVar2 = dVar;
                    q qVar = aVar2.b;
                    int i2 = f.h.b.b.g2.b0.a;
                    qVar.g(dVar2);
                }
            });
        }
        l1 l1Var = this.f4250h;
        Objects.requireNonNull(l1Var);
        if (l1Var.a) {
            this.M0.q();
        } else {
            this.M0.m();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0
    public void D(long j2, boolean z) {
        super.D(j2, z);
        this.M0.flush();
        this.Q0 = j2;
        this.R0 = true;
        this.S0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0
    public void E() {
        try {
            N();
            m0();
            this.H = null;
        } finally {
            if (this.T0) {
                this.T0 = false;
                this.M0.d();
            }
        }
    }

    @Override // f.h.b.b.g0
    public void F() {
        this.M0.r();
    }

    @Override // f.h.b.b.g0
    public void G() {
        z0();
        this.M0.e();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public f.h.b.b.v1.e K(f.h.b.b.z1.s sVar, Format format, Format format2) {
        f.h.b.b.v1.e c = sVar.c(format, format2);
        int i2 = c.f4627e;
        if (y0(sVar, format2) > this.N0) {
            i2 |= 64;
        }
        int i3 = i2;
        return new f.h.b.b.v1.e(sVar.a, format, format2, i3 != 0 ? 0 : c.f4626d, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(f.h.b.b.z1.s r9, f.h.b.b.z1.r r10, com.google.android.exoplayer2.Format r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.u1.y.L(f.h.b.b.z1.s, f.h.b.b.z1.r, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):void");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float W(float f2, Format format, Format[] formatArr) {
        int i2 = -1;
        for (Format format2 : formatArr) {
            int i3 = format2.E;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return f2 * i2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<f.h.b.b.z1.s> X(f.h.b.b.z1.t tVar, Format format, boolean z) {
        f.h.b.b.z1.s d2;
        String str = format.q;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.M0.a(format) && (d2 = MediaCodecUtil.d("audio/raw", false, false)) != null) {
            return Collections.singletonList(d2);
        }
        List<f.h.b.b.z1.s> a2 = tVar.a(str, z, false);
        Pattern pattern = MediaCodecUtil.a;
        ArrayList arrayList = new ArrayList(a2);
        MediaCodecUtil.j(arrayList, new f.h.b.b.z1.g(format));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(tVar.a("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.j1
    public boolean b() {
        return this.y0 && this.M0.b();
    }

    @Override // f.h.b.b.g2.o
    public c1 c() {
        return this.M0.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void c0(final String str, final long j2, final long j3) {
        final q.a aVar = this.L0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.u1.e
                @Override // java.lang.Runnable
                public final void run() {
                    q.a aVar2 = q.a.this;
                    String str2 = str;
                    long j4 = j2;
                    long j5 = j3;
                    q qVar = aVar2.b;
                    int i2 = f.h.b.b.g2.b0.a;
                    qVar.s(str2, j4, j5);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void d0(final String str) {
        final q.a aVar = this.L0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.u1.f
                @Override // java.lang.Runnable
                public final void run() {
                    q.a aVar2 = q.a.this;
                    String str2 = str;
                    q qVar = aVar2.b;
                    int i2 = f.h.b.b.g2.b0.a;
                    qVar.r(str2);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.j1
    public boolean e() {
        return this.M0.j() || super.e();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public f.h.b.b.v1.e e0(s0 s0Var) {
        final f.h.b.b.v1.e e0 = super.e0(s0Var);
        final q.a aVar = this.L0;
        final Format format = s0Var.b;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.u1.d
                @Override // java.lang.Runnable
                public final void run() {
                    q.a aVar2 = q.a.this;
                    Format format2 = format;
                    f.h.b.b.v1.e eVar = e0;
                    q qVar = aVar2.b;
                    int i2 = f.h.b.b.g2.b0.a;
                    qVar.y(format2, eVar);
                }
            });
        }
        return e0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void f0(Format format, MediaFormat mediaFormat) {
        int i2;
        int i3;
        Format format2 = this.P0;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.L != null) {
            if ("audio/raw".equals(format.q)) {
                i2 = format.F;
            } else if (f.h.b.b.g2.b0.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i2 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i2 = f.h.b.b.g2.b0.q(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i2 = "audio/raw".equals(format.q) ? format.F : 2;
            }
            Format.b bVar = new Format.b();
            bVar.f722k = "audio/raw";
            bVar.z = i2;
            bVar.A = format.G;
            bVar.B = format.H;
            bVar.x = mediaFormat.getInteger("channel-count");
            bVar.y = mediaFormat.getInteger("sample-rate");
            Format a2 = bVar.a();
            if (this.O0 && a2.D == 6 && (i3 = format.D) < 6) {
                iArr = new int[i3];
                for (int i4 = 0; i4 < format.D; i4++) {
                    iArr[i4] = i4;
                }
            }
            format = a2;
        }
        try {
            this.M0.v(format, 0, iArr);
        } catch (AudioSink.ConfigurationException e2) {
            throw z(e2, e2.f727f, false);
        }
    }

    @Override // f.h.b.b.j1, f.h.b.b.k1
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // f.h.b.b.g2.o
    public void h(c1 c1Var) {
        this.M0.h(c1Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void h0() {
        this.M0.o();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void i0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.R0 || decoderInputBuffer.l()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f754j - this.Q0) > 500000) {
            this.Q0 = decoderInputBuffer.f754j;
        }
        this.R0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean k0(long j2, long j3, f.h.b.b.z1.r rVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format) {
        Objects.requireNonNull(byteBuffer);
        if (this.P0 != null && (i3 & 2) != 0) {
            Objects.requireNonNull(rVar);
            rVar.i(i2, false);
            return true;
        } else if (z) {
            if (rVar != null) {
                rVar.i(i2, false);
            }
            this.F0.f4620f += i4;
            this.M0.o();
            return true;
        } else {
            try {
                if (this.M0.s(byteBuffer, j4, i4)) {
                    if (rVar != null) {
                        rVar.i(i2, false);
                    }
                    this.F0.f4619e += i4;
                    return true;
                }
                return false;
            } catch (AudioSink.InitializationException e2) {
                throw z(e2, e2.f729g, e2.f728f);
            } catch (AudioSink.WriteException e3) {
                throw z(e3, format, e3.f730f);
            }
        }
    }

    @Override // f.h.b.b.g2.o
    public long m() {
        if (this.f4252j == 2) {
            z0();
        }
        return this.Q0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void n0() {
        try {
            this.M0.i();
        } catch (AudioSink.WriteException e2) {
            throw z(e2, e2.f731g, e2.f730f);
        }
    }

    @Override // f.h.b.b.g0, f.h.b.b.g1.b
    public void r(int i2, Object obj) {
        if (i2 == 2) {
            this.M0.p(((Float) obj).floatValue());
        } else if (i2 == 3) {
            this.M0.n((n) obj);
        } else if (i2 != 5) {
            switch (i2) {
                case 101:
                    this.M0.w(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.M0.k(((Integer) obj).intValue());
                    return;
                case 103:
                    this.U0 = (j1.a) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.M0.x((t) obj);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean t0(Format format) {
        return this.M0.a(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int u0(f.h.b.b.z1.t tVar, Format format) {
        if (f.h.b.b.g2.p.h(format.q)) {
            int i2 = f.h.b.b.g2.b0.a >= 21 ? 32 : 0;
            boolean z = format.J != null;
            boolean v0 = MediaCodecRenderer.v0(format);
            if (v0 && this.M0.a(format) && (!z || MediaCodecUtil.d("audio/raw", false, false) != null)) {
                return i2 | 12;
            }
            if (!"audio/raw".equals(format.q) || this.M0.a(format)) {
                AudioSink audioSink = this.M0;
                int i3 = format.D;
                int i4 = format.E;
                Format.b bVar = new Format.b();
                bVar.f722k = "audio/raw";
                bVar.x = i3;
                bVar.y = i4;
                bVar.z = 2;
                if (audioSink.a(bVar.a())) {
                    List<f.h.b.b.z1.s> X = X(tVar, format, false);
                    if (X.isEmpty()) {
                        return 1;
                    }
                    if (v0) {
                        f.h.b.b.z1.s sVar = X.get(0);
                        boolean e2 = sVar.e(format);
                        return ((e2 && sVar.f(format)) ? 16 : 8) | (e2 ? 4 : 3) | i2;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override // f.h.b.b.g0, f.h.b.b.j1
    public f.h.b.b.g2.o w() {
        return this;
    }

    public final int y0(f.h.b.b.z1.s sVar, Format format) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(sVar.a) || (i2 = f.h.b.b.g2.b0.a) >= 24 || (i2 == 23 && f.h.b.b.g2.b0.A(this.K0))) {
            return format.r;
        }
        return -1;
    }

    public final void z0() {
        long l2 = this.M0.l(b());
        if (l2 != Long.MIN_VALUE) {
            if (!this.S0) {
                l2 = Math.max(this.Q0, l2);
            }
            this.Q0 = l2;
            this.S0 = false;
        }
    }
}

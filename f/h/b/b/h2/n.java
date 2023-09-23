package f.h.b.b.h2;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import f.h.b.b.g2.b0;
import f.h.b.b.h2.t;
import f.h.b.b.h2.w;
import f.h.b.b.l1;
import f.h.b.b.s0;
import f.h.b.b.z1.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes.dex */
public class n extends MediaCodecRenderer {
    public static final int[] w1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean x1;
    public static boolean y1;
    public final Context K0;
    public final t L0;
    public final w.a M0;
    public final long N0;
    public final int O0;
    public final boolean P0;
    public a Q0;
    public boolean R0;
    public boolean S0;
    public Surface T0;
    public Surface U0;
    public boolean V0;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public long a1;
    public long b1;
    public long c1;
    public int d1;
    public int e1;
    public int f1;
    public long g1;
    public long h1;
    public long i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public float n1;
    public int o1;
    public int p1;
    public int q1;
    public float r1;
    public boolean s1;
    public int t1;
    public b u1;
    public s v1;

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i2, int i3, int i4) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public final class b implements r.b, Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        public final Handler f4356f;

        public b(f.h.b.b.z1.r rVar) {
            int i2 = b0.a;
            Looper myLooper = Looper.myLooper();
            f.h.b.b.e2.j.i(myLooper);
            Handler handler = new Handler(myLooper, this);
            this.f4356f = handler;
            rVar.h(this, handler);
        }

        public final void a(long j2) {
            n nVar = n.this;
            if (this != nVar.u1) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                nVar.A0 = true;
                return;
            }
            try {
                nVar.L0(j2);
            } catch (ExoPlaybackException e2) {
                n.this.E0 = e2;
            }
        }

        public void b(f.h.b.b.z1.r rVar, long j2, long j3) {
            if (b0.a < 30) {
                this.f4356f.sendMessageAtFrontOfQueue(Message.obtain(this.f4356f, 0, (int) (j2 >> 32), (int) j2));
                return;
            }
            a(j2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a((b0.J(message.arg1) << 32) | b0.J(message.arg2));
            return true;
        }
    }

    public n(Context context, f.h.b.b.z1.t tVar, long j2, boolean z, Handler handler, w wVar, int i2) {
        super(2, r.a.a, tVar, z, 30.0f);
        this.N0 = j2;
        this.O0 = i2;
        Context applicationContext = context.getApplicationContext();
        this.K0 = applicationContext;
        this.L0 = new t(applicationContext);
        this.M0 = new w.a(handler, wVar);
        this.P0 = "NVIDIA".equals(b0.c);
        this.b1 = -9223372036854775807L;
        this.k1 = -1;
        this.l1 = -1;
        this.n1 = -1.0f;
        this.W0 = 1;
        this.t1 = 0;
        z0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07cf, code lost:
        if (r0.equals("NX541J") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0825, code lost:
        if (r0.equals("AFTN") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B0() {
        /*
            Method dump skipped, instructions count: 3028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.h2.n.B0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int C0(f.h.b.b.z1.s sVar, String str, int i2, int i3) {
        char c;
        int i4;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        str.hashCode();
        int i5 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
                i4 = i2 * i3;
                i5 = 2;
                break;
            case 1:
            case 5:
                i4 = i2 * i3;
                break;
            case 3:
                String str2 = b0.f4268d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(b0.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !sVar.f5142f)))) {
                    i4 = b0.f(i3, 16) * b0.f(i2, 16) * 16 * 16;
                    i5 = 2;
                    break;
                } else {
                    return -1;
                }
                break;
            default:
                return -1;
        }
        return (i4 * 3) / (i5 * 2);
    }

    public static List<f.h.b.b.z1.s> D0(f.h.b.b.z1.t tVar, Format format, boolean z, boolean z2) {
        Pair<Integer, Integer> c;
        String str = format.q;
        if (str == null) {
            return Collections.emptyList();
        }
        List<f.h.b.b.z1.s> a2 = tVar.a(str, z, z2);
        Pattern pattern = MediaCodecUtil.a;
        ArrayList arrayList = new ArrayList(a2);
        MediaCodecUtil.j(arrayList, new f.h.b.b.z1.g(format));
        if ("video/dolby-vision".equals(str) && (c = MediaCodecUtil.c(format)) != null) {
            int intValue = ((Integer) c.first).intValue();
            if (intValue == 16 || intValue == 256) {
                arrayList.addAll(tVar.a("video/hevc", z, z2));
            } else if (intValue == 512) {
                arrayList.addAll(tVar.a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int E0(f.h.b.b.z1.s sVar, Format format) {
        if (format.r != -1) {
            int size = format.s.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += format.s.get(i3).length;
            }
            return format.r + i2;
        }
        return C0(sVar, format.q, format.v, format.w);
    }

    public static boolean F0(long j2) {
        return j2 < -30000;
    }

    public boolean A0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (n.class) {
            if (!x1) {
                y1 = B0();
                x1 = true;
            }
        }
        return y1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0
    public void B() {
        z0();
        y0();
        this.V0 = false;
        t tVar = this.L0;
        if (tVar.b != null) {
            t.a aVar = tVar.f4367d;
            if (aVar != null) {
                aVar.a.unregisterDisplayListener(aVar);
            }
            t.b bVar = tVar.c;
            Objects.requireNonNull(bVar);
            bVar.f4379g.sendEmptyMessage(2);
        }
        this.u1 = null;
        try {
            super.B();
            final w.a aVar2 = this.M0;
            final f.h.b.b.v1.d dVar = this.F0;
            Objects.requireNonNull(aVar2);
            synchronized (dVar) {
            }
            Handler handler = aVar2.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f.h.b.b.h2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a aVar3 = w.a.this;
                        f.h.b.b.v1.d dVar2 = dVar;
                        Objects.requireNonNull(aVar3);
                        synchronized (dVar2) {
                        }
                        w wVar = aVar3.b;
                        int i2 = b0.a;
                        wVar.J(dVar2);
                    }
                });
            }
        } catch (Throwable th) {
            final w.a aVar3 = this.M0;
            final f.h.b.b.v1.d dVar2 = this.F0;
            Objects.requireNonNull(aVar3);
            synchronized (dVar2) {
                Handler handler2 = aVar3.a;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: f.h.b.b.h2.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.a aVar32 = w.a.this;
                            f.h.b.b.v1.d dVar22 = dVar2;
                            Objects.requireNonNull(aVar32);
                            synchronized (dVar22) {
                            }
                            w wVar = aVar32.b;
                            int i2 = b0.a;
                            wVar.J(dVar22);
                        }
                    });
                }
                throw th;
            }
        }
    }

    @Override // f.h.b.b.g0
    public void C(boolean z, boolean z2) {
        this.F0 = new f.h.b.b.v1.d();
        l1 l1Var = this.f4250h;
        Objects.requireNonNull(l1Var);
        boolean z3 = l1Var.a;
        f.h.b.b.e2.j.g((z3 && this.t1 == 0) ? false : true);
        if (this.s1 != z3) {
            this.s1 = z3;
            m0();
        }
        final w.a aVar = this.M0;
        final f.h.b.b.v1.d dVar = this.F0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.h2.c
                @Override // java.lang.Runnable
                public final void run() {
                    w.a aVar2 = w.a.this;
                    f.h.b.b.v1.d dVar2 = dVar;
                    w wVar = aVar2.b;
                    int i2 = b0.a;
                    wVar.D(dVar2);
                }
            });
        }
        t tVar = this.L0;
        if (tVar.b != null) {
            t.b bVar = tVar.c;
            Objects.requireNonNull(bVar);
            bVar.f4379g.sendEmptyMessage(1);
            t.a aVar2 = tVar.f4367d;
            if (aVar2 != null) {
                aVar2.a.registerDisplayListener(aVar2, b0.j());
            }
            tVar.d();
        }
        this.Y0 = z2;
        this.Z0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0
    public void D(long j2, boolean z) {
        super.D(j2, z);
        y0();
        this.L0.b();
        this.g1 = -9223372036854775807L;
        this.a1 = -9223372036854775807L;
        this.e1 = 0;
        if (z) {
            O0();
        } else {
            this.b1 = -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0
    public void E() {
        try {
            N();
            m0();
            this.H = null;
        } finally {
            Surface surface = this.U0;
            if (surface != null) {
                if (this.T0 == surface) {
                    this.T0 = null;
                }
                surface.release();
                this.U0 = null;
            }
        }
    }

    @Override // f.h.b.b.g0
    public void F() {
        this.d1 = 0;
        this.c1 = SystemClock.elapsedRealtime();
        this.h1 = SystemClock.elapsedRealtime() * 1000;
        this.i1 = 0L;
        this.j1 = 0;
        t tVar = this.L0;
        tVar.f4368e = true;
        tVar.b();
        tVar.f(false);
    }

    @Override // f.h.b.b.g0
    public void G() {
        this.b1 = -9223372036854775807L;
        G0();
        final int i2 = this.j1;
        if (i2 != 0) {
            final w.a aVar = this.M0;
            final long j2 = this.i1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f.h.b.b.h2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a aVar2 = w.a.this;
                        long j3 = j2;
                        int i3 = i2;
                        w wVar = aVar2.b;
                        int i4 = b0.a;
                        wVar.N(j3, i3);
                    }
                });
            }
            this.i1 = 0L;
            this.j1 = 0;
        }
        t tVar = this.L0;
        tVar.f4368e = false;
        tVar.a();
    }

    public final void G0() {
        if (this.d1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j2 = elapsedRealtime - this.c1;
            final w.a aVar = this.M0;
            final int i2 = this.d1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f.h.b.b.h2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a aVar2 = w.a.this;
                        int i3 = i2;
                        long j3 = j2;
                        w wVar = aVar2.b;
                        int i4 = b0.a;
                        wVar.v(i3, j3);
                    }
                });
            }
            this.d1 = 0;
            this.c1 = elapsedRealtime;
        }
    }

    public void H0() {
        this.Z0 = true;
        if (this.X0) {
            return;
        }
        this.X0 = true;
        w.a aVar = this.M0;
        Surface surface = this.T0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new d(aVar, surface));
        }
        this.V0 = true;
    }

    public final void I0() {
        int i2 = this.k1;
        if (i2 == -1 && this.l1 == -1) {
            return;
        }
        if (this.o1 == i2 && this.p1 == this.l1 && this.q1 == this.m1 && this.r1 == this.n1) {
            return;
        }
        this.M0.a(i2, this.l1, this.m1, this.n1);
        this.o1 = this.k1;
        this.p1 = this.l1;
        this.q1 = this.m1;
        this.r1 = this.n1;
    }

    public final void J0() {
        int i2 = this.o1;
        if (i2 == -1 && this.p1 == -1) {
            return;
        }
        this.M0.a(i2, this.p1, this.q1, this.r1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public f.h.b.b.v1.e K(f.h.b.b.z1.s sVar, Format format, Format format2) {
        f.h.b.b.v1.e c = sVar.c(format, format2);
        int i2 = c.f4627e;
        int i3 = format2.v;
        a aVar = this.Q0;
        if (i3 > aVar.a || format2.w > aVar.b) {
            i2 |= 256;
        }
        if (E0(sVar, format2) > this.Q0.c) {
            i2 |= 64;
        }
        int i4 = i2;
        return new f.h.b.b.v1.e(sVar.a, format, format2, i4 != 0 ? 0 : c.f4626d, i4);
    }

    public final void K0(long j2, long j3, Format format) {
        s sVar = this.v1;
        if (sVar != null) {
            sVar.c(j2, j3, format, this.N);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
        if (r13 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0120, code lost:
        if (r13 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0123, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0127, code lost:
        r2 = new android.graphics.Point(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0136, code lost:
        r21 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(f.h.b.b.z1.s r23, f.h.b.b.z1.r r24, com.google.android.exoplayer2.Format r25, android.media.MediaCrypto r26, float r27) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.h2.n.L(f.h.b.b.z1.s, f.h.b.b.z1.r, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):void");
    }

    public void L0(long j2) {
        x0(j2);
        I0();
        this.F0.f4619e++;
        H0();
        super.g0(j2);
        if (this.s1) {
            return;
        }
        this.f1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException M(Throwable th, f.h.b.b.z1.s sVar) {
        return new MediaCodecVideoDecoderException(th, sVar, this.T0);
    }

    public void M0(f.h.b.b.z1.r rVar, int i2) {
        I0();
        f.h.b.b.e2.j.b("releaseOutputBuffer");
        rVar.i(i2, true);
        f.h.b.b.e2.j.m();
        this.h1 = SystemClock.elapsedRealtime() * 1000;
        this.F0.f4619e++;
        this.e1 = 0;
        H0();
    }

    public void N0(f.h.b.b.z1.r rVar, int i2, long j2) {
        I0();
        f.h.b.b.e2.j.b("releaseOutputBuffer");
        rVar.e(i2, j2);
        f.h.b.b.e2.j.m();
        this.h1 = SystemClock.elapsedRealtime() * 1000;
        this.F0.f4619e++;
        this.e1 = 0;
        H0();
    }

    public final void O0() {
        this.b1 = this.N0 > 0 ? SystemClock.elapsedRealtime() + this.N0 : -9223372036854775807L;
    }

    public final boolean P0(f.h.b.b.z1.s sVar) {
        return b0.a >= 23 && !this.s1 && !A0(sVar.a) && (!sVar.f5142f || DummySurface.c(this.K0));
    }

    public void Q0(f.h.b.b.z1.r rVar, int i2) {
        f.h.b.b.e2.j.b("skipVideoBuffer");
        rVar.i(i2, false);
        f.h.b.b.e2.j.m();
        this.F0.f4620f++;
    }

    public void R0(int i2) {
        f.h.b.b.v1.d dVar = this.F0;
        dVar.f4621g += i2;
        this.d1 += i2;
        int i3 = this.e1 + i2;
        this.e1 = i3;
        dVar.f4622h = Math.max(i3, dVar.f4622h);
        int i4 = this.O0;
        if (i4 <= 0 || this.d1 < i4) {
            return;
        }
        G0();
    }

    public void S0(long j2) {
        f.h.b.b.v1.d dVar = this.F0;
        dVar.f4624j += j2;
        dVar.f4625k++;
        this.i1 += j2;
        this.j1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean V() {
        return this.s1 && b0.a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float W(float f2, Format format, Format[] formatArr) {
        float f3 = -1.0f;
        for (Format format2 : formatArr) {
            float f4 = format2.x;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<f.h.b.b.z1.s> X(f.h.b.b.z1.t tVar, Format format, boolean z) {
        return D0(tVar, format, z, this.s1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void Y(DecoderInputBuffer decoderInputBuffer) {
        if (this.S0) {
            ByteBuffer byteBuffer = decoderInputBuffer.f755k;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    f.h.b.b.z1.r rVar = this.L;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    rVar.d(bundle);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void c0(final String str, final long j2, final long j3) {
        final w.a aVar = this.M0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.h2.f
                @Override // java.lang.Runnable
                public final void run() {
                    w.a aVar2 = w.a.this;
                    String str2 = str;
                    long j4 = j2;
                    long j5 = j3;
                    w wVar = aVar2.b;
                    int i2 = b0.a;
                    wVar.i(str2, j4, j5);
                }
            });
        }
        this.R0 = A0(str);
        f.h.b.b.z1.s sVar = this.S;
        Objects.requireNonNull(sVar);
        boolean z = false;
        if (b0.a >= 29 && "video/x-vnd.on2.vp9".equals(sVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] d2 = sVar.d();
            int length = d2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (d2[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.S0 = z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void d0(final String str) {
        final w.a aVar = this.M0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.h2.b
                @Override // java.lang.Runnable
                public final void run() {
                    w.a aVar2 = w.a.this;
                    String str2 = str;
                    w wVar = aVar2.b;
                    int i2 = b0.a;
                    wVar.f(str2);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.j1
    public boolean e() {
        Surface surface;
        if (super.e() && (this.X0 || (((surface = this.U0) != null && this.T0 == surface) || this.L == null || this.s1))) {
            this.b1 = -9223372036854775807L;
            return true;
        } else if (this.b1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.b1) {
                return true;
            }
            this.b1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public f.h.b.b.v1.e e0(s0 s0Var) {
        final f.h.b.b.v1.e e0 = super.e0(s0Var);
        final w.a aVar = this.M0;
        final Format format = s0Var.b;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: f.h.b.b.h2.g
                @Override // java.lang.Runnable
                public final void run() {
                    w.a aVar2 = w.a.this;
                    Format format2 = format;
                    f.h.b.b.v1.e eVar = e0;
                    w wVar = aVar2.b;
                    int i2 = b0.a;
                    wVar.E(format2, eVar);
                }
            });
        }
        return e0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void f0(Format format, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        f.h.b.b.z1.r rVar = this.L;
        if (rVar != null) {
            rVar.j(this.W0);
        }
        if (this.s1) {
            this.k1 = format.v;
            this.l1 = format.w;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(StreamInformation.KEY_WIDTH);
            }
            this.k1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(StreamInformation.KEY_HEIGHT);
            }
            this.l1 = integer2;
        }
        float f2 = format.z;
        this.n1 = f2;
        if (b0.a >= 21) {
            int i2 = format.y;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.k1;
                this.k1 = this.l1;
                this.l1 = i3;
                this.n1 = 1.0f / f2;
            }
        } else {
            this.m1 = format.y;
        }
        t tVar = this.L0;
        tVar.f4370g = format.x;
        l lVar = tVar.a;
        lVar.a.c();
        lVar.b.c();
        lVar.c = false;
        lVar.f4349d = -9223372036854775807L;
        lVar.f4350e = 0;
        tVar.e();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void g0(long j2) {
        super.g0(j2);
        if (this.s1) {
            return;
        }
        this.f1--;
    }

    @Override // f.h.b.b.j1, f.h.b.b.k1
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void h0() {
        y0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void i0(DecoderInputBuffer decoderInputBuffer) {
        boolean z = this.s1;
        if (!z) {
            this.f1++;
        }
        if (b0.a >= 23 || !z) {
            return;
        }
        L0(decoderInputBuffer.f754j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if ((r11 == 0 ? false : r13.f4354g[(int) ((r11 - 1) % 15)]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012f, code lost:
        if ((F0(r5) && r22 > 100000) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k0(long r28, long r30, f.h.b.b.z1.r r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, com.google.android.exoplayer2.Format r41) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.h2.n.k0(long, long, f.h.b.b.z1.r, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, f.h.b.b.g0, f.h.b.b.j1
    public void n(float f2, float f3) {
        super.n(f2, f3);
        t tVar = this.L0;
        tVar.f4373j = f2;
        tVar.b();
        tVar.f(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void o0() {
        super.o0();
        this.f1 = 0;
    }

    @Override // f.h.b.b.g0, f.h.b.b.g1.b
    public void r(int i2, Object obj) {
        int intValue;
        if (i2 != 1) {
            if (i2 == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.W0 = intValue2;
                f.h.b.b.z1.r rVar = this.L;
                if (rVar != null) {
                    rVar.j(intValue2);
                    return;
                }
                return;
            } else if (i2 != 6) {
                if (i2 == 102 && this.t1 != (intValue = ((Integer) obj).intValue())) {
                    this.t1 = intValue;
                    if (this.s1) {
                        m0();
                        return;
                    }
                    return;
                }
                return;
            } else {
                this.v1 = (s) obj;
                return;
            }
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.U0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                f.h.b.b.z1.s sVar = this.S;
                if (sVar != null && P0(sVar)) {
                    surface = DummySurface.d(this.K0, sVar.f5142f);
                    this.U0 = surface;
                }
            }
        }
        if (this.T0 != surface) {
            this.T0 = surface;
            t tVar = this.L0;
            Objects.requireNonNull(tVar);
            Surface surface3 = surface instanceof DummySurface ? null : surface;
            if (tVar.f4369f != surface3) {
                tVar.a();
                tVar.f4369f = surface3;
                tVar.f(true);
            }
            this.V0 = false;
            int i3 = this.f4252j;
            f.h.b.b.z1.r rVar2 = this.L;
            if (rVar2 != null) {
                if (b0.a >= 23 && surface != null && !this.R0) {
                    rVar2.l(surface);
                } else {
                    m0();
                    a0();
                }
            }
            if (surface != null && surface != this.U0) {
                J0();
                y0();
                if (i3 == 2) {
                    O0();
                    return;
                }
                return;
            }
            z0();
            y0();
        } else if (surface == null || surface == this.U0) {
        } else {
            J0();
            if (this.V0) {
                w.a aVar = this.M0;
                Surface surface4 = this.T0;
                Handler handler = aVar.a;
                if (handler != null) {
                    handler.post(new d(aVar, surface4));
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean s0(f.h.b.b.z1.s sVar) {
        return this.T0 != null || P0(sVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int u0(f.h.b.b.z1.t tVar, Format format) {
        int i2 = 0;
        if (f.h.b.b.g2.p.j(format.q)) {
            boolean z = format.t != null;
            List<f.h.b.b.z1.s> D0 = D0(tVar, format, z, false);
            if (z && D0.isEmpty()) {
                D0 = D0(tVar, format, false, false);
            }
            if (D0.isEmpty()) {
                return 1;
            }
            if (MediaCodecRenderer.v0(format)) {
                f.h.b.b.z1.s sVar = D0.get(0);
                boolean e2 = sVar.e(format);
                int i3 = sVar.f(format) ? 16 : 8;
                if (e2) {
                    List<f.h.b.b.z1.s> D02 = D0(tVar, format, z, true);
                    if (!D02.isEmpty()) {
                        f.h.b.b.z1.s sVar2 = D02.get(0);
                        if (sVar2.e(format) && sVar2.f(format)) {
                            i2 = 32;
                        }
                    }
                }
                return (e2 ? 4 : 3) | i3 | i2;
            }
            return 2;
        }
        return 0;
    }

    public final void y0() {
        f.h.b.b.z1.r rVar;
        this.X0 = false;
        if (b0.a < 23 || !this.s1 || (rVar = this.L) == null) {
            return;
        }
        this.u1 = new b(rVar);
    }

    public final void z0() {
        this.o1 = -1;
        this.p1 = -1;
        this.r1 = -1.0f;
        this.q1 = -1;
    }
}

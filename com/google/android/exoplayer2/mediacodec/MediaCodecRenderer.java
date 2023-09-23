package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import f.a.b.a.a;
import f.h.b.b.e2.j;
import f.h.b.b.g0;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.m;
import f.h.b.b.g2.z;
import f.h.b.b.s0;
import f.h.b.b.v1.b;
import f.h.b.b.v1.d;
import f.h.b.b.x1.e;
import f.h.b.b.z1.p;
import f.h.b.b.z1.q;
import f.h.b.b.z1.r;
import f.h.b.b.z1.s;
import f.h.b.b.z1.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends g0 {
    public static final byte[] J0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final MediaCodec.BufferInfo A;
    public boolean A0;
    public final long[] B;
    public boolean B0;
    public final long[] C;
    public boolean C0;
    public final long[] D;
    public boolean D0;
    public Format E;
    public ExoPlaybackException E0;
    public Format F;
    public d F0;
    public DrmSession G;
    public long G0;
    public DrmSession H;
    public long H0;
    public long I;
    public int I0;
    public float J;
    public float K;
    public r L;
    public Format M;
    public MediaFormat N;
    public boolean O;
    public float P;
    public ArrayDeque<s> Q;
    public DecoderInitializationException R;
    public s S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public q e0;
    public long f0;
    public int g0;
    public int h0;
    public ByteBuffer i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public final r.a q;
    public int q0;
    public final t r;
    public int r0;
    public final boolean s;
    public boolean s0;
    public final float t;
    public boolean t0;
    public final DecoderInputBuffer u;
    public boolean u0;
    public final DecoderInputBuffer v;
    public long v0;
    public final DecoderInputBuffer w;
    public long w0;
    public final p x;
    public boolean x0;
    public final z<Format> y;
    public boolean y0;
    public final ArrayList<Long> z;
    public boolean z0;

    public MediaCodecRenderer(int i2, r.a aVar, t tVar, boolean z, float f2) {
        super(i2);
        this.q = aVar;
        Objects.requireNonNull(tVar);
        this.r = tVar;
        this.s = z;
        this.t = f2;
        this.u = new DecoderInputBuffer(0);
        this.v = new DecoderInputBuffer(0);
        this.w = new DecoderInputBuffer(2);
        p pVar = new p();
        this.x = pVar;
        this.y = new z<>();
        this.z = new ArrayList<>();
        this.A = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.B = new long[10];
        this.C = new long[10];
        this.D = new long[10];
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        pVar.q(0);
        pVar.f752h.order(ByteOrder.nativeOrder());
        p0();
    }

    public static boolean v0(Format format) {
        Class<? extends Object> cls = format.J;
        return cls == null || e.class.equals(cls);
    }

    @Override // f.h.b.b.g0
    public void B() {
        this.E = null;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = 0;
        if (this.H == null && this.G == null) {
            T();
        } else {
            E();
        }
    }

    @Override // f.h.b.b.g0
    public void D(long j2, boolean z) {
        int i2;
        this.x0 = false;
        this.y0 = false;
        this.A0 = false;
        if (this.l0) {
            this.x.o();
            this.w.o();
            this.m0 = false;
        } else if (T()) {
            a0();
        }
        z<Format> zVar = this.y;
        synchronized (zVar) {
            i2 = zVar.f4312d;
        }
        if (i2 > 0) {
            this.z0 = true;
        }
        this.y.b();
        int i3 = this.I0;
        if (i3 != 0) {
            this.H0 = this.C[i3 - 1];
            this.G0 = this.B[i3 - 1];
            this.I0 = 0;
        }
    }

    @Override // f.h.b.b.g0
    public abstract void E();

    @Override // f.h.b.b.g0
    public void H(Format[] formatArr, long j2, long j3) {
        if (this.H0 == -9223372036854775807L) {
            j.g(this.G0 == -9223372036854775807L);
            this.G0 = j2;
            this.H0 = j3;
            return;
        }
        int i2 = this.I0;
        long[] jArr = this.C;
        if (i2 == jArr.length) {
            long j4 = jArr[i2 - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j4);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.I0 = i2 + 1;
        }
        long[] jArr2 = this.B;
        int i3 = this.I0;
        jArr2[i3 - 1] = j2;
        this.C[i3 - 1] = j3;
        this.D[i3 - 1] = this.v0;
    }

    public final boolean J(long j2, long j3) {
        j.g(!this.y0);
        if (this.x.u()) {
            p pVar = this.x;
            if (!k0(j2, j3, null, pVar.f752h, this.h0, 0, pVar.o, pVar.f754j, pVar.l(), this.x.m(), this.F)) {
                return false;
            }
            g0(this.x.n);
            this.x.o();
        }
        if (this.x0) {
            this.y0 = true;
            return false;
        }
        if (this.m0) {
            j.g(this.x.t(this.w));
            this.m0 = false;
        }
        if (this.n0) {
            if (this.x.u()) {
                return true;
            }
            N();
            this.n0 = false;
            a0();
            if (!this.l0) {
                return false;
            }
        }
        j.g(!this.x0);
        s0 A = A();
        this.w.o();
        while (true) {
            this.w.o();
            int I = I(A, this.w, false);
            if (I == -5) {
                e0(A);
                break;
            } else if (I == -4) {
                if (this.w.m()) {
                    this.x0 = true;
                    break;
                }
                if (this.z0) {
                    Format format = this.E;
                    Objects.requireNonNull(format);
                    this.F = format;
                    f0(format, null);
                    this.z0 = false;
                }
                this.w.r();
                if (!this.x.t(this.w)) {
                    this.m0 = true;
                    break;
                }
            } else if (I != -3) {
                throw new IllegalStateException();
            }
        }
        if (this.x.u()) {
            this.x.r();
        }
        return this.x.u() || this.x0 || this.n0;
    }

    public abstract f.h.b.b.v1.e K(s sVar, Format format, Format format2);

    public abstract void L(s sVar, r rVar, Format format, MediaCrypto mediaCrypto, float f2);

    public MediaCodecDecoderException M(Throwable th, s sVar) {
        return new MediaCodecDecoderException(th, sVar);
    }

    public final void N() {
        this.n0 = false;
        this.x.o();
        this.w.o();
        this.m0 = false;
        this.l0 = false;
    }

    public final void O() {
        if (this.s0) {
            this.q0 = 1;
            this.r0 = 3;
            return;
        }
        m0();
        a0();
    }

    public final boolean P() {
        if (this.s0) {
            this.q0 = 1;
            if (!this.V && !this.X) {
                this.r0 = 2;
                return true;
            }
            this.r0 = 3;
            return false;
        }
        try {
            Objects.requireNonNull(this.H);
            throw null;
        } catch (MediaCryptoException e2) {
            throw z(e2, this.E, false);
        }
    }

    public final boolean Q(long j2, long j3) {
        boolean z;
        boolean z2;
        boolean k0;
        r rVar;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        int g2;
        boolean z3;
        if (!(this.h0 >= 0)) {
            if (this.Y && this.t0) {
                try {
                    g2 = this.L.g(this.A);
                } catch (IllegalStateException unused) {
                    j0();
                    if (this.y0) {
                        m0();
                    }
                    return false;
                }
            } else {
                g2 = this.L.g(this.A);
            }
            if (g2 < 0) {
                if (g2 == -2) {
                    this.u0 = true;
                    MediaFormat c = this.L.c();
                    if (this.T != 0 && c.getInteger(StreamInformation.KEY_WIDTH) == 32 && c.getInteger(StreamInformation.KEY_HEIGHT) == 32) {
                        this.c0 = true;
                    } else {
                        if (this.a0) {
                            c.setInteger("channel-count", 1);
                        }
                        this.N = c;
                        this.O = true;
                    }
                    return true;
                }
                if (this.d0 && (this.x0 || this.q0 == 2)) {
                    j0();
                }
                return false;
            } else if (this.c0) {
                this.c0 = false;
                this.L.i(g2, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo2 = this.A;
                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                    j0();
                    return false;
                }
                this.h0 = g2;
                ByteBuffer n = this.L.n(g2);
                this.i0 = n;
                if (n != null) {
                    n.position(this.A.offset);
                    ByteBuffer byteBuffer2 = this.i0;
                    MediaCodec.BufferInfo bufferInfo3 = this.A;
                    byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                }
                if (this.Z) {
                    MediaCodec.BufferInfo bufferInfo4 = this.A;
                    if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                        long j4 = this.v0;
                        if (j4 != -9223372036854775807L) {
                            bufferInfo4.presentationTimeUs = j4;
                        }
                    }
                }
                long j5 = this.A.presentationTimeUs;
                int size = this.z.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z3 = false;
                        break;
                    } else if (this.z.get(i3).longValue() == j5) {
                        this.z.remove(i3);
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                this.j0 = z3;
                long j6 = this.w0;
                long j7 = this.A.presentationTimeUs;
                this.k0 = j6 == j7;
                x0(j7);
            }
        }
        if (this.Y && this.t0) {
            try {
                rVar = this.L;
                byteBuffer = this.i0;
                i2 = this.h0;
                bufferInfo = this.A;
                z2 = false;
                z = true;
            } catch (IllegalStateException unused2) {
                z2 = false;
            }
            try {
                k0 = k0(j2, j3, rVar, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.j0, this.k0, this.F);
            } catch (IllegalStateException unused3) {
                j0();
                if (this.y0) {
                    m0();
                }
                return z2;
            }
        } else {
            z = true;
            z2 = false;
            r rVar2 = this.L;
            ByteBuffer byteBuffer3 = this.i0;
            int i4 = this.h0;
            MediaCodec.BufferInfo bufferInfo5 = this.A;
            k0 = k0(j2, j3, rVar2, byteBuffer3, i4, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.j0, this.k0, this.F);
        }
        if (k0) {
            g0(this.A.presentationTimeUs);
            boolean z4 = (this.A.flags & 4) != 0;
            this.h0 = -1;
            this.i0 = null;
            if (!z4) {
                return z;
            }
            j0();
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final boolean R() {
        r rVar = this.L;
        boolean z = 0;
        if (rVar == null || this.q0 == 2 || this.x0) {
            return false;
        }
        if (this.g0 < 0) {
            int f2 = rVar.f();
            this.g0 = f2;
            if (f2 < 0) {
                return false;
            }
            this.v.f752h = this.L.k(f2);
            this.v.o();
        }
        if (this.q0 == 1) {
            if (!this.d0) {
                this.t0 = true;
                this.L.m(this.g0, 0, 0, 0L, 4);
                q0();
            }
            this.q0 = 2;
            return false;
        } else if (this.b0) {
            this.b0 = false;
            ByteBuffer byteBuffer = this.v.f752h;
            byte[] bArr = J0;
            byteBuffer.put(bArr);
            this.L.m(this.g0, 0, bArr.length, 0L, 0);
            q0();
            this.s0 = true;
            return true;
        } else {
            if (this.p0 == 1) {
                for (int i2 = 0; i2 < this.M.s.size(); i2++) {
                    this.v.f752h.put(this.M.s.get(i2));
                }
                this.p0 = 2;
            }
            int position = this.v.f752h.position();
            s0 A = A();
            int I = I(A, this.v, false);
            if (i()) {
                this.w0 = this.v0;
            }
            if (I == -3) {
                return false;
            }
            if (I == -5) {
                if (this.p0 == 2) {
                    this.v.o();
                    this.p0 = 1;
                }
                e0(A);
                return true;
            } else if (this.v.m()) {
                if (this.p0 == 2) {
                    this.v.o();
                    this.p0 = 1;
                }
                this.x0 = true;
                if (!this.s0) {
                    j0();
                    return false;
                }
                try {
                    if (!this.d0) {
                        this.t0 = true;
                        this.L.m(this.g0, 0, 0, 0L, 4);
                        q0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw z(e2, this.E, false);
                }
            } else if (!this.s0 && !this.v.n()) {
                this.v.o();
                if (this.p0 == 2) {
                    this.p0 = 1;
                }
                return true;
            } else {
                boolean s = this.v.s();
                if (s) {
                    b bVar = this.v.f751g;
                    Objects.requireNonNull(bVar);
                    if (position != 0) {
                        if (bVar.f4611d == null) {
                            int[] iArr = new int[1];
                            bVar.f4611d = iArr;
                            bVar.f4616i.numBytesOfClearData = iArr;
                        }
                        int[] iArr2 = bVar.f4611d;
                        iArr2[0] = iArr2[0] + position;
                    }
                }
                if (this.U && !s) {
                    ByteBuffer byteBuffer2 = this.v.f752h;
                    byte[] bArr2 = f.h.b.b.g2.r.a;
                    int position2 = byteBuffer2.position();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i5 < position2) {
                            int i6 = byteBuffer2.get(i3) & 255;
                            if (i4 == 3) {
                                if (i6 == 1 && (byteBuffer2.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                            } else if (i6 == 0) {
                                i4++;
                            }
                            if (i6 != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        } else {
                            byteBuffer2.clear();
                            break;
                        }
                    }
                    if (this.v.f752h.position() == 0) {
                        return true;
                    }
                    this.U = false;
                }
                DecoderInputBuffer decoderInputBuffer = this.v;
                long j2 = decoderInputBuffer.f754j;
                q qVar = this.e0;
                if (qVar != null) {
                    Format format = this.E;
                    if (!qVar.c) {
                        ByteBuffer byteBuffer3 = decoderInputBuffer.f752h;
                        Objects.requireNonNull(byteBuffer3);
                        int i7 = 0;
                        for (int i8 = 0; i8 < 4; i8++) {
                            i7 = (i7 << 8) | (byteBuffer3.get(i8) & 255);
                        }
                        int d2 = f.h.b.b.u1.z.d(i7);
                        if (d2 == -1) {
                            qVar.c = true;
                            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                            j2 = decoderInputBuffer.f754j;
                        } else {
                            long j3 = qVar.a;
                            if (j3 == 0) {
                                long j4 = decoderInputBuffer.f754j;
                                qVar.b = j4;
                                qVar.a = d2 - 529;
                                j2 = j4;
                            } else {
                                qVar.a = j3 + d2;
                                j2 = qVar.b + ((1000000 * j3) / format.E);
                            }
                        }
                    }
                }
                long j5 = j2;
                if (this.v.l()) {
                    this.z.add(Long.valueOf(j5));
                }
                if (this.z0) {
                    this.y.a(j5, this.E);
                    this.z0 = false;
                }
                if (this.e0 != null) {
                    this.v0 = Math.max(this.v0, this.v.f754j);
                } else {
                    this.v0 = Math.max(this.v0, j5);
                }
                this.v.r();
                if (this.v.k()) {
                    Y(this.v);
                }
                i0(this.v);
                try {
                    if (s) {
                        this.L.b(this.g0, 0, this.v.f751g, j5, 0);
                    } else {
                        this.L.m(this.g0, 0, this.v.f752h.limit(), j5, 0);
                    }
                    q0();
                    this.s0 = true;
                    this.p0 = 0;
                    d dVar = this.F0;
                    z = dVar.c + 1;
                    dVar.c = z;
                    return true;
                } catch (MediaCodec.CryptoException e3) {
                    throw z(e3, this.E, z);
                }
            }
        }
    }

    public final void S() {
        try {
            this.L.flush();
        } finally {
            o0();
        }
    }

    public boolean T() {
        if (this.L == null) {
            return false;
        }
        if (this.r0 != 3 && !this.V && ((!this.W || this.u0) && (!this.X || !this.t0))) {
            S();
            return false;
        }
        m0();
        return true;
    }

    public final List<s> U(boolean z) {
        List<s> X = X(this.r, this.E, z);
        if (X.isEmpty() && z) {
            X = X(this.r, this.E, false);
            if (!X.isEmpty()) {
                String str = this.E.q;
                String valueOf = String.valueOf(X);
                StringBuilder z2 = a.z(valueOf.length() + a.x(str, 99), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", valueOf);
                z2.append(".");
                Log.w("MediaCodecRenderer", z2.toString());
            }
        }
        return X;
    }

    public boolean V() {
        return false;
    }

    public abstract float W(float f2, Format format, Format[] formatArr);

    public abstract List<s> X(t tVar, Format format, boolean z);

    public void Y(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a3, code lost:
        if ("stvm8".equals(r2) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b3, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r8) == false) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(f.h.b.b.z1.s r22, android.media.MediaCrypto r23) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Z(f.h.b.b.z1.s, android.media.MediaCrypto):void");
    }

    @Override // f.h.b.b.k1
    public final int a(Format format) {
        try {
            return u0(this.r, format);
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            throw y(e2, format);
        }
    }

    public final void a0() {
        Format format;
        if (this.L != null || this.l0 || (format = this.E) == null) {
            return;
        }
        if (this.H == null && t0(format)) {
            Format format2 = this.E;
            N();
            String str = format2.q;
            if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                p pVar = this.x;
                Objects.requireNonNull(pVar);
                j.c(true);
                pVar.p = 1;
            } else {
                p pVar2 = this.x;
                Objects.requireNonNull(pVar2);
                j.c(true);
                pVar2.p = 32;
            }
            this.l0 = true;
            return;
        }
        DrmSession drmSession = this.H;
        this.G = drmSession;
        String str2 = this.E.q;
        if (drmSession != null) {
            if (((f.h.b.b.x1.d) drmSession).a == null) {
                return;
            }
            if (e.a) {
                Objects.requireNonNull(drmSession);
                throw y(((f.h.b.b.x1.d) this.G).a, this.E);
            }
        }
        try {
            b0(null, false);
        } catch (DecoderInitializationException e2) {
            throw z(e2, this.E, false);
        }
    }

    @Override // f.h.b.b.j1
    public boolean b() {
        return this.y0;
    }

    public final void b0(MediaCrypto mediaCrypto, boolean z) {
        if (this.Q == null) {
            try {
                List<s> U = U(z);
                ArrayDeque<s> arrayDeque = new ArrayDeque<>();
                this.Q = arrayDeque;
                if (this.s) {
                    arrayDeque.addAll(U);
                } else if (!U.isEmpty()) {
                    this.Q.add(U.get(0));
                }
                this.R = null;
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                throw new DecoderInitializationException(this.E, e2, z, -49998);
            }
        }
        if (!this.Q.isEmpty()) {
            while (this.L == null) {
                s peekFirst = this.Q.peekFirst();
                if (!s0(peekFirst)) {
                    return;
                }
                try {
                    Z(peekFirst, mediaCrypto);
                } catch (Exception e3) {
                    String valueOf = String.valueOf(peekFirst);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                    sb.append("Failed to initialize decoder: ");
                    sb.append(valueOf);
                    m.c("MediaCodecRenderer", sb.toString(), e3);
                    this.Q.removeFirst();
                    Format format = this.E;
                    String str = peekFirst.a;
                    String valueOf2 = String.valueOf(format);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + String.valueOf(str).length() + 23);
                    sb2.append("Decoder init failed: ");
                    sb2.append(str);
                    sb2.append(", ");
                    sb2.append(valueOf2);
                    DecoderInitializationException decoderInitializationException = new DecoderInitializationException(sb2.toString(), e3, format.q, z, peekFirst, (b0.a < 21 || !(e3 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e3).getDiagnosticInfo(), null);
                    DecoderInitializationException decoderInitializationException2 = this.R;
                    if (decoderInitializationException2 == null) {
                        this.R = decoderInitializationException;
                    } else {
                        this.R = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f766f, decoderInitializationException2.f767g, decoderInitializationException2.f768h, decoderInitializationException2.f769i, decoderInitializationException);
                    }
                    if (this.Q.isEmpty()) {
                        throw this.R;
                    }
                }
            }
            this.Q = null;
            return;
        }
        throw new DecoderInitializationException(this.E, null, z, -49999);
    }

    public abstract void c0(String str, long j2, long j3);

    public abstract void d0(String str);

    @Override // f.h.b.b.j1
    public boolean e() {
        boolean e2;
        if (this.E != null) {
            if (i()) {
                e2 = this.o;
            } else {
                f.h.b.b.b2.g0 g0Var = this.f4253k;
                Objects.requireNonNull(g0Var);
                e2 = g0Var.e();
            }
            if (!e2) {
                if (!(this.h0 >= 0) && (this.f0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f0)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (P() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
        if (P() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00db, code lost:
        if (P() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f3, code lost:
        if (r0 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f.h.b.b.v1.e e0(f.h.b.b.s0 r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.e0(f.h.b.b.s0):f.h.b.b.v1.e");
    }

    public abstract void f0(Format format, MediaFormat mediaFormat);

    public void g0(long j2) {
        while (true) {
            int i2 = this.I0;
            if (i2 == 0 || j2 < this.D[0]) {
                return;
            }
            long[] jArr = this.B;
            this.G0 = jArr[0];
            this.H0 = this.C[0];
            int i3 = i2 - 1;
            this.I0 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.C;
            System.arraycopy(jArr2, 1, jArr2, 0, this.I0);
            long[] jArr3 = this.D;
            System.arraycopy(jArr3, 1, jArr3, 0, this.I0);
            h0();
        }
    }

    public abstract void h0();

    public abstract void i0(DecoderInputBuffer decoderInputBuffer);

    public final void j0() {
        int i2 = this.r0;
        if (i2 == 1) {
            S();
        } else if (i2 == 2) {
            S();
            try {
                Objects.requireNonNull(this.H);
                throw null;
            } catch (MediaCryptoException e2) {
                throw z(e2, this.E, false);
            }
        } else if (i2 != 3) {
            this.y0 = true;
            n0();
        } else {
            m0();
            a0();
        }
    }

    public abstract boolean k0(long j2, long j3, r rVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format);

    public final boolean l0(boolean z) {
        s0 A = A();
        this.u.o();
        int I = I(A, this.u, z);
        if (I == -5) {
            e0(A);
            return true;
        } else if (I == -4 && this.u.m()) {
            this.x0 = true;
            j0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.drm.DrmSession, f.h.b.b.z1.r] */
    public void m0() {
        try {
            r rVar = this.L;
            if (rVar != null) {
                rVar.release();
                this.F0.b++;
                d0(this.S.a);
            }
        } finally {
            this.L = null;
            this.G = null;
            p0();
        }
    }

    @Override // f.h.b.b.g0, f.h.b.b.j1
    public void n(float f2, float f3) {
        this.J = f2;
        this.K = f3;
        if (this.L == null || this.r0 == 3 || this.f4252j == 0) {
            return;
        }
        w0(this.M);
    }

    public void n0() {
    }

    public void o0() {
        q0();
        this.h0 = -1;
        this.i0 = null;
        this.f0 = -9223372036854775807L;
        this.t0 = false;
        this.s0 = false;
        this.b0 = false;
        this.c0 = false;
        this.j0 = false;
        this.k0 = false;
        this.z.clear();
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        q qVar = this.e0;
        if (qVar != null) {
            qVar.a = 0L;
            qVar.b = 0L;
            qVar.c = false;
        }
        this.q0 = 0;
        this.r0 = 0;
        this.p0 = this.o0 ? 1 : 0;
    }

    @Override // f.h.b.b.g0, f.h.b.b.k1
    public final int p() {
        return 8;
    }

    public void p0() {
        o0();
        this.E0 = null;
        this.e0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.u0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.d0 = false;
        this.o0 = false;
        this.p0 = 0;
    }

    @Override // f.h.b.b.j1
    public void q(long j2, long j3) {
        boolean z = false;
        if (this.A0) {
            this.A0 = false;
            j0();
        }
        ExoPlaybackException exoPlaybackException = this.E0;
        if (exoPlaybackException == null) {
            boolean z2 = true;
            try {
                if (this.y0) {
                    n0();
                    return;
                } else if (this.E != null || l0(true)) {
                    a0();
                    if (this.l0) {
                        j.b("bypassRender");
                        while (J(j2, j3)) {
                        }
                        j.m();
                    } else if (this.L != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        j.b("drainAndFeed");
                        while (Q(j2, j3) && r0(elapsedRealtime)) {
                        }
                        while (R() && r0(elapsedRealtime)) {
                        }
                        j.m();
                    } else {
                        d dVar = this.F0;
                        int i2 = dVar.f4618d;
                        f.h.b.b.b2.g0 g0Var = this.f4253k;
                        Objects.requireNonNull(g0Var);
                        dVar.f4618d = i2 + g0Var.c(j2 - this.f4255m);
                        l0(false);
                    }
                    synchronized (this.F0) {
                    }
                    return;
                } else {
                    return;
                }
            } catch (IllegalStateException e2) {
                if (b0.a < 21 || !(e2 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e2.getStackTrace();
                    if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        z = true;
                    }
                    z2 = z;
                }
                if (z2) {
                    throw y(M(e2, this.S), this.E);
                }
                throw e2;
            }
        }
        this.E0 = null;
        throw exoPlaybackException;
    }

    public final void q0() {
        this.g0 = -1;
        this.v.f752h = null;
    }

    public final boolean r0(long j2) {
        return this.I == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.I;
    }

    public boolean s0(s sVar) {
        return true;
    }

    public boolean t0(Format format) {
        return false;
    }

    public abstract int u0(t tVar, Format format);

    public final boolean w0(Format format) {
        if (b0.a < 23) {
            return true;
        }
        float f2 = this.K;
        Format[] formatArr = this.f4254l;
        Objects.requireNonNull(formatArr);
        float W = W(f2, format, formatArr);
        float f3 = this.P;
        if (f3 == W) {
            return true;
        }
        if (W == -1.0f) {
            O();
            return false;
        } else if (f3 != -1.0f || W > this.t) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", W);
            this.L.d(bundle);
            this.P = W;
            return true;
        } else {
            return true;
        }
    }

    public final void x0(long j2) {
        boolean z;
        Format f2;
        Format e2 = this.y.e(j2);
        if (e2 == null && this.O) {
            z<Format> zVar = this.y;
            synchronized (zVar) {
                f2 = zVar.f4312d == 0 ? null : zVar.f();
            }
            e2 = f2;
        }
        if (e2 != null) {
            this.F = e2;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.O && this.F != null)) {
            f0(this.F, this.N);
            this.O = false;
        }
    }

    /* loaded from: classes.dex */
    public static class DecoderInitializationException extends Exception {

        /* renamed from: f  reason: collision with root package name */
        public final String f766f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f767g;

        /* renamed from: h  reason: collision with root package name */
        public final s f768h;

        /* renamed from: i  reason: collision with root package name */
        public final String f769i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.q
                if (r15 >= 0) goto L2a
                java.lang.String r12 = "neg_"
                goto L2c
            L2a:
                java.lang.String r12 = ""
            L2c:
                int r15 = java.lang.Math.abs(r15)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r9 = r1.toString()
                r10 = 0
                r8 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, java.lang.Throwable, boolean, int):void");
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, s sVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.f766f = str2;
            this.f767g = z;
            this.f768h = sVar;
            this.f769i = str3;
        }
    }
}

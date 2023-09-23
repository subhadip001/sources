package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import f.h.b.b.c1;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.m;
import f.h.b.b.g2.p;
import f.h.b.b.j1;
import f.h.b.b.u1.a0;
import f.h.b.b.u1.c0;
import f.h.b.b.u1.d0;
import f.h.b.b.u1.e0;
import f.h.b.b.u1.n;
import f.h.b.b.u1.o;
import f.h.b.b.u1.q;
import f.h.b.b.u1.r;
import f.h.b.b.u1.s;
import f.h.b.b.u1.t;
import f.h.b.b.u1.v;
import f.h.b.b.u1.x;
import f.h.b.b.u1.y;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public AudioProcessor[] I;
    public ByteBuffer[] J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public t V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;
    public final o a;
    public final b b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final v f732d;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f733e;

    /* renamed from: f  reason: collision with root package name */
    public final AudioProcessor[] f734f;

    /* renamed from: g  reason: collision with root package name */
    public final AudioProcessor[] f735g;

    /* renamed from: h  reason: collision with root package name */
    public final ConditionVariable f736h;

    /* renamed from: i  reason: collision with root package name */
    public final s f737i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<e> f738j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f739k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f740l;

    /* renamed from: m  reason: collision with root package name */
    public h f741m;
    public final f<AudioSink.InitializationException> n;
    public final f<AudioSink.WriteException> o;
    public AudioSink.a p;
    public c q;
    public c r;
    public AudioTrack s;
    public n t;
    public e u;
    public e v;
    public c1 w;
    public ByteBuffer x;
    public int y;
    public long z;

    /* loaded from: classes.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ AudioTrack f742f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f742f = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f742f.flush();
                this.f742f.release();
            } finally {
                DefaultAudioSink.this.f736h.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c1 a(c1 c1Var);

        long b(long j2);

        long c();

        boolean d(boolean z);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final Format a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f744d;

        /* renamed from: e  reason: collision with root package name */
        public final int f745e;

        /* renamed from: f  reason: collision with root package name */
        public final int f746f;

        /* renamed from: g  reason: collision with root package name */
        public final int f747g;

        /* renamed from: h  reason: collision with root package name */
        public final int f748h;

        /* renamed from: i  reason: collision with root package name */
        public final AudioProcessor[] f749i;

        public c(Format format, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, AudioProcessor[] audioProcessorArr) {
            int round;
            this.a = format;
            this.b = i2;
            this.c = i3;
            this.f744d = i4;
            this.f745e = i5;
            this.f746f = i6;
            this.f747g = i7;
            this.f749i = audioProcessorArr;
            if (i8 != 0) {
                round = i8;
            } else {
                if (i3 == 0) {
                    float f2 = z ? 8.0f : 1.0f;
                    int minBufferSize = AudioTrack.getMinBufferSize(i5, i6, i7);
                    j.g(minBufferSize != -2);
                    long j2 = i5;
                    int h2 = b0.h(minBufferSize * 4, ((int) ((250000 * j2) / 1000000)) * i4, Math.max(minBufferSize, ((int) ((j2 * 750000) / 1000000)) * i4));
                    round = f2 != 1.0f ? Math.round(h2 * f2) : h2;
                } else if (i3 == 1) {
                    round = e(50000000L);
                } else if (i3 == 2) {
                    round = e(250000L);
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f748h = round;
        }

        public static AudioAttributes d(n nVar, boolean z) {
            if (z) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return nVar.a();
        }

        public AudioTrack a(boolean z, n nVar, int i2) {
            try {
                AudioTrack b = b(z, nVar, i2);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f745e, this.f746f, this.f748h, this.a, f(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new AudioSink.InitializationException(0, this.f745e, this.f746f, this.f748h, this.a, f(), e2);
            }
        }

        public final AudioTrack b(boolean z, n nVar, int i2) {
            int i3 = b0.a;
            if (i3 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(d(nVar, z)).setAudioFormat(DefaultAudioSink.z(this.f745e, this.f746f, this.f747g)).setTransferMode(1).setBufferSizeInBytes(this.f748h).setSessionId(i2).setOffloadedPlayback(this.c == 1).build();
            } else if (i3 >= 21) {
                return new AudioTrack(d(nVar, z), DefaultAudioSink.z(this.f745e, this.f746f, this.f747g), this.f748h, 1, i2);
            } else {
                int s = b0.s(nVar.c);
                if (i2 == 0) {
                    return new AudioTrack(s, this.f745e, this.f746f, this.f747g, this.f748h, 1);
                }
                return new AudioTrack(s, this.f745e, this.f746f, this.f747g, this.f748h, 1, i2);
            }
        }

        public long c(long j2) {
            return (j2 * 1000000) / this.f745e;
        }

        public final int e(long j2) {
            int i2;
            int i3 = this.f747g;
            switch (i3) {
                case 5:
                    i2 = 80000;
                    break;
                case 6:
                case 18:
                    i2 = 768000;
                    break;
                case 7:
                    i2 = 192000;
                    break;
                case 8:
                    i2 = 2250000;
                    break;
                case 9:
                    i2 = 40000;
                    break;
                case 10:
                    i2 = 100000;
                    break;
                case 11:
                    i2 = 16000;
                    break;
                case 12:
                    i2 = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i2 = 3062500;
                    break;
                case 15:
                    i2 = 8000;
                    break;
                case 16:
                    i2 = 256000;
                    break;
                case 17:
                    i2 = 336000;
                    break;
            }
            if (i3 == 5) {
                i2 *= 2;
            }
            return (int) ((j2 * i2) / 1000000);
        }

        public boolean f() {
            return this.c == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {
        public final AudioProcessor[] a;
        public final f.h.b.b.u1.b0 b;
        public final d0 c;

        public d(AudioProcessor... audioProcessorArr) {
            f.h.b.b.u1.b0 b0Var = new f.h.b.b.u1.b0();
            d0 d0Var = new d0();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.b = b0Var;
            this.c = d0Var;
            audioProcessorArr2[audioProcessorArr.length] = b0Var;
            audioProcessorArr2[audioProcessorArr.length + 1] = d0Var;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public c1 a(c1 c1Var) {
            d0 d0Var = this.c;
            float f2 = c1Var.a;
            if (d0Var.c != f2) {
                d0Var.c = f2;
                d0Var.f4547i = true;
            }
            float f3 = c1Var.b;
            if (d0Var.f4542d != f3) {
                d0Var.f4542d = f3;
                d0Var.f4547i = true;
            }
            return c1Var;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long b(long j2) {
            d0 d0Var = this.c;
            if (d0Var.o >= 1024) {
                long j3 = d0Var.n;
                c0 c0Var = d0Var.f4548j;
                Objects.requireNonNull(c0Var);
                long j4 = j3 - ((c0Var.f4536k * c0Var.b) * 2);
                int i2 = d0Var.f4546h.a;
                int i3 = d0Var.f4545g.a;
                if (i2 == i3) {
                    return b0.E(j2, j4, d0Var.o);
                }
                return b0.E(j2, j4 * i2, d0Var.o * i3);
            }
            return (long) (d0Var.c * j2);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long c() {
            return this.b.t;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public boolean d(boolean z) {
            this.b.f4526m = z;
            return z;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final c1 a;
        public final boolean b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final long f750d;

        public e(c1 c1Var, boolean z, long j2, long j3, a aVar) {
            this.a = c1Var;
            this.b = z;
            this.c = j2;
            this.f750d = j3;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T extends Exception> {
        public T a;
        public long b;

        public f(long j2) {
        }

        public void a(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
                this.b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.b) {
                T t2 = this.a;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.a;
                this.a = null;
                throw t3;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class g implements s.a {
        public g(a aVar) {
        }

        @Override // f.h.b.b.u1.s.a
        public void a(final long j2) {
            final q.a aVar;
            Handler handler;
            AudioSink.a aVar2 = DefaultAudioSink.this.p;
            if (aVar2 == null || (handler = (aVar = y.this.L0).a) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: f.h.b.b.u1.g
                @Override // java.lang.Runnable
                public final void run() {
                    q.a aVar3 = q.a.this;
                    long j3 = j2;
                    q qVar = aVar3.b;
                    int i2 = f.h.b.b.g2.b0.a;
                    qVar.F(j3);
                }
            });
        }

        @Override // f.h.b.b.u1.s.a
        public void b(final int i2, final long j2) {
            if (DefaultAudioSink.this.p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                final long j3 = elapsedRealtime - defaultAudioSink.X;
                final q.a aVar = y.this.L0;
                Handler handler = aVar.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: f.h.b.b.u1.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            q.a aVar2 = q.a.this;
                            int i3 = i2;
                            long j4 = j2;
                            long j5 = j3;
                            q qVar = aVar2.b;
                            int i4 = f.h.b.b.g2.b0.a;
                            qVar.L(i3, j4, j5);
                        }
                    });
                }
            }
        }

        @Override // f.h.b.b.u1.s.a
        public void c(long j2) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j2);
            Log.w("DefaultAudioSink", sb.toString());
        }

        @Override // f.h.b.b.u1.s.a
        public void d(long j2, long j3, long j4, long j5) {
            long j6;
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            c cVar = defaultAudioSink.r;
            if (cVar.c == 0) {
                j6 = defaultAudioSink.z / cVar.b;
            } else {
                j6 = defaultAudioSink.A;
            }
            long E = defaultAudioSink.E();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            f.a.b.a.a.Q(sb, ", ", j4, ", ");
            sb.append(j5);
            f.a.b.a.a.Q(sb, ", ", j6, ", ");
            sb.append(E);
            Log.w("DefaultAudioSink", sb.toString());
        }

        @Override // f.h.b.b.u1.s.a
        public void e(long j2, long j3, long j4, long j5) {
            long j6;
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            c cVar = defaultAudioSink.r;
            if (cVar.c == 0) {
                j6 = defaultAudioSink.z / cVar.b;
            } else {
                j6 = defaultAudioSink.A;
            }
            long E = defaultAudioSink.E();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            f.a.b.a.a.Q(sb, ", ", j4, ", ");
            sb.append(j5);
            f.a.b.a.a.Q(sb, ", ", j6, ", ");
            sb.append(E);
            Log.w("DefaultAudioSink", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public final class h {
        public final Handler a = new Handler();
        public final AudioTrack.StreamEventCallback b;

        /* loaded from: classes.dex */
        public class a extends AudioTrack.StreamEventCallback {
            public a(DefaultAudioSink defaultAudioSink) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i2) {
                j1.a aVar;
                j.g(audioTrack == DefaultAudioSink.this.s);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.a aVar2 = defaultAudioSink.p;
                if (aVar2 == null || !defaultAudioSink.S || (aVar = y.this.U0) == null) {
                    return;
                }
                aVar.a();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                j1.a aVar;
                j.g(audioTrack == DefaultAudioSink.this.s);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.a aVar2 = defaultAudioSink.p;
                if (aVar2 == null || !defaultAudioSink.S || (aVar = y.this.U0) == null) {
                    return;
                }
                aVar.a();
            }
        }

        public h() {
            this.b = new a(DefaultAudioSink.this);
        }
    }

    public DefaultAudioSink(o oVar, b bVar, boolean z, boolean z2, boolean z3) {
        this.a = oVar;
        this.b = bVar;
        int i2 = b0.a;
        this.c = i2 >= 21 && z;
        this.f739k = i2 >= 23 && z2;
        this.f740l = i2 >= 29 && z3;
        this.f736h = new ConditionVariable(true);
        this.f737i = new s(new g(null));
        v vVar = new v();
        this.f732d = vVar;
        e0 e0Var = new e0();
        this.f733e = e0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new a0(), vVar, e0Var);
        Collections.addAll(arrayList, ((d) bVar).a);
        this.f734f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f735g = new AudioProcessor[]{new x()};
        this.H = 1.0f;
        this.t = n.f4575f;
        this.U = 0;
        this.V = new t(0, 0.0f);
        c1 c1Var = c1.f3917d;
        this.v = new e(c1Var, false, 0L, 0L, null);
        this.w = c1Var;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.f738j = new ArrayDeque<>();
        this.n = new f<>(100L);
        this.o = new f<>(100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> B(com.google.android.exoplayer2.Format r13, f.h.b.b.u1.o r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.B(com.google.android.exoplayer2.Format, f.h.b.b.u1.o):android.util.Pair");
    }

    public static boolean H(AudioTrack audioTrack) {
        return b0.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean I(Format format, n nVar) {
        int m2;
        int i2 = b0.a;
        if (i2 < 29) {
            return false;
        }
        String str = format.q;
        Objects.requireNonNull(str);
        int b2 = p.b(str, format.n);
        if (b2 == 0 || (m2 = b0.m(format.D)) == 0 || !AudioManager.isOffloadedPlaybackSupported(z(format.E, m2, b2), nVar.a())) {
            return false;
        }
        if (!(format.G == 0 && format.H == 0)) {
            if (!(i2 >= 30 && b0.f4268d.startsWith("Pixel"))) {
                return false;
            }
        }
        return true;
    }

    public static AudioFormat z(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public final c1 A() {
        return C().a;
    }

    public final e C() {
        e eVar = this.u;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f738j.isEmpty()) {
            return this.f738j.getLast();
        }
        return this.v;
    }

    public boolean D() {
        return C().b;
    }

    public final long E() {
        c cVar = this.r;
        if (cVar.c == 0) {
            return this.B / cVar.f744d;
        }
        return this.C;
    }

    public final void F() {
        q.a aVar;
        Handler handler;
        this.f736h.block();
        try {
            c cVar = this.r;
            Objects.requireNonNull(cVar);
            AudioTrack a2 = cVar.a(this.W, this.t, this.U);
            this.s = a2;
            if (H(a2)) {
                AudioTrack audioTrack = this.s;
                if (this.f741m == null) {
                    this.f741m = new h();
                }
                h hVar = this.f741m;
                final Handler handler2 = hVar.a;
                Objects.requireNonNull(handler2);
                audioTrack.registerStreamEventCallback(new Executor() { // from class: f.h.b.b.u1.j
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler2.post(runnable);
                    }
                }, hVar.b);
                AudioTrack audioTrack2 = this.s;
                Format format = this.r.a;
                audioTrack2.setOffloadDelayPadding(format.G, format.H);
            }
            this.U = this.s.getAudioSessionId();
            s sVar = this.f737i;
            AudioTrack audioTrack3 = this.s;
            c cVar2 = this.r;
            sVar.e(audioTrack3, cVar2.c == 2, cVar2.f747g, cVar2.f744d, cVar2.f748h);
            O();
            int i2 = this.V.a;
            if (i2 != 0) {
                this.s.attachAuxEffect(i2);
                this.s.setAuxEffectSendLevel(this.V.b);
            }
            this.F = true;
        } catch (AudioSink.InitializationException e2) {
            if (this.r.f()) {
                this.Y = true;
            }
            AudioSink.a aVar2 = this.p;
            if (aVar2 != null && (handler = (aVar = y.this.L0).a) != null) {
                handler.post(new f.h.b.b.u1.c(aVar, e2));
            }
            throw e2;
        }
    }

    public final boolean G() {
        return this.s != null;
    }

    public final void J() {
        if (this.R) {
            return;
        }
        this.R = true;
        s sVar = this.f737i;
        long E = E();
        sVar.z = sVar.b();
        sVar.x = SystemClock.elapsedRealtime() * 1000;
        sVar.A = E;
        this.s.stop();
        this.y = 0;
    }

    public final void K(long j2) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.J[i2 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.a;
                }
            }
            if (i2 == length) {
                Q(byteBuffer, j2);
            } else {
                AudioProcessor audioProcessor = this.I[i2];
                if (i2 > this.P) {
                    audioProcessor.c(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.J[i2] = output;
                if (output.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i2--;
        }
    }

    public final void L() {
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.v = new e(A(), D(), 0L, 0L, null);
        this.G = 0L;
        this.u = null;
        this.f738j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.x = null;
        this.y = 0;
        this.f733e.o = 0L;
        y();
    }

    public final void M(c1 c1Var, boolean z) {
        e C = C();
        if (c1Var.equals(C.a) && z == C.b) {
            return;
        }
        e eVar = new e(c1Var, z, -9223372036854775807L, -9223372036854775807L, null);
        if (G()) {
            this.u = eVar;
        } else {
            this.v = eVar;
        }
    }

    public final void N(c1 c1Var) {
        if (G()) {
            try {
                this.s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c1Var.a).setPitch(c1Var.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                m.c("DefaultAudioSink", "Failed to set playback params", e2);
            }
            c1Var = new c1(this.s.getPlaybackParams().getSpeed(), this.s.getPlaybackParams().getPitch());
            s sVar = this.f737i;
            sVar.f4590j = c1Var.a;
            r rVar = sVar.f4586f;
            if (rVar != null) {
                rVar.a();
            }
        }
        this.w = c1Var;
    }

    public final void O() {
        if (G()) {
            if (b0.a >= 21) {
                this.s.setVolume(this.H);
                return;
            }
            AudioTrack audioTrack = this.s;
            float f2 = this.H;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    public final boolean P() {
        if (this.W || !"audio/raw".equals(this.r.a.q)) {
            return false;
        }
        return !(this.c && b0.x(this.r.a.F));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        if (r15 < r14) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.Q(java.nio.ByteBuffer, long):void");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(Format format) {
        return u(format) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean b() {
        return !G() || (this.Q && !j());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public c1 c() {
        if (this.f739k) {
            return this.w;
        }
        return A();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void d() {
        flush();
        for (AudioProcessor audioProcessor : this.f734f) {
            audioProcessor.d();
        }
        for (AudioProcessor audioProcessor2 : this.f735g) {
            audioProcessor2.d();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e() {
        boolean z = false;
        this.S = false;
        if (G()) {
            s sVar = this.f737i;
            sVar.f4592l = 0L;
            sVar.w = 0;
            sVar.v = 0;
            sVar.f4593m = 0L;
            sVar.C = 0L;
            sVar.F = 0L;
            sVar.f4591k = false;
            if (sVar.x == -9223372036854775807L) {
                r rVar = sVar.f4586f;
                Objects.requireNonNull(rVar);
                rVar.a();
                z = true;
            }
            if (z) {
                this.s.pause();
            }
        }
    }

    public final void f(long j2) {
        c1 c1Var;
        final q.a aVar;
        Handler handler;
        if (P()) {
            c1Var = this.b.a(A());
        } else {
            c1Var = c1.f3917d;
        }
        c1 c1Var2 = c1Var;
        final boolean d2 = P() ? this.b.d(D()) : false;
        this.f738j.add(new e(c1Var2, d2, Math.max(0L, j2), this.r.c(E()), null));
        AudioProcessor[] audioProcessorArr = this.r.f749i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        y();
        AudioSink.a aVar2 = this.p;
        if (aVar2 == null || (handler = (aVar = y.this.L0).a) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: f.h.b.b.u1.a
            @Override // java.lang.Runnable
            public final void run() {
                q.a aVar3 = q.a.this;
                boolean z = d2;
                q qVar = aVar3.b;
                int i2 = f.h.b.b.g2.b0.a;
                qVar.B(z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (G()) {
            L();
            AudioTrack audioTrack = this.f737i.c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.s.pause();
            }
            if (H(this.s)) {
                h hVar = this.f741m;
                Objects.requireNonNull(hVar);
                this.s.unregisterStreamEventCallback(hVar.b);
                hVar.a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.s;
            this.s = null;
            if (b0.a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.q;
            if (cVar != null) {
                this.r = cVar;
                this.q = null;
            }
            this.f737i.d();
            this.f736h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack2).start();
        }
        this.o.a = null;
        this.n.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.P = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.f()
        L1f:
            r9.K(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.Q(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.g():boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h(c1 c1Var) {
        c1 c1Var2 = new c1(b0.g(c1Var.a, 0.1f, 8.0f), b0.g(c1Var.b, 0.1f, 8.0f));
        if (this.f739k && b0.a >= 23) {
            N(c1Var2);
        } else {
            M(c1Var2, D());
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i() {
        if (!this.Q && G() && g()) {
            J();
            this.Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean j() {
        return G() && this.f737i.c(E());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(int i2) {
        if (this.U != i2) {
            this.U = i2;
            this.T = i2 != 0;
            flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab A[Catch: Exception -> 0x01b5, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b5, blocks: (B:86:0x0181, B:88:0x01ab), top: B:144:0x0181 }] */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long l(boolean r27) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.l(boolean):long");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void n(n nVar) {
        if (this.t.equals(nVar)) {
            return;
        }
        this.t = nVar;
        if (this.W) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void o() {
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void p(float f2) {
        if (this.H != f2) {
            this.H = f2;
            O();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void q() {
        j.g(b0.a >= 21);
        j.g(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void r() {
        this.S = true;
        if (G()) {
            r rVar = this.f737i.f4586f;
            Objects.requireNonNull(rVar);
            rVar.a();
            this.s.play();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
        if (r5.b() == 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s(java.nio.ByteBuffer r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.s(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t(AudioSink.a aVar) {
        this.p = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int u(Format format) {
        if ("audio/raw".equals(format.q)) {
            if (!b0.y(format.F)) {
                f.a.b.a.a.G(33, "Invalid PCM encoding: ", format.F, "DefaultAudioSink");
                return 0;
            }
            int i2 = format.F;
            return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
        } else if (this.f740l && !this.Y && I(format, this.t)) {
            return 2;
        } else {
            return B(format, this.a) != null ? 2 : 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void v(Format format, int i2, int[] iArr) {
        int intValue;
        int intValue2;
        AudioProcessor[] audioProcessorArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AudioProcessor[] audioProcessorArr2;
        int[] iArr2;
        int i8 = 1;
        if ("audio/raw".equals(format.q)) {
            j.c(b0.y(format.F));
            int r = b0.r(format.F, format.D);
            if (((this.c && b0.x(format.F)) ? 0 : 0) != 0) {
                audioProcessorArr2 = this.f735g;
            } else {
                audioProcessorArr2 = this.f734f;
            }
            e0 e0Var = this.f733e;
            int i9 = format.G;
            int i10 = format.H;
            e0Var.f4556i = i9;
            e0Var.f4557j = i10;
            if (b0.a < 21 && format.D == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i11 = 0; i11 < 6; i11++) {
                    iArr2[i11] = i11;
                }
            } else {
                iArr2 = iArr;
            }
            this.f732d.f4599i = iArr2;
            AudioProcessor.a aVar = new AudioProcessor.a(format.E, format.D, format.F);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a e2 = audioProcessor.e(aVar);
                    if (audioProcessor.a()) {
                        aVar = e2;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e3) {
                    throw new AudioSink.ConfigurationException(e3, format);
                }
            }
            int i12 = aVar.c;
            i6 = aVar.a;
            intValue2 = b0.m(aVar.b);
            audioProcessorArr = audioProcessorArr2;
            i4 = i12;
            i7 = b0.r(i12, aVar.b);
            i5 = r;
            i3 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i13 = format.E;
            if (this.f740l && I(format, this.t)) {
                String str = format.q;
                Objects.requireNonNull(str);
                intValue = p.b(str, format.n);
                intValue2 = b0.m(format.D);
            } else {
                Pair<Integer, Integer> B = B(format, this.a);
                if (B != null) {
                    intValue = ((Integer) B.first).intValue();
                    intValue2 = ((Integer) B.second).intValue();
                    i8 = 2;
                } else {
                    String valueOf = String.valueOf(format);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(valueOf);
                    throw new AudioSink.ConfigurationException(sb.toString(), format);
                }
            }
            audioProcessorArr = audioProcessorArr3;
            i3 = i8;
            i4 = intValue;
            i5 = -1;
            i6 = i13;
            i7 = -1;
        }
        if (i4 == 0) {
            String valueOf2 = String.valueOf(format);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i3);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new AudioSink.ConfigurationException(sb2.toString(), format);
        } else if (intValue2 != 0) {
            this.Y = false;
            c cVar = new c(format, i5, i3, i7, i6, intValue2, i4, i2, this.f739k, audioProcessorArr);
            if (G()) {
                this.q = cVar;
            } else {
                this.r = cVar;
            }
        } else {
            String valueOf3 = String.valueOf(format);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 54);
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i3);
            sb3.append(") for: ");
            sb3.append(valueOf3);
            throw new AudioSink.ConfigurationException(sb3.toString(), format);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void w(boolean z) {
        M(A(), z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void x(t tVar) {
        if (this.V.equals(tVar)) {
            return;
        }
        int i2 = tVar.a;
        float f2 = tVar.b;
        AudioTrack audioTrack = this.s;
        if (audioTrack != null) {
            if (this.V.a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.s.setAuxEffectSendLevel(f2);
            }
        }
        this.V = tVar;
    }

    public final void y() {
        int i2 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i2 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i2];
            audioProcessor.flush();
            this.J[i2] = audioProcessor.getOutput();
            i2++;
        }
    }
}

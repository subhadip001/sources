package f.h.b.b.u1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes.dex */
public final class s {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final a a;
    public final long[] b;
    public AudioTrack c;

    /* renamed from: d  reason: collision with root package name */
    public int f4584d;

    /* renamed from: e  reason: collision with root package name */
    public int f4585e;

    /* renamed from: f  reason: collision with root package name */
    public r f4586f;

    /* renamed from: g  reason: collision with root package name */
    public int f4587g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4588h;

    /* renamed from: i  reason: collision with root package name */
    public long f4589i;

    /* renamed from: j  reason: collision with root package name */
    public float f4590j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4591k;

    /* renamed from: l  reason: collision with root package name */
    public long f4592l;

    /* renamed from: m  reason: collision with root package name */
    public long f4593m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    /* compiled from: AudioTrackPositionTracker.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(long j2);

        void b(int i2, long j2);

        void c(long j2);

        void d(long j2, long j3, long j4, long j5);

        void e(long j2, long j3, long j4, long j5);
    }

    public s(a aVar) {
        this.a = aVar;
        if (f.h.b.b.g2.b0.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public final long a(long j2) {
        return (j2 * 1000000) / this.f4587g;
    }

    public final long b() {
        AudioTrack audioTrack = this.c;
        Objects.requireNonNull(audioTrack);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.f4587g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f4588h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (f.h.b.b.g2.b0.a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(long r6) {
        /*
            r5 = this;
            long r0 = r5.b()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L29
            boolean r6 = r5.f4588h
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.c
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L26
            long r6 = r5.b()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L2a
        L29:
            r2 = 1
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.u1.s.c(long):boolean");
    }

    public void d() {
        this.f4592l = 0L;
        this.w = 0;
        this.v = 0;
        this.f4593m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f4591k = false;
        this.c = null;
        this.f4586f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((f.h.b.b.g2.b0.a < 23 && (r5 == 5 || r5 == 6)) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.c = r3
            r2.f4584d = r6
            r2.f4585e = r7
            f.h.b.b.u1.r r0 = new f.h.b.b.u1.r
            r0.<init>(r3)
            r2.f4586f = r0
            int r3 = r3.getSampleRate()
            r2.f4587g = r3
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L29
            int r4 = f.h.b.b.g2.b0.a
            r1 = 23
            if (r4 >= r1) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            r2.f4588h = r3
            boolean r3 = f.h.b.b.g2.b0.y(r5)
            r2.q = r3
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L40
            int r7 = r7 / r6
            long r6 = (long) r7
            long r6 = r2.a(r6)
            goto L41
        L40:
            r6 = r4
        L41:
            r2.f4589i = r6
            r6 = 0
            r2.s = r6
            r2.t = r6
            r2.u = r6
            r2.p = r0
            r2.x = r4
            r2.y = r4
            r2.r = r6
            r2.o = r6
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f4590j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.u1.s.e(android.media.AudioTrack, boolean, int, int, int):void");
    }
}

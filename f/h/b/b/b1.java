package f.h.b.b;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.b2.z;
import java.util.List;

/* compiled from: PlaybackInfo.java */
/* loaded from: classes.dex */
public final class b1 {
    public static final z.a s = new z.a(new Object());
    public final q1 a;
    public final z.a b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3790d;

    /* renamed from: e  reason: collision with root package name */
    public final ExoPlaybackException f3791e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3792f;

    /* renamed from: g  reason: collision with root package name */
    public final TrackGroupArray f3793g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.b.d2.m f3794h;

    /* renamed from: i  reason: collision with root package name */
    public final List<Metadata> f3795i;

    /* renamed from: j  reason: collision with root package name */
    public final z.a f3796j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3797k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3798l;

    /* renamed from: m  reason: collision with root package name */
    public final c1 f3799m;
    public final boolean n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public b1(q1 q1Var, z.a aVar, long j2, int i2, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, f.h.b.b.d2.m mVar, List<Metadata> list, z.a aVar2, boolean z2, int i3, c1 c1Var, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.a = q1Var;
        this.b = aVar;
        this.c = j2;
        this.f3790d = i2;
        this.f3791e = exoPlaybackException;
        this.f3792f = z;
        this.f3793g = trackGroupArray;
        this.f3794h = mVar;
        this.f3795i = list;
        this.f3796j = aVar2;
        this.f3797k = z2;
        this.f3798l = i3;
        this.f3799m = c1Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.n = z3;
        this.o = z4;
    }

    public static b1 i(f.h.b.b.d2.m mVar) {
        q1 q1Var = q1.a;
        z.a aVar = s;
        TrackGroupArray trackGroupArray = TrackGroupArray.f878i;
        f.h.c.b.a<Object> aVar2 = f.h.c.b.q.f5981g;
        return new b1(q1Var, aVar, -9223372036854775807L, 1, null, false, trackGroupArray, mVar, f.h.c.b.m0.f5954j, aVar, false, 0, c1.f3917d, 0L, 0L, 0L, false, false);
    }

    public b1 a(z.a aVar) {
        return new b1(this.a, this.b, this.c, this.f3790d, this.f3791e, this.f3792f, this.f3793g, this.f3794h, this.f3795i, aVar, this.f3797k, this.f3798l, this.f3799m, this.p, this.q, this.r, this.n, this.o);
    }

    public b1 b(z.a aVar, long j2, long j3, long j4, TrackGroupArray trackGroupArray, f.h.b.b.d2.m mVar, List<Metadata> list) {
        return new b1(this.a, aVar, j3, this.f3790d, this.f3791e, this.f3792f, trackGroupArray, mVar, list, this.f3796j, this.f3797k, this.f3798l, this.f3799m, this.p, j4, j2, this.n, this.o);
    }

    public b1 c(boolean z) {
        return new b1(this.a, this.b, this.c, this.f3790d, this.f3791e, this.f3792f, this.f3793g, this.f3794h, this.f3795i, this.f3796j, this.f3797k, this.f3798l, this.f3799m, this.p, this.q, this.r, z, this.o);
    }

    public b1 d(boolean z, int i2) {
        return new b1(this.a, this.b, this.c, this.f3790d, this.f3791e, this.f3792f, this.f3793g, this.f3794h, this.f3795i, this.f3796j, z, i2, this.f3799m, this.p, this.q, this.r, this.n, this.o);
    }

    public b1 e(ExoPlaybackException exoPlaybackException) {
        return new b1(this.a, this.b, this.c, this.f3790d, exoPlaybackException, this.f3792f, this.f3793g, this.f3794h, this.f3795i, this.f3796j, this.f3797k, this.f3798l, this.f3799m, this.p, this.q, this.r, this.n, this.o);
    }

    public b1 f(c1 c1Var) {
        return new b1(this.a, this.b, this.c, this.f3790d, this.f3791e, this.f3792f, this.f3793g, this.f3794h, this.f3795i, this.f3796j, this.f3797k, this.f3798l, c1Var, this.p, this.q, this.r, this.n, this.o);
    }

    public b1 g(int i2) {
        return new b1(this.a, this.b, this.c, i2, this.f3791e, this.f3792f, this.f3793g, this.f3794h, this.f3795i, this.f3796j, this.f3797k, this.f3798l, this.f3799m, this.p, this.q, this.r, this.n, this.o);
    }

    public b1 h(q1 q1Var) {
        return new b1(q1Var, this.b, this.c, this.f3790d, this.f3791e, this.f3792f, this.f3793g, this.f3794h, this.f3795i, this.f3796j, this.f3797k, this.f3798l, this.f3799m, this.p, this.q, this.r, this.n, this.o);
    }
}

package com.video_converter.video_compressor.players;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.h.b.b.a1;
import f.h.b.b.b1;
import f.h.b.b.b2.i0;
import f.h.b.b.b2.z;
import f.h.b.b.c1;
import f.h.b.b.d2.k;
import f.h.b.b.e0;
import f.h.b.b.e1;
import f.h.b.b.e2.j;
import f.h.b.b.f1;
import f.h.b.b.f2.l;
import f.h.b.b.f2.n;
import f.h.b.b.f2.p;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.f;
import f.h.b.b.g2.l;
import f.h.b.b.g2.m;
import f.h.b.b.h0;
import f.h.b.b.h1;
import f.h.b.b.o0;
import f.h.b.b.o1;
import f.h.b.b.p1;
import f.h.b.b.q0;
import f.h.b.b.q1;
import f.h.b.b.r0;
import f.h.b.b.r1;
import f.h.b.b.s1;
import f.h.b.b.t1.w0;
import f.h.b.b.t1.x0;
import f.h.b.b.u0;
import f.h.c.b.n0;
import f.n.a.h.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class VideoPlayer extends a<f.n.a.q.a> implements Object {

    /* renamed from: g  reason: collision with root package name */
    public Activity f1385g;

    /* renamed from: h  reason: collision with root package name */
    public o1 f1386h;

    /* loaded from: classes2.dex */
    public enum State {
        PLAYING,
        PAUSED,
        IDLE
    }

    public VideoPlayer(Activity activity) {
        this.f1385g = activity;
        o1.b bVar = new o1.b(activity);
        j.g(!bVar.q);
        bVar.q = true;
        o1 o1Var = new o1(bVar);
        this.f1386h = o1Var;
        o1Var.m(this);
    }

    public /* synthetic */ void A(u0 u0Var, int i2) {
        e1.e(this, u0Var, i2);
    }

    public /* synthetic */ void G(boolean z, int i2) {
        e1.f(this, z, i2);
    }

    public /* synthetic */ void I(TrackGroupArray trackGroupArray, k kVar) {
        e1.r(this, trackGroupArray, kVar);
    }

    public /* synthetic */ void K(c1 c1Var) {
        e1.g(this, c1Var);
    }

    public void O(boolean z) {
        for (f.n.a.q.a aVar : b()) {
            aVar.k(z);
        }
    }

    public /* synthetic */ void a() {
        e1.n(this);
    }

    public long c() {
        return this.f1386h.J();
    }

    public /* synthetic */ void d(int i2) {
        e1.i(this, i2);
    }

    public /* synthetic */ void e(int i2) {
        e1.l(this, i2);
    }

    public void f() {
        this.f1386h.r(false);
    }

    public void g(Uri uri) {
        String str;
        String str2;
        u0.f fVar;
        l lVar = new l(null, n0.f5958l, 2000, f.a, false);
        Activity activity = this.f1385g;
        int i2 = b0.a;
        try {
            str = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        n nVar = new n(activity, f.a.b.a.a.v(f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str, 55)), "exoplayer2example", "/", str, " (Linux;Android "), str3, ") ", "ExoPlayerLib/2.13.2"), lVar);
        f.h.b.b.y1.f fVar2 = new f.h.b.b.y1.f();
        Uri parse = uri == null ? Uri.parse("") : uri;
        p pVar = new p();
        Collections.emptyList();
        Collections.emptyMap();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        j.g(true);
        if (parse != null) {
            fVar = new u0.f(parse, null, null, null, emptyList, null, emptyList2, null, null);
            str2 = parse.toString();
        } else {
            str2 = null;
            fVar = null;
        }
        Objects.requireNonNull(str2);
        Objects.requireNonNull(fVar);
        Uri uri2 = fVar.a;
        Object obj = fVar.f4517h;
        f.h.b.b.b2.p pVar2 = new f.h.b.b.b2.p(uri2, nVar, fVar2, pVar, null, CommonUtils.BYTES_IN_A_MEGABYTE, obj != null ? obj : null, null);
        o1 o1Var = this.f1386h;
        o1Var.Z();
        List singletonList = Collections.singletonList(pVar2);
        o1Var.Z();
        Objects.requireNonNull(o1Var.f4426k);
        o0 o0Var = o1Var.f4419d;
        o0Var.b();
        o0Var.J();
        o0Var.s++;
        if (!o0Var.f4415j.isEmpty()) {
            o0Var.P(0, o0Var.f4415j.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < singletonList.size(); i3++) {
            a1.c cVar = new a1.c((z) singletonList.get(i3), o0Var.f4416k);
            arrayList.add(cVar);
            o0Var.f4415j.add(i3 + 0, new o0.a(cVar.b, cVar.a.n));
        }
        i0 f2 = o0Var.w.f(0, arrayList.size());
        o0Var.w = f2;
        h1 h1Var = new h1(o0Var.f4415j, f2);
        if (!h1Var.q() && h1Var.f4313e <= 0) {
            throw new IllegalSeekPositionException(h1Var, 0, -9223372036854775807L);
        }
        b1 N = o0Var.N(o0Var.x, h1Var, o0Var.L(h1Var, 0, -9223372036854775807L));
        int i4 = N.f3790d;
        if (i4 != 1) {
            i4 = (h1Var.q() || h1Var.f4313e <= 0) ? 4 : 2;
        }
        b1 g2 = N.g(i4);
        o0Var.f4412g.f4451l.c(17, new q0.a(arrayList, o0Var.w, 0, h0.a(-9223372036854775807L), null)).sendToTarget();
        o0Var.S(g2, false, 4, 0, 1, false);
        o1Var.d();
    }

    public /* synthetic */ void h(List list) {
        e1.p(this, list);
    }

    public void i() {
        String str;
        boolean z;
        AudioTrack audioTrack;
        o1 o1Var = this.f1386h;
        o1Var.Z();
        if (b0.a < 21 && (audioTrack = o1Var.r) != null) {
            audioTrack.release();
            o1Var.r = null;
        }
        o1Var.f4427l.a(false);
        p1 p1Var = o1Var.n;
        p1.c cVar = p1Var.f4441e;
        if (cVar != null) {
            try {
                p1Var.a.unregisterReceiver(cVar);
            } catch (RuntimeException e2) {
                m.c("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            p1Var.f4441e = null;
        }
        r1 r1Var = o1Var.o;
        r1Var.f4478d = false;
        r1Var.a();
        s1 s1Var = o1Var.p;
        s1Var.f4479d = false;
        s1Var.a();
        e0 e0Var = o1Var.f4428m;
        e0Var.c = null;
        e0Var.a();
        o0 o0Var = o1Var.f4419d;
        Objects.requireNonNull(o0Var);
        String hexString = Integer.toHexString(System.identityHashCode(o0Var));
        String str2 = b0.f4269e;
        HashSet<String> hashSet = r0.a;
        synchronized (r0.class) {
            str = r0.b;
        }
        StringBuilder z2 = f.a.b.a.a.z(f.a.b.a.a.x(str, f.a.b.a.a.x(str2, f.a.b.a.a.x(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.13.2");
        f.a.b.a.a.R(z2, "] [", str2, "] [", str);
        z2.append("]");
        Log.i("ExoPlayerImpl", z2.toString());
        q0 q0Var = o0Var.f4412g;
        synchronized (q0Var) {
            if (!q0Var.D && q0Var.f4452m.isAlive()) {
                q0Var.f4451l.d(7);
                long j2 = q0Var.z;
                synchronized (q0Var) {
                    long elapsedRealtime = q0Var.u.elapsedRealtime() + j2;
                    boolean z3 = false;
                    while (!Boolean.valueOf(q0Var.D).booleanValue() && j2 > 0) {
                        try {
                            q0Var.wait(j2);
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                        j2 = elapsedRealtime - q0Var.u.elapsedRealtime();
                    }
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    z = q0Var.D;
                }
            }
            z = true;
        }
        if (!z) {
            f.h.b.b.g2.l<f1.a, f1.b> lVar = o0Var.f4413h;
            lVar.b(11, new l.a() { // from class: f.h.b.b.q
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj) {
                    ((f1.a) obj).j(ExoPlaybackException.b(new ExoTimeoutException(1)));
                }
            });
            lVar.a();
        }
        o0Var.f4413h.c();
        o0Var.f4410e.a.removeCallbacksAndMessages(null);
        w0 w0Var = o0Var.f4418m;
        if (w0Var != null) {
            o0Var.o.d(w0Var);
        }
        b1 g2 = o0Var.x.g(1);
        o0Var.x = g2;
        b1 a = g2.a(g2.b);
        o0Var.x = a;
        a.p = a.r;
        o0Var.x.q = 0L;
        w0 w0Var2 = o1Var.f4426k;
        final x0.a P = w0Var2.P();
        w0Var2.f4493j.put(1036, P);
        w0Var2.f4494k.b.a.obtainMessage(1, 1036, 0, new l.a() { // from class: f.h.b.b.t1.v
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).y();
            }
        }).sendToTarget();
        o1Var.P();
        Surface surface = o1Var.s;
        if (surface != null) {
            if (o1Var.t) {
                surface.release();
            }
            o1Var.s = null;
        }
        if (!o1Var.I) {
            o1Var.D = Collections.emptyList();
            return;
        }
        throw null;
    }

    public void j(ExoPlaybackException exoPlaybackException) {
        for (f.n.a.q.a aVar : b()) {
            aVar.h(exoPlaybackException);
        }
    }

    public void k(long j2) {
        o1 o1Var = this.f1386h;
        o1Var.g(o1Var.p(), j2);
    }

    public /* synthetic */ void m(boolean z) {
        e1.c(this, z);
    }

    public /* synthetic */ void n(q1 q1Var, int i2) {
        e1.q(this, q1Var, i2);
    }

    public /* synthetic */ void p(int i2) {
        e1.h(this, i2);
    }

    public /* synthetic */ void t(boolean z) {
        e1.o(this, z);
    }

    public /* synthetic */ void u(f1 f1Var, f1.b bVar) {
        e1.a(this, f1Var, bVar);
    }

    public /* synthetic */ void w(boolean z) {
        e1.b(this, z);
    }

    public void x(boolean z, int i2) {
        if (this.f1386h == null) {
            return;
        }
        for (f.n.a.q.a aVar : b()) {
            if (i2 == 3) {
                aVar.b();
            } else if (i2 == 4) {
                aVar.m();
            }
        }
    }

    public /* synthetic */ void z(int i2) {
        e1.m(this, i2);
    }
}

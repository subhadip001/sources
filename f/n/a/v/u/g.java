package f.n.a.v.u;

import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import f.h.b.b.c1;
import f.h.b.b.d2.k;
import f.h.b.b.e1;
import f.h.b.b.f1;
import f.h.b.b.o1;
import f.h.b.b.q1;
import f.h.b.b.u0;
import java.util.List;

/* compiled from: VideoTrimFragmentController.java */
/* loaded from: classes2.dex */
public class g implements f1.a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f7503f;

    public g(f fVar) {
        this.f7503f = fVar;
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void A(u0 u0Var, int i2) {
        e1.e(this, u0Var, i2);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void G(boolean z, int i2) {
        e1.f(this, z, i2);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void I(TrackGroupArray trackGroupArray, k kVar) {
        e1.r(this, trackGroupArray, kVar);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void K(c1 c1Var) {
        e1.g(this, c1Var);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void O(boolean z) {
        e1.d(this, z);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void a() {
        e1.n(this);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void d(int i2) {
        e1.i(this, i2);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void e(int i2) {
        e1.l(this, i2);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void h(List list) {
        e1.p(this, list);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void j(ExoPlaybackException exoPlaybackException) {
        e1.j(this, exoPlaybackException);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void m(boolean z) {
        e1.c(this, z);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void n(q1 q1Var, int i2) {
        e1.q(this, q1Var, i2);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void p(int i2) {
        e1.h(this, i2);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void t(boolean z) {
        e1.o(this, z);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void u(f1 f1Var, f1.b bVar) {
        e1.a(this, f1Var, bVar);
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void w(boolean z) {
        e1.b(this, z);
    }

    @Override // f.h.b.b.f1.a
    public void x(boolean z, int i2) {
        try {
            Log.d("arifulTestDebug", "onPlayerStateChanged: " + i2);
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                    }
                } else if (this.f7503f.a.f1386h.w()) {
                    f fVar = this.f7503f;
                    o1 o1Var = fVar.a.f1386h;
                    o1Var.Z();
                    fVar.n = o1Var.f4419d.getDuration();
                    this.f7503f.o.sendEmptyMessage(0);
                } else {
                    this.f7503f.n = -1L;
                }
            }
            this.f7503f.n = -1L;
        } catch (Exception unused) {
        }
    }

    @Override // f.h.b.b.f1.a
    public /* synthetic */ void z(int i2) {
        e1.m(this, i2);
    }
}

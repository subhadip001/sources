package f.n.a.v.l;

import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;

/* compiled from: PreviewFragmentController.java */
/* loaded from: classes2.dex */
public class b implements f.n.a.q.a {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // f.n.a.q.a
    public void b() {
    }

    @Override // f.n.a.q.a
    public void h(ExoPlaybackException exoPlaybackException) {
        Log.d("PreviewFragmentC", "onPlayError: ");
        this.a.f7279e.o.setVisibility(0);
    }

    @Override // f.n.a.q.a
    public void k(boolean z) {
        e eVar = this.a;
        if (eVar.n) {
            return;
        }
        try {
            if (z) {
                eVar.c.f1386h.r(true);
                e eVar2 = this.a;
                eVar2.c.k(eVar2.p + eVar2.b.c());
            } else {
                eVar.c.f1386h.r(false);
                this.a.c.f();
            }
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("onIsPlayingChange: exception ");
            A.append(e2.getMessage());
            Log.d("PreviewFragmentC", A.toString());
        }
    }

    @Override // f.n.a.q.a
    public void m() {
        e eVar = this.a;
        if (eVar.n) {
            return;
        }
        eVar.b.f1386h.r(false);
        this.a.c.f1386h.r(false);
        e eVar2 = this.a;
        eVar2.c.k(eVar2.p);
        this.a.b.k(0L);
    }
}

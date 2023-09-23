package f.h.b.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import f.h.b.c.r.e;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e.g b;
    public final /* synthetic */ e c;

    public d(e eVar, boolean z, e.g gVar) {
        this.c = eVar;
        this.a = z;
        this.b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        e eVar = this.c;
        eVar.s = 0;
        eVar.f5383m = null;
        e.g gVar = this.b;
        if (gVar != null) {
            b bVar = (b) gVar;
            bVar.a.b(bVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.c.w.b(0, this.a);
        e eVar = this.c;
        eVar.s = 2;
        eVar.f5383m = animator;
    }
}

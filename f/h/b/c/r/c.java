package f.h.b.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f.h.b.c.r.e;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e.g c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f5373d;

    public c(e eVar, boolean z, e.g gVar) {
        this.f5373d = eVar;
        this.b = z;
        this.c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        e eVar = this.f5373d;
        eVar.s = 0;
        eVar.f5383m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = eVar.w;
        boolean z = this.b;
        floatingActionButton.b(z ? 8 : 4, z);
        e.g gVar = this.c;
        if (gVar != null) {
            b bVar = (b) gVar;
            bVar.a.a(bVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5373d.w.b(0, this.b);
        e eVar = this.f5373d;
        eVar.s = 1;
        eVar.f5383m = animator;
        this.a = false;
    }
}

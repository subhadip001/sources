package e.p.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import e.p.c.b;
import e.p.c.s0;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s0.d f2685d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b.C0053b f2686e;

    public c(b bVar, ViewGroup viewGroup, View view, boolean z, s0.d dVar, b.C0053b c0053b) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.f2685d = dVar;
        this.f2686e = c0053b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            this.f2685d.a.a(this.b);
        }
        this.f2686e.a();
    }
}

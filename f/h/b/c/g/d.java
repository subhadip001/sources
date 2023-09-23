package f.h.b.c.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* compiled from: BottomAppBar.java */
/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ ActionMenuView b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f5256d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5257e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.f5257e = bottomAppBar;
        this.b = actionMenuView;
        this.c = i2;
        this.f5256d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f5257e;
        int i2 = bottomAppBar.g0;
        boolean z = i2 != 0;
        if (i2 != 0) {
            bottomAppBar.g0 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.n(i2);
        }
        BottomAppBar bottomAppBar2 = this.f5257e;
        ActionMenuView actionMenuView = this.b;
        int i3 = this.c;
        boolean z2 = this.f5256d;
        Objects.requireNonNull(bottomAppBar2);
        e eVar = new e(bottomAppBar2, actionMenuView, i3, z2);
        if (z) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }
}

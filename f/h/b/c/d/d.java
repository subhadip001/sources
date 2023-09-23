package f.h.b.c.d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import e.i.j.h0.f;

/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public class d implements e.i.j.h0.f {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5227d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5228e;

    public d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
        this.f5228e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.f5227d = i2;
    }

    @Override // e.i.j.h0.f
    public boolean a(View view, f.a aVar) {
        this.f5228e.L(this.a, this.b, this.c, this.f5227d, new int[]{0, 0});
        return true;
    }
}

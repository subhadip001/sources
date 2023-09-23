package f.h.b.c.d;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import e.i.j.h0.f;

/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public class e implements e.i.j.h0.f {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public e(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // e.i.j.h0.f
    public boolean a(View view, f.a aVar) {
        this.a.setExpanded(this.b);
        return true;
    }
}

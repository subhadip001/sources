package f.h.b.c.d;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import e.i.j.f0;
import e.i.j.q;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public class a implements q {
    public final /* synthetic */ AppBarLayout a;

    public a(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // e.i.j.q
    public f0 a(View view, f0 f0Var) {
        AppBarLayout appBarLayout = this.a;
        Objects.requireNonNull(appBarLayout);
        AtomicInteger atomicInteger = z.a;
        f0 f0Var2 = z.d.b(appBarLayout) ? f0Var : null;
        if (!Objects.equals(appBarLayout.f1049l, f0Var2)) {
            appBarLayout.f1049l = f0Var2;
            appBarLayout.g();
            appBarLayout.requestLayout();
        }
        return f0Var;
    }
}

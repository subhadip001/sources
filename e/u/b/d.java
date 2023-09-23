package e.u.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import e.u.b.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2849f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f2850g;

    public d(k kVar, ArrayList arrayList) {
        this.f2850g = kVar;
        this.f2849f = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f2849f.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f2850g;
            Objects.requireNonNull(kVar);
            RecyclerView.a0 a0Var = aVar.a;
            View view = a0Var == null ? null : a0Var.itemView;
            RecyclerView.a0 a0Var2 = aVar.b;
            View view2 = a0Var2 != null ? a0Var2.itemView : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(kVar.f486f);
                kVar.r.add(aVar.a);
                duration.translationX(aVar.f2870e - aVar.c);
                duration.translationY(aVar.f2871f - aVar.f2869d);
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                kVar.r.add(aVar.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f486f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
            }
        }
        this.f2849f.clear();
        this.f2850g.n.remove(this.f2849f);
    }
}

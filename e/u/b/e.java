package e.u.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2853f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f2854g;

    public e(k kVar, ArrayList arrayList) {
        this.f2854g = kVar;
        this.f2853f = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f2853f.iterator();
        while (it.hasNext()) {
            RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
            k kVar = this.f2854g;
            Objects.requireNonNull(kVar);
            View view = a0Var.itemView;
            ViewPropertyAnimator animate = view.animate();
            kVar.o.add(a0Var);
            animate.alpha(1.0f).setDuration(kVar.c).setListener(new g(kVar, a0Var, view, animate)).start();
        }
        this.f2853f.clear();
        this.f2854g.f2867l.remove(this.f2853f);
    }
}

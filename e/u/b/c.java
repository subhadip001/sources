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
public class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2847f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f2848g;

    public c(k kVar, ArrayList arrayList) {
        this.f2848g = kVar;
        this.f2847f = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f2847f.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f2848g;
            RecyclerView.a0 a0Var = bVar.a;
            int i2 = bVar.b;
            int i3 = bVar.c;
            int i4 = bVar.f2872d;
            int i5 = bVar.f2873e;
            Objects.requireNonNull(kVar);
            View view = a0Var.itemView;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.p.add(a0Var);
            animate.setDuration(kVar.f485e).setListener(new h(kVar, a0Var, i6, view, i7, animate)).start();
        }
        this.f2847f.clear();
        this.f2848g.f2868m.remove(this.f2847f);
    }
}

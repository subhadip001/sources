package e.u.b;

import androidx.recyclerview.widget.RecyclerView;
import e.u.b.k;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class b0 extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2846g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.b;
        if (a0Var2.shouldIgnore()) {
            int i6 = cVar.a;
            i3 = cVar.b;
            i2 = i6;
        } else {
            i2 = cVar2.a;
            i3 = cVar2.b;
        }
        k kVar = (k) this;
        if (a0Var == a0Var2) {
            return kVar.i(a0Var, i4, i5, i2, i3);
        }
        float translationX = a0Var.itemView.getTranslationX();
        float translationY = a0Var.itemView.getTranslationY();
        float alpha = a0Var.itemView.getAlpha();
        kVar.n(a0Var);
        a0Var.itemView.setTranslationX(translationX);
        a0Var.itemView.setTranslationY(translationY);
        a0Var.itemView.setAlpha(alpha);
        kVar.n(a0Var2);
        a0Var2.itemView.setTranslationX(-((int) ((i2 - i4) - translationX)));
        a0Var2.itemView.setTranslationY(-((int) ((i3 - i5) - translationY)));
        a0Var2.itemView.setAlpha(0.0f);
        kVar.f2866k.add(new k.a(a0Var, a0Var2, i4, i5, i2, i3));
        return true;
    }

    public abstract boolean i(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5);
}

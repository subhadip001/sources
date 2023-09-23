package e.u.b;

import androidx.recyclerview.widget.RecyclerView;
import e.u.b.o;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o.f f2918f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2919g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ o f2920h;

    public p(o oVar, o.f fVar, int i2) {
        this.f2920h = oVar;
        this.f2918f = fVar;
        this.f2919g = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f2920h.r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        o.f fVar = this.f2918f;
        if (fVar.f2915k || fVar.f2909e.getAdapterPosition() == -1) {
            return;
        }
        RecyclerView.j itemAnimator = this.f2920h.r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.g()) {
            o oVar = this.f2920h;
            int size = oVar.p.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (!oVar.p.get(i2).f2916l) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                o.d dVar = this.f2920h.f2904m;
                RecyclerView.a0 a0Var = this.f2918f.f2909e;
                f.n.a.v.t.a.a aVar = ((f.n.a.v.t.a.c) dVar).f7466d;
                int adapterPosition = a0Var.getAdapterPosition();
                f.n.a.v.t.i.b bVar = (f.n.a.v.t.i.b) aVar;
                if (bVar.getItemCount() == 1) {
                    bVar.notifyItemChanged(adapterPosition);
                    return;
                }
                bVar.b.remove(adapterPosition);
                bVar.notifyItemRemoved(adapterPosition);
                return;
            }
        }
        this.f2920h.r.post(this);
    }
}

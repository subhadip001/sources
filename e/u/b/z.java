package e.u.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.u.b.a;

/* compiled from: RecyclerView.java */
/* loaded from: classes.dex */
public class z implements a.InterfaceC0056a {
    public final /* synthetic */ RecyclerView a;

    public z(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(a.b bVar) {
        int i2 = bVar.a;
        if (i2 == 1) {
            RecyclerView recyclerView = this.a;
            recyclerView.r.q0(recyclerView, bVar.b, bVar.f2841d);
        } else if (i2 == 2) {
            RecyclerView recyclerView2 = this.a;
            recyclerView2.r.t0(recyclerView2, bVar.b, bVar.f2841d);
        } else if (i2 == 4) {
            RecyclerView recyclerView3 = this.a;
            recyclerView3.r.v0(recyclerView3, bVar.b, bVar.f2841d, bVar.c);
        } else if (i2 != 8) {
        } else {
            RecyclerView recyclerView4 = this.a;
            recyclerView4.r.s0(recyclerView4, bVar.b, bVar.f2841d, 1);
        }
    }

    public RecyclerView.a0 b(int i2) {
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f477j.h();
        int i3 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i3 >= h2) {
                break;
            }
            RecyclerView.a0 M = RecyclerView.M(recyclerView.f477j.g(i3));
            if (M != null && !M.isRemoved() && M.mPosition == i2) {
                if (!recyclerView.f477j.k(M.itemView)) {
                    a0Var = M;
                    break;
                }
                a0Var = M;
            }
            i3++;
        }
        if (a0Var == null || this.a.f477j.k(a0Var.itemView)) {
            return null;
        }
        return a0Var;
    }

    public void c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f477j.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = recyclerView.f477j.g(i7);
            RecyclerView.a0 M = RecyclerView.M(g2);
            if (M != null && !M.shouldIgnore() && (i5 = M.mPosition) >= i2 && i5 < i6) {
                M.addFlags(2);
                M.addChangePayload(obj);
                ((RecyclerView.n) g2.getLayoutParams()).c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f474g;
        int size = tVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.a0 a0Var = tVar.c.get(size);
                if (a0Var != null && (i4 = a0Var.mPosition) >= i2 && i4 < i6) {
                    a0Var.addFlags(2);
                    tVar.f(size);
                }
            } else {
                this.a.q0 = true;
                return;
            }
        }
    }

    public void d(int i2, int i3) {
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f477j.h();
        for (int i4 = 0; i4 < h2; i4++) {
            RecyclerView.a0 M = RecyclerView.M(recyclerView.f477j.g(i4));
            if (M != null && !M.shouldIgnore() && M.mPosition >= i2) {
                M.offsetPosition(i3, false);
                recyclerView.m0.f516f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f474g;
        int size = tVar.c.size();
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.a0 a0Var = tVar.c.get(i5);
            if (a0Var != null && a0Var.mPosition >= i2) {
                a0Var.offsetPosition(i3, true);
            }
        }
        recyclerView.requestLayout();
        this.a.p0 = true;
    }

    public void e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f477j.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            RecyclerView.a0 M = RecyclerView.M(recyclerView.f477j.g(i12));
            if (M != null && (i10 = M.mPosition) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    M.offsetPosition(i3 - i2, false);
                } else {
                    M.offsetPosition(i6, false);
                }
                recyclerView.m0.f516f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f474g;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        int size = tVar.c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.a0 a0Var = tVar.c.get(i13);
            if (a0Var != null && (i9 = a0Var.mPosition) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    a0Var.offsetPosition(i3 - i2, false);
                } else {
                    a0Var.offsetPosition(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.p0 = true;
    }
}

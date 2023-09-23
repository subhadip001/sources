package e.u.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class t extends v {
    public t(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // e.u.b.v
    public int b(View view) {
        return this.a.H(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // e.u.b.v
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.G(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // e.u.b.v
    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.F(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // e.u.b.v
    public int e(View view) {
        return this.a.E(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // e.u.b.v
    public int f() {
        return this.a.p;
    }

    @Override // e.u.b.v
    public int g() {
        RecyclerView.m mVar = this.a;
        return mVar.p - mVar.Q();
    }

    @Override // e.u.b.v
    public int h() {
        return this.a.Q();
    }

    @Override // e.u.b.v
    public int i() {
        return this.a.n;
    }

    @Override // e.u.b.v
    public int j() {
        return this.a.o;
    }

    @Override // e.u.b.v
    public int k() {
        return this.a.P();
    }

    @Override // e.u.b.v
    public int l() {
        RecyclerView.m mVar = this.a;
        return (mVar.p - mVar.P()) - this.a.Q();
    }

    @Override // e.u.b.v
    public int n(View view) {
        this.a.W(view, true, this.c);
        return this.c.right;
    }

    @Override // e.u.b.v
    public int o(View view) {
        this.a.W(view, true, this.c);
        return this.c.left;
    }

    @Override // e.u.b.v
    public void p(int i2) {
        this.a.c0(i2);
    }
}

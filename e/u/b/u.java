package e.u.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class u extends v {
    public u(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // e.u.b.v
    public int b(View view) {
        return this.a.D(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // e.u.b.v
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.F(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // e.u.b.v
    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.G(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // e.u.b.v
    public int e(View view) {
        return this.a.I(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // e.u.b.v
    public int f() {
        return this.a.q;
    }

    @Override // e.u.b.v
    public int g() {
        RecyclerView.m mVar = this.a;
        return mVar.q - mVar.O();
    }

    @Override // e.u.b.v
    public int h() {
        return this.a.O();
    }

    @Override // e.u.b.v
    public int i() {
        return this.a.o;
    }

    @Override // e.u.b.v
    public int j() {
        return this.a.n;
    }

    @Override // e.u.b.v
    public int k() {
        return this.a.R();
    }

    @Override // e.u.b.v
    public int l() {
        RecyclerView.m mVar = this.a;
        return (mVar.q - mVar.R()) - this.a.O();
    }

    @Override // e.u.b.v
    public int n(View view) {
        this.a.W(view, true, this.c);
        return this.c.bottom;
    }

    @Override // e.u.b.v
    public int o(View view) {
        this.a.W(view, true, this.c);
        return this.c.top;
    }

    @Override // e.u.b.v
    public void p(int i2) {
        this.a.d0(i2);
    }
}

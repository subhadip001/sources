package f.h.b.c.n;

import android.view.View;
import e.i.j.f0;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public class m implements e.i.j.q {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;

    public m(l lVar, int i2, View view, int i3) {
        this.a = i2;
        this.b = view;
        this.c = i3;
    }

    @Override // e.i.j.q
    public f0 a(View view, f0 f0Var) {
        int i2 = f0Var.b(7).b;
        if (this.a >= 0) {
            this.b.getLayoutParams().height = this.a + i2;
            View view2 = this.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.b;
        view3.setPadding(view3.getPaddingLeft(), this.c + i2, this.b.getPaddingRight(), this.b.getPaddingBottom());
        return f0Var;
    }
}

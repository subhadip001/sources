package e.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.a.h.j.n;
import java.util.ArrayList;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class f extends ConstraintWidget implements e {
    public ConstraintWidget[] r0 = new ConstraintWidget[4];
    public int s0 = 0;

    public void W(ArrayList<n> arrayList, int i2, n nVar) {
        for (int i3 = 0; i3 < this.s0; i3++) {
            nVar.a(this.r0[i3]);
        }
        for (int i4 = 0; i4 < this.s0; i4++) {
            e.e.a.b(this.r0[i4], i2, arrayList, nVar);
        }
    }

    @Override // e.g.a.h.e
    public void a(c cVar) {
    }
}

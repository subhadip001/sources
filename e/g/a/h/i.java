package e.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class i extends ConstraintWidget {
    public ArrayList<ConstraintWidget> r0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void G() {
        this.r0.clear();
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void I(e.g.a.c cVar) {
        super.I(cVar);
        int size = this.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r0.get(i2).I(cVar);
        }
    }

    public void W() {
        ArrayList<ConstraintWidget> arrayList = this.r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.r0.get(i2);
            if (constraintWidget instanceof i) {
                ((i) constraintWidget).W();
            }
        }
    }
}

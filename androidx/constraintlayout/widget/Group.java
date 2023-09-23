package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.g.c.a;

/* loaded from: classes.dex */
public class Group extends a {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // e.g.c.a
    public void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // e.g.c.a
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
    }

    @Override // e.g.c.a
    public void l(ConstraintLayout constraintLayout) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.q0.T(0);
        aVar.q0.O(0);
    }

    @Override // e.g.c.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        f();
    }
}

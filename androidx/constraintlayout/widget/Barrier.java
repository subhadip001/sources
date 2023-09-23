package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.c.a;
import e.g.c.h;

/* loaded from: classes.dex */
public class Barrier extends a {
    public int n;
    public int o;
    public e.g.a.h.a p;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.p.u0;
    }

    public int getMargin() {
        return this.p.v0;
    }

    public int getType() {
        return this.n;
    }

    @Override // e.g.c.a
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.p = new e.g.a.h.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.p.u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.p.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2116i = this.p;
        o();
    }

    @Override // e.g.c.a
    public void k(ConstraintWidget constraintWidget, boolean z) {
        int i2 = this.n;
        this.o = i2;
        if (z) {
            if (i2 == 5) {
                this.o = 1;
            } else if (i2 == 6) {
                this.o = 0;
            }
        } else if (i2 == 5) {
            this.o = 0;
        } else if (i2 == 6) {
            this.o = 1;
        }
        if (constraintWidget instanceof e.g.a.h.a) {
            ((e.g.a.h.a) constraintWidget).t0 = this.o;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.p.u0 = z;
    }

    public void setDpMargin(int i2) {
        this.p.v0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.p.v0 = i2;
    }

    public void setType(int i2) {
        this.n = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}

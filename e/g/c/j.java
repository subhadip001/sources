package e.g.c;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class j extends a {
    public boolean n;
    public boolean o;

    @Override // e.g.c.a
    public void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // e.g.c.a
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.n = true;
                } else if (index == 22) {
                    this.o = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // e.g.c.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n || this.o) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f2114g; i2++) {
                    View d2 = constraintLayout.d(this.f2113f[i2]);
                    if (d2 != null) {
                        if (this.n) {
                            d2.setVisibility(visibility);
                        }
                        if (this.o && elevation > 0.0f) {
                            d2.setTranslationZ(d2.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void p() {
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

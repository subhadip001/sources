package e.g.b.a;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.g.b.a.c;
import e.g.c.h;

/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public class b extends e.g.c.a implements c.InterfaceC0034c {
    public boolean n;
    public boolean o;
    public float p;
    public View[] q;

    @Override // e.g.b.a.c.InterfaceC0034c
    public void a(c cVar, int i2, int i3, float f2) {
    }

    @Override // e.g.b.a.c.InterfaceC0034c
    public void b(c cVar, int i2, int i3) {
    }

    public float getProgress() {
        return this.p;
    }

    @Override // e.g.c.a
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f2183h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.n = obtainStyledAttributes.getBoolean(index, this.n);
                } else if (index == 0) {
                    this.o = obtainStyledAttributes.getBoolean(index, this.o);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void p() {
    }

    public void setProgress(float f2) {
        this.p = f2;
        int i2 = 0;
        if (this.f2114g > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f2119l;
            if (viewArr == null || viewArr.length != this.f2114g) {
                this.f2119l = new View[this.f2114g];
            }
            for (int i3 = 0; i3 < this.f2114g; i3++) {
                this.f2119l[i3] = constraintLayout.d(this.f2113f[i3]);
            }
            this.q = this.f2119l;
            while (i2 < this.f2114g) {
                View view = this.q[i2];
                p();
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            if (!(viewGroup.getChildAt(i2) instanceof b)) {
                p();
            }
            i2++;
        }
    }
}

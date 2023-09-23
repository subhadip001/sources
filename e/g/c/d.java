package e.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.g.c.c;
import java.util.Objects;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public c f2175f;

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.f2175f == null) {
            this.f2175f = new c();
        }
        c cVar = this.f2175f;
        Objects.requireNonNull(cVar);
        int childCount = getChildCount();
        cVar.c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!cVar.c.containsKey(Integer.valueOf(id))) {
                cVar.c.put(Integer.valueOf(id), new c.a());
            }
            c.a aVar2 = cVar.c.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof e.g.c.a) {
                    e.g.c.a aVar3 = (e.g.c.a) childAt;
                    aVar2.c(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        c.b bVar = aVar2.f2130d;
                        bVar.i0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        bVar.g0 = barrier.getType();
                        aVar2.f2130d.j0 = barrier.getReferencedIds();
                        aVar2.f2130d.h0 = barrier.getMargin();
                    }
                }
                aVar2.c(id, aVar);
            }
        }
        return this.f2175f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float r0;
        public boolean s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f2179d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == 28) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                    this.s0 = true;
                } else if (index == 23) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == 24) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 22) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 20) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 21) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == 16) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}

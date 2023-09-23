package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import e.i.j.z;
import f.h.b.c.c.g;
import f.h.b.c.r.i;
import f.h.b.c.s.f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int y = 0;
    public boolean x;

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            View view2 = view;
            view2.getLayoutParams().width = f2.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            View view2 = view;
            view2.getLayoutParams().height = f2.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            AtomicInteger atomicInteger = z.a;
            return Float.valueOf(z.e.f(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            View view2 = view;
            int intValue = f2.intValue();
            int paddingTop = view2.getPaddingTop();
            AtomicInteger atomicInteger = z.a;
            z.e.k(view2, intValue, paddingTop, z.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            AtomicInteger atomicInteger = z.a;
            return Float.valueOf(z.e.e(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            View view2 = view;
            AtomicInteger atomicInteger = z.a;
            z.e.k(view2, z.e.f(view2), view2.getPaddingTop(), f2.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a(Float.class, StreamInformation.KEY_WIDTH);
        new b(Float.class, StreamInformation.KEY_HEIGHT);
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    public static void i(ExtendedFloatingActionButton extendedFloatingActionButton, i iVar) {
        Objects.requireNonNull(extendedFloatingActionButton);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.x = z;
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(g.b(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.b(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.b(getContext(), i2));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(g.b(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        getTextColors();
    }

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public final boolean B(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).f317f == view.getId();
        }

        public final boolean C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (B(appBarLayout, extendedFloatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                f.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    if (this.c) {
                        int i2 = ExtendedFloatingActionButton.y;
                        Objects.requireNonNull(extendedFloatingActionButton);
                    } else {
                        int i3 = ExtendedFloatingActionButton.y;
                        Objects.requireNonNull(extendedFloatingActionButton);
                    }
                    ExtendedFloatingActionButton.i(extendedFloatingActionButton, null);
                    return true;
                }
                if (this.c) {
                    int i4 = ExtendedFloatingActionButton.y;
                    Objects.requireNonNull(extendedFloatingActionButton);
                } else {
                    int i5 = ExtendedFloatingActionButton.y;
                    Objects.requireNonNull(extendedFloatingActionButton);
                }
                ExtendedFloatingActionButton.i(extendedFloatingActionButton, null);
                return true;
            }
            return false;
        }

        public final boolean D(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (B(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    if (this.c) {
                        int i2 = ExtendedFloatingActionButton.y;
                    } else {
                        int i3 = ExtendedFloatingActionButton.y;
                    }
                    ExtendedFloatingActionButton.i(extendedFloatingActionButton, null);
                    return true;
                }
                if (this.c) {
                    int i4 = ExtendedFloatingActionButton.y;
                } else {
                    int i5 = ExtendedFloatingActionButton.y;
                }
                ExtendedFloatingActionButton.i(extendedFloatingActionButton, null);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void f(CoordinatorLayout.f fVar) {
            if (fVar.f319h == 0) {
                fVar.f319h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    D(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> e2 = coordinatorLayout.e(extendedFloatingActionButton);
            int size = e2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = e2.get(i3);
                if (view2 instanceof AppBarLayout) {
                    if (C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && D(view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(extendedFloatingActionButton, i2);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.f5157j);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}

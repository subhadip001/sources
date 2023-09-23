package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.video_converter.video_compressor.R;
import e.i.j.f0;
import e.i.j.z;
import e.p.b;
import e.p.c.c0;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f394f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<View> f395g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f396h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f397i;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f397i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException(a.s("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, "\""));
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f395g;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f394f == null) {
            this.f394f = new ArrayList<>();
        }
        this.f394f.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        f0 q;
        f0 k2 = f0.k(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f396h;
        if (onApplyWindowInsetsListener != null) {
            q = f0.j(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            q = z.q(this, k2);
        }
        if (!q.h()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                z.e(getChildAt(i2), q);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f397i && this.f394f != null) {
            for (int i2 = 0; i2 < this.f394f.size(); i2++) {
                super.drawChild(canvas, this.f394f.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f397i || (arrayList = this.f394f) == null || arrayList.size() <= 0 || !this.f394f.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f395g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f394f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f397i = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f397i = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f396h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f395g == null) {
                this.f395g = new ArrayList<>();
            }
            this.f395g.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        this.f397i = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment H = fragmentManager.H(id);
        if (classAttribute != null && H == null) {
            if (id <= 0) {
                throw new IllegalStateException(a.q("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? a.p(" with tag ", string) : ""));
            }
            Fragment a = fragmentManager.L().a(context.getClassLoader(), classAttribute);
            a.onInflate(context, attributeSet, (Bundle) null);
            e.p.c.a aVar = new e.p.c.a(fragmentManager);
            aVar.p = true;
            a.mContainer = this;
            aVar.g(getId(), a, string, 1);
            aVar.k();
        }
        Iterator it = ((ArrayList) fragmentManager.c.f()).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            Fragment fragment = c0Var.c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                c0Var.b();
            }
        }
    }
}

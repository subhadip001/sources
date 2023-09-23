package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.a;
import f.h.b.c.g.b;
import f.h.b.c.g.c;
import f.h.b.c.g.d;
import f.h.b.c.g.f;
import f.h.b.c.g.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int j0 = 0;
    public Integer W;
    public Animator a0;
    public Animator b0;
    public int c0;
    public int d0;
    public boolean e0;
    public int f0;
    public int g0;
    public boolean h0;
    public Behavior i0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f1085h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1086i;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeInt(this.f1085h);
            parcel.writeInt(this.f1086i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1085h = parcel.readInt();
            this.f1086i = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return F(this.c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f5265i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public static void x(BottomAppBar bottomAppBar) {
        bottomAppBar.f0--;
    }

    public void B(int i2) {
        FloatingActionButton C = C();
        if (C == null || C.k()) {
            return;
        }
        this.f0++;
        C.j(new b(this, i2), true);
    }

    public final FloatingActionButton C() {
        View D = D();
        if (D instanceof FloatingActionButton) {
            return (FloatingActionButton) D;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View D() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.f(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.D():android.view.View");
    }

    public int E(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 == 1 && z) {
            boolean y0 = a.y0(this);
            int measuredWidth = y0 ? getMeasuredWidth() : 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                    if (y0) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((y0 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
        }
        return 0;
    }

    public final float F(int i2) {
        boolean y0 = a.y0(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) + 0) * (y0 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean G() {
        FloatingActionButton C = C();
        return C != null && C.l();
    }

    public final void H() {
        getTopEdgeTreatment().f5266j = getFabTranslationX();
        D();
        if (this.h0) {
            G();
        }
        throw null;
    }

    public boolean I(int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().f5264h) {
            return false;
        }
        getTopEdgeTreatment().f5264h = f2;
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f5265i;
    }

    public int getFabAlignmentMode() {
        return this.c0;
    }

    public int getFabAnimationMode() {
        return this.d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f5263g;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f5262f;
    }

    public boolean getHideOnScroll() {
        return this.e0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            Animator animator = this.b0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.a0;
            if (animator2 != null) {
                animator2.cancel();
            }
            H();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.b0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!G()) {
            actionMenuView.setTranslationX(E(actionMenuView, 0, false));
        } else {
            actionMenuView.setTranslationX(E(actionMenuView, this.c0, this.h0));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        this.c0 = savedState.f1085h;
        this.h0 = savedState.f1086i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1085h = this.c0;
        savedState.f1086i = this.h0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f2 >= 0.0f) {
                topEdgeTreatment.f5265i = f2;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        throw null;
    }

    public void setFabAlignmentMode(int i2) {
        int i3;
        this.g0 = 0;
        boolean z = this.h0;
        AtomicInteger atomicInteger = z.a;
        if (!z.g.c(this)) {
            int i4 = this.g0;
            if (i4 != 0) {
                this.g0 = 0;
                getMenu().clear();
                n(i4);
            }
        } else {
            Animator animator = this.b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (G()) {
                i3 = i2;
            } else {
                z = false;
                i3 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - E(actionMenuView, i3, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new d(this, actionMenuView, i3, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.b0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.b0.start();
        }
        if (this.c0 != i2 && z.g.c(this)) {
            Animator animator2 = this.a0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.d0 == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(C(), "translationX", F(i2));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                B(i2);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.a0 = animatorSet3;
            animatorSet3.addListener(new f.h.b.c.g.a(this));
            this.a0.start();
        }
        this.c0 = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.d0 = i2;
    }

    public void setFabCornerSize(float f2) {
        if (f2 == getTopEdgeTreatment().f5267k) {
            return;
        }
        getTopEdgeTreatment().f5267k = f2;
        throw null;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f5263g = f2;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f5262f = f2;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.e0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = e.i.a.l0(drawable.mutate());
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.W = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.i0 == null) {
            this.i0 = new Behavior();
        }
        return this.i0;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f1080e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f1081f;

        /* renamed from: g  reason: collision with root package name */
        public int f1082g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f1083h;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = Behavior.this.f1081f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = Behavior.this.f1080e;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.m(rect);
                    int height = Behavior.this.f1080e.height();
                    bottomAppBar.I(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f5500e.a(new RectF(Behavior.this.f1080e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f1082g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (f.h.b.c.a.y0(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += 0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += 0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f1083h = new a();
            this.f1080e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f1081f = new WeakReference<>(bottomAppBar);
            int i3 = BottomAppBar.j0;
            View D = bottomAppBar.D();
            if (D != null) {
                AtomicInteger atomicInteger = z.a;
                if (!z.g.c(D)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) D.getLayoutParams();
                    fVar.f315d = 49;
                    this.f1082g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                    if (D instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) D;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f1083h);
                        floatingActionButton.d(null);
                        floatingActionButton.e(new f(bottomAppBar));
                        floatingActionButton.f(null);
                    }
                    bottomAppBar.H();
                    throw null;
                }
            }
            coordinatorLayout.s(bottomAppBar, i2);
            this.a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i2 == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1083h = new a();
            this.f1080e = new Rect();
        }
    }
}

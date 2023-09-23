package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.video_converter.video_compressor.R;
import e.b.h.i;
import e.i.j.z;
import f.h.b.c.c.g;
import f.h.b.c.c.j;
import f.h.b.c.r.d;
import f.h.b.c.r.e;
import f.h.b.c.r.h;
import f.h.b.c.s.f;
import f.h.b.c.s.r;
import f.h.b.c.s.y;
import f.h.b.c.y.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class FloatingActionButton extends y implements f.h.b.c.q.a, n, CoordinatorLayout.b {

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1162g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1163h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f1164i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f1165j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1166k;

    /* renamed from: l  reason: collision with root package name */
    public int f1167l;

    /* renamed from: m  reason: collision with root package name */
    public int f1168m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final Rect r;
    public final Rect s;
    public final e.b.h.n t;
    public final f.h.b.c.q.b u;
    public e v;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements f.h.b.c.x.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements e.f {
        public final j<T> a;

        public c(j<T> jVar) {
            this.a = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.b.c.r.e.f
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.b.c.r.e.f
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.r = new Rect();
        this.s = new Rect();
        Context context2 = getContext();
        TypedArray d2 = r.d(context2, attributeSet, f.h.b.c.b.f5158k, R.attr.floatingActionButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f1162g = f.h.b.c.a.n0(context2, d2, 1);
        this.f1163h = f.h.b.c.a.J0(d2.getInt(2, -1), null);
        this.f1166k = f.h.b.c.a.n0(context2, d2, 12);
        this.f1168m = d2.getInt(7, -1);
        this.n = d2.getDimensionPixelSize(6, 0);
        this.f1167l = d2.getDimensionPixelSize(3, 0);
        float dimension = d2.getDimension(4, 0.0f);
        float dimension2 = d2.getDimension(9, 0.0f);
        float dimension3 = d2.getDimension(11, 0.0f);
        this.q = d2.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d2.getDimensionPixelSize(10, 0));
        g a2 = g.a(context2, d2, 15);
        g a3 = g.a(context2, d2, 8);
        f.h.b.c.y.j a4 = f.h.b.c.y.j.b(context2, attributeSet, R.attr.floatingActionButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_FloatingActionButton, f.h.b.c.y.j.f5498m).a();
        boolean z = d2.getBoolean(5, false);
        setEnabled(d2.getBoolean(0, true));
        d2.recycle();
        e.b.h.n nVar = new e.b.h.n(this);
        this.t = nVar;
        nVar.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.u = new f.h.b.c.q.b(this);
        getImpl().s(a4);
        getImpl().g(this.f1162g, this.f1163h, this.f1166k, this.f1167l);
        getImpl().f5381k = dimensionPixelSize;
        e impl = getImpl();
        if (impl.f5378h != dimension) {
            impl.f5378h = dimension;
            impl.m(dimension, impl.f5379i, impl.f5380j);
        }
        e impl2 = getImpl();
        if (impl2.f5379i != dimension2) {
            impl2.f5379i = dimension2;
            impl2.m(impl2.f5378h, dimension2, impl2.f5380j);
        }
        e impl3 = getImpl();
        if (impl3.f5380j != dimension3) {
            impl3.f5380j = dimension3;
            impl3.m(impl3.f5378h, impl3.f5379i, dimension3);
        }
        getImpl().n = a2;
        getImpl().o = a3;
        getImpl().f5376f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private e getImpl() {
        if (this.v == null) {
            this.v = new h(this, new b());
        }
        return this.v;
    }

    public static int o(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i2;
        }
        return Math.min(i2, size);
    }

    @Override // f.h.b.c.q.a
    public boolean a() {
        return this.u.b;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.u == null) {
            impl.u = new ArrayList<>();
        }
        impl.u.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().l(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList<>();
        }
        impl.t.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        e impl = getImpl();
        c cVar = new c(null);
        if (impl.v == null) {
            impl.v = new ArrayList<>();
        }
        impl.v.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        AtomicInteger atomicInteger = z.a;
        if (z.g.c(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            m(rect);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f1162g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1163h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f5379i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f5380j;
    }

    public Drawable getContentBackground() {
        return getImpl().f5375e;
    }

    public int getCustomSize() {
        return this.n;
    }

    public int getExpandedComponentIdHint() {
        return this.u.c;
    }

    public g getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1166k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1166k;
    }

    public f.h.b.c.y.j getShapeAppearanceModel() {
        f.h.b.c.y.j jVar = getImpl().a;
        Objects.requireNonNull(jVar);
        return jVar;
    }

    public g getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.f1168m;
    }

    public int getSizeDimension() {
        return h(this.f1168m);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1164i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1165j;
    }

    public boolean getUseCompatPadding() {
        return this.q;
    }

    public final int h(int i2) {
        int i3 = this.n;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            if (i2 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        } else {
            return h(0);
        }
    }

    public void i() {
        j(null, true);
    }

    public void j(a aVar, boolean z) {
        AnimatorSet c2;
        e impl = getImpl();
        f.h.b.c.r.b bVar = aVar == null ? null : new f.h.b.c.r.b(this, aVar);
        if (impl.h()) {
            return;
        }
        Animator animator = impl.f5383m;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.u()) {
            g gVar = impl.o;
            if (gVar != null) {
                c2 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
            } else {
                c2 = impl.c(0.0f, 0.4f, 0.4f);
            }
            c2.addListener(new f.h.b.c.r.c(impl, z, bVar));
            ArrayList<Animator.AnimatorListener> arrayList = impl.u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    c2.addListener(it.next());
                }
            }
            c2.start();
            return;
        }
        impl.w.b(z ? 8 : 4, z);
        if (bVar != null) {
            bVar.a.a(bVar.b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().j();
    }

    public boolean k() {
        return getImpl().h();
    }

    public boolean l() {
        return getImpl().i();
    }

    public final void m(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.r;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void n() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f1164i;
        if (colorStateList == null) {
            e.i.a.m(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f1165j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(i.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e impl = getImpl();
        f.h.b.c.y.g gVar = impl.b;
        if (gVar != null) {
            f.h.b.c.a.V0(impl.w, gVar);
        }
        if (impl.p()) {
            ViewTreeObserver viewTreeObserver = impl.w.getViewTreeObserver();
            if (impl.C == null) {
                impl.C = new f.h.b.c.r.g(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.C);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.C = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.o = (sizeDimension - this.p) / 2;
        getImpl().x();
        int min = Math.min(o(sizeDimension, i2), o(sizeDimension, i3));
        Rect rect = this.r;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f348f);
        f.h.b.c.q.b bVar = this.u;
        Bundle orDefault = extendableSavedState.f1192h.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        Objects.requireNonNull(bVar);
        bVar.b = bundle.getBoolean("expanded", false);
        bVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.b) {
            ViewParent parent = bVar.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(bVar.a);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        e.f.h<String, Bundle> hVar = extendableSavedState.f1192h;
        f.h.b.c.q.b bVar = this.u;
        Objects.requireNonNull(bVar);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.b);
        bundle.putInt("expandedComponentIdHint", bVar.c);
        hVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && g(this.s) && !this.s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        q(null, true);
    }

    public void q(a aVar, boolean z) {
        AnimatorSet c2;
        e impl = getImpl();
        f.h.b.c.r.b bVar = aVar == null ? null : new f.h.b.c.r.b(this, aVar);
        if (impl.i()) {
            return;
        }
        Animator animator = impl.f5383m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.n == null;
        if (impl.u()) {
            if (impl.w.getVisibility() != 0) {
                impl.w.setAlpha(0.0f);
                impl.w.setScaleY(z2 ? 0.4f : 0.0f);
                impl.w.setScaleX(z2 ? 0.4f : 0.0f);
                impl.q(z2 ? 0.4f : 0.0f);
            }
            g gVar = impl.n;
            if (gVar != null) {
                c2 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
            } else {
                c2 = impl.c(1.0f, 1.0f, 1.0f);
            }
            c2.addListener(new d(impl, z, bVar));
            ArrayList<Animator.AnimatorListener> arrayList = impl.t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    c2.addListener(it.next());
                }
            }
            c2.start();
            return;
        }
        impl.w.b(0, z);
        impl.w.setAlpha(1.0f);
        impl.w.setScaleY(1.0f);
        impl.w.setScaleX(1.0f);
        impl.q(1.0f);
        if (bVar != null) {
            bVar.a.b(bVar.b);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1162g != colorStateList) {
            this.f1162g = colorStateList;
            e impl = getImpl();
            f.h.b.c.y.g gVar = impl.b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            f.h.b.c.r.a aVar = impl.f5374d;
            if (aVar != null) {
                aVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1163h != mode) {
            this.f1163h = mode;
            f.h.b.c.y.g gVar = getImpl().b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f2) {
        e impl = getImpl();
        if (impl.f5378h != f2) {
            impl.f5378h = f2;
            impl.m(f2, impl.f5379i, impl.f5380j);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        e impl = getImpl();
        if (impl.f5379i != f2) {
            impl.f5379i = f2;
            impl.m(impl.f5378h, f2, impl.f5380j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        e impl = getImpl();
        if (impl.f5380j != f2) {
            impl.f5380j = f2;
            impl.m(impl.f5378h, impl.f5379i, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 >= 0) {
            if (i2 != this.n) {
                this.n = i2;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().y(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f5376f) {
            getImpl().f5376f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.u.c = i2;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().o = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.b(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            e impl = getImpl();
            impl.q(impl.q);
            if (this.f1164i != null) {
                n();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.t.c(i2);
        n();
    }

    public void setMaxImageSize(int i2) {
        this.p = i2;
        e impl = getImpl();
        if (impl.r != i2) {
            impl.r = i2;
            impl.q(impl.q);
        }
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().n();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().n();
    }

    public void setShadowPaddingEnabled(boolean z) {
        e impl = getImpl();
        impl.f5377g = z;
        impl.x();
    }

    @Override // f.h.b.c.y.n
    public void setShapeAppearanceModel(f.h.b.c.y.j jVar) {
        getImpl().s(jVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().n = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.b(getContext(), i2));
    }

    public void setSize(int i2) {
        this.n = 0;
        if (i2 != this.f1168m) {
            this.f1168m = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1164i != colorStateList) {
            this.f1164i = colorStateList;
            n();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1165j != mode) {
            this.f1165j = mode;
            n();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().o();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().o();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().o();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.q != z) {
            this.q = z;
            getImpl().k();
        }
    }

    @Override // f.h.b.c.s.y, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public boolean B(FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.r;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final boolean C(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f317f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (C(appBarLayout, floatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                f.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.j(null, false);
                    return true;
                }
                floatingActionButton.q(null, false);
                return true;
            }
            return false;
        }

        public final boolean E(View view, FloatingActionButton floatingActionButton) {
            if (C(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.j(null, false);
                    return true;
                }
                floatingActionButton.q(null, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return B((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void f(CoordinatorLayout.f fVar) {
            if (fVar.f319h == 0) {
                fVar.f319h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int i3;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> e2 = coordinatorLayout.e(floatingActionButton);
            int size = e2.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = e2.get(i5);
                if (view2 instanceof AppBarLayout) {
                    if (D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && E(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(floatingActionButton, i2);
            Rect rect = floatingActionButton.r;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i3 = rect.right;
            } else {
                i3 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i4 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i4 = -rect.top;
            }
            if (i4 != 0) {
                z.p(floatingActionButton, i4);
            }
            if (i3 != 0) {
                z.o(floatingActionButton, i3);
                return true;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.f5159l);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1166k != colorStateList) {
            this.f1166k = colorStateList;
            getImpl().r(this.f1166k);
        }
    }
}

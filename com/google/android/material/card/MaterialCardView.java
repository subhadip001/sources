package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.video_converter.video_compressor.R;
import f.h.b.c.b;
import f.h.b.c.s.r;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import f.h.b.c.y.n;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, n {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f1125k = {16842911};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f1126l = {16842912};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f1127m = {R.attr.state_dragged};

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.c.j.a f1128f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1129g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1130h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1131i;

    /* renamed from: j  reason: collision with root package name */
    public a f1132j;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.materialCardViewStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CardView), attributeSet, R.attr.materialCardViewStyle);
        this.f1130h = false;
        this.f1131i = false;
        this.f1129g = true;
        TypedArray d2 = r.d(getContext(), attributeSet, b.t, R.attr.materialCardViewStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CardView, new int[0]);
        f.h.b.c.j.a aVar = new f.h.b.c.j.a(this, attributeSet, R.attr.materialCardViewStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CardView);
        this.f1128f = aVar;
        aVar.c.r(super.getCardBackgroundColor());
        aVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        aVar.l();
        ColorStateList n0 = f.h.b.c.a.n0(aVar.a.getContext(), d2, 11);
        aVar.n = n0;
        if (n0 == null) {
            aVar.n = ColorStateList.valueOf(-1);
        }
        aVar.f5290h = d2.getDimensionPixelSize(12, 0);
        boolean z = d2.getBoolean(0, false);
        aVar.t = z;
        aVar.a.setLongClickable(z);
        aVar.f5294l = f.h.b.c.a.n0(aVar.a.getContext(), d2, 6);
        aVar.h(f.h.b.c.a.q0(aVar.a.getContext(), d2, 2));
        aVar.f5288f = d2.getDimensionPixelSize(5, 0);
        aVar.f5287e = d2.getDimensionPixelSize(4, 0);
        aVar.f5289g = d2.getInteger(3, 8388661);
        ColorStateList n02 = f.h.b.c.a.n0(aVar.a.getContext(), d2, 7);
        aVar.f5293k = n02;
        if (n02 == null) {
            aVar.f5293k = ColorStateList.valueOf(f.h.b.c.a.m0(aVar.a, R.attr.colorControlHighlight));
        }
        ColorStateList n03 = f.h.b.c.a.n0(aVar.a.getContext(), d2, 1);
        aVar.f5286d.r(n03 == null ? ColorStateList.valueOf(0) : n03);
        aVar.n();
        aVar.c.q(aVar.a.getCardElevation());
        aVar.o();
        aVar.a.setBackgroundInternal(aVar.f(aVar.c));
        Drawable e2 = aVar.a.isClickable() ? aVar.e() : aVar.f5286d;
        aVar.f5291i = e2;
        aVar.a.setForeground(aVar.f(e2));
        d2.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f1128f.c.getBounds());
        return rectF;
    }

    public final void c() {
        f.h.b.c.j.a aVar;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (aVar = this.f1128f).o) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i2 = bounds.bottom;
        aVar.o.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
        aVar.o.setBounds(bounds.left, bounds.top, bounds.right, i2);
    }

    public boolean d() {
        f.h.b.c.j.a aVar = this.f1128f;
        return aVar != null && aVar.t;
    }

    public void e(int i2, int i3, int i4, int i5) {
        super.setContentPadding(i2, i3, i4, i5);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f1128f.c.f5480f.f5488d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f1128f.f5286d.f5480f.f5488d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f1128f.f5292j;
    }

    public int getCheckedIconGravity() {
        return this.f1128f.f5289g;
    }

    public int getCheckedIconMargin() {
        return this.f1128f.f5287e;
    }

    public int getCheckedIconSize() {
        return this.f1128f.f5288f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f1128f.f5294l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f1128f.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f1128f.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f1128f.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f1128f.b.top;
    }

    public float getProgress() {
        return this.f1128f.c.f5480f.f5495k;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f1128f.c.m();
    }

    public ColorStateList getRippleColor() {
        return this.f1128f.f5293k;
    }

    public j getShapeAppearanceModel() {
        return this.f1128f.f5295m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f1128f.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f1128f.n;
    }

    public int getStrokeWidth() {
        return this.f1128f.f5290h;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1130h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.h.b.c.a.V0(this, this.f1128f.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f1125k);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f1126l);
        }
        if (this.f1131i) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f1127m);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f1128f.g(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f1129g) {
            if (!this.f1128f.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f1128f.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.c.r(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.c.q(aVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f1128f.f5286d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.r(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f1128f.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f1130h != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f1128f.h(drawable);
    }

    public void setCheckedIconGravity(int i2) {
        f.h.b.c.j.a aVar = this.f1128f;
        if (aVar.f5289g != i2) {
            aVar.f5289g = i2;
            aVar.g(aVar.a.getMeasuredWidth(), aVar.a.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i2) {
        this.f1128f.f5287e = i2;
    }

    public void setCheckedIconMarginResource(int i2) {
        if (i2 != -1) {
            this.f1128f.f5287e = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconResource(int i2) {
        this.f1128f.h(e.b.a.b(getContext(), i2));
    }

    public void setCheckedIconSize(int i2) {
        this.f1128f.f5288f = i2;
    }

    public void setCheckedIconSizeResource(int i2) {
        if (i2 != 0) {
            this.f1128f.f5288f = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.f5294l = colorStateList;
        Drawable drawable = aVar.f5292j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        f.h.b.c.j.a aVar = this.f1128f;
        if (aVar != null) {
            Drawable drawable = aVar.f5291i;
            Drawable e2 = aVar.a.isClickable() ? aVar.e() : aVar.f5286d;
            aVar.f5291i = e2;
            if (drawable != e2) {
                if (Build.VERSION.SDK_INT >= 23 && (aVar.a.getForeground() instanceof InsetDrawable)) {
                    ((InsetDrawable) aVar.a.getForeground()).setDrawable(e2);
                } else {
                    aVar.a.setForeground(aVar.f(e2));
                }
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i2, int i3, int i4, int i5) {
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.b.set(i2, i3, i4, i5);
        aVar.l();
    }

    public void setDragged(boolean z) {
        if (this.f1131i != z) {
            this.f1131i = z;
            refreshDrawableState();
            c();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f1128f.m();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f1132j = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f1128f.m();
        this.f1128f.l();
    }

    public void setProgress(float f2) {
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.c.s(f2);
        g gVar = aVar.f5286d;
        if (gVar != null) {
            gVar.s(f2);
        }
        g gVar2 = aVar.r;
        if (gVar2 != null) {
            gVar2.s(f2);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.i(aVar.f5295m.e(f2));
        aVar.f5291i.invalidateSelf();
        if (aVar.k() || aVar.j()) {
            aVar.l();
        }
        if (aVar.k()) {
            aVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.f5293k = colorStateList;
        aVar.n();
    }

    public void setRippleColorResource(int i2) {
        f.h.b.c.j.a aVar = this.f1128f;
        aVar.f5293k = e.i.c.a.getColorStateList(getContext(), i2);
        aVar.n();
    }

    @Override // f.h.b.c.y.n
    public void setShapeAppearanceModel(j jVar) {
        setClipToOutline(jVar.d(getBoundsAsRectF()));
        this.f1128f.i(jVar);
    }

    public void setStrokeColor(int i2) {
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        f.h.b.c.j.a aVar = this.f1128f;
        if (i2 != aVar.f5290h) {
            aVar.f5290h = i2;
            aVar.o();
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f1128f.m();
        this.f1128f.l();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (d() && isEnabled()) {
            this.f1130h = !this.f1130h;
            refreshDrawableState();
            c();
            f.h.b.c.j.a aVar = this.f1128f;
            boolean z = this.f1130h;
            Drawable drawable = aVar.f5292j;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
            a aVar2 = this.f1132j;
            if (aVar2 != null) {
                aVar2.a(this, this.f1130h);
            }
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        f.h.b.c.j.a aVar = this.f1128f;
        if (aVar.n != colorStateList) {
            aVar.n = colorStateList;
            aVar.o();
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f1128f.c.r(colorStateList);
    }
}

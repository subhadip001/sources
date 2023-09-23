package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.s.r;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import f.h.b.c.y.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {
    public static final int[] v = {16842911};
    public static final int[] w = {16842912};

    /* renamed from: i  reason: collision with root package name */
    public final f.h.b.c.i.a f1107i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet<a> f1108j;

    /* renamed from: k  reason: collision with root package name */
    public b f1109k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f1110l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f1111m;
    public Drawable n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f1112h;

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
            parcel.writeInt(this.f1112h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                SavedState.class.getClassLoader();
            }
            this.f1112h = parcel.readInt() == 1;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.materialButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Button), attributeSet, R.attr.materialButtonStyle);
        this.f1108j = new LinkedHashSet<>();
        this.s = false;
        this.t = false;
        Context context2 = getContext();
        TypedArray d2 = r.d(context2, attributeSet, f.h.b.c.b.p, R.attr.materialButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.r = d2.getDimensionPixelSize(12, 0);
        this.f1110l = f.h.b.c.a.J0(d2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f1111m = f.h.b.c.a.n0(getContext(), d2, 14);
        this.n = f.h.b.c.a.q0(getContext(), d2, 10);
        this.u = d2.getInteger(11, 1);
        this.o = d2.getDimensionPixelSize(13, 0);
        f.h.b.c.i.a aVar = new f.h.b.c.i.a(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Button, new f.h.b.c.y.a(0)).a());
        this.f1107i = aVar;
        aVar.c = d2.getDimensionPixelOffset(1, 0);
        aVar.f5276d = d2.getDimensionPixelOffset(2, 0);
        aVar.f5277e = d2.getDimensionPixelOffset(3, 0);
        aVar.f5278f = d2.getDimensionPixelOffset(4, 0);
        if (d2.hasValue(8)) {
            int dimensionPixelSize = d2.getDimensionPixelSize(8, -1);
            aVar.f5279g = dimensionPixelSize;
            aVar.e(aVar.b.e(dimensionPixelSize));
            aVar.p = true;
        }
        aVar.f5280h = d2.getDimensionPixelSize(20, 0);
        aVar.f5281i = f.h.b.c.a.J0(d2.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f5282j = f.h.b.c.a.n0(aVar.a.getContext(), d2, 6);
        aVar.f5283k = f.h.b.c.a.n0(aVar.a.getContext(), d2, 19);
        aVar.f5284l = f.h.b.c.a.n0(aVar.a.getContext(), d2, 16);
        aVar.q = d2.getBoolean(5, false);
        aVar.s = d2.getDimensionPixelSize(9, 0);
        MaterialButton materialButton = aVar.a;
        AtomicInteger atomicInteger = z.a;
        int f2 = z.e.f(materialButton);
        int paddingTop = aVar.a.getPaddingTop();
        int e2 = z.e.e(aVar.a);
        int paddingBottom = aVar.a.getPaddingBottom();
        if (d2.hasValue(0)) {
            aVar.o = true;
            aVar.a.setSupportBackgroundTintList(aVar.f5282j);
            aVar.a.setSupportBackgroundTintMode(aVar.f5281i);
        } else {
            aVar.g();
        }
        z.e.k(aVar.a, f2 + aVar.c, paddingTop + aVar.f5277e, e2 + aVar.f5276d, paddingBottom + aVar.f5278f);
        d2.recycle();
        setCompoundDrawablePadding(this.r);
        g(this.n != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment == 6 || textAlignment == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (textAlignment != 4) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        f.h.b.c.i.a aVar = this.f1107i;
        return aVar != null && aVar.q;
    }

    public final boolean b() {
        int i2 = this.u;
        return i2 == 3 || i2 == 4;
    }

    public final boolean c() {
        int i2 = this.u;
        return i2 == 1 || i2 == 2;
    }

    public final boolean d() {
        int i2 = this.u;
        return i2 == 16 || i2 == 32;
    }

    public final boolean e() {
        f.h.b.c.i.a aVar = this.f1107i;
        return (aVar == null || aVar.o) ? false : true;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.n, null, null, null);
        } else if (b()) {
            setCompoundDrawablesRelative(null, null, this.n, null);
        } else if (d()) {
            setCompoundDrawablesRelative(null, this.n, null, null);
        }
    }

    public final void g(boolean z) {
        Drawable drawable = this.n;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = e.i.a.l0(drawable).mutate();
            this.n = mutate;
            mutate.setTintList(this.f1111m);
            PorterDuff.Mode mode = this.f1110l;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.n.getIntrinsicWidth();
            }
            int i3 = this.o;
            if (i3 == 0) {
                i3 = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i4 = this.p;
            int i5 = this.q;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.n.setVisible(true, z);
        }
        if (z) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.n) && ((!b() || drawable5 == this.n) && (!d() || drawable4 == this.n))) {
            z2 = false;
        }
        if (z2) {
            f();
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f1107i.f5279g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.u;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.f1111m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1110l;
    }

    public int getInsetBottom() {
        return this.f1107i.f5278f;
    }

    public int getInsetTop() {
        return this.f1107i.f5277e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f1107i.f5284l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (e()) {
            return this.f1107i.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f1107i.f5283k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f1107i.f5280h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f1107i.f5282j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f1107i.f5281i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i2, int i3) {
        if (this.n == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.p = 0;
                if (this.u == 16) {
                    this.q = 0;
                    g(false);
                    return;
                }
                int i4 = this.o;
                if (i4 == 0) {
                    i4 = this.n.getIntrinsicHeight();
                }
                int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - i4) - this.r) - getPaddingBottom()) / 2;
                if (this.q != textHeight) {
                    this.q = textHeight;
                    g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.q = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.u;
        if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
            int i6 = this.o;
            if (i6 == 0) {
                i6 = this.n.getIntrinsicWidth();
            }
            int textWidth = i2 - getTextWidth();
            AtomicInteger atomicInteger = z.a;
            int e2 = (((textWidth - z.e.e(this)) - i6) - this.r) - z.e.f(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                e2 /= 2;
            }
            if ((z.e.d(this) == 1) != (this.u == 4)) {
                e2 = -e2;
            }
            if (this.p != e2) {
                this.p = e2;
                g(false);
                return;
            }
            return;
        }
        this.p = 0;
        g(false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.s;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            f.h.b.c.a.V0(this, this.f1107i.b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, w);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        f.h.b.c.i.a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f1107i) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = aVar.f5285m;
            if (drawable != null) {
                drawable.setBounds(aVar.c, aVar.f5277e, i7 - aVar.f5276d, i6 - aVar.f5278f);
            }
        }
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        setChecked(savedState.f1112h);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1112h = this.s;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.n != null) {
            if (this.n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.b() != null) {
                aVar.b().setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                f.h.b.c.i.a aVar = this.f1107i;
                aVar.o = true;
                aVar.a.setSupportBackgroundTintList(aVar.f5282j);
                aVar.a.setSupportBackgroundTintMode(aVar.f5281i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? e.b.a.b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.f1107i.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.s != z) {
            this.s = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.s;
                if (!materialButtonToggleGroup.f1118k) {
                    materialButtonToggleGroup.b(getId(), z2);
                }
            }
            if (this.t) {
                return;
            }
            this.t = true;
            Iterator<a> it = this.f1108j.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.s);
            }
            this.t = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.p && aVar.f5279g == i2) {
                return;
            }
            aVar.f5279g = i2;
            aVar.p = true;
            aVar.e(aVar.b.e(i2));
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            g b2 = this.f1107i.b();
            g.b bVar = b2.f5480f;
            if (bVar.o != f2) {
                bVar.o = f2;
                b2.z();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.u != i2) {
            this.u = i2;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.r != i2) {
            this.r = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? e.b.a.b(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 >= 0) {
            if (this.o != i2) {
                this.o = i2;
                g(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1111m != colorStateList) {
            this.f1111m = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1110l != mode) {
            this.f1110l = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(e.i.c.a.getColorStateList(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        f.h.b.c.i.a aVar = this.f1107i;
        aVar.f(aVar.f5277e, i2);
    }

    public void setInsetTop(int i2) {
        f.h.b.c.i.a aVar = this.f1107i;
        aVar.f(i2, aVar.f5278f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f1109k = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f1109k;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.f5284l != colorStateList) {
                aVar.f5284l = colorStateList;
                boolean z = f.h.b.c.i.a.t;
                if (z && (aVar.a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.a.getBackground()).setColor(f.h.b.c.w.b.b(colorStateList));
                } else if (z || !(aVar.a.getBackground() instanceof f.h.b.c.w.a)) {
                } else {
                    ((f.h.b.c.w.a) aVar.a.getBackground()).setTintList(f.h.b.c.w.b.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (e()) {
            setRippleColor(e.i.c.a.getColorStateList(getContext(), i2));
        }
    }

    @Override // f.h.b.c.y.n
    public void setShapeAppearanceModel(j jVar) {
        if (e()) {
            this.f1107i.e(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            aVar.n = z;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.f5283k != colorStateList) {
                aVar.f5283k = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (e()) {
            setStrokeColor(e.i.c.a.getColorStateList(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.f5280h != i2) {
                aVar.f5280h = i2;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.f5282j != colorStateList) {
                aVar.f5282j = colorStateList;
                if (aVar.b() != null) {
                    aVar.b().setTintList(aVar.f5282j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            f.h.b.c.i.a aVar = this.f1107i;
            if (aVar.f5281i != mode) {
                aVar.f5281i = mode;
                if (aVar.b() == null || aVar.f5281i == null) {
                    return;
                }
                aVar.b().setTintMode(aVar.f5281i);
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.s);
    }
}

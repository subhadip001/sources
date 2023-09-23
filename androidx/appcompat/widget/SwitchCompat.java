package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.video_converter.video_compressor.R;
import e.b.h.e0;
import e.b.h.f1;
import e.b.h.l;
import e.b.h.u0;
import e.b.h.y;
import e.b.h.z0;
import e.i.j.x;
import e.i.j.z;
import e.n.a.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> W = new a(Float.class, "thumbPos");
    public static final int[] a0 = {16842912};
    public float A;
    public float B;
    public VelocityTracker C;
    public int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final TextPaint M;
    public ColorStateList N;
    public Layout O;
    public Layout P;
    public TransformationMethod Q;
    public ObjectAnimator R;
    public final y S;
    public l T;
    public b U;
    public final Rect V;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f223f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f224g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f225h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f226i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f227j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f228k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f229l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f230m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public boolean x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.E);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h.e {
        public final Reference<SwitchCompat> a;

        public b(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // e.n.a.h.e
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }

        @Override // e.n.a.h.e
        public void b() {
            SwitchCompat switchCompat = this.a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int resourceId;
        this.f224g = null;
        this.f225h = null;
        this.f226i = false;
        this.f227j = false;
        this.f229l = null;
        this.f230m = null;
        this.n = false;
        this.o = false;
        this.C = VelocityTracker.obtain();
        this.V = new Rect();
        u0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = e.b.b.x;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        z0 z0Var = new z0(context, obtainStyledAttributes);
        z.v(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle, 0);
        Drawable g2 = z0Var.g(2);
        this.f223f = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        Drawable g3 = z0Var.g(11);
        this.f228k = g3;
        if (g3 != null) {
            g3.setCallback(this);
        }
        setTextOnInternal(z0Var.n(0));
        setTextOffInternal(z0Var.n(1));
        this.x = z0Var.a(3, true);
        this.p = z0Var.f(8, 0);
        this.q = z0Var.f(5, 0);
        this.r = z0Var.f(6, 0);
        this.s = z0Var.a(4, false);
        ColorStateList c = z0Var.c(9);
        if (c != null) {
            this.f224g = c;
            this.f226i = true;
        }
        PorterDuff.Mode e2 = e0.e(z0Var.j(10, -1), null);
        if (this.f225h != e2) {
            this.f225h = e2;
            this.f227j = true;
        }
        if (this.f226i || this.f227j) {
            a();
        }
        ColorStateList c2 = z0Var.c(12);
        if (c2 != null) {
            this.f229l = c2;
            this.n = true;
        }
        PorterDuff.Mode e3 = e0.e(z0Var.j(13, -1), null);
        if (this.f230m != e3) {
            this.f230m = e3;
            this.o = true;
        }
        if (this.n || this.o) {
            b();
        }
        int l2 = z0Var.l(7, 0);
        if (l2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(l2, e.b.b.y);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = e.i.c.a.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.N = colorStateList;
            } else {
                this.N = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes2.getInt(1, -1);
            int i3 = obtainStyledAttributes2.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(create);
                int i4 = (~(create != null ? create.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.Q = new e.b.f.a(getContext());
            } else {
                this.Q = null;
            }
            setTextOnInternal(this.t);
            setTextOffInternal(this.v);
            obtainStyledAttributes2.recycle();
        }
        y yVar = new y(this);
        this.S = yVar;
        yVar.e(attributeSet, R.attr.switchStyle);
        z0Var.b.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private l getEmojiTextViewHelper() {
        if (this.T == null) {
            this.T = new l(this);
        }
        return this.T;
    }

    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }

    private int getThumbOffset() {
        float f2;
        if (f1.b(this)) {
            f2 = 1.0f - this.E;
        } else {
            f2 = this.E;
        }
        return (int) ((f2 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f228k;
        if (drawable != null) {
            Rect rect2 = this.V;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f223f;
            if (drawable2 != null) {
                rect = e0.d(drawable2);
            } else {
                rect = e0.c;
            }
            return ((((this.F - this.H) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.v = charSequence;
        this.w = c(charSequence);
        this.P = null;
        if (this.x) {
            h();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.t = charSequence;
        this.u = c(charSequence);
        this.O = null;
        if (this.x) {
            h();
        }
    }

    public final void a() {
        Drawable drawable = this.f223f;
        if (drawable != null) {
            if (this.f226i || this.f227j) {
                Drawable mutate = e.i.a.l0(drawable).mutate();
                this.f223f = mutate;
                if (this.f226i) {
                    mutate.setTintList(this.f224g);
                }
                if (this.f227j) {
                    this.f223f.setTintMode(this.f225h);
                }
                if (this.f223f.isStateful()) {
                    this.f223f.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f228k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable mutate = e.i.a.l0(drawable).mutate();
                this.f228k = mutate;
                if (this.n) {
                    mutate.setTintList(this.f229l);
                }
                if (this.o) {
                    this.f228k.setTintMode(this.f230m);
                }
                if (this.f228k.isStateful()) {
                    this.f228k.setState(getDrawableState());
                }
            }
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        TransformationMethod e2 = getEmojiTextViewHelper().b.a.e(this.Q);
        return e2 != null ? e2.getTransformation(charSequence, this) : charSequence;
    }

    public final Layout d(CharSequence charSequence) {
        TextPaint textPaint = this.M;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        Rect rect2 = this.V;
        int i4 = this.I;
        int i5 = this.J;
        int i6 = this.K;
        int i7 = this.L;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f223f;
        if (drawable != null) {
            rect = e0.d(drawable);
        } else {
            rect = e0.c;
        }
        Drawable drawable2 = this.f228k;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i8 = rect2.left;
            thumbOffset += i8;
            if (rect != null) {
                int i9 = rect.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f228k.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f228k.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f223f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.H + rect2.right;
            this.f223f.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f223f;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
        Drawable drawable2 = this.f228k;
        if (drawable2 != null) {
            drawable2.setHotspot(f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f223f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f228k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void e() {
        setTextOnInternal(this.t);
        setTextOffInternal(this.v);
        requestLayout();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.v;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            AtomicInteger atomicInteger = z.a;
            new x(R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.t;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            AtomicInteger atomicInteger = z.a;
            new x(R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!f1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (f1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e.i.a.k0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.x;
    }

    public boolean getSplitTrack() {
        return this.s;
    }

    public int getSwitchMinWidth() {
        return this.q;
    }

    public int getSwitchPadding() {
        return this.r;
    }

    public CharSequence getTextOff() {
        return this.v;
    }

    public CharSequence getTextOn() {
        return this.t;
    }

    public Drawable getThumbDrawable() {
        return this.f223f;
    }

    public int getThumbTextPadding() {
        return this.p;
    }

    public ColorStateList getThumbTintList() {
        return this.f224g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f225h;
    }

    public Drawable getTrackDrawable() {
        return this.f228k;
    }

    public ColorStateList getTrackTintList() {
        return this.f229l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f230m;
    }

    public final void h() {
        if (this.U == null && this.T.b.a.b() && h.c()) {
            h a2 = h.a();
            int b2 = a2.b();
            if (b2 == 3 || b2 == 0) {
                b bVar = new b(this);
                this.U = bVar;
                a2.j(bVar);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f223f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f228k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.R.end();
        this.R = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, a0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.V;
        Drawable drawable = this.f228k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.J;
        int i3 = this.L;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f223f;
        if (drawable != null) {
            if (this.s && drawable2 != null) {
                Rect d2 = e0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d2.left;
                rect.right -= d2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.O : this.P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.N;
            if (colorStateList != null) {
                this.M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t : this.v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i2, i3, i4, i5);
        int i10 = 0;
        if (this.f223f != null) {
            Rect rect = this.V;
            Drawable drawable = this.f228k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d2 = e0.d(this.f223f);
            i6 = Math.max(0, d2.left - rect.left);
            i10 = Math.max(0, d2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (f1.b(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.F + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.F) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.G;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            i8 = i11 + height;
            i9 = height;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.G + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.G;
        }
        this.I = i7;
        this.J = i9;
        this.L = i8;
        this.K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.x) {
            if (this.O == null) {
                this.O = d(this.u);
            }
            if (this.P == null) {
                this.P = d(this.w);
            }
        }
        Rect rect = this.V;
        Drawable drawable = this.f223f;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f223f.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f223f.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.x) {
            i6 = (this.p * 2) + Math.max(this.O.getWidth(), this.P.getWidth());
        } else {
            i6 = 0;
        }
        this.H = Math.max(i6, i4);
        Drawable drawable2 = this.f228k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f228k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f223f;
        if (drawable3 != null) {
            Rect d2 = e0.d(drawable3);
            i8 = Math.max(i8, d2.left);
            i9 = Math.max(i9, d2.right);
        }
        int max = Math.max(this.q, (this.H * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.F = max;
        this.G = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b.a.c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            g();
        } else {
            f();
        }
        if (getWindowToken() != null) {
            AtomicInteger atomicInteger = z.a;
            if (z.g.c(this)) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, W, isChecked ? 1.0f : 0.0f);
                this.R = ofFloat;
                ofFloat.setDuration(250L);
                this.R.setAutoCancel(true);
                this.R.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e.i.a.m0(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().b.a.d(z);
        setTextOnInternal(this.t);
        setTextOffInternal(this.v);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().b.a.a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.x != z) {
            this.x = z;
            requestLayout();
            if (z) {
                h();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.M.getTypeface() == null || this.M.getTypeface().equals(typeface)) && (this.M.getTypeface() != null || typeface == null)) {
            return;
        }
        this.M.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        f();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            g();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f223f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f223f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.E = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(e.b.a.b(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f224g = colorStateList;
        this.f226i = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f225h = mode;
        this.f227j = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f228k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f228k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(e.b.a.b(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f229l = colorStateList;
        this.n = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f230m = mode;
        this.o = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f223f || drawable == this.f228k;
    }
}

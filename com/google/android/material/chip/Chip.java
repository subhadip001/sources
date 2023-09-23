package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.gms.common.api.Api;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import f.h.b.c.c.g;
import f.h.b.c.l.c;
import f.h.b.c.s.i;
import f.h.b.c.s.r;
import f.h.b.c.v.d;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import f.h.b.c.y.n;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements c.a, n, i<Chip> {
    public static final Rect C = new Rect();
    public static final int[] D = {16842913};
    public static final int[] E = {16842911};
    public final RectF A;
    public final d B;

    /* renamed from: j  reason: collision with root package name */
    public c f1133j;

    /* renamed from: k  reason: collision with root package name */
    public InsetDrawable f1134k;

    /* renamed from: l  reason: collision with root package name */
    public RippleDrawable f1135l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f1136m;
    public CompoundButton.OnCheckedChangeListener n;
    public i.a<Chip> o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public CharSequence w;
    public final b x;
    public boolean y;
    public final Rect z;

    /* loaded from: classes.dex */
    public class a extends d {
        public a() {
        }

        @Override // f.h.b.c.v.d
        public void a(int i2) {
        }

        @Override // f.h.b.c.v.d
        public void b(Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            c cVar = chip.f1133j;
            if (cVar.K0) {
                text = cVar.L;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends e.k.a.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // e.k.a.a
        public void m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.C;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                c cVar = chip2.f1133j;
                if (cVar != null && cVar.R) {
                    z = true;
                }
                if (!z || chip2.f1136m == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // e.k.a.a
        public boolean p(int i2, int i3, Bundle bundle) {
            if (i3 == 16) {
                if (i2 == 0) {
                    return Chip.this.performClick();
                }
                if (i2 == 1) {
                    return Chip.this.g();
                }
                return false;
            }
            return false;
        }

        @Override // e.k.a.a
        public void q(int i2, e.i.j.h0.d dVar) {
            if (i2 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    dVar.a.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    dVar.a.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                dVar.a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                dVar.a(d.a.f2534g);
                dVar.a.setEnabled(Chip.this.isEnabled());
                return;
            }
            dVar.a.setContentDescription("");
            dVar.a.setBoundsInParent(Chip.C);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, R.attr.chipStyle);
        int resourceId;
        this.z = new Rect();
        this.A = new RectF();
        this.B = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        c cVar = new c(context2, attributeSet, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action);
        Context context3 = cVar.l0;
        int[] iArr = f.h.b.c.b.f5153f;
        TypedArray d2 = r.d(context3, attributeSet, iArr, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        cVar.M0 = d2.hasValue(37);
        ColorStateList n0 = f.h.b.c.a.n0(cVar.l0, d2, 24);
        if (cVar.E != n0) {
            cVar.E = n0;
            cVar.onStateChange(cVar.getState());
        }
        cVar.R(f.h.b.c.a.n0(cVar.l0, d2, 11));
        cVar.Y(d2.getDimension(19, 0.0f));
        if (d2.hasValue(12)) {
            cVar.S(d2.getDimension(12, 0.0f));
        }
        cVar.a0(f.h.b.c.a.n0(cVar.l0, d2, 22));
        cVar.b0(d2.getDimension(23, 0.0f));
        cVar.l0(f.h.b.c.a.n0(cVar.l0, d2, 36));
        cVar.m0(d2.getText(5));
        f.h.b.c.v.b bVar = (!d2.hasValue(0) || (resourceId = d2.getResourceId(0, 0)) == 0) ? null : new f.h.b.c.v.b(cVar.l0, resourceId);
        bVar.f5458k = d2.getDimension(1, bVar.f5458k);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            bVar.f5457j = f.h.b.c.a.n0(cVar.l0, d2, 2);
        }
        cVar.r0.b(bVar, cVar.l0);
        int i3 = d2.getInt(3, 0);
        if (i3 == 1) {
            cVar.J0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            cVar.J0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            cVar.J0 = TextUtils.TruncateAt.END;
        }
        cVar.X(d2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            cVar.X(d2.getBoolean(15, false));
        }
        cVar.U(f.h.b.c.a.q0(cVar.l0, d2, 14));
        if (d2.hasValue(17)) {
            cVar.W(f.h.b.c.a.n0(cVar.l0, d2, 17));
        }
        cVar.V(d2.getDimension(16, -1.0f));
        cVar.i0(d2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            cVar.i0(d2.getBoolean(26, false));
        }
        cVar.c0(f.h.b.c.a.q0(cVar.l0, d2, 25));
        cVar.h0(f.h.b.c.a.n0(cVar.l0, d2, 30));
        cVar.e0(d2.getDimension(28, 0.0f));
        cVar.N(d2.getBoolean(6, false));
        cVar.Q(d2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            cVar.Q(d2.getBoolean(8, false));
        }
        cVar.O(f.h.b.c.a.q0(cVar.l0, d2, 7));
        if (d2.hasValue(9)) {
            cVar.P(f.h.b.c.a.n0(cVar.l0, d2, 9));
        }
        cVar.b0 = g.a(cVar.l0, d2, 39);
        cVar.c0 = g.a(cVar.l0, d2, 33);
        cVar.Z(d2.getDimension(21, 0.0f));
        cVar.k0(d2.getDimension(35, 0.0f));
        cVar.j0(d2.getDimension(34, 0.0f));
        cVar.o0(d2.getDimension(41, 0.0f));
        cVar.n0(d2.getDimension(40, 0.0f));
        cVar.f0(d2.getDimension(29, 0.0f));
        cVar.d0(d2.getDimension(27, 0.0f));
        cVar.T(d2.getDimension(13, 0.0f));
        cVar.L0 = d2.getDimensionPixelSize(4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        d2.recycle();
        r.a(context2, attributeSet, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action);
        r.b(context2, attributeSet, iArr, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action);
        this.t = obtainStyledAttributes.getBoolean(32, false);
        this.v = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(f.h.b.c.a.h0(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(cVar);
        cVar.q(z.i.i(this));
        r.a(context2, attributeSet, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action);
        r.b(context2, attributeSet, iArr, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Chip_Action);
        if (i2 < 23) {
            setTextColor(f.h.b.c.a.n0(context2, obtainStyledAttributes2, 2));
        }
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.x = new b(this);
        i();
        if (!hasValue) {
            setOutlineProvider(new f.h.b.c.l.b(this));
        }
        setChecked(this.p);
        setText(cVar.L);
        setEllipsize(cVar.J0);
        l();
        if (!this.f1133j.K0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        k();
        if (this.t) {
            setMinHeight(this.v);
        }
        this.u = z.e.d(this);
        super.setOnCheckedChangeListener(new f.h.b.c.l.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.A.setEmpty();
        if (e() && this.f1136m != null) {
            c cVar = this.f1133j;
            cVar.E(cVar.getBounds(), this.A);
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.z.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.z;
    }

    private f.h.b.c.v.b getTextAppearance() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.r0.f5442f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.r != z) {
            this.r = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    @Override // f.h.b.c.l.c.a
    public void a() {
        d(this.v);
        requestLayout();
        invalidateOutline();
    }

    public boolean d(int i2) {
        this.v = i2;
        if (!this.t) {
            if (this.f1134k != null) {
                h();
            } else {
                int[] iArr = f.h.b.c.w.b.a;
                j();
            }
            return false;
        }
        int max = Math.max(0, i2 - ((int) this.f1133j.G));
        int max2 = Math.max(0, i2 - this.f1133j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f1134k != null) {
                h();
            } else {
                int[] iArr2 = f.h.b.c.w.b.a;
                j();
            }
            return false;
        }
        int i3 = max2 > 0 ? max2 / 2 : 0;
        int i4 = max > 0 ? max / 2 : 0;
        if (this.f1134k != null) {
            Rect rect = new Rect();
            this.f1134k.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                int[] iArr3 = f.h.b.c.w.b.a;
                j();
                return true;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f1134k = new InsetDrawable((Drawable) this.f1133j, i3, i4, i3, i4);
        int[] iArr4 = f.h.b.c.w.b.a;
        j();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.y
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.x
            android.view.accessibility.AccessibilityManager r1 = r0.f2588h
            boolean r1 = r1.isEnabled()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L74
            android.view.accessibility.AccessibilityManager r1 = r0.f2588h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1e
            goto L74
        L1e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L44
            r4 = 9
            if (r1 == r4) goto L44
            r4 = 10
            if (r1 == r4) goto L34
            goto L74
        L34:
            int r1 = r0.f2593m
            if (r1 == r7) goto L74
            if (r1 != r7) goto L3b
            goto L72
        L3b:
            r0.f2593m = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L72
        L44:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L62
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = b(r8)
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            int r4 = r0.f2593m
            if (r4 != r1) goto L68
            goto L70
        L68:
            r0.f2593m = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L70:
            if (r1 == r7) goto L74
        L72:
            r0 = 1
            goto L75
        L74:
            r0 = 0
        L75:
            if (r0 != 0) goto L7d
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L7e
        L7d:
            r2 = 1
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.y) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.x;
        Objects.requireNonNull(bVar);
        boolean z = false;
        int i2 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && bVar.n(i3, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = bVar.f2592l;
                    if (i4 != Integer.MIN_VALUE) {
                        bVar.p(i4, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = bVar.n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = bVar.n(1, null);
            }
        }
        if (!z || this.x.f2592l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f1133j;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (cVar != null && c.K(cVar.S)) {
            c cVar2 = this.f1133j;
            ?? isEnabled = isEnabled();
            int i3 = isEnabled;
            if (this.s) {
                i3 = isEnabled + 1;
            }
            int i4 = i3;
            if (this.r) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.q) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.s) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.r) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.q) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            z = cVar2.g0(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        c cVar = this.f1133j;
        return (cVar == null || cVar.H() == null) ? false : true;
    }

    public boolean f() {
        c cVar = this.f1133j;
        return cVar != null && cVar.X;
    }

    public boolean g() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f1136m;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.y) {
            this.x.s(1, 1);
        }
        return z;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f1140m.f5396d) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1134k;
        return insetDrawable == null ? this.f1133j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.Z;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.a0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.F;
        }
        return null;
    }

    public float getChipCornerRadius() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return Math.max(0.0f, cVar.G());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1133j;
    }

    public float getChipEndPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.k0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        c cVar = this.f1133j;
        if (cVar == null || (drawable = cVar.N) == null) {
            return null;
        }
        return e.i.a.j0(drawable);
    }

    public float getChipIconSize() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.P;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.O;
        }
        return null;
    }

    public float getChipMinHeight() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.G;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.d0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.I;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.J;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.H();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.W;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.j0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.V;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.i0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.U;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.J0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.y) {
            b bVar = this.x;
            if (bVar.f2592l == 1 || bVar.f2591k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.c0;
        }
        return null;
    }

    public float getIconEndPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.f0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.e0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.K;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f1133j.f5480f.a;
    }

    public g getShowMotionSpec() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.b0;
        }
        return null;
    }

    public float getTextEndPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.h0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        c cVar = this.f1133j;
        if (cVar != null) {
            return cVar.g0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f1134k != null) {
            this.f1134k = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = f.h.b.c.w.b.a;
            j();
        }
    }

    public final void i() {
        if (e()) {
            c cVar = this.f1133j;
            if ((cVar != null && cVar.R) && this.f1136m != null) {
                z.w(this, this.x);
                this.y = true;
                return;
            }
        }
        z.w(this, null);
        this.y = false;
    }

    public final void j() {
        this.f1135l = new RippleDrawable(f.h.b.c.w.b.b(this.f1133j.K), getBackgroundDrawable(), null);
        this.f1133j.p0(false);
        RippleDrawable rippleDrawable = this.f1135l;
        AtomicInteger atomicInteger = z.a;
        z.d.q(this, rippleDrawable);
        k();
    }

    public final void k() {
        c cVar;
        if (TextUtils.isEmpty(getText()) || (cVar = this.f1133j) == null) {
            return;
        }
        int F = (int) (cVar.F() + cVar.k0 + cVar.h0);
        c cVar2 = this.f1133j;
        int C2 = (int) (cVar2.C() + cVar2.d0 + cVar2.g0);
        if (this.f1134k != null) {
            Rect rect = new Rect();
            this.f1134k.getPadding(rect);
            C2 += rect.left;
            F += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = z.a;
        z.e.k(this, C2, paddingTop, F, paddingBottom);
    }

    public final void l() {
        TextPaint paint = getPaint();
        c cVar = this.f1133j;
        if (cVar != null) {
            paint.drawableState = cVar.getState();
        }
        f.h.b.c.v.b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.B);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.h.b.c.a.V0(this, this.f1133j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.y) {
            b bVar = this.x;
            int i3 = bVar.f2592l;
            if (i3 != Integer.MIN_VALUE) {
                bVar.k(i3);
            }
            if (z) {
                bVar.n(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f5411h) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i2 = i4;
            } else {
                i2 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.c.a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i2, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.u != i2) {
            this.u = i2;
            k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.q
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.q
            if (r0 == 0) goto L34
            r5.g()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.w = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f1135l) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f1135l) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.N(z);
        }
    }

    public void setCheckableResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.N(cVar.l0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        c cVar = this.f1133j;
        if (cVar == null) {
            this.p = z;
        } else if (cVar.X) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.O(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.O(e.b.a.b(cVar.l0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.P(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.P(e.i.c.a.getColorStateList(cVar.l0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.Q(cVar.l0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.F == colorStateList) {
            return;
        }
        cVar.F = colorStateList;
        cVar.onStateChange(cVar.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.R(e.i.c.a.getColorStateList(cVar.l0, i2));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.S(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.S(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(c cVar) {
        c cVar2 = this.f1133j;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                cVar2.I0 = new WeakReference<>(null);
            }
            this.f1133j = cVar;
            cVar.K0 = false;
            Objects.requireNonNull(cVar);
            cVar.I0 = new WeakReference<>(this);
            d(this.v);
        }
    }

    public void setChipEndPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.k0 == f2) {
            return;
        }
        cVar.k0 = f2;
        cVar.invalidateSelf();
        cVar.L();
    }

    public void setChipEndPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.T(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(Drawable drawable) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.U(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.U(e.b.a.b(cVar.l0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.V(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.V(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.W(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.W(e.i.c.a.getColorStateList(cVar.l0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.X(cVar.l0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.G == f2) {
            return;
        }
        cVar.G = f2;
        cVar.invalidateSelf();
        cVar.L();
    }

    public void setChipMinHeightResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.Y(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.d0 == f2) {
            return;
        }
        cVar.d0 = f2;
        cVar.invalidateSelf();
        cVar.L();
    }

    public void setChipStartPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.Z(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.a0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.a0(e.i.c.a.getColorStateList(cVar.l0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.b0(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.b0(cVar.l0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.c0(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.W == charSequence) {
            return;
        }
        e.i.h.a c = e.i.h.a.c();
        cVar.W = c.e(charSequence, c.c, true);
        cVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.d0(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.d0(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.c0(e.b.a.b(cVar.l0, i2));
        }
        i();
    }

    public void setCloseIconSize(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.e0(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.e0(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.f0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.f0(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.h0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.h0(e.i.c.a.getColorStateList(cVar.l0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c cVar = this.f1133j;
        if (cVar != null) {
            g.b bVar = cVar.f5480f;
            if (bVar.o != f2) {
                bVar.o = f2;
                cVar.z();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1133j == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            c cVar = this.f1133j;
            if (cVar != null) {
                cVar.J0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.t = z;
        d(this.v);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(f.h.b.c.c.g gVar) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.c0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.c0 = f.h.b.c.c.g.b(cVar.l0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.j0(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.j0(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.k0(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.k0(cVar.l0.getResources().getDimension(i2));
        }
    }

    @Override // f.h.b.c.s.i
    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.o = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f1133j == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.L0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1136m = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.l0(colorStateList);
        }
        if (this.f1133j.G0) {
            return;
        }
        j();
    }

    public void setRippleColorResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.l0(e.i.c.a.getColorStateList(cVar.l0, i2));
            if (this.f1133j.G0) {
                return;
            }
            j();
        }
    }

    @Override // f.h.b.c.y.n
    public void setShapeAppearanceModel(j jVar) {
        c cVar = this.f1133j;
        cVar.f5480f.a = jVar;
        cVar.invalidateSelf();
    }

    public void setShowMotionSpec(f.h.b.c.c.g gVar) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.b0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.b0 = f.h.b.c.c.g.b(cVar.l0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c cVar = this.f1133j;
        if (cVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(cVar.K0 ? null : charSequence, bufferType);
        c cVar2 = this.f1133j;
        if (cVar2 != null) {
            cVar2.m0(charSequence);
        }
    }

    public void setTextAppearance(f.h.b.c.v.b bVar) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.r0.b(bVar, cVar.l0);
        }
        l();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.h0 == f2) {
            return;
        }
        cVar.h0 = f2;
        cVar.invalidateSelf();
        cVar.L();
    }

    public void setTextEndPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.n0(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setTextStartPadding(float f2) {
        c cVar = this.f1133j;
        if (cVar == null || cVar.g0 == f2) {
            return;
        }
        cVar.g0 = f2;
        cVar.invalidateSelf();
        cVar.L();
    }

    public void setTextStartPaddingResource(int i2) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.o0(cVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconVisible(boolean z) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.i0(z);
        }
        i();
    }

    public void setCheckedIconVisible(boolean z) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.Q(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.X(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.r0.b(new f.h.b.c.v.b(cVar.l0, i2), cVar.l0);
        }
        l();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        c cVar = this.f1133j;
        if (cVar != null) {
            cVar.r0.b(new f.h.b.c.v.b(cVar.l0, i2), cVar.l0);
        }
        l();
    }
}

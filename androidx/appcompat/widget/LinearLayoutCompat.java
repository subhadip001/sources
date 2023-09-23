package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import e.b.b;
import e.b.h.f1;
import e.i.j.z;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public boolean f198f;

    /* renamed from: g  reason: collision with root package name */
    public int f199g;

    /* renamed from: h  reason: collision with root package name */
    public int f200h;

    /* renamed from: i  reason: collision with root package name */
    public int f201i;

    /* renamed from: j  reason: collision with root package name */
    public int f202j;

    /* renamed from: k  reason: collision with root package name */
    public int f203k;

    /* renamed from: l  reason: collision with root package name */
    public float f204l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f205m;
    public int[] n;
    public int[] o;
    public Drawable p;
    public int q;
    public int r;
    public int s;
    public int t;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i2) {
        this.p.setBounds(getPaddingLeft() + this.t, i2, (getWidth() - getPaddingRight()) - this.t, this.r + i2);
        this.p.draw(canvas);
    }

    public void g(Canvas canvas, int i2) {
        this.p.setBounds(i2, getPaddingTop() + this.t, this.q + i2, (getHeight() - getPaddingBottom()) - this.t);
        this.p.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f199g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f199g;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f199g == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i4 = this.f200h;
            if (this.f201i == 1 && (i2 = this.f202j & 112) != 48) {
                if (i2 == 16) {
                    i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f203k) / 2;
                } else if (i2 == 80) {
                    i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f203k;
                }
            }
            return i4 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f199g;
    }

    public Drawable getDividerDrawable() {
        return this.p;
    }

    public int getDividerPadding() {
        return this.t;
    }

    public int getDividerWidth() {
        return this.q;
    }

    public int getGravity() {
        return this.f202j;
    }

    public int getOrientation() {
        return this.f201i;
    }

    public int getShowDividers() {
        return this.s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f204l;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i2 = this.f201i;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }

    public int m() {
        return 0;
    }

    public boolean n(int i2) {
        if (i2 == 0) {
            return (this.s & 1) != 0;
        } else if (i2 == getChildCount()) {
            return (this.s & 4) != 0;
        } else if ((this.s & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void o(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        int left2;
        int bottom;
        if (this.p == null) {
            return;
        }
        int i3 = 0;
        if (this.f201i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && n(i3)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.r);
                }
                i3++;
            }
            if (n(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.r;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean b = f1.b(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && n(i3)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (b) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.q;
                }
                g(canvas, left2);
            }
            i3++;
        }
        if (n(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (b) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i2 = this.q;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.q;
                right = left - i2;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public int p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f198f = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f199g = i2;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("base aligned child index out of range (0, ");
        A.append(getChildCount());
        A.append(")");
        throw new IllegalArgumentException(A.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.p) {
            return;
        }
        this.p = drawable;
        if (drawable != null) {
            this.q = drawable.getIntrinsicWidth();
            this.r = drawable.getIntrinsicHeight();
        } else {
            this.q = 0;
            this.r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.t = i2;
    }

    public void setGravity(int i2) {
        if (this.f202j != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f202j = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f202j;
        if ((8388615 & i4) != i3) {
            this.f202j = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f205m = z;
    }

    public void setOrientation(int i2) {
        if (this.f201i != i2) {
            this.f201i = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.s) {
            requestLayout();
        }
        this.s = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f202j;
        if ((i4 & 112) != i3) {
            this.f202j = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f204l = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Drawable drawable;
        int resourceId;
        this.f198f = true;
        this.f199g = -1;
        this.f200h = 0;
        this.f202j = 8388659;
        int[] iArr = b.o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        z.v(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = obtainStyledAttributes.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f204l = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f199g = obtainStyledAttributes.getInt(3, -1);
        this.f205m = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = e.b.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.s = obtainStyledAttributes.getInt(8, 0);
        this.t = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}

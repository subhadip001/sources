package f.h.b.c.s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowLayout.java */
/* loaded from: classes.dex */
public class g extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public int f5409f;

    /* renamed from: g  reason: collision with root package name */
    public int f5410g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5411h;

    /* renamed from: i  reason: collision with root package name */
    public int f5412i;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        return this.f5411h;
    }

    public int getItemSpacing() {
        return this.f5410g;
    }

    public int getLineSpacing() {
        return this.f5409f;
    }

    public int getRowCount() {
        return this.f5412i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (getChildCount() == 0) {
            this.f5412i = 0;
            return;
        }
        this.f5412i = 1;
        AtomicInteger atomicInteger = z.a;
        boolean z2 = z.e.d(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = (i4 - i2) - paddingLeft;
        int i9 = paddingRight;
        int i10 = paddingTop;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.getMarginStart();
                    i6 = marginLayoutParams.getMarginEnd();
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i9 + i7;
                if (!this.f5411h && measuredWidth > i8) {
                    i10 = this.f5409f + paddingTop;
                    this.f5412i++;
                    i9 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f5412i - 1));
                int i12 = i9 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (z2) {
                    childAt.layout(i8 - measuredWidth2, i10, (i8 - i9) - i7, measuredHeight);
                } else {
                    childAt.layout(i12, i10, measuredWidth2, measuredHeight);
                }
                i9 += childAt.getMeasuredWidth() + i7 + i6 + this.f5410g;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i7 - getPaddingRight();
        int i8 = paddingTop;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i6 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i8 = paddingTop + this.f5409f;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i6;
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i6 + i5 + this.f5410g + paddingLeft;
                if (i10 == getChildCount() - 1) {
                    i9 += i5;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i9;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i4 = CommonUtils.BYTES_IN_A_GIGABYTE;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i4 = CommonUtils.BYTES_IN_A_GIGABYTE;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i4) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i2) {
        this.f5410g = i2;
    }

    public void setLineSpacing(int i2) {
        this.f5409f = i2;
    }

    public void setSingleLine(boolean z) {
        this.f5411h = z;
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5411h = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.h.b.c.b.f5160m, 0, 0);
        this.f5409f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f5410g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}

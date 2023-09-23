package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.video_converter.video_compressor.R;
import e.b.b;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public boolean f185f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f186g;

    /* renamed from: h  reason: collision with root package name */
    public int f187h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187h = -1;
        int[] iArr = b.f1465k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        z.v(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f185f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f185f);
        }
    }

    private void setStacked(boolean z) {
        if (this.f186g != z) {
            if (!z || this.f185f) {
                this.f186g = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.f185f) {
            if (size > this.f187h && this.f186g) {
                setStacked(false);
            }
            this.f187h = size;
        }
        if (this.f186g || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i4, i3);
        if (this.f185f && !this.f186g) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i2, i3);
        }
        int a = a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f186g) {
                int a2 = a(a + 1);
                i5 = a2 >= 0 ? getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i5 = getPaddingBottom() + measuredHeight;
            }
        }
        AtomicInteger atomicInteger = z.a;
        if (z.d.d(this) != i5) {
            setMinimumHeight(i5);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f185f != z) {
            this.f185f = z;
            if (!z && this.f186g) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

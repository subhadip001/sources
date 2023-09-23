package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.R;
import com.google.firebase.inappmessaging.display.internal.Logging;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseModalLayout extends FrameLayout {
    private static final float DEFAULT_MAX_HEIGHT_PCT = -1.0f;
    private static final float DEFAULT_MAX_WIDTH_PCT = -1.0f;
    private DisplayMetrics mDisplay;
    private float mMaxHeightPct;
    private float mMaxWidthPct;
    private List<View> mVisibleChildren;

    public BaseModalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mVisibleChildren = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ModalLayout, 0, 0);
        try {
            this.mMaxWidthPct = obtainStyledAttributes.getFloat(R.styleable.ModalLayout_maxWidthPct, -1.0f);
            this.mMaxHeightPct = obtainStyledAttributes.getFloat(R.styleable.ModalLayout_maxHeightPct, -1.0f);
            obtainStyledAttributes.recycle();
            this.mDisplay = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int calculateBaseHeight(int i2) {
        if (getMaxHeightPct() > 0.0f) {
            Logging.logd("Height: restrict by pct");
            return roundToNearest((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels), 4);
        }
        Logging.logd("Height: restrict by spec");
        return View.MeasureSpec.getSize(i2);
    }

    public int calculateBaseWidth(int i2) {
        if (getMaxWidthPct() > 0.0f) {
            Logging.logd("Width: restrict by pct");
            return roundToNearest((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels), 4);
        }
        Logging.logd("Width: restrict by spec");
        return View.MeasureSpec.getSize(i2);
    }

    public int dpToPixels(int i2) {
        return (int) Math.floor(TypedValue.applyDimension(1, i2, this.mDisplay));
    }

    public View findChildById(int i2) {
        View findViewById = findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException(a.i("No such child: ", i2));
    }

    public int getDesiredHeight(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public int getDesiredWidth(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.mDisplay;
    }

    public int getHeightWithMargins(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = getLayoutParams(view);
        return getDesiredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public FrameLayout.LayoutParams getLayoutParams(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    public int getMarginBottom(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return getLayoutParams(view).bottomMargin;
    }

    public int getMarginTop(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return getLayoutParams(view).topMargin;
    }

    public float getMaxHeightPct() {
        return this.mMaxHeightPct;
    }

    public float getMaxWidthPct() {
        return this.mMaxWidthPct;
    }

    public List<View> getVisibleChildren() {
        return this.mVisibleChildren;
    }

    public int getWidthWithMargins(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = getLayoutParams(view);
        return getDesiredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public void layoutChild(View view, int i2, int i3) {
        layoutChild(view, i2, i3, getDesiredWidth(view) + i2, getDesiredHeight(view) + i3);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        Logging.logdPair("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i2, i3, i4, i5);
        Logging.logdPair("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Logging.logdHeader("BEGIN LAYOUT");
        Logging.logd("onLayout: l: " + i2 + ", t: " + i3 + ", r: " + i4 + ", b: " + i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        Logging.logdHeader("BEGIN MEASURE");
        Logging.logdPair("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        this.mVisibleChildren.clear();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                this.mVisibleChildren.add(childAt);
            } else {
                Logging.logdNumber("Skipping GONE child", i4);
            }
        }
    }

    public int roundToNearest(int i2, int i3) {
        return Math.round(i2 / i3) * i3;
    }

    public void layoutChild(View view, int i2, int i3, int i4, int i5) {
        Logging.logdPair("\tleft, right", i2, i4);
        Logging.logdPair("\ttop, bottom", i3, i5);
        view.layout(i2, i3, i4, i5);
    }
}

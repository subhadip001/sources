package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.R;
import com.google.firebase.inappmessaging.display.internal.Logging;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;
import com.google.firebase.inappmessaging.display.internal.layout.util.VerticalViewGroupMeasure;
import com.google.firebase.inappmessaging.display.internal.layout.util.ViewMeasure;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class ModalLayoutPortrait extends BaseModalLayout {
    private static final int ITEM_SPACING_DP = 24;
    private int vertItemSpacing;
    private VerticalViewGroupMeasure vgm;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.vgm = new VerticalViewGroupMeasure();
    }

    private boolean isFlex(View view) {
        return view.getId() == R.id.body_scroll || view.getId() == R.id.image_view;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z, i2, i3, i4, i5);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = getVisibleChildren().get(i8);
            FrameLayout.LayoutParams layoutParams = getLayoutParams(view);
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i9 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i10 = (i4 - i2) / 2;
                int i11 = measuredWidth / 2;
                i7 = i10 - i11;
                i6 = i10 + i11;
            } else {
                i6 = paddingLeft + measuredWidth;
                i7 = paddingLeft;
            }
            Logging.logd("Layout child " + i8);
            Logging.logdPair("\t(top, bottom)", (float) paddingTop, (float) i9);
            Logging.logdPair("\t(left, right)", (float) i7, (float) i6);
            view.layout(i7, paddingTop, i6, i9);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i8 < size - 1) {
                measuredHeight2 += this.vertItemSpacing;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.vertItemSpacing = dpToPixels(24);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int calculateBaseWidth = calculateBaseWidth(i2);
        int calculateBaseHeight = calculateBaseHeight(i3);
        int size = ((getVisibleChildren().size() - 1) * this.vertItemSpacing) + paddingTop;
        this.vgm.reset(calculateBaseWidth, calculateBaseHeight);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            this.vgm.add(childAt, isFlex(childAt));
        }
        StringBuilder A = a.A("Screen dimens: ");
        A.append(getDisplayMetrics());
        Logging.logd(A.toString());
        Logging.logdPair("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f2 = calculateBaseWidth;
        Logging.logdPair("Base dimens", f2, calculateBaseHeight);
        for (ViewMeasure viewMeasure : this.vgm.getViews()) {
            Logging.logd("Pre-measure child");
            viewMeasure.preMeasure(calculateBaseWidth, calculateBaseHeight);
        }
        int totalHeight = this.vgm.getTotalHeight() + size;
        Logging.logdNumber("Total reserved height", size);
        Logging.logdNumber("Total desired height", totalHeight);
        boolean z = totalHeight > calculateBaseHeight;
        Logging.logd("Total height constrained: " + z);
        if (z) {
            this.vgm.allocateSpace((calculateBaseHeight - size) - this.vgm.getTotalFixedHeight());
        }
        int i5 = calculateBaseWidth - paddingLeft;
        for (ViewMeasure viewMeasure2 : this.vgm.getViews()) {
            Logging.logd("Measuring child");
            MeasureUtils.measureAtMost(viewMeasure2.getView(), i5, viewMeasure2.getMaxHeight());
            size += getDesiredHeight(viewMeasure2.getView());
        }
        Logging.logdPair("Measured dims", f2, size);
        setMeasuredDimension(calculateBaseWidth, size);
    }
}

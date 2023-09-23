package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.inappmessaging.display.R;
import com.google.firebase.inappmessaging.display.internal.Logging;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class ModalLayoutLandscape extends BaseModalLayout {
    private static final int ITEM_SPACING_DP = 24;
    private static final float MAX_IMG_WIDTH_PCT = 0.4f;
    private int barrierWidth;
    private View buttonChild;
    private View imageChild;
    private int leftContentHeight;
    private int rightContentHeight;
    private View scrollChild;
    private View titleChild;
    private int vertItemSpacing;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void layoutCenterHorizontal(View view, int i2, int i3, int i4, int i5) {
        int measuredWidth = view.getMeasuredWidth() / 2;
        int i6 = i2 + ((i4 - i2) / 2);
        layoutChild(view, i6 - measuredWidth, i3, i6 + measuredWidth, i5);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z, i2, i3, i4, i5);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i8 = this.leftContentHeight;
        int i9 = this.rightContentHeight;
        if (i8 < i9) {
            i7 = (i9 - i8) / 2;
            i6 = 0;
        } else {
            i6 = (i8 - i9) / 2;
            i7 = 0;
        }
        Logging.logd("Layout image");
        int i10 = paddingTop + i7;
        int desiredWidth = getDesiredWidth(this.imageChild) + paddingLeft;
        layoutChild(this.imageChild, paddingLeft, i10, desiredWidth, getDesiredHeight(this.imageChild) + i10);
        int i11 = desiredWidth + this.barrierWidth;
        Logging.logd("Layout getTitle");
        int i12 = paddingTop + i6;
        int desiredHeight = getDesiredHeight(this.titleChild) + i12;
        layoutChild(this.titleChild, i11, i12, measuredWidth, desiredHeight);
        Logging.logd("Layout getBody");
        int i13 = desiredHeight + (this.titleChild.getVisibility() == 8 ? 0 : this.vertItemSpacing);
        int desiredHeight2 = getDesiredHeight(this.scrollChild) + i13;
        layoutChild(this.scrollChild, i11, i13, measuredWidth, desiredHeight2);
        Logging.logd("Layout button");
        layoutChild(this.buttonChild, i11, desiredHeight2 + (this.scrollChild.getVisibility() != 8 ? this.vertItemSpacing : 0));
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.imageChild = findChildById(R.id.image_view);
        this.titleChild = findChildById(R.id.message_title);
        this.scrollChild = findChildById(R.id.body_scroll);
        this.buttonChild = findChildById(R.id.button);
        int i4 = 0;
        this.barrierWidth = this.imageChild.getVisibility() == 8 ? 0 : dpToPixels(24);
        this.vertItemSpacing = dpToPixels(24);
        List<View> asList = Arrays.asList(this.titleChild, this.scrollChild, this.buttonChild);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int calculateBaseWidth = calculateBaseWidth(i2);
        int calculateBaseHeight = calculateBaseHeight(i3) - paddingTop;
        int i5 = calculateBaseWidth - paddingRight;
        Logging.logd("Measuring image");
        MeasureUtils.measureAtMost(this.imageChild, (int) (i5 * MAX_IMG_WIDTH_PCT), calculateBaseHeight);
        int desiredWidth = getDesiredWidth(this.imageChild);
        int i6 = i5 - (this.barrierWidth + desiredWidth);
        float f2 = desiredWidth;
        Logging.logdPair("Max col widths (l, r)", f2, i6);
        int i7 = 0;
        for (View view : asList) {
            if (view.getVisibility() != 8) {
                i7++;
            }
        }
        int max = Math.max(0, (i7 - 1) * this.vertItemSpacing);
        int i8 = calculateBaseHeight - max;
        Logging.logd("Measuring getTitle");
        MeasureUtils.measureAtMost(this.titleChild, i6, i8);
        Logging.logd("Measuring button");
        MeasureUtils.measureAtMost(this.buttonChild, i6, i8);
        Logging.logd("Measuring scroll view");
        MeasureUtils.measureAtMost(this.scrollChild, i6, (i8 - getDesiredHeight(this.titleChild)) - getDesiredHeight(this.buttonChild));
        this.leftContentHeight = getDesiredHeight(this.imageChild);
        this.rightContentHeight = max;
        for (View view2 : asList) {
            this.rightContentHeight = getDesiredHeight(view2) + this.rightContentHeight;
        }
        int max2 = Math.max(this.leftContentHeight + paddingTop, this.rightContentHeight + paddingTop);
        for (View view3 : asList) {
            i4 = Math.max(getDesiredWidth(view3), i4);
        }
        Logging.logdPair("Measured columns (l, r)", f2, i4);
        int i9 = desiredWidth + i4 + this.barrierWidth + paddingRight;
        Logging.logdPair("Measured dims", i9, max2);
        setMeasuredDimension(i9, max2);
    }
}

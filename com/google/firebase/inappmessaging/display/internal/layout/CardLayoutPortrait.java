package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.inappmessaging.display.R;
import com.google.firebase.inappmessaging.display.internal.Logging;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;

/* loaded from: classes2.dex */
public class CardLayoutPortrait extends BaseModalLayout {
    private static double IMAGE_MAX_HEIGHT_PCT = 0.8d;
    private View actionBarChild;
    private View imageChild;
    private View scrollChild;
    private View titleChild;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int size = getVisibleChildren().size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            View view = getVisibleChildren().get(i7);
            int measuredHeight = view.getMeasuredHeight() + i6;
            int measuredWidth = view.getMeasuredWidth() + 0;
            Logging.logd("Layout child " + i7);
            Logging.logdPair("\t(top, bottom)", (float) i6, (float) measuredHeight);
            Logging.logdPair("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, i6, measuredWidth, measuredHeight);
            Logging.logdPair("Child " + i7 + " wants to be ", view.getMeasuredWidth(), view.getMeasuredHeight());
            i6 += view.getMeasuredHeight();
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.imageChild = findChildById(R.id.image_view);
        this.titleChild = findChildById(R.id.message_title);
        this.scrollChild = findChildById(R.id.body_scroll);
        this.actionBarChild = findChildById(R.id.action_bar);
        int calculateBaseWidth = calculateBaseWidth(i2);
        int calculateBaseHeight = calculateBaseHeight(i3);
        int roundToNearest = roundToNearest((int) (IMAGE_MAX_HEIGHT_PCT * calculateBaseHeight), 4);
        Logging.logd("Measuring image");
        MeasureUtils.measureFullWidth(this.imageChild, calculateBaseWidth, calculateBaseHeight);
        if (getDesiredHeight(this.imageChild) > roundToNearest) {
            Logging.logd("Image exceeded maximum height, remeasuring image");
            MeasureUtils.measureFullHeight(this.imageChild, calculateBaseWidth, roundToNearest);
        }
        int desiredWidth = getDesiredWidth(this.imageChild);
        Logging.logd("Measuring title");
        MeasureUtils.measureFullWidth(this.titleChild, desiredWidth, calculateBaseHeight);
        Logging.logd("Measuring action bar");
        MeasureUtils.measureFullWidth(this.actionBarChild, desiredWidth, calculateBaseHeight);
        Logging.logd("Measuring scroll view");
        MeasureUtils.measureFullWidth(this.scrollChild, desiredWidth, ((calculateBaseHeight - getDesiredHeight(this.imageChild)) - getDesiredHeight(this.titleChild)) - getDesiredHeight(this.actionBarChild));
        int size = getVisibleChildren().size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += getDesiredHeight(getVisibleChildren().get(i5));
        }
        setMeasuredDimension(desiredWidth, i4);
    }
}

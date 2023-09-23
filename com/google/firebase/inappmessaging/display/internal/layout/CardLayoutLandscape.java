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
public class CardLayoutLandscape extends BaseModalLayout {
    private static double IMAGE_MAX_WIDTH_PCT = 0.6d;
    private View actionBarChild;
    private View imageChild;
    private View scrollChild;
    private View titleChild;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Logging.logd("Layout image");
        int desiredWidth = getDesiredWidth(this.imageChild);
        layoutChild(this.imageChild, 0, 0, desiredWidth, getDesiredHeight(this.imageChild));
        Logging.logd("Layout title");
        int desiredHeight = getDesiredHeight(this.titleChild);
        layoutChild(this.titleChild, desiredWidth, 0, measuredWidth, desiredHeight);
        Logging.logd("Layout scroll");
        layoutChild(this.scrollChild, desiredWidth, desiredHeight, measuredWidth, getDesiredHeight(this.scrollChild) + desiredHeight);
        Logging.logd("Layout action bar");
        layoutChild(this.actionBarChild, desiredWidth, measuredHeight - getDesiredHeight(this.actionBarChild), measuredWidth, measuredHeight);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.imageChild = findChildById(R.id.image_view);
        this.titleChild = findChildById(R.id.message_title);
        this.scrollChild = findChildById(R.id.body_scroll);
        View findChildById = findChildById(R.id.action_bar);
        this.actionBarChild = findChildById;
        int i4 = 0;
        List<View> asList = Arrays.asList(this.titleChild, this.scrollChild, findChildById);
        int calculateBaseWidth = calculateBaseWidth(i2);
        int calculateBaseHeight = calculateBaseHeight(i3);
        int roundToNearest = roundToNearest((int) (IMAGE_MAX_WIDTH_PCT * calculateBaseWidth), 4);
        Logging.logd("Measuring image");
        MeasureUtils.measureFullHeight(this.imageChild, calculateBaseWidth, calculateBaseHeight);
        if (getDesiredWidth(this.imageChild) > roundToNearest) {
            Logging.logd("Image exceeded maximum width, remeasuring image");
            MeasureUtils.measureFullWidth(this.imageChild, roundToNearest, calculateBaseHeight);
        }
        int desiredHeight = getDesiredHeight(this.imageChild);
        int desiredWidth = getDesiredWidth(this.imageChild);
        int i5 = calculateBaseWidth - desiredWidth;
        float f2 = desiredWidth;
        Logging.logdPair("Max col widths (l, r)", f2, i5);
        Logging.logd("Measuring title");
        MeasureUtils.measureAtMost(this.titleChild, i5, desiredHeight);
        Logging.logd("Measuring action bar");
        MeasureUtils.measureAtMost(this.actionBarChild, i5, desiredHeight);
        Logging.logd("Measuring scroll view");
        MeasureUtils.measureFullHeight(this.scrollChild, i5, (desiredHeight - getDesiredHeight(this.titleChild)) - getDesiredHeight(this.actionBarChild));
        for (View view : asList) {
            i4 = Math.max(getDesiredWidth(view), i4);
        }
        Logging.logdPair("Measured columns (l, r)", f2, i4);
        int i6 = desiredWidth + i4;
        Logging.logdPair("Measured dims", i6, desiredHeight);
        setMeasuredDimension(i6, desiredHeight);
    }
}

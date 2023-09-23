package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class ResizableImageView extends AppCompatImageView {
    private int mDensityDpi;

    /* loaded from: classes2.dex */
    public static class Dimensions {

        /* renamed from: h  reason: collision with root package name */
        public final int f1280h;
        public final int w;

        private Dimensions(int i2, int i3) {
            this.w = i2;
            this.f1280h = i3;
        }
    }

    public ResizableImageView(Context context) {
        super(context);
        init(context);
    }

    private Dimensions bound(int i2, int i3) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i2 > maxWidth) {
            Logging.logdNumber("Image: capping width", maxWidth);
            i3 = (i3 * maxWidth) / i2;
            i2 = maxWidth;
        }
        if (i3 > maxHeight) {
            Logging.logdNumber("Image: capping height", maxHeight);
            i2 = (i2 * maxHeight) / i3;
        } else {
            maxHeight = i3;
        }
        return new Dimensions(i2, maxHeight);
    }

    private void checkMinDim() {
        int max = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int max2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = max;
        float f3 = max2;
        Logging.logdPair("Image: min width, height", f2, f3);
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        Logging.logdPair("Image: actual width, height", f4, f5);
        float f6 = measuredWidth < max ? f2 / f4 : 1.0f;
        float f7 = measuredHeight < max2 ? f3 / f5 : 1.0f;
        if (f6 <= f7) {
            f6 = f7;
        }
        if (f6 > 1.0d) {
            int ceil = (int) Math.ceil(f4 * f6);
            int ceil2 = (int) Math.ceil(f5 * f6);
            StringBuilder C = a.C("Measured dimension (", measuredWidth, "x", measuredHeight, ") too small.  Resizing to ");
            C.append(ceil);
            C.append("x");
            C.append(ceil2);
            Logging.logd(C.toString());
            Dimensions bound = bound(ceil, ceil2);
            setMeasuredDimension(bound.w, bound.f1280h);
        }
    }

    private void init(Context context) {
        this.mDensityDpi = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    private void scalePxToDp(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Logging.logdPair("Image: intrinsic width, height", intrinsicWidth, intrinsicHeight);
        Dimensions bound = bound((int) Math.ceil((intrinsicWidth * this.mDensityDpi) / 160), (int) Math.ceil((intrinsicHeight * this.mDensityDpi) / 160));
        Logging.logdPair("Image: new target dimensions", bound.w, bound.f1280h);
        setMeasuredDimension(bound.w, bound.f1280h);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        scalePxToDp(drawable);
        checkMinDim();
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }
}

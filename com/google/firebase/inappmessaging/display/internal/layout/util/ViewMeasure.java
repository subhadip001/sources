package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes2.dex */
public class ViewMeasure {
    private boolean flex;
    private int maxHeight;
    private int maxWidth;
    private View view;

    public ViewMeasure(View view, boolean z) {
        this.view = view;
        this.flex = z;
    }

    public int getDesiredHeight() {
        if (this.view.getVisibility() == 8) {
            return 0;
        }
        View view = this.view;
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            int paddingBottom = scrollView.getPaddingBottom();
            return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + paddingBottom;
        }
        return view.getMeasuredHeight();
    }

    public int getDesiredWidth() {
        if (this.view.getVisibility() == 8) {
            return 0;
        }
        return this.view.getMeasuredHeight();
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public View getView() {
        return this.view;
    }

    public boolean isFlex() {
        return this.flex;
    }

    public void preMeasure(int i2, int i3) {
        MeasureUtils.measureAtMost(this.view, i2, i3);
    }

    public void setMaxDimens(int i2, int i3) {
        this.maxWidth = i2;
        this.maxHeight = i3;
    }
}

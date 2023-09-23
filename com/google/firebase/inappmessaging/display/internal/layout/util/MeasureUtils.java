package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.inappmessaging.display.internal.Logging;

/* loaded from: classes2.dex */
public class MeasureUtils {
    private static void measure(View view, int i2, int i3, int i4, int i5) {
        Logging.logdPair("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i2 = 0;
            i3 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, i4), View.MeasureSpec.makeMeasureSpec(i3, i5));
        Logging.logdPair("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void measureAtMost(View view, int i2, int i3) {
        measure(view, i2, i3, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static void measureExactly(View view, int i2, int i3) {
        measure(view, i2, i3, CommonUtils.BYTES_IN_A_GIGABYTE, CommonUtils.BYTES_IN_A_GIGABYTE);
    }

    public static void measureFullHeight(View view, int i2, int i3) {
        measure(view, i2, i3, Integer.MIN_VALUE, CommonUtils.BYTES_IN_A_GIGABYTE);
    }

    public static void measureFullWidth(View view, int i2, int i3) {
        measure(view, i2, i3, CommonUtils.BYTES_IN_A_GIGABYTE, Integer.MIN_VALUE);
    }
}

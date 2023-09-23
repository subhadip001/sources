package com.video_converter.video_compressor;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* loaded from: classes2.dex */
public class CustomScrollView extends ScrollView {
    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        try {
            try {
                super.onSizeChanged(i2, i3, i4, i5);
            } catch (Exception unused) {
                View currentFocus = ((Activity) getContext()).getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                super.onSizeChanged(i2, i3, i4, i5);
            }
        } catch (Exception e2) {
            FirebaseCrashlytics.getInstance().recordException(e2);
        }
    }
}

package com.nightcode.mediapicker.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class ClippedImageView extends ImageView {
    public ClippedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipToOutline(true);
    }
}

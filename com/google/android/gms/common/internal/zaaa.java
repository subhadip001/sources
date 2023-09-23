package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int zab(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return i5;
                }
                throw new IllegalStateException(a.d(33, "Unknown color scheme: ", i2));
            }
            return i4;
        }
        return i3;
    }

    public final void zaa(Resources resources, int i2, int i3) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i4 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i4);
        setMinWidth(i4);
        int i5 = R.drawable.common_google_signin_btn_icon_dark;
        int i6 = R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i3, i5, i6, i6);
        int i7 = R.drawable.common_google_signin_btn_text_dark;
        int i8 = R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i3, i7, i8, i8);
        if (i2 == 0 || i2 == 1) {
            zab = zab2;
        } else if (i2 != 2) {
            throw new IllegalStateException(a.d(32, "Unknown button size: ", i2));
        }
        Drawable l0 = e.i.a.l0(resources.getDrawable(zab));
        l0.setTintList(resources.getColorStateList(R.color.common_google_signin_btn_tint));
        l0.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(l0);
        int i9 = R.color.common_google_signin_btn_text_dark;
        int i10 = R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i3, i9, i10, i10))));
        if (i2 == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i2 == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i2 == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException(a.d(32, "Unknown button size: ", i2));
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}

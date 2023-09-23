package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhy;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets zzj(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzh.zzC(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzC("");
            }
        }
        zzm(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzm(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i2 = attributes.layoutInDisplayCutoutMode;
        int i3 = true != z ? 2 : 1;
        if (i3 != i2) {
            attributes.layoutInDisplayCutoutMode = i3;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzi(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaZ)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzm() == null && !activity.isInMultiWindowMode()) {
            zzm(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzj(activity, view, windowInsets);
                }
            });
        }
    }
}

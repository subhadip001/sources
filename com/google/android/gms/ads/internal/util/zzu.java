package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzu extends zzt {
    public static final boolean zzf(int i2, int i3, int i4) {
        return Math.abs(i2 - i3) <= i4;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdQ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdS)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            int zzv = zzcfb.zzv(activity, configuration.screenHeightDp);
            int zzv2 = zzcfb.zzv(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i2 = zzr.heightPixels;
            int i3 = zzr.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE);
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdO)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
            return (zzf(i2, zzv + dimensionPixelSize, intValue) && zzf(i3, zzv2, intValue)) ? false : true;
        }
        return false;
    }
}

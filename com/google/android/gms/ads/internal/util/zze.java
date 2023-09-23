package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zze extends zzcfi {
    public static void zza(String str) {
        if (zzc()) {
            if (str != null && str.length() > 4000) {
                boolean z = true;
                for (String str2 : zzcfi.zza.zzd(str)) {
                    if (z) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzcfi.zzm(2) && ((Boolean) zzbjr.zza.zze()).booleanValue();
    }
}

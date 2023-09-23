package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfcs {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzcfi.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        String zzw = zzcfb.zzw(context);
        zzcfi.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzw + "\")) to get test ads on this device.");
    }

    public static void zzb(int i2, Throwable th, String str) {
        zzcfi.zzi("Ad failed to load : " + i2);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i2 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzs(th, str);
    }
}

package com.google.android.gms.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzb {
    public static int zza(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzb(AdSize adSize) {
        return adSize.zza();
    }

    public static AdSize zzc(int i2, int i3, String str) {
        return new AdSize(i2, i3, str);
    }

    public static AdSize zzd(int i2, int i3) {
        AdSize adSize = new AdSize(i2, i3);
        adSize.zze(true);
        adSize.zzc(i3);
        return adSize;
    }

    public static AdSize zze(int i2, int i3) {
        AdSize adSize = new AdSize(i2, i3);
        adSize.zzf(true);
        adSize.zzd(i3);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zzg();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.zzi();
    }
}

package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcuv {
    private final zzfgo zza;
    private final zzdwg zzb;
    private final zzfbs zzc;

    public zzcuv(zzdwg zzdwgVar, zzfbs zzfbsVar, zzfgo zzfgoVar) {
        this.zza = zzfgoVar;
        this.zzb = zzdwgVar;
        this.zzc = zzfbsVar;
    }

    private static String zzb(int i2) {
        int i3 = i2 - 1;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j2, int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgo zzfgoVar = this.zza;
            zzfgn zzb = zzfgn.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j2));
            zzb.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzb.zza("acr", zzb(i2));
            zzfgoVar.zzb(zzb);
            return;
        }
        zzdwf zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j2));
        zza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zza.zzb("acr", zzb(i2));
        zza.zzg();
    }
}

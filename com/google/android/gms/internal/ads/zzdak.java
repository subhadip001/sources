package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdak implements zzden {
    private final Context zza;
    private final zzfby zzb;
    private final zzcfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdyi zze;
    private final zzfhs zzf;

    public zzdak(Context context, zzfby zzfbyVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdyi zzdyiVar, zzfhs zzfhsVar) {
        this.zza = context;
        this.zzb = zzfbyVar;
        this.zzc = zzcfoVar;
        this.zzd = zzgVar;
        this.zze = zzdyiVar;
        this.zzf = zzfhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}

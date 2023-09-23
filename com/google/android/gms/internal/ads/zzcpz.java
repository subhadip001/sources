package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpz implements zzdxp {
    private final Context zza;
    private final zzbpg zzb;
    private final zzcrb zzc;
    private final zzcpz zzd = this;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;

    public /* synthetic */ zzcpz(zzcrb zzcrbVar, Context context, zzbpg zzbpgVar, zzcpy zzcpyVar) {
        this.zzc = zzcrbVar;
        this.zza = context;
        this.zzb = zzbpgVar;
        zzgpu zza = zzgpv.zza(this);
        this.zze = zza;
        zzgpu zza2 = zzgpv.zza(zzbpgVar);
        this.zzf = zza2;
        zzdxl zzdxlVar = new zzdxl(zza2);
        this.zzg = zzdxlVar;
        this.zzh = zzgpt.zzc(new zzdxn(zza, zzdxlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdxp
    public final zzdxg zzb() {
        return new zzcpt(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdxp
    public final zzdxm zzd() {
        return (zzdxm) this.zzh.zzb();
    }
}

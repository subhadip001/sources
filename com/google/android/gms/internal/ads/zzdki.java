package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdki implements zzgpu {
    private final zzdkc zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzdki(zzdkc zzdkcVar, zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4) {
        this.zza = zzdkcVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
        this.zzd = zzgqhVar3;
        this.zze = zzgqhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzcfo zza = ((zzcnu) this.zzc).zza();
        final zzfbg zza2 = ((zzcym) this.zzd).zza();
        final zzfby zza3 = ((zzdbj) this.zze).zza();
        return new zzdiy(new zzddg() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzddg
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zza.zza, zza2.zzD.toString(), zza3.zzf);
            }
        }, zzcfv.zzf);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdib implements zzgpu {
    private final zzdhe zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzdib(zzdhe zzdheVar, zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4) {
        this.zza = zzdheVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
        this.zzd = zzgqhVar3;
        this.zze = zzgqhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeil zzb = this.zza.zzb((Clock) this.zzb.zzb(), ((zzein) this.zzc).zzb(), (zzefd) this.zzd.zzb(), (zzfig) this.zze.zzb());
        zzgqc.zzb(zzb);
        return zzb;
    }
}

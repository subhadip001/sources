package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzczx implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzczx(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdvp zzdvpVar = (zzdvp) this.zza.zzb();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue() ? new zzdiy((zzecv) this.zzc.zzb(), zzfvkVar) : new zzdiy(zzdvpVar, zzfvkVar);
    }
}

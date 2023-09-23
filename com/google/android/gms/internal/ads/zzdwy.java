package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdwy implements zzgpu {
    private final zzdwt zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdwy(zzdwt zzdwtVar, zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzdwtVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        Set zze = zzdwt.zze((zzdxd) this.zzb.zzb(), zzfvkVar);
        zzgqc.zzb(zze);
        return zze;
    }
}

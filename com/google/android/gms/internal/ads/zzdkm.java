package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdkm implements zzgpu {
    private final zzdkc zza;
    private final zzgqh zzb;

    public zzdkm(zzdkc zzdkcVar, zzgqh zzgqhVar) {
        this.zza = zzdkcVar;
        this.zzb = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = this.zza.zzf((zzdas) this.zzb.zzb());
        zzgqc.zzb(zzf);
        return zzf;
    }
}

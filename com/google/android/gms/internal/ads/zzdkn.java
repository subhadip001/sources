package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdkn implements zzgpu {
    private final zzdkc zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdkn(zzdkc zzdkcVar, zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzdkcVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzccv zzb() {
        return new zzccv(((zzfdh) this.zzb).zza(), ((zzdbj) this.zzc).zza().zzf);
    }
}

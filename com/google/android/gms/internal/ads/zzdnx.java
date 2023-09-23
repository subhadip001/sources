package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnx implements zzgpu {
    private final zzdns zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdnx(zzdns zzdnsVar, zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzdnsVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzccv zzb() {
        return new zzccv(((zzfdh) this.zzb).zza(), ((zzdbj) this.zzc).zza().zzf);
    }
}

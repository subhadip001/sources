package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdqz implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdqz(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqx((Executor) this.zza.zzb(), (zzcum) this.zzb.zzb(), (zzdja) this.zzc.zzb());
    }
}

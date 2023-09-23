package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdpn implements zzgpu {
    private final zzdpg zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdpn(zzdpg zzdpgVar, zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzdpgVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiy(((zzdso) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}

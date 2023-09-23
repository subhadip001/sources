package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdkq implements zzgpu {
    private final zzdkc zza;
    private final zzgqh zzb;

    public zzdkq(zzdkc zzdkcVar, zzgqh zzgqhVar) {
        this.zza = zzdkcVar;
        this.zzb = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdbf implements zzgpu {
    private final zzdbe zza;
    private final zzgqh zzb;

    public zzdbf(zzdbe zzdbeVar, zzgqh zzgqhVar) {
        this.zza = zzdbeVar;
        this.zzb = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzfdh) this.zzb).zza());
        zzgqc.zzb(zza);
        return zza;
    }
}

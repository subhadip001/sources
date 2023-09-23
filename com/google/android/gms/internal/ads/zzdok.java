package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdok implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzdok(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdoj(((zzdmn) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}

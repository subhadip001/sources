package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepq implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzepq(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepl(((zzepg) this.zza).zzb(), 10000L, (Clock) this.zzb.zzb());
    }
}

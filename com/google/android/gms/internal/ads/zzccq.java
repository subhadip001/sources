package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccq implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzccq(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzccp zzb() {
        return new zzccp((Clock) this.zza.zzb(), (zzccn) this.zzb.zzb());
    }
}

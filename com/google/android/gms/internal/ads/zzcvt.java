package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcvt implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcvt(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzdeh zzb() {
        return new zzdeh((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzebk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzebk(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzebj zzb() {
        Map zzd = ((zzgqb) this.zza).zzd();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzebj(zzd, zzfvkVar, ((zzdem) this.zzc).zzb());
    }
}

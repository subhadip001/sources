package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdkd implements zzgpu {
    private final zzdkc zza;
    private final zzgqh zzb;

    public zzdkd(zzdkc zzdkcVar, zzgqh zzgqhVar) {
        this.zza = zzdkcVar;
        this.zzb = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiy((zzdas) this.zzb.zzb(), zzcfv.zzf));
        zzgqc.zzb(singleton);
        return singleton;
    }
}

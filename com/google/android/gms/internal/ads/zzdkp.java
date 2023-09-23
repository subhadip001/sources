package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdkp implements zzgpu {
    private final zzgqh zza;

    public zzdkp(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiy((zzdli) this.zza.zzb(), zzcfv.zzf));
        zzgqc.zzb(singleton);
        return singleton;
    }
}

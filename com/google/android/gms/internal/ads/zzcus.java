package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcus implements zzgpu {
    private final zzcuq zza;
    private final zzgqh zzb;

    public zzcus(zzcuq zzcuqVar, zzgqh zzgqhVar) {
        this.zza = zzcuqVar;
        this.zzb = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiy((zzcxl) this.zzb.zzb(), zzcfv.zzf));
        zzgqc.zzb(singleton);
        return singleton;
    }
}

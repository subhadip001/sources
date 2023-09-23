package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdwg {
    private final zzdwl zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdwg(zzdwl zzdwlVar, Executor executor) {
        this.zza = zzdwlVar;
        this.zzc = zzdwlVar.zza();
        this.zzb = executor;
    }

    public final zzdwf zza() {
        zzdwf zzdwfVar = new zzdwf(this);
        zzdwf.zza(zzdwfVar);
        return zzdwfVar;
    }
}

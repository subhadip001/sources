package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdwl extends zzdwn {
    private final zzfgw zzf;

    public zzdwl(Executor executor, zzcfn zzcfnVar, zzfgw zzfgwVar, zzfgy zzfgyVar) {
        super(executor, zzcfnVar, zzfgyVar);
        this.zzf = zzfgwVar;
        zzfgwVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}

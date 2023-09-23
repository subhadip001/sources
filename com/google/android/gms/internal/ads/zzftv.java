package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzftv extends zzftx {
    public zzftv(zzfvj zzfvjVar, zzfuh zzfuhVar) {
        super(zzfvjVar, zzfuhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftx
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) {
        zzfuh zzfuhVar = (zzfuh) obj;
        zzfvj zza = zzfuhVar.zza(obj2);
        zzfos.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfuhVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftx
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfvj) obj);
    }
}

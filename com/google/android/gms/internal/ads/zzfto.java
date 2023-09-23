package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfto extends zzftq {
    public zzfto(zzfvj zzfvjVar, Class cls, zzfuh zzfuhVar) {
        super(zzfvjVar, cls, zzfuhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) {
        zzfuh zzfuhVar = (zzfuh) obj;
        zzfvj zza = zzfuhVar.zza(th);
        zzfos.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfuhVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfvj) obj);
    }
}

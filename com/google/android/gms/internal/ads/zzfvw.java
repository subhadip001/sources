package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvw extends zzfvi {
    public final /* synthetic */ zzfvy zza;
    private final zzfug zzb;

    public zzfvw(zzfvy zzfvyVar, zzfug zzfugVar) {
        this.zza = zzfvyVar;
        Objects.requireNonNull(zzfugVar);
        this.zzb = zzfugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final /* bridge */ /* synthetic */ Object zza() {
        zzfvj zza = this.zzb.zza();
        zzfos.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfvj) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final boolean zzg() {
        return this.zza.isDone();
    }
}

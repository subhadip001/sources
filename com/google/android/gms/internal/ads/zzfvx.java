package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvx extends zzfvi {
    public final /* synthetic */ zzfvy zza;
    private final Callable zzb;

    public zzfvx(zzfvy zzfvyVar, Callable callable) {
        this.zza = zzfvyVar;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final Object zza() {
        return this.zzb.call();
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
    public final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final boolean zzg() {
        return this.zza.isDone();
    }
}

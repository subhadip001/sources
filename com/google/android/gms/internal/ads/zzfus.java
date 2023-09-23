package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfus extends zzfur {
    private final zzfvj zza;

    public zzfus(zzfvj zzfvjVar) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzftr, java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzftr, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzftr, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr, com.google.android.gms.internal.ads.zzfvj
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzftr, java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.zza.get(j2, timeUnit);
    }
}

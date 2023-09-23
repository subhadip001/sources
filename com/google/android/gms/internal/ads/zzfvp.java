package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvp extends zzfvm implements ScheduledExecutorService, zzfvk {
    public final ScheduledExecutorService zza;

    public zzfvp(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        zzfvy zzf = zzfvy.zzf(runnable, null);
        return new zzfvn(zzf, this.zza.schedule(zzf, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzfvo zzfvoVar = new zzfvo(runnable);
        return new zzfvn(zzfvoVar, this.zza.scheduleAtFixedRate(zzfvoVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzfvo zzfvoVar = new zzfvo(runnable);
        return new zzfvn(zzfvoVar, this.zza.scheduleWithFixedDelay(zzfvoVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        zzfvy zzfvyVar = new zzfvy(callable);
        return new zzfvn(zzfvyVar, this.zza.schedule(zzfvyVar, j2, timeUnit));
    }
}

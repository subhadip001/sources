package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfvm extends zzftu {
    private final ExecutorService zza;

    public zzfvm(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.zza = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.zza.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.zza);
        return a.w(new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length()), obj, "[", valueOf, "]");
    }
}

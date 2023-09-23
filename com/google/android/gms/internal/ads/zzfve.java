package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfve implements zzfvj {
    public static final zzfvj zza = new zzfve(null);
    private static final Logger zzb = Logger.getLogger(zzfve.class.getName());
    private final Object zzc;

    public zzfve(Object obj) {
        this.zzc = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.zzc);
        return a.w(new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length()), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final void zzc(Runnable runnable, Executor executor) {
        zzfos.zzc(runnable, "Runnable was null.");
        zzfos.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a.w(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfva extends zzfvc {
    public static zzfuz zza(Iterable iterable) {
        return new zzfuz(false, zzfrh.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfuz zzb(zzfvj... zzfvjVarArr) {
        return new zzfuz(false, zzfrh.zzn(zzfvjVarArr), null);
    }

    public static zzfuz zzc(Iterable iterable) {
        return new zzfuz(true, zzfrh.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfuz zzd(zzfvj... zzfvjVarArr) {
        return new zzfuz(true, zzfrh.zzn(zzfvjVarArr), null);
    }

    public static zzfvj zze(Iterable iterable) {
        return new zzfui(zzfrh.zzl(iterable), true);
    }

    public static zzfvj zzf(zzfvj zzfvjVar, Class cls, zzfoi zzfoiVar, Executor executor) {
        zzftp zzftpVar = new zzftp(zzfvjVar, cls, zzfoiVar);
        zzfvjVar.zzc(zzftpVar, zzfvq.zzc(executor, zzftpVar));
        return zzftpVar;
    }

    public static zzfvj zzg(zzfvj zzfvjVar, Class cls, zzfuh zzfuhVar, Executor executor) {
        zzfto zzftoVar = new zzfto(zzfvjVar, cls, zzfuhVar);
        zzfvjVar.zzc(zzftoVar, zzfvq.zzc(executor, zzftoVar));
        return zzftoVar;
    }

    public static zzfvj zzh(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfvd(th);
    }

    public static zzfvj zzi(Object obj) {
        if (obj == null) {
            return zzfve.zza;
        }
        return new zzfve(obj);
    }

    public static zzfvj zzj() {
        return zzfve.zza;
    }

    public static zzfvj zzk(Callable callable, Executor executor) {
        zzfvy zzfvyVar = new zzfvy(callable);
        executor.execute(zzfvyVar);
        return zzfvyVar;
    }

    public static zzfvj zzl(zzfug zzfugVar, Executor executor) {
        zzfvy zzfvyVar = new zzfvy(zzfugVar);
        executor.execute(zzfvyVar);
        return zzfvyVar;
    }

    public static zzfvj zzm(zzfvj zzfvjVar, zzfoi zzfoiVar, Executor executor) {
        int i2 = zzftx.zzc;
        Objects.requireNonNull(zzfoiVar);
        zzftw zzftwVar = new zzftw(zzfvjVar, zzfoiVar);
        zzfvjVar.zzc(zzftwVar, zzfvq.zzc(executor, zzftwVar));
        return zzftwVar;
    }

    public static zzfvj zzn(zzfvj zzfvjVar, zzfuh zzfuhVar, Executor executor) {
        int i2 = zzftx.zzc;
        Objects.requireNonNull(executor);
        zzftv zzftvVar = new zzftv(zzfvjVar, zzfuhVar);
        zzfvjVar.zzc(zzftvVar, zzfvq.zzc(executor, zzftvVar));
        return zzftvVar;
    }

    public static zzfvj zzo(zzfvj zzfvjVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzfvjVar.isDone() ? zzfvjVar : zzfvv.zzg(zzfvjVar, j2, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzfwa.zza(future);
        }
        throw new IllegalStateException(zzfpg.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfwa.zza(future);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new zzfup((Error) cause);
            }
            throw new zzfvz(cause);
        }
    }

    public static void zzr(zzfvj zzfvjVar, zzfuw zzfuwVar, Executor executor) {
        Objects.requireNonNull(zzfuwVar);
        zzfvjVar.zzc(new zzfuy(zzfvjVar, zzfuwVar), executor);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvq {
    public static zzfvk zza(ExecutorService executorService) {
        zzfvk zzfvmVar;
        if (executorService instanceof zzfvk) {
            return (zzfvk) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfvmVar = new zzfvp((ScheduledExecutorService) executorService);
        } else {
            zzfvmVar = new zzfvm(executorService);
        }
        return zzfvmVar;
    }

    public static Executor zzb() {
        return zzfuo.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzftr zzftrVar) {
        Objects.requireNonNull(executor);
        return executor == zzfuo.INSTANCE ? executor : new zzfvl(executor, zzftrVar);
    }
}

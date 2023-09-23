package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvl implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzftr zzb;

    public zzfvl(Executor executor, zzftr zzftrVar) {
        this.zza = executor;
        this.zzb = zzftrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.zzb.zze(e2);
        }
    }
}

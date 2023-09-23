package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfum extends zzfvi {
    private final Executor zza;
    public final /* synthetic */ zzfun zzb;

    public zzfum(zzfun zzfunVar, Executor executor) {
        this.zzb = zzfunVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final void zzd(Throwable th) {
        zzfun.zzG(this.zzb, (zzfum) null);
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final void zze(Object obj) {
        zzfun.zzG(this.zzb, (zzfum) null);
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e2) {
            this.zzb.zze(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}

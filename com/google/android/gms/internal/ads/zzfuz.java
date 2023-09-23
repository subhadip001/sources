package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfuz {
    private final boolean zza;
    private final zzfrh zzb;

    public /* synthetic */ zzfuz(boolean z, zzfrh zzfrhVar, zzfux zzfuxVar) {
        this.zza = z;
        this.zzb = zzfrhVar;
    }

    public final zzfvj zza(Callable callable, Executor executor) {
        return new zzfun(this.zzb, this.zza, executor, callable);
    }
}

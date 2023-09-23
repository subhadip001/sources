package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfut extends zzfqy implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zzb().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return zzb().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzb().isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Future zzb();

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return zzb().get(j2, timeUnit);
    }
}

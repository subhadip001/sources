package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvn extends zzfuu implements ScheduledFuture, zzfvj {
    private final ScheduledFuture zza;

    public zzfvn(zzfvj zzfvjVar, ScheduledFuture scheduledFuture) {
        super(zzfvjVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfut, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = zzb().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}

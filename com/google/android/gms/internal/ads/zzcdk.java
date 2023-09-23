package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcdk implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzcdk(zzcdn zzcdnVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, a.i("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}

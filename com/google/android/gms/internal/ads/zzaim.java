package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaim implements Runnable {
    public final /* synthetic */ zzajb zza;
    public final /* synthetic */ zzain zzb;

    public zzaim(zzain zzainVar, zzajb zzajbVar) {
        this.zzb = zzainVar;
        this.zza = zzajbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfkg {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfkf zzd = null;

    public zzfkg() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfkf zzfkfVar = (zzfkf) this.zzc.poll();
        this.zzd = zzfkfVar;
        if (zzfkfVar != null) {
            zzfkfVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfkf zzfkfVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfkf zzfkfVar) {
        zzfkfVar.zzb(this);
        this.zzc.add(zzfkfVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}

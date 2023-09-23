package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfcu {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfvk zzc;

    public zzfcu(Callable callable, zzfvk zzfvkVar) {
        this.zzb = callable;
        this.zzc = zzfvkVar;
    }

    public final synchronized zzfvj zza() {
        zzc(1);
        return (zzfvj) this.zza.poll();
    }

    public final synchronized void zzb(zzfvj zzfvjVar) {
        this.zza.addFirst(zzfvjVar);
    }

    public final synchronized void zzc(int i2) {
        int size = i2 - this.zza.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}

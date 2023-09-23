package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfud extends zzfuc {
    public final AtomicReferenceFieldUpdater zza;
    public final AtomicIntegerFieldUpdater zzb;

    public zzfud(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final int zza(zzfuf zzfufVar) {
        return this.zzb.decrementAndGet(zzfufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzb(zzfuf zzfufVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzfufVar, null, set2) && atomicReferenceFieldUpdater.get(zzfufVar) == null) {
        }
    }
}

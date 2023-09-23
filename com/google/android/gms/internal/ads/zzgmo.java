package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmo implements Iterator {
    private final ArrayDeque zza;
    private zzgjb zzb;

    public /* synthetic */ zzgmo(zzgjg zzgjgVar, zzgmn zzgmnVar) {
        zzgjg zzgjgVar2;
        if (zzgjgVar instanceof zzgmq) {
            zzgmq zzgmqVar = (zzgmq) zzgjgVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgmqVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgmqVar);
            zzgjgVar2 = zzgmqVar.zzd;
            this.zzb = zzb(zzgjgVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgjb) zzgjgVar;
    }

    private final zzgjb zzb(zzgjg zzgjgVar) {
        while (zzgjgVar instanceof zzgmq) {
            zzgmq zzgmqVar = (zzgmq) zzgjgVar;
            this.zza.push(zzgmqVar);
            zzgjgVar = zzgmqVar.zzd;
        }
        return (zzgjb) zzgjgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgjb next() {
        zzgjb zzgjbVar;
        zzgjg zzgjgVar;
        zzgjb zzgjbVar2 = this.zzb;
        if (zzgjbVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgjbVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgjgVar = ((zzgmq) this.zza.pop()).zze;
                zzgjbVar = zzb(zzgjgVar);
            } while (zzgjbVar.zzD());
            this.zzb = zzgjbVar;
            return zzgjbVar2;
        }
        throw new NoSuchElementException();
    }
}

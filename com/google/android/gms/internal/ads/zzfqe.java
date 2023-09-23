package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqe extends AbstractCollection {
    public final /* synthetic */ zzfqf zza;

    public zzfqe(zzfqf zzfqfVar) {
        this.zza = zzfqfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzr();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        for (Collection collection : this.zza.zzu().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzj();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzh();
    }
}

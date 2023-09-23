package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqq extends AbstractCollection {
    public final /* synthetic */ zzfqr zza;

    public zzfqq(zzfqr zzfqrVar) {
        this.zza = zzfqrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfqr zzfqrVar = this.zza;
        Map zzl = zzfqrVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfql(zzfqrVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}

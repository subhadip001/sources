package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqo extends AbstractSet {
    public final /* synthetic */ zzfqr zza;

    public zzfqo(zzfqr zzfqrVar) {
        this.zza = zzfqrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfqr zzfqrVar = this.zza;
        Map zzl = zzfqrVar.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfqj(zzfqrVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzx;
        Object obj2;
        Map zzl = this.zza.zzl();
        if (zzl == null) {
            zzx = this.zza.zzx(obj);
            obj2 = zzfqr.zzd;
            return zzx != obj2;
        }
        return zzl.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}

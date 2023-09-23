package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfpr implements Iterator {
    public Map.Entry zza;
    public final /* synthetic */ Iterator zzb;
    public final /* synthetic */ zzfps zzc;

    public zzfpr(zzfps zzfpsVar, Iterator it) {
        this.zzc = zzfpsVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfos.zzi(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfqc.zzg(this.zzc.zza, collection.size());
        collection.clear();
        this.zza = null;
    }
}

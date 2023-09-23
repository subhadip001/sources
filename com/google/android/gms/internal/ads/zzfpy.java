package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfpy implements Iterator {
    public final Iterator zza;
    public final Collection zzb;
    public final /* synthetic */ zzfpz zzc;

    public zzfpy(zzfpz zzfpzVar) {
        Iterator it;
        this.zzc = zzfpzVar;
        Collection collection = zzfpzVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    public zzfpy(zzfpz zzfpzVar, Iterator it) {
        this.zzc = zzfpzVar;
        this.zzb = zzfpzVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzfqc.zze(this.zzc.zze);
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfpz extends AbstractCollection {
    public final Object zza;
    public Collection zzb;
    public final zzfpz zzc;
    public final Collection zzd;
    public final /* synthetic */ zzfqc zze;

    public zzfpz(zzfqc zzfqcVar, Object obj, Collection collection, zzfpz zzfpzVar) {
        this.zze = zzfqcVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfpzVar;
        this.zzd = zzfpzVar == null ? null : zzfpzVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfqc.zzd(this.zze);
            if (isEmpty) {
                zza();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            zzfqc.zzf(this.zze, this.zzb.size() - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfqc.zzg(this.zze, size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfpy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfqc.zze(this.zze);
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            zzfqc.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            zzfqc.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    public final void zza() {
        Map map;
        zzfpz zzfpzVar = this.zzc;
        if (zzfpzVar != null) {
            zzfpzVar.zza();
            return;
        }
        map = this.zze.zza;
        map.put(this.zza, this.zzb);
    }

    public final void zzb() {
        Map map;
        zzfpz zzfpzVar = this.zzc;
        if (zzfpzVar != null) {
            zzfpzVar.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty()) {
            map = this.zze.zza;
            Collection collection = (Collection) map.get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        Map map;
        zzfpz zzfpzVar = this.zzc;
        if (zzfpzVar != null) {
            zzfpzVar.zzc();
        } else if (this.zzb.isEmpty()) {
            map = this.zze.zza;
            map.remove(this.zza);
        }
    }
}

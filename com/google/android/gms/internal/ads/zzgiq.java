package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgiq extends AbstractList implements zzgkx {
    private boolean zza = true;

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        zzbM();
        super.add(i2, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection collection) {
        zzbM();
        return super.addAll(i2, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        zzbM();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (!get(i2).equals(list.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        zzbM();
        return super.remove(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        zzbM();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        zzbM();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        zzbM();
        return super.set(i2, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final void zzb() {
        this.zza = false;
    }

    public final void zzbM() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final boolean zzc() {
        return this.zza;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        zzbM();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        zzbM();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbM();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}

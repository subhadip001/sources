package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrh extends zzfrc implements List, RandomAccess {
    private static final zzfth zza = new zzfrf(zzfsq.zza, 0);

    public static zzfre zzi() {
        return new zzfre(4);
    }

    public static zzfrh zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    public static zzfrh zzk(Object[] objArr, int i2) {
        if (i2 == 0) {
            return zzfsq.zza;
        }
        return new zzfsq(objArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfrh zzl(Iterable iterable) {
        Objects.requireNonNull(iterable);
        return zzm(iterable);
    }

    public static zzfrh zzm(Collection collection) {
        if (collection instanceof zzfrc) {
            zzfrh zzd = ((zzfrc) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzk(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfso.zzb(array2, length);
        return zzk(array2, length);
    }

    public static zzfrh zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfsq.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfso.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfrh zzo() {
        return zzfsq.zza;
    }

    public static zzfrh zzp(Object obj) {
        Object[] objArr = {obj};
        zzfso.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfrh zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfso.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfrh zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfso.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfrh zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfso.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfrh zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfso.zzb(objArr, 6);
        return zzk(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (zzfoo.zza(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfoo.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public int zza(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    @Deprecated
    public final zzfrh zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final zzftg zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfrh subList(int i2, int i3) {
        zzfos.zzg(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return zzfsq.zza;
        }
        return new zzfrg(this, i2, i4);
    }

    @Override // java.util.List
    /* renamed from: zzu */
    public final zzfth listIterator(int i2) {
        zzfos.zzb(i2, size(), "index");
        return isEmpty() ? zza : new zzfrf(this, i2);
    }
}

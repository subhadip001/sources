package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfpt extends zzfpw implements NavigableMap {
    public final /* synthetic */ zzfqc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpt(zzfqc zzfqcVar, NavigableMap navigableMap) {
        super(zzfqcVar, navigableMap);
        this.zzc = zzfqcVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zza(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfpt(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zza(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zza(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zza(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, com.google.android.gms.internal.ads.zzfpp, com.google.android.gms.internal.ads.zzfsb, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zza(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zza(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final Map.Entry zzc(Iterator it) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection zza = this.zzc.zza();
            zza.addAll((Collection) entry.getValue());
            it.remove();
            return new zzfrd(entry.getKey(), this.zzc.zzb(zza));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    /* renamed from: zzd */
    public final NavigableSet zzg() {
        return new zzfpu(this.zzc, (NavigableMap) ((SortedMap) ((zzfpp) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap) ((SortedMap) ((zzfpp) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* synthetic */ SortedSet zzh() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzfpt(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfpt(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzfpt(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpp) this).zza)).tailMap(obj, z));
    }
}

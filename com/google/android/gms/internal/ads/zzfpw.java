package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfpw extends zzfpp implements SortedMap {
    public SortedSet zzd;
    public final /* synthetic */ zzfqc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpw(zzfqc zzfqcVar, SortedMap sortedMap) {
        super(zzfqcVar, sortedMap);
        this.zze = zzfqcVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfpw(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfpw(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfpw(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) ((zzfpp) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsb
    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfpx(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfpp, com.google.android.gms.internal.ads.zzfsb, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zze = zze();
            this.zzd = zze;
            return zze;
        }
        return sortedSet;
    }
}

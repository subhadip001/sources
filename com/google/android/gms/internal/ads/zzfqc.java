package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfqc extends zzfqf implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfqc(Map map) {
        zzfos.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* synthetic */ int zzd(zzfqc zzfqcVar) {
        int i2 = zzfqcVar.zzb;
        zzfqcVar.zzb = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int zze(zzfqc zzfqcVar) {
        int i2 = zzfqcVar.zzb;
        zzfqcVar.zzb = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int zzf(zzfqc zzfqcVar, int i2) {
        int i3 = zzfqcVar.zzb + i2;
        zzfqcVar.zzb = i3;
        return i3;
    }

    public static /* synthetic */ int zzg(zzfqc zzfqcVar, int i2) {
        int i3 = zzfqcVar.zzb - i2;
        zzfqcVar.zzb = i3;
        return i3;
    }

    public static /* synthetic */ void zzq(zzfqc zzfqcVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfqcVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqcVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final Collection zzi() {
        return new zzfqe(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final Iterator zzj() {
        return new zzfpm(this);
    }

    public final List zzk(Object obj, List list, zzfpz zzfpzVar) {
        if (list instanceof RandomAccess) {
            return new zzfpv(this, obj, list, zzfpzVar);
        }
        return new zzfqb(this, obj, list, zzfpzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public Map zzm() {
        throw null;
    }

    public final Map zzn() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfpt(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpw(this, (SortedMap) map);
        }
        return new zzfpp(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public Set zzo() {
        throw null;
    }

    public final Set zzp() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfpu(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpx(this, (SortedMap) map);
        }
        return new zzfps(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final void zzr() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, com.google.android.gms.internal.ads.zzfsd
    public final boolean zzs(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}

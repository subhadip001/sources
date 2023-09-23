package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfqx extends zzfqy implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    public Set entrySet() {
        return zzb().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    public Object get(Object obj) {
        return zzb().get(obj);
    }

    public int hashCode() {
        return zzb().hashCode();
    }

    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Map zzb();

    public final int zzc() {
        return zzftc.zza(entrySet());
    }

    public final boolean zzd(Object obj) {
        zzfrx zzfrxVar = new zzfrx(entrySet().iterator());
        if (obj == null) {
            while (zzfrxVar.hasNext()) {
                if (zzfrxVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfrxVar.hasNext()) {
                if (obj.equals(zzfrxVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zze(Object obj) {
        return zzfsc.zzb(this, obj);
    }
}

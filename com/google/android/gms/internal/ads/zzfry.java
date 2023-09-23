package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfry extends zzftb {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object zza = zzfsc.zza(zza(), key);
            if (zzfoo.zza(zza, entry.getValue())) {
                return zza != null || zza().containsKey(key);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return zza().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftb, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return zzftc.zzd(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzftc.zze(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzfqg.zza(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return zza().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    public abstract Map zza();
}

package com.google.android.gms.internal.play_billing;

import f.a.b.a.a;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public abstract class zzx implements Map, Serializable {
    private transient zzy zza;
    private transient zzy zzb;
    private transient zzr zzc;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzag.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzy zzyVar = this.zzb;
        if (zzyVar == null) {
            zzy zzd = zzd();
            this.zzb = zzd;
            return zzd;
        }
        return zzyVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(a.d(44, "size cannot be negative but was: ", size));
    }

    public abstract zzr zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzr values() {
        zzr zzrVar = this.zzc;
        if (zzrVar == null) {
            zzr zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzrVar;
    }

    public abstract zzy zzc();

    public abstract zzy zzd();

    @Override // java.util.Map
    /* renamed from: zze */
    public final zzy entrySet() {
        zzy zzyVar = this.zza;
        if (zzyVar == null) {
            zzy zzc = zzc();
            this.zza = zzc;
            return zzc;
        }
        return zzyVar;
    }
}

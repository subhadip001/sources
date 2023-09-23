package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.MediaInformation;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrk implements Map, Serializable {
    private transient zzfrm zza;
    private transient zzfrm zzb;
    private transient zzfrc zzc;

    public static zzfrk zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfrj zzfrjVar = new zzfrj(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfrjVar.zzb(entrySet);
        return zzfrjVar.zzc();
    }

    public static zzfrk zzd() {
        return zzfsv.zza;
    }

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
        return zzfsc.zzb(this, obj);
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
        return zzftc.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfrm zzfrmVar = this.zzb;
        if (zzfrmVar == null) {
            zzfrm zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzfrmVar;
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
        zzfqg.zza(size, MediaInformation.KEY_SIZE);
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

    public abstract zzfrc zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfrc values() {
        zzfrc zzfrcVar = this.zzc;
        if (zzfrcVar == null) {
            zzfrc zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfrcVar;
    }

    public abstract zzfrm zze();

    public abstract zzfrm zzf();

    @Override // java.util.Map
    /* renamed from: zzg */
    public final zzfrm entrySet() {
        zzfrm zzfrmVar = this.zza;
        if (zzfrmVar == null) {
            zzfrm zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzfrmVar;
    }
}

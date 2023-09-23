package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfss extends zzfrm {
    private final transient zzfrk zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzfss(zzfrk zzfrkVar, Object[] objArr, int i2, int i3) {
        this.zza = zzfrkVar;
        this.zzb = objArr;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zza(Object[] objArr, int i2) {
        return zzd().zza(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc
    public final zzftg zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final zzfrh zzi() {
        return new zzfsr(this);
    }
}

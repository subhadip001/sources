package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzftd extends zzfrm {
    public final transient Object zza;

    public zzftd(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfrp(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zza(Object[] objArr, int i2) {
        objArr[i2] = this.zza;
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc
    public final zzfrh zzd() {
        return zzfrh.zzp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc
    public final zzftg zze() {
        return new zzfrp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        throw null;
    }
}

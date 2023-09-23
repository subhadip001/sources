package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfst extends zzfrm {
    private final transient zzfrk zza;
    private final transient zzfrh zzb;

    public zzfst(zzfrk zzfrkVar, zzfrh zzfrhVar) {
        this.zza = zzfrkVar;
        this.zzb = zzfrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zza(Object[] objArr, int i2) {
        return this.zzb.zza(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc
    public final zzfrh zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc
    public final zzftg zze() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        throw null;
    }
}

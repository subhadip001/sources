package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzmt extends AbstractList implements RandomAccess, zzku {
    private final zzku zza;

    public zzmt(zzku zzkuVar) {
        this.zza = zzkuVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((zzkt) this.zza).get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzms(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new zzmr(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzku
    public final zzku zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzku
    public final Object zzf(int i2) {
        return this.zza.zzf(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzku
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzku
    public final void zzi(zzje zzjeVar) {
        throw new UnsupportedOperationException();
    }
}

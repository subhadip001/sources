package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnn extends AbstractList implements RandomAccess, zzglg {
    private final zzglg zza;

    public zzgnn(zzglg zzglgVar) {
        this.zza = zzglgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((zzglf) this.zza).get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgnm(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new zzgnl(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final zzglg zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final Object zzf(int i2) {
        return this.zza.zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final void zzi(zzgjg zzgjgVar) {
        throw new UnsupportedOperationException();
    }
}

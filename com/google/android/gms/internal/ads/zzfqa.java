package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqa extends zzfpy implements ListIterator {
    public final /* synthetic */ zzfqb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqa(zzfqb zzfqbVar) {
        super(zzfqbVar);
        this.zzd = zzfqbVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfqc.zzd(this.zzd.zzf);
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqa(zzfqb zzfqbVar, int i2) {
        super(zzfqbVar, ((List) zzfqbVar.zzb).listIterator(i2));
        this.zzd = zzfqbVar;
    }
}

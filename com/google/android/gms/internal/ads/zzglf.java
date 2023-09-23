package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglf extends zzgiq implements RandomAccess, zzglg {
    public static final zzglg zza;
    private static final zzglf zzb;
    private final List zzc;

    static {
        zzglf zzglfVar = new zzglf(10);
        zzb = zzglfVar;
        zzglfVar.zzb();
        zza = zzglfVar;
    }

    public zzglf() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgjg) {
            return ((zzgjg) obj).zzA(zzgky.zzb);
        }
        return zzgky.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        zzbM();
        this.zzc.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        zzbM();
        if (collection instanceof zzglg) {
            collection = ((zzglg) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbM();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzbM();
        Object remove = this.zzc.remove(i2);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final /* bridge */ /* synthetic */ zzgkx zzd(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.zzc);
            return new zzglf(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final zzglg zze() {
        return zzc() ? new zzgnn(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final Object zzf(int i2) {
        return this.zzc.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i2) {
        Object obj = this.zzc.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgjg) {
            zzgjg zzgjgVar = (zzgjg) obj;
            String zzA = zzgjgVar.zzA(zzgky.zzb);
            if (zzgjgVar.zzp()) {
                this.zzc.set(i2, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzgky.zzh(bArr);
        if (zzgky.zzi(bArr)) {
            this.zzc.set(i2, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzglg
    public final void zzi(zzgjg zzgjgVar) {
        zzbM();
        this.zzc.add(zzgjgVar);
        ((AbstractList) this).modCount++;
    }

    public zzglf(int i2) {
        this.zzc = new ArrayList(i2);
    }

    private zzglf(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}

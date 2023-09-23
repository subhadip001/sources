package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfqb extends zzfpz implements List {
    public final /* synthetic */ zzfqc zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqb(zzfqc zzfqcVar, Object obj, List list, zzfpz zzfpzVar) {
        super(zzfqcVar, obj, list, zzfpzVar);
        this.zzf = zzfqcVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i2, obj);
        zzfqc.zzd(this.zzf);
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i2, collection);
        if (addAll) {
            zzfqc.zzf(this.zzf, this.zzb.size() - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzb();
        return ((List) this.zzb).get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfqa(this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        zzb();
        Object remove = ((List) this.zzb).remove(i2);
        zzfqc.zze(this.zzf);
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        zzb();
        return ((List) this.zzb).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        zzb();
        zzfqc zzfqcVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i2, i3);
        zzfpz zzfpzVar = this.zzc;
        if (zzfpzVar == null) {
            zzfpzVar = this;
        }
        return zzfqcVar.zzk(obj, subList, zzfpzVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        zzb();
        return new zzfqa(this, i2);
    }
}

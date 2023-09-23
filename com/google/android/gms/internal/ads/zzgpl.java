package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgpl extends AbstractList {
    private static final zzgpm zzc = zzgpm.zzb(zzgpl.class);
    public final List zza;
    public final Iterator zzb;

    public zzgpl(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        if (this.zza.size() > i2) {
            return this.zza.get(i2);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgpk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzgpm zzgpmVar = zzc;
        zzgpmVar.zza("potentially expensive size() call");
        zzgpmVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}

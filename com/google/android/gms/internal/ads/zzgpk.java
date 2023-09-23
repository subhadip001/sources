package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgpk implements Iterator {
    public int zza = 0;
    public final /* synthetic */ zzgpl zzb;

    public zzgpk(zzgpl zzgplVar) {
        this.zzb = zzgplVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i2 = this.zza;
            this.zza = i2 + 1;
            return list.get(i2);
        }
        zzgpl zzgplVar = this.zzb;
        zzgplVar.zza.add(zzgplVar.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

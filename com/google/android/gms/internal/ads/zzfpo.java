package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfpo implements Iterator {
    public final Iterator zza;
    public Collection zzb;
    public final /* synthetic */ zzfpp zzc;

    public zzfpo(zzfpp zzfppVar) {
        this.zzc = zzfppVar;
        this.zza = zzfppVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfos.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfqc.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}

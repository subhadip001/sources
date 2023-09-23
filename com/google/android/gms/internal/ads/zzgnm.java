package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnm implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzgnn zzb;

    public zzgnm(zzgnn zzgnnVar) {
        zzglg zzglgVar;
        this.zzb = zzgnnVar;
        zzglgVar = zzgnnVar.zza;
        this.zza = zzglgVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfpn extends zzfry {
    public final /* synthetic */ zzfpp zza;

    public zzfpn(zzfpp zzfppVar) {
        this.zza = zzfppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfry, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfqi.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfpo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfry, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            zzfqc.zzq(this.zza.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfry
    public final Map zza() {
        return this.zza;
    }
}

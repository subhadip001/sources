package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgkv extends AbstractList {
    private final List zza;
    private final zzgku zzb;

    public zzgkv(List list, zzgku zzgkuVar) {
        this.zza = list;
        this.zzb = zzgkuVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        zzbej zzb = zzbej.zzb(((Integer) this.zza.get(i2)).intValue());
        return zzb == null ? zzbej.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}

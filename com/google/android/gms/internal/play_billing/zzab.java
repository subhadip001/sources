package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzab extends zzu {
    public final /* synthetic */ zzac zza;

    public zzab(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3;
        Object[] objArr;
        Object[] objArr2;
        i3 = this.zza.zzc;
        zzm.zza(i2, i3, "index");
        zzac zzacVar = this.zza;
        int i4 = i2 + i2;
        objArr = zzacVar.zzb;
        Object obj = objArr[i4];
        obj.getClass();
        objArr2 = zzacVar.zzb;
        Object obj2 = objArr2[i4 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i2;
        i2 = this.zza.zzc;
        return i2;
    }
}

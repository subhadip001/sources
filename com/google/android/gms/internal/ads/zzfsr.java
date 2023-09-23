package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsr extends zzfrh {
    public final /* synthetic */ zzfss zza;

    public zzfsr(zzfss zzfssVar) {
        this.zza = zzfssVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3;
        Object[] objArr;
        Object[] objArr2;
        i3 = this.zza.zzc;
        zzfos.zza(i2, i3, "index");
        zzfss zzfssVar = this.zza;
        int i4 = i2 + i2;
        objArr = zzfssVar.zzb;
        Object obj = objArr[i4];
        obj.getClass();
        objArr2 = zzfssVar.zzb;
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

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        return true;
    }
}

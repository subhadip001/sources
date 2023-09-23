package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzkk {
    private final zzy zza;
    private final SparseArray zzb;

    public zzkk(zzy zzyVar, SparseArray sparseArray) {
        this.zza = zzyVar;
        SparseArray sparseArray2 = new SparseArray(zzyVar.zzb());
        for (int i2 = 0; i2 < zzyVar.zzb(); i2++) {
            int zza = zzyVar.zza(i2);
            zzkj zzkjVar = (zzkj) sparseArray.get(zza);
            Objects.requireNonNull(zzkjVar);
            sparseArray2.append(zza, zzkjVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i2) {
        return this.zza.zza(i2);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzkj zzc(int i2) {
        zzkj zzkjVar = (zzkj) this.zzb.get(i2);
        Objects.requireNonNull(zzkjVar);
        return zzkjVar;
    }

    public final boolean zzd(int i2) {
        return this.zza.zzc(i2);
    }
}

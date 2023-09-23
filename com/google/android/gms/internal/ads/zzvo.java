package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzvo {
    public final int zza;
    public final zzjw[] zzb;
    public final zzvh[] zzc;
    public final zzct zzd;
    public final Object zze;

    public zzvo(zzjw[] zzjwVarArr, zzvh[] zzvhVarArr, zzct zzctVar, Object obj) {
        this.zzb = zzjwVarArr;
        this.zzc = (zzvh[]) zzvhVarArr.clone();
        this.zzd = zzctVar;
        this.zze = obj;
        this.zza = zzjwVarArr.length;
    }

    public final boolean zza(zzvo zzvoVar, int i2) {
        return zzvoVar != null && zzeg.zzS(this.zzb[i2], zzvoVar.zzb[i2]) && zzeg.zzS(this.zzc[i2], zzvoVar.zzc[i2]);
    }

    public final boolean zzb(int i2) {
        return this.zzb[i2] != null;
    }
}

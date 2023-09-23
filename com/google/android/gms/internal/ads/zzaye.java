package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaye {
    public final zzaxp zza;
    public final zzayb zzb;
    public final Object zzc;
    public final zzarz[] zzd;

    public zzaye(zzaxp zzaxpVar, zzayb zzaybVar, Object obj, zzarz[] zzarzVarArr) {
        this.zza = zzaxpVar;
        this.zzb = zzaybVar;
        this.zzc = obj;
        this.zzd = zzarzVarArr;
    }

    public final boolean zza(zzaye zzayeVar, int i2) {
        return zzayeVar != null && zzazn.zzo(this.zzb.zza(i2), zzayeVar.zzb.zza(i2)) && zzazn.zzo(this.zzd[i2], zzayeVar.zzd[i2]);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctq implements zzfuw {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzctr zzb;

    public zzctq(zzctr zzctrVar, String str) {
        this.zzb = zzctrVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzfch zzfchVar;
        zzfic zzficVar;
        zzfbs zzfbsVar;
        zzfbg zzfbgVar;
        zzfbg zzfbgVar2;
        zzctr zzctrVar = this.zzb;
        zzfchVar = zzctrVar.zzh;
        zzficVar = zzctrVar.zzg;
        zzfbsVar = zzctrVar.zze;
        zzfbgVar = zzctrVar.zzf;
        String str = this.zza;
        zzfbgVar2 = zzctrVar.zzf;
        zzfchVar.zza(zzficVar.zzb(zzfbsVar, zzfbgVar, false, str, null, zzfbgVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfch zzfchVar;
        zzfic zzficVar;
        zzfbs zzfbsVar;
        zzfbg zzfbgVar;
        zzfbg zzfbgVar2;
        String str = (String) obj;
        zzctr zzctrVar = this.zzb;
        zzfchVar = zzctrVar.zzh;
        zzficVar = zzctrVar.zzg;
        zzfbsVar = zzctrVar.zze;
        zzfbgVar = zzctrVar.zzf;
        String str2 = this.zza;
        zzfbgVar2 = zzctrVar.zzf;
        zzfchVar.zza(zzficVar.zzb(zzfbsVar, zzfbgVar, false, str2, str, zzfbgVar2.zzd));
    }
}

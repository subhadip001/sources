package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdsp implements zzbpa {
    private final zzdcz zza;
    private final zzcaw zzb;
    private final String zzc;
    private final String zzd;

    public zzdsp(zzdcz zzdczVar, zzfbg zzfbgVar) {
        this.zza = zzdczVar;
        this.zzb = zzfbgVar.zzm;
        this.zzc = zzfbgVar.zzk;
        this.zzd = zzfbgVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zza(zzcaw zzcawVar) {
        int i2;
        String str;
        zzcaw zzcawVar2 = this.zzb;
        if (zzcawVar2 != null) {
            zzcawVar = zzcawVar2;
        }
        if (zzcawVar != null) {
            str = zzcawVar.zza;
            i2 = zzcawVar.zzb;
        } else {
            i2 = 1;
            str = "";
        }
        this.zza.zzd(new zzcah(str, i2), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzc() {
        this.zza.zzf();
    }
}

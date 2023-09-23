package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemy implements zzfuw {
    public final /* synthetic */ zzemr zza;
    public final /* synthetic */ zzfhq zzb;
    public final /* synthetic */ zzfhg zzc;
    public final /* synthetic */ zzdlt zzd;
    public final /* synthetic */ zzemz zze;

    public zzemy(zzemz zzemzVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzdlt zzdltVar) {
        this.zze = zzemzVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcnf zzcnfVar;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza);
        zzcnfVar = this.zze.zzb;
        zzcnfVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.lang.Runnable
            public final void run() {
                zzemp zzempVar;
                zzemy zzemyVar = zzemy.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzempVar = zzemyVar.zze.zzd;
                zzempVar.zza().zza(zzeVar);
            }
        });
        zzfcs.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
            zzfhqVar.zzc(zza);
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zze(false);
            zzfhqVar.zza(zzfhgVar);
            zzfhqVar.zzg();
            return;
        }
        zzfhsVar = this.zze.zze;
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zza(zza);
        zzfhgVar2.zze(false);
        zzfhsVar.zzb(zzfhgVar2.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzemp zzempVar;
        zzcnf zzcnfVar;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        zzcxw zzcxwVar = (zzcxw) obj;
        synchronized (this.zze) {
            zzdfw zzn = zzcxwVar.zzn();
            zzempVar = this.zze.zzd;
            zzn.zza(zzempVar.zzd());
            this.zza.zzb(zzcxwVar);
            zzcnfVar = this.zze.zzb;
            zzcnfVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemw
                @Override // java.lang.Runnable
                public final void run() {
                    zzemp zzempVar2;
                    zzempVar2 = zzemy.this.zze.zzd;
                    zzempVar2.zzb().zzn();
                }
            });
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzf(zzcxwVar.zzp().zzb);
                zzfhqVar.zze(zzcxwVar.zzl().zzg());
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(true);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zze;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzb(zzcxwVar.zzp().zzb);
                zzfhgVar2.zzc(zzcxwVar.zzl().zzg());
                zzfhgVar2.zze(true);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }
}

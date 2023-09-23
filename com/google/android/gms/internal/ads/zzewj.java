package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzewj implements zzfuw {
    public final /* synthetic */ zzemr zza;
    public final /* synthetic */ zzfhq zzb;
    public final /* synthetic */ zzfhg zzc;
    public final /* synthetic */ zzewl zzd;
    public final /* synthetic */ zzewm zze;

    public zzewj(zzewm zzewmVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzewl zzewlVar) {
        this.zze = zzewmVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzewlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzeyv zzeyvVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzexc zzexcVar;
        zzdba zzm;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        zzeyvVar = this.zze.zze;
        zzcvc zzcvcVar = (zzcvc) zzeyvVar.zzd();
        if (zzcvcVar == null) {
            zza = zzfcx.zzb(th, null);
        } else {
            zza = zzcvcVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcvcVar != null) {
                zzcvcVar.zzc().zza(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexc zzexcVar2;
                            zzewj zzewjVar = zzewj.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                            zzexcVar2 = zzewjVar.zze.zzd;
                            zzexcVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzexcVar = this.zze.zzd;
                zzexcVar.zza(zza);
                zzm = this.zze.zzm(this.zzd);
                ((zzcvc) zzm.zzh()).zzb().zzc().zzd();
            }
            zzfcs.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzc(zza);
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(false);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzh;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zza(zza);
                zzfhgVar2.zze(false);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        zzexc zzexcVar;
        zzcxw zzcxwVar = (zzcxw) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
                zzdfw zzn = zzcxwVar.zzn();
                zzexcVar = this.zze.zzd;
                zzn.zzb(zzexcVar);
            }
            this.zza.zzb(zzcxwVar);
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzf(zzcxwVar.zzp().zzb);
                zzfhqVar.zze(zzcxwVar.zzl().zzg());
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(true);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzh;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzb(zzcxwVar.zzp().zzb);
                zzfhgVar2.zzc(zzcxwVar.zzl().zzg());
                zzfhgVar2.zze(true);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }
}

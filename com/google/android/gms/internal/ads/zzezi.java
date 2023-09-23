package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzezi implements zzfuw {
    public final /* synthetic */ zzemr zza;
    public final /* synthetic */ zzfhq zzb;
    public final /* synthetic */ zzfhg zzc;
    public final /* synthetic */ zzdkx zzd;
    public final /* synthetic */ zzezj zze;

    public zzezi(zzezj zzezjVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzdkx zzdkxVar) {
        this.zze = zzezjVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgN)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemc zzemcVar;
                        zzezi zzeziVar = zzezi.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzemcVar = zzeziVar.zze.zzd;
                        zzemcVar.zza(zzeVar);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfaj zzfajVar;
                        zzezi zzeziVar = zzezi.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzfajVar = zzeziVar.zze.zze;
                        zzfajVar.zza(zzeVar);
                    }
                });
            }
            zzfcs.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzc(zza);
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(false);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzg;
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
        Executor executor;
        Executor executor2;
        zzemc zzemcVar;
        zzfaj zzfajVar;
        zzdjy zzdjyVar = (zzdjy) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbhq zzbhqVar = zzbhy.zzgN;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
                zzdfw zzn = zzdjyVar.zzn();
                zzemcVar = this.zze.zzd;
                zzn.zza(zzemcVar);
                zzfajVar = this.zze.zze;
                zzn.zzd(zzfajVar);
            }
            this.zza.zzb(zzdjyVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemc zzemcVar2;
                        zzemcVar2 = zzezi.this.zze.zzd;
                        zzemcVar2.zzn();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfaj zzfajVar2;
                        zzfajVar2 = zzezi.this.zze.zze;
                        zzfajVar2.zzn();
                    }
                });
            }
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzf(zzdjyVar.zzp().zzb);
                zzfhqVar.zze(zzdjyVar.zzl().zzg());
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(true);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzg;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzb(zzdjyVar.zzp().zzb);
                zzfhgVar2.zzc(zzdjyVar.zzl().zzg());
                zzfhgVar2.zze(true);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }
}

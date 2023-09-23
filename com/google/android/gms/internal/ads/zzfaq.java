package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfaq implements zzfuw {
    public final /* synthetic */ zzemr zza;
    public final /* synthetic */ zzfhq zzb;
    public final /* synthetic */ zzfhg zzc;
    public final /* synthetic */ zzfas zzd;
    public final /* synthetic */ zzfat zze;

    public zzfaq(zzfat zzfatVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzfas zzfasVar) {
        this.zze = zzfatVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzfasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzeyv zzeyvVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfaj zzfajVar;
        zzdsw zzk;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        zzeyvVar = this.zze.zze;
        zzdsx zzdsxVar = (zzdsx) zzeyvVar.zzd();
        if (zzdsxVar == null) {
            zza = zzfcx.zzb(th, null);
        } else {
            zza = zzdsxVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdsxVar != null) {
                zzdsxVar.zza().zza(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfap
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfaj zzfajVar2;
                        zzfaq zzfaqVar = zzfaq.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzfajVar2 = zzfaqVar.zze.zzd;
                        zzfajVar2.zza(zzeVar);
                    }
                });
            } else {
                zzfajVar = this.zze.zzd;
                zzfajVar.zza(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzd();
            }
            zzfcs.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
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
        zzfaj zzfajVar;
        Executor executor;
        final zzfaj zzfajVar2;
        zzfaj zzfajVar3;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        zzdss zzdssVar = (zzdss) obj;
        synchronized (this.zze) {
            zzdfw zzn = zzdssVar.zzn();
            zzfajVar = this.zze.zzd;
            zzn.zzd(zzfajVar);
            this.zza.zzb(zzdssVar);
            zzfat zzfatVar = this.zze;
            executor = zzfatVar.zzb;
            zzfajVar2 = zzfatVar.zzd;
            zzfajVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // java.lang.Runnable
                public final void run() {
                    zzfaj.this.zzn();
                }
            });
            zzfajVar3 = this.zze.zzd;
            zzfajVar3.zzv();
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzf(zzdssVar.zzp().zzb);
                zzfhqVar.zze(zzdssVar.zzl().zzg());
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(true);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzg;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzb(zzdssVar.zzp().zzb);
                zzfhgVar2.zzc(zzdssVar.zzl().zzg());
                zzfhgVar2.zze(true);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }
}

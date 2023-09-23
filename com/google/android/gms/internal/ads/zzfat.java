package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfat implements zzems {
    private final Context zza;
    private final Executor zzb;
    private final zzcnf zzc;
    private final zzfaj zzd;
    private final zzeyv zze;
    private final zzfbt zzf;
    private final zzfhs zzg;
    private final zzfbw zzh;
    private zzfvj zzi;

    public zzfat(Context context, Executor executor, zzcnf zzcnfVar, zzeyv zzeyvVar, zzfaj zzfajVar, zzfbw zzfbwVar, zzfbt zzfbtVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnfVar;
        this.zze = zzeyvVar;
        this.zzd = zzfajVar;
        this.zzh = zzfbwVar;
        this.zzf = zzfbtVar;
        this.zzg = zzcnfVar.zzy();
    }

    public static /* synthetic */ zzdsw zzc(zzfat zzfatVar, zzeyt zzeytVar) {
        return zzfatVar.zzk(zzeytVar);
    }

    public final zzdsw zzk(zzeyt zzeytVar) {
        zzdsw zzi = this.zzc.zzi();
        zzdbc zzdbcVar = new zzdbc();
        zzdbcVar.zzc(this.zza);
        zzdbcVar.zzf(((zzfas) zzeytVar).zza);
        zzdbcVar.zze(this.zzf);
        zzi.zzd(zzdbcVar.zzg());
        zzi.zzc(new zzdhc().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemq zzemqVar, zzemr zzemrVar) {
        zzfhq zzfhqVar;
        zzcar zzcarVar = new zzcar(zzlVar, str);
        zzfhg zzb = zzfhf.zzb(this.zza, 7, 5, zzcarVar.zza);
        if (zzcarVar.zzb == null) {
            zzcfi.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // java.lang.Runnable
                public final void run() {
                    zzfat.this.zzi();
                }
            });
        } else {
            zzfvj zzfvjVar = this.zzi;
            if (zzfvjVar == null || zzfvjVar.isDone()) {
                if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                    zzeyv zzeyvVar = this.zze;
                    if (zzeyvVar.zzd() != null) {
                        zzfhq zzh = ((zzdsx) zzeyvVar.zzd()).zzh();
                        zzh.zzh(5);
                        zzh.zzb(zzcarVar.zza.zzp);
                        zzfhqVar = zzh;
                        zzfcs.zza(this.zza, zzcarVar.zza.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzcarVar.zza.zzf) {
                            this.zzc.zzk().zzl(true);
                        }
                        zzfbw zzfbwVar = this.zzh;
                        zzfbwVar.zzs(zzcarVar.zzb);
                        zzfbwVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                        zzfbwVar.zzE(zzcarVar.zza);
                        zzfby zzG = zzfbwVar.zzG();
                        zzfas zzfasVar = new zzfas(null);
                        zzfasVar.zza = zzG;
                        zzfasVar.zzb = null;
                        zzfvj zzc = this.zze.zzc(new zzeyw(zzfasVar, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzfan
                            @Override // com.google.android.gms.internal.ads.zzeyu
                            public final zzdba zza(zzeyt zzeytVar) {
                                return zzfat.zzc(zzfat.this, zzeytVar);
                            }
                        }, null);
                        this.zzi = zzc;
                        zzfva.zzr(zzc, new zzfaq(this, zzemrVar, zzfhqVar, zzb, zzfasVar), this.zzb);
                        return true;
                    }
                }
                zzfhqVar = null;
                zzfcs.zza(this.zza, zzcarVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
                    this.zzc.zzk().zzl(true);
                }
                zzfbw zzfbwVar2 = this.zzh;
                zzfbwVar2.zzs(zzcarVar.zzb);
                zzfbwVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfbwVar2.zzE(zzcarVar.zza);
                zzfby zzG2 = zzfbwVar2.zzG();
                zzfas zzfasVar2 = new zzfas(null);
                zzfasVar2.zza = zzG2;
                zzfasVar2.zzb = null;
                zzfvj zzc2 = this.zze.zzc(new zzeyw(zzfasVar2, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzfan
                    @Override // com.google.android.gms.internal.ads.zzeyu
                    public final zzdba zza(zzeyt zzeytVar) {
                        return zzfat.zzc(zzfat.this, zzeytVar);
                    }
                }, null);
                this.zzi = zzc2;
                zzfva.zzr(zzc2, new zzfaq(this, zzemrVar, zzfhqVar, zzb, zzfasVar2), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfcx.zzd(6, null, null));
    }

    public final void zzj(int i2) {
        this.zzh.zzo().zza(i2);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzezj implements zzems {
    private final Context zza;
    private final Executor zzb;
    private final zzcnf zzc;
    private final zzemc zzd;
    private final zzfaj zze;
    private zzbit zzf;
    private final zzfhs zzg;
    private final zzfbw zzh;
    private zzfvj zzi;

    public zzezj(Context context, Executor executor, zzcnf zzcnfVar, zzemc zzemcVar, zzfaj zzfajVar, zzfbw zzfbwVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnfVar;
        this.zzd = zzemcVar;
        this.zzh = zzfbwVar;
        this.zze = zzfajVar;
        this.zzg = zzcnfVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zza() {
        zzfvj zzfvjVar = this.zzi;
        return (zzfvjVar == null || zzfvjVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemq zzemqVar, zzemr zzemrVar) {
        zzdkx zzf;
        zzfhq zzfhqVar;
        zzfhg zzb = zzfhf.zzb(this.zza, 7, 4, zzlVar);
        if (str == null) {
            zzcfi.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezd
                @Override // java.lang.Runnable
                public final void run() {
                    zzezj.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzk().zzl(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzezc) zzemqVar).zza;
            zzfbw zzfbwVar = this.zzh;
            zzfbwVar.zzs(str);
            zzfbwVar.zzr(zzqVar);
            zzfbwVar.zzE(zzlVar);
            zzfby zzG = zzfbwVar.zzG();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgN)).booleanValue()) {
                zzdkw zzg = this.zzc.zzg();
                zzdbc zzdbcVar = new zzdbc();
                zzdbcVar.zzc(this.zza);
                zzdbcVar.zzf(zzG);
                zzg.zze(zzdbcVar.zzg());
                zzdhc zzdhcVar = new zzdhc();
                zzdhcVar.zzj(this.zzd, this.zzb);
                zzdhcVar.zzk(this.zzd, this.zzb);
                zzg.zzd(zzdhcVar.zzn());
                zzg.zzc(new zzekm(this.zzf));
                zzf = zzg.zzf();
            } else {
                zzdhc zzdhcVar2 = new zzdhc();
                zzfaj zzfajVar = this.zze;
                if (zzfajVar != null) {
                    zzdhcVar2.zze(zzfajVar, this.zzb);
                    zzdhcVar2.zzf(this.zze, this.zzb);
                    zzdhcVar2.zzb(this.zze, this.zzb);
                }
                zzdkw zzg2 = this.zzc.zzg();
                zzdbc zzdbcVar2 = new zzdbc();
                zzdbcVar2.zzc(this.zza);
                zzdbcVar2.zzf(zzG);
                zzg2.zze(zzdbcVar2.zzg());
                zzdhcVar2.zzj(this.zzd, this.zzb);
                zzdhcVar2.zze(this.zzd, this.zzb);
                zzdhcVar2.zzf(this.zzd, this.zzb);
                zzdhcVar2.zzb(this.zzd, this.zzb);
                zzdhcVar2.zza(this.zzd, this.zzb);
                zzdhcVar2.zzl(this.zzd, this.zzb);
                zzdhcVar2.zzk(this.zzd, this.zzb);
                zzdhcVar2.zzi(this.zzd, this.zzb);
                zzdhcVar2.zzc(this.zzd, this.zzb);
                zzg2.zzd(zzdhcVar2.zzn());
                zzg2.zzc(new zzekm(this.zzf));
                zzf = zzg2.zzf();
            }
            zzdkx zzdkxVar = zzf;
            if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                zzfhq zzf2 = zzdkxVar.zzf();
                zzf2.zzh(4);
                zzf2.zzb(zzlVar.zzp);
                zzfhqVar = zzf2;
            } else {
                zzfhqVar = null;
            }
            zzcyz zza = zzdkxVar.zza();
            zzfvj zzh = zza.zzh(zza.zzi());
            this.zzi = zzh;
            zzfva.zzr(zzh, new zzezi(this, zzemrVar, zzfhqVar, zzb, zzdkxVar), this.zzb);
            return true;
        }
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfcx.zzd(6, null, null));
    }

    public final void zzi(zzbit zzbitVar) {
        this.zzf = zzbitVar;
    }
}

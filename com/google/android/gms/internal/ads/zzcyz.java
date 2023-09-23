package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcyz {
    private final zzeas zza;
    private final zzfby zzb;
    private final zzfge zzc;
    private final zzcsm zzd;
    private final zzeiq zze;
    private final zzdgw zzf;
    private zzfbs zzg;
    private final zzebw zzh;
    private final zzday zzi;
    private final Executor zzj;
    private final zzebj zzk;
    private final zzefd zzl;

    public zzcyz(zzeas zzeasVar, zzfby zzfbyVar, zzfge zzfgeVar, zzcsm zzcsmVar, zzeiq zzeiqVar, zzdgw zzdgwVar, zzfbs zzfbsVar, zzebw zzebwVar, zzday zzdayVar, Executor executor, zzebj zzebjVar, zzefd zzefdVar) {
        this.zza = zzeasVar;
        this.zzb = zzfbyVar;
        this.zzc = zzfgeVar;
        this.zzd = zzcsmVar;
        this.zze = zzeiqVar;
        this.zzf = zzdgwVar;
        this.zzg = zzfbsVar;
        this.zzh = zzebwVar;
        this.zzi = zzdayVar;
        this.zzj = executor;
        this.zzk = zzebjVar;
        this.zzl = zzefdVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfcx.zzb(th, this.zzl);
    }

    public final zzdgw zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfbs zzd(zzfbs zzfbsVar) {
        this.zzd.zza(zzfbsVar);
        return zzfbsVar;
    }

    public final zzfvj zze(final zzfdu zzfduVar) {
        zzffj zza = this.zzc.zzb(zzffy.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfuh() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzcyz.this.zzf(zzfduVar, (zzbzu) obj);
            }
        }).zza();
        zzfva.zzr(zza, new zzcyx(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ zzfvj zzf(zzfdu zzfduVar, zzbzu zzbzuVar) {
        zzbzuVar.zzi = zzfduVar;
        return this.zzh.zza(zzbzuVar);
    }

    public final zzfvj zzg(zzbzu zzbzuVar) {
        zzffj zza = this.zzc.zzb(zzffy.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbzuVar)).zza();
        zzfva.zzr(zza, new zzcyy(this), this.zzj);
        return zza;
    }

    public final zzfvj zzh(zzfvj zzfvjVar) {
        zzffv zzf = this.zzc.zzb(zzffy.RENDERER, zzfvjVar).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzfbs zzfbsVar = (zzfbs) obj;
                zzcyz.this.zzd(zzfbsVar);
                return zzfbsVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzew)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final zzfvj zzi() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzc(this.zza.zza(), zzffy.PRELOADED_LOADER, zzfgeVar).zza();
    }

    public final zzfvj zzj(zzfvj zzfvjVar) {
        zzfbs zzfbsVar = this.zzg;
        if (zzfbsVar != null) {
            zzfge zzfgeVar = this.zzc;
            return zzffo.zzc(zzfva.zzi(zzfbsVar), zzffy.SERVER_TRANSACTION, zzfgeVar).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        zzffv zzb = this.zzc.zzb(zzffy.SERVER_TRANSACTION, zzfvjVar);
        final zzebj zzebjVar = this.zzk;
        return zzb.zzf(new zzfuh() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzebj.this.zzb((zzbzu) obj);
            }
        }).zza();
    }

    public final void zzk(zzfbs zzfbsVar) {
        this.zzg = zzfbsVar;
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdas implements zzdbs, zzdip, zzdgj, zzdci {
    private final zzdck zza;
    private final zzfbg zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfvr zze = zzfvr.zzf();
    private ScheduledFuture zzf;

    public zzdas(zzdck zzdckVar, zzfbg zzfbgVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzdckVar;
        this.zzb = zzfbgVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzd(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final synchronized void zzd() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbp)).booleanValue()) {
            zzfbg zzfbgVar = this.zzb;
            if (zzfbgVar.zzZ == 2) {
                if (zzfbgVar.zzr == 0) {
                    this.zza.zza();
                    return;
                }
                zzfva.zzr(this.zze, new zzdar(this), this.zzd);
                this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdaq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdas.this.zzb();
                    }
                }, this.zzb.zzr, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zze(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
        int i2 = this.zzb.zzZ;
        if (i2 == 0 || i2 == 1) {
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(zzcak zzcakVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
    }
}

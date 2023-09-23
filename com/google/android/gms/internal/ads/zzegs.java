package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzegs implements zzeey {
    private final zzcwr zza;
    private final zzefz zzb;
    private final zzfvk zzc;
    private final zzdbu zzd;
    private final ScheduledExecutorService zze;

    public zzegs(zzcwr zzcwrVar, zzefz zzefzVar, zzdbu zzdbuVar, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvkVar) {
        this.zza = zzcwrVar;
        this.zzb = zzefzVar;
        this.zzd = zzdbuVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzegp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzegs.this.zzc(zzfbsVar, zzfbgVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        return zzfbsVar.zza.zza.zza() != null && this.zzb.zzb(zzfbsVar, zzfbgVar);
    }

    public final /* synthetic */ zzcvu zzc(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        return this.zza.zzb(new zzcyl(zzfbsVar, zzfbgVar, null), new zzcxe(zzfbsVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // java.lang.Runnable
            public final void run() {
                zzegs.this.zzf(zzfbsVar, zzfbgVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfva.zzr(zzfva.zzo(this.zzb.zza(zzfbsVar, zzfbgVar), zzfbgVar.zzS, TimeUnit.SECONDS, this.zze), new zzegr(this), this.zzc);
    }
}

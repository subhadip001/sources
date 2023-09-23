package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdcf extends zzdhb implements zzdbw {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzdcf(zzdce zzdceVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzj(zzdceVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdbw) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzb() {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdbw) obj).zzb();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            zzcfi.zzg("Timeout waiting for show call succeed to be called.");
            zze(new zzdle("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zzd() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zze(final zzdle zzdleVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdbx
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdbw) obj).zze(zzdle.this);
            }
        });
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // java.lang.Runnable
            public final void run() {
                zzdcf.this.zzc();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzic)).intValue(), TimeUnit.MILLISECONDS);
    }
}

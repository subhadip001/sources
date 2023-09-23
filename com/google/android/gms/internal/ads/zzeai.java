package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeai {
    private final ScheduledExecutorService zza;
    private final zzfvk zzb;
    private final zzeaz zzc;
    private final zzgpo zzd;

    public zzeai(ScheduledExecutorService scheduledExecutorService, zzfvk zzfvkVar, zzeaz zzeazVar, zzgpo zzgpoVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfvkVar;
        this.zzc = zzeazVar;
        this.zzd = zzgpoVar;
    }

    public final /* synthetic */ zzfvj zza(zzbzu zzbzuVar, int i2, Throwable th) {
        return ((zzecn) this.zzd.zzb()).zzd(zzbzuVar, i2);
    }

    public final zzfvj zzb(final zzbzu zzbzuVar) {
        zzfvj zzfvjVar;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzfvjVar = zzfva.zzh(new zzebm(1));
        } else {
            final zzeaz zzeazVar = this.zzc;
            synchronized (zzeazVar.zzb) {
                if (zzeazVar.zzc) {
                    zzfvjVar = zzeazVar.zza;
                } else {
                    zzeazVar.zzc = true;
                    zzeazVar.zze = zzbzuVar;
                    zzeazVar.zzf.checkAvailabilityAndConnect();
                    zzeazVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeay
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeaz.this.zza();
                        }
                    }, zzcfv.zzf);
                    zzfvjVar = zzeazVar.zza;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfva.zzg((zzfur) zzfva.zzo(zzfur.zzv(zzfvjVar), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeah
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzeai.this.zza(zzbzuVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}

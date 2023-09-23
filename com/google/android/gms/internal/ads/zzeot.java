package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeot implements zzetb {
    @VisibleForTesting
    public final zzcer zza;
    @VisibleForTesting
    public AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvk zzd;
    private final Context zze;

    public zzeot(Context context, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcn)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcj)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzco)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzck)).booleanValue()) {
                    return zzfva.zzm(zzfnx.zza(this.zzb.getAppSetIdInfo()), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeoq
                        @Override // com.google.android.gms.internal.ads.zzfoi
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzeou(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzcfv.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcn)).booleanValue()) {
                    appSetIdInfo = zzfda.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzfva.zzi(new zzeou(null, -1));
                }
                zzfvj zzn = zzfva.zzn(zzfnx.zza(appSetIdInfo), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeor
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzfva.zzi(new zzeou(null, -1));
                        }
                        return zzfva.zzi(new zzeou(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzcfv.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcl)).booleanValue()) {
                    zzn = zzfva.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcm)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfva.zzf(zzn, Exception.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeos
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        zzeot.this.zza.zzt((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeou(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfva.zzi(new zzeou(null, -1));
    }
}

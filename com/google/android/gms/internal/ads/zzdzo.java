package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdzo {
    private final zzfvk zza;
    private final zzfvk zzb;
    private final zzeav zzc;
    private final zzgpo zzd;

    public zzdzo(zzfvk zzfvkVar, zzfvk zzfvkVar2, zzeav zzeavVar, zzgpo zzgpoVar) {
        this.zza = zzfvkVar;
        this.zzb = zzfvkVar2;
        this.zzc = zzeavVar;
        this.zzd = zzgpoVar;
    }

    public final /* synthetic */ zzfvj zza(zzbzu zzbzuVar, int i2, zzebm zzebmVar) {
        return ((zzecn) this.zzd.zzb()).zzc(zzbzuVar, i2);
    }

    public final zzfvj zzb(final zzbzu zzbzuVar) {
        zzfvj zzg;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzg = zzfva.zzh(new zzebm(1));
        } else {
            zzg = zzfva.zzg(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdzo.this.zzc(zzbzuVar);
                }
            }), ExecutionException.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdzm
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzfva.zzh(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfva.zzg(zzg, zzebm.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzdzo.this.zza(zzbzuVar, callingUid, (zzebm) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbzu zzbzuVar) {
        zzcga zzcgaVar;
        final zzeav zzeavVar = this.zzc;
        synchronized (zzeavVar.zzb) {
            if (zzeavVar.zzc) {
                zzcgaVar = zzeavVar.zza;
            } else {
                zzeavVar.zzc = true;
                zzeavVar.zze = zzbzuVar;
                zzeavVar.zzf.checkAvailabilityAndConnect();
                zzeavVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeau
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeav.this.zza();
                    }
                }, zzcfv.zzf);
                zzcgaVar = zzeavVar.zza;
            }
        }
        return (InputStream) zzcgaVar.get(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS);
    }
}

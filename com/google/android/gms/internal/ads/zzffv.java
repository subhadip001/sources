package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzffv {
    public final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final String zzc;
    private final zzfvj zzd;
    private final List zze;
    private final zzfvj zzf;

    private zzffv(zzffw zzffwVar, Object obj, String str, zzfvj zzfvjVar, List list, zzfvj zzfvjVar2) {
        this.zza = zzffwVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfvjVar;
        this.zze = list;
        this.zzf = zzfvjVar2;
    }

    public final zzffj zza() {
        zzffx zzffxVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzffj zzffjVar = new zzffj(obj, str, this.zzf);
        zzffxVar = this.zza.zzd;
        zzffxVar.zza(zzffjVar);
        zzfvj zzfvjVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzffp
            @Override // java.lang.Runnable
            public final void run() {
                zzffx zzffxVar2;
                zzffv zzffvVar = zzffv.this;
                zzffj zzffjVar2 = zzffjVar;
                zzffxVar2 = zzffvVar.zza.zzd;
                zzffxVar2.zzc(zzffjVar2);
            }
        };
        zzfvk zzfvkVar = zzcfv.zzf;
        zzfvjVar.zzc(runnable, zzfvkVar);
        zzfva.zzr(zzffjVar, new zzfft(this, zzffjVar), zzfvkVar);
        return zzffjVar;
    }

    public final zzffv zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzffv zzc(Class cls, zzfuh zzfuhVar) {
        zzfvk zzfvkVar;
        zzffw zzffwVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfvj zzfvjVar = this.zzd;
        List list = this.zze;
        zzfvj zzfvjVar2 = this.zzf;
        zzfvkVar = zzffwVar.zzb;
        return new zzffv(zzffwVar, obj, str, zzfvjVar, list, zzfva.zzg(zzfvjVar2, cls, zzfuhVar, zzfvkVar));
    }

    public final zzffv zzd(final zzfvj zzfvjVar) {
        return zzg(new zzfuh() { // from class: com.google.android.gms.internal.ads.zzffq
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzfvj.this;
            }
        }, zzcfv.zzf);
    }

    public final zzffv zze(final zzffh zzffhVar) {
        return zzf(new zzfuh() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzfva.zzi(zzffh.this.zza(obj));
            }
        });
    }

    public final zzffv zzf(zzfuh zzfuhVar) {
        zzfvk zzfvkVar;
        zzfvkVar = this.zza.zzb;
        return zzg(zzfuhVar, zzfvkVar);
    }

    public final zzffv zzg(zzfuh zzfuhVar, Executor executor) {
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfva.zzn(this.zzf, zzfuhVar, executor));
    }

    public final zzffv zzh(String str) {
        return new zzffv(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzffv zzi(long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzffw zzffwVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfvj zzfvjVar = this.zzd;
        List list = this.zze;
        zzfvj zzfvjVar2 = this.zzf;
        scheduledExecutorService = zzffwVar.zzc;
        return new zzffv(zzffwVar, obj, str, zzfvjVar, list, zzfva.zzo(zzfvjVar2, j2, timeUnit, scheduledExecutorService));
    }
}

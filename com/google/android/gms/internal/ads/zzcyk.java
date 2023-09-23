package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcyk {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfvj zzc;
    private volatile boolean zzd = true;

    public zzcyk(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfvj zzfvjVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfvjVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzcyk zzcykVar, List list, final zzfuw zzfuwVar) {
        if (list != null && !list.isEmpty()) {
            zzfvj zzi = zzfva.zzi(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final zzfvj zzfvjVar = (zzfvj) it.next();
                zzi = zzfva.zzn(zzfva.zzg(zzi, Throwable.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzcyf
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        zzfuw.this.zza((Throwable) obj);
                        return zzfva.zzi(null);
                    }
                }, zzcykVar.zza), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzcyg
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        return zzcyk.this.zza(zzfuwVar, zzfvjVar, (zzcxw) obj);
                    }
                }, zzcykVar.zza);
            }
            zzfva.zzr(zzi, new zzcyj(zzcykVar, zzfuwVar), zzcykVar.zza);
            return;
        }
        zzcykVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // java.lang.Runnable
            public final void run() {
                zzfuw.this.zza(new zzdzk(3));
            }
        });
    }

    public final /* synthetic */ zzfvj zza(zzfuw zzfuwVar, zzfvj zzfvjVar, zzcxw zzcxwVar) {
        if (zzcxwVar != null) {
            zzfuwVar.zzb(zzcxwVar);
        }
        return zzfva.zzo(zzfvjVar, ((Long) zzbka.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfuw zzfuwVar) {
        zzfva.zzr(this.zzc, new zzcyi(this, zzfuwVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}

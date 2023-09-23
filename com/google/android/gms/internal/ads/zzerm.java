package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzerm implements zzetb {
    private final zzetb zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzerm(zzetb zzetbVar, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetbVar;
        this.zzb = j2;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 28;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        zzfvj zzb = this.zza.zzb();
        long j2 = this.zzb;
        if (j2 > 0) {
            zzb = zzfva.zzo(zzb, j2, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfva.zzg(zzb, Throwable.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzerl
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                Throwable th = (Throwable) obj;
                return zzfva.zzi(null);
            }
        }, zzcfv.zzf);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcxl implements zzddg, zzbam {
    private final zzfbg zza;
    private final zzdck zzb;
    private final zzddp zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcxl(zzfbg zzfbgVar, zzdck zzdckVar, zzddp zzddpVar) {
        this.zza = zzfbgVar;
        this.zzb = zzdckVar;
        this.zzc = zzddpVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(zzbal zzbalVar) {
        if (this.zza.zzf == 1 && zzbalVar.zzj) {
            zza();
        }
        if (zzbalVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeke implements com.google.android.gms.ads.internal.zzf {
    public final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdbq zzb;
    private final zzdck zzc;
    private final zzdjh zzd;
    private final zzdja zze;
    private final zzcuc zzf;

    public zzeke(zzdbq zzdbqVar, zzdck zzdckVar, zzdjh zzdjhVar, zzdja zzdjaVar, zzcuc zzcucVar) {
        this.zzb = zzdbqVar;
        this.zzc = zzdckVar;
        this.zzd = zzdjhVar;
        this.zze = zzdjaVar;
        this.zzf = zzcucVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}

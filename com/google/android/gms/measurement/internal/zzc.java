package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzc implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, long j2) {
        this.zzb = zzdVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzj(this.zza);
    }
}

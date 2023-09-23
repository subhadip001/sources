package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzij implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzim zzb;

    public zzij(zzim zzimVar, long j2) {
        this.zzb = zzimVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}

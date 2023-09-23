package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcyj implements zzfuw {
    public final /* synthetic */ zzfuw zza;
    public final /* synthetic */ zzcyk zzb;

    public zzcyj(zzcyk zzcykVar, zzfuw zzfuwVar) {
        this.zzb = zzcykVar;
        this.zza = zzfuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // java.lang.Runnable
            public final void run() {
                zzcyk.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // java.lang.Runnable
            public final void run() {
                zzcyk.this.zzd();
            }
        });
        this.zza.zzb((zzcxw) obj);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdyg implements zzfuw {
    public final /* synthetic */ zzdyi zza;

    public zzdyg(zzdyi zzdyiVar) {
        this.zza = zzdyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        long j2;
        zzcga zzcgaVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyi zzdyiVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            j2 = this.zza.zzd;
            zzdyiVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j2));
            zzcgaVar = this.zza.zze;
            zzcgaVar.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j2;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyi zzdyiVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            j2 = this.zza.zzd;
            zzdyiVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j2));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyg zzdygVar = zzdyg.this;
                    zzdyi.zzj(zzdygVar.zza, str);
                }
            });
        }
    }
}

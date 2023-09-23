package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzask implements Runnable {
    public final /* synthetic */ zzars zza;
    public final /* synthetic */ zzaso zzb;

    public zzask(zzaso zzasoVar, zzars zzarsVar) {
        this.zzb = zzasoVar;
        this.zza = zzarsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasp zzaspVar;
        zzaspVar = this.zzb.zzb;
        zzaspVar.zzh(this.zza);
    }
}

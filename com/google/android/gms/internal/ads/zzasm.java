package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzasm implements Runnable {
    public final /* synthetic */ zzatm zza;
    public final /* synthetic */ zzaso zzb;

    public zzasm(zzaso zzasoVar, zzatm zzatmVar) {
        this.zzb = zzasoVar;
        this.zza = zzatmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}

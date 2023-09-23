package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zza implements Runnable {
    public final /* synthetic */ zzb zza;

    public zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb = Thread.currentThread();
        this.zza.zza();
    }
}

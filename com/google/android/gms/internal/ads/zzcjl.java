package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjl implements Runnable {
    public final /* synthetic */ zzcjm zza;

    public zzcjl(zzcjm zzcjmVar) {
        this.zza = zzcjmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this.zza);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbaf implements Runnable {
    public final /* synthetic */ zzatm zza;
    public final /* synthetic */ zzbag zzb;

    public zzbaf(zzbag zzbagVar, zzatm zzatmVar) {
        this.zzb = zzbagVar;
        this.zza = zzatmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}

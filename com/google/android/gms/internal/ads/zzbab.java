package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbab implements Runnable {
    public final /* synthetic */ zzars zza;
    public final /* synthetic */ zzbag zzb;

    public zzbab(zzbag zzbagVar, zzars zzarsVar) {
        this.zzb = zzbagVar;
        this.zza = zzarsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar;
        zzbahVar = this.zzb.zzb;
        zzbahVar.zzn(this.zza);
    }
}

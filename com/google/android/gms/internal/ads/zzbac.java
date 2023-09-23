package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbac implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzbag zzc;

    public zzbac(zzbag zzbagVar, int i2, long j2) {
        this.zzc = zzbagVar;
        this.zza = i2;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar;
        zzbahVar = this.zzc.zzb;
        zzbahVar.zzl(this.zza, this.zzb);
    }
}

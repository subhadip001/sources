package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbad implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ float zzd;
    public final /* synthetic */ zzbag zze;

    public zzbad(zzbag zzbagVar, int i2, int i3, int i4, float f2) {
        this.zze = zzbagVar;
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar;
        zzbahVar = this.zze.zzb;
        zzbahVar.zzo(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

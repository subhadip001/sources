package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcgr implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzcgv zzc;

    public zzcgr(zzcgv zzcgvVar, int i2, int i3) {
        this.zzc = zzcgvVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        zzcgw zzcgwVar2;
        zzcgv zzcgvVar = this.zzc;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            zzcgwVar2 = zzcgvVar.zzq;
            zzcgwVar2.zzj(this.zza, this.zzb);
        }
    }
}

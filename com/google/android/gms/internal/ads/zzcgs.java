package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcgs implements Runnable {
    public final /* synthetic */ zzcgv zza;

    public zzcgs(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        zzcgw zzcgwVar2;
        zzcgw zzcgwVar3;
        zzcgv zzcgvVar = this.zza;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            zzcgwVar2 = zzcgvVar.zzq;
            zzcgwVar2.zzd();
            zzcgwVar3 = this.zza.zzq;
            zzcgwVar3.zzi();
        }
    }
}

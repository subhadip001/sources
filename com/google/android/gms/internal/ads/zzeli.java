package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeli implements zzemr {
    public final /* synthetic */ zzelj zza;

    public zzeli(zzelj zzeljVar) {
        this.zza = zzeljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvu zzcvuVar;
        zzcvu zzcvuVar2;
        zzcvu zzcvuVar3;
        zzcvu zzcvuVar4 = (zzcvu) obj;
        synchronized (this.zza) {
            zzelj zzeljVar = this.zza;
            zzcvuVar = zzeljVar.zzh;
            if (zzcvuVar != null) {
                zzcvuVar3 = zzeljVar.zzh;
                zzcvuVar3.zzV();
            }
            this.zza.zzh = zzcvuVar4;
            zzcvuVar2 = this.zza.zzh;
            zzcvuVar2.zzW();
        }
    }
}

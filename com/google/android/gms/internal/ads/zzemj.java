package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemj implements zzemr {
    public final /* synthetic */ zzemk zza;

    public zzemj(zzemk zzemkVar) {
        this.zza = zzemkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjy zzdjyVar;
        zzdjy zzdjyVar2 = (zzdjy) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdjyVar2;
            zzdjyVar = this.zza.zzh;
            zzdjyVar.zzW();
        }
    }
}

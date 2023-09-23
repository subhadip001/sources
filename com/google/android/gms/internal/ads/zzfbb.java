package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbb implements zzemr {
    public final /* synthetic */ zzfbd zza;

    public zzfbb(zzfbd zzfbdVar) {
        this.zza = zzfbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdss zzdssVar;
        zzdss zzdssVar2 = (zzdss) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdssVar2;
            zzdssVar = this.zza.zzd;
            zzdssVar.zzW();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfaw implements zzemr {
    public final /* synthetic */ zzfax zza;

    public zzfaw(zzfax zzfaxVar) {
        this.zza = zzfaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdss zzdssVar;
        zzdss zzdssVar2 = (zzdss) obj;
        synchronized (this.zza) {
            this.zza.zzg = zzdssVar2;
            zzdssVar = this.zza.zzg;
            zzdssVar.zzW();
        }
    }
}

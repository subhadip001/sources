package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfft implements zzfuw {
    public final /* synthetic */ zzffj zza;
    public final /* synthetic */ zzffv zzb;

    public zzfft(zzffv zzffvVar, zzffj zzffjVar) {
        this.zzb = zzffvVar;
        this.zza = zzffjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzffx zzffxVar;
        zzffxVar = this.zzb.zza.zzd;
        zzffxVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzb(Object obj) {
        zzffx zzffxVar;
        zzffxVar = this.zzb.zza.zzd;
        zzffxVar.zzd(this.zza);
    }
}

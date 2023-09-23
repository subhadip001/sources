package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzedu implements zzfgf {
    private final zzedr zza;

    public zzedu(zzedr zzedrVar) {
        this.zza = zzedrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbF(zzffy zzffyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && zzffy.RENDERER == zzffyVar && this.zza.zzc() != 0) {
            this.zza.zze(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzc(zzffy zzffyVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && zzffy.RENDERER == zzffyVar) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && zzffy.RENDERER == zzffyVar && this.zza.zzc() != 0) {
            this.zza.zze(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }
}

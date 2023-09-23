package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzczj implements zzddg, com.google.android.gms.ads.internal.client.zza, zzden, zzdcm, zzdbs, zzdgy {
    private final Clock zza;
    private final zzcek zzb;

    public zzczj(Clock clock, zzcek zzcekVar) {
        this.zza = clock;
        this.zzb = zzcekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zze(zzbeg zzbegVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzf(zzbeg zzbegVar) {
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzi(zzbeg zzbegVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzk(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(zzcak zzcakVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
    }
}

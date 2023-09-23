package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdxk {
    private final zzbpg zza;

    public zzdxk(zzbpg zzbpgVar) {
        this.zza = zzbpgVar;
    }

    private final void zzs(zzdxj zzdxjVar) {
        String zza = zzdxj.zza(zzdxjVar);
        zzcfi.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() {
        zzs(new zzdxj("initialize", null));
    }

    public final void zzb(long j2) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdClicked";
        this.zza.zzb(zzdxj.zza(zzdxjVar));
    }

    public final void zzc(long j2) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdClosed";
        zzs(zzdxjVar);
    }

    public final void zzd(long j2, int i2) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdFailedToLoad";
        zzdxjVar.zzd = Integer.valueOf(i2);
        zzs(zzdxjVar);
    }

    public final void zze(long j2) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdLoaded";
        zzs(zzdxjVar);
    }

    public final void zzf(long j2) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxjVar);
    }

    public final void zzg(long j2) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdOpened";
        zzs(zzdxjVar);
    }

    public final void zzh(long j2) {
        zzdxj zzdxjVar = new zzdxj("creation", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "nativeObjectCreated";
        zzs(zzdxjVar);
    }

    public final void zzi(long j2) {
        zzdxj zzdxjVar = new zzdxj("creation", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "nativeObjectNotCreated";
        zzs(zzdxjVar);
    }

    public final void zzj(long j2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdClicked";
        zzs(zzdxjVar);
    }

    public final void zzk(long j2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onRewardedAdClosed";
        zzs(zzdxjVar);
    }

    public final void zzl(long j2, zzcba zzcbaVar) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onUserEarnedReward";
        zzdxjVar.zze = zzcbaVar.zzf();
        zzdxjVar.zzf = Integer.valueOf(zzcbaVar.zze());
        zzs(zzdxjVar);
    }

    public final void zzm(long j2, int i2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onRewardedAdFailedToLoad";
        zzdxjVar.zzd = Integer.valueOf(i2);
        zzs(zzdxjVar);
    }

    public final void zzn(long j2, int i2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onRewardedAdFailedToShow";
        zzdxjVar.zzd = Integer.valueOf(i2);
        zzs(zzdxjVar);
    }

    public final void zzo(long j2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onAdImpression";
        zzs(zzdxjVar);
    }

    public final void zzp(long j2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onRewardedAdLoaded";
        zzs(zzdxjVar);
    }

    public final void zzq(long j2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxjVar);
    }

    public final void zzr(long j2) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j2);
        zzdxjVar.zzc = "onRewardedAdOpened";
        zzs(zzdxjVar);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzeka extends zzbue {
    private final zzdbq zza;
    private final zzdjd zzb;
    private final zzdck zzc;
    private final zzdcz zzd;
    private final zzdde zze;
    private final zzdgl zzf;
    private final zzddy zzg;
    private final zzdjv zzh;
    private final zzdgh zzi;
    private final zzdcf zzj;

    public zzeka(zzdbq zzdbqVar, zzdjd zzdjdVar, zzdck zzdckVar, zzdcz zzdczVar, zzdde zzddeVar, zzdgl zzdglVar, zzddy zzddyVar, zzdjv zzdjvVar, zzdgh zzdghVar, zzdcf zzdcfVar) {
        this.zza = zzdbqVar;
        this.zzb = zzdjdVar;
        this.zzc = zzdckVar;
        this.zzd = zzdczVar;
        this.zze = zzddeVar;
        this.zzf = zzdglVar;
        this.zzg = zzddyVar;
        this.zzh = zzdjvVar;
        this.zzi = zzdghVar;
        this.zzj = zzdcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzf() {
        this.zzg.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzg(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzi(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    @Deprecated
    public final void zzj(int i2) {
        zzk(new com.google.android.gms.ads.internal.client.zze(i2, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfcx.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzo() {
        this.zze.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzq(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzr(zzblu zzbluVar, String str) {
    }

    public void zzs(zzcaw zzcawVar) {
    }

    public void zzt(zzcba zzcbaVar) {
    }

    public void zzu() {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzx() {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}

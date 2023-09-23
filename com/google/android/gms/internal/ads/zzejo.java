package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzejo extends zzcau {
    public final /* synthetic */ zzddy zza;
    public final /* synthetic */ zzdbq zzb;
    public final /* synthetic */ zzdcz zzc;
    public final /* synthetic */ zzdjo zzd;

    public zzejo(zzejp zzejpVar, zzddy zzddyVar, zzdbq zzdbqVar, zzdcz zzdczVar, zzdjo zzdjoVar) {
        this.zza = zzddyVar;
        this.zzb = zzdbqVar;
        this.zzc = zzdczVar;
        this.zzd = zzdjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzg(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzk(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzm(IObjectWrapper iObjectWrapper, zzcaw zzcawVar) {
        this.zzd.zza(zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}

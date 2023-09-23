package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbvb extends zzbue {
    private final Adapter zza;
    private final zzcav zzb;

    public zzbvb(Adapter adapter, zzcav zzcavVar) {
        this.zza = adapter;
        this.zzb = zzcavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zze() {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzf() {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzg(int i2) {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzg(ObjectWrapper.wrap(this.zza), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzi(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzj(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzo() {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzp() {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzq(String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzr(zzblu zzbluVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzs(zzcaw zzcawVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzt(zzcba zzcbaVar) {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzm(ObjectWrapper.wrap(this.zza), new zzcaw(zzcbaVar.zzf(), zzcbaVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzu() {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzx() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzy() {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}

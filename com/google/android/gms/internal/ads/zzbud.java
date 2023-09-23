package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbud extends zzaqv implements zzbuf {
    public zzbud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zze() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzf() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzg(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzi(int i2, String str) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zza.writeString(str);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzj(int i2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzm() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzn() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzo() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzp() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzq(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzr(zzblu zzbluVar, String str) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbluVar);
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzs(zzcaw zzcawVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzt(zzcba zzcbaVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcbaVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzu() {
        zzbl(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzv() {
        zzbl(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzw() {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzx() {
        zzbl(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzy() {
        zzbl(13, zza());
    }
}

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbd extends zzaqv implements zzbf {
    public zzbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() {
        zzbl(5, zza());
    }
}

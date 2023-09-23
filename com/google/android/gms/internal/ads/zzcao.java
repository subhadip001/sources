package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcao extends zzaqv implements zzcaq {
    public zzcao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zze(zzcak zzcakVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcakVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzf() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzg(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzh() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzi() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzj() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzk() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzl() {
        zzbl(3, zza());
    }
}

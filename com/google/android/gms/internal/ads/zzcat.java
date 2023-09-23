package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcat extends zzaqv implements zzcav {
    public zzcat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzg(IObjectWrapper iObjectWrapper, int i2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeInt(i2);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzh(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzk(IObjectWrapper iObjectWrapper, int i2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzm(IObjectWrapper iObjectWrapper, zzcaw zzcawVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzcawVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzn(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(5, zza);
    }
}

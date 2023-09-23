package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbe extends zzaqv implements zzcbg {
    public zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzj() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzk(zzcba zzcbaVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcbaVar);
        zzbl(3, zza);
    }
}

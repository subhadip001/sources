package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxs extends zzaqv implements zzbxu {
    public zzbxs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzE() {
        Parcel zzbk = zzbk(11, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzg(int i2, int i3, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zza.writeInt(i3);
        zzaqx.zze(zza, intent);
        zzbl(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzh() {
        zzbl(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzk(Bundle bundle) {
        Parcel zza = zza();
        zzaqx.zze(zza, bundle);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzl() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzn() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzo() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzp() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzq(Bundle bundle) {
        Parcel zza = zza();
        zzaqx.zze(zza, bundle);
        Parcel zzbk = zzbk(6, zza);
        if (zzbk.readInt() != 0) {
            bundle.readFromParcel(zzbk);
        }
        zzbk.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzr() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzs() {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzt() {
        zzbl(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzv() {
        zzbl(9, zza());
    }
}

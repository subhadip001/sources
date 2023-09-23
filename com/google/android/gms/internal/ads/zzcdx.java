package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcdx extends zzaqv implements zzcdz {
    public zzcdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zze(IObjectWrapper iObjectWrapper, zzced zzcedVar, zzcdw zzcdwVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzcedVar);
        zzaqx.zzg(zza, zzcdwVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzf(zzbys zzbysVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbysVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyjVar);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyjVar);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyjVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyjVar);
        zzbl(5, zza);
    }
}

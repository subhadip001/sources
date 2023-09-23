package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbve extends zzaqv implements zzbvg {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh(zzbui zzbuiVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbuiVar);
        zzbl(4, zza);
    }
}

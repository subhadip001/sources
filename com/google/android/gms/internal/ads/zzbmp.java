package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbmp extends zzaqv implements zzbmr {
    public zzbmp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final boolean zzb(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(2, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}

package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbp extends zzaqv implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzbk = zzbk(1, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}

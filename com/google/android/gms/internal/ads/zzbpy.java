package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbpy extends zzaqv implements IInterface {
    public zzbpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbps zzbpsVar, zzbpx zzbpxVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbpsVar);
        zzaqx.zzg(zza, zzbpxVar);
        zzbm(2, zza);
    }
}

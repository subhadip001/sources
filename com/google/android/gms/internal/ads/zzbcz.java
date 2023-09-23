package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbcz extends zzaqv implements IInterface {
    public zzbcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcx zzbcxVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbcxVar);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    public final zzbcu zzf(zzbcx zzbcxVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbcxVar);
        Parcel zzbk = zzbk(1, zza);
        zzbcu zzbcuVar = (zzbcu) zzaqx.zza(zzbk, zzbcu.CREATOR);
        zzbk.recycle();
        return zzbcuVar;
    }

    public final zzbcu zzg(zzbcx zzbcxVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbcxVar);
        Parcel zzbk = zzbk(2, zza);
        zzbcu zzbcuVar = (zzbcu) zzaqx.zza(zzbk, zzbcu.CREATOR);
        zzbk.recycle();
        return zzbcuVar;
    }
}

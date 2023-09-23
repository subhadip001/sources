package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxl extends zzaqv implements zzbxn {
    public zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbxk zze(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        zzbxk zzbxiVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbxiVar = queryLocalInterface instanceof zzbxk ? (zzbxk) queryLocalInterface : new zzbxi(readStrongBinder);
        }
        zzbk.recycle();
        return zzbxiVar;
    }
}

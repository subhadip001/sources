package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbpk extends zzaqv implements zzbpm {
    public zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbpj zze(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2, zzbpg zzbpgVar) {
        zzbpj zzbphVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        zzaqx.zzg(zza, zzbpgVar);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbphVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbphVar = queryLocalInterface instanceof zzbpj ? (zzbpj) queryLocalInterface : new zzbph(readStrongBinder);
        }
        zzbk.recycle();
        return zzbphVar;
    }
}

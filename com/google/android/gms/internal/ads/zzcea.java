package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcea extends zzaqv implements zzcec {
    public zzcea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcec
    public final zzcdz zze(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        zzcdz zzcdxVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzcdxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcdxVar = queryLocalInterface instanceof zzcdz ? (zzcdz) queryLocalInterface : new zzcdx(readStrongBinder);
        }
        zzbk.recycle();
        return zzcdxVar;
    }
}

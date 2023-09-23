package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbqi extends zzaqw implements zzbqj {
    public zzbqi() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbqj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzbqj ? (zzbqj) queryLocalInterface : new zzbqh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            zzf();
        } else if (i2 != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}

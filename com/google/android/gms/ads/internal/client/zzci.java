package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbtz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzci extends zzaqw implements zzcj {
    public zzci() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcj ? (zzcj) queryLocalInterface : new zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzei liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, liteSdkVersion);
        } else if (i2 != 2) {
            return false;
        } else {
            zzbtz adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, adapterCreator);
        }
        return true;
    }
}

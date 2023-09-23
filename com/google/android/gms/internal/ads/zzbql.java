package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbql extends zzaqw implements zzbqm {
    public zzbql() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbqm zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbqm ? (zzbqm) queryLocalInterface : new zzbqk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbqf.CREATOR);
            zzaqx.zzc(parcel);
            zzb(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

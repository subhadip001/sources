package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-base@@21.0.0 */
/* loaded from: classes.dex */
public class zzaqw extends Binder implements IInterface {
    public zzaqw(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 16777215) {
            if (super.onTransact(i2, parcel, parcel2, i3)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zzbI(i2, parcel, parcel2, i3);
    }

    public boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }
}

package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class zzi extends Binder implements IInterface {
    public zzi(String str) {
        attachInterface(this, "com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 16777215) {
            if (super.onTransact(i2, parcel, parcel2, i3)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zzb(i2, parcel, parcel2, i3);
    }

    public boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }
}

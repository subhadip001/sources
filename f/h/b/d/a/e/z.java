package f.h.b.d.a.e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class z extends Binder implements IInterface {
    public z(String str) {
        attachInterface(this, str);
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
        return p(i2, parcel, parcel2, i3);
    }

    public boolean p(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }
}

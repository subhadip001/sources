package e.v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import e.v.c;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public abstract class d extends Binder implements IInterface {
    public d() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int q = ((MultiInstanceInvalidationService.b) this).q(c.a.p(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(q);
            return true;
        } else if (i2 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).r(c.a.p(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i2 != 3) {
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        } else {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).p(parcel.readInt(), parcel.createStringArray());
            return true;
        }
    }
}

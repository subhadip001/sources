package d.a.a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ICustomTabsCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: d.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0012a extends Binder implements a {
        public AbstractBinderC0012a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i2 == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i2 == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            } else if (i2 != 6) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            } else {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            }
        }
    }
}

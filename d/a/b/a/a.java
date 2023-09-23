package d.a.b.a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: d.a.b.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0014a extends Binder implements a {
        private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
        public static final int TRANSACTION_cancel = 2;
        public static final int TRANSACTION_cancelAll = 3;
        public static final int TRANSACTION_notify = 1;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: d.a.b.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0015a implements a {

            /* renamed from: g  reason: collision with root package name */
            public static a f1415g;

            /* renamed from: f  reason: collision with root package name */
            public IBinder f1416f;

            public C0015a(IBinder iBinder) {
                this.f1416f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1416f;
            }

            @Override // d.a.b.a.a
            public void cancel(String str, int i2, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0014a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (this.f1416f.transact(2, obtain, null, 1) || AbstractBinderC0014a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC0014a.getDefaultImpl().cancel(str, i2, str2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // d.a.b.a.a
            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0014a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f1416f.transact(3, obtain, null, 1) || AbstractBinderC0014a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC0014a.getDefaultImpl().cancelAll(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // d.a.b.a.a
            public void notify(String str, int i2, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0014a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f1416f.transact(1, obtain, null, 1) || AbstractBinderC0014a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC0014a.getDefaultImpl().notify(str, i2, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0014a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0015a(iBinder);
        }

        public static a getDefaultImpl() {
            return C0015a.f1415g;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0015a.f1415g == null) {
                if (aVar != null) {
                    C0015a.f1415g = aVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll(parcel.readString());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancel(String str, int i2, String str2);

    void cancelAll(String str);

    void notify(String str, int i2, String str2, Notification notification);
}

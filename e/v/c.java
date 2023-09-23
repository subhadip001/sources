package e.v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements c {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: e.v.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0058a implements c {

            /* renamed from: f  reason: collision with root package name */
            public IBinder f2941f;

            public C0058a(IBinder iBinder) {
                this.f2941f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2941f;
            }

            @Override // e.v.c
            public void c(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f2941f.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static c p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0058a(iBinder);
        }
    }

    void c(String[] strArr);
}

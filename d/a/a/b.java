package d.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d.a.a.a;

/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int f1413f = 0;

        /* compiled from: ICustomTabsService.java */
        /* renamed from: d.a.a.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0013a implements b {

            /* renamed from: f  reason: collision with root package name */
            public IBinder f1414f;

            public C0013a(IBinder iBinder) {
                this.f1414f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1414f;
            }

            @Override // d.a.a.b
            public boolean e(long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j2);
                    this.f1414f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // d.a.a.b
            public boolean i(d.a.a.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder((a.AbstractBinderC0012a) aVar);
                    this.f1414f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    boolean e(long j2);

    boolean i(d.a.a.a aVar);
}

package d.a.b.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;
import java.util.Objects;

/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IResultReceiver.java */
    /* renamed from: d.a.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0016a extends Binder implements a {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int f1417f = 0;

        /* compiled from: IResultReceiver.java */
        /* renamed from: d.a.b.c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0017a implements a {

            /* renamed from: f  reason: collision with root package name */
            public IBinder f1418f;

            public C0017a(IBinder iBinder) {
                this.f1418f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1418f;
            }
        }

        public AbstractBinderC0016a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            int readInt = parcel.readInt();
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver.b bVar = (ResultReceiver.b) this;
            Objects.requireNonNull(ResultReceiver.this);
            ResultReceiver.this.b(readInt, bundle);
            return true;
        }
    }
}

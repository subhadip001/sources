package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import d.a.b.c.a;

/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public d.a.b.c.a f37f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.AbstractBinderC0016a {
        public b() {
        }
    }

    public ResultReceiver(Parcel parcel) {
        d.a.b.c.a c0017a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = a.AbstractBinderC0016a.f1417f;
        if (readStrongBinder == null) {
            c0017a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof d.a.b.c.a)) {
                c0017a = (d.a.b.c.a) queryLocalInterface;
            } else {
                c0017a = new a.AbstractBinderC0016a.C0017a(readStrongBinder);
            }
        }
        this.f37f = c0017a;
    }

    public void b(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f37f == null) {
                this.f37f = new b();
            }
            parcel.writeStrongBinder(this.f37f.asBinder());
        }
    }
}

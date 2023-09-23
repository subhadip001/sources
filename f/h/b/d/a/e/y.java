package f.h.b.d.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class y implements IInterface {

    /* renamed from: f  reason: collision with root package name */
    public final IBinder f5813f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5814g;

    public y(IBinder iBinder, String str) {
        this.f5813f = iBinder;
        this.f5814g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5813f;
    }

    public final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5814g);
        return obtain;
    }

    public final void q(int i2, Parcel parcel) {
        try {
            this.f5813f.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

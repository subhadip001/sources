package f.h.b.d.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b0 extends y implements d0 {
    public b0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.d0
    public final void h(String str, Bundle bundle, f0 f0Var) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeStrongBinder(f0Var);
        q(2, p);
    }
}

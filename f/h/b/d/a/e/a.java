package f.h.b.d.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class a extends y implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.d.a.e.c
    public final void n(String str, Bundle bundle, e eVar) {
        Parcel p = p();
        p.writeString(str);
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        p.writeStrongBinder(eVar);
        q(2, p);
    }
}

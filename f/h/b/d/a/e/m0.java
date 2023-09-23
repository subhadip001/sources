package f.h.b.d.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class m0 extends y implements IInterface {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void zzd(Bundle bundle) {
        Parcel p = p();
        int i2 = a0.a;
        p.writeInt(1);
        bundle.writeToParcel(p, 0);
        q(3, p);
    }
}

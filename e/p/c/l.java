package e.p.c;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import e.w.a;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class l implements a.b {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // e.w.a.b
    public Bundle b() {
        Bundle bundle = new Bundle();
        do {
        } while (n.I(this.a.H(), Lifecycle.State.CREATED));
        this.a.o.e(Lifecycle.Event.ON_STOP);
        Parcelable f0 = this.a.n.a.f2802i.f0();
        if (f0 != null) {
            bundle.putParcelable("android:support:fragments", f0);
        }
        return bundle;
    }
}

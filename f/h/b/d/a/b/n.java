package f.h.b.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f5667h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, f.h.b.d.a.i.m mVar) {
        super(rVar, mVar);
        this.f5667h = rVar;
    }

    @Override // f.h.b.d.a.b.j, f.h.b.d.a.e.k0
    public final void m(Bundle bundle, Bundle bundle2) {
        super.m(bundle, bundle2);
        if (!this.f5667h.f5690f.compareAndSet(true, false)) {
            r.f5686g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f5667h.zzf();
        }
    }

    @Override // f.h.b.d.a.b.j, f.h.b.d.a.e.k0
    public final void zzd(Bundle bundle) {
        this.f5667h.f5689e.c(this.f5644f);
        int i2 = bundle.getInt("error_code");
        r.f5686g.b("onError(%d)", Integer.valueOf(i2));
        this.f5644f.a(new AssetPackException(i2));
    }
}

package f.h.b.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class j extends f.h.b.d.a.e.j0 {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.d.a.i.m f5644f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f5645g;

    public j(r rVar, f.h.b.d.a.i.m mVar) {
        this.f5645g = rVar;
        this.f5644f = mVar;
    }

    @Override // f.h.b.d.a.e.k0
    public void a(Bundle bundle, Bundle bundle2) {
        this.f5645g.f5688d.c(this.f5644f);
        r.f5686g.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // f.h.b.d.a.e.k0
    public void b(List list) {
        this.f5645g.f5688d.c(this.f5644f);
        r.f5686g.d("onGetSessionStates", new Object[0]);
    }

    @Override // f.h.b.d.a.e.k0
    public void m(Bundle bundle, Bundle bundle2) {
        this.f5645g.f5689e.c(this.f5644f);
        r.f5686g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // f.h.b.d.a.e.k0
    public void zzd(Bundle bundle) {
        this.f5645g.f5688d.c(this.f5644f);
        int i2 = bundle.getInt("error_code");
        r.f5686g.b("onError(%d)", Integer.valueOf(i2));
        this.f5644f.a(new AssetPackException(i2));
    }
}

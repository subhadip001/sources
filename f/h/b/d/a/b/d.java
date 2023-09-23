package f.h.b.d.a.b;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class d extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map f5589g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5590h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r f5591i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, f.h.b.d.a.i.m mVar, Map map, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5591i = rVar;
        this.f5589g = map;
        this.f5590h = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            r rVar = this.f5591i;
            ((f.h.b.d.a.e.i0) rVar.f5688d.n).d(rVar.a, r.j(this.f5589g), new m(this.f5591i, this.f5590h));
        } catch (RemoteException e2) {
            r.f5686g.c(e2, "syncPacks", new Object[0]);
            this.f5590h.a(new RuntimeException(e2));
        }
    }
}

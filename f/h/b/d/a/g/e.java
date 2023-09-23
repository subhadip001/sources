package f.h.b.d.a.g;

import android.os.Bundle;
import android.os.RemoteException;
import f.h.b.d.a.c.a;
import f.h.b.d.a.i.m;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class e extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f5818g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f5819h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, m mVar, m mVar2) {
        super(mVar);
        this.f5819h = gVar;
        this.f5818g = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            g gVar = this.f5819h;
            String str = gVar.b;
            Bundle a = a.a("review");
            g gVar2 = this.f5819h;
            ((f.h.b.d.a.e.c) gVar.a.n).n(str, a, new f(gVar2, this.f5818g, gVar2.b));
        } catch (RemoteException e2) {
            g.c.c(e2, "error requesting in-app review for %s", this.f5819h.b);
            this.f5818g.a(new RuntimeException(e2));
        }
    }
}

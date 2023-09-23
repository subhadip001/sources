package f.h.b.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class f extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5602g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5603h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5604i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f5605j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ r f5606k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, f.h.b.d.a.i.m mVar, int i2, String str, f.h.b.d.a.i.m mVar2, int i3) {
        super(mVar);
        this.f5606k = rVar;
        this.f5602g = i2;
        this.f5603h = str;
        this.f5604i = mVar2;
        this.f5605j = i3;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            r rVar = this.f5606k;
            String str = rVar.a;
            int i2 = this.f5602g;
            String str2 = this.f5603h;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            bundle.putString("module_name", str2);
            ((f.h.b.d.a.e.i0) rVar.f5688d.n).o(str, bundle, r.f(), new p(this.f5606k, this.f5604i, this.f5602g, this.f5603h, this.f5605j));
        } catch (RemoteException e2) {
            r.f5686g.c(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}

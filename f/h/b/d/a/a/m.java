package f.h.b.d.a.a;

import android.os.RemoteException;
import f.h.b.d.a.e.d0;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class m extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f5547g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5548h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ o f5549i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, f.h.b.d.a.i.m mVar, String str, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5549i = oVar;
        this.f5547g = str;
        this.f5548h = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            o oVar = this.f5549i;
            ((d0) oVar.a.n).h(oVar.b, o.a(oVar, this.f5547g), new n(this.f5549i, this.f5548h, this.f5547g));
        } catch (RemoteException e2) {
            o.f5555e.c(e2, "requestUpdateInfo(%s)", this.f5547g);
            this.f5548h.a(new RuntimeException(e2));
        }
    }
}

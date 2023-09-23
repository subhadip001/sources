package f.h.b.d.a.b;

import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class e extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5594g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5595h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5596i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f5597j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5598k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r f5599l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, f.h.b.d.a.i.m mVar, int i2, String str, String str2, int i3, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5599l = rVar;
        this.f5594g = i2;
        this.f5595h = str;
        this.f5596i = str2;
        this.f5597j = i3;
        this.f5598k = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            r rVar = this.f5599l;
            ((f.h.b.d.a.e.i0) rVar.f5688d.n).j(rVar.a, r.i(this.f5594g, this.f5595h, this.f5596i, this.f5597j), r.f(), new o(this.f5599l, this.f5598k));
        } catch (RemoteException e2) {
            r.f5686g.c(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}

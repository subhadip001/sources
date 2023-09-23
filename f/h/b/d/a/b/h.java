package f.h.b.d.a.b;

import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class h extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5616g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5617h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5618i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f5619j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5620k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r f5621l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, f.h.b.d.a.i.m mVar, int i2, String str, String str2, int i3, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5621l = rVar;
        this.f5616g = i2;
        this.f5617h = str;
        this.f5618i = str2;
        this.f5619j = i3;
        this.f5620k = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        try {
            r rVar = this.f5621l;
            ((f.h.b.d.a.e.i0) rVar.f5688d.n).f(rVar.a, r.i(this.f5616g, this.f5617h, this.f5618i, this.f5619j), r.f(), new l(this.f5621l, this.f5620k));
        } catch (RemoteException e2) {
            r.f5686g.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f5617h, this.f5618i, Integer.valueOf(this.f5619j), Integer.valueOf(this.f5616g));
            this.f5620k.a(new RuntimeException(e2));
        }
    }
}

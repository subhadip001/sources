package f.h.b.b.u1;

import f.h.b.b.u1.q;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q.a f4527f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Exception f4528g;

    public /* synthetic */ c(q.a aVar, Exception exc) {
        this.f4527f = aVar;
        this.f4528g = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q.a aVar = this.f4527f;
        Exception exc = this.f4528g;
        q qVar = aVar.b;
        int i2 = f.h.b.b.g2.b0.a;
        qVar.C(exc);
    }
}

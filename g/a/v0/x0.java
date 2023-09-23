package g.a.v0;

import g.a.v0.w;

/* compiled from: Http2Ping.java */
/* loaded from: classes2.dex */
public class x0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w.a f7970f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Throwable f7971g;

    public x0(w.a aVar, Throwable th) {
        this.f7970f = aVar;
        this.f7971g = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7970f.a(this.f7971g);
    }
}

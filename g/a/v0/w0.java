package g.a.v0;

import g.a.v0.w;

/* compiled from: Http2Ping.java */
/* loaded from: classes2.dex */
public class w0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w.a f7954f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f7955g;

    public w0(w.a aVar, long j2) {
        this.f7954f = aVar;
        this.f7955g = j2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7954f.b(this.f7955g);
    }
}

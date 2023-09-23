package e.g0.t;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.h.c.g.a.c f2234f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.g0.t.t.s.c f2235g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ o f2236h;

    public m(o oVar, f.h.c.g.a.c cVar, e.g0.t.t.s.c cVar2) {
        this.f2236h = oVar;
        this.f2234f = cVar;
        this.f2235g = cVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f2234f.get();
            e.g0.k.c().a(o.y, String.format("Starting work for %s", this.f2236h.f2244j.c), new Throwable[0]);
            o oVar = this.f2236h;
            oVar.w = oVar.f2245k.startWork();
            this.f2235g.l(this.f2236h.w);
        } catch (Throwable th) {
            this.f2235g.k(th);
        }
    }
}

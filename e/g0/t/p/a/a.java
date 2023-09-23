package e.g0.t.p.a;

import e.g0.k;
import e.g0.t.s.p;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f2253f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f2254g;

    public a(b bVar, p pVar) {
        this.f2254g = bVar;
        this.f2253f = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k.c().a(b.f2255d, String.format("Scheduling work %s", this.f2253f.a), new Throwable[0]);
        this.f2254g.a.a(this.f2253f);
    }
}

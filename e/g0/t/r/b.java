package e.g0.t.r;

import androidx.work.impl.WorkDatabase;
import e.g0.t.s.p;
import e.g0.t.s.r;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f2319f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f2320g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f2321h;

    public b(c cVar, WorkDatabase workDatabase, String str) {
        this.f2321h = cVar;
        this.f2319f = workDatabase;
        this.f2320g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        p i2 = ((r) this.f2319f.r()).i(this.f2320g);
        if (i2 == null || !i2.b()) {
            return;
        }
        synchronized (this.f2321h.f2325i) {
            this.f2321h.f2328l.put(this.f2320g, i2);
            this.f2321h.f2329m.add(i2);
            c cVar = this.f2321h;
            cVar.n.b(cVar.f2329m);
        }
    }
}

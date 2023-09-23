package e.g0.t;

import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class n implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e.g0.t.t.s.c f2237f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f2238g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ o f2239h;

    public n(o oVar, e.g0.t.t.s.c cVar, String str) {
        this.f2239h = oVar;
        this.f2237f = cVar;
        this.f2238g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f2237f.get();
                if (aVar == null) {
                    e.g0.k.c().b(o.y, String.format("%s returned a null result. Treating it as a failure.", this.f2239h.f2244j.c), new Throwable[0]);
                } else {
                    e.g0.k.c().a(o.y, String.format("%s returned a %s result.", this.f2239h.f2244j.c, aVar), new Throwable[0]);
                    this.f2239h.f2247m = aVar;
                }
            } catch (InterruptedException e2) {
                e = e2;
                e.g0.k.c().b(o.y, String.format("%s failed because it threw an exception/error", this.f2238g), e);
            } catch (CancellationException e3) {
                e.g0.k.c().d(o.y, String.format("%s was cancelled", this.f2238g), e3);
            } catch (ExecutionException e4) {
                e = e4;
                e.g0.k.c().b(o.y, String.format("%s failed because it threw an exception/error", this.f2238g), e);
            }
        } finally {
            this.f2239h.c();
        }
    }
}

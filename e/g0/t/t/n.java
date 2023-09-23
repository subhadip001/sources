package e.g0.t.t;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public class n implements Runnable {

    /* renamed from: l  reason: collision with root package name */
    public static final String f2376l = e.g0.k.e("WorkForegroundRunnable");

    /* renamed from: f  reason: collision with root package name */
    public final e.g0.t.t.s.c<Void> f2377f = new e.g0.t.t.s.c<>();

    /* renamed from: g  reason: collision with root package name */
    public final Context f2378g;

    /* renamed from: h  reason: collision with root package name */
    public final e.g0.t.s.p f2379h;

    /* renamed from: i  reason: collision with root package name */
    public final ListenableWorker f2380i;

    /* renamed from: j  reason: collision with root package name */
    public final e.g0.g f2381j;

    /* renamed from: k  reason: collision with root package name */
    public final e.g0.t.t.t.a f2382k;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e.g0.t.t.s.c f2383f;

        public a(e.g0.t.t.s.c cVar) {
            this.f2383f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2383f.l(n.this.f2380i.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e.g0.t.t.s.c f2385f;

        public b(e.g0.t.t.s.c cVar) {
            this.f2385f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.g0.f fVar = (e.g0.f) this.f2385f.get();
                if (fVar != null) {
                    e.g0.k.c().a(n.f2376l, String.format("Updating notification for %s", n.this.f2379h.c), new Throwable[0]);
                    n.this.f2380i.setRunInForeground(true);
                    n nVar = n.this;
                    nVar.f2377f.l(((o) nVar.f2381j).a(nVar.f2378g, nVar.f2380i.getId(), fVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", n.this.f2379h.c));
            } catch (Throwable th) {
                n.this.f2377f.k(th);
            }
        }
    }

    public n(Context context, e.g0.t.s.p pVar, ListenableWorker listenableWorker, e.g0.g gVar, e.g0.t.t.t.a aVar) {
        this.f2378g = context;
        this.f2379h = pVar;
        this.f2380i = listenableWorker;
        this.f2381j = gVar;
        this.f2382k = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2379h.q && !e.i.a.I()) {
            e.g0.t.t.s.c cVar = new e.g0.t.t.s.c();
            ((e.g0.t.t.t.b) this.f2382k).c.execute(new a(cVar));
            cVar.a(new b(cVar), ((e.g0.t.t.t.b) this.f2382k).c);
            return;
        }
        this.f2377f.j(null);
    }
}

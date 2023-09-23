package e.g0.t.t;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import e.g0.t.t.s.a;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public class o implements e.g0.g {
    public final e.g0.t.t.t.a a;
    public final e.g0.t.r.a b;
    public final e.g0.t.s.q c;

    /* compiled from: WorkForegroundUpdater.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e.g0.t.t.s.c f2387f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ UUID f2388g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.g0.f f2389h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Context f2390i;

        public a(e.g0.t.t.s.c cVar, UUID uuid, e.g0.f fVar, Context context) {
            this.f2387f = cVar;
            this.f2388g = uuid;
            this.f2389h = fVar;
            this.f2390i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!(this.f2387f.f2406f instanceof a.c)) {
                    String uuid = this.f2388g.toString();
                    WorkInfo$State f2 = ((e.g0.t.s.r) o.this.c).f(uuid);
                    if (f2 != null && !f2.isFinished()) {
                        ((e.g0.t.d) o.this.b).f(uuid, this.f2389h);
                        this.f2390i.startService(e.g0.t.r.c.a(this.f2390i, uuid, this.f2389h));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f2387f.j(null);
            } catch (Throwable th) {
                this.f2387f.k(th);
            }
        }
    }

    static {
        e.g0.k.e("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, e.g0.t.r.a aVar, e.g0.t.t.t.a aVar2) {
        this.b = aVar;
        this.a = aVar2;
        this.c = workDatabase.r();
    }

    public f.h.c.g.a.c<Void> a(Context context, UUID uuid, e.g0.f fVar) {
        e.g0.t.t.s.c cVar = new e.g0.t.t.s.c();
        e.g0.t.t.t.a aVar = this.a;
        ((e.g0.t.t.t.b) aVar).a.execute(new a(cVar, uuid, fVar, context));
        return cVar;
    }
}

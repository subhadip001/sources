package e.g0.t.t;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import e.g0.e;
import e.g0.m;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public static final String f2360h = e.g0.k.e("EnqueueRunnable");

    /* renamed from: f  reason: collision with root package name */
    public final e.g0.t.g f2361f;

    /* renamed from: g  reason: collision with root package name */
    public final e.g0.t.c f2362g = new e.g0.t.c();

    public e(e.g0.t.g gVar) {
        this.f2361f = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d  */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(e.g0.t.g r22) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.t.t.e.a(e.g0.t.g):boolean");
    }

    public static void b(e.g0.t.s.p pVar) {
        e.g0.c cVar = pVar.f2342j;
        String str = pVar.c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f2196d || cVar.f2197e) {
            e.a aVar = new e.a();
            aVar.b(pVar.f2337e.a);
            aVar.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.c = ConstraintTrackingWorker.class.getName();
            pVar.f2337e = aVar.a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            e.g0.t.g gVar = this.f2361f;
            Objects.requireNonNull(gVar);
            if (!e.g0.t.g.a(gVar, new HashSet())) {
                WorkDatabase workDatabase = this.f2361f.a.c;
                workDatabase.c();
                boolean a = a(this.f2361f);
                workDatabase.l();
                workDatabase.g();
                if (a) {
                    g.a(this.f2361f.a.a, RescheduleReceiver.class, true);
                    e.g0.t.l lVar = this.f2361f.a;
                    e.g0.t.f.a(lVar.b, lVar.c, lVar.f2229e);
                }
                this.f2362g.a(e.g0.m.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f2361f));
        } catch (Throwable th) {
            this.f2362g.a(new m.b.a(th));
        }
    }
}

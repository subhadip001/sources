package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.q.c;
import e.g0.t.q.d;
import e.g0.t.s.p;
import e.g0.t.s.r;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: k  reason: collision with root package name */
    public static final String f665k = k.e("ConstraintTrkngWrkr");

    /* renamed from: f  reason: collision with root package name */
    public WorkerParameters f666f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f667g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f668h;

    /* renamed from: i  reason: collision with root package name */
    public e.g0.t.t.s.c<ListenableWorker.a> f669i;

    /* renamed from: j  reason: collision with root package name */
    public ListenableWorker f670j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b)) {
                k.c().b(ConstraintTrackingWorker.f665k, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.a();
                return;
            }
            ListenableWorker a = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b, constraintTrackingWorker.f666f);
            constraintTrackingWorker.f670j = a;
            if (a == null) {
                k.c().a(ConstraintTrackingWorker.f665k, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.a();
                return;
            }
            p i2 = ((r) l.b(constraintTrackingWorker.getApplicationContext()).c.r()).i(constraintTrackingWorker.getId().toString());
            if (i2 == null) {
                constraintTrackingWorker.a();
                return;
            }
            d dVar = new d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.b(Collections.singletonList(i2));
            if (dVar.a(constraintTrackingWorker.getId().toString())) {
                k.c().a(ConstraintTrackingWorker.f665k, String.format("Constraints met for delegate %s", b), new Throwable[0]);
                try {
                    f.h.c.g.a.c<ListenableWorker.a> startWork = constraintTrackingWorker.f670j.startWork();
                    startWork.a(new e.g0.t.u.a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    k c = k.c();
                    String str = ConstraintTrackingWorker.f665k;
                    c.a(str, String.format("Delegated worker %s threw exception in startWork.", b), th);
                    synchronized (constraintTrackingWorker.f667g) {
                        if (constraintTrackingWorker.f668h) {
                            k.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.c();
                        } else {
                            constraintTrackingWorker.a();
                        }
                        return;
                    }
                }
            }
            k.c().a(ConstraintTrackingWorker.f665k, String.format("Constraints not met for delegate %s. Requesting retry.", b), new Throwable[0]);
            constraintTrackingWorker.c();
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f666f = workerParameters;
        this.f667g = new Object();
        this.f668h = false;
        this.f669i = new e.g0.t.t.s.c<>();
    }

    public void a() {
        this.f669i.j(new ListenableWorker.a.C0002a());
    }

    @Override // e.g0.t.q.c
    public void b(List<String> list) {
        k.c().a(f665k, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f667g) {
            this.f668h = true;
        }
    }

    public void c() {
        this.f669i.j(new ListenableWorker.a.b());
    }

    @Override // e.g0.t.q.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public e.g0.t.t.t.a getTaskExecutor() {
        return l.b(getApplicationContext()).f2228d;
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f670j;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f670j;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f670j.stop();
    }

    @Override // androidx.work.ListenableWorker
    public f.h.c.g.a.c<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f669i;
    }
}

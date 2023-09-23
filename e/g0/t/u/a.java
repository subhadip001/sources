package e.g0.t.u;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import f.h.c.g.a.c;

/* compiled from: ConstraintTrackingWorker.java */
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f2418f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f2419g;

    public a(ConstraintTrackingWorker constraintTrackingWorker, c cVar) {
        this.f2419g = constraintTrackingWorker;
        this.f2418f = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f2419g.f667g) {
            if (this.f2419g.f668h) {
                this.f2419g.c();
            } else {
                this.f2419g.f669i.l(this.f2418f);
            }
        }
    }
}

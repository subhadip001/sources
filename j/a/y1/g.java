package j.a.y1;

import j.a.g0;
import j.a.h0;
import j.a.z;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes2.dex */
public final class g extends z implements Runnable, h0 {

    /* renamed from: g  reason: collision with root package name */
    public final z f8808g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8809h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h0 f8810i;

    /* renamed from: j  reason: collision with root package name */
    public final k<Runnable> f8811j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f8812k;
    private volatile int runningWorkers;

    public g(z zVar, int i2) {
        this.f8808g = zVar;
        this.f8809h = i2;
        h0 h0Var = zVar instanceof h0 ? (h0) zVar : null;
        this.f8810i = h0Var == null ? g0.b : h0Var;
        this.f8811j = new k<>(false);
        this.f8812k = new Object();
    }

    @Override // j.a.z
    public void d0(i.j.f fVar, Runnable runnable) {
        this.f8811j.a(runnable);
        boolean z = true;
        if (this.runningWorkers >= this.f8809h) {
            return;
        }
        synchronized (this.f8812k) {
            if (this.runningWorkers >= this.f8809h) {
                z = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z) {
            this.f8808g.d0(this, this);
        }
    }

    @Override // j.a.h0
    public void p(long j2, j.a.h<? super i.h> hVar) {
        this.f8810i.p(j2, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f8812k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f8811j.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            j.a.y1.k<java.lang.Runnable> r2 = r4.f8811j
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            i.j.h r3 = i.j.h.f8623f
            f.n.a.n.i.y(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            j.a.z r2 = r4.f8808g
            boolean r2 = r2.g0(r4)
            if (r2 == 0) goto L2
            j.a.z r0 = r4.f8808g
            r0.d0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f8812k
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            j.a.y1.k<java.lang.Runnable> r2 = r4.f8811j     // Catch: java.lang.Throwable -> L45
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.y1.g.run():void");
    }
}

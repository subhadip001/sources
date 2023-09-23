package kotlinx.coroutines.scheduling;

import com.google.android.gms.common.api.Api;
import i.l.b.i;
import j.a.e0;
import j.a.y1.q;
import j.a.y1.s;
import j.a.z1.c;
import j.a.z1.g;
import j.a.z1.h;
import j.a.z1.j;
import j.a.z1.k;
import j.a.z1.m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes2.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* renamed from: f  reason: collision with root package name */
    public final int f9202f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9203g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9204h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9205i;

    /* renamed from: j  reason: collision with root package name */
    public final c f9206j;

    /* renamed from: k  reason: collision with root package name */
    public final c f9207k;

    /* renamed from: l  reason: collision with root package name */
    public final q<a> f9208l;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final s p = new s("NOT_IN_STACK");

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9201m = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes2.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes2.dex */
    public final class a extends Thread {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f9209m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

        /* renamed from: f  reason: collision with root package name */
        public final m f9210f;

        /* renamed from: g  reason: collision with root package name */
        public WorkerState f9211g;

        /* renamed from: h  reason: collision with root package name */
        public long f9212h;

        /* renamed from: i  reason: collision with root package name */
        public long f9213i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public int f9214j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f9215k;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public a(int i2) {
            setDaemon(true);
            this.f9210f = new m();
            this.f9211g = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.p;
            this.f9214j = i.m.c.f8653f.a();
            f(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final j.a.z1.g a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.f9211g
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L9
                goto L32
            L9:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            Lb:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L1b
                r0 = 0
                goto L2c
            L1b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.n
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto Lb
                r0 = 1
            L2c:
                if (r0 == 0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.f9211g = r0
            L32:
                r0 = 1
                goto L35
            L34:
                r0 = 0
            L35:
                if (r0 == 0) goto L6e
                if (r11 == 0) goto L62
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.f9202f
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L46
                goto L47
            L46:
                r2 = 0
            L47:
                if (r2 == 0) goto L50
                j.a.z1.g r11 = r10.e()
                if (r11 == 0) goto L50
                goto L6d
            L50:
                j.a.z1.m r11 = r10.f9210f
                j.a.z1.g r11 = r11.e()
                if (r11 == 0) goto L59
                goto L6d
            L59:
                if (r2 != 0) goto L69
                j.a.z1.g r11 = r10.e()
                if (r11 == 0) goto L69
                goto L6d
            L62:
                j.a.z1.g r11 = r10.e()
                if (r11 == 0) goto L69
                goto L6d
            L69:
                j.a.z1.g r11 = r10.i(r3)
            L6d:
                return r11
            L6e:
                if (r11 == 0) goto L83
                j.a.z1.m r11 = r10.f9210f
                j.a.z1.g r11 = r11.e()
                if (r11 != 0) goto L8d
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                j.a.z1.c r11 = r11.f9207k
                java.lang.Object r11 = r11.d()
                j.a.z1.g r11 = (j.a.z1.g) r11
                goto L8d
            L83:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                j.a.z1.c r11 = r11.f9207k
                java.lang.Object r11 = r11.d()
                j.a.z1.g r11 = (j.a.z1.g) r11
            L8d:
                if (r11 != 0) goto L93
                j.a.z1.g r11 = r10.i(r2)
            L93:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.a.a(boolean):j.a.z1.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i2) {
            int i3 = this.f9214j;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f9214j = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i2;
        }

        public final g e() {
            if (d(2) == 0) {
                g d2 = CoroutineScheduler.this.f9206j.d();
                return d2 != null ? d2 : CoroutineScheduler.this.f9207k.d();
            }
            g d3 = CoroutineScheduler.this.f9207k.d();
            return d3 != null ? d3 : CoroutineScheduler.this.f9206j.d();
        }

        public final void f(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f9205i);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.f9211g;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.n.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f9211g = workerState;
            }
            return z;
        }

        public final g i(boolean z) {
            long h2;
            int i2 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int d2 = d(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j2 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                d2++;
                if (d2 > i2) {
                    d2 = 1;
                }
                a b = coroutineScheduler.f9208l.b(d2);
                if (b != null && b != this) {
                    if (z) {
                        h2 = this.f9210f.g(b.f9210f);
                    } else {
                        m mVar = this.f9210f;
                        m mVar2 = b.f9210f;
                        Objects.requireNonNull(mVar);
                        g f2 = mVar2.f();
                        if (f2 != null) {
                            mVar.a(f2, false);
                            h2 = -1;
                        } else {
                            h2 = mVar.h(mVar2, false);
                        }
                    }
                    if (h2 == -1) {
                        return this.f9210f.e();
                    }
                    if (h2 > 0) {
                        j2 = Math.min(j2, h2);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f9213i = j2;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:98:0x0003, code lost:
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.a.run():void");
        }
    }

    public CoroutineScheduler(int i2, int i3, long j2, String str) {
        this.f9202f = i2;
        this.f9203g = i3;
        this.f9204h = j2;
        this.f9205i = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(f.a.b.a.a.j("Core pool size ", i2, " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(f.a.b.a.a.k("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(f.a.b.a.a.j("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 > 0) {
            this.f9206j = new c();
            this.f9207k = new c();
            this.parkedWorkersStack = 0L;
            this.f9208l = new q<>(i2 + 1);
            this.controlState = i2 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
    }

    public final void C() {
        if (M() || F(this.controlState)) {
            return;
        }
        M();
    }

    public final boolean F(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.f9202f) {
            int a2 = a();
            if (a2 == 1 && this.f9202f > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean M() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            a b = this.f9208l.b((int) (2097151 & j2));
            if (b == null) {
                b = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                int l2 = l(b);
                if (l2 >= 0 && f9201m.compareAndSet(this, j2, l2 | j3)) {
                    b.g(p);
                }
            }
            if (b == null) {
                return false;
            }
            if (a.f9209m.compareAndSet(b, -1, 0)) {
                LockSupport.unpark(b);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.f9208l) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.f9202f) {
                return 0;
            }
            if (i2 >= this.f9203g) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (i4 > 0 && this.f9208l.b(i4) == null) {
                a aVar = new a(i4);
                this.f9208l.c(i4, aVar);
                if (i4 == ((int) (2097151 & n.incrementAndGet(this)))) {
                    aVar.start();
                    return i3 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[LOOP:0: B:12:0x001e->B:26:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062 A[EDGE_INSN: B:45:0x0062->B:27:0x0062 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto L95
        Lc:
            kotlinx.coroutines.scheduling.CoroutineScheduler$a r0 = r9.f()
            j.a.y1.q<kotlinx.coroutines.scheduling.CoroutineScheduler$a> r3 = r9.f9208l
            monitor-enter(r3)
            long r4 = r9.controlState     // Catch: java.lang.Throwable -> L9a
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L62
            r3 = 1
        L1e:
            j.a.y1.q<kotlinx.coroutines.scheduling.CoroutineScheduler$a> r4 = r9.f9208l
            java.lang.Object r4 = r4.b(r3)
            i.l.b.i.b(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$a r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.a) r4
            if (r4 == r0) goto L5d
        L2b:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L3a
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L2b
        L3a:
            j.a.z1.m r4 = r4.f9210f
            j.a.z1.c r6 = r9.f9207k
            java.util.Objects.requireNonNull(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = j.a.z1.m.b
            r8 = 0
            java.lang.Object r7 = r7.getAndSet(r4, r8)
            j.a.z1.g r7 = (j.a.z1.g) r7
            if (r7 == 0) goto L4f
            r6.a(r7)
        L4f:
            j.a.z1.g r7 = r4.f()
            if (r7 != 0) goto L57
            r7 = 0
            goto L5b
        L57:
            r6.a(r7)
            r7 = 1
        L5b:
            if (r7 != 0) goto L4f
        L5d:
            if (r3 == r5) goto L62
            int r3 = r3 + 1
            goto L1e
        L62:
            j.a.z1.c r1 = r9.f9207k
            r1.b()
            j.a.z1.c r1 = r9.f9206j
            r1.b()
        L6c:
            if (r0 == 0) goto L74
            j.a.z1.g r1 = r0.a(r2)
            if (r1 != 0) goto L96
        L74:
            j.a.z1.c r1 = r9.f9206j
            java.lang.Object r1 = r1.d()
            j.a.z1.g r1 = (j.a.z1.g) r1
            if (r1 != 0) goto L96
            j.a.z1.c r1 = r9.f9207k
            java.lang.Object r1 = r1.d()
            j.a.z1.g r1 = (j.a.z1.g) r1
            if (r1 != 0) goto L96
            if (r0 == 0) goto L8f
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.h(r1)
        L8f:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L95:
            return
        L96:
            r9.v(r1)
            goto L6c
        L9a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g(runnable, k.f8841f, false);
    }

    public final a f() {
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !i.a(CoroutineScheduler.this, this)) {
            return null;
        }
        return aVar;
    }

    public final void g(Runnable runnable, h hVar, boolean z) {
        g jVar;
        g gVar;
        boolean a2;
        long a3 = k.f8840e.a();
        if (runnable instanceof g) {
            jVar = (g) runnable;
            jVar.f8836f = a3;
            jVar.f8837g = hVar;
        } else {
            jVar = new j(runnable, a3, hVar);
        }
        a f2 = f();
        boolean z2 = true;
        if (f2 == null || f2.f9211g == WorkerState.TERMINATED || (jVar.f8837g.b() == 0 && f2.f9211g == WorkerState.BLOCKING)) {
            gVar = jVar;
        } else {
            f2.f9215k = true;
            gVar = f2.f9210f.a(jVar, z);
        }
        if (gVar != null) {
            if (gVar.f8837g.b() == 1) {
                a2 = this.f9207k.a(gVar);
            } else {
                a2 = this.f9206j.a(gVar);
            }
            if (!a2) {
                throw new RejectedExecutionException(f.a.b.a.a.u(new StringBuilder(), this.f9205i, " was terminated"));
            }
        }
        z2 = (!z || f2 == null) ? false : false;
        if (jVar.f8837g.b() == 0) {
            if (z2) {
                return;
            }
            C();
            return;
        }
        long addAndGet = n.addAndGet(this, 2097152L);
        if (z2 || M() || F(addAndGet)) {
            return;
        }
        M();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int l(a aVar) {
        Object c = aVar.c();
        while (c != p) {
            if (c == null) {
                return 0;
            }
            a aVar2 = (a) c;
            int b = aVar2.b();
            if (b != 0) {
                return b;
            }
            c = aVar2.c();
        }
        return -1;
    }

    public final boolean p(a aVar) {
        long j2;
        int b;
        if (aVar.c() != p) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            b = aVar.b();
            aVar.g(this.f9208l.b((int) (2097151 & j2)));
        } while (!f9201m.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | b));
        return true;
    }

    public final void q(a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? l(aVar) : i3;
            }
            if (i4 >= 0 && f9201m.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.f9208l.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a b = this.f9208l.b(i7);
            if (b != null) {
                int d2 = b.f9210f.d();
                int ordinal = b.f9211g.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(d2);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(d2);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (d2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(d2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f9205i);
        sb4.append('@');
        sb4.append(e0.b(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f9202f);
        sb4.append(", max = ");
        f.a.b.a.a.P(sb4, this.f9203g, "}, Worker States {CPU = ", i2, ", blocking = ");
        f.a.b.a.a.P(sb4, i3, ", parked = ", i4, ", dormant = ");
        f.a.b.a.a.P(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f9206j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f9207k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f9202f - ((int) ((9223367638808264704L & j2) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void v(g gVar) {
        try {
            gVar.run();
        } finally {
        }
    }
}

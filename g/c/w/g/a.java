package g.c.w.g;

import g.c.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler.java */
/* loaded from: classes2.dex */
public final class a extends o {
    public static final b c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f8498d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f8499e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f8500f;
    public final ThreadFactory a;
    public final AtomicReference<b> b;

    /* compiled from: ComputationScheduler.java */
    /* renamed from: g.c.w.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0218a extends o.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.w.a.b f8501f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.t.a f8502g;

        /* renamed from: h  reason: collision with root package name */
        public final g.c.w.a.b f8503h;

        /* renamed from: i  reason: collision with root package name */
        public final c f8504i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f8505j;

        public C0218a(c cVar) {
            this.f8504i = cVar;
            g.c.w.a.b bVar = new g.c.w.a.b();
            this.f8501f = bVar;
            g.c.t.a aVar = new g.c.t.a();
            this.f8502g = aVar;
            g.c.w.a.b bVar2 = new g.c.w.a.b();
            this.f8503h = bVar2;
            bVar2.b(bVar);
            bVar2.b(aVar);
        }

        @Override // g.c.o.b
        public g.c.t.b b(Runnable runnable) {
            if (this.f8505j) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f8504i.d(runnable, 0L, TimeUnit.MILLISECONDS, this.f8501f);
        }

        @Override // g.c.o.b
        public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f8505j) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f8504i.d(runnable, j2, timeUnit, this.f8502g);
        }

        @Override // g.c.t.b
        public void dispose() {
            if (this.f8505j) {
                return;
            }
            this.f8505j = true;
            this.f8503h.dispose();
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final c[] b;
        public long c;

        public b(int i2, ThreadFactory threadFactory) {
            this.a = i2;
            this.b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.b[i3] = new c(threadFactory);
            }
        }

        public c a() {
            int i2 = this.a;
            if (i2 == 0) {
                return a.f8500f;
            }
            c[] cVarArr = this.b;
            long j2 = this.c;
            this.c = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* loaded from: classes2.dex */
    public static final class c extends d {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f8499e = availableProcessors;
        c cVar = new c(new e("RxComputationShutdown"));
        f8500f = cVar;
        cVar.dispose();
        e eVar = new e("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f8498d = eVar;
        b bVar = new b(0, eVar);
        c = bVar;
        for (c cVar2 : bVar.b) {
            cVar2.dispose();
        }
    }

    public a() {
        e eVar = f8498d;
        this.a = eVar;
        b bVar = c;
        AtomicReference<b> atomicReference = new AtomicReference<>(bVar);
        this.b = atomicReference;
        b bVar2 = new b(f8499e, eVar);
        if (atomicReference.compareAndSet(bVar, bVar2)) {
            return;
        }
        for (c cVar : bVar2.b) {
            cVar.dispose();
        }
    }

    @Override // g.c.o
    public o.b a() {
        return new C0218a(this.b.get().a());
    }

    @Override // g.c.o
    public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future schedule;
        c a = this.b.get().a();
        Objects.requireNonNull(a);
        Objects.requireNonNull(runnable, "run is null");
        f fVar = new f(runnable);
        try {
            if (j2 <= 0) {
                schedule = a.f8521f.submit(fVar);
            } else {
                schedule = a.f8521f.schedule(fVar, j2, timeUnit);
            }
            fVar.a(schedule);
            return fVar;
        } catch (RejectedExecutionException e2) {
            f.n.a.n.i.L(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}

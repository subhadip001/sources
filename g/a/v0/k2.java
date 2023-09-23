package g.a.v0;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: SerializingExecutor.java */
/* loaded from: classes2.dex */
public final class k2 implements Executor, Runnable {

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f7826i = Logger.getLogger(k2.class.getName());

    /* renamed from: j  reason: collision with root package name */
    public static final b f7827j;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f7828f;

    /* renamed from: g  reason: collision with root package name */
    public final Queue<Runnable> f7829g = new ConcurrentLinkedQueue();

    /* renamed from: h  reason: collision with root package name */
    private volatile int f7830h = 0;

    /* compiled from: SerializingExecutor.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public b(a aVar) {
        }

        public abstract boolean a(k2 k2Var, int i2, int i3);

        public abstract void b(k2 k2Var, int i2);
    }

    /* compiled from: SerializingExecutor.java */
    /* loaded from: classes2.dex */
    public static final class c extends b {
        public final AtomicIntegerFieldUpdater<k2> a;

        public c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, a aVar) {
            super(null);
            this.a = atomicIntegerFieldUpdater;
        }

        @Override // g.a.v0.k2.b
        public boolean a(k2 k2Var, int i2, int i3) {
            return this.a.compareAndSet(k2Var, i2, i3);
        }

        @Override // g.a.v0.k2.b
        public void b(k2 k2Var, int i2) {
            this.a.set(k2Var, i2);
        }
    }

    /* compiled from: SerializingExecutor.java */
    /* loaded from: classes2.dex */
    public static final class d extends b {
        public d(a aVar) {
            super(null);
        }

        @Override // g.a.v0.k2.b
        public boolean a(k2 k2Var, int i2, int i3) {
            synchronized (k2Var) {
                if (k2Var.f7830h == i2) {
                    k2Var.f7830h = i3;
                    return true;
                }
                return false;
            }
        }

        @Override // g.a.v0.k2.b
        public void b(k2 k2Var, int i2) {
            synchronized (k2Var) {
                k2Var.f7830h = i2;
            }
        }
    }

    static {
        b dVar;
        try {
            dVar = new c(AtomicIntegerFieldUpdater.newUpdater(k2.class, "h"), null);
        } catch (Throwable th) {
            f7826i.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            dVar = new d(null);
        }
        f7827j = dVar;
    }

    public k2(Executor executor) {
        f.h.b.c.a.x(executor, "'executor' must not be null.");
        this.f7828f = executor;
    }

    public final void c(Runnable runnable) {
        if (f7827j.a(this, 0, -1)) {
            try {
                this.f7828f.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f7829g.remove(runnable);
                }
                f7827j.b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Queue<Runnable> queue = this.f7829g;
        f.h.b.c.a.x(runnable, "'r' must not be null.");
        queue.add(runnable);
        c(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Runnable poll = this.f7829g.poll();
                if (poll == null) {
                    break;
                }
                try {
                    poll.run();
                } catch (RuntimeException e2) {
                    Logger logger = f7826i;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + poll, (Throwable) e2);
                }
            } catch (Throwable th) {
                f7827j.b(this, 0);
                throw th;
            }
        }
        f7827j.b(this, 0);
        if (this.f7829g.isEmpty()) {
            return;
        }
        c(null);
    }
}

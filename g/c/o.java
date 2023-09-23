package g.c;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler.java */
/* loaded from: classes2.dex */
public abstract class o {

    /* compiled from: Scheduler.java */
    /* loaded from: classes2.dex */
    public static final class a implements g.c.t.b, Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f8129f;

        /* renamed from: g  reason: collision with root package name */
        public final b f8130g;

        /* renamed from: h  reason: collision with root package name */
        public Thread f8131h;

        public a(Runnable runnable, b bVar) {
            this.f8129f = runnable;
            this.f8130g = bVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            if (this.f8131h == Thread.currentThread()) {
                b bVar = this.f8130g;
                if (bVar instanceof g.c.w.g.d) {
                    g.c.w.g.d dVar = (g.c.w.g.d) bVar;
                    if (dVar.f8522g) {
                        return;
                    }
                    dVar.f8522g = true;
                    dVar.f8521f.shutdown();
                    return;
                }
            }
            this.f8130g.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8131h = Thread.currentThread();
            try {
                this.f8129f.run();
            } finally {
                dispose();
                this.f8131h = null;
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* loaded from: classes2.dex */
    public static abstract class b implements g.c.t.b {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public g.c.t.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit);
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract b a();

    public g.c.t.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
        b a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        a aVar = new a(runnable, a2);
        a2.c(aVar, j2, timeUnit);
        return aVar;
    }
}

package g.c.w.g;

import g.c.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler.java */
/* loaded from: classes2.dex */
public final class j extends o {
    public static final j a = new j();

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f8539f;

        /* renamed from: g  reason: collision with root package name */
        public final c f8540g;

        /* renamed from: h  reason: collision with root package name */
        public final long f8541h;

        public a(Runnable runnable, c cVar, long j2) {
            this.f8539f = runnable;
            this.f8540g = cVar;
            this.f8541h = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8540g.f8549i) {
                return;
            }
            long a = this.f8540g.a(TimeUnit.MILLISECONDS);
            long j2 = this.f8541h;
            if (j2 > a) {
                try {
                    Thread.sleep(j2 - a);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    f.n.a.n.i.L(e2);
                    return;
                }
            }
            if (this.f8540g.f8549i) {
                return;
            }
            this.f8539f.run();
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes2.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f8542f;

        /* renamed from: g  reason: collision with root package name */
        public final long f8543g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8544h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f8545i;

        public b(Runnable runnable, Long l2, int i2) {
            this.f8542f = runnable;
            this.f8543g = l2.longValue();
            this.f8544h = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            int i2 = 0;
            int i3 = (this.f8543g > bVar2.f8543g ? 1 : (this.f8543g == bVar2.f8543g ? 0 : -1));
            int i4 = i3 < 0 ? -1 : i3 > 0 ? 1 : 0;
            if (i4 == 0) {
                int i5 = this.f8544h;
                int i6 = bVar2.f8544h;
                if (i5 < i6) {
                    i2 = -1;
                } else if (i5 > i6) {
                    i2 = 1;
                }
                return i2;
            }
            return i4;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes2.dex */
    public static final class c extends o.b implements g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final PriorityBlockingQueue<b> f8546f = new PriorityBlockingQueue<>();

        /* renamed from: g  reason: collision with root package name */
        public final AtomicInteger f8547g = new AtomicInteger();

        /* renamed from: h  reason: collision with root package name */
        public final AtomicInteger f8548h = new AtomicInteger();

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f8549i;

        /* compiled from: TrampolineScheduler.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final b f8550f;

            public a(b bVar) {
                this.f8550f = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8550f.f8545i = true;
                c.this.f8546f.remove(this.f8550f);
            }
        }

        @Override // g.c.o.b
        public g.c.t.b b(Runnable runnable) {
            return d(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // g.c.o.b
        public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j2) + a(TimeUnit.MILLISECONDS);
            return d(new a(runnable, this, millis), millis);
        }

        public g.c.t.b d(Runnable runnable, long j2) {
            if (this.f8549i) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.f8548h.incrementAndGet());
            this.f8546f.add(bVar);
            if (this.f8547g.getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f8549i) {
                    b poll = this.f8546f.poll();
                    if (poll == null) {
                        i2 = this.f8547g.addAndGet(-i2);
                        if (i2 == 0) {
                            return EmptyDisposable.INSTANCE;
                        }
                    } else if (!poll.f8545i) {
                        poll.f8542f.run();
                    }
                }
                this.f8546f.clear();
                return EmptyDisposable.INSTANCE;
            }
            return new g.c.t.c(new a(bVar));
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8549i = true;
        }
    }

    @Override // g.c.o
    public o.b a() {
        return new c();
    }

    @Override // g.c.o
    public g.c.t.b b(Runnable runnable) {
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // g.c.o
    public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            f.n.a.n.i.L(e2);
        }
        return EmptyDisposable.INSTANCE;
    }
}

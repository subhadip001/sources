package f.e.a.l.q.d0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: g  reason: collision with root package name */
    public static final long f3308g = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h  reason: collision with root package name */
    public static volatile int f3309h;

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f3310f;

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: f.e.a.l.q.d0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0075a extends Thread {
            public C0075a(b bVar, Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public b(C0074a c0074a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0075a(this, runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public static final class c implements ThreadFactory {

        /* renamed from: f  reason: collision with root package name */
        public final ThreadFactory f3311f;

        /* renamed from: g  reason: collision with root package name */
        public final String f3312g;

        /* renamed from: h  reason: collision with root package name */
        public final d f3313h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f3314i;

        /* renamed from: j  reason: collision with root package name */
        public final AtomicInteger f3315j = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* renamed from: f.e.a.l.q.d0.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0076a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Runnable f3316f;

            public RunnableC0076a(Runnable runnable) {
                this.f3316f = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f3314i) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f3316f.run();
                } catch (Throwable th) {
                    c.this.f3313h.a(th);
                }
            }
        }

        public c(ThreadFactory threadFactory, String str, d dVar, boolean z) {
            this.f3311f = threadFactory;
            this.f3312g = str;
            this.f3313h = dVar;
            this.f3314i = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f3311f.newThread(new RunnableC0076a(runnable));
            StringBuilder A = f.a.b.a.a.A("glide-");
            A.append(this.f3312g);
            A.append("-thread-");
            A.append(this.f3315j.getAndIncrement());
            newThread.setName(A.toString());
            return newThread;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public interface d {
        public static final d a;
        public static final d b;

        /* compiled from: GlideExecutor.java */
        /* renamed from: f.e.a.l.q.d0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0077a implements d {
            @Override // f.e.a.l.q.d0.a.d
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0077a c0077a = new C0077a();
            a = c0077a;
            b = c0077a;
        }

        void a(Throwable th);
    }

    public a(ExecutorService executorService) {
        this.f3310f = executorService;
    }

    public static int a() {
        if (f3309h == 0) {
            f3309h = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f3309h;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f3310f.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3310f.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3310f.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f3310f.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f3310f.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f3310f.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f3310f.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f3310f.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f3310f.submit(runnable);
    }

    public String toString() {
        return this.f3310f.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.f3310f.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return (T) this.f3310f.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3310f.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3310f.submit(callable);
    }
}

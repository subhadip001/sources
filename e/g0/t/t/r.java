package e.g0.t.t;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: f  reason: collision with root package name */
    public static final String f2396f = e.g0.k.e("WorkTimer");
    public final ThreadFactory a;
    public final ScheduledExecutorService b;
    public final Map<String, c> c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, b> f2397d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2398e;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: f  reason: collision with root package name */
        public int f2399f = 0;

        public a(r rVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder A = f.a.b.a.a.A("WorkManager-WorkTimer-thread-");
            A.append(this.f2399f);
            newThread.setName(A.toString());
            this.f2399f++;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final r f2400f;

        /* renamed from: g  reason: collision with root package name */
        public final String f2401g;

        public c(r rVar, String str) {
            this.f2400f = rVar;
            this.f2401g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f2400f.f2398e) {
                if (this.f2400f.c.remove(this.f2401g) != null) {
                    b remove = this.f2400f.f2397d.remove(this.f2401g);
                    if (remove != null) {
                        remove.a(this.f2401g);
                    }
                } else {
                    e.g0.k.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f2401g), new Throwable[0]);
                }
            }
        }
    }

    public r() {
        a aVar = new a(this);
        this.a = aVar;
        this.c = new HashMap();
        this.f2397d = new HashMap();
        this.f2398e = new Object();
        this.b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a(String str, long j2, b bVar) {
        synchronized (this.f2398e) {
            e.g0.k.c().a(f2396f, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.f2397d.put(str, bVar);
            this.b.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void b(String str) {
        synchronized (this.f2398e) {
            if (this.c.remove(str) != null) {
                e.g0.k.c().a(f2396f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f2397d.remove(str);
            }
        }
    }
}

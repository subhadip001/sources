package f.e.a.l.q;

import android.os.Process;
import f.e.a.l.q.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a {
    public final boolean a;
    public final Executor b;
    public final Map<f.e.a.l.j, b> c;

    /* renamed from: d  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f3265d;

    /* renamed from: e  reason: collision with root package name */
    public q.a f3266e;

    /* compiled from: ActiveResources.java */
    /* renamed from: f.e.a.l.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0071a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: f.e.a.l.q.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0072a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Runnable f3267f;

            public RunnableC0072a(ThreadFactoryC0071a threadFactoryC0071a, Runnable runnable) {
                this.f3267f = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f3267f.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0072a(this, runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* loaded from: classes.dex */
    public static final class b extends WeakReference<q<?>> {
        public final f.e.a.l.j a;
        public final boolean b;
        public v<?> c;

        public b(f.e.a.l.j jVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            v<?> vVar;
            Objects.requireNonNull(jVar, "Argument must not be null");
            this.a = jVar;
            if (qVar.f3380f && z) {
                vVar = qVar.f3382h;
                Objects.requireNonNull(vVar, "Argument must not be null");
            } else {
                vVar = null;
            }
            this.c = vVar;
            this.b = qVar.f3380f;
        }
    }

    public a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0071a());
        this.c = new HashMap();
        this.f3265d = new ReferenceQueue<>();
        this.a = z;
        this.b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new f.e.a.l.q.b(this));
    }

    public synchronized void a(f.e.a.l.j jVar, q<?> qVar) {
        b put = this.c.put(jVar, new b(jVar, qVar, this.f3265d, this.a));
        if (put != null) {
            put.c = null;
            put.clear();
        }
    }

    public void b(b bVar) {
        v<?> vVar;
        synchronized (this) {
            this.c.remove(bVar.a);
            if (bVar.b && (vVar = bVar.c) != null) {
                this.f3266e.a(bVar.a, new q<>(vVar, true, false, bVar.a, this.f3266e));
            }
        }
    }
}

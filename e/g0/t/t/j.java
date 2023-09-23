package e.g0.t.t;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public class j implements Executor {

    /* renamed from: g  reason: collision with root package name */
    public final Executor f2364g;

    /* renamed from: i  reason: collision with root package name */
    public volatile Runnable f2366i;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<a> f2363f = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    public final Object f2365h = new Object();

    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final j f2367f;

        /* renamed from: g  reason: collision with root package name */
        public final Runnable f2368g;

        public a(j jVar, Runnable runnable) {
            this.f2367f = jVar;
            this.f2368g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2368g.run();
            } finally {
                this.f2367f.a();
            }
        }
    }

    public j(Executor executor) {
        this.f2364g = executor;
    }

    public void a() {
        synchronized (this.f2365h) {
            a poll = this.f2363f.poll();
            this.f2366i = poll;
            if (poll != null) {
                this.f2364g.execute(this.f2366i);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f2365h) {
            this.f2363f.add(new a(this, runnable));
            if (this.f2366i == null) {
                a();
            }
        }
    }
}

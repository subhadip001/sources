package e.v;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.java */
/* loaded from: classes.dex */
public class l implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final Executor f2976f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<Runnable> f2977g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    public Runnable f2978h;

    /* compiled from: TransactionExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Runnable f2979f;

        public a(Runnable runnable) {
            this.f2979f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2979f.run();
            } finally {
                l.this.a();
            }
        }
    }

    public l(Executor executor) {
        this.f2976f = executor;
    }

    public synchronized void a() {
        Runnable poll = this.f2977g.poll();
        this.f2978h = poll;
        if (poll != null) {
            this.f2976f.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f2977g.offer(new a(runnable));
        if (this.f2978h == null) {
            a();
        }
    }
}

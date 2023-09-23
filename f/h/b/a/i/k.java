package f.h.b.a.i;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
public class k implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final Executor f3708f;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f3709f;

        public a(Runnable runnable) {
            this.f3709f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3709f.run();
            } catch (Exception e2) {
                f.c.a.a.i.k("Executor", "Background execution failure.", e2);
            }
        }
    }

    public k(Executor executor) {
        this.f3708f = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3708f.execute(new a(runnable));
    }
}

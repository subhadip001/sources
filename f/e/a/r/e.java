package f.e.a.r;

import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {
    public static final Executor a = new a();
    public static final Executor b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.k(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}

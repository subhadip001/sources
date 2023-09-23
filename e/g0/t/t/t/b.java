package e.g0.t.t.t;

import android.os.Handler;
import android.os.Looper;
import e.g0.t.t.j;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public class b implements e.g0.t.t.t.a {
    public final j a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.a = new j(executor);
    }
}

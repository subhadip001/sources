package e.i.f;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* loaded from: classes.dex */
public class c implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final Handler f2473f;

    public c(Handler handler) {
        Objects.requireNonNull(handler);
        this.f2473f = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Handler handler = this.f2473f;
        Objects.requireNonNull(runnable);
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f2473f + " is shutting down");
    }
}

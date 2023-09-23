package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import e.g0.t.t.s.c;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public c<ListenableWorker.a> mFuture;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.j(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.k(th);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final f.h.c.g.a.c<ListenableWorker.a> startWork() {
        this.mFuture = new c<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}

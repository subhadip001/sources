package f.m.b;

import com.squareup.picasso.Picasso;
import f.m.b.d0;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PicassoExecutorService.java */
/* loaded from: classes2.dex */
public class t extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService.java */
    /* loaded from: classes2.dex */
    public static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: f  reason: collision with root package name */
        public final c f6878f;

        public a(c cVar) {
            super(cVar, null);
            this.f6878f = cVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            c cVar = this.f6878f;
            Picasso.Priority priority = cVar.x;
            c cVar2 = aVar.f6878f;
            Picasso.Priority priority2 = cVar2.x;
            return priority == priority2 ? cVar.f6829f - cVar2.f6829f : priority2.ordinal() - priority.ordinal();
        }
    }

    public t() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d0.b());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}

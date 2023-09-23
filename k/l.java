package k;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.u;

/* compiled from: Dispatcher.java */
/* loaded from: classes2.dex */
public final class l {
    public ExecutorService a;
    public final Deque<u.a> b = new ArrayDeque();
    public final Deque<u.a> c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final Deque<u> f9131d = new ArrayDeque();

    public final <T> void a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    b();
                }
                synchronized (this) {
                    int size = this.c.size() + this.f9131d.size();
                }
            }
            throw new AssertionError("Call wasn't in-flight!");
        }
    }

    public final void b() {
        ExecutorService executorService;
        if (this.c.size() < 64 && !this.b.isEmpty()) {
            Iterator<u.a> it = this.b.iterator();
            while (it.hasNext()) {
                u.a next = it.next();
                Iterator<u.a> it2 = this.c.iterator();
                if (!it2.hasNext()) {
                    it.remove();
                    this.c.add(next);
                    synchronized (this) {
                        if (this.a == null) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            SynchronousQueue synchronousQueue = new SynchronousQueue();
                            byte[] bArr = k.c0.c.a;
                            this.a = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new k.c0.d("OkHttp Dispatcher", false));
                        }
                        executorService = this.a;
                    }
                    executorService.execute(next);
                    if (this.c.size() >= 64) {
                        return;
                    }
                } else {
                    Objects.requireNonNull(it2.next());
                    throw null;
                }
            }
        }
    }
}

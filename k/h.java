package k;

import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.c0.f.f;

/* compiled from: ConnectionPool.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: g  reason: collision with root package name */
    public static final Executor f9111g;
    public final int a;
    public final long b;
    public final Runnable c;

    /* renamed from: d  reason: collision with root package name */
    public final Deque<k.c0.f.c> f9112d;

    /* renamed from: e  reason: collision with root package name */
    public final k.c0.f.d f9113e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9114f;

    /* compiled from: ConnectionPool.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j2;
            while (true) {
                h hVar = h.this;
                long nanoTime = System.nanoTime();
                synchronized (hVar) {
                    k.c0.f.c cVar = null;
                    long j3 = Long.MIN_VALUE;
                    int i2 = 0;
                    int i3 = 0;
                    for (k.c0.f.c cVar2 : hVar.f9112d) {
                        if (hVar.a(cVar2, nanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j4 = nanoTime - cVar2.o;
                            if (j4 > j3) {
                                cVar = cVar2;
                                j3 = j4;
                            }
                        }
                    }
                    j2 = hVar.b;
                    if (j3 < j2 && i2 <= hVar.a) {
                        if (i2 > 0) {
                            j2 -= j3;
                        } else if (i3 <= 0) {
                            hVar.f9114f = false;
                            j2 = -1;
                        }
                    }
                    hVar.f9112d.remove(cVar);
                    k.c0.c.e(cVar.f8913e);
                    j2 = 0;
                }
                if (j2 == -1) {
                    return;
                }
                if (j2 > 0) {
                    long j5 = j2 / 1000000;
                    long j6 = j2 - (1000000 * j5);
                    synchronized (h.this) {
                        try {
                            h.this.wait(j5, (int) j6);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = k.c0.c.a;
        f9111g = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new k.c0.d("OkHttp ConnectionPool", true));
    }

    public h() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.c = new a();
        this.f9112d = new ArrayDeque();
        this.f9113e = new k.c0.f.d();
        this.a = 5;
        this.b = timeUnit.toNanos(5L);
    }

    public final int a(k.c0.f.c cVar, long j2) {
        List<Reference<k.c0.f.f>> list = cVar.n;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<k.c0.f.f> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder A = f.a.b.a.a.A("A connection to ");
                A.append(cVar.c.a.a);
                A.append(" was leaked. Did you forget to close a response body?");
                k.c0.k.f.a.l(A.toString(), ((f.a) reference).a);
                list.remove(i2);
                cVar.f8919k = true;
                if (list.isEmpty()) {
                    cVar.o = j2 - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}

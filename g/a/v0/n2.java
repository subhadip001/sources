package g.a.v0;

import io.grpc.internal.GrpcUtil;
import java.util.IdentityHashMap;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: SharedResourceHolder.java */
/* loaded from: classes2.dex */
public final class n2 {

    /* renamed from: d  reason: collision with root package name */
    public static final n2 f7870d = new n2(new a());
    public final IdentityHashMap<c<?>, b> a = new IdentityHashMap<>();
    public final d b;
    public ScheduledExecutorService c;

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public class a implements d {
    }

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public static class b {
        public final Object a;
        public int b;
        public ScheduledFuture<?> c;

        public b(Object obj) {
            this.a = obj;
        }
    }

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public interface c<T> {
        T a();

        void b(T t);
    }

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public interface d {
    }

    public n2(d dVar) {
        this.b = dVar;
    }

    public static <T> T a(c<T> cVar) {
        T t;
        n2 n2Var = f7870d;
        synchronized (n2Var) {
            b bVar = n2Var.a.get(cVar);
            if (bVar == null) {
                bVar = new b(cVar.a());
                n2Var.a.put(cVar, bVar);
            }
            ScheduledFuture<?> scheduledFuture = bVar.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                bVar.c = null;
            }
            bVar.b++;
            t = (T) bVar.a;
        }
        return t;
    }

    public static <T> T b(c<T> cVar, T t) {
        n2 n2Var = f7870d;
        synchronized (n2Var) {
            b bVar = n2Var.a.get(cVar);
            if (bVar != null) {
                f.h.b.c.a.m(t == bVar.a, "Releasing the wrong instance");
                f.h.b.c.a.C(bVar.b > 0, "Refcount has already reached zero");
                int i2 = bVar.b - 1;
                bVar.b = i2;
                if (i2 == 0) {
                    f.h.b.c.a.C(bVar.c == null, "Destroy task already scheduled");
                    if (n2Var.c == null) {
                        Objects.requireNonNull((a) n2Var.b);
                        n2Var.c = Executors.newSingleThreadScheduledExecutor(GrpcUtil.d("grpc-shared-destroyer-%d", true));
                    }
                    bVar.c = n2Var.c.schedule(new k1(new o2(n2Var, bVar, cVar, t)), 1L, TimeUnit.SECONDS);
                }
            } else {
                throw new IllegalArgumentException("No cached instance found for " + cVar);
            }
        }
        return null;
    }
}

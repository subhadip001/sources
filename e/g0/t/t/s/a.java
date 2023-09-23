package e.g0.t.t.s;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements f.h.c.g.a.c<V> {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f2402i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f2403j = Logger.getLogger(a.class.getName());

    /* renamed from: k  reason: collision with root package name */
    public static final b f2404k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f2405l;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2406f;

    /* renamed from: g  reason: collision with root package name */
    public volatile e f2407g;

    /* renamed from: h  reason: collision with root package name */
    public volatile i f2408h;

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public b(C0040a c0040a) {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f2409d;
        public final boolean a;
        public final Throwable b;

        static {
            if (a.f2402i) {
                f2409d = null;
                c = null;
                return;
            }
            f2409d = new c(false, null);
            c = new c(true, null);
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static final d b = new d(new C0041a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: e.g0.t.t.s.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0041a extends Throwable {
            public C0041a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            boolean z = a.f2402i;
            Objects.requireNonNull(th);
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f2410d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<a, i> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f2411d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f2412e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f2411d = atomicReferenceFieldUpdater4;
            this.f2412e = atomicReferenceFieldUpdater5;
        }

        @Override // e.g0.t.t.s.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f2411d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // e.g0.t.t.s.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f2412e.compareAndSet(aVar, obj, obj2);
        }

        @Override // e.g0.t.t.s.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.c.compareAndSet(aVar, iVar, iVar2);
        }

        @Override // e.g0.t.t.s.a.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // e.g0.t.t.s.a.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final a<V> f2413f;

        /* renamed from: g  reason: collision with root package name */
        public final f.h.c.g.a.c<? extends V> f2414g;

        public g(a<V> aVar, f.h.c.g.a.c<? extends V> cVar) {
            this.f2413f = aVar;
            this.f2414g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2413f.f2406f != this) {
                return;
            }
            if (a.f2404k.b(this.f2413f, this, a.f(this.f2414g))) {
                a.c(this.f2413f);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super(null);
        }

        @Override // e.g0.t.t.s.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2407g == eVar) {
                    aVar.f2407g = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // e.g0.t.t.s.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2406f == obj) {
                    aVar.f2406f = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // e.g0.t.t.s.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f2408h == iVar) {
                    aVar.f2408h = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // e.g0.t.t.s.a.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // e.g0.t.t.s.a.b
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;
        public volatile i b;

        public i(boolean z) {
        }

        public i() {
            a.f2404k.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "h"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f2404k = hVar;
        if (th != null) {
            f2403j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2405l = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [e.g0.t.t.s.a$b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e.g0.t.t.s.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e.g0.t.t.s.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [e.g0.t.t.s.a<V>, e.g0.t.t.s.a] */
    public static void c(a<?> aVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = ((a) aVar).f2408h;
            if (f2404k.c((a) aVar, iVar, i.c)) {
                while (iVar != null) {
                    Thread thread = iVar.a;
                    if (thread != null) {
                        iVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.b;
                }
                do {
                    eVar = ((a) aVar).f2407g;
                } while (!f2404k.a((a) aVar, eVar, e.f2410d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.c;
                    eVar3.c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.c;
                    Runnable runnable = eVar2.a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        aVar = gVar.f2413f;
                        if (aVar.f2406f == gVar) {
                            if (f2404k.b(aVar, gVar, f(gVar.f2414g))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, eVar2.b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f2403j;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(f.h.c.g.a.c<?> cVar) {
        if (cVar instanceof a) {
            Object obj = ((a) cVar).f2406f;
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                return cVar2.a ? cVar2.b != null ? new c(false, cVar2.b) : c.f2409d : obj;
            }
            return obj;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f2402i) & isCancelled) {
            return c.f2409d;
        }
        try {
            Object g2 = g(cVar);
            return g2 == null ? f2405l : g2;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e2));
            }
            return new c(false, e2);
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V g(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @Override // f.h.c.g.a.c
    public final void a(Runnable runnable, Executor executor) {
        Objects.requireNonNull(executor);
        e eVar = this.f2407g;
        if (eVar != e.f2410d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (f2404k.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f2407g;
            } while (eVar != e.f2410d);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g2 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g2 == this ? "this future" : String.valueOf(g2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        c cVar;
        Object obj = this.f2406f;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f2402i) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = c.c;
        } else {
            cVar = c.f2409d;
        }
        boolean z2 = false;
        a<V> aVar = this;
        while (true) {
            if (f2404k.b(aVar, obj, cVar)) {
                c(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                f.h.c.g.a.c<? extends V> cVar2 = ((g) obj).f2414g;
                if (cVar2 instanceof a) {
                    aVar = (a) cVar2;
                    obj = aVar.f2406f;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    cVar2.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f2406f;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f2405l) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).a);
        }
        Throwable th = ((c) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f2406f;
            if ((obj != null) & (!(obj instanceof g))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f2408h;
                if (iVar != i.c) {
                    i iVar2 = new i();
                    do {
                        b bVar = f2404k;
                        bVar.d(iVar2, iVar);
                        if (bVar.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2406f;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(iVar2);
                        } else {
                            iVar = this.f2408h;
                        }
                    } while (iVar != i.c);
                    return e(this.f2406f);
                }
                return e(this.f2406f);
            }
            while (nanos > 0) {
                Object obj3 = this.f2406f;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String p = f.a.b.a.a.p(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str2 = p + convert + " " + lowerCase;
                    if (z) {
                        str2 = f.a.b.a.a.p(str2, ",");
                    }
                    p = f.a.b.a.a.p(str2, " ");
                }
                if (z) {
                    p = p + nanos2 + " nanoseconds ";
                }
                str = f.a.b.a.a.p(p, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(f.a.b.a.a.p(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(f.a.b.a.a.q(str, " for ", aVar));
        }
        throw new InterruptedException();
    }

    public String h() {
        Object obj = this.f2406f;
        if (obj instanceof g) {
            StringBuilder A = f.a.b.a.a.A("setFuture=[");
            f.h.c.g.a.c<? extends V> cVar = ((g) obj).f2414g;
            return f.a.b.a.a.u(A, cVar == this ? "this future" : String.valueOf(cVar), "]");
        } else if (this instanceof ScheduledFuture) {
            StringBuilder A2 = f.a.b.a.a.A("remaining delay=[");
            A2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            A2.append(" ms]");
            return A2.toString();
        } else {
            return null;
        }
    }

    public final void i(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.f2408h;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!f2404k.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2406f instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f2406f;
        return (!(obj instanceof g)) & (obj != null);
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f2406f instanceof c) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                sb = h();
            } catch (RuntimeException e2) {
                StringBuilder A = f.a.b.a.a.A("Exception thrown from implementation: ");
                A.append(e2.getClass());
                sb = A.toString();
            }
            if (sb != null && !sb.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(sb);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2406f;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return e(obj2);
            }
            i iVar = this.f2408h;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    b bVar = f2404k;
                    bVar.d(iVar2, iVar);
                    if (bVar.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2406f;
                            } else {
                                i(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return e(obj);
                    }
                    iVar = this.f2408h;
                } while (iVar != i.c);
                return e(this.f2406f);
            }
            return e(this.f2406f);
        }
        throw new InterruptedException();
    }
}

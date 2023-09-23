package f.h.c.g.a;

import f.h.c.a.q;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import sun.misc.Unsafe;

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> extends f.h.c.g.a.e.a implements f.h.c.g.a.c<V> {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f6011i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f6012j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f6013k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f6014l;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f6015f;

    /* renamed from: g  reason: collision with root package name */
    private volatile e f6016g;

    /* renamed from: h  reason: collision with root package name */
    private volatile j f6017h;

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public b(C0139a c0139a) {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, j jVar, j jVar2);

        public abstract e d(a<?> aVar, e eVar);

        public abstract j e(a<?> aVar, j jVar);

        public abstract void f(j jVar, j jVar2);

        public abstract void g(j jVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f6018d;
        public final boolean a;
        public final Throwable b;

        static {
            if (a.f6011i) {
                f6018d = null;
                c = null;
                return;
            }
            f6018d = new c(false, null);
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
        public final Throwable a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: f.h.c.g.a.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0140a extends Throwable {
            public C0140a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            Objects.requireNonNull(new C0140a("Failure occurred while trying to finish a future."));
        }

        public d(Throwable th) {
            Objects.requireNonNull(th);
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<j, Thread> a;
        public final AtomicReferenceFieldUpdater<j, j> b;
        public final AtomicReferenceFieldUpdater<a, j> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f6020d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f6021e;

        public f(AtomicReferenceFieldUpdater<j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<j, j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f6020d = atomicReferenceFieldUpdater4;
            this.f6021e = atomicReferenceFieldUpdater5;
        }

        @Override // f.h.c.g.a.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f6020d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // f.h.c.g.a.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f6021e.compareAndSet(aVar, obj, obj2);
        }

        @Override // f.h.c.g.a.a.b
        public boolean c(a<?> aVar, j jVar, j jVar2) {
            return this.c.compareAndSet(aVar, jVar, jVar2);
        }

        @Override // f.h.c.g.a.a.b
        public e d(a<?> aVar, e eVar) {
            return this.f6020d.getAndSet(aVar, eVar);
        }

        @Override // f.h.c.g.a.a.b
        public j e(a<?> aVar, j jVar) {
            return this.c.getAndSet(aVar, jVar);
        }

        @Override // f.h.c.g.a.a.b
        public void f(j jVar, j jVar2) {
            this.b.lazySet(jVar, jVar2);
        }

        @Override // f.h.c.g.a.a.b
        public void g(j jVar, Thread thread) {
            this.a.lazySet(jVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h(C0139a c0139a) {
            super(null);
        }

        @Override // f.h.c.g.a.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f6016g == eVar) {
                    ((a) aVar).f6016g = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // f.h.c.g.a.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f6015f == obj) {
                    ((a) aVar).f6015f = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // f.h.c.g.a.a.b
        public boolean c(a<?> aVar, j jVar, j jVar2) {
            synchronized (aVar) {
                if (((a) aVar).f6017h == jVar) {
                    ((a) aVar).f6017h = jVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // f.h.c.g.a.a.b
        public e d(a<?> aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                eVar2 = ((a) aVar).f6016g;
                if (eVar2 != eVar) {
                    ((a) aVar).f6016g = eVar;
                }
            }
            return eVar2;
        }

        @Override // f.h.c.g.a.a.b
        public j e(a<?> aVar, j jVar) {
            j jVar2;
            synchronized (aVar) {
                jVar2 = ((a) aVar).f6017h;
                if (jVar2 != jVar) {
                    ((a) aVar).f6017h = jVar;
                }
            }
            return jVar2;
        }

        @Override // f.h.c.g.a.a.b
        public void f(j jVar, j jVar2) {
            jVar.b = jVar2;
        }

        @Override // f.h.c.g.a.a.b
        public void g(j jVar, Thread thread) {
            jVar.a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class i extends b {
        public static final Unsafe a;
        public static final long b;
        public static final long c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f6022d;

        /* renamed from: e  reason: collision with root package name */
        public static final long f6023e;

        /* renamed from: f  reason: collision with root package name */
        public static final long f6024f;

        /* compiled from: AbstractFuture.java */
        /* renamed from: f.h.c.g.a.a$i$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0141a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0141a());
                }
                try {
                    c = unsafe.objectFieldOffset(a.class.getDeclaredField("h"));
                    b = unsafe.objectFieldOffset(a.class.getDeclaredField("g"));
                    f6022d = unsafe.objectFieldOffset(a.class.getDeclaredField("f"));
                    f6023e = unsafe.objectFieldOffset(j.class.getDeclaredField("a"));
                    f6024f = unsafe.objectFieldOffset(j.class.getDeclaredField("b"));
                    a = unsafe;
                } catch (Exception e2) {
                    q.b(e2);
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        public i(C0139a c0139a) {
            super(null);
        }

        @Override // f.h.c.g.a.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return a.compareAndSwapObject(aVar, b, eVar, eVar2);
        }

        @Override // f.h.c.g.a.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return a.compareAndSwapObject(aVar, f6022d, obj, obj2);
        }

        @Override // f.h.c.g.a.a.b
        public boolean c(a<?> aVar, j jVar, j jVar2) {
            return a.compareAndSwapObject(aVar, c, jVar, jVar2);
        }

        @Override // f.h.c.g.a.a.b
        public e d(a<?> aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((a) aVar).f6016g;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // f.h.c.g.a.a.b
        public j e(a<?> aVar, j jVar) {
            j jVar2;
            do {
                jVar2 = ((a) aVar).f6017h;
                if (jVar == jVar2) {
                    return jVar2;
                }
            } while (!c(aVar, jVar2, jVar));
            return jVar2;
        }

        @Override // f.h.c.g.a.a.b
        public void f(j jVar, j jVar2) {
            a.putObject(jVar, f6024f, jVar2);
        }

        @Override // f.h.c.g.a.a.b
        public void g(j jVar, Thread thread) {
            a.putObject(jVar, f6023e, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class j {
        public static final j c = new j(false);
        public volatile Thread a;
        public volatile j b;

        public j(boolean z) {
        }

        public j() {
            a.f6013k.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        b hVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f6011i = z;
        f6012j = Logger.getLogger(a.class.getName());
        Throwable th = null;
        try {
            hVar = new i(null);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(j.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j.class, j.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, j.class, "h"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "f"));
            } catch (Throwable th3) {
                hVar = new h(null);
                th = th3;
            }
        }
        f6013k = hVar;
        if (th != null) {
            Logger logger = f6012j;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f6014l = new Object();
    }

    public static void j(a<?> aVar) {
        Objects.requireNonNull(aVar);
        for (j e2 = f6013k.e(aVar, j.c); e2 != null; e2 = e2.b) {
            Thread thread = e2.a;
            if (thread != null) {
                e2.a = null;
                LockSupport.unpark(thread);
            }
        }
        e d2 = f6013k.d(aVar, e.f6019d);
        e eVar = null;
        while (d2 != null) {
            e eVar2 = d2.c;
            d2.c = eVar;
            eVar = d2;
            d2 = eVar2;
        }
        while (eVar != null) {
            e eVar3 = eVar.c;
            Runnable runnable = eVar.a;
            Objects.requireNonNull(runnable);
            Runnable runnable2 = runnable;
            if (!(runnable2 instanceof g)) {
                Executor executor = eVar.b;
                Objects.requireNonNull(executor);
                k(runnable2, executor);
                eVar = eVar3;
            } else {
                g gVar = (g) runnable2;
                throw null;
            }
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f6012j;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e2);
        }
    }

    public static <V> V m(Future<V> future) {
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
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        f.h.b.c.a.x(runnable, "Runnable was null.");
        f.h.b.c.a.x(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f6016g) != e.f6019d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (f6013k.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f6016g;
            } while (eVar != e.f6019d);
            k(runnable, executor);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        c cVar;
        Object obj = this.f6015f;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f6011i) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                cVar = c.c;
            } else {
                cVar = c.f6018d;
            }
            Objects.requireNonNull(cVar);
        }
        while (!f6013k.b(this, obj, cVar)) {
            obj = this.f6015f;
            if (!(obj instanceof g)) {
                return false;
            }
        }
        if (z) {
            n();
        }
        j(this);
        if (obj instanceof g) {
            Objects.requireNonNull((g) obj);
            throw null;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f6015f;
            if ((obj != null) & (!(obj instanceof g))) {
                return l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                j jVar = this.f6017h;
                if (jVar != j.c) {
                    j jVar2 = new j();
                    do {
                        b bVar = f6013k;
                        bVar.f(jVar2, jVar);
                        if (bVar.c(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6015f;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return l(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(jVar2);
                        } else {
                            jVar = this.f6017h;
                        }
                    } while (jVar != j.c);
                    Object obj3 = this.f6015f;
                    Objects.requireNonNull(obj3);
                    return l(obj3);
                }
                Object obj32 = this.f6015f;
                Objects.requireNonNull(obj32);
                return l(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f6015f;
                if ((obj4 != null) & (!(obj4 instanceof g))) {
                    return l(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(f.a.b.a.a.x(lowerCase2, 28));
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(f.a.b.a.a.x(lowerCase, valueOf.length() + 21));
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    concat = f.a.b.a.a.f(valueOf2.length() + 33, valueOf2, nanos2, " nanoseconds ");
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(f.a.b.a.a.g(f.a.b.a.a.x(aVar, f.a.b.a.a.x(sb2, 5)), sb2, " for ", aVar));
        }
        throw new InterruptedException();
    }

    public final void h(StringBuilder sb) {
        try {
            Object m2 = m(this);
            sb.append("SUCCESS, result=[");
            i(sb, m2);
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

    public final void i(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6015f instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f6015f;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V l(Object obj) {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f6014l) {
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

    public void n() {
    }

    public String o() {
        if (this instanceof ScheduledFuture) {
            return f.a.b.a.a.f(41, "remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    public final void p(j jVar) {
        jVar.a = null;
        while (true) {
            j jVar2 = this.f6017h;
            if (jVar2 == j.c) {
                return;
            }
            j jVar3 = null;
            while (jVar2 != null) {
                j jVar4 = jVar2.b;
                if (jVar2.a != null) {
                    jVar3 = jVar2;
                } else if (jVar3 != null) {
                    jVar3.b = jVar4;
                    if (jVar3.a == null) {
                        break;
                    }
                } else if (!f6013k.c(this, jVar2, jVar4)) {
                    break;
                }
                jVar2 = jVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r7.f6015f
            boolean r1 = r1 instanceof f.h.c.g.a.a.c
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Le0
        L50:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L5b
            r7.h(r0)
            goto Le0
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r7.f6015f
            boolean r4 = r3 instanceof f.h.c.g.a.a.g
            java.lang.String r5 = "Exception thrown from implementation: "
            r6 = 0
            if (r4 == 0) goto L8c
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            f.h.c.g.a.a$g r3 = (f.h.c.g.a.a.g) r3
            java.util.Objects.requireNonNull(r3)
            r0.append(r6)     // Catch: java.lang.StackOverflowError -> L7b java.lang.RuntimeException -> L7d
            goto L88
        L7b:
            r3 = move-exception
            goto L7e
        L7d:
            r3 = move-exception
        L7e:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L88:
            r0.append(r2)
            goto Ld0
        L8c:
            java.lang.String r3 = r7.o()     // Catch: java.lang.StackOverflowError -> La3 java.lang.RuntimeException -> La5
            int r4 = f.h.c.a.j.a     // Catch: java.lang.StackOverflowError -> La3 java.lang.RuntimeException -> La5
            if (r3 == 0) goto L9d
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La3 java.lang.RuntimeException -> La5
            if (r4 == 0) goto L9b
            goto L9d
        L9b:
            r4 = 0
            goto L9e
        L9d:
            r4 = 1
        L9e:
            if (r4 == 0) goto La1
            goto Lc3
        La1:
            r6 = r3
            goto Lc3
        La3:
            r3 = move-exception
            goto La6
        La5:
            r3 = move-exception
        La6:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
        Lc3:
            if (r6 == 0) goto Ld0
            java.lang.String r3 = ", info=["
            r0.append(r3)
            r0.append(r6)
            r0.append(r2)
        Ld0:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto Le0
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.h(r0)
        Le0:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.g.a.a.toString():java.lang.String");
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f6019d = new e();
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }

        public e() {
            this.a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6015f;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return l(obj2);
            }
            j jVar = this.f6017h;
            if (jVar != j.c) {
                j jVar2 = new j();
                do {
                    b bVar = f6013k;
                    bVar.f(jVar2, jVar);
                    if (bVar.c(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6015f;
                            } else {
                                p(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return l(obj);
                    }
                    jVar = this.f6017h;
                } while (jVar != j.c);
                Object obj3 = this.f6015f;
                Objects.requireNonNull(obj3);
                return l(obj3);
            }
            Object obj32 = this.f6015f;
            Objects.requireNonNull(obj32);
            return l(obj32);
        }
        throw new InterruptedException();
    }
}

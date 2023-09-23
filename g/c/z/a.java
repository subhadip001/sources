package g.c.z;

import f.n.a.n.i;
import g.c.n;
import g.c.w.j.d;
import io.reactivex.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: BehaviorSubject.java */
/* loaded from: classes2.dex */
public final class a<T> extends b<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final Object[] f8585m = new Object[0];
    public static final C0221a[] n = new C0221a[0];
    public static final C0221a[] o = new C0221a[0];

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Object> f8586f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<C0221a<T>[]> f8587g;

    /* renamed from: h  reason: collision with root package name */
    public final ReadWriteLock f8588h;

    /* renamed from: i  reason: collision with root package name */
    public final Lock f8589i;

    /* renamed from: j  reason: collision with root package name */
    public final Lock f8590j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReference<Throwable> f8591k;

    /* renamed from: l  reason: collision with root package name */
    public long f8592l;

    /* compiled from: BehaviorSubject.java */
    /* renamed from: g.c.z.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0221a<T> implements g.c.t.b, Object<Object> {

        /* renamed from: f  reason: collision with root package name */
        public final n<? super T> f8593f;

        /* renamed from: g  reason: collision with root package name */
        public final a<T> f8594g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8595h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8596i;

        /* renamed from: j  reason: collision with root package name */
        public g.c.w.j.a<Object> f8597j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f8598k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f8599l;

        /* renamed from: m  reason: collision with root package name */
        public long f8600m;

        public C0221a(n<? super T> nVar, a<T> aVar) {
            this.f8593f = nVar;
            this.f8594g = aVar;
        }

        public boolean a(Object obj) {
            return this.f8599l || NotificationLite.accept(obj, this.f8593f);
        }

        public void b(Object obj, long j2) {
            if (this.f8599l) {
                return;
            }
            if (!this.f8598k) {
                synchronized (this) {
                    if (this.f8599l) {
                        return;
                    }
                    if (this.f8600m == j2) {
                        return;
                    }
                    if (this.f8596i) {
                        g.c.w.j.a<Object> aVar = this.f8597j;
                        if (aVar == null) {
                            aVar = new g.c.w.j.a<>(4);
                            this.f8597j = aVar;
                        }
                        int i2 = aVar.c;
                        if (i2 == 4) {
                            Object[] objArr = new Object[5];
                            aVar.b[4] = objArr;
                            aVar.b = objArr;
                            i2 = 0;
                        }
                        aVar.b[i2] = obj;
                        aVar.c = i2 + 1;
                        return;
                    }
                    this.f8595h = true;
                    this.f8598k = true;
                }
            }
            a(obj);
        }

        @Override // g.c.t.b
        public void dispose() {
            if (this.f8599l) {
                return;
            }
            this.f8599l = true;
            this.f8594g.c(this);
        }
    }

    public a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8588h = reentrantReadWriteLock;
        this.f8589i = reentrantReadWriteLock.readLock();
        this.f8590j = reentrantReadWriteLock.writeLock();
        this.f8587g = new AtomicReference<>(n);
        this.f8586f = new AtomicReference<>();
        this.f8591k = new AtomicReference<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
        r8 = r8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
        if (r2 >= 4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        r4 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
        if (r4 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r0.a(r4) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        r8 = r8[4];
     */
    @Override // g.c.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(g.c.n<? super T> r8) {
        /*
            r7 = this;
            g.c.z.a$a r0 = new g.c.z.a$a
            r0.<init>(r8, r7)
            r8.onSubscribe(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<g.c.z.a$a<T>[]> r1 = r7.f8587g
            java.lang.Object r1 = r1.get()
            g.c.z.a$a[] r1 = (g.c.z.a.C0221a[]) r1
            g.c.z.a$a[] r2 = g.c.z.a.o
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L18
            r1 = 0
            goto L2b
        L18:
            int r2 = r1.length
            int r5 = r2 + 1
            g.c.z.a$a[] r5 = new g.c.z.a.C0221a[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<g.c.z.a$a<T>[]> r2 = r7.f8587g
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L8
            r1 = 1
        L2b:
            if (r1 == 0) goto La6
            boolean r8 = r0.f8599l
            if (r8 == 0) goto L36
            r7.c(r0)
            goto Lb9
        L36:
            boolean r8 = r0.f8599l
            if (r8 == 0) goto L3c
            goto Lb9
        L3c:
            monitor-enter(r0)
            boolean r8 = r0.f8599l     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            goto Lb9
        L44:
            boolean r8 = r0.f8595h     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L4b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            goto Lb9
        L4b:
            g.c.z.a<T> r8 = r0.f8594g     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.locks.Lock r1 = r8.f8589i     // Catch: java.lang.Throwable -> La3
            r1.lock()     // Catch: java.lang.Throwable -> La3
            long r5 = r8.f8592l     // Catch: java.lang.Throwable -> La3
            r0.f8600m = r5     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.f8586f     // Catch: java.lang.Throwable -> La3
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> La3
            r1.unlock()     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L63
            r1 = 1
            goto L64
        L63:
            r1 = 0
        L64:
            r0.f8596i = r1     // Catch: java.lang.Throwable -> La3
            r0.f8595h = r4     // Catch: java.lang.Throwable -> La3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto Lb9
            boolean r8 = r0.a(r8)
            if (r8 == 0) goto L72
            goto Lb9
        L72:
            boolean r8 = r0.f8599l
            if (r8 == 0) goto L77
            goto Lb9
        L77:
            monitor-enter(r0)
            g.c.w.j.a<java.lang.Object> r8 = r0.f8597j     // Catch: java.lang.Throwable -> La0
            if (r8 != 0) goto L80
            r0.f8596i = r3     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            goto Lb9
        L80:
            r1 = 0
            r0.f8597j = r1     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.Object[] r8 = r8.a
            r1 = 4
        L87:
            if (r8 == 0) goto L72
            r2 = 0
        L8a:
            if (r2 >= r1) goto L9b
            r4 = r8[r2]
            if (r4 != 0) goto L91
            goto L9b
        L91:
            boolean r4 = r0.a(r4)
            if (r4 == 0) goto L98
            goto L72
        L98:
            int r2 = r2 + 1
            goto L8a
        L9b:
            r8 = r8[r1]
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            goto L87
        La0:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            throw r8
        La3:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            throw r8
        La6:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.f8591k
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = g.c.w.j.d.a
            if (r0 != r1) goto Lb6
            r8.onComplete()
            goto Lb9
        Lb6:
            r8.onError(r0)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.z.a.b(g.c.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(C0221a<T> c0221a) {
        C0221a<T>[] c0221aArr;
        C0221a[] c0221aArr2;
        do {
            c0221aArr = this.f8587g.get();
            int length = c0221aArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (c0221aArr[i2] == c0221a) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                c0221aArr2 = n;
            } else {
                C0221a[] c0221aArr3 = new C0221a[length - 1];
                System.arraycopy(c0221aArr, 0, c0221aArr3, 0, i2);
                System.arraycopy(c0221aArr, i2 + 1, c0221aArr3, i2, (length - i2) - 1);
                c0221aArr2 = c0221aArr3;
            }
        } while (!this.f8587g.compareAndSet(c0221aArr, c0221aArr2));
    }

    public void d(Object obj) {
        this.f8590j.lock();
        this.f8592l++;
        this.f8586f.lazySet(obj);
        this.f8590j.unlock();
    }

    @Override // g.c.n
    public void onComplete() {
        if (this.f8591k.compareAndSet(null, d.a)) {
            Object complete = NotificationLite.complete();
            AtomicReference<C0221a<T>[]> atomicReference = this.f8587g;
            C0221a<T>[] c0221aArr = o;
            C0221a<T>[] andSet = atomicReference.getAndSet(c0221aArr);
            if (andSet != c0221aArr) {
                d(complete);
            }
            for (C0221a<T> c0221a : andSet) {
                c0221a.b(complete, this.f8592l);
            }
        }
    }

    @Override // g.c.n
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f8591k.compareAndSet(null, th)) {
            i.L(th);
            return;
        }
        Object error = NotificationLite.error(th);
        AtomicReference<C0221a<T>[]> atomicReference = this.f8587g;
        C0221a<T>[] c0221aArr = o;
        C0221a<T>[] andSet = atomicReference.getAndSet(c0221aArr);
        if (andSet != c0221aArr) {
            d(error);
        }
        for (C0221a<T> c0221a : andSet) {
            c0221a.b(error, this.f8592l);
        }
    }

    @Override // g.c.n
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f8591k.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t);
        d(next);
        for (C0221a<T> c0221a : this.f8587g.get()) {
            c0221a.b(next, this.f8592l);
        }
    }

    @Override // g.c.n
    public void onSubscribe(g.c.t.b bVar) {
        if (this.f8591k.get() != null) {
            bVar.dispose();
        }
    }
}

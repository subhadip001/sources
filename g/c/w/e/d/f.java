package g.c.w.e.d;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMap.java */
/* loaded from: classes2.dex */
public final class f<T, U> extends g.c.w.e.d.a<T, U> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends g.c.m<? extends U>> f8424g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8425h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8426i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8427j;

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T, U> extends AtomicReference<g.c.t.b> implements g.c.n<U> {

        /* renamed from: f  reason: collision with root package name */
        public final long f8428f;

        /* renamed from: g  reason: collision with root package name */
        public final b<T, U> f8429g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f8430h;

        /* renamed from: i  reason: collision with root package name */
        public volatile g.c.w.c.j<U> f8431i;

        /* renamed from: j  reason: collision with root package name */
        public int f8432j;

        public a(b<T, U> bVar, long j2) {
            this.f8428f = j2;
            this.f8429g = bVar;
        }

        @Override // g.c.n
        public void onComplete() {
            this.f8430h = true;
            this.f8429g.c();
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            if (g.c.w.j.d.a(this.f8429g.f8440m, th)) {
                b<T, U> bVar = this.f8429g;
                if (!bVar.f8435h) {
                    bVar.b();
                }
                this.f8430h = true;
                this.f8429g.c();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // g.c.n
        public void onNext(U u) {
            if (this.f8432j == 0) {
                b<T, U> bVar = this.f8429g;
                if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                    bVar.f8433f.onNext(u);
                    if (bVar.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    g.c.w.c.j jVar = this.f8431i;
                    if (jVar == null) {
                        jVar = new g.c.w.f.b(bVar.f8437j);
                        this.f8431i = jVar;
                    }
                    jVar.offer(u);
                    if (bVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                bVar.d();
                return;
            }
            this.f8429g.c();
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.setOnce(this, bVar) && (bVar instanceof g.c.w.c.e)) {
                g.c.w.c.e eVar = (g.c.w.c.e) bVar;
                int requestFusion = eVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f8432j = requestFusion;
                    this.f8431i = eVar;
                    this.f8430h = true;
                    this.f8429g.c();
                } else if (requestFusion == 2) {
                    this.f8432j = requestFusion;
                    this.f8431i = eVar;
                }
            }
        }
    }

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: classes2.dex */
    public static final class b<T, U> extends AtomicInteger implements g.c.t.b, g.c.n<T> {
        public static final a<?, ?>[] v = new a[0];
        public static final a<?, ?>[] w = new a[0];

        /* renamed from: f  reason: collision with root package name */
        public final g.c.n<? super U> f8433f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends g.c.m<? extends U>> f8434g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8435h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8436i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8437j;

        /* renamed from: k  reason: collision with root package name */
        public volatile g.c.w.c.i<U> f8438k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f8439l;

        /* renamed from: m  reason: collision with root package name */
        public final g.c.w.j.b f8440m = new g.c.w.j.b();
        public volatile boolean n;
        public final AtomicReference<a<?, ?>[]> o;
        public g.c.t.b p;
        public long q;
        public long r;
        public int s;
        public Queue<g.c.m<? extends U>> t;
        public int u;

        public b(g.c.n<? super U> nVar, g.c.v.d<? super T, ? extends g.c.m<? extends U>> dVar, boolean z, int i2, int i3) {
            this.f8433f = nVar;
            this.f8434g = dVar;
            this.f8435h = z;
            this.f8436i = i2;
            this.f8437j = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.t = new ArrayDeque(i2);
            }
            this.o = new AtomicReference<>(v);
        }

        public boolean a() {
            if (this.n) {
                return true;
            }
            Throwable th = this.f8440m.get();
            if (this.f8435h || th == null) {
                return false;
            }
            b();
            Throwable b = g.c.w.j.d.b(this.f8440m);
            if (b != g.c.w.j.d.a) {
                this.f8433f.onError(b);
            }
            return true;
        }

        public boolean b() {
            a<?, ?>[] andSet;
            this.p.dispose();
            a<?, ?>[] aVarArr = this.o.get();
            a<?, ?>[] aVarArr2 = w;
            if (aVarArr == aVarArr2 || (andSet = this.o.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                Objects.requireNonNull(aVar);
                DisposableHelper.dispose(aVar);
            }
            return true;
        }

        public void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x00b5, code lost:
            if (r12 != null) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.w.e.d.f.b.d():void");
        }

        @Override // g.c.t.b
        public void dispose() {
            Throwable b;
            if (this.n) {
                return;
            }
            this.n = true;
            if (!b() || (b = g.c.w.j.d.b(this.f8440m)) == null || b == g.c.w.j.d.a) {
                return;
            }
            f.n.a.n.i.L(b);
        }

        public void e(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.o.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = v;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                    System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.o.compareAndSet(aVarArr, aVarArr2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (decrementAndGet() == 0) goto L49;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v8, types: [g.c.w.c.j] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void f(g.c.m<? extends U> r8) {
            /*
                r7 = this;
            L0:
                boolean r0 = r8 instanceof java.util.concurrent.Callable
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8e
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L60
                if (r8 != 0) goto L12
                goto L6c
            L12:
                int r3 = r7.get()
                if (r3 != 0) goto L2a
                boolean r3 = r7.compareAndSet(r1, r2)
                if (r3 == 0) goto L2a
                g.c.n<? super U> r3 = r7.f8433f
                r3.onNext(r8)
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L5c
                goto L6c
            L2a:
                g.c.w.c.i<U> r3 = r7.f8438k
                if (r3 != 0) goto L43
                int r3 = r7.f8436i
                if (r3 != r0) goto L3a
                g.c.w.f.b r3 = new g.c.w.f.b
                int r4 = r7.f8437j
                r3.<init>(r4)
                goto L41
            L3a:
                g.c.w.f.a r3 = new g.c.w.f.a
                int r4 = r7.f8436i
                r3.<init>(r4)
            L41:
                r7.f8438k = r3
            L43:
                boolean r8 = r3.offer(r8)
                if (r8 != 0) goto L54
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r3 = "Scalar queue full?!"
                r8.<init>(r3)
                r7.onError(r8)
                goto L6c
            L54:
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L5c
                r8 = 0
                goto L6d
            L5c:
                r7.d()
                goto L6c
            L60:
                r8 = move-exception
                f.n.a.n.i.d0(r8)
                g.c.w.j.b r3 = r7.f8440m
                g.c.w.j.d.a(r3, r8)
                r7.c()
            L6c:
                r8 = 1
            L6d:
                if (r8 == 0) goto Lc2
                int r8 = r7.f8436i
                if (r8 == r0) goto Lc2
                monitor-enter(r7)
                java.util.Queue<g.c.m<? extends U>> r8 = r7.t     // Catch: java.lang.Throwable -> L8b
                java.lang.Object r8 = r8.poll()     // Catch: java.lang.Throwable -> L8b
                g.c.m r8 = (g.c.m) r8     // Catch: java.lang.Throwable -> L8b
                if (r8 != 0) goto L84
                int r0 = r7.u     // Catch: java.lang.Throwable -> L8b
                int r0 = r0 - r2
                r7.u = r0     // Catch: java.lang.Throwable -> L8b
                r1 = 1
            L84:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L8b
                if (r1 == 0) goto L0
                r7.c()
                goto Lc2
            L8b:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L8b
                throw r8
            L8e:
                g.c.w.e.d.f$a r0 = new g.c.w.e.d.f$a
                long r3 = r7.q
                r5 = 1
                long r5 = r5 + r3
                r7.q = r5
                r0.<init>(r7, r3)
            L9a:
                java.util.concurrent.atomic.AtomicReference<g.c.w.e.d.f$a<?, ?>[]> r3 = r7.o
                java.lang.Object r3 = r3.get()
                g.c.w.e.d.f$a[] r3 = (g.c.w.e.d.f.a[]) r3
                g.c.w.e.d.f$a<?, ?>[] r4 = g.c.w.e.d.f.b.w
                if (r3 != r4) goto Laa
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                goto Lbd
            Laa:
                int r4 = r3.length
                int r5 = r4 + 1
                g.c.w.e.d.f$a[] r5 = new g.c.w.e.d.f.a[r5]
                java.lang.System.arraycopy(r3, r1, r5, r1, r4)
                r5[r4] = r0
                java.util.concurrent.atomic.AtomicReference<g.c.w.e.d.f$a<?, ?>[]> r4 = r7.o
                boolean r3 = r4.compareAndSet(r3, r5)
                if (r3 == 0) goto L9a
                r1 = 1
            Lbd:
                if (r1 == 0) goto Lc2
                r8.a(r0)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.w.e.d.f.b.f(g.c.m):void");
        }

        @Override // g.c.n
        public void onComplete() {
            if (this.f8439l) {
                return;
            }
            this.f8439l = true;
            c();
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            if (this.f8439l) {
                f.n.a.n.i.L(th);
            } else if (g.c.w.j.d.a(this.f8440m, th)) {
                this.f8439l = true;
                c();
            } else {
                f.n.a.n.i.L(th);
            }
        }

        @Override // g.c.n
        public void onNext(T t) {
            if (this.f8439l) {
                return;
            }
            try {
                g.c.m<? extends U> apply = this.f8434g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                g.c.m<? extends U> mVar = apply;
                if (this.f8436i != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i2 = this.u;
                        if (i2 == this.f8436i) {
                            this.t.offer(mVar);
                            return;
                        }
                        this.u = i2 + 1;
                    }
                }
                f(mVar);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.p.dispose();
                onError(th);
            }
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.p, bVar)) {
                this.p = bVar;
                this.f8433f.onSubscribe(this);
            }
        }
    }

    public f(g.c.m<T> mVar, g.c.v.d<? super T, ? extends g.c.m<? extends U>> dVar, boolean z, int i2, int i3) {
        super(mVar);
        this.f8424g = dVar;
        this.f8425h = z;
        this.f8426i = i2;
        this.f8427j = i3;
    }

    @Override // g.c.l
    public void b(g.c.n<? super U> nVar) {
        boolean z;
        g.c.m<T> mVar = this.f8411f;
        g.c.v.d<? super T, ? extends g.c.m<? extends U>> dVar = this.f8424g;
        if (mVar instanceof Callable) {
            z = true;
            try {
                Object obj = (Object) ((Callable) mVar).call();
                if (obj == 0) {
                    EmptyDisposable.complete(nVar);
                } else {
                    try {
                        g.c.m<? extends U> apply = dVar.apply(obj);
                        Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                        g.c.m<? extends U> mVar2 = apply;
                        if (mVar2 instanceof Callable) {
                            try {
                                Object call = ((Callable) mVar2).call();
                                if (call == null) {
                                    EmptyDisposable.complete(nVar);
                                } else {
                                    l lVar = new l(nVar, call);
                                    nVar.onSubscribe(lVar);
                                    lVar.run();
                                }
                            } catch (Throwable th) {
                                f.n.a.n.i.d0(th);
                                EmptyDisposable.error(th, nVar);
                            }
                        } else {
                            mVar2.a(nVar);
                        }
                    } catch (Throwable th2) {
                        f.n.a.n.i.d0(th2);
                        EmptyDisposable.error(th2, nVar);
                    }
                }
            } catch (Throwable th3) {
                f.n.a.n.i.d0(th3);
                EmptyDisposable.error(th3, nVar);
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        this.f8411f.a(new b(nVar, this.f8424g, this.f8425h, this.f8426i, this.f8427j));
    }
}

package g.c.w.e.b;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableFlatMap.java */
/* loaded from: classes2.dex */
public final class i<T, U> extends g.c.w.e.b.a<T, U> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends m.c.a<? extends U>> f8232h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8233i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8234j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8235k;

    /* compiled from: FlowableFlatMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T, U> extends AtomicReference<m.c.c> implements g.c.g<U>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final long f8236f;

        /* renamed from: g  reason: collision with root package name */
        public final b<T, U> f8237g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8238h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8239i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f8240j;

        /* renamed from: k  reason: collision with root package name */
        public volatile g.c.w.c.j<U> f8241k;

        /* renamed from: l  reason: collision with root package name */
        public long f8242l;

        /* renamed from: m  reason: collision with root package name */
        public int f8243m;

        public a(b<T, U> bVar, long j2) {
            this.f8236f = j2;
            this.f8237g = bVar;
            int i2 = bVar.f8248j;
            this.f8239i = i2;
            this.f8238h = i2 >> 2;
        }

        public void b(long j2) {
            if (this.f8243m != 1) {
                long j3 = this.f8242l + j2;
                if (j3 >= this.f8238h) {
                    this.f8242l = 0L;
                    get().request(j3);
                    return;
                }
                this.f8242l = j3;
            }
        }

        @Override // g.c.t.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // m.c.b
        public void onComplete() {
            this.f8240j = true;
            this.f8237g.c();
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            a<?, ?>[] andSet;
            lazySet(SubscriptionHelper.CANCELLED);
            b<T, U> bVar = this.f8237g;
            if (g.c.w.j.d.a(bVar.f8251m, th)) {
                this.f8240j = true;
                if (!bVar.f8246h) {
                    bVar.q.cancel();
                    for (a<?, ?> aVar : bVar.o.getAndSet(b.x)) {
                        Objects.requireNonNull(aVar);
                        SubscriptionHelper.cancel(aVar);
                    }
                }
                bVar.c();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.b
        public void onNext(U u) {
            if (this.f8243m != 2) {
                b<T, U> bVar = this.f8237g;
                if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                    long j2 = bVar.p.get();
                    g.c.w.c.j jVar = this.f8241k;
                    if (j2 != 0 && (jVar == null || jVar.isEmpty())) {
                        bVar.f8244f.onNext(u);
                        if (j2 != Long.MAX_VALUE) {
                            bVar.p.decrementAndGet();
                        }
                        b(1L);
                    } else {
                        if (jVar == null && (jVar = this.f8241k) == null) {
                            jVar = new g.c.w.f.a(bVar.f8248j);
                            this.f8241k = jVar;
                        }
                        if (!jVar.offer(u)) {
                            bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                            return;
                        }
                    }
                    if (bVar.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    g.c.w.c.j jVar2 = this.f8241k;
                    if (jVar2 == null) {
                        jVar2 = new g.c.w.f.a(bVar.f8248j);
                        this.f8241k = jVar2;
                    }
                    if (!jVar2.offer(u)) {
                        bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    } else if (bVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                bVar.d();
                return;
            }
            this.f8237g.c();
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.setOnce(this, cVar)) {
                if (cVar instanceof g.c.w.c.g) {
                    g.c.w.c.g gVar = (g.c.w.c.g) cVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f8243m = requestFusion;
                        this.f8241k = gVar;
                        this.f8240j = true;
                        this.f8237g.c();
                        return;
                    } else if (requestFusion == 2) {
                        this.f8243m = requestFusion;
                        this.f8241k = gVar;
                    }
                }
                cVar.request(this.f8239i);
            }
        }
    }

    /* compiled from: FlowableFlatMap.java */
    /* loaded from: classes2.dex */
    public static final class b<T, U> extends AtomicInteger implements g.c.g<T>, m.c.c {
        public static final a<?, ?>[] w = new a[0];
        public static final a<?, ?>[] x = new a[0];

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super U> f8244f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends m.c.a<? extends U>> f8245g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8246h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8247i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8248j;

        /* renamed from: k  reason: collision with root package name */
        public volatile g.c.w.c.i<U> f8249k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f8250l;

        /* renamed from: m  reason: collision with root package name */
        public final g.c.w.j.b f8251m = new g.c.w.j.b();
        public volatile boolean n;
        public final AtomicReference<a<?, ?>[]> o;
        public final AtomicLong p;
        public m.c.c q;
        public long r;
        public long s;
        public int t;
        public int u;
        public final int v;

        public b(m.c.b<? super U> bVar, g.c.v.d<? super T, ? extends m.c.a<? extends U>> dVar, boolean z, int i2, int i3) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.o = atomicReference;
            this.p = new AtomicLong();
            this.f8244f = bVar;
            this.f8245g = dVar;
            this.f8246h = z;
            this.f8247i = i2;
            this.f8248j = i3;
            this.v = Math.max(1, i2 >> 1);
            atomicReference.lazySet(w);
        }

        public boolean b() {
            if (this.n) {
                g.c.w.c.i<U> iVar = this.f8249k;
                if (iVar != null) {
                    iVar.clear();
                }
                return true;
            } else if (this.f8246h || this.f8251m.get() == null) {
                return false;
            } else {
                g.c.w.c.i<U> iVar2 = this.f8249k;
                if (iVar2 != null) {
                    iVar2.clear();
                }
                Throwable b = g.c.w.j.d.b(this.f8251m);
                if (b != g.c.w.j.d.a) {
                    this.f8244f.onError(b);
                }
                return true;
            }
        }

        public void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        @Override // m.c.c
        public void cancel() {
            g.c.w.c.i<U> iVar;
            a<?, ?>[] andSet;
            if (this.n) {
                return;
            }
            this.n = true;
            this.q.cancel();
            a<?, ?>[] aVarArr = this.o.get();
            a<?, ?>[] aVarArr2 = x;
            if (aVarArr != aVarArr2 && (andSet = this.o.getAndSet(aVarArr2)) != aVarArr2) {
                for (a<?, ?> aVar : andSet) {
                    Objects.requireNonNull(aVar);
                    SubscriptionHelper.cancel(aVar);
                }
                Throwable b = g.c.w.j.d.b(this.f8251m);
                if (b != null && b != g.c.w.j.d.a) {
                    f.n.a.n.i.L(b);
                }
            }
            if (getAndIncrement() != 0 || (iVar = this.f8249k) == null) {
                return;
            }
            iVar.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:121:0x018f, code lost:
            r24.t = r3;
            r24.s = r13[r3].f8236f;
            r3 = r16;
            r5 = 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.w.e.b.i.b.d():void");
        }

        public g.c.w.c.j<U> e() {
            g.c.w.c.i<U> iVar = this.f8249k;
            if (iVar == null) {
                if (this.f8247i == Integer.MAX_VALUE) {
                    iVar = new g.c.w.f.b<>(this.f8248j);
                } else {
                    iVar = new g.c.w.f.a<>(this.f8247i);
                }
                this.f8249k = iVar;
            }
            return iVar;
        }

        public void f(a<T, U> aVar) {
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
                    aVarArr2 = w;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                    System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.o.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // m.c.b
        public void onComplete() {
            if (this.f8250l) {
                return;
            }
            this.f8250l = true;
            c();
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (this.f8250l) {
                f.n.a.n.i.L(th);
            } else if (g.c.w.j.d.a(this.f8251m, th)) {
                this.f8250l = true;
                c();
            } else {
                f.n.a.n.i.L(th);
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8250l) {
                return;
            }
            try {
                m.c.a<? extends U> apply = this.f8245g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                m.c.a<? extends U> aVar = apply;
                boolean z = false;
                if (aVar instanceof Callable) {
                    try {
                        U u = (U) ((Callable) aVar).call();
                        if (u != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                long j2 = this.p.get();
                                g.c.w.c.j<U> jVar = this.f8249k;
                                if (j2 != 0 && (jVar == null || jVar.isEmpty())) {
                                    this.f8244f.onNext(u);
                                    if (j2 != Long.MAX_VALUE) {
                                        this.p.decrementAndGet();
                                    }
                                    if (this.f8247i != Integer.MAX_VALUE && !this.n) {
                                        int i2 = this.u + 1;
                                        this.u = i2;
                                        int i3 = this.v;
                                        if (i2 == i3) {
                                            this.u = 0;
                                            this.q.request(i3);
                                        }
                                    }
                                } else {
                                    if (jVar == null) {
                                        jVar = e();
                                    }
                                    if (!jVar.offer(u)) {
                                        onError(new IllegalStateException("Scalar queue full?!"));
                                        return;
                                    }
                                }
                                if (decrementAndGet() == 0) {
                                    return;
                                }
                            } else if (!e().offer(u)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            } else if (getAndIncrement() != 0) {
                                return;
                            }
                            d();
                            return;
                        } else if (this.f8247i == Integer.MAX_VALUE || this.n) {
                            return;
                        } else {
                            int i4 = this.u + 1;
                            this.u = i4;
                            int i5 = this.v;
                            if (i4 == i5) {
                                this.u = 0;
                                this.q.request(i5);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        g.c.w.j.d.a(this.f8251m, th);
                        c();
                        return;
                    }
                }
                long j3 = this.r;
                this.r = 1 + j3;
                a<?, ?> aVar2 = new a<>(this, j3);
                while (true) {
                    a<?, ?>[] aVarArr = this.o.get();
                    if (aVarArr == x) {
                        SubscriptionHelper.cancel(aVar2);
                        break;
                    }
                    int length = aVarArr.length;
                    a<?, ?>[] aVarArr2 = new a[length + 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    aVarArr2[length] = aVar2;
                    if (this.o.compareAndSet(aVarArr, aVarArr2)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    aVar.a(aVar2);
                }
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                this.q.cancel();
                onError(th2);
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.q, cVar)) {
                this.q = cVar;
                this.f8244f.onSubscribe(this);
                if (this.n) {
                    return;
                }
                int i2 = this.f8247i;
                if (i2 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i2);
                }
            }
        }

        @Override // m.c.c
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                f.n.a.n.i.b(this.p, j2);
                c();
            }
        }
    }

    public i(g.c.d<T> dVar, g.c.v.d<? super T, ? extends m.c.a<? extends U>> dVar2, boolean z, int i2, int i3) {
        super(dVar);
        this.f8232h = dVar2;
        this.f8233i = z;
        this.f8234j = i2;
        this.f8235k = i3;
    }

    @Override // g.c.d
    public void e(m.c.b<? super U> bVar) {
        if (f.n.a.n.i.h0(this.f8174g, bVar, this.f8232h)) {
            return;
        }
        this.f8174g.d(new b(bVar, this.f8232h, this.f8233i, this.f8234j, this.f8235k));
    }
}

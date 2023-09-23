package g.c.w.e.b;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableConcatMap.java */
/* loaded from: classes2.dex */
public final class b<T, R> extends g.c.w.e.b.a<T, R> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends m.c.a<? extends R>> f8175h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8176i;

    /* renamed from: j  reason: collision with root package name */
    public final ErrorMode f8177j;

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: classes2.dex */
    public static abstract class a<T, R> extends AtomicInteger implements g.c.g<T>, e<R>, m.c.c {

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends m.c.a<? extends R>> f8179g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8180h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8181i;

        /* renamed from: j  reason: collision with root package name */
        public m.c.c f8182j;

        /* renamed from: k  reason: collision with root package name */
        public int f8183k;

        /* renamed from: l  reason: collision with root package name */
        public g.c.w.c.j<T> f8184l;

        /* renamed from: m  reason: collision with root package name */
        public volatile boolean f8185m;
        public volatile boolean n;
        public volatile boolean p;
        public int q;

        /* renamed from: f  reason: collision with root package name */
        public final d<R> f8178f = new d<>(this);
        public final g.c.w.j.b o = new g.c.w.j.b();

        public a(g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar, int i2) {
            this.f8179g = dVar;
            this.f8180h = i2;
            this.f8181i = i2 - (i2 >> 2);
        }

        public abstract void d();

        public abstract void e();

        @Override // m.c.b
        public final void onComplete() {
            this.f8185m = true;
            d();
        }

        @Override // m.c.b
        public final void onNext(T t) {
            if (this.q != 2 && !this.f8184l.offer(t)) {
                this.f8182j.cancel();
                onError(new IllegalStateException("Queue full?!"));
                return;
            }
            d();
        }

        @Override // g.c.g, m.c.b
        public final void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8182j, cVar)) {
                this.f8182j = cVar;
                if (cVar instanceof g.c.w.c.g) {
                    g.c.w.c.g gVar = (g.c.w.c.g) cVar;
                    int requestFusion = gVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.q = requestFusion;
                        this.f8184l = gVar;
                        this.f8185m = true;
                        e();
                        d();
                        return;
                    } else if (requestFusion == 2) {
                        this.q = requestFusion;
                        this.f8184l = gVar;
                        e();
                        cVar.request(this.f8180h);
                        return;
                    }
                }
                this.f8184l = new g.c.w.f.a(this.f8180h);
                e();
                cVar.request(this.f8180h);
            }
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: g.c.w.e.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0209b<T, R> extends a<T, R> {
        public final m.c.b<? super R> r;
        public final boolean s;

        public C0209b(m.c.b<? super R> bVar, g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar, int i2, boolean z) {
            super(dVar, i2);
            this.r = bVar;
            this.s = z;
        }

        @Override // g.c.w.e.b.b.e
        public void b(R r) {
            this.r.onNext(r);
        }

        @Override // g.c.w.e.b.b.e
        public void c(Throwable th) {
            if (g.c.w.j.d.a(this.o, th)) {
                if (!this.s) {
                    this.f8182j.cancel();
                    this.f8185m = true;
                }
                this.p = false;
                d();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.c
        public void cancel() {
            if (this.n) {
                return;
            }
            this.n = true;
            this.f8178f.cancel();
            this.f8182j.cancel();
        }

        @Override // g.c.w.e.b.b.a
        public void d() {
            if (getAndIncrement() == 0) {
                while (!this.n) {
                    if (!this.p) {
                        boolean z = this.f8185m;
                        if (z && !this.s && this.o.get() != null) {
                            this.r.onError(g.c.w.j.d.b(this.o));
                            return;
                        }
                        try {
                            T poll = this.f8184l.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable b = g.c.w.j.d.b(this.o);
                                if (b != null) {
                                    this.r.onError(b);
                                    return;
                                } else {
                                    this.r.onComplete();
                                    return;
                                }
                            } else if (!z2) {
                                try {
                                    m.c.a<? extends R> apply = this.f8179g.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                    m.c.a<? extends R> aVar = apply;
                                    if (this.q != 1) {
                                        int i2 = this.f8183k + 1;
                                        if (i2 == this.f8181i) {
                                            this.f8183k = 0;
                                            this.f8182j.request(i2);
                                        } else {
                                            this.f8183k = i2;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) aVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.f8178f.f8582l) {
                                                this.r.onNext(call);
                                            } else {
                                                this.p = true;
                                                d<R> dVar = this.f8178f;
                                                dVar.e(new f(call, dVar));
                                            }
                                        } catch (Throwable th) {
                                            f.n.a.n.i.d0(th);
                                            this.f8182j.cancel();
                                            g.c.w.j.d.a(this.o, th);
                                            this.r.onError(g.c.w.j.d.b(this.o));
                                            return;
                                        }
                                    } else {
                                        this.p = true;
                                        aVar.a(this.f8178f);
                                    }
                                } catch (Throwable th2) {
                                    f.n.a.n.i.d0(th2);
                                    this.f8182j.cancel();
                                    g.c.w.j.d.a(this.o, th2);
                                    this.r.onError(g.c.w.j.d.b(this.o));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            f.n.a.n.i.d0(th3);
                            this.f8182j.cancel();
                            g.c.w.j.d.a(this.o, th3);
                            this.r.onError(g.c.w.j.d.b(this.o));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // g.c.w.e.b.b.a
        public void e() {
            this.r.onSubscribe(this);
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (g.c.w.j.d.a(this.o, th)) {
                this.f8185m = true;
                d();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.c
        public void request(long j2) {
            this.f8178f.request(j2);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: classes2.dex */
    public static final class c<T, R> extends a<T, R> {
        public final m.c.b<? super R> r;
        public final AtomicInteger s;

        public c(m.c.b<? super R> bVar, g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar, int i2) {
            super(dVar, i2);
            this.r = bVar;
            this.s = new AtomicInteger();
        }

        @Override // g.c.w.e.b.b.e
        public void b(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.r.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.r.onError(g.c.w.j.d.b(this.o));
            }
        }

        @Override // g.c.w.e.b.b.e
        public void c(Throwable th) {
            if (g.c.w.j.d.a(this.o, th)) {
                this.f8182j.cancel();
                if (getAndIncrement() == 0) {
                    this.r.onError(g.c.w.j.d.b(this.o));
                    return;
                }
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.c
        public void cancel() {
            if (this.n) {
                return;
            }
            this.n = true;
            this.f8178f.cancel();
            this.f8182j.cancel();
        }

        @Override // g.c.w.e.b.b.a
        public void d() {
            if (this.s.getAndIncrement() == 0) {
                while (!this.n) {
                    if (!this.p) {
                        boolean z = this.f8185m;
                        try {
                            T poll = this.f8184l.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.r.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    m.c.a<? extends R> apply = this.f8179g.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                    m.c.a<? extends R> aVar = apply;
                                    if (this.q != 1) {
                                        int i2 = this.f8183k + 1;
                                        if (i2 == this.f8181i) {
                                            this.f8183k = 0;
                                            this.f8182j.request(i2);
                                        } else {
                                            this.f8183k = i2;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) aVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.f8178f.f8582l) {
                                                if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.r.onNext(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.r.onError(g.c.w.j.d.b(this.o));
                                                        return;
                                                    }
                                                }
                                            } else {
                                                this.p = true;
                                                d<R> dVar = this.f8178f;
                                                dVar.e(new f(call, dVar));
                                            }
                                        } catch (Throwable th) {
                                            f.n.a.n.i.d0(th);
                                            this.f8182j.cancel();
                                            g.c.w.j.d.a(this.o, th);
                                            this.r.onError(g.c.w.j.d.b(this.o));
                                            return;
                                        }
                                    } else {
                                        this.p = true;
                                        aVar.a(this.f8178f);
                                    }
                                } catch (Throwable th2) {
                                    f.n.a.n.i.d0(th2);
                                    this.f8182j.cancel();
                                    g.c.w.j.d.a(this.o, th2);
                                    this.r.onError(g.c.w.j.d.b(this.o));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            f.n.a.n.i.d0(th3);
                            this.f8182j.cancel();
                            g.c.w.j.d.a(this.o, th3);
                            this.r.onError(g.c.w.j.d.b(this.o));
                            return;
                        }
                    }
                    if (this.s.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // g.c.w.e.b.b.a
        public void e() {
            this.r.onSubscribe(this);
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (g.c.w.j.d.a(this.o, th)) {
                this.f8178f.cancel();
                if (getAndIncrement() == 0) {
                    this.r.onError(g.c.w.j.d.b(this.o));
                    return;
                }
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.c
        public void request(long j2) {
            this.f8178f.request(j2);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: classes2.dex */
    public static final class d<R> extends g.c.w.i.e implements g.c.g<R> {

        /* renamed from: m  reason: collision with root package name */
        public final e<R> f8186m;
        public long n;

        public d(e<R> eVar) {
            this.f8186m = eVar;
        }

        @Override // m.c.b
        public void onComplete() {
            long j2 = this.n;
            if (j2 != 0) {
                this.n = 0L;
                d(j2);
            }
            a aVar = (a) this.f8186m;
            aVar.p = false;
            aVar.d();
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            long j2 = this.n;
            if (j2 != 0) {
                this.n = 0L;
                d(j2);
            }
            this.f8186m.c(th);
        }

        @Override // m.c.b
        public void onNext(R r) {
            this.n++;
            this.f8186m.b(r);
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            e(cVar);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: classes2.dex */
    public interface e<T> {
        void b(T t);

        void c(Throwable th);
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: classes2.dex */
    public static final class f<T> implements m.c.c {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super T> f8187f;

        /* renamed from: g  reason: collision with root package name */
        public final T f8188g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8189h;

        public f(T t, m.c.b<? super T> bVar) {
            this.f8188g = t;
            this.f8187f = bVar;
        }

        @Override // m.c.c
        public void cancel() {
        }

        @Override // m.c.c
        public void request(long j2) {
            if (j2 <= 0 || this.f8189h) {
                return;
            }
            this.f8189h = true;
            m.c.b<? super T> bVar = this.f8187f;
            bVar.onNext((T) this.f8188g);
            bVar.onComplete();
        }
    }

    public b(g.c.d<T> dVar, g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar2, int i2, ErrorMode errorMode) {
        super(dVar);
        this.f8175h = dVar2;
        this.f8176i = i2;
        this.f8177j = errorMode;
    }

    @Override // g.c.d
    public void e(m.c.b<? super R> bVar) {
        m.c.b<? super T> c0209b;
        if (f.n.a.n.i.h0(this.f8174g, bVar, this.f8175h)) {
            return;
        }
        g.c.d<T> dVar = this.f8174g;
        g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar2 = this.f8175h;
        int i2 = this.f8176i;
        int ordinal = this.f8177j.ordinal();
        if (ordinal == 1) {
            c0209b = new C0209b<>(bVar, dVar2, i2, false);
        } else if (ordinal != 2) {
            c0209b = new c<>(bVar, dVar2, i2);
        } else {
            c0209b = new C0209b<>(bVar, dVar2, i2, true);
        }
        dVar.a(c0209b);
    }
}

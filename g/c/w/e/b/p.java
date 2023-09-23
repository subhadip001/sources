package g.c.w.e.b;

import g.c.o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableObserveOn.java */
/* loaded from: classes2.dex */
public final class p<T> extends g.c.w.e.b.a<T, T> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.o f8292h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8293i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8294j;

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: classes2.dex */
    public static abstract class a<T> extends g.c.w.i.a<T> implements g.c.g<T>, Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final o.b f8295f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f8296g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8297h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8298i;

        /* renamed from: j  reason: collision with root package name */
        public final AtomicLong f8299j = new AtomicLong();

        /* renamed from: k  reason: collision with root package name */
        public m.c.c f8300k;

        /* renamed from: l  reason: collision with root package name */
        public g.c.w.c.j<T> f8301l;

        /* renamed from: m  reason: collision with root package name */
        public volatile boolean f8302m;
        public volatile boolean n;
        public Throwable o;
        public int p;
        public long q;
        public boolean r;

        public a(o.b bVar, boolean z, int i2) {
            this.f8295f = bVar;
            this.f8296g = z;
            this.f8297h = i2;
            this.f8298i = i2 - (i2 >> 2);
        }

        public final boolean b(boolean z, boolean z2, m.c.b<?> bVar) {
            if (this.f8302m) {
                this.f8301l.clear();
                return true;
            } else if (z) {
                if (this.f8296g) {
                    if (z2) {
                        Throwable th = this.o;
                        if (th != null) {
                            bVar.onError(th);
                        } else {
                            bVar.onComplete();
                        }
                        this.f8295f.dispose();
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.o;
                if (th2 != null) {
                    this.f8301l.clear();
                    bVar.onError(th2);
                    this.f8295f.dispose();
                    return true;
                } else if (z2) {
                    bVar.onComplete();
                    this.f8295f.dispose();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public abstract void c();

        @Override // m.c.c
        public final void cancel() {
            if (this.f8302m) {
                return;
            }
            this.f8302m = true;
            this.f8300k.cancel();
            this.f8295f.dispose();
            if (getAndIncrement() == 0) {
                this.f8301l.clear();
            }
        }

        @Override // g.c.w.c.j
        public final void clear() {
            this.f8301l.clear();
        }

        public abstract void d();

        public abstract void e();

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f8295f.b(this);
        }

        @Override // g.c.w.c.j
        public final boolean isEmpty() {
            return this.f8301l.isEmpty();
        }

        @Override // m.c.b
        public final void onComplete() {
            if (this.n) {
                return;
            }
            this.n = true;
            f();
        }

        @Override // m.c.b
        public final void onError(Throwable th) {
            if (this.n) {
                f.n.a.n.i.L(th);
                return;
            }
            this.o = th;
            this.n = true;
            f();
        }

        @Override // m.c.b
        public final void onNext(T t) {
            if (this.n) {
                return;
            }
            if (this.p == 2) {
                f();
                return;
            }
            if (!this.f8301l.offer(t)) {
                this.f8300k.cancel();
                this.o = new MissingBackpressureException("Queue is full?!");
                this.n = true;
            }
            f();
        }

        @Override // m.c.c
        public final void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                f.n.a.n.i.b(this.f8299j, j2);
                f();
            }
        }

        @Override // g.c.w.c.f
        public final int requestFusion(int i2) {
            if ((i2 & 2) != 0) {
                this.r = true;
                return 2;
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.r) {
                d();
            } else if (this.p == 1) {
                e();
            } else {
                c();
            }
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends a<T> {
        public final g.c.w.c.a<? super T> s;
        public long t;

        public b(g.c.w.c.a<? super T> aVar, o.b bVar, boolean z, int i2) {
            super(bVar, z, i2);
            this.s = aVar;
        }

        @Override // g.c.w.e.b.p.a
        public void c() {
            int i2;
            g.c.w.c.a<? super T> aVar = this.s;
            g.c.w.c.j<T> jVar = this.f8301l;
            long j2 = this.q;
            long j3 = this.t;
            int i3 = 1;
            while (true) {
                long j4 = this.f8299j.get();
                while (true) {
                    i2 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    }
                    boolean z = this.n;
                    try {
                        Object obj = (T) jVar.poll();
                        boolean z2 = obj == null;
                        if (b(z, z2, aVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (aVar.a(obj)) {
                            j2++;
                        }
                        j3++;
                        if (j3 == this.f8298i) {
                            this.f8300k.request(j3);
                            j3 = 0;
                        }
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        this.f8300k.cancel();
                        jVar.clear();
                        aVar.onError(th);
                        this.f8295f.dispose();
                        return;
                    }
                }
                if (i2 == 0 && b(this.n, jVar.isEmpty(), aVar)) {
                    return;
                }
                int i4 = get();
                if (i3 == i4) {
                    this.q = j2;
                    this.t = j3;
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    i3 = i4;
                }
            }
        }

        @Override // g.c.w.e.b.p.a
        public void d() {
            int i2 = 1;
            while (!this.f8302m) {
                boolean z = this.n;
                this.s.onNext(null);
                if (z) {
                    Throwable th = this.o;
                    if (th != null) {
                        this.s.onError(th);
                    } else {
                        this.s.onComplete();
                    }
                    this.f8295f.dispose();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // g.c.w.e.b.p.a
        public void e() {
            g.c.w.c.a<? super T> aVar = this.s;
            g.c.w.c.j<T> jVar = this.f8301l;
            long j2 = this.q;
            int i2 = 1;
            while (true) {
                long j3 = this.f8299j.get();
                while (j2 != j3) {
                    try {
                        Object obj = (T) jVar.poll();
                        if (this.f8302m) {
                            return;
                        }
                        if (obj == null) {
                            aVar.onComplete();
                            this.f8295f.dispose();
                            return;
                        } else if (aVar.a(obj)) {
                            j2++;
                        }
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        this.f8300k.cancel();
                        aVar.onError(th);
                        this.f8295f.dispose();
                        return;
                    }
                }
                if (this.f8302m) {
                    return;
                }
                if (jVar.isEmpty()) {
                    aVar.onComplete();
                    this.f8295f.dispose();
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.q = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8300k, cVar)) {
                this.f8300k = cVar;
                if (cVar instanceof g.c.w.c.g) {
                    g.c.w.c.g gVar = (g.c.w.c.g) cVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.p = 1;
                        this.f8301l = gVar;
                        this.n = true;
                        this.s.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.p = 2;
                        this.f8301l = gVar;
                        this.s.onSubscribe(this);
                        cVar.request(this.f8297h);
                        return;
                    }
                }
                this.f8301l = new g.c.w.f.a(this.f8297h);
                this.s.onSubscribe(this);
                cVar.request(this.f8297h);
            }
        }

        @Override // g.c.w.c.j
        public T poll() {
            T poll = this.f8301l.poll();
            if (poll != null && this.p != 1) {
                long j2 = this.t + 1;
                if (j2 == this.f8298i) {
                    this.t = 0L;
                    this.f8300k.request(j2);
                } else {
                    this.t = j2;
                }
            }
            return poll;
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: classes2.dex */
    public static final class c<T> extends a<T> implements g.c.g<T> {
        public final m.c.b<? super T> s;

        public c(m.c.b<? super T> bVar, o.b bVar2, boolean z, int i2) {
            super(bVar2, z, i2);
            this.s = bVar;
        }

        @Override // g.c.w.e.b.p.a
        public void c() {
            int i2;
            m.c.b<? super T> bVar = this.s;
            g.c.w.c.j<T> jVar = this.f8301l;
            long j2 = this.q;
            int i3 = 1;
            while (true) {
                long j3 = this.f8299j.get();
                while (true) {
                    i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    }
                    boolean z = this.n;
                    try {
                        Object obj = (T) jVar.poll();
                        boolean z2 = obj == null;
                        if (b(z, z2, bVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        bVar.onNext(obj);
                        j2++;
                        if (j2 == this.f8298i) {
                            if (j3 != Long.MAX_VALUE) {
                                j3 = this.f8299j.addAndGet(-j2);
                            }
                            this.f8300k.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        this.f8300k.cancel();
                        jVar.clear();
                        bVar.onError(th);
                        this.f8295f.dispose();
                        return;
                    }
                }
                if (i2 == 0 && b(this.n, jVar.isEmpty(), bVar)) {
                    return;
                }
                int i4 = get();
                if (i3 == i4) {
                    this.q = j2;
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    i3 = i4;
                }
            }
        }

        @Override // g.c.w.e.b.p.a
        public void d() {
            int i2 = 1;
            while (!this.f8302m) {
                boolean z = this.n;
                this.s.onNext(null);
                if (z) {
                    Throwable th = this.o;
                    if (th != null) {
                        this.s.onError(th);
                    } else {
                        this.s.onComplete();
                    }
                    this.f8295f.dispose();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // g.c.w.e.b.p.a
        public void e() {
            m.c.b<? super T> bVar = this.s;
            g.c.w.c.j<T> jVar = this.f8301l;
            long j2 = this.q;
            int i2 = 1;
            while (true) {
                long j3 = this.f8299j.get();
                while (j2 != j3) {
                    try {
                        Object obj = (T) jVar.poll();
                        if (this.f8302m) {
                            return;
                        }
                        if (obj == null) {
                            bVar.onComplete();
                            this.f8295f.dispose();
                            return;
                        }
                        bVar.onNext(obj);
                        j2++;
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        this.f8300k.cancel();
                        bVar.onError(th);
                        this.f8295f.dispose();
                        return;
                    }
                }
                if (this.f8302m) {
                    return;
                }
                if (jVar.isEmpty()) {
                    bVar.onComplete();
                    this.f8295f.dispose();
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.q = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8300k, cVar)) {
                this.f8300k = cVar;
                if (cVar instanceof g.c.w.c.g) {
                    g.c.w.c.g gVar = (g.c.w.c.g) cVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.p = 1;
                        this.f8301l = gVar;
                        this.n = true;
                        this.s.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.p = 2;
                        this.f8301l = gVar;
                        this.s.onSubscribe(this);
                        cVar.request(this.f8297h);
                        return;
                    }
                }
                this.f8301l = new g.c.w.f.a(this.f8297h);
                this.s.onSubscribe(this);
                cVar.request(this.f8297h);
            }
        }

        @Override // g.c.w.c.j
        public T poll() {
            T poll = this.f8301l.poll();
            if (poll != null && this.p != 1) {
                long j2 = this.q + 1;
                if (j2 == this.f8298i) {
                    this.q = 0L;
                    this.f8300k.request(j2);
                } else {
                    this.q = j2;
                }
            }
            return poll;
        }
    }

    public p(g.c.d<T> dVar, g.c.o oVar, boolean z, int i2) {
        super(dVar);
        this.f8292h = oVar;
        this.f8293i = z;
        this.f8294j = i2;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        o.b a2 = this.f8292h.a();
        if (bVar instanceof g.c.w.c.a) {
            this.f8174g.d(new b((g.c.w.c.a) bVar, a2, this.f8293i, this.f8294j));
        } else {
            this.f8174g.d(new c(bVar, a2, this.f8293i, this.f8294j));
        }
    }
}

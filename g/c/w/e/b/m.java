package g.c.w.e.b;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: FlowableFromIterable.java */
/* loaded from: classes2.dex */
public final class m<T> extends g.c.d<T> {

    /* renamed from: g  reason: collision with root package name */
    public final Iterable<? extends T> f8280g;

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: classes2.dex */
    public static abstract class a<T> extends g.c.w.i.b<T> {

        /* renamed from: f  reason: collision with root package name */
        public Iterator<? extends T> f8281f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f8282g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8283h;

        public a(Iterator<? extends T> it) {
            this.f8281f = it;
        }

        public abstract void a();

        public abstract void b(long j2);

        @Override // m.c.c
        public final void cancel() {
            this.f8282g = true;
        }

        @Override // g.c.w.c.j
        public final void clear() {
            this.f8281f = null;
        }

        @Override // g.c.w.c.j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f8281f;
            return it == null || !it.hasNext();
        }

        @Override // g.c.w.c.j
        public final T poll() {
            Iterator<? extends T> it = this.f8281f;
            if (it == null) {
                return null;
            }
            if (!this.f8283h) {
                this.f8283h = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f8281f.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // m.c.c
        public final void request(long j2) {
            if (SubscriptionHelper.validate(j2) && f.n.a.n.i.b(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j2);
                }
            }
        }

        @Override // g.c.w.c.f
        public final int requestFusion(int i2) {
            return i2 & 1;
        }
    }

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends a<T> {

        /* renamed from: i  reason: collision with root package name */
        public final g.c.w.c.a<? super T> f8284i;

        public b(g.c.w.c.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f8284i = aVar;
        }

        @Override // g.c.w.e.b.m.a
        public void a() {
            Iterator<? extends T> it = this.f8281f;
            g.c.w.c.a<? super T> aVar = this.f8284i;
            while (!this.f8282g) {
                try {
                    Object obj = (T) it.next();
                    if (this.f8282g) {
                        return;
                    }
                    if (obj == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.a(obj);
                    if (this.f8282g) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f8282g) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        aVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    f.n.a.n.i.d0(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        @Override // g.c.w.e.b.m.a
        public void b(long j2) {
            Iterator<? extends T> it = this.f8281f;
            g.c.w.c.a<? super T> aVar = this.f8284i;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 != j2) {
                        if (this.f8282g) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.f8282g) {
                                return;
                            }
                            if (obj == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean a = aVar.a(obj);
                            if (this.f8282g) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f8282g) {
                                        return;
                                    }
                                    aVar.onComplete();
                                    return;
                                } else if (a) {
                                    j3++;
                                }
                            } catch (Throwable th) {
                                f.n.a.n.i.d0(th);
                                aVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            f.n.a.n.i.d0(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } else {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    }
                }
            } while (j2 != 0);
        }
    }

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: classes2.dex */
    public static final class c<T> extends a<T> {

        /* renamed from: i  reason: collision with root package name */
        public final m.c.b<? super T> f8285i;

        public c(m.c.b<? super T> bVar, Iterator<? extends T> it) {
            super(it);
            this.f8285i = bVar;
        }

        @Override // g.c.w.e.b.m.a
        public void a() {
            Iterator<? extends T> it = this.f8281f;
            m.c.b<? super T> bVar = this.f8285i;
            while (!this.f8282g) {
                try {
                    Object obj = (T) it.next();
                    if (this.f8282g) {
                        return;
                    }
                    if (obj == null) {
                        bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bVar.onNext(obj);
                    if (this.f8282g) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f8282g) {
                                return;
                            }
                            bVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        f.n.a.n.i.d0(th);
                        bVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    f.n.a.n.i.d0(th2);
                    bVar.onError(th2);
                    return;
                }
            }
        }

        @Override // g.c.w.e.b.m.a
        public void b(long j2) {
            Iterator<? extends T> it = this.f8281f;
            m.c.b<? super T> bVar = this.f8285i;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 != j2) {
                        if (this.f8282g) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.f8282g) {
                                return;
                            }
                            if (obj == null) {
                                bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            bVar.onNext(obj);
                            if (this.f8282g) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f8282g) {
                                        return;
                                    }
                                    bVar.onComplete();
                                    return;
                                }
                                j3++;
                            } catch (Throwable th) {
                                f.n.a.n.i.d0(th);
                                bVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            f.n.a.n.i.d0(th2);
                            bVar.onError(th2);
                            return;
                        }
                    } else {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    }
                }
            } while (j2 != 0);
        }
    }

    public m(Iterable<? extends T> iterable) {
        this.f8280g = iterable;
    }

    public static <T> void f(m.c.b<? super T> bVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(bVar);
            } else if (bVar instanceof g.c.w.c.a) {
                bVar.onSubscribe(new b((g.c.w.c.a) bVar, it));
            } else {
                bVar.onSubscribe(new c(bVar, it));
            }
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            EmptySubscription.error(th, bVar);
        }
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        try {
            f(bVar, this.f8280g.iterator());
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            EmptySubscription.error(th, bVar);
        }
    }
}

package g.c.w.e.b;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* loaded from: classes2.dex */
public final class q<T> extends g.c.w.e.b.a<T, T> {

    /* renamed from: h  reason: collision with root package name */
    public final int f8303h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8304i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8305j;

    /* renamed from: k  reason: collision with root package name */
    public final g.c.v.a f8306k;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.i.a<T> implements g.c.g<T> {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super T> f8307f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.w.c.i<T> f8308g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8309h;

        /* renamed from: i  reason: collision with root package name */
        public final g.c.v.a f8310i;

        /* renamed from: j  reason: collision with root package name */
        public m.c.c f8311j;

        /* renamed from: k  reason: collision with root package name */
        public volatile boolean f8312k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f8313l;

        /* renamed from: m  reason: collision with root package name */
        public Throwable f8314m;
        public final AtomicLong n = new AtomicLong();
        public boolean o;

        public a(m.c.b<? super T> bVar, int i2, boolean z, boolean z2, g.c.v.a aVar) {
            g.c.w.c.i<T> aVar2;
            this.f8307f = bVar;
            this.f8310i = aVar;
            this.f8309h = z2;
            if (z) {
                aVar2 = new g.c.w.f.b<>(i2);
            } else {
                aVar2 = new g.c.w.f.a<>(i2);
            }
            this.f8308g = aVar2;
        }

        public boolean b(boolean z, boolean z2, m.c.b<? super T> bVar) {
            if (this.f8312k) {
                this.f8308g.clear();
                return true;
            } else if (z) {
                if (this.f8309h) {
                    if (z2) {
                        Throwable th = this.f8314m;
                        if (th != null) {
                            bVar.onError(th);
                        } else {
                            bVar.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.f8314m;
                if (th2 != null) {
                    this.f8308g.clear();
                    bVar.onError(th2);
                    return true;
                } else if (z2) {
                    bVar.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public void c() {
            int i2;
            if (getAndIncrement() == 0) {
                g.c.w.c.i<T> iVar = this.f8308g;
                m.c.b<? super T> bVar = this.f8307f;
                int i3 = 1;
                while (!b(this.f8313l, iVar.isEmpty(), bVar)) {
                    long j2 = this.n.get();
                    long j3 = 0;
                    while (true) {
                        i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                        if (i2 == 0) {
                            break;
                        }
                        boolean z = this.f8313l;
                        Object obj = (T) iVar.poll();
                        boolean z2 = obj == null;
                        if (b(z, z2, bVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        bVar.onNext(obj);
                        j3++;
                    }
                    if (i2 == 0 && b(this.f8313l, iVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.n.addAndGet(-j3);
                    }
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // m.c.c
        public void cancel() {
            if (this.f8312k) {
                return;
            }
            this.f8312k = true;
            this.f8311j.cancel();
            if (getAndIncrement() == 0) {
                this.f8308g.clear();
            }
        }

        @Override // g.c.w.c.j
        public void clear() {
            this.f8308g.clear();
        }

        @Override // g.c.w.c.j
        public boolean isEmpty() {
            return this.f8308g.isEmpty();
        }

        @Override // m.c.b
        public void onComplete() {
            this.f8313l = true;
            if (this.o) {
                this.f8307f.onComplete();
            } else {
                c();
            }
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            this.f8314m = th;
            this.f8313l = true;
            if (this.o) {
                this.f8307f.onError(th);
            } else {
                c();
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (!this.f8308g.offer(t)) {
                this.f8311j.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f8310i.run();
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.o) {
                this.f8307f.onNext(null);
            } else {
                c();
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8311j, cVar)) {
                this.f8311j = cVar;
                this.f8307f.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // g.c.w.c.j
        public T poll() {
            return this.f8308g.poll();
        }

        @Override // m.c.c
        public void request(long j2) {
            if (this.o || !SubscriptionHelper.validate(j2)) {
                return;
            }
            f.n.a.n.i.b(this.n, j2);
            c();
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            if ((i2 & 2) != 0) {
                this.o = true;
                return 2;
            }
            return 0;
        }
    }

    public q(g.c.d<T> dVar, int i2, boolean z, boolean z2, g.c.v.a aVar) {
        super(dVar);
        this.f8303h = i2;
        this.f8304i = z;
        this.f8305j = z2;
        this.f8306k = aVar;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        this.f8174g.d(new a(bVar, this.f8303h, this.f8304i, this.f8305j, this.f8306k));
    }
}

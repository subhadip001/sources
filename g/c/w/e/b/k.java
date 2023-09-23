package g.c.w.e.b;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableFlattenIterable.java */
/* loaded from: classes2.dex */
public final class k<T, R> extends g.c.w.e.b.a<T, R> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends Iterable<? extends R>> f8264h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8265i;

    /* compiled from: FlowableFlattenIterable.java */
    /* loaded from: classes2.dex */
    public static final class a<T, R> extends g.c.w.i.a<R> implements g.c.g<T> {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super R> f8266f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends Iterable<? extends R>> f8267g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8268h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8269i;

        /* renamed from: k  reason: collision with root package name */
        public m.c.c f8271k;

        /* renamed from: l  reason: collision with root package name */
        public g.c.w.c.j<T> f8272l;

        /* renamed from: m  reason: collision with root package name */
        public volatile boolean f8273m;
        public volatile boolean n;
        public Iterator<? extends R> p;
        public int q;
        public int r;
        public final AtomicReference<Throwable> o = new AtomicReference<>();

        /* renamed from: j  reason: collision with root package name */
        public final AtomicLong f8270j = new AtomicLong();

        public a(m.c.b<? super R> bVar, g.c.v.d<? super T, ? extends Iterable<? extends R>> dVar, int i2) {
            this.f8266f = bVar;
            this.f8267g = dVar;
            this.f8268h = i2;
            this.f8269i = i2 - (i2 >> 2);
        }

        public boolean b(boolean z, boolean z2, m.c.b<?> bVar, g.c.w.c.j<?> jVar) {
            if (this.n) {
                this.p = null;
                jVar.clear();
                return true;
            } else if (z) {
                if (this.o.get() == null) {
                    if (z2) {
                        bVar.onComplete();
                        return true;
                    }
                    return false;
                }
                Throwable b = g.c.w.j.d.b(this.o);
                this.p = null;
                jVar.clear();
                bVar.onError(b);
                return true;
            } else {
                return false;
            }
        }

        public void c(boolean z) {
            if (z) {
                int i2 = this.q + 1;
                if (i2 == this.f8269i) {
                    this.q = 0;
                    this.f8271k.request(i2);
                    return;
                }
                this.q = i2;
            }
        }

        @Override // m.c.c
        public void cancel() {
            if (this.n) {
                return;
            }
            this.n = true;
            this.f8271k.cancel();
            if (getAndIncrement() == 0) {
                this.f8272l.clear();
            }
        }

        @Override // g.c.w.c.j
        public void clear() {
            this.p = null;
            this.f8272l.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
            if (r13 != r9) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
            r5 = r18.f8273m;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
            if (r3.isEmpty() == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
            if (r6 != null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
            r15 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
            r15 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
            if (b(r5, r15, r2, r3) == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
            if (r13 == 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
            if (r9 == Long.MAX_VALUE) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
            r18.f8270j.addAndGet(-r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
            if (r6 != null) goto L73;
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
            throw new UnsupportedOperationException("Method not decompiled: g.c.w.e.b.k.a.d():void");
        }

        @Override // g.c.w.c.j
        public boolean isEmpty() {
            return this.p == null && this.f8272l.isEmpty();
        }

        @Override // m.c.b
        public void onComplete() {
            if (this.f8273m) {
                return;
            }
            this.f8273m = true;
            d();
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (!this.f8273m && g.c.w.j.d.a(this.o, th)) {
                this.f8273m = true;
                d();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8273m) {
                return;
            }
            if (this.r == 0 && !this.f8272l.offer(t)) {
                onError(new MissingBackpressureException("Queue is full?!"));
            } else {
                d();
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8271k, cVar)) {
                this.f8271k = cVar;
                if (cVar instanceof g.c.w.c.g) {
                    g.c.w.c.g gVar = (g.c.w.c.g) cVar;
                    int requestFusion = gVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.r = requestFusion;
                        this.f8272l = gVar;
                        this.f8273m = true;
                        this.f8266f.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.r = requestFusion;
                        this.f8272l = gVar;
                        this.f8266f.onSubscribe(this);
                        cVar.request(this.f8268h);
                        return;
                    }
                }
                this.f8272l = new g.c.w.f.a(this.f8268h);
                this.f8266f.onSubscribe(this);
                cVar.request(this.f8268h);
            }
        }

        @Override // g.c.w.c.j
        public R poll() {
            Iterator<? extends R> it = this.p;
            while (true) {
                if (it == null) {
                    T poll = this.f8272l.poll();
                    if (poll != null) {
                        it = this.f8267g.apply(poll).iterator();
                        if (it.hasNext()) {
                            this.p = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.p = null;
            }
            return next;
        }

        @Override // m.c.c
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                f.n.a.n.i.b(this.f8270j, j2);
                d();
            }
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return ((i2 & 1) == 0 || this.r != 1) ? 0 : 1;
        }
    }

    public k(g.c.d<T> dVar, g.c.v.d<? super T, ? extends Iterable<? extends R>> dVar2, int i2) {
        super(dVar);
        this.f8264h = dVar2;
        this.f8265i = i2;
    }

    @Override // g.c.d
    public void e(m.c.b<? super R> bVar) {
        g.c.d<T> dVar = this.f8174g;
        if (dVar instanceof Callable) {
            try {
                Object call = ((Callable) dVar).call();
                if (call == null) {
                    EmptySubscription.complete(bVar);
                    return;
                }
                try {
                    m.f(bVar, this.f8264h.apply(call).iterator());
                    return;
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    EmptySubscription.error(th, bVar);
                    return;
                }
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                EmptySubscription.error(th2, bVar);
                return;
            }
        }
        dVar.d(new a(bVar, this.f8264h, this.f8265i));
    }
}

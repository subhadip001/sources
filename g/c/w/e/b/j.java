package g.c.w.e.b;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableFlatMapMaybe.java */
/* loaded from: classes2.dex */
public final class j<T, R> extends g.c.w.e.b.a<T, R> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends g.c.k<? extends R>> f8252h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8253i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8254j;

    /* compiled from: FlowableFlatMapMaybe.java */
    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicInteger implements g.c.g<T>, m.c.c {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super R> f8255f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f8256g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8257h;

        /* renamed from: m  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends g.c.k<? extends R>> f8262m;
        public m.c.c o;
        public volatile boolean p;

        /* renamed from: i  reason: collision with root package name */
        public final AtomicLong f8258i = new AtomicLong();

        /* renamed from: j  reason: collision with root package name */
        public final g.c.t.a f8259j = new g.c.t.a();

        /* renamed from: l  reason: collision with root package name */
        public final g.c.w.j.b f8261l = new g.c.w.j.b();

        /* renamed from: k  reason: collision with root package name */
        public final AtomicInteger f8260k = new AtomicInteger(1);
        public final AtomicReference<g.c.w.f.b<R>> n = new AtomicReference<>();

        /* compiled from: FlowableFlatMapMaybe.java */
        /* renamed from: g.c.w.e.b.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0211a extends AtomicReference<g.c.t.b> implements g.c.j<R>, g.c.t.b {
            public C0211a() {
            }

            @Override // g.c.t.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // g.c.j
            public void onComplete() {
                a aVar = a.this;
                aVar.f8259j.c(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z = aVar.f8260k.decrementAndGet() == 0;
                        g.c.w.f.b<R> bVar = aVar.n.get();
                        if (z && (bVar == null || bVar.isEmpty())) {
                            Throwable b = g.c.w.j.d.b(aVar.f8261l);
                            if (b != null) {
                                aVar.f8255f.onError(b);
                                return;
                            } else {
                                aVar.f8255f.onComplete();
                                return;
                            }
                        }
                        if (aVar.f8257h != Integer.MAX_VALUE) {
                            aVar.o.request(1L);
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                        aVar.d();
                        return;
                    }
                }
                aVar.f8260k.decrementAndGet();
                if (aVar.f8257h != Integer.MAX_VALUE) {
                    aVar.o.request(1L);
                }
                aVar.c();
            }

            @Override // g.c.j
            public void onError(Throwable th) {
                a aVar = a.this;
                aVar.f8259j.c(this);
                if (g.c.w.j.d.a(aVar.f8261l, th)) {
                    if (!aVar.f8256g) {
                        aVar.o.cancel();
                        aVar.f8259j.dispose();
                    } else if (aVar.f8257h != Integer.MAX_VALUE) {
                        aVar.o.request(1L);
                    }
                    aVar.f8260k.decrementAndGet();
                    aVar.c();
                    return;
                }
                f.n.a.n.i.L(th);
            }

            @Override // g.c.j
            public void onSubscribe(g.c.t.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // g.c.j
            public void onSuccess(R r) {
                a aVar = a.this;
                aVar.f8259j.c(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z = aVar.f8260k.decrementAndGet() == 0;
                        if (aVar.f8258i.get() != 0) {
                            aVar.f8255f.onNext(r);
                            g.c.w.f.b<R> bVar = aVar.n.get();
                            if (z && (bVar == null || bVar.isEmpty())) {
                                Throwable b = g.c.w.j.d.b(aVar.f8261l);
                                if (b != null) {
                                    aVar.f8255f.onError(b);
                                    return;
                                } else {
                                    aVar.f8255f.onComplete();
                                    return;
                                }
                            }
                            f.n.a.n.i.O(aVar.f8258i, 1L);
                            if (aVar.f8257h != Integer.MAX_VALUE) {
                                aVar.o.request(1L);
                            }
                        } else {
                            g.c.w.f.b<R> e2 = aVar.e();
                            synchronized (e2) {
                                e2.offer(r);
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                        aVar.d();
                    }
                }
                g.c.w.f.b<R> e3 = aVar.e();
                synchronized (e3) {
                    e3.offer(r);
                }
                aVar.f8260k.decrementAndGet();
                if (aVar.getAndIncrement() != 0) {
                    return;
                }
                aVar.d();
            }
        }

        public a(m.c.b<? super R> bVar, g.c.v.d<? super T, ? extends g.c.k<? extends R>> dVar, boolean z, int i2) {
            this.f8255f = bVar;
            this.f8262m = dVar;
            this.f8256g = z;
            this.f8257h = i2;
        }

        public void b() {
            g.c.w.f.b<R> bVar = this.n.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        public void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        @Override // m.c.c
        public void cancel() {
            this.p = true;
            this.o.cancel();
            this.f8259j.dispose();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
            if (r13 != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
            if (r17.p == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
            b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
            if (r17.f8256g != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
            if (r17.f8261l.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
            r2 = g.c.w.j.d.b(r17.f8261l);
            b();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
            if (r2.get() != 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
            if (r7 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
            if (r7.isEmpty() == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
            if (r6 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
            if (r12 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
            r2 = g.c.w.j.d.b(r17.f8261l);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
            if (r10 == 0) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
            f.n.a.n.i.O(r17.f8258i, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
            if (r17.f8257h == Integer.MAX_VALUE) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
            r17.o.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.w.e.b.j.a.d():void");
        }

        public g.c.w.f.b<R> e() {
            g.c.w.f.b<R> bVar;
            do {
                g.c.w.f.b<R> bVar2 = this.n.get();
                if (bVar2 != null) {
                    return bVar2;
                }
                bVar = new g.c.w.f.b<>(g.c.d.f8128f);
            } while (!this.n.compareAndSet(null, bVar));
            return bVar;
        }

        @Override // m.c.b
        public void onComplete() {
            this.f8260k.decrementAndGet();
            c();
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            this.f8260k.decrementAndGet();
            if (g.c.w.j.d.a(this.f8261l, th)) {
                if (!this.f8256g) {
                    this.f8259j.dispose();
                }
                c();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.b
        public void onNext(T t) {
            try {
                g.c.k<? extends R> apply = this.f8262m.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                g.c.k<? extends R> kVar = apply;
                this.f8260k.getAndIncrement();
                C0211a c0211a = new C0211a();
                if (this.p || !this.f8259j.b(c0211a)) {
                    return;
                }
                kVar.a(c0211a);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.o.cancel();
                onError(th);
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.o, cVar)) {
                this.o = cVar;
                this.f8255f.onSubscribe(this);
                int i2 = this.f8257h;
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
                f.n.a.n.i.b(this.f8258i, j2);
                c();
            }
        }
    }

    public j(g.c.d<T> dVar, g.c.v.d<? super T, ? extends g.c.k<? extends R>> dVar2, boolean z, int i2) {
        super(dVar);
        this.f8252h = dVar2;
        this.f8253i = z;
        this.f8254j = i2;
    }

    @Override // g.c.d
    public void e(m.c.b<? super R> bVar) {
        this.f8174g.d(new a(bVar, this.f8252h, this.f8253i, this.f8254j));
    }
}

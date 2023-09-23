package g.c.w.e.b;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowablePublish.java */
/* loaded from: classes2.dex */
public final class r<T> extends g.c.u.a<T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.d<T> f8315g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<c<T>> f8316h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8317i;

    /* renamed from: j  reason: collision with root package name */
    public final m.c.a<T> f8318j;

    /* compiled from: FlowablePublish.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements m.c.a<T> {

        /* renamed from: f  reason: collision with root package name */
        public final AtomicReference<c<T>> f8319f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8320g;

        public a(AtomicReference<c<T>> atomicReference, int i2) {
            this.f8319f = atomicReference;
            this.f8320g = i2;
        }

        @Override // m.c.a
        public void a(m.c.b<? super T> bVar) {
            c<T> cVar;
            boolean z;
            b<T> bVar2 = new b<>(bVar);
            bVar.onSubscribe(bVar2);
            while (true) {
                cVar = this.f8319f.get();
                if (cVar == null || cVar.d()) {
                    c<T> cVar2 = new c<>(this.f8319f, this.f8320g);
                    if (this.f8319f.compareAndSet(cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    b<T>[] bVarArr = cVar.f8326h.get();
                    z = false;
                    if (bVarArr != c.o) {
                        int length = bVarArr.length;
                        b<T>[] bVarArr2 = new b[length + 1];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                        bVarArr2[length] = bVar2;
                        if (cVar.f8326h.compareAndSet(bVarArr, bVarArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (bVar2.get() == Long.MIN_VALUE) {
                cVar.e(bVar2);
            } else {
                bVar2.f8322g = cVar;
            }
            cVar.c();
        }
    }

    /* compiled from: FlowablePublish.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends AtomicLong implements m.c.c {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super T> f8321f;

        /* renamed from: g  reason: collision with root package name */
        public volatile c<T> f8322g;

        /* renamed from: h  reason: collision with root package name */
        public long f8323h;

        public b(m.c.b<? super T> bVar) {
            this.f8321f = bVar;
        }

        @Override // m.c.c
        public void cancel() {
            c<T> cVar;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (cVar = this.f8322g) == null) {
                return;
            }
            cVar.e(this);
            cVar.c();
        }

        @Override // m.c.c
        public void request(long j2) {
            long j3;
            if (SubscriptionHelper.validate(j2)) {
                do {
                    j3 = get();
                    if (j3 != Long.MIN_VALUE && j3 != Long.MAX_VALUE) {
                    }
                } while (!compareAndSet(j3, f.n.a.n.i.c(j3, j2)));
                c<T> cVar = this.f8322g;
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
    }

    /* compiled from: FlowablePublish.java */
    /* loaded from: classes2.dex */
    public static final class c<T> extends AtomicInteger implements g.c.g<T>, g.c.t.b {
        public static final b[] n = new b[0];
        public static final b[] o = new b[0];

        /* renamed from: f  reason: collision with root package name */
        public final AtomicReference<c<T>> f8324f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8325g;

        /* renamed from: k  reason: collision with root package name */
        public volatile Object f8329k;

        /* renamed from: l  reason: collision with root package name */
        public int f8330l;

        /* renamed from: m  reason: collision with root package name */
        public volatile g.c.w.c.j<T> f8331m;

        /* renamed from: j  reason: collision with root package name */
        public final AtomicReference<m.c.c> f8328j = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        public final AtomicReference<b<T>[]> f8326h = new AtomicReference<>(n);

        /* renamed from: i  reason: collision with root package name */
        public final AtomicBoolean f8327i = new AtomicBoolean();

        public c(AtomicReference<c<T>> atomicReference, int i2) {
            this.f8324f = atomicReference;
            this.f8325g = i2;
        }

        public boolean b(Object obj, boolean z) {
            int i2 = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    this.f8324f.compareAndSet(this, null);
                    b<T>[] andSet = this.f8326h.getAndSet(o);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i2 < length) {
                            andSet[i2].f8321f.onError(error);
                            i2++;
                        }
                    } else {
                        f.n.a.n.i.L(error);
                    }
                    return true;
                } else if (z) {
                    this.f8324f.compareAndSet(this, null);
                    b<T>[] andSet2 = this.f8326h.getAndSet(o);
                    int length2 = andSet2.length;
                    while (i2 < length2) {
                        andSet2[i2].f8321f.onComplete();
                        i2++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x0014, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x011e, code lost:
            r4 = r0;
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
            if (r11 <= 0) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0124, code lost:
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
            if (r25.f8330l == 1) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
            r25.f8328j.get().request(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0135, code lost:
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
            if (r14 == 0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
            if (r8 != false) goto L70;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c() {
            /*
                Method dump skipped, instructions count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.w.e.b.r.c.c():void");
        }

        public boolean d() {
            return this.f8326h.get() == o;
        }

        @Override // g.c.t.b
        public void dispose() {
            b<T>[] bVarArr = this.f8326h.get();
            b<T>[] bVarArr2 = o;
            if (bVarArr == bVarArr2 || this.f8326h.getAndSet(bVarArr2) == bVarArr2) {
                return;
            }
            this.f8324f.compareAndSet(this, null);
            SubscriptionHelper.cancel(this.f8328j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void e(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f8326h.get();
                int length = bVarArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (bVarArr[i2].equals(bVar)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = n;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i2);
                    System.arraycopy(bVarArr, i2 + 1, bVarArr3, i2, (length - i2) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!this.f8326h.compareAndSet(bVarArr, bVarArr2));
        }

        @Override // m.c.b
        public void onComplete() {
            if (this.f8329k == null) {
                this.f8329k = NotificationLite.complete();
                c();
            }
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (this.f8329k == null) {
                this.f8329k = NotificationLite.error(th);
                c();
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8330l == 0 && !this.f8331m.offer(t)) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                c();
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.setOnce(this.f8328j, cVar)) {
                if (cVar instanceof g.c.w.c.g) {
                    g.c.w.c.g gVar = (g.c.w.c.g) cVar;
                    int requestFusion = gVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f8330l = requestFusion;
                        this.f8331m = gVar;
                        this.f8329k = NotificationLite.complete();
                        c();
                        return;
                    } else if (requestFusion == 2) {
                        this.f8330l = requestFusion;
                        this.f8331m = gVar;
                        cVar.request(this.f8325g);
                        return;
                    }
                }
                this.f8331m = new g.c.w.f.a(this.f8325g);
                cVar.request(this.f8325g);
            }
        }
    }

    public r(m.c.a<T> aVar, g.c.d<T> dVar, AtomicReference<c<T>> atomicReference, int i2) {
        this.f8318j = aVar;
        this.f8315g = dVar;
        this.f8316h = atomicReference;
        this.f8317i = i2;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        this.f8318j.a(bVar);
    }

    @Override // g.c.u.a
    public void g(g.c.v.c<? super g.c.t.b> cVar) {
        c<T> cVar2;
        while (true) {
            cVar2 = this.f8316h.get();
            if (cVar2 != null && !cVar2.d()) {
                break;
            }
            c<T> cVar3 = new c<>(this.f8316h, this.f8317i);
            if (this.f8316h.compareAndSet(cVar2, cVar3)) {
                cVar2 = cVar3;
                break;
            }
        }
        boolean z = true;
        z = (cVar2.f8327i.get() || !cVar2.f8327i.compareAndSet(false, true)) ? false : false;
        try {
            ((g.c.w.j.c) cVar).f8583f = cVar2;
            if (z) {
                this.f8315g.d(cVar2);
            }
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            throw g.c.w.j.d.d(th);
        }
    }
}

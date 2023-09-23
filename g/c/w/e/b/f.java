package g.c.w.e.b;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableElementAtMaybe.java */
/* loaded from: classes2.dex */
public final class f<T> extends g.c.h<T> implements g.c.w.c.b<T> {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.d<T> f8221f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8222g;

    /* compiled from: FlowableElementAtMaybe.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.g<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8223f;

        /* renamed from: g  reason: collision with root package name */
        public final long f8224g;

        /* renamed from: h  reason: collision with root package name */
        public m.c.c f8225h;

        /* renamed from: i  reason: collision with root package name */
        public long f8226i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f8227j;

        public a(g.c.j<? super T> jVar, long j2) {
            this.f8223f = jVar;
            this.f8224g = j2;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8225h.cancel();
            this.f8225h = SubscriptionHelper.CANCELLED;
        }

        @Override // m.c.b
        public void onComplete() {
            this.f8225h = SubscriptionHelper.CANCELLED;
            if (this.f8227j) {
                return;
            }
            this.f8227j = true;
            this.f8223f.onComplete();
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (this.f8227j) {
                f.n.a.n.i.L(th);
                return;
            }
            this.f8227j = true;
            this.f8225h = SubscriptionHelper.CANCELLED;
            this.f8223f.onError(th);
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8227j) {
                return;
            }
            long j2 = this.f8226i;
            if (j2 == this.f8224g) {
                this.f8227j = true;
                this.f8225h.cancel();
                this.f8225h = SubscriptionHelper.CANCELLED;
                this.f8223f.onSuccess(t);
                return;
            }
            this.f8226i = j2 + 1;
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8225h, cVar)) {
                this.f8225h = cVar;
                this.f8223f.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public f(g.c.d<T> dVar, long j2) {
        this.f8221f = dVar;
        this.f8222g = j2;
    }

    @Override // g.c.w.c.b
    public g.c.d<T> b() {
        return new e(this.f8221f, this.f8222g, null, false);
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8221f.d(new a(jVar, this.f8222g));
    }
}

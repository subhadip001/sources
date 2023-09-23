package g.c.w.e.b;

/* compiled from: FlowableFromObservable.java */
/* loaded from: classes2.dex */
public final class n<T> extends g.c.d<T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.l<T> f8286g;

    /* compiled from: FlowableFromObservable.java */
    /* loaded from: classes2.dex */
    public static class a<T> implements g.c.n<T>, m.c.c {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super T> f8287f;

        /* renamed from: g  reason: collision with root package name */
        public g.c.t.b f8288g;

        public a(m.c.b<? super T> bVar) {
            this.f8287f = bVar;
        }

        @Override // m.c.c
        public void cancel() {
            this.f8288g.dispose();
        }

        @Override // g.c.n
        public void onComplete() {
            this.f8287f.onComplete();
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            this.f8287f.onError(th);
        }

        @Override // g.c.n
        public void onNext(T t) {
            this.f8287f.onNext(t);
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            this.f8288g = bVar;
            this.f8287f.onSubscribe(this);
        }

        @Override // m.c.c
        public void request(long j2) {
        }
    }

    public n(g.c.l<T> lVar) {
        this.f8286g = lVar;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        this.f8286g.a(new a(bVar));
    }
}

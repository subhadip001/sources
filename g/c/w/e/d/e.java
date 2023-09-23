package g.c.w.e.d;

/* compiled from: ObservableFilter.java */
/* loaded from: classes2.dex */
public final class e<T> extends g.c.w.e.d.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.e<? super T> f8422g;

    /* compiled from: ObservableFilter.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.d.a<T, T> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.e<? super T> f8423k;

        public a(g.c.n<? super T> nVar, g.c.v.e<? super T> eVar) {
            super(nVar);
            this.f8423k = eVar;
        }

        @Override // g.c.n
        public void onNext(T t) {
            if (this.f8152j == 0) {
                try {
                    if (this.f8423k.a(t)) {
                        this.f8148f.onNext(t);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    this.f8149g.dispose();
                    onError(th);
                    return;
                }
            }
            this.f8148f.onNext(null);
        }

        @Override // g.c.w.c.j
        public T poll() {
            T poll;
            do {
                poll = this.f8150h.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f8423k.a(poll));
            return poll;
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return a(i2);
        }
    }

    public e(g.c.m<T> mVar, g.c.v.e<? super T> eVar) {
        super(mVar);
        this.f8422g = eVar;
    }

    @Override // g.c.l
    public void b(g.c.n<? super T> nVar) {
        this.f8411f.a(new a(nVar, this.f8422g));
    }
}

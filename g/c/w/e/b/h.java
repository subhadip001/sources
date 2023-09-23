package g.c.w.e.b;

/* compiled from: FlowableFilter.java */
/* loaded from: classes2.dex */
public final class h<T> extends g.c.w.e.b.a<T, T> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.e<? super T> f8229h;

    /* compiled from: FlowableFilter.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.h.a<T, T> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.e<? super T> f8230k;

        public a(g.c.w.c.a<? super T> aVar, g.c.v.e<? super T> eVar) {
            super(aVar);
            this.f8230k = eVar;
        }

        @Override // g.c.w.c.a
        public boolean a(T t) {
            if (this.f8555i) {
                return false;
            }
            if (this.f8556j != 0) {
                return this.f8552f.a(null);
            }
            try {
                return this.f8230k.a(t) && this.f8552f.a(t);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (a(t)) {
                return;
            }
            this.f8553g.request(1L);
        }

        @Override // g.c.w.c.j
        public T poll() {
            g.c.w.c.g<T> gVar = this.f8554h;
            g.c.v.e<? super T> eVar = this.f8230k;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (eVar.a(poll)) {
                    return poll;
                }
                if (this.f8556j == 2) {
                    gVar.request(1L);
                }
            }
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return c(i2);
        }
    }

    /* compiled from: FlowableFilter.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends g.c.w.h.b<T, T> implements g.c.w.c.a<T> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.e<? super T> f8231k;

        public b(m.c.b<? super T> bVar, g.c.v.e<? super T> eVar) {
            super(bVar);
            this.f8231k = eVar;
        }

        @Override // g.c.w.c.a
        public boolean a(T t) {
            if (this.f8560i) {
                return false;
            }
            if (this.f8561j != 0) {
                this.f8557f.onNext(null);
                return true;
            }
            try {
                boolean a = this.f8231k.a(t);
                if (a) {
                    this.f8557f.onNext(t);
                }
                return a;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (a(t)) {
                return;
            }
            this.f8558g.request(1L);
        }

        @Override // g.c.w.c.j
        public T poll() {
            g.c.w.c.g<T> gVar = this.f8559h;
            g.c.v.e<? super T> eVar = this.f8231k;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (eVar.a(poll)) {
                    return poll;
                }
                if (this.f8561j == 2) {
                    gVar.request(1L);
                }
            }
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return c(i2);
        }
    }

    public h(g.c.d<T> dVar, g.c.v.e<? super T> eVar) {
        super(dVar);
        this.f8229h = eVar;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        if (bVar instanceof g.c.w.c.a) {
            this.f8174g.d(new a((g.c.w.c.a) bVar, this.f8229h));
        } else {
            this.f8174g.d(new b(bVar, this.f8229h));
        }
    }
}

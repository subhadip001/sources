package g.c.w.e.b;

import io.reactivex.exceptions.CompositeException;

/* compiled from: FlowableDoOnEach.java */
/* loaded from: classes2.dex */
public final class d<T> extends g.c.w.e.b.a<T, T> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.c<? super T> f8202h;

    /* renamed from: i  reason: collision with root package name */
    public final g.c.v.c<? super Throwable> f8203i;

    /* renamed from: j  reason: collision with root package name */
    public final g.c.v.a f8204j;

    /* renamed from: k  reason: collision with root package name */
    public final g.c.v.a f8205k;

    /* compiled from: FlowableDoOnEach.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.h.a<T, T> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.c<? super T> f8206k;

        /* renamed from: l  reason: collision with root package name */
        public final g.c.v.c<? super Throwable> f8207l;

        /* renamed from: m  reason: collision with root package name */
        public final g.c.v.a f8208m;
        public final g.c.v.a n;

        public a(g.c.w.c.a<? super T> aVar, g.c.v.c<? super T> cVar, g.c.v.c<? super Throwable> cVar2, g.c.v.a aVar2, g.c.v.a aVar3) {
            super(aVar);
            this.f8206k = cVar;
            this.f8207l = cVar2;
            this.f8208m = aVar2;
            this.n = aVar3;
        }

        @Override // g.c.w.c.a
        public boolean a(T t) {
            if (this.f8555i) {
                return false;
            }
            try {
                this.f8206k.accept(t);
                return this.f8552f.a(t);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        @Override // g.c.w.h.a, m.c.b
        public void onComplete() {
            if (this.f8555i) {
                return;
            }
            try {
                this.f8208m.run();
                this.f8555i = true;
                this.f8552f.onComplete();
                try {
                    this.n.run();
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    f.n.a.n.i.L(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // g.c.w.h.a, m.c.b
        public void onError(Throwable th) {
            if (this.f8555i) {
                f.n.a.n.i.L(th);
                return;
            }
            boolean z = true;
            this.f8555i = true;
            try {
                this.f8207l.accept(th);
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                this.f8552f.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f8552f.onError(th);
            }
            try {
                this.n.run();
            } catch (Throwable th3) {
                f.n.a.n.i.d0(th3);
                f.n.a.n.i.L(th3);
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8555i) {
                return;
            }
            if (this.f8556j != 0) {
                this.f8552f.onNext(null);
                return;
            }
            try {
                this.f8206k.accept(t);
                this.f8552f.onNext(t);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // g.c.w.c.j
        public T poll() {
            try {
                T poll = this.f8554h.poll();
                if (poll != null) {
                    try {
                        this.f8206k.accept(poll);
                    } catch (Throwable th) {
                        try {
                            f.n.a.n.i.d0(th);
                            this.f8207l.accept(th);
                            throw g.c.w.j.d.c(th);
                        } finally {
                            this.n.run();
                        }
                    }
                } else if (this.f8556j == 1) {
                    this.f8208m.run();
                }
                return poll;
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                try {
                    this.f8207l.accept(th2);
                    throw g.c.w.j.d.c(th2);
                } catch (Throwable th3) {
                    throw new CompositeException(th2, th3);
                }
            }
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return c(i2);
        }
    }

    /* compiled from: FlowableDoOnEach.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends g.c.w.h.b<T, T> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.c<? super T> f8209k;

        /* renamed from: l  reason: collision with root package name */
        public final g.c.v.c<? super Throwable> f8210l;

        /* renamed from: m  reason: collision with root package name */
        public final g.c.v.a f8211m;
        public final g.c.v.a n;

        public b(m.c.b<? super T> bVar, g.c.v.c<? super T> cVar, g.c.v.c<? super Throwable> cVar2, g.c.v.a aVar, g.c.v.a aVar2) {
            super(bVar);
            this.f8209k = cVar;
            this.f8210l = cVar2;
            this.f8211m = aVar;
            this.n = aVar2;
        }

        @Override // g.c.w.h.b, m.c.b
        public void onComplete() {
            if (this.f8560i) {
                return;
            }
            try {
                this.f8211m.run();
                this.f8560i = true;
                this.f8557f.onComplete();
                try {
                    this.n.run();
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    f.n.a.n.i.L(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // g.c.w.h.b, m.c.b
        public void onError(Throwable th) {
            if (this.f8560i) {
                f.n.a.n.i.L(th);
                return;
            }
            boolean z = true;
            this.f8560i = true;
            try {
                this.f8210l.accept(th);
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                this.f8557f.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f8557f.onError(th);
            }
            try {
                this.n.run();
            } catch (Throwable th3) {
                f.n.a.n.i.d0(th3);
                f.n.a.n.i.L(th3);
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8560i) {
                return;
            }
            if (this.f8561j != 0) {
                this.f8557f.onNext(null);
                return;
            }
            try {
                this.f8209k.accept(t);
                this.f8557f.onNext(t);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // g.c.w.c.j
        public T poll() {
            try {
                T poll = this.f8559h.poll();
                if (poll != null) {
                    try {
                        this.f8209k.accept(poll);
                    } catch (Throwable th) {
                        try {
                            f.n.a.n.i.d0(th);
                            this.f8210l.accept(th);
                            throw g.c.w.j.d.c(th);
                        } finally {
                            this.n.run();
                        }
                    }
                } else if (this.f8561j == 1) {
                    this.f8211m.run();
                }
                return poll;
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                try {
                    this.f8210l.accept(th2);
                    throw g.c.w.j.d.c(th2);
                } catch (Throwable th3) {
                    throw new CompositeException(th2, th3);
                }
            }
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return c(i2);
        }
    }

    public d(g.c.d<T> dVar, g.c.v.c<? super T> cVar, g.c.v.c<? super Throwable> cVar2, g.c.v.a aVar, g.c.v.a aVar2) {
        super(dVar);
        this.f8202h = cVar;
        this.f8203i = cVar2;
        this.f8204j = aVar;
        this.f8205k = aVar2;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        if (bVar instanceof g.c.w.c.a) {
            this.f8174g.d(new a((g.c.w.c.a) bVar, this.f8202h, this.f8203i, this.f8204j, this.f8205k));
        } else {
            this.f8174g.d(new b(bVar, this.f8202h, this.f8203i, this.f8204j, this.f8205k));
        }
    }
}

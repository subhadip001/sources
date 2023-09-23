package g.c.w.e.d;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable.java */
/* loaded from: classes2.dex */
public final class g<T> extends g.c.w.e.d.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends g.c.c> f8441g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8442h;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.d.b<T> implements g.c.n<T> {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.n<? super T> f8443f;

        /* renamed from: h  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends g.c.c> f8445h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f8446i;

        /* renamed from: k  reason: collision with root package name */
        public g.c.t.b f8448k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f8449l;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.w.j.b f8444g = new g.c.w.j.b();

        /* renamed from: j  reason: collision with root package name */
        public final g.c.t.a f8447j = new g.c.t.a();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: g.c.w.e.d.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0215a extends AtomicReference<g.c.t.b> implements g.c.b, g.c.t.b {
            public C0215a() {
            }

            @Override // g.c.t.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // g.c.b
            public void onComplete() {
                a aVar = a.this;
                aVar.f8447j.c(this);
                aVar.onComplete();
            }

            @Override // g.c.b
            public void onError(Throwable th) {
                a aVar = a.this;
                aVar.f8447j.c(this);
                aVar.onError(th);
            }

            @Override // g.c.b
            public void onSubscribe(g.c.t.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public a(g.c.n<? super T> nVar, g.c.v.d<? super T, ? extends g.c.c> dVar, boolean z) {
            this.f8443f = nVar;
            this.f8445h = dVar;
            this.f8446i = z;
            lazySet(1);
        }

        @Override // g.c.w.c.j
        public void clear() {
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8449l = true;
            this.f8448k.dispose();
            this.f8447j.dispose();
        }

        @Override // g.c.w.c.j
        public boolean isEmpty() {
            return true;
        }

        @Override // g.c.n
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = g.c.w.j.d.b(this.f8444g);
                if (b != null) {
                    this.f8443f.onError(b);
                } else {
                    this.f8443f.onComplete();
                }
            }
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            if (g.c.w.j.d.a(this.f8444g, th)) {
                if (this.f8446i) {
                    if (decrementAndGet() == 0) {
                        this.f8443f.onError(g.c.w.j.d.b(this.f8444g));
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.f8443f.onError(g.c.w.j.d.b(this.f8444g));
                    return;
                }
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // g.c.n
        public void onNext(T t) {
            try {
                g.c.c apply = this.f8445h.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                g.c.c cVar = apply;
                getAndIncrement();
                C0215a c0215a = new C0215a();
                if (this.f8449l || !this.f8447j.b(c0215a)) {
                    return;
                }
                cVar.b(c0215a);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8448k.dispose();
                onError(th);
            }
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8448k, bVar)) {
                this.f8448k = bVar;
                this.f8443f.onSubscribe(this);
            }
        }

        @Override // g.c.w.c.j
        public T poll() {
            return null;
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return i2 & 2;
        }
    }

    public g(g.c.m<T> mVar, g.c.v.d<? super T, ? extends g.c.c> dVar, boolean z) {
        super(mVar);
        this.f8441g = dVar;
        this.f8442h = z;
    }

    @Override // g.c.l
    public void b(g.c.n<? super T> nVar) {
        this.f8411f.a(new a(nVar, this.f8441g, this.f8442h));
    }
}

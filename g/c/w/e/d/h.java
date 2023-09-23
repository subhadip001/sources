package g.c.w.e.d;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* loaded from: classes2.dex */
public final class h<T> extends g.c.a implements g.c.w.c.d<T> {
    public final g.c.m<T> a;
    public final g.c.v.d<? super T, ? extends g.c.c> b;
    public final boolean c;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements g.c.t.b, g.c.n<T> {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.b f8451f;

        /* renamed from: h  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends g.c.c> f8453h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f8454i;

        /* renamed from: k  reason: collision with root package name */
        public g.c.t.b f8456k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f8457l;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.w.j.b f8452g = new g.c.w.j.b();

        /* renamed from: j  reason: collision with root package name */
        public final g.c.t.a f8455j = new g.c.t.a();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: g.c.w.e.d.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0216a extends AtomicReference<g.c.t.b> implements g.c.b, g.c.t.b {
            public C0216a() {
            }

            @Override // g.c.t.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // g.c.b
            public void onComplete() {
                a aVar = a.this;
                aVar.f8455j.c(this);
                aVar.onComplete();
            }

            @Override // g.c.b
            public void onError(Throwable th) {
                a aVar = a.this;
                aVar.f8455j.c(this);
                aVar.onError(th);
            }

            @Override // g.c.b
            public void onSubscribe(g.c.t.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public a(g.c.b bVar, g.c.v.d<? super T, ? extends g.c.c> dVar, boolean z) {
            this.f8451f = bVar;
            this.f8453h = dVar;
            this.f8454i = z;
            lazySet(1);
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8457l = true;
            this.f8456k.dispose();
            this.f8455j.dispose();
        }

        @Override // g.c.n
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = g.c.w.j.d.b(this.f8452g);
                if (b != null) {
                    this.f8451f.onError(b);
                } else {
                    this.f8451f.onComplete();
                }
            }
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            if (g.c.w.j.d.a(this.f8452g, th)) {
                if (this.f8454i) {
                    if (decrementAndGet() == 0) {
                        this.f8451f.onError(g.c.w.j.d.b(this.f8452g));
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.f8451f.onError(g.c.w.j.d.b(this.f8452g));
                    return;
                }
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // g.c.n
        public void onNext(T t) {
            try {
                g.c.c apply = this.f8453h.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                g.c.c cVar = apply;
                getAndIncrement();
                C0216a c0216a = new C0216a();
                if (this.f8457l || !this.f8455j.b(c0216a)) {
                    return;
                }
                cVar.b(c0216a);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                this.f8456k.dispose();
                onError(th);
            }
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8456k, bVar)) {
                this.f8456k = bVar;
                this.f8451f.onSubscribe(this);
            }
        }
    }

    public h(g.c.m<T> mVar, g.c.v.d<? super T, ? extends g.c.c> dVar, boolean z) {
        this.a = mVar;
        this.b = dVar;
        this.c = z;
    }

    @Override // g.c.w.c.d
    public g.c.l<T> a() {
        return new g(this.a, this.b, this.c);
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        this.a.a(new a(bVar, this.b, this.c));
    }
}

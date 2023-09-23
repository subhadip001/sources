package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSwitchIfEmpty.java */
/* loaded from: classes2.dex */
public final class t<T> extends g.c.w.e.c.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.k<? extends T> f8393g;

    /* compiled from: MaybeSwitchIfEmpty.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8394f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.k<? extends T> f8395g;

        /* compiled from: MaybeSwitchIfEmpty.java */
        /* renamed from: g.c.w.e.c.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0214a<T> implements g.c.j<T> {

            /* renamed from: f  reason: collision with root package name */
            public final g.c.j<? super T> f8396f;

            /* renamed from: g  reason: collision with root package name */
            public final AtomicReference<g.c.t.b> f8397g;

            public C0214a(g.c.j<? super T> jVar, AtomicReference<g.c.t.b> atomicReference) {
                this.f8396f = jVar;
                this.f8397g = atomicReference;
            }

            @Override // g.c.j
            public void onComplete() {
                this.f8396f.onComplete();
            }

            @Override // g.c.j
            public void onError(Throwable th) {
                this.f8396f.onError(th);
            }

            @Override // g.c.j
            public void onSubscribe(g.c.t.b bVar) {
                DisposableHelper.setOnce(this.f8397g, bVar);
            }

            @Override // g.c.j
            public void onSuccess(T t) {
                this.f8396f.onSuccess(t);
            }
        }

        public a(g.c.j<? super T> jVar, g.c.k<? extends T> kVar) {
            this.f8394f = jVar;
            this.f8395g = kVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // g.c.j
        public void onComplete() {
            g.c.t.b bVar = get();
            if (bVar == DisposableHelper.DISPOSED || !compareAndSet(bVar, null)) {
                return;
            }
            this.f8395g.a(new C0214a(this.f8394f, this));
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8394f.onError(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f8394f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            this.f8394f.onSuccess(t);
        }
    }

    public t(g.c.k<T> kVar, g.c.k<? extends T> kVar2) {
        super(kVar);
        this.f8393g = kVar2;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8336f.a(new a(jVar, this.f8393g));
    }
}

package g.c.w.e.c;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeOnErrorNext.java */
/* loaded from: classes2.dex */
public final class p<T> extends g.c.w.e.c.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super Throwable, ? extends g.c.k<? extends T>> f8377g;

    /* compiled from: MaybeOnErrorNext.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8378f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super Throwable, ? extends g.c.k<? extends T>> f8379g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8380h;

        /* compiled from: MaybeOnErrorNext.java */
        /* renamed from: g.c.w.e.c.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0213a<T> implements g.c.j<T> {

            /* renamed from: f  reason: collision with root package name */
            public final g.c.j<? super T> f8381f;

            /* renamed from: g  reason: collision with root package name */
            public final AtomicReference<g.c.t.b> f8382g;

            public C0213a(g.c.j<? super T> jVar, AtomicReference<g.c.t.b> atomicReference) {
                this.f8381f = jVar;
                this.f8382g = atomicReference;
            }

            @Override // g.c.j
            public void onComplete() {
                this.f8381f.onComplete();
            }

            @Override // g.c.j
            public void onError(Throwable th) {
                this.f8381f.onError(th);
            }

            @Override // g.c.j
            public void onSubscribe(g.c.t.b bVar) {
                DisposableHelper.setOnce(this.f8382g, bVar);
            }

            @Override // g.c.j
            public void onSuccess(T t) {
                this.f8381f.onSuccess(t);
            }
        }

        public a(g.c.j<? super T> jVar, g.c.v.d<? super Throwable, ? extends g.c.k<? extends T>> dVar, boolean z) {
            this.f8378f = jVar;
            this.f8379g = dVar;
            this.f8380h = z;
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // g.c.j
        public void onComplete() {
            this.f8378f.onComplete();
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            if (!this.f8380h && !(th instanceof Exception)) {
                this.f8378f.onError(th);
                return;
            }
            try {
                g.c.k<? extends T> apply = this.f8379g.apply(th);
                Objects.requireNonNull(apply, "The resumeFunction returned a null MaybeSource");
                g.c.k<? extends T> kVar = apply;
                DisposableHelper.replace(this, null);
                kVar.a(new C0213a(this.f8378f, this));
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                this.f8378f.onError(new CompositeException(th, th2));
            }
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f8378f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            this.f8378f.onSuccess(t);
        }
    }

    public p(g.c.k<T> kVar, g.c.v.d<? super Throwable, ? extends g.c.k<? extends T>> dVar, boolean z) {
        super(kVar);
        this.f8377g = dVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8336f.a(new a(jVar, this.f8377g, true));
    }
}

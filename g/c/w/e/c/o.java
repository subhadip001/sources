package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeObserveOn.java */
/* loaded from: classes2.dex */
public final class o<T> extends g.c.w.e.c.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.o f8372g;

    /* compiled from: MaybeObserveOn.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.t.b, Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8373f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.o f8374g;

        /* renamed from: h  reason: collision with root package name */
        public T f8375h;

        /* renamed from: i  reason: collision with root package name */
        public Throwable f8376i;

        public a(g.c.j<? super T> jVar, g.c.o oVar) {
            this.f8373f = jVar;
            this.f8374g = oVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // g.c.j
        public void onComplete() {
            DisposableHelper.replace(this, this.f8374g.b(this));
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            this.f8376i = th;
            DisposableHelper.replace(this, this.f8374g.b(this));
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f8373f.onSubscribe(this);
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            this.f8375h = t;
            DisposableHelper.replace(this, this.f8374g.b(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f8376i;
            if (th != null) {
                this.f8376i = null;
                this.f8373f.onError(th);
                return;
            }
            T t = this.f8375h;
            if (t != null) {
                this.f8375h = null;
                this.f8373f.onSuccess(t);
                return;
            }
            this.f8373f.onComplete();
        }
    }

    public o(g.c.k<T> kVar, g.c.o oVar) {
        super(kVar);
        this.f8372g = oVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8336f.a(new a(jVar, this.f8372g));
    }
}

package g.c.w.e.c;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: MaybePeek.java */
/* loaded from: classes2.dex */
public final class q<T> extends g.c.w.e.c.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.c<? super g.c.t.b> f8383g;

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.c<? super T> f8384h;

    /* renamed from: i  reason: collision with root package name */
    public final g.c.v.c<? super Throwable> f8385i;

    /* compiled from: MaybePeek.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.j<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8386f;

        /* renamed from: g  reason: collision with root package name */
        public final q<T> f8387g;

        /* renamed from: h  reason: collision with root package name */
        public g.c.t.b f8388h;

        public a(g.c.j<? super T> jVar, q<T> qVar) {
            this.f8386f = jVar;
            this.f8387g = qVar;
        }

        public void a() {
            try {
                Objects.requireNonNull(this.f8387g);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                f.n.a.n.i.L(th);
            }
        }

        public void b(Throwable th) {
            try {
                this.f8387g.f8385i.accept(th);
            } catch (Throwable th2) {
                f.n.a.n.i.d0(th2);
                th = new CompositeException(th, th2);
            }
            this.f8388h = DisposableHelper.DISPOSED;
            this.f8386f.onError(th);
            a();
        }

        @Override // g.c.t.b
        public void dispose() {
            try {
                Objects.requireNonNull(this.f8387g);
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                f.n.a.n.i.L(th);
            }
            this.f8388h.dispose();
            this.f8388h = DisposableHelper.DISPOSED;
        }

        @Override // g.c.j
        public void onComplete() {
            g.c.t.b bVar = this.f8388h;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                Objects.requireNonNull(this.f8387g);
                this.f8388h = disposableHelper;
                this.f8386f.onComplete();
                a();
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                b(th);
            }
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            if (this.f8388h == DisposableHelper.DISPOSED) {
                f.n.a.n.i.L(th);
            } else {
                b(th);
            }
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.validate(this.f8388h, bVar)) {
                try {
                    Objects.requireNonNull(this.f8387g);
                    this.f8388h = bVar;
                    this.f8386f.onSubscribe(this);
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    bVar.dispose();
                    this.f8388h = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, this.f8386f);
                }
            }
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            g.c.t.b bVar = this.f8388h;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f8387g.f8384h.accept(t);
                this.f8388h = disposableHelper;
                this.f8386f.onSuccess(t);
                a();
            } catch (Throwable th) {
                f.n.a.n.i.d0(th);
                b(th);
            }
        }
    }

    public q(g.c.k<T> kVar, g.c.v.c<? super g.c.t.b> cVar, g.c.v.c<? super T> cVar2, g.c.v.c<? super Throwable> cVar3, g.c.v.a aVar, g.c.v.a aVar2, g.c.v.a aVar3) {
        super(kVar);
        this.f8383g = cVar;
        this.f8384h = cVar2;
        this.f8385i = cVar3;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        this.f8336f.a(new a(jVar, this));
    }
}

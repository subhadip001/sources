package g.c.w.e.c;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeCallbackObserver.java */
/* loaded from: classes2.dex */
public final class b<T> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.t.b {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.v.c<? super T> f8337f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.c<? super Throwable> f8338g;

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.a f8339h;

    public b(g.c.v.c<? super T> cVar, g.c.v.c<? super Throwable> cVar2, g.c.v.a aVar) {
        this.f8337f = cVar;
        this.f8338g = cVar2;
        this.f8339h = aVar;
    }

    @Override // g.c.t.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // g.c.j
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f8339h.run();
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            f.n.a.n.i.L(th);
        }
    }

    @Override // g.c.j
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f8338g.accept(th);
        } catch (Throwable th2) {
            f.n.a.n.i.d0(th2);
            f.n.a.n.i.L(new CompositeException(th, th2));
        }
    }

    @Override // g.c.j
    public void onSubscribe(g.c.t.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // g.c.j
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f8337f.accept(t);
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            f.n.a.n.i.L(th);
        }
    }
}

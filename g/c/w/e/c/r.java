package g.c.w.e.c;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSubscribeOn.java */
/* loaded from: classes2.dex */
public final class r<T> extends AtomicReference<g.c.t.b> implements g.c.j<T>, g.c.t.b {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.w.a.c f8389f = new g.c.w.a.c();

    /* renamed from: g  reason: collision with root package name */
    public final g.c.j<? super T> f8390g;

    public r(g.c.j<? super T> jVar) {
        this.f8390g = jVar;
    }

    @Override // g.c.t.b
    public void dispose() {
        DisposableHelper.dispose(this);
        g.c.w.a.c cVar = this.f8389f;
        Objects.requireNonNull(cVar);
        DisposableHelper.dispose(cVar);
    }

    @Override // g.c.j
    public void onComplete() {
        this.f8390g.onComplete();
    }

    @Override // g.c.j
    public void onError(Throwable th) {
        this.f8390g.onError(th);
    }

    @Override // g.c.j
    public void onSubscribe(g.c.t.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // g.c.j
    public void onSuccess(T t) {
        this.f8390g.onSuccess(t);
    }
}

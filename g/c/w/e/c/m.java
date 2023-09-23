package g.c.w.e.c;

import io.reactivex.internal.disposables.EmptyDisposable;

/* compiled from: MaybeJust.java */
/* loaded from: classes2.dex */
public final class m<T> extends g.c.h<T> implements g.c.w.c.h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final T f8367f;

    public m(T t) {
        this.f8367f = t;
    }

    @Override // g.c.w.c.h, java.util.concurrent.Callable
    public T call() {
        return this.f8367f;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        jVar.onSubscribe(EmptyDisposable.INSTANCE);
        jVar.onSuccess((T) this.f8367f);
    }
}

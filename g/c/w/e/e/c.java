package g.c.w.e.e;

import g.c.p;
import g.c.q;
import io.reactivex.internal.disposables.EmptyDisposable;

/* compiled from: SingleJust.java */
/* loaded from: classes2.dex */
public final class c<T> extends p<T> {
    public final T a;

    public c(T t) {
        this.a = t;
    }

    @Override // g.c.p
    public void d(q<? super T> qVar) {
        qVar.onSubscribe(EmptyDisposable.INSTANCE);
        qVar.onSuccess((T) this.a);
    }
}

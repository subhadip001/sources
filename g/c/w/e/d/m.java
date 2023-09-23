package g.c.w.e.d;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: ObservableScalarXMap.java */
/* loaded from: classes2.dex */
public final class m<T, R> extends g.c.l<R> {

    /* renamed from: f  reason: collision with root package name */
    public final T f8471f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends g.c.m<? extends R>> f8472g;

    public m(T t, g.c.v.d<? super T, ? extends g.c.m<? extends R>> dVar) {
        this.f8471f = t;
        this.f8472g = dVar;
    }

    @Override // g.c.l
    public void b(g.c.n<? super R> nVar) {
        try {
            g.c.m<? extends R> apply = this.f8472g.apply((T) this.f8471f);
            Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
            g.c.m<? extends R> mVar = apply;
            if (mVar instanceof Callable) {
                try {
                    Object call = ((Callable) mVar).call();
                    if (call == null) {
                        EmptyDisposable.complete(nVar);
                        return;
                    }
                    l lVar = new l(nVar, call);
                    nVar.onSubscribe(lVar);
                    lVar.run();
                    return;
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    EmptyDisposable.error(th, nVar);
                    return;
                }
            }
            mVar.a(nVar);
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, nVar);
        }
    }
}

package g.c.w.e.b;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: FlowableScalarXMap.java */
/* loaded from: classes2.dex */
public final class s<T, R> extends g.c.d<R> {

    /* renamed from: g  reason: collision with root package name */
    public final T f8332g;

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends m.c.a<? extends R>> f8333h;

    public s(T t, g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar) {
        this.f8332g = t;
        this.f8333h = dVar;
    }

    @Override // g.c.d
    public void e(m.c.b<? super R> bVar) {
        try {
            m.c.a<? extends R> apply = this.f8333h.apply((T) this.f8332g);
            Objects.requireNonNull(apply, "The mapper returned a null Publisher");
            m.c.a<? extends R> aVar = apply;
            if (aVar instanceof Callable) {
                try {
                    Object call = ((Callable) aVar).call();
                    if (call == null) {
                        EmptySubscription.complete(bVar);
                        return;
                    } else {
                        bVar.onSubscribe(new g.c.w.i.d(bVar, call));
                        return;
                    }
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    EmptySubscription.error(th, bVar);
                    return;
                }
            }
            aVar.a(bVar);
        } catch (Throwable th2) {
            EmptySubscription.error(th2, bVar);
        }
    }
}

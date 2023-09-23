package g.c.w.e.b;

import io.reactivex.internal.subscriptions.EmptySubscription;

/* compiled from: FlowableEmpty.java */
/* loaded from: classes2.dex */
public final class g extends g.c.d<Object> implements g.c.w.c.h<Object> {

    /* renamed from: g  reason: collision with root package name */
    public static final g.c.d<Object> f8228g = new g();

    @Override // g.c.w.c.h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // g.c.d
    public void e(m.c.b<? super Object> bVar) {
        EmptySubscription.complete(bVar);
    }
}

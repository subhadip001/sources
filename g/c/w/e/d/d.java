package g.c.w.e.d;

import io.reactivex.internal.disposables.EmptyDisposable;

/* compiled from: ObservableEmpty.java */
/* loaded from: classes2.dex */
public final class d extends g.c.l<Object> implements g.c.w.c.h<Object> {

    /* renamed from: f  reason: collision with root package name */
    public static final g.c.l<Object> f8421f = new d();

    @Override // g.c.l
    public void b(g.c.n<? super Object> nVar) {
        EmptyDisposable.complete(nVar);
    }

    @Override // g.c.w.c.h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}

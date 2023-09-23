package g.c.w.e.d;

/* compiled from: ObservableJust.java */
/* loaded from: classes2.dex */
public final class j<T> extends g.c.l<T> implements g.c.w.c.h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final T f8466f;

    public j(T t) {
        this.f8466f = t;
    }

    @Override // g.c.l
    public void b(g.c.n<? super T> nVar) {
        l lVar = new l(nVar, this.f8466f);
        nVar.onSubscribe(lVar);
        lVar.run();
    }

    @Override // g.c.w.c.h, java.util.concurrent.Callable
    public T call() {
        return this.f8466f;
    }
}

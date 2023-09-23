package g.c.w.e.c;

import java.util.concurrent.Callable;

/* compiled from: MaybeFromCallable.java */
/* loaded from: classes2.dex */
public final class i<T> extends g.c.h<T> implements Callable<T> {

    /* renamed from: f  reason: collision with root package name */
    public final Callable<? extends T> f8359f;

    public i(Callable<? extends T> callable) {
        this.f8359f = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.f8359f.call();
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        g.c.t.b s = f.n.a.n.i.s();
        jVar.onSubscribe(s);
        g.c.t.c cVar = (g.c.t.c) s;
        if (cVar.a()) {
            return;
        }
        try {
            Object obj = (T) this.f8359f.call();
            if (cVar.a()) {
                return;
            }
            if (obj == null) {
                jVar.onComplete();
            } else {
                jVar.onSuccess(obj);
            }
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            if (!cVar.a()) {
                jVar.onError(th);
            } else {
                f.n.a.n.i.L(th);
            }
        }
    }
}

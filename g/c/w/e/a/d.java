package g.c.w.e.a;

import f.n.a.n.i;
import java.util.concurrent.Callable;

/* compiled from: CompletableFromCallable.java */
/* loaded from: classes2.dex */
public final class d extends g.c.a {
    public final Callable<?> a;

    public d(Callable<?> callable) {
        this.a = callable;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        g.c.t.b s = i.s();
        bVar.onSubscribe(s);
        try {
            this.a.call();
            if (((g.c.t.c) s).a()) {
                return;
            }
            bVar.onComplete();
        } catch (Throwable th) {
            i.d0(th);
            if (((g.c.t.c) s).a()) {
                return;
            }
            bVar.onError(th);
        }
    }
}

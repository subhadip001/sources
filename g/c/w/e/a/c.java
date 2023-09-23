package g.c.w.e.a;

import f.n.a.n.i;

/* compiled from: CompletableFromAction.java */
/* loaded from: classes2.dex */
public final class c extends g.c.a {
    public final g.c.v.a a;

    public c(g.c.v.a aVar) {
        this.a = aVar;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        g.c.t.b s = i.s();
        bVar.onSubscribe(s);
        try {
            this.a.run();
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

package g.c;

import java.util.Objects;

/* compiled from: Observable.java */
/* loaded from: classes2.dex */
public abstract class l<T> implements m<T> {
    @Override // g.c.m
    public final void a(n<? super T> nVar) {
        Objects.requireNonNull(nVar, "observer is null");
        try {
            b(nVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            f.n.a.n.i.L(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(n<? super T> nVar);
}

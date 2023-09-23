package g.c;

/* compiled from: Single.java */
/* loaded from: classes2.dex */
public abstract class p<T> implements r<T> {
    @Override // g.c.r
    public final void b(q<? super T> qVar) {
        try {
            d(qVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(q<? super T> qVar);
}

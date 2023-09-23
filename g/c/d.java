package g.c;

import com.google.android.gms.common.api.Api;
import g.c.w.e.b.r;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Flowable.java */
/* loaded from: classes2.dex */
public abstract class d<T> implements m.c.a<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final int f8128f = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // m.c.a
    public final void a(m.c.b<? super T> bVar) {
        if (bVar instanceof g) {
            d((g) bVar);
            return;
        }
        Objects.requireNonNull(bVar, "s is null");
        d(new g.c.w.h.d(bVar));
    }

    public final <R> d<R> b(g.c.v.d<? super T, ? extends k<? extends R>> dVar) {
        Objects.requireNonNull(dVar, "mapper is null");
        g.c.w.b.b.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, "maxConcurrency");
        return new g.c.w.e.b.j(this, dVar, false, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final g.c.u.a<T> c() {
        int i2 = f8128f;
        g.c.w.b.b.a(i2, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new g.c.w.e.b.r(new r.a(atomicReference, i2), this, atomicReference, i2);
    }

    public final void d(g<? super T> gVar) {
        Objects.requireNonNull(gVar, "s is null");
        try {
            e(gVar);
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

    public abstract void e(m.c.b<? super T> bVar);
}

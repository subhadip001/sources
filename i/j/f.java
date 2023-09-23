package i.j;

import i.l.a.p;
import i.l.b.i;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public interface a extends f {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: i.j.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0222a {
            public static <R> R a(a aVar, R r, p<? super R, ? super a, ? extends R> pVar) {
                i.e(pVar, "operation");
                return pVar.k(r, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> bVar) {
                i.e(bVar, "key");
                if (i.a(aVar.getKey(), bVar)) {
                    i.c(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return aVar;
                }
                return null;
            }

            public static f c(a aVar, b<?> bVar) {
                i.e(bVar, "key");
                return i.a(aVar.getKey(), bVar) ? h.f8623f : aVar;
            }

            public static f d(a aVar, f fVar) {
                i.e(fVar, "context");
                return f.n.a.n.i.N(aVar, fVar);
            }
        }

        @Override // i.j.f
        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public interface b<E extends a> {
    }

    <R> R fold(R r, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    f minusKey(b<?> bVar);

    f plus(f fVar);
}

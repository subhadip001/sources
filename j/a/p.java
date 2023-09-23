package j.a;

import j.a.g1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes2.dex */
public final class p<T> extends g1 implements o<T> {
    public p(c1 c1Var) {
        super(true);
        D(c1Var);
    }

    @Override // j.a.o
    public boolean N(T t) {
        Object V;
        do {
            V = V(z(), t);
            if (V == h1.a) {
                return false;
            }
            if (V == h1.b) {
                break;
            }
        } while (V == h1.c);
        return true;
    }

    public Object Z(i.j.d<? super T> dVar) {
        Object a;
        while (true) {
            Object z = z();
            if (!(z instanceof x0)) {
                if (!(z instanceof r)) {
                    a = h1.a(z);
                } else {
                    throw ((r) z).a;
                }
            } else if (R(z) >= 0) {
                g1.a aVar = new g1.a(f.n.a.n.i.A(dVar), this);
                aVar.t();
                aVar.i(new n0(q(false, true, new o1(aVar))));
                Object s = aVar.s();
                if (s == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    i.l.b.i.e(dVar, "frame");
                }
                a = s;
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    @Override // j.a.g1
    public boolean w() {
        return true;
    }
}

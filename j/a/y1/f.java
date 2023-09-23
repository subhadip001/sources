package j.a.y1;

import j.a.c1;
import j.a.p0;
import j.a.s1;
import j.a.u1;
import java.util.concurrent.CancellationException;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final s a = new s("UNDEFINED");
    public static final s b = new s("REUSABLE_CLAIMED");

    public static final <T> void a(i.j.d<? super T> dVar, Object obj, i.l.a.l<? super Throwable, i.h> lVar) {
        boolean z;
        if (dVar instanceof e) {
            e eVar = (e) dVar;
            Object g0 = f.n.a.n.i.g0(obj, lVar);
            if (eVar.f8804i.g0(eVar.getContext())) {
                eVar.f8806k = g0;
                eVar.f8764h = 1;
                eVar.f8804i.d0(eVar.getContext(), eVar);
                return;
            }
            s1 s1Var = s1.a;
            p0 a2 = s1.a();
            if (a2.s0()) {
                eVar.f8806k = g0;
                eVar.f8764h = 1;
                a2.q0(eVar);
                return;
            }
            a2.r0(true);
            try {
                c1 c1Var = (c1) eVar.getContext().get(c1.a.f8738f);
                if (c1Var == null || c1Var.a()) {
                    z = false;
                } else {
                    CancellationException v = c1Var.v();
                    if (g0 instanceof j.a.s) {
                        ((j.a.s) g0).b.b(v);
                    }
                    eVar.h(f.n.a.n.i.p(v));
                    z = true;
                }
                if (!z) {
                    i.j.d<T> dVar2 = eVar.f8805j;
                    Object obj2 = eVar.f8807l;
                    i.j.f context = dVar2.getContext();
                    Object b2 = u.b(context, obj2);
                    u1<?> j0 = b2 != u.a ? f.n.a.n.i.j0(dVar2, context, b2) : null;
                    eVar.f8805j.h(obj);
                    if (j0 == null || j0.c0()) {
                        u.a(context, b2);
                    }
                }
                do {
                } while (a2.u0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.h(obj);
    }

    public static /* synthetic */ void b(i.j.d dVar, Object obj, i.l.a.l lVar, int i2) {
        int i3 = i2 & 2;
        a(dVar, obj, null);
    }
}

package kotlinx.coroutines;

import f.n.a.n.i;
import i.h;
import i.j.d;
import i.l.a.l;
import i.l.a.p;
import i.l.b.q;
import j.a.y1.f;
import j.a.y1.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes2.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            try {
                f.b(i.A(i.n(lVar, dVar)), h.a, null, 2);
            } catch (Throwable th) {
                i.r(dVar, th);
                throw null;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                i.l.b.i.e(lVar, "<this>");
                i.l.b.i.e(dVar, "completion");
                i.A(i.n(lVar, dVar)).h(h.a);
            } else if (ordinal == 3) {
                i.l.b.i.e(dVar, "completion");
                try {
                    i.j.f context = dVar.getContext();
                    Object b = u.b(context, null);
                    q.a(lVar, 1);
                    Object b2 = lVar.b(dVar);
                    u.a(context, b);
                    if (b2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        dVar.h(b2);
                    }
                } catch (Throwable th2) {
                    dVar.h(i.p(th2));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            i.U(pVar, r, dVar, null, 4);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                i.l.b.i.e(pVar, "<this>");
                i.l.b.i.e(dVar, "completion");
                i.A(i.o(pVar, r, dVar)).h(h.a);
            } else if (ordinal == 3) {
                i.l.b.i.e(dVar, "completion");
                try {
                    i.j.f context = dVar.getContext();
                    Object b = u.b(context, null);
                    q.a(pVar, 2);
                    Object k2 = pVar.k(r, dVar);
                    u.a(context, b);
                    if (k2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        dVar.h(k2);
                    }
                } catch (Throwable th) {
                    dVar.h(i.p(th));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

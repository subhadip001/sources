package j.a;

/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class e {
    public static final boolean a(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final <T> void b(k0<? super T> k0Var, i.j.d<? super T> dVar, boolean z) {
        boolean c0;
        Object g2 = k0Var.g();
        Throwable c = k0Var.c(g2);
        Object p = c != null ? f.n.a.n.i.p(c) : k0Var.d(g2);
        if (z) {
            j.a.y1.e eVar = (j.a.y1.e) dVar;
            i.j.d<T> dVar2 = eVar.f8805j;
            Object obj = eVar.f8807l;
            i.j.f context = dVar2.getContext();
            Object b = j.a.y1.u.b(context, obj);
            u1<?> j0 = b != j.a.y1.u.a ? f.n.a.n.i.j0(dVar2, context, b) : null;
            try {
                eVar.f8805j.h(p);
                if (j0 != null) {
                    if (!c0) {
                        return;
                    }
                }
                return;
            } finally {
                if (j0 == null || j0.c0()) {
                    j.a.y1.u.a(context, b);
                }
            }
        }
        dVar.h(p);
    }
}

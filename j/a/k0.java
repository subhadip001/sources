package j.a;

import j.a.c1;
import java.util.concurrent.CancellationException;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes2.dex */
public abstract class k0<T> extends j.a.z1.g {

    /* renamed from: h  reason: collision with root package name */
    public int f8764h;

    public k0(int i2) {
        this.f8764h = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract i.j.d<T> b();

    public Throwable c(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T d(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            f.n.a.n.i.d(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        i.l.b.i.b(th);
        f.n.a.n.i.y(b().getContext(), new d0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object p;
        c1 c1Var;
        j.a.z1.h hVar = this.f8837g;
        try {
            j.a.y1.e eVar = (j.a.y1.e) b();
            i.j.d<T> dVar = eVar.f8805j;
            Object obj = eVar.f8807l;
            i.j.f context = dVar.getContext();
            Object b = j.a.y1.u.b(context, obj);
            u1<?> j0 = b != j.a.y1.u.a ? f.n.a.n.i.j0(dVar, context, b) : null;
            i.j.f context2 = dVar.getContext();
            Object g2 = g();
            Throwable c = c(g2);
            if (c == null && e.a(this.f8764h)) {
                int i2 = c1.f8737e;
                c1Var = (c1) context2.get(c1.a.f8738f);
            } else {
                c1Var = null;
            }
            if (c1Var != null && !c1Var.a()) {
                CancellationException v = c1Var.v();
                a(g2, v);
                dVar.h(f.n.a.n.i.p(v));
            } else if (c != null) {
                dVar.h(f.n.a.n.i.p(c));
            } else {
                dVar.h(d(g2));
            }
            Object obj2 = i.h.a;
            if (j0 == null || j0.c0()) {
                j.a.y1.u.a(context, b);
            }
            try {
                hVar.a();
            } catch (Throwable th) {
                obj2 = f.n.a.n.i.p(th);
            }
            f(null, i.e.a(obj2));
        } catch (Throwable th2) {
            try {
                hVar.a();
                p = i.h.a;
            } catch (Throwable th3) {
                p = f.n.a.n.i.p(th3);
            }
            f(th2, i.e.a(p));
        }
    }
}

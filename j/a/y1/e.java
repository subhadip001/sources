package j.a.y1;

import j.a.e0;
import j.a.k0;
import j.a.p0;
import j.a.s1;
import j.a.y1.u;
import j.a.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class e<T> extends k0<T> implements i.j.j.a.d, i.j.d<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8803m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: i  reason: collision with root package name */
    public final z f8804i;

    /* renamed from: j  reason: collision with root package name */
    public final i.j.d<T> f8805j;

    /* renamed from: k  reason: collision with root package name */
    public Object f8806k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f8807l;

    /* JADX WARN: Multi-variable type inference failed */
    public e(z zVar, i.j.d<? super T> dVar) {
        super(-1);
        this.f8804i = zVar;
        this.f8805j = dVar;
        this.f8806k = f.a;
        i.j.f context = getContext();
        s sVar = u.a;
        Object fold = context.fold(0, u.a.f8822g);
        i.l.b.i.b(fold);
        this.f8807l = fold;
        this._reusableCancellableContinuation = null;
    }

    @Override // j.a.k0
    public void a(Object obj, Throwable th) {
        if (obj instanceof j.a.s) {
            ((j.a.s) obj).b.b(th);
        }
    }

    @Override // j.a.k0
    public i.j.d<T> b() {
        return this;
    }

    @Override // i.j.j.a.d
    public i.j.j.a.d e() {
        i.j.d<T> dVar = this.f8805j;
        if (dVar instanceof i.j.j.a.d) {
            return (i.j.j.a.d) dVar;
        }
        return null;
    }

    @Override // j.a.k0
    public Object g() {
        Object obj = this.f8806k;
        this.f8806k = f.a;
        return obj;
    }

    @Override // i.j.d
    public i.j.f getContext() {
        return this.f8805j.getContext();
    }

    @Override // i.j.d
    public void h(Object obj) {
        i.j.f context = this.f8805j.getContext();
        Object g0 = f.n.a.n.i.g0(obj, null);
        if (this.f8804i.g0(context)) {
            this.f8806k = g0;
            this.f8764h = 0;
            this.f8804i.d0(context, this);
            return;
        }
        s1 s1Var = s1.a;
        p0 a = s1.a();
        if (a.s0()) {
            this.f8806k = g0;
            this.f8764h = 0;
            a.q0(this);
            return;
        }
        a.r0(true);
        try {
            i.j.f context2 = getContext();
            Object b = u.b(context2, this.f8807l);
            this.f8805j.h(obj);
            u.a(context2, b);
            do {
            } while (a.u0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean k() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean l(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            s sVar = f.b;
            if (i.l.b.i.a(obj, sVar)) {
                if (f8803m.compareAndSet(this, sVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f8803m.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void m() {
        do {
        } while (this._reusableCancellableContinuation == f.b);
        Object obj = this._reusableCancellableContinuation;
        j.a.i iVar = obj instanceof j.a.i ? (j.a.i) obj : null;
        if (iVar != null) {
            iVar.o();
        }
    }

    public final Throwable n(j.a.h<?> hVar) {
        s sVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            sVar = f.b;
            if (obj != sVar) {
                if (obj instanceof Throwable) {
                    if (f8803m.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!f8803m.compareAndSet(this, sVar, hVar));
        return null;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("DispatchedContinuation[");
        A.append(this.f8804i);
        A.append(", ");
        A.append(e0.c(this.f8805j));
        A.append(']');
        return A.toString();
    }
}

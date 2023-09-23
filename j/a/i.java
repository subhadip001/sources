package j.a;

import j.a.c1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public class i<T> extends k0<T> implements h<T>, i.j.j.a.d {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8755l = AtomicIntegerFieldUpdater.newUpdater(i.class, "_decision");

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8756m = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: i  reason: collision with root package name */
    public final i.j.d<T> f8757i;

    /* renamed from: j  reason: collision with root package name */
    public final i.j.f f8758j;

    /* renamed from: k  reason: collision with root package name */
    public m0 f8759k;

    /* JADX WARN: Multi-variable type inference failed */
    public i(i.j.d<? super T> dVar, int i2) {
        super(i2);
        this.f8757i = dVar;
        this.f8758j = dVar.getContext();
        this._decision = 0;
        this._state = b.f8733f;
    }

    public static void z(i iVar, Object obj, int i2, i.l.a.l lVar, int i3, Object obj2) {
        Object obj3;
        Object obj4;
        int i4 = i3 & 4;
        do {
            obj3 = iVar._state;
            if (obj3 instanceof m1) {
                m1 m1Var = (m1) obj3;
                if (!(obj instanceof r) && e.a(i2) && (m1Var instanceof f)) {
                    obj4 = new q(obj, m1Var instanceof f ? (f) m1Var : null, null, null, null, 16);
                } else {
                    obj4 = obj;
                }
            } else {
                if (obj3 instanceof j) {
                    j jVar = (j) obj3;
                    Objects.requireNonNull(jVar);
                    if (j.c.compareAndSet(jVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!f8756m.compareAndSet(iVar, obj3, obj4));
        iVar.p();
        iVar.q(i2);
    }

    @Override // j.a.k0
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof m1)) {
                if (obj2 instanceof r) {
                    return;
                }
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (!(qVar.f8775e != null)) {
                        if (f8756m.compareAndSet(this, obj2, q.a(qVar, null, null, null, null, th, 15))) {
                            f fVar = qVar.b;
                            if (fVar != null) {
                                l(fVar, th);
                            }
                            i.l.a.l<Throwable, i.h> lVar = qVar.c;
                            if (lVar != null) {
                                m(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f8756m.compareAndSet(this, obj2, new q(obj2, null, null, null, th, 14))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // j.a.k0
    public final i.j.d<T> b() {
        return this.f8757i;
    }

    @Override // j.a.k0
    public Throwable c(Object obj) {
        Throwable c = super.c(obj);
        if (c != null) {
            return c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.a.k0
    public <T> T d(Object obj) {
        return obj instanceof q ? (T) ((q) obj).a : obj;
    }

    @Override // i.j.j.a.d
    public i.j.j.a.d e() {
        i.j.d<T> dVar = this.f8757i;
        if (dVar instanceof i.j.j.a.d) {
            return (i.j.j.a.d) dVar;
        }
        return null;
    }

    @Override // j.a.k0
    public Object g() {
        return this._state;
    }

    @Override // i.j.d
    public i.j.f getContext() {
        return this.f8758j;
    }

    @Override // i.j.d
    public void h(Object obj) {
        Throwable a = i.e.a(obj);
        if (a != null) {
            obj = new r(a, false, 2);
        }
        z(this, obj, this.f8764h, null, 4, null);
    }

    @Override // j.a.h
    public void i(i.l.a.l<? super Throwable, i.h> lVar) {
        f z0Var = lVar instanceof f ? (f) lVar : new z0(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                if (f8756m.compareAndSet(this, obj, z0Var)) {
                    return;
                }
            } else {
                if (!(obj instanceof f)) {
                    boolean z = obj instanceof r;
                    if (z) {
                        r rVar = (r) obj;
                        Objects.requireNonNull(rVar);
                        if (r.b.compareAndSet(rVar, 0, 1)) {
                            if (obj instanceof j) {
                                if (!z) {
                                    rVar = null;
                                }
                                k(lVar, rVar != null ? rVar.a : null);
                                return;
                            }
                            return;
                        }
                        w(lVar, obj);
                        throw null;
                    } else if (obj instanceof q) {
                        q qVar = (q) obj;
                        if (qVar.b == null) {
                            Throwable th = qVar.f8775e;
                            if (th != null) {
                                k(lVar, th);
                                return;
                            } else {
                                if (f8756m.compareAndSet(this, obj, q.a(qVar, null, z0Var, null, null, null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            w(lVar, obj);
                            throw null;
                        }
                    } else {
                        if (f8756m.compareAndSet(this, obj, new q(obj, z0Var, null, null, null, 28))) {
                            return;
                        }
                    }
                } else {
                    w(lVar, obj);
                    throw null;
                }
            }
        }
    }

    @Override // j.a.h
    public void j(z zVar, T t) {
        i.j.d<T> dVar = this.f8757i;
        j.a.y1.e eVar = dVar instanceof j.a.y1.e ? (j.a.y1.e) dVar : null;
        z(this, t, (eVar != null ? eVar.f8804i : null) == zVar ? 4 : this.f8764h, null, 4, null);
    }

    public final void k(i.l.a.l<? super Throwable, i.h> lVar, Throwable th) {
        try {
            lVar.b(th);
        } catch (Throwable th2) {
            i.j.f fVar = this.f8758j;
            f.n.a.n.i.y(fVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(f fVar, Throwable th) {
        try {
            fVar.a(th);
        } catch (Throwable th2) {
            i.j.f fVar2 = this.f8758j;
            f.n.a.n.i.y(fVar2, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(i.l.a.l<? super Throwable, i.h> lVar, Throwable th) {
        try {
            lVar.b(th);
        } catch (Throwable th2) {
            i.j.f fVar = this.f8758j;
            f.n.a.n.i.y(fVar, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public boolean n(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof m1)) {
                return false;
            }
            z = obj instanceof f;
        } while (!f8756m.compareAndSet(this, obj, new j(this, th, z)));
        f fVar = z ? (f) obj : null;
        if (fVar != null) {
            l(fVar, th);
        }
        p();
        q(this.f8764h);
        return true;
    }

    public final void o() {
        m0 m0Var = this.f8759k;
        if (m0Var == null) {
            return;
        }
        m0Var.dispose();
        this.f8759k = l1.f8765f;
    }

    public final void p() {
        if (v()) {
            return;
        }
        o();
    }

    /* JADX WARN: Finally extract failed */
    public final void q(int i2) {
        boolean z;
        while (true) {
            int i3 = this._decision;
            if (i3 == 0) {
                if (f8755l.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i3 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        i.j.d<T> b = b();
        boolean z2 = i2 == 4;
        if (!z2 && (b instanceof j.a.y1.e) && e.a(i2) == e.a(this.f8764h)) {
            z zVar = ((j.a.y1.e) b).f8804i;
            i.j.f context = b.getContext();
            if (zVar.g0(context)) {
                zVar.d0(context, this);
                return;
            }
            s1 s1Var = s1.a;
            p0 a = s1.a();
            if (a.s0()) {
                a.q0(this);
                return;
            }
            a.r0(true);
            try {
                e.b(this, b(), true);
                do {
                } while (a.u0());
            } catch (Throwable th) {
                try {
                    f(th, null);
                } finally {
                    a.i0(true);
                }
            }
            return;
        }
        e.b(this, b, z2);
    }

    public Throwable r(c1 c1Var) {
        return ((g1) c1Var).v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r2 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r4.f8759k != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        return kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        r0 = r4._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        if ((r0 instanceof j.a.r) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        throw ((j.a.r) r0).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (j.a.e.a(r4.f8764h) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        r1 = r4.f8758j;
        r2 = j.a.c1.f8737e;
        r1 = (j.a.c1) r1.get(j.a.c1.a.f8738f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        if (r1.a() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        r1 = r1.v();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
        return d(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s() {
        /*
            r4 = this;
            boolean r0 = r4.v()
        L4:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = j.a.i.f8755l
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L4
            r2 = 1
        L23:
            if (r2 == 0) goto L34
            j.a.m0 r1 = r4.f8759k
            if (r1 != 0) goto L2c
            r4.u()
        L2c:
            if (r0 == 0) goto L31
            r4.y()
        L31:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L34:
            if (r0 == 0) goto L39
            r4.y()
        L39:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof j.a.r
            if (r1 == 0) goto L44
            j.a.r r0 = (j.a.r) r0
            java.lang.Throwable r0 = r0.a
            throw r0
        L44:
            int r1 = r4.f8764h
            boolean r1 = j.a.e.a(r1)
            if (r1 == 0) goto L68
            i.j.f r1 = r4.f8758j
            int r2 = j.a.c1.f8737e
            j.a.c1$a r2 = j.a.c1.a.f8738f
            i.j.f$a r1 = r1.get(r2)
            j.a.c1 r1 = (j.a.c1) r1
            if (r1 == 0) goto L68
            boolean r2 = r1.a()
            if (r2 != 0) goto L68
            java.util.concurrent.CancellationException r1 = r1.v()
            r4.a(r0, r1)
            throw r1
        L68:
            java.lang.Object r0 = r4.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.i.s():java.lang.Object");
    }

    public void t() {
        m0 u = u();
        if (u != null && (!(this._state instanceof m1))) {
            u.dispose();
            this.f8759k = l1.f8765f;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(e0.c(this.f8757i));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof m1) {
            str = "Active";
        } else {
            str = obj instanceof j ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(e0.b(this));
        return sb.toString();
    }

    public final m0 u() {
        i.j.f fVar = this.f8758j;
        int i2 = c1.f8737e;
        c1 c1Var = (c1) fVar.get(c1.a.f8738f);
        if (c1Var == null) {
            return null;
        }
        m0 C = f.n.a.n.i.C(c1Var, true, false, new k(this), 2, null);
        this.f8759k = C;
        return C;
    }

    public final boolean v() {
        return (this.f8764h == 2) && ((j.a.y1.e) this.f8757i).k();
    }

    public final void w(i.l.a.l<? super Throwable, i.h> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        Throwable n;
        i.j.d<T> dVar = this.f8757i;
        j.a.y1.e eVar = dVar instanceof j.a.y1.e ? (j.a.y1.e) dVar : null;
        if (eVar == null || (n = eVar.n(this)) == null) {
            return;
        }
        o();
        n(n);
    }
}

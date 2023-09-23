package j.a;

import i.j.f;
import j.a.c1;
import j.a.y1.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class g1 implements c1, n, n1 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8743f = AtomicReferenceFieldUpdater.newUpdater(g1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> extends i<T> {
        public final g1 n;

        public a(i.j.d<? super T> dVar, g1 g1Var) {
            super(dVar, 1);
            this.n = g1Var;
        }

        @Override // j.a.i
        public Throwable r(c1 c1Var) {
            Throwable d2;
            Object z = this.n.z();
            return (!(z instanceof c) || (d2 = ((c) z).d()) == null) ? z instanceof r ? ((r) z).a : ((g1) c1Var).v() : d2;
        }

        @Override // j.a.i
        public String x() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f1 {

        /* renamed from: j  reason: collision with root package name */
        public final g1 f8744j;

        /* renamed from: k  reason: collision with root package name */
        public final c f8745k;

        /* renamed from: l  reason: collision with root package name */
        public final m f8746l;

        /* renamed from: m  reason: collision with root package name */
        public final Object f8747m;

        public b(g1 g1Var, c cVar, m mVar, Object obj) {
            this.f8744j = g1Var;
            this.f8745k = cVar;
            this.f8746l = mVar;
            this.f8747m = obj;
        }

        @Override // i.l.a.l
        public /* bridge */ /* synthetic */ i.h b(Throwable th) {
            p(th);
            return i.h.a;
        }

        @Override // j.a.t
        public void p(Throwable th) {
            g1 g1Var = this.f8744j;
            c cVar = this.f8745k;
            m mVar = this.f8746l;
            Object obj = this.f8747m;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.f8743f;
            m I = g1Var.I(mVar);
            if (I == null || !g1Var.Y(cVar, I, obj)) {
                g1Var.c(g1Var.s(cVar, obj));
            }
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes2.dex */
    public static final class c implements x0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: f  reason: collision with root package name */
        public final k1 f8748f;

        public c(k1 k1Var, boolean z, Throwable th) {
            this.f8748f = k1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @Override // j.a.x0
        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                ?? r0 = this._exceptionsHolder;
                if (r0 == 0) {
                    this._exceptionsHolder = th;
                } else if (r0 instanceof Throwable) {
                    if (th == r0) {
                        return;
                    }
                    ArrayList<Throwable> c = c();
                    c.add(r0);
                    c.add(th);
                    this._exceptionsHolder = c;
                } else if (r0 instanceof ArrayList) {
                    ((ArrayList) r0).add(th);
                } else {
                    throw new IllegalStateException(("State is " + ((Object) r0)).toString());
                }
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        @Override // j.a.x0
        public k1 e() {
            return this.f8748f;
        }

        public final boolean f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return this._exceptionsHolder == h1.f8752e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            ?? r0 = this._exceptionsHolder;
            if (r0 == 0) {
                arrayList = c();
            } else if (r0 instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(r0);
                arrayList = c;
            } else if (!(r0 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + ((Object) r0)).toString());
            } else {
                arrayList = (ArrayList) r0;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !i.l.b.i.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = h1.f8752e;
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Finishing[cancelling=");
            A.append(f());
            A.append(", completing=");
            A.append((boolean) this._isCompleting);
            A.append(", rootCause=");
            A.append((Throwable) this._rootCause);
            A.append(", exceptions=");
            A.append(this._exceptionsHolder);
            A.append(", list=");
            A.append(this.f8748f);
            A.append(']');
            return A.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public static final class d extends j.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g1 f8749d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f8750e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j.a.y1.j jVar, g1 g1Var, Object obj) {
            super(jVar);
            this.f8749d = g1Var;
            this.f8750e = obj;
        }

        @Override // j.a.y1.c
        public Object c(j.a.y1.j jVar) {
            if (this.f8749d.z() == this.f8750e) {
                return null;
            }
            return j.a.y1.i.a;
        }
    }

    public g1(boolean z) {
        this._state = z ? h1.f8754g : h1.f8753f;
        this._parentHandle = null;
    }

    public boolean A(Throwable th) {
        return false;
    }

    public void B(Throwable th) {
        throw th;
    }

    @Override // j.a.n
    public final void C(n1 n1Var) {
        d(n1Var);
    }

    public final void D(c1 c1Var) {
        if (c1Var == null) {
            this._parentHandle = l1.f8765f;
            return;
        }
        c1Var.start();
        l X = c1Var.X(this);
        this._parentHandle = X;
        if (!(z() instanceof x0)) {
            X.dispose();
            this._parentHandle = l1.f8765f;
        }
    }

    public boolean E() {
        return false;
    }

    public final Object G(Object obj) {
        Object V;
        do {
            V = V(z(), obj);
            if (V == h1.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                r rVar = obj instanceof r ? (r) obj : null;
                throw new IllegalStateException(str, rVar != null ? rVar.a : null);
            }
        } while (V == h1.c);
        return V;
    }

    public String H() {
        return getClass().getSimpleName();
    }

    public final m I(j.a.y1.j jVar) {
        while (jVar.n()) {
            jVar = jVar.m();
        }
        while (true) {
            jVar = jVar.l();
            if (!jVar.n()) {
                if (jVar instanceof m) {
                    return (m) jVar;
                }
                if (jVar instanceof k1) {
                    return null;
                }
            }
        }
    }

    public final void J(k1 k1Var, Throwable th) {
        K();
        CompletionHandlerException completionHandlerException = null;
        for (j.a.y1.j jVar = (j.a.y1.j) k1Var.j(); !i.l.b.i.a(jVar, k1Var); jVar = jVar.l()) {
            if (jVar instanceof d1) {
                f1 f1Var = (f1) jVar;
                try {
                    f1Var.p(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        f.n.a.n.i.d(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            B(completionHandlerException);
        }
        k(th);
    }

    public void K() {
    }

    public void L(Object obj) {
    }

    @Override // j.a.n1
    public CancellationException O() {
        Throwable th;
        Object z = z();
        if (z instanceof c) {
            th = ((c) z).d();
        } else if (z instanceof r) {
            th = ((r) z).a;
        } else if (z instanceof x0) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + z).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            StringBuilder A = f.a.b.a.a.A("Parent job is ");
            A.append(S(z));
            return new JobCancellationException(A.toString(), th, this);
        }
        return cancellationException;
    }

    public void P() {
    }

    public final void Q(f1 f1Var) {
        k1 k1Var = new k1();
        j.a.y1.j.f8814g.lazySet(k1Var, f1Var);
        j.a.y1.j.f8813f.lazySet(k1Var, f1Var);
        while (true) {
            if (f1Var.j() != f1Var) {
                break;
            } else if (j.a.y1.j.f8813f.compareAndSet(f1Var, f1Var, k1Var)) {
                k1Var.i(f1Var);
                break;
            }
        }
        f8743f.compareAndSet(this, f1Var, f1Var.l());
    }

    public final int R(Object obj) {
        if (obj instanceof o0) {
            if (((o0) obj).f8768f) {
                return 0;
            }
            if (f8743f.compareAndSet(this, obj, h1.f8754g)) {
                P();
                return 1;
            }
            return -1;
        } else if (obj instanceof w0) {
            if (f8743f.compareAndSet(this, obj, ((w0) obj).f8790f)) {
                P();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    public final String S(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof x0 ? ((x0) obj).a() ? "Active" : "New" : obj instanceof r ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    @Override // j.a.c1
    public void T(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(m(), null, this);
        }
        d(cancellationException);
    }

    public final CancellationException U(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = m();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final Object V(Object obj, Object obj2) {
        if (!(obj instanceof x0)) {
            return h1.a;
        }
        boolean z = false;
        if (((obj instanceof o0) || (obj instanceof f1)) && !(obj instanceof m) && !(obj2 instanceof r)) {
            x0 x0Var = (x0) obj;
            if (f8743f.compareAndSet(this, x0Var, obj2 instanceof x0 ? new y0((x0) obj2) : obj2)) {
                K();
                L(obj2);
                o(x0Var, obj2);
                z = true;
            }
            return z ? obj2 : h1.c;
        }
        x0 x0Var2 = (x0) obj;
        k1 x = x(x0Var2);
        if (x == null) {
            return h1.c;
        }
        m mVar = null;
        c cVar = x0Var2 instanceof c ? (c) x0Var2 : null;
        if (cVar == null) {
            cVar = new c(x, false, null);
        }
        synchronized (cVar) {
            if (cVar.g()) {
                return h1.a;
            }
            cVar.j(true);
            if (cVar != x0Var2 && !f8743f.compareAndSet(this, x0Var2, cVar)) {
                return h1.c;
            }
            boolean f2 = cVar.f();
            r rVar = obj2 instanceof r ? (r) obj2 : null;
            if (rVar != null) {
                cVar.b(rVar.a);
            }
            Throwable d2 = cVar.d();
            if (!Boolean.valueOf(!f2).booleanValue()) {
                d2 = null;
            }
            if (d2 != null) {
                J(x, d2);
            }
            m mVar2 = x0Var2 instanceof m ? (m) x0Var2 : null;
            if (mVar2 == null) {
                k1 e2 = x0Var2.e();
                if (e2 != null) {
                    mVar = I(e2);
                }
            } else {
                mVar = mVar2;
            }
            if (mVar != null && Y(cVar, mVar, obj2)) {
                return h1.b;
            }
            return s(cVar, obj2);
        }
    }

    @Override // j.a.c1
    public final l X(n nVar) {
        return (l) f.n.a.n.i.C(this, true, false, new m(nVar), 2, null);
    }

    public final boolean Y(c cVar, m mVar, Object obj) {
        while (f.n.a.n.i.C(mVar.f8766j, false, false, new b(this, cVar, mVar, obj), 1, null) == l1.f8765f) {
            mVar = I(mVar);
            if (mVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // j.a.c1
    public boolean a() {
        Object z = z();
        return (z instanceof x0) && ((x0) z).a();
    }

    public final boolean b(Object obj, k1 k1Var, f1 f1Var) {
        char c2;
        d dVar = new d(f1Var, this, obj);
        do {
            j.a.y1.j m2 = k1Var.m();
            j.a.y1.j.f8814g.lazySet(f1Var, m2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j.a.y1.j.f8813f;
            atomicReferenceFieldUpdater.lazySet(f1Var, k1Var);
            dVar.c = k1Var;
            if (atomicReferenceFieldUpdater.compareAndSet(m2, k1Var, dVar)) {
                c2 = dVar.a(m2) == null ? (char) 1 : (char) 2;
            } else {
                c2 = 0;
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void c(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.g1.d(java.lang.Object):boolean");
    }

    @Override // i.j.f
    public <R> R fold(R r, i.l.a.p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0222a.a(this, r, pVar);
    }

    @Override // i.j.f.a, i.j.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0222a.b(this, bVar);
    }

    @Override // i.j.f.a
    public final f.b<?> getKey() {
        return c1.a.f8738f;
    }

    public final boolean k(Throwable th) {
        if (E()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        l lVar = (l) this._parentHandle;
        return (lVar == null || lVar == l1.f8765f) ? z : lVar.g(th) || z;
    }

    public String m() {
        return "Job was cancelled";
    }

    @Override // i.j.f
    public i.j.f minusKey(f.b<?> bVar) {
        return f.a.C0222a.c(this, bVar);
    }

    public boolean n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return d(th) && u();
    }

    public final void o(x0 x0Var, Object obj) {
        l lVar = (l) this._parentHandle;
        if (lVar != null) {
            lVar.dispose();
            this._parentHandle = l1.f8765f;
        }
        CompletionHandlerException completionHandlerException = null;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th = rVar != null ? rVar.a : null;
        if (x0Var instanceof f1) {
            try {
                ((f1) x0Var).p(th);
                return;
            } catch (Throwable th2) {
                B(new CompletionHandlerException("Exception in completion handler " + x0Var + " for " + this, th2));
                return;
            }
        }
        k1 e2 = x0Var.e();
        if (e2 != null) {
            for (j.a.y1.j jVar = (j.a.y1.j) e2.j(); !i.l.b.i.a(jVar, e2); jVar = jVar.l()) {
                if (jVar instanceof f1) {
                    f1 f1Var = (f1) jVar;
                    try {
                        f1Var.p(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            f.n.a.n.i.d(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                B(completionHandlerException);
            }
        }
    }

    @Override // i.j.f
    public i.j.f plus(i.j.f fVar) {
        return f.a.C0222a.d(this, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [j.a.w0] */
    @Override // j.a.c1
    public final m0 q(boolean z, boolean z2, i.l.a.l<? super Throwable, i.h> lVar) {
        f1 f1Var;
        Throwable th;
        if (z) {
            f1Var = lVar instanceof d1 ? (d1) lVar : null;
            if (f1Var == null) {
                f1Var = new a1(lVar);
            }
        } else {
            f1Var = lVar instanceof f1 ? (f1) lVar : null;
            if (f1Var == null) {
                f1Var = new b1(lVar);
            }
        }
        f1Var.f8742i = this;
        while (true) {
            Object z3 = z();
            if (z3 instanceof o0) {
                o0 o0Var = (o0) z3;
                if (o0Var.f8768f) {
                    if (f8743f.compareAndSet(this, z3, f1Var)) {
                        return f1Var;
                    }
                } else {
                    k1 k1Var = new k1();
                    if (!o0Var.f8768f) {
                        k1Var = new w0(k1Var);
                    }
                    f8743f.compareAndSet(this, o0Var, k1Var);
                }
            } else if (z3 instanceof x0) {
                k1 e2 = ((x0) z3).e();
                if (e2 == null) {
                    Objects.requireNonNull(z3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((f1) z3);
                } else {
                    m0 m0Var = l1.f8765f;
                    if (z && (z3 instanceof c)) {
                        synchronized (z3) {
                            th = ((c) z3).d();
                            if (th == null || ((lVar instanceof m) && !((c) z3).g())) {
                                if (b(z3, e2, f1Var)) {
                                    if (th == null) {
                                        return f1Var;
                                    }
                                    m0Var = f1Var;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.b(th);
                        }
                        return m0Var;
                    } else if (b(z3, e2, f1Var)) {
                        return f1Var;
                    }
                }
            } else {
                if (z2) {
                    r rVar = z3 instanceof r ? (r) z3 : null;
                    lVar.b(rVar != null ? rVar.a : null);
                }
                return l1.f8765f;
            }
        }
    }

    public final Throwable r(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(m(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((n1) obj).O();
    }

    public final Object s(c cVar, Object obj) {
        boolean f2;
        Throwable t;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th = rVar != null ? rVar.a : null;
        synchronized (cVar) {
            f2 = cVar.f();
            List<Throwable> i2 = cVar.i(th);
            t = t(cVar, i2);
            if (t != null && i2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i2.size()));
                for (Throwable th2 : i2) {
                    if (th2 != t && th2 != t && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        f.n.a.n.i.d(t, th2);
                    }
                }
            }
        }
        if (t != null && t != th) {
            obj = new r(t, false, 2);
        }
        if (t != null) {
            if (k(t) || A(t)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                r.b.compareAndSet((r) obj, 0, 1);
            }
        }
        if (!f2) {
            K();
        }
        L(obj);
        f8743f.compareAndSet(this, cVar, obj instanceof x0 ? new y0((x0) obj) : obj);
        o(cVar, obj);
        return obj;
    }

    @Override // j.a.c1
    public final boolean start() {
        int R;
        do {
            R = R(z());
            if (R == 0) {
                return false;
            }
        } while (R != 1);
        return true;
    }

    public final Throwable t(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new JobCancellationException(m(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(H() + '{' + S(z()) + '}');
        sb.append('@');
        sb.append(e0.b(this));
        return sb.toString();
    }

    public boolean u() {
        return true;
    }

    @Override // j.a.c1
    public final CancellationException v() {
        Object z = z();
        if (z instanceof c) {
            Throwable d2 = ((c) z).d();
            if (d2 != null) {
                return U(d2, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(z instanceof x0)) {
            if (z instanceof r) {
                return U(((r) z).a, null);
            }
            return new JobCancellationException(getClass().getSimpleName() + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public boolean w() {
        return false;
    }

    public final k1 x(x0 x0Var) {
        k1 e2 = x0Var.e();
        if (e2 == null) {
            if (x0Var instanceof o0) {
                return new k1();
            }
            if (x0Var instanceof f1) {
                Q((f1) x0Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + x0Var).toString());
        }
        return e2;
    }

    public final l y() {
        return (l) this._parentHandle;
    }

    public final Object z() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof j.a.y1.o)) {
                return obj;
            }
            ((j.a.y1.o) obj).a(this);
        }
    }
}

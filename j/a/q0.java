package j.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class q0 extends r0 implements h0 {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8776k = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_queue");

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8777l = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public final class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final h<i.h> f8778h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, h<? super i.h> hVar) {
            super(j2);
            this.f8778h = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8778h.j(q0.this, i.h.a);
        }

        @Override // j.a.q0.b
        public String toString() {
            return super.toString() + this.f8778h;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public static abstract class b implements Runnable, Comparable<b>, m0, j.a.y1.w {
        private volatile Object _heap;

        /* renamed from: f  reason: collision with root package name */
        public long f8780f;

        /* renamed from: g  reason: collision with root package name */
        public int f8781g = -1;

        public b(long j2) {
            this.f8780f = j2;
        }

        @Override // j.a.y1.w
        public void a(j.a.y1.v<?> vVar) {
            if (this._heap != s0.a) {
                this._heap = vVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            int i2 = ((this.f8780f - bVar.f8780f) > 0L ? 1 : ((this.f8780f - bVar.f8780f) == 0L ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        @Override // j.a.y1.w
        public j.a.y1.v<?> d() {
            Object obj = this._heap;
            if (obj instanceof j.a.y1.v) {
                return (j.a.y1.v) obj;
            }
            return null;
        }

        @Override // j.a.m0
        public final synchronized void dispose() {
            Object obj = this._heap;
            j.a.y1.s sVar = s0.a;
            if (obj == sVar) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                synchronized (cVar) {
                    if (d() != null) {
                        cVar.d(getIndex());
                    }
                }
            }
            this._heap = sVar;
        }

        @Override // j.a.y1.w
        public void f(int i2) {
            this.f8781g = i2;
        }

        @Override // j.a.y1.w
        public int getIndex() {
            return this.f8781g;
        }

        public final synchronized int i(long j2, c cVar, q0 q0Var) {
            if (this._heap == s0.a) {
                return 2;
            }
            synchronized (cVar) {
                b b = cVar.b();
                if (q0.x0(q0Var)) {
                    return 1;
                }
                if (b == null) {
                    cVar.b = j2;
                } else {
                    long j3 = b.f8780f;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - cVar.b > 0) {
                        cVar.b = j2;
                    }
                }
                long j4 = this.f8780f;
                long j5 = cVar.b;
                if (j4 - j5 < 0) {
                    this.f8780f = j5;
                }
                cVar.a(this);
                return 0;
            }
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Delayed[nanos=");
            A.append(this.f8780f);
            A.append(']');
            return A.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j.a.y1.v<b> {
        public long b;

        public c(long j2) {
            this.b = j2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean x0(q0 q0Var) {
        return q0Var._isCompleted;
    }

    public boolean A0() {
        j.a.y1.a<k0<?>> aVar = this.f8773i;
        if (aVar == null || aVar.b == aVar.c) {
            c cVar = (c) this._delayed;
            if (cVar == null || cVar.c()) {
                Object obj = this._queue;
                if (obj == null) {
                    return true;
                }
                return obj instanceof j.a.y1.l ? ((j.a.y1.l) obj).d() : obj == s0.b;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void C0(long j2, b bVar) {
        int i2;
        Thread v0;
        b b2;
        b bVar2 = null;
        if (this._isCompleted != 0) {
            i2 = 1;
        } else {
            c cVar = (c) this._delayed;
            if (cVar == null) {
                f8777l.compareAndSet(this, null, new c(j2));
                Object obj = this._delayed;
                i.l.b.i.b(obj);
                cVar = (c) obj;
            }
            i2 = bVar.i(j2, cVar, this);
        }
        if (i2 != 0) {
            if (i2 == 1) {
                w0(j2, bVar);
                return;
            } else if (i2 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            } else {
                return;
            }
        }
        c cVar2 = (c) this._delayed;
        if (cVar2 != null) {
            synchronized (cVar2) {
                b2 = cVar2.b();
            }
            bVar2 = b2;
        }
        if (!(bVar2 == bVar) || Thread.currentThread() == (v0 = v0())) {
            return;
        }
        LockSupport.unpark(v0);
    }

    @Override // j.a.z
    public final void d0(i.j.f fVar, Runnable runnable) {
        y0(runnable);
    }

    @Override // j.a.h0
    public void p(long j2, h<? super i.h> hVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j3 + nanoTime, hVar);
            C0(nanoTime, aVar);
            hVar.i(new n0(aVar));
        }
    }

    @Override // j.a.p0
    public void shutdown() {
        b e2;
        s1 s1Var = s1.a;
        s1.b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f8776k.compareAndSet(this, null, s0.b)) {
                    break;
                }
            } else if (obj instanceof j.a.y1.l) {
                ((j.a.y1.l) obj).b();
                break;
            } else if (obj == s0.b) {
                break;
            } else {
                j.a.y1.l lVar = new j.a.y1.l(8, true);
                lVar.a((Runnable) obj);
                if (f8776k.compareAndSet(this, obj, lVar)) {
                    break;
                }
            }
        }
        do {
        } while (t0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (e2 = cVar.e()) == null) {
                return;
            }
            w0(nanoTime, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007e A[EDGE_INSN: B:98:0x007e->B:48:0x007e ?: BREAK  , SYNTHETIC] */
    @Override // j.a.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long t0() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.q0.t0():long");
    }

    public void y0(Runnable runnable) {
        if (z0(runnable)) {
            Thread v0 = v0();
            if (Thread.currentThread() != v0) {
                LockSupport.unpark(v0);
                return;
            }
            return;
        }
        f0.f8741m.y0(runnable);
    }

    public final boolean z0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f8776k.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof j.a.y1.l) {
                j.a.y1.l lVar = (j.a.y1.l) obj;
                int a2 = lVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f8776k.compareAndSet(this, obj, lVar.e());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == s0.b) {
                return false;
            } else {
                j.a.y1.l lVar2 = new j.a.y1.l(8, true);
                lVar2.a((Runnable) obj);
                lVar2.a(runnable);
                if (f8776k.compareAndSet(this, obj, lVar2)) {
                    return true;
                }
            }
        }
    }
}

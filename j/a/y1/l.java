package j.a.y1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public final class l<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public final int a;
    public final boolean b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f8820d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f8816e = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final s f8819h = new s("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8817f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8818g = AtomicLongFieldUpdater.newUpdater(l.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public a(i.l.b.e eVar) {
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    public l(int i2, boolean z) {
        this.a = i2;
        this.b = z;
        int i3 = i2 - 1;
        this.c = i3;
        this.f8820d = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L17
            r4 = 2
        L17:
            return r4
        L18:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r11 = r6.c
            int r5 = r12 + 2
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L33
            return r4
        L33:
            boolean r5 = r6.b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f8820d
            r14 = r12 & r11
            java.lang.Object r5 = r5.get(r14)
            if (r5 == 0) goto L52
            int r0 = r6.a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L51
            int r12 = r12 - r1
            r1 = r12 & r13
            int r0 = r0 >> 1
            if (r1 <= r0) goto L3
        L51:
            return r4
        L52:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = j.a.y1.l.f8818g
            r13 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r13 = r13 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r13 | r0
            r0 = r4
            r1 = r15
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f8820d
            r1 = r12 & r11
            r0.set(r1, r7)
            r0 = r6
        L73:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La1
            j.a.y1.l r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f8820d
            int r2 = r0.c
            r2 = r2 & r12
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof j.a.y1.l.b
            if (r2 == 0) goto L9e
            j.a.y1.l$b r1 = (j.a.y1.l.b) r1
            int r1 = r1.a
            if (r1 != r12) goto L9e
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f8820d
            int r2 = r0.c
            r2 = r2 & r12
            r1.set(r2, r7)
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 != 0) goto L73
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.y1.l.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f8818g.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<E> e() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) == 0) {
                long j3 = j2 | 1152921504606846976L;
                if (f8818g.compareAndSet(this, j2, j3)) {
                    j2 = j3;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            l<E> lVar = (l) this._next;
            if (lVar != null) {
                return lVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8817f;
            l lVar2 = new l(this.a * 2, this.b);
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.c;
                int i5 = i2 & i4;
                if (i5 != (i4 & i3)) {
                    Object obj = this.f8820d.get(i5);
                    if (obj == null) {
                        obj = new b(i2);
                    }
                    lVar2.f8820d.set(lVar2.c & i2, obj);
                    i2++;
                }
            }
            lVar2._state = (-1152921504606846977L) & j2;
            atomicReferenceFieldUpdater.compareAndSet(this, null, lVar2);
        }
    }

    public final Object f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f8819h;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.c;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f8820d.get(i5);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j3 = ((i2 + 1) & 1073741823) << 0;
                if (f8818g.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    this.f8820d.set(this.c & i2, null);
                    return obj;
                } else if (this.b) {
                    l<E> lVar = this;
                    while (true) {
                        long j4 = lVar._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            lVar = lVar.e();
                        } else {
                            if (f8818g.compareAndSet(lVar, j4, (j4 & (-1073741824)) | j3)) {
                                lVar.f8820d.set(lVar.c & i6, null);
                                lVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (lVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}

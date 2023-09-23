package j.a.y1;

import j.a.e0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8813f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8814g = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8815h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes2.dex */
    public static abstract class a extends c<j> {
        public final j b;
        public j c;

        public a(j jVar) {
            this.b = jVar;
        }

        @Override // j.a.y1.c
        public void b(j jVar, Object obj) {
            j jVar2 = jVar;
            boolean z = obj == null;
            j jVar3 = z ? this.b : this.c;
            if (jVar3 != null && j.f8813f.compareAndSet(jVar2, this, jVar3) && z) {
                j jVar4 = this.b;
                j jVar5 = this.c;
                i.l.b.i.b(jVar5);
                jVar4.i(jVar5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (j.a.y1.j.f8813f.compareAndSet(r2, r1, ((j.a.y1.p) r3).a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j.a.y1.j h(j.a.y1.o r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r7 = r6._prev
            j.a.y1.j r7 = (j.a.y1.j) r7
            r0 = 0
            r1 = r7
        L6:
            r2 = r0
        L7:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L18
            if (r7 != r1) goto Le
            return r1
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j.a.y1.j.f8814g
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L17
            goto L0
        L17:
            return r1
        L18:
            boolean r4 = r6.n()
            if (r4 == 0) goto L1f
            return r0
        L1f:
            if (r3 != 0) goto L22
            return r1
        L22:
            boolean r4 = r3 instanceof j.a.y1.o
            if (r4 == 0) goto L2c
            j.a.y1.o r3 = (j.a.y1.o) r3
            r3.a(r1)
            goto L0
        L2c:
            boolean r4 = r3 instanceof j.a.y1.p
            if (r4 == 0) goto L46
            if (r2 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = j.a.y1.j.f8813f
            j.a.y1.p r3 = (j.a.y1.p) r3
            j.a.y1.j r3 = r3.a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r1 = r2
            goto L6
        L41:
            java.lang.Object r1 = r1._prev
            j.a.y1.j r1 = (j.a.y1.j) r1
            goto L7
        L46:
            r2 = r3
            j.a.y1.j r2 = (j.a.y1.j) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.y1.j.h(j.a.y1.o):j.a.y1.j");
    }

    public final void i(j jVar) {
        j jVar2;
        do {
            jVar2 = (j) jVar._prev;
            if (j() != jVar) {
                return;
            }
        } while (!f8814g.compareAndSet(jVar, jVar2, this));
        if (n()) {
            jVar.h(null);
        }
    }

    public final Object j() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof o)) {
                return obj;
            }
            ((o) obj).a(this);
        }
    }

    public final j l() {
        j jVar;
        Object j2 = j();
        p pVar = j2 instanceof p ? (p) j2 : null;
        return (pVar == null || (jVar = pVar.a) == null) ? (j) j2 : jVar;
    }

    public final j m() {
        j h2 = h(null);
        if (h2 == null) {
            Object obj = this._prev;
            while (true) {
                h2 = (j) obj;
                if (!h2.n()) {
                    break;
                }
                obj = h2._prev;
            }
        }
        return h2;
    }

    public boolean n() {
        return j() instanceof p;
    }

    public boolean o() {
        j jVar;
        while (true) {
            Object j2 = j();
            if (!(j2 instanceof p)) {
                if (j2 == this) {
                    jVar = (j) j2;
                    break;
                }
                j jVar2 = (j) j2;
                p pVar = (p) jVar2._removedRef;
                if (pVar == null) {
                    pVar = new p(jVar2);
                    f8815h.lazySet(jVar2, pVar);
                }
                if (f8813f.compareAndSet(this, j2, pVar)) {
                    jVar = null;
                    jVar2.h(null);
                    break;
                }
            } else {
                jVar = ((p) j2).a;
                break;
            }
        }
        return jVar == null;
    }

    public String toString() {
        return new i.l.b.l(this) { // from class: j.a.y1.j.b
        } + '@' + e0.b(this);
    }
}

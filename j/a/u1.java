package j.a;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class u1<T> extends j.a.y1.r<T> {

    /* renamed from: i  reason: collision with root package name */
    public ThreadLocal<i.d<i.j.f, Object>> f8784i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u1(i.j.f r3, i.j.d<? super T> r4) {
        /*
            r2 = this;
            j.a.v1 r0 = j.a.v1.f8787f
            i.j.f$a r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            i.j.f r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8784i = r0
            i.j.f r4 = r4.getContext()
            int r0 = i.j.e.c
            i.j.e$a r0 = i.j.e.a.f8621f
            i.j.f$a r4 = r4.get(r0)
            boolean r4 = r4 instanceof j.a.z
            if (r4 != 0) goto L3a
            r4 = 0
            java.lang.Object r4 = j.a.y1.u.b(r3, r4)
            j.a.y1.u.a(r3, r4)
            java.lang.ThreadLocal<i.d<i.j.f, java.lang.Object>> r0 = r2.f8784i
            i.d r1 = new i.d
            r1.<init>(r3, r4)
            r0.set(r1)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.u1.<init>(i.j.f, i.j.d):void");
    }

    @Override // j.a.y1.r, j.a.a
    public void Z(Object obj) {
        i.d<i.j.f, Object> dVar = this.f8784i.get();
        if (dVar != null) {
            j.a.y1.u.a(dVar.f8606f, dVar.f8607g);
            this.f8784i.set(null);
        }
        Object P = f.n.a.n.i.P(obj, this.f8821h);
        i.j.d<T> dVar2 = this.f8821h;
        i.j.f context = dVar2.getContext();
        Object b = j.a.y1.u.b(context, null);
        u1<?> j0 = b != j.a.y1.u.a ? f.n.a.n.i.j0(dVar2, context, b) : null;
        try {
            this.f8821h.h(P);
        } finally {
            if (j0 == null || j0.c0()) {
                j.a.y1.u.a(context, b);
            }
        }
    }

    public final boolean c0() {
        if (this.f8784i.get() == null) {
            return false;
        }
        this.f8784i.set(null);
        return true;
    }
}

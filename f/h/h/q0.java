package f.h.h;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.Writer;
import f.h.h.u;
import f.h.h.z;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes2.dex */
public final class q0<T> implements a1<T> {
    public final n0 a;
    public final g1<?, ?> b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final r<?> f6425d;

    public q0(g1<?, ?> g1Var, r<?> rVar, n0 n0Var) {
        this.b = g1Var;
        this.c = rVar.e(n0Var);
        this.f6425d = rVar;
        this.a = n0Var;
    }

    @Override // f.h.h.a1
    public void a(T t, T t2) {
        g1<?, ?> g1Var = this.b;
        Class<?> cls = c1.a;
        g1Var.o(t, g1Var.k(g1Var.g(t), g1Var.g(t2)));
        if (this.c) {
            c1.B(this.f6425d, t, t2);
        }
    }

    @Override // f.h.h.a1
    public void b(T t, Writer writer) {
        Iterator<Map.Entry<?, Object>> m2 = this.f6425d.c(t).m();
        while (m2.hasNext()) {
            Map.Entry<?, Object> next = m2.next();
            u.a aVar = (u.a) next.getKey();
            if (aVar.h() == WireFormat$JavaType.MESSAGE && !aVar.b() && !aVar.isPacked()) {
                if (next instanceof z.b) {
                    ((m) writer).e(aVar.getNumber(), ((z.b) next).f6437f.getValue().b());
                } else {
                    ((m) writer).e(aVar.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        g1<?, ?> g1Var = this.b;
        g1Var.r(g1Var.g(t), writer);
    }

    @Override // f.h.h.a1
    public void c(T t) {
        this.b.j(t);
        this.f6425d.f(t);
    }

    @Override // f.h.h.a1
    public final boolean d(T t) {
        return this.f6425d.c(t).j();
    }

    @Override // f.h.h.a1
    public void e(T t, z0 z0Var, q qVar) {
        g1 g1Var = this.b;
        r rVar = this.f6425d;
        Object f2 = g1Var.f(t);
        u<ET> d2 = rVar.d(t);
        do {
            try {
                if (z0Var.B() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                g1Var.n(t, f2);
            }
        } while (k(z0Var, qVar, rVar, d2, g1Var, f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9 A[EDGE_INSN: B:57:0x00b9->B:34:0x00b9 ?: BREAK  , SYNTHETIC] */
    @Override // f.h.h.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(T r11, byte[] r12, int r13, int r14, f.h.h.e r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            f.h.h.h1 r1 = r0.unknownFields
            f.h.h.h1 r2 = f.h.h.h1.f6360f
            if (r1 != r2) goto Lf
            f.h.h.h1 r1 = f.h.h.h1.e()
            r0.unknownFields = r1
        Lf:
            com.google.protobuf.GeneratedMessageLite$c r11 = (com.google.protobuf.GeneratedMessageLite.c) r11
            f.h.h.u r11 = r11.a()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc4
            int r4 = f.h.b.c.a.d0(r12, r13, r15)
            int r13 = r15.a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L61
            r3 = r13 & 7
            if (r3 != r5) goto L5c
            f.h.h.r<?> r2 = r10.f6425d
            f.h.h.q r3 = r15.f6327d
            f.h.h.n0 r5 = r10.a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$e r8 = (com.google.protobuf.GeneratedMessageLite.e) r8
            if (r8 == 0) goto L51
            f.h.h.w0 r13 = f.h.h.w0.c
            f.h.h.n0 r2 = r8.c
            java.lang.Class r2 = r2.getClass()
            f.h.h.a1 r13 = r13.a(r2)
            int r13 = f.h.b.c.a.O(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r2 = r8.f1302d
            java.lang.Object r3 = r15.c
            r11.p(r2, r3)
            goto L5a
        L51:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = f.h.b.c.a.b0(r2, r3, r4, r5, r6, r7)
        L5a:
            r2 = r8
            goto L17
        L5c:
            int r13 = f.h.b.c.a.W0(r13, r12, r4, r14, r15)
            goto L17
        L61:
            r13 = 0
            r3 = r0
        L63:
            if (r4 >= r14) goto Lb9
            int r4 = f.h.b.c.a.d0(r12, r4, r15)
            int r6 = r15.a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L9a
            r9 = 3
            if (r7 == r9) goto L75
            goto Laf
        L75:
            if (r2 == 0) goto L8f
            f.h.h.w0 r6 = f.h.h.w0.c
            f.h.h.n0 r7 = r2.c
            java.lang.Class r7 = r7.getClass()
            f.h.h.a1 r6 = r6.a(r7)
            int r4 = f.h.b.c.a.O(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r6 = r2.f1302d
            java.lang.Object r7 = r15.c
            r11.p(r6, r7)
            goto L63
        L8f:
            if (r8 != r5) goto Laf
            int r4 = f.h.b.c.a.J(r12, r4, r15)
            java.lang.Object r3 = r15.c
            f.h.h.j r3 = (f.h.h.j) r3
            goto L63
        L9a:
            if (r8 != 0) goto Laf
            int r4 = f.h.b.c.a.d0(r12, r4, r15)
            int r13 = r15.a
            f.h.h.r<?> r2 = r10.f6425d
            f.h.h.q r6 = r15.f6327d
            f.h.h.n0 r7 = r10.a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$e r2 = (com.google.protobuf.GeneratedMessageLite.e) r2
            goto L63
        Laf:
            r7 = 12
            if (r6 != r7) goto Lb4
            goto Lb9
        Lb4:
            int r4 = f.h.b.c.a.W0(r6, r12, r4, r14, r15)
            goto L63
        Lb9:
            if (r3 == 0) goto Lc1
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.f(r13, r3)
        Lc1:
            r13 = r4
            goto L17
        Lc4:
            if (r13 != r14) goto Lc7
            return
        Lc7:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.q0.f(java.lang.Object, byte[], int, int, f.h.h.e):void");
    }

    @Override // f.h.h.a1
    public boolean g(T t, T t2) {
        if (this.b.g(t).equals(this.b.g(t2))) {
            if (this.c) {
                return this.f6425d.c(t).equals(this.f6425d.c(t2));
            }
            return true;
        }
        return false;
    }

    @Override // f.h.h.a1
    public int h(T t) {
        g1<?, ?> g1Var = this.b;
        int i2 = g1Var.i(g1Var.g(t)) + 0;
        if (this.c) {
            u<?> c = this.f6425d.c(t);
            int i3 = 0;
            for (int i4 = 0; i4 < c.a.d(); i4++) {
                i3 += c.h(c.a.c(i4));
            }
            for (Map.Entry<?, Object> entry : c.a.e()) {
                i3 += c.h(entry);
            }
            return i2 + i3;
        }
        return i2;
    }

    @Override // f.h.h.a1
    public T i() {
        return (T) this.a.newBuilderForType().buildPartial();
    }

    @Override // f.h.h.a1
    public int j(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.f6425d.c(t).hashCode() : hashCode;
    }

    public final <UT, UB, ET extends u.a<ET>> boolean k(z0 z0Var, q qVar, r<ET> rVar, u<ET> uVar, g1<UT, UB> g1Var, UB ub) {
        int a = z0Var.a();
        if (a != 11) {
            if ((a & 7) == 2) {
                Object b = rVar.b(qVar, this.a, a >>> 3);
                if (b != null) {
                    rVar.h(z0Var, b, qVar, uVar);
                    return true;
                }
                return g1Var.l(ub, z0Var);
            }
            return z0Var.J();
        }
        int i2 = 0;
        Object obj = null;
        j jVar = null;
        while (z0Var.B() != Integer.MAX_VALUE) {
            int a2 = z0Var.a();
            if (a2 == 16) {
                i2 = z0Var.p();
                obj = rVar.b(qVar, this.a, i2);
            } else if (a2 == 26) {
                if (obj != null) {
                    rVar.h(z0Var, obj, qVar, uVar);
                } else {
                    jVar = z0Var.G();
                }
            } else if (!z0Var.J()) {
                break;
            }
        }
        if (z0Var.a() == 12) {
            if (jVar != null) {
                if (obj != null) {
                    rVar.i(jVar, obj, qVar, uVar);
                } else {
                    g1Var.d(ub, i2, jVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.a();
    }
}

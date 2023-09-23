package f.h.h;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes2.dex */
public final class l implements z0 {
    public final k a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f6411d = 0;

    public l(k kVar) {
        Charset charset = y.a;
        this.a = kVar;
        kVar.f6378d = this;
    }

    @Override // f.h.h.z0
    @Deprecated
    public <T> T A(Class<T> cls, q qVar) {
        V(3);
        return (T) R(w0.c.a(cls), qVar);
    }

    @Override // f.h.h.z0
    public int B() {
        int i2 = this.f6411d;
        if (i2 != 0) {
            this.b = i2;
            this.f6411d = 0;
        } else {
            this.b = this.a.A();
        }
        int i3 = this.b;
        return (i3 == 0 || i3 == this.c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3 >>> 3;
    }

    @Override // f.h.h.z0
    public void C(List<String> list) {
        T(list, false);
    }

    @Override // f.h.h.z0
    public <T> T D(a1<T> a1Var, q qVar) {
        V(2);
        return (T) S(a1Var, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.h.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void E(java.util.Map<K, V> r8, f.h.h.g0.a<K, V> r9, f.h.h.q r10) {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            f.h.h.k r1 = r7.a
            int r1 = r1.B()
            f.h.h.k r2 = r7.a
            int r1 = r2.j(r1)
            K r2 = r9.b
            V r3 = r9.f6357d
        L14:
            int r4 = r7.B()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            f.h.h.k r5 = r7.a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.J()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.c     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f6357d     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.Q(r4, r5, r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.WireFormat$FieldType r4 = r9.a     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.Q(r4, r5, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.J()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            f.h.h.k r8 = r7.a
            r8.i(r1)
            return
        L65:
            r8 = move-exception
            f.h.h.k r9 = r7.a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.l.E(java.util.Map, f.h.h.g0$a, f.h.h.q):void");
    }

    @Override // f.h.h.z0
    public void F(List<String> list) {
        T(list, true);
    }

    @Override // f.h.h.z0
    public j G() {
        V(2);
        return this.a.l();
    }

    @Override // f.h.h.z0
    public void H(List<Float> list) {
        int A;
        int A2;
        if (list instanceof v) {
            v vVar = (v) list;
            int i2 = this.b & 7;
            if (i2 == 2) {
                int B = this.a.B();
                W(B);
                int d2 = this.a.d() + B;
                do {
                    vVar.b(this.a.q());
                } while (this.a.d() < d2);
                return;
            } else if (i2 == 5) {
                do {
                    vVar.b(this.a.q());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int B2 = this.a.B();
            W(B2);
            int d3 = this.a.d() + B2;
            do {
                list.add(Float.valueOf(this.a.q()));
            } while (this.a.d() < d3);
        } else if (i3 == 5) {
            do {
                list.add(Float.valueOf(this.a.q()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public int I() {
        V(0);
        return this.a.r();
    }

    @Override // f.h.h.z0
    public boolean J() {
        int i2;
        if (this.a.e() || (i2 = this.b) == this.c) {
            return false;
        }
        return this.a.D(i2);
    }

    @Override // f.h.h.z0
    public int K() {
        V(5);
        return this.a.u();
    }

    @Override // f.h.h.z0
    public void L(List<j> list) {
        int A;
        if ((this.b & 7) == 2) {
            do {
                list.add(G());
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // f.h.h.z0
    public void M(List<Double> list) {
        int A;
        int A2;
        if (list instanceof n) {
            n nVar = (n) list;
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    nVar.b(this.a.m());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int B = this.a.B();
                X(B);
                int d2 = this.a.d() + B;
                do {
                    nVar.b(this.a.m());
                } while (this.a.d() < d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Double.valueOf(this.a.m()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int B2 = this.a.B();
            X(B2);
            int d3 = this.a.d() + B2;
            do {
                list.add(Double.valueOf(this.a.m()));
            } while (this.a.d() < d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public long N() {
        V(0);
        return this.a.s();
    }

    @Override // f.h.h.z0
    public String O() {
        V(2);
        return this.a.z();
    }

    @Override // f.h.h.z0
    public void P(List<Long> list) {
        int A;
        int A2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    e0Var.b(this.a.p());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int B = this.a.B();
                X(B);
                int d2 = this.a.d() + B;
                do {
                    e0Var.b(this.a.p());
                } while (this.a.d() < d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int B2 = this.a.B();
            X(B2);
            int d3 = this.a.d() + B2;
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.d() < d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final Object Q(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, q qVar) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(N());
            case 3:
                return Long.valueOf(c());
            case 4:
                return Integer.valueOf(I());
            case 5:
                return Long.valueOf(d());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return O();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return i(cls, qVar);
            case 11:
                return G();
            case 12:
                return Integer.valueOf(p());
            case 13:
                return Integer.valueOf(u());
            case 14:
                return Integer.valueOf(K());
            case 15:
                return Long.valueOf(m());
            case 16:
                return Integer.valueOf(w());
            case 17:
                return Long.valueOf(x());
        }
    }

    public final <T> T R(a1<T> a1Var, q qVar) {
        int i2 = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T i3 = a1Var.i();
            a1Var.e(i3, this, qVar);
            a1Var.c(i3);
            if (this.b == this.c) {
                return i3;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.c = i2;
        }
    }

    public final <T> T S(a1<T> a1Var, q qVar) {
        k kVar;
        int B = this.a.B();
        k kVar2 = this.a;
        if (kVar2.a < kVar2.b) {
            int j2 = kVar2.j(B);
            T i2 = a1Var.i();
            this.a.a++;
            a1Var.e(i2, this, qVar);
            a1Var.c(i2);
            this.a.a(0);
            kVar.a--;
            this.a.i(j2);
            return i2;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void T(List<String> list, boolean z) {
        int A;
        int A2;
        if ((this.b & 7) == 2) {
            if ((list instanceof c0) && !z) {
                c0 c0Var = (c0) list;
                do {
                    c0Var.q(G());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            }
            do {
                list.add(z ? O() : z());
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void U(int i2) {
        if (this.a.d() != i2) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void V(int i2) {
        if ((this.b & 7) != i2) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final void W(int i2) {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void X(int i2) {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // f.h.h.z0
    public int a() {
        return this.b;
    }

    @Override // f.h.h.z0
    public void b(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof x) {
            x xVar = (x) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    xVar.b(this.a.w());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    xVar.b(this.a.w());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.w()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Integer.valueOf(this.a.w()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public long c() {
        V(0);
        return this.a.C();
    }

    @Override // f.h.h.z0
    public long d() {
        V(1);
        return this.a.p();
    }

    @Override // f.h.h.z0
    public void e(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof x) {
            x xVar = (x) list;
            int i2 = this.b & 7;
            if (i2 == 2) {
                int B = this.a.B();
                W(B);
                int d2 = this.a.d() + B;
                do {
                    xVar.b(this.a.u());
                } while (this.a.d() < d2);
                return;
            } else if (i2 == 5) {
                do {
                    xVar.b(this.a.u());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int B2 = this.a.B();
            W(B2);
            int d3 = this.a.d() + B2;
            do {
                list.add(Integer.valueOf(this.a.u()));
            } while (this.a.d() < d3);
        } else if (i3 == 5) {
            do {
                list.add(Integer.valueOf(this.a.u()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public void f(List<Long> list) {
        int A;
        int A2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    e0Var.b(this.a.x());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    e0Var.b(this.a.x());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.a.x()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Long.valueOf(this.a.x()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.h.z0
    @Deprecated
    public <T> void g(List<T> list, a1<T> a1Var, q qVar) {
        int A;
        int i2 = this.b;
        if ((i2 & 7) == 3) {
            do {
                list.add(R(a1Var, qVar));
                if (this.a.e() || this.f6411d != 0) {
                    return;
                }
                A = this.a.A();
            } while (A == i2);
            this.f6411d = A;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // f.h.h.z0
    public void h(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof x) {
            x xVar = (x) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    xVar.b(this.a.B());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    xVar.b(this.a.B());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.B()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Integer.valueOf(this.a.B()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public <T> T i(Class<T> cls, q qVar) {
        V(2);
        return (T) S(w0.c.a(cls), qVar);
    }

    @Override // f.h.h.z0
    public int j() {
        V(5);
        return this.a.o();
    }

    @Override // f.h.h.z0
    public boolean k() {
        V(0);
        return this.a.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.h.z0
    public <T> void l(List<T> list, a1<T> a1Var, q qVar) {
        int A;
        int i2 = this.b;
        if ((i2 & 7) == 2) {
            do {
                list.add(S(a1Var, qVar));
                if (this.a.e() || this.f6411d != 0) {
                    return;
                }
                A = this.a.A();
            } while (A == i2);
            this.f6411d = A;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // f.h.h.z0
    public long m() {
        V(1);
        return this.a.v();
    }

    @Override // f.h.h.z0
    public void n(List<Long> list) {
        int A;
        int A2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    e0Var.b(this.a.C());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    e0Var.b(this.a.C());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.a.C()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Long.valueOf(this.a.C()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    @Deprecated
    public <T> T o(a1<T> a1Var, q qVar) {
        V(3);
        return (T) R(a1Var, qVar);
    }

    @Override // f.h.h.z0
    public int p() {
        V(0);
        return this.a.B();
    }

    @Override // f.h.h.z0
    public void q(List<Long> list) {
        int A;
        int A2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    e0Var.b(this.a.s());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    e0Var.b(this.a.s());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.a.s()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Long.valueOf(this.a.s()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public void r(List<Long> list) {
        int A;
        int A2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    e0Var.b(this.a.v());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int B = this.a.B();
                X(B);
                int d2 = this.a.d() + B;
                do {
                    e0Var.b(this.a.v());
                } while (this.a.d() < d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int B2 = this.a.B();
            X(B2);
            int d3 = this.a.d() + B2;
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.d() < d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public double readDouble() {
        V(1);
        return this.a.m();
    }

    @Override // f.h.h.z0
    public float readFloat() {
        V(5);
        return this.a.q();
    }

    @Override // f.h.h.z0
    public void s(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof x) {
            x xVar = (x) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    xVar.b(this.a.r());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    xVar.b(this.a.r());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.r()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Integer.valueOf(this.a.r()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public void t(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof x) {
            x xVar = (x) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    xVar.b(this.a.n());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    xVar.b(this.a.n());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public int u() {
        V(0);
        return this.a.n();
    }

    @Override // f.h.h.z0
    public void v(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof x) {
            x xVar = (x) list;
            int i2 = this.b & 7;
            if (i2 == 2) {
                int B = this.a.B();
                W(B);
                int d2 = this.a.d() + B;
                do {
                    xVar.b(this.a.o());
                } while (this.a.d() < d2);
                return;
            } else if (i2 == 5) {
                do {
                    xVar.b(this.a.o());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int B2 = this.a.B();
            W(B2);
            int d3 = this.a.d() + B2;
            do {
                list.add(Integer.valueOf(this.a.o()));
            } while (this.a.d() < d3);
        } else if (i3 == 5) {
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public int w() {
        V(0);
        return this.a.w();
    }

    @Override // f.h.h.z0
    public long x() {
        V(0);
        return this.a.x();
    }

    @Override // f.h.h.z0
    public void y(List<Boolean> list) {
        int A;
        int A2;
        if (list instanceof g) {
            g gVar = (g) list;
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    gVar.b(this.a.k());
                    if (this.a.e()) {
                        return;
                    }
                    A2 = this.a.A();
                } while (A2 == this.b);
                this.f6411d = A2;
                return;
            } else if (i2 == 2) {
                int d2 = this.a.d() + this.a.B();
                do {
                    gVar.b(this.a.k());
                } while (this.a.d() < d2);
                U(d2);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.k()));
                if (this.a.e()) {
                    return;
                }
                A = this.a.A();
            } while (A == this.b);
            this.f6411d = A;
        } else if (i3 == 2) {
            int d3 = this.a.d() + this.a.B();
            do {
                list.add(Boolean.valueOf(this.a.k()));
            } while (this.a.d() < d3);
            U(d3);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // f.h.h.z0
    public String z() {
        V(2);
        return this.a.y();
    }
}

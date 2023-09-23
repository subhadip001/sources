package e.g.a;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class d {
    public static boolean p = false;
    public static int q = 1000;
    public static long r;
    public a c;

    /* renamed from: f  reason: collision with root package name */
    public b[] f2032f;

    /* renamed from: l  reason: collision with root package name */
    public final c f2038l;
    public a o;
    public boolean a = false;
    public int b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2030d = 32;

    /* renamed from: e  reason: collision with root package name */
    public int f2031e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2033g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f2034h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    public int f2035i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f2036j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2037k = 32;

    /* renamed from: m  reason: collision with root package name */
    public SolverVariable[] f2039m = new SolverVariable[q];
    public int n = 0;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        SolverVariable a(d dVar, boolean[] zArr);

        void b(SolverVariable solverVariable);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.f2032f = null;
        this.f2032f = new b[32];
        t();
        c cVar = new c();
        this.f2038l = cVar;
        this.c = new f(cVar);
        this.o = new b(cVar);
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable a2 = this.f2038l.c.a();
        if (a2 == null) {
            a2 = new SolverVariable(type);
            a2.n = type;
        } else {
            a2.f();
            a2.n = type;
        }
        int i2 = this.n;
        int i3 = q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            q = i4;
            this.f2039m = (SolverVariable[]) Arrays.copyOf(this.f2039m, i4);
        }
        SolverVariable[] solverVariableArr = this.f2039m;
        int i5 = this.n;
        this.n = i5 + 1;
        solverVariableArr[i5] = a2;
        return a2;
    }

    public void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        b m2 = m();
        if (solverVariable2 == solverVariable3) {
            m2.f2027d.d(solverVariable, 1.0f);
            m2.f2027d.d(solverVariable4, 1.0f);
            m2.f2027d.d(solverVariable2, -2.0f);
        } else if (f2 == 0.5f) {
            m2.f2027d.d(solverVariable, 1.0f);
            m2.f2027d.d(solverVariable2, -1.0f);
            m2.f2027d.d(solverVariable3, -1.0f);
            m2.f2027d.d(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                m2.b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            m2.f2027d.d(solverVariable, -1.0f);
            m2.f2027d.d(solverVariable2, 1.0f);
            m2.b = i2;
        } else if (f2 >= 1.0f) {
            m2.f2027d.d(solverVariable4, -1.0f);
            m2.f2027d.d(solverVariable3, 1.0f);
            m2.b = -i3;
        } else {
            float f3 = 1.0f - f2;
            m2.f2027d.d(solverVariable, f3 * 1.0f);
            m2.f2027d.d(solverVariable2, f3 * (-1.0f));
            m2.f2027d.d(solverVariable3, (-1.0f) * f2);
            m2.f2027d.d(solverVariable4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                m2.b = (i3 * f2) + ((-i2) * f3);
            }
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(e.g.a.b r17) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.d.c(e.g.a.b):void");
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        if (i3 == 8 && solverVariable2.f258k && solverVariable.f255h == -1) {
            solverVariable.g(this, solverVariable2.f257j + i2);
            return null;
        }
        b m2 = m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m2.b = i2;
        }
        if (!z) {
            m2.f2027d.d(solverVariable, -1.0f);
            m2.f2027d.d(solverVariable2, 1.0f);
        } else {
            m2.f2027d.d(solverVariable, 1.0f);
            m2.f2027d.d(solverVariable2, -1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.f255h;
        if (i3 == -1) {
            solverVariable.g(this, i2);
            for (int i4 = 0; i4 < this.b + 1; i4++) {
                SolverVariable solverVariable2 = this.f2038l.f2029d[i4];
            }
        } else if (i3 != -1) {
            b bVar = this.f2032f[i3];
            if (bVar.f2028e) {
                bVar.b = i2;
            } else if (bVar.f2027d.a() == 0) {
                bVar.f2028e = true;
                bVar.b = i2;
            } else {
                b m2 = m();
                if (i2 < 0) {
                    m2.b = i2 * (-1);
                    m2.f2027d.d(solverVariable, 1.0f);
                } else {
                    m2.b = i2;
                    m2.f2027d.d(solverVariable, -1.0f);
                }
                c(m2);
            }
        } else {
            b m3 = m();
            m3.a = solverVariable;
            float f2 = i2;
            solverVariable.f257j = f2;
            m3.b = f2;
            m3.f2028e = true;
            c(m3);
        }
    }

    public void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        b m2 = m();
        SolverVariable n = n();
        n.f256i = 0;
        m2.e(solverVariable, solverVariable2, n, i2);
        if (i3 != 8) {
            m2.f2027d.d(k(i3, null), (int) (m2.f2027d.j(n) * (-1.0f)));
        }
        c(m2);
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        b m2 = m();
        SolverVariable n = n();
        n.f256i = 0;
        m2.f(solverVariable, solverVariable2, n, i2);
        if (i3 != 8) {
            m2.f2027d.d(k(i3, null), (int) (m2.f2027d.j(n) * (-1.0f)));
        }
        c(m2);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2, int i2) {
        b m2 = m();
        m2.d(solverVariable, solverVariable2, solverVariable3, solverVariable4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(b bVar) {
        int i2;
        if (bVar.f2028e) {
            bVar.a.g(this, bVar.b);
        } else {
            b[] bVarArr = this.f2032f;
            int i3 = this.f2036j;
            bVarArr[i3] = bVar;
            SolverVariable solverVariable = bVar.a;
            solverVariable.f255h = i3;
            this.f2036j = i3 + 1;
            solverVariable.i(this, bVar);
        }
        if (this.a) {
            int i4 = 0;
            while (i4 < this.f2036j) {
                if (this.f2032f[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f2032f;
                if (bVarArr2[i4] != null && bVarArr2[i4].f2028e) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.a.g(this, bVar2.b);
                    this.f2038l.b.b(bVar2);
                    this.f2032f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f2036j;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f2032f;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.f255h == i5) {
                            bVarArr3[i7].a.f255h = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f2032f[i6] = null;
                    }
                    this.f2036j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    public final void j() {
        for (int i2 = 0; i2 < this.f2036j; i2++) {
            b bVar = this.f2032f[i2];
            bVar.a.f257j = bVar.b;
        }
    }

    public SolverVariable k(int i2, String str) {
        if (this.f2035i + 1 >= this.f2031e) {
            p();
        }
        SolverVariable a2 = a(SolverVariable.Type.ERROR, str);
        int i3 = this.b + 1;
        this.b = i3;
        this.f2035i++;
        a2.f254g = i3;
        a2.f256i = i2;
        this.f2038l.f2029d[i3] = a2;
        this.c.b(a2);
        return a2;
    }

    public SolverVariable l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f2035i + 1 >= this.f2031e) {
            p();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f266i;
            if (solverVariable == null) {
                constraintAnchor.i();
                solverVariable = constraintAnchor.f266i;
            }
            int i2 = solverVariable.f254g;
            if (i2 == -1 || i2 > this.b || this.f2038l.f2029d[i2] == null) {
                if (i2 != -1) {
                    solverVariable.f();
                }
                int i3 = this.b + 1;
                this.b = i3;
                this.f2035i++;
                solverVariable.f254g = i3;
                solverVariable.n = SolverVariable.Type.UNRESTRICTED;
                this.f2038l.f2029d[i3] = solverVariable;
            }
        }
        return solverVariable;
    }

    public b m() {
        b a2 = this.f2038l.b.a();
        if (a2 == null) {
            a2 = new b(this.f2038l);
            r++;
        } else {
            a2.a = null;
            a2.f2027d.clear();
            a2.b = 0.0f;
            a2.f2028e = false;
        }
        SolverVariable.s++;
        return a2;
    }

    public SolverVariable n() {
        if (this.f2035i + 1 >= this.f2031e) {
            p();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, null);
        int i2 = this.b + 1;
        this.b = i2;
        this.f2035i++;
        a2.f254g = i2;
        this.f2038l.f2029d[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f266i;
        if (solverVariable != null) {
            return (int) (solverVariable.f257j + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.f2030d * 2;
        this.f2030d = i2;
        this.f2032f = (b[]) Arrays.copyOf(this.f2032f, i2);
        c cVar = this.f2038l;
        cVar.f2029d = (SolverVariable[]) Arrays.copyOf(cVar.f2029d, this.f2030d);
        int i3 = this.f2030d;
        this.f2034h = new boolean[i3];
        this.f2031e = i3;
        this.f2037k = i3;
    }

    public void q() {
        if (this.c.isEmpty()) {
            j();
        } else if (!this.f2033g) {
            r(this.c);
        } else {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2036j) {
                    z = true;
                    break;
                } else if (!this.f2032f[i2].f2028e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                r(this.c);
            } else {
                j();
            }
        }
    }

    public void r(a aVar) {
        float f2;
        int i2;
        boolean z;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.f2036j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f2032f;
            if (bVarArr[i3].a.n != SolverVariable.Type.UNRESTRICTED && bVarArr[i3].b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.f2036j) {
                    b bVar = this.f2032f[i5];
                    if (bVar.a.n != SolverVariable.Type.UNRESTRICTED && !bVar.f2028e && bVar.b < f2) {
                        int a2 = bVar.f2027d.a();
                        int i9 = 0;
                        while (i9 < a2) {
                            SolverVariable e2 = bVar.f2027d.e(i9);
                            float j2 = bVar.f2027d.j(e2);
                            if (j2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = e2.f259l[i10] / j2;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i7 = e2.f254g;
                                        i8 = i10;
                                        f3 = f4;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i5++;
                    f2 = 0.0f;
                }
                if (i6 != -1) {
                    b bVar2 = this.f2032f[i6];
                    bVar2.a.f255h = -1;
                    bVar2.j(this.f2038l.f2029d[i7]);
                    SolverVariable solverVariable = bVar2.a;
                    solverVariable.f255h = i6;
                    solverVariable.i(this, bVar2);
                } else {
                    z2 = true;
                }
                if (i4 > this.f2035i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i2 = 0; i2 < this.f2035i; i2++) {
            this.f2034h[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.f2035i * 2) {
                return i3;
            }
            SolverVariable solverVariable = ((b) aVar).a;
            if (solverVariable != null) {
                this.f2034h[solverVariable.f254g] = true;
            }
            SolverVariable a2 = aVar.a(this, this.f2034h);
            if (a2 != null) {
                boolean[] zArr = this.f2034h;
                int i4 = a2.f254g;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f2036j; i6++) {
                    b bVar = this.f2032f[i6];
                    if (bVar.a.n != SolverVariable.Type.UNRESTRICTED && !bVar.f2028e && bVar.f2027d.b(a2)) {
                        float j2 = bVar.f2027d.j(a2);
                        if (j2 < 0.0f) {
                            float f3 = (-bVar.b) / j2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f2032f[i5];
                    bVar2.a.f255h = -1;
                    bVar2.j(a2);
                    SolverVariable solverVariable2 = bVar2.a;
                    solverVariable2.f255h = i5;
                    solverVariable2.i(this, bVar2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    public final void t() {
        for (int i2 = 0; i2 < this.f2036j; i2++) {
            b bVar = this.f2032f[i2];
            if (bVar != null) {
                this.f2038l.b.b(bVar);
            }
            this.f2032f[i2] = null;
        }
    }

    public void u() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f2038l;
            SolverVariable[] solverVariableArr = cVar.f2029d;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.f();
            }
            i2++;
        }
        e<SolverVariable> eVar = cVar.c;
        SolverVariable[] solverVariableArr2 = this.f2039m;
        int i3 = this.n;
        Objects.requireNonNull(eVar);
        if (i3 > solverVariableArr2.length) {
            i3 = solverVariableArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            SolverVariable solverVariable2 = solverVariableArr2[i4];
            int i5 = eVar.b;
            Object[] objArr = eVar.a;
            if (i5 < objArr.length) {
                objArr[i5] = solverVariable2;
                eVar.b = i5 + 1;
            }
        }
        this.n = 0;
        Arrays.fill(this.f2038l.f2029d, (Object) null);
        this.b = 0;
        this.c.clear();
        this.f2035i = 1;
        for (int i6 = 0; i6 < this.f2036j; i6++) {
            b[] bVarArr = this.f2032f;
            if (bVarArr[i6] != null) {
                Objects.requireNonNull(bVarArr[i6]);
            }
        }
        t();
        this.f2036j = 0;
        this.o = new b(this.f2038l);
    }
}

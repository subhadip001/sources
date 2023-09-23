package e.g.a;

import androidx.constraintlayout.core.SolverVariable;
import e.g.a.d;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: d  reason: collision with root package name */
    public a f2027d;
    public SolverVariable a = null;
    public float b = 0.0f;
    public ArrayList<SolverVariable> c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2028e = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        boolean b(SolverVariable solverVariable);

        float c(b bVar, boolean z);

        void clear();

        void d(SolverVariable solverVariable, float f2);

        SolverVariable e(int i2);

        void f(SolverVariable solverVariable, float f2, boolean z);

        void g();

        float h(int i2);

        float i(SolverVariable solverVariable, boolean z);

        float j(SolverVariable solverVariable);

        void k(float f2);
    }

    public b() {
    }

    @Override // e.g.a.d.a
    public SolverVariable a(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    @Override // e.g.a.d.a
    public void b(SolverVariable solverVariable) {
        float f2;
        int i2 = solverVariable.f256i;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
            this.f2027d.d(solverVariable, f2);
        }
        f2 = 1.0f;
        this.f2027d.d(solverVariable, f2);
    }

    public b c(d dVar, int i2) {
        this.f2027d.d(dVar.k(i2, "ep"), 1.0f);
        this.f2027d.d(dVar.k(i2, "em"), -1.0f);
        return this;
    }

    @Override // e.g.a.d.a
    public void clear() {
        this.f2027d.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.f2027d.d(solverVariable, -1.0f);
        this.f2027d.d(solverVariable2, 1.0f);
        this.f2027d.d(solverVariable3, f2);
        this.f2027d.d(solverVariable4, -f2);
        return this;
    }

    public b e(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = i2;
        }
        if (!z) {
            this.f2027d.d(solverVariable, -1.0f);
            this.f2027d.d(solverVariable2, 1.0f);
            this.f2027d.d(solverVariable3, 1.0f);
        } else {
            this.f2027d.d(solverVariable, 1.0f);
            this.f2027d.d(solverVariable2, -1.0f);
            this.f2027d.d(solverVariable3, -1.0f);
        }
        return this;
    }

    public b f(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = i2;
        }
        if (!z) {
            this.f2027d.d(solverVariable, -1.0f);
            this.f2027d.d(solverVariable2, 1.0f);
            this.f2027d.d(solverVariable3, -1.0f);
        } else {
            this.f2027d.d(solverVariable, 1.0f);
            this.f2027d.d(solverVariable2, -1.0f);
            this.f2027d.d(solverVariable3, 1.0f);
        }
        return this;
    }

    public b g(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.f2027d.d(solverVariable3, 0.5f);
        this.f2027d.d(solverVariable4, 0.5f);
        this.f2027d.d(solverVariable, -0.5f);
        this.f2027d.d(solverVariable2, -0.5f);
        this.b = -f2;
        return this;
    }

    public final boolean h(SolverVariable solverVariable) {
        return solverVariable.q <= 1;
    }

    public final SolverVariable i(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int a2 = this.f2027d.a();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < a2; i2++) {
            float h2 = this.f2027d.h(i2);
            if (h2 < 0.0f) {
                SolverVariable e2 = this.f2027d.e(i2);
                if ((zArr == null || !zArr[e2.f254g]) && e2 != solverVariable && (((type = e2.n) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && h2 < f2)) {
                    f2 = h2;
                    solverVariable2 = e2;
                }
            }
        }
        return solverVariable2;
    }

    @Override // e.g.a.d.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.f2027d.a() == 0;
    }

    public void j(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.f2027d.d(solverVariable2, -1.0f);
            this.a.f255h = -1;
            this.a = null;
        }
        float i2 = this.f2027d.i(solverVariable, true) * (-1.0f);
        this.a = solverVariable;
        if (i2 == 1.0f) {
            return;
        }
        this.b /= i2;
        this.f2027d.k(i2);
    }

    public void k(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f258k) {
            float j2 = this.f2027d.j(solverVariable);
            this.b = (solverVariable.f257j * j2) + this.b;
            this.f2027d.i(solverVariable, z);
            if (z) {
                solverVariable.d(this);
            }
            if (this.f2027d.a() == 0) {
                this.f2028e = true;
                dVar.a = true;
            }
        }
    }

    public void l(d dVar, b bVar, boolean z) {
        float c = this.f2027d.c(bVar, z);
        this.b = (bVar.b * c) + this.b;
        if (z) {
            bVar.a.d(this);
        }
        if (this.a == null || this.f2027d.a() != 0) {
            return;
        }
        this.f2028e = true;
        dVar.a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r9.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = f.a.b.a.a.p(r0, r1)
            float r1 = r9.b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
            float r1 = r9.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            e.g.a.b$a r4 = r9.f2027d
            int r4 = r4.a()
        L3a:
            if (r3 >= r4) goto L9a
            e.g.a.b$a r5 = r9.f2027d
            androidx.constraintlayout.core.SolverVariable r5 = r5.e(r3)
            if (r5 != 0) goto L45
            goto L97
        L45:
            e.g.a.b$a r6 = r9.f2027d
            float r6 = r6.h(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L97
        L50:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L74
            java.lang.String r1 = "- "
            java.lang.String r0 = f.a.b.a.a.p(r0, r1)
            goto L72
        L63:
            if (r7 <= 0) goto L6c
            java.lang.String r1 = " + "
            java.lang.String r0 = f.a.b.a.a.p(r0, r1)
            goto L74
        L6c:
            java.lang.String r1 = " - "
            java.lang.String r0 = f.a.b.a.a.p(r0, r1)
        L72:
            float r6 = r6 * r8
        L74:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L7f
            java.lang.String r0 = f.a.b.a.a.p(r0, r5)
            goto L96
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L96:
            r1 = 1
        L97:
            int r3 = r3 + 1
            goto L3a
        L9a:
            if (r1 != 0) goto La2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = f.a.b.a.a.p(r0, r1)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.f2027d = new e.g.a.a(this, cVar);
    }
}

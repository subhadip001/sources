package e.g.a;

import androidx.constraintlayout.core.SolverVariable;
import e.g.a.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class f extends e.g.a.b {

    /* renamed from: f  reason: collision with root package name */
    public int f2040f;

    /* renamed from: g  reason: collision with root package name */
    public SolverVariable[] f2041g;

    /* renamed from: h  reason: collision with root package name */
    public SolverVariable[] f2042h;

    /* renamed from: i  reason: collision with root package name */
    public int f2043i;

    /* renamed from: j  reason: collision with root package name */
    public b f2044j;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<SolverVariable> {
        public a(f fVar) {
        }

        @Override // java.util.Comparator
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f254g - solverVariable2.f254g;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class b {
        public SolverVariable a;

        public b(f fVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder A = f.a.b.a.a.A(str);
                    A.append(this.a.f260m[i2]);
                    A.append(" ");
                    str = A.toString();
                }
            }
            StringBuilder D = f.a.b.a.a.D(str, "] ");
            D.append(this.a);
            return D.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
        this.f2040f = 128;
        this.f2041g = new SolverVariable[128];
        this.f2042h = new SolverVariable[128];
        this.f2043i = 0;
        this.f2044j = new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r8 < r7) goto L33;
     */
    @Override // e.g.a.b, e.g.a.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.core.SolverVariable a(e.g.a.d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L4:
            int r3 = r10.f2043i
            if (r1 >= r3) goto L5d
            androidx.constraintlayout.core.SolverVariable[] r3 = r10.f2041g
            r4 = r3[r1]
            int r5 = r4.f254g
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L5a
        L13:
            e.g.a.f$b r5 = r10.f2044j
            r5.a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L39
            java.util.Objects.requireNonNull(r5)
        L1f:
            if (r4 < 0) goto L35
            androidx.constraintlayout.core.SolverVariable r3 = r5.a
            float[] r3 = r3.f260m
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2d
            goto L35
        L2d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L32
            goto L36
        L32:
            int r4 = r4 + (-1)
            goto L1f
        L35:
            r6 = 0
        L36:
            if (r6 == 0) goto L5a
            goto L59
        L39:
            r3 = r3[r2]
            java.util.Objects.requireNonNull(r5)
        L3e:
            if (r4 < 0) goto L56
            float[] r7 = r3.f260m
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r8 = r5.a
            float[] r8 = r8.f260m
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L51
            int r4 = r4 + (-1)
            goto L3e
        L51:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L5a
        L59:
            r2 = r1
        L5a:
            int r1 = r1 + 1
            goto L4
        L5d:
            if (r2 != r0) goto L61
            r11 = 0
            return r11
        L61:
            androidx.constraintlayout.core.SolverVariable[] r11 = r10.f2041g
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.f.a(e.g.a.d, boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    @Override // e.g.a.b, e.g.a.d.a
    public void b(SolverVariable solverVariable) {
        this.f2044j.a = solverVariable;
        Arrays.fill(solverVariable.f260m, 0.0f);
        solverVariable.f260m[solverVariable.f256i] = 1.0f;
        m(solverVariable);
    }

    @Override // e.g.a.b, e.g.a.d.a
    public void clear() {
        this.f2043i = 0;
        this.b = 0.0f;
    }

    @Override // e.g.a.b, e.g.a.d.a
    public boolean isEmpty() {
        return this.f2043i == 0;
    }

    @Override // e.g.a.b
    public void l(d dVar, e.g.a.b bVar, boolean z) {
        SolverVariable solverVariable = bVar.a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f2027d;
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            SolverVariable e2 = aVar.e(i2);
            float h2 = aVar.h(i2);
            b bVar2 = this.f2044j;
            bVar2.a = e2;
            boolean z2 = true;
            if (e2.f253f) {
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = bVar2.a.f260m;
                    fArr[i3] = (solverVariable.f260m[i3] * h2) + fArr[i3];
                    if (Math.abs(fArr[i3]) < 1.0E-4f) {
                        bVar2.a.f260m[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    f.this.n(bVar2.a);
                }
                z2 = false;
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = solverVariable.f260m[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * h2;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar2.a.f260m[i4] = f3;
                    } else {
                        bVar2.a.f260m[i4] = 0.0f;
                    }
                }
            }
            if (z2) {
                m(e2);
            }
            this.b = (bVar.b * h2) + this.b;
        }
        n(solverVariable);
    }

    public final void m(SolverVariable solverVariable) {
        int i2;
        int i3 = this.f2043i + 1;
        SolverVariable[] solverVariableArr = this.f2041g;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f2041g = solverVariableArr2;
            this.f2042h = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f2041g;
        int i4 = this.f2043i;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.f2043i = i5;
        if (i5 > 1 && solverVariableArr3[i5 - 1].f254g > solverVariable.f254g) {
            int i6 = 0;
            while (true) {
                i2 = this.f2043i;
                if (i6 >= i2) {
                    break;
                }
                this.f2042h[i6] = this.f2041g[i6];
                i6++;
            }
            Arrays.sort(this.f2042h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.f2043i; i7++) {
                this.f2041g[i7] = this.f2042h[i7];
            }
        }
        solverVariable.f253f = true;
        solverVariable.a(this);
    }

    public final void n(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.f2043i) {
            if (this.f2041g[i2] == solverVariable) {
                while (true) {
                    int i3 = this.f2043i;
                    if (i2 < i3 - 1) {
                        SolverVariable[] solverVariableArr = this.f2041g;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    } else {
                        this.f2043i = i3 - 1;
                        solverVariable.f253f = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // e.g.a.b
    public String toString() {
        StringBuilder D = f.a.b.a.a.D("", " goal -> (");
        D.append(this.b);
        D.append(") : ");
        String sb = D.toString();
        for (int i2 = 0; i2 < this.f2043i; i2++) {
            this.f2044j.a = this.f2041g[i2];
            StringBuilder A = f.a.b.a.a.A(sb);
            A.append(this.f2044j);
            A.append(" ");
            sb = A.toString();
        }
        return sb;
    }
}

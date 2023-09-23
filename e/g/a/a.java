package e.g.a;

import androidx.constraintlayout.core.SolverVariable;
import e.g.a.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {
    public final b b;
    public final c c;
    public int a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2020d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2021e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2022f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f2023g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f2024h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2025i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2026j = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
    }

    @Override // e.g.a.b.a
    public int a() {
        return this.a;
    }

    @Override // e.g.a.b.a
    public boolean b(SolverVariable solverVariable) {
        int i2 = this.f2024h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (this.f2021e[i2] == solverVariable.f254g) {
                return true;
            }
            i2 = this.f2022f[i2];
        }
        return false;
    }

    @Override // e.g.a.b.a
    public float c(b bVar, boolean z) {
        float j2 = j(bVar.a);
        i(bVar.a, z);
        b.a aVar = bVar.f2027d;
        int a = aVar.a();
        for (int i2 = 0; i2 < a; i2++) {
            SolverVariable e2 = aVar.e(i2);
            f(e2, aVar.j(e2) * j2, z);
        }
        return j2;
    }

    @Override // e.g.a.b.a
    public final void clear() {
        int i2 = this.f2024h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            SolverVariable solverVariable = this.c.f2029d[this.f2021e[i2]];
            if (solverVariable != null) {
                solverVariable.d(this.b);
            }
            i2 = this.f2022f[i2];
        }
        this.f2024h = -1;
        this.f2025i = -1;
        this.f2026j = false;
        this.a = 0;
    }

    @Override // e.g.a.b.a
    public final void d(SolverVariable solverVariable, float f2) {
        if (f2 == 0.0f) {
            i(solverVariable, true);
            return;
        }
        int i2 = this.f2024h;
        if (i2 == -1) {
            this.f2024h = 0;
            this.f2023g[0] = f2;
            this.f2021e[0] = solverVariable.f254g;
            this.f2022f[0] = -1;
            solverVariable.q++;
            solverVariable.a(this.b);
            this.a++;
            if (this.f2026j) {
                return;
            }
            int i3 = this.f2025i + 1;
            this.f2025i = i3;
            int[] iArr = this.f2021e;
            if (i3 >= iArr.length) {
                this.f2026j = true;
                this.f2025i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
            int[] iArr2 = this.f2021e;
            int i6 = iArr2[i2];
            int i7 = solverVariable.f254g;
            if (i6 == i7) {
                this.f2023g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f2022f[i2];
        }
        int i8 = this.f2025i;
        int i9 = i8 + 1;
        if (this.f2026j) {
            int[] iArr3 = this.f2021e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f2021e;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f2021e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f2021e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f2020d * 2;
            this.f2020d = i11;
            this.f2026j = false;
            this.f2025i = i8 - 1;
            this.f2023g = Arrays.copyOf(this.f2023g, i11);
            this.f2021e = Arrays.copyOf(this.f2021e, this.f2020d);
            this.f2022f = Arrays.copyOf(this.f2022f, this.f2020d);
        }
        this.f2021e[i8] = solverVariable.f254g;
        this.f2023g[i8] = f2;
        if (i4 != -1) {
            int[] iArr7 = this.f2022f;
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            this.f2022f[i8] = this.f2024h;
            this.f2024h = i8;
        }
        solverVariable.q++;
        solverVariable.a(this.b);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.f2026j) {
            this.f2025i++;
        }
        int[] iArr8 = this.f2021e;
        if (i12 >= iArr8.length) {
            this.f2026j = true;
        }
        if (this.f2025i >= iArr8.length) {
            this.f2026j = true;
            this.f2025i = iArr8.length - 1;
        }
    }

    @Override // e.g.a.b.a
    public SolverVariable e(int i2) {
        int i3 = this.f2024h;
        for (int i4 = 0; i3 != -1 && i4 < this.a; i4++) {
            if (i4 == i2) {
                return this.c.f2029d[this.f2021e[i3]];
            }
            i3 = this.f2022f[i3];
        }
        return null;
    }

    @Override // e.g.a.b.a
    public void f(SolverVariable solverVariable, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f2024h;
            if (i2 == -1) {
                this.f2024h = 0;
                this.f2023g[0] = f2;
                this.f2021e[0] = solverVariable.f254g;
                this.f2022f[0] = -1;
                solverVariable.q++;
                solverVariable.a(this.b);
                this.a++;
                if (this.f2026j) {
                    return;
                }
                int i3 = this.f2025i + 1;
                this.f2025i = i3;
                int[] iArr = this.f2021e;
                if (i3 >= iArr.length) {
                    this.f2026j = true;
                    this.f2025i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
                int[] iArr2 = this.f2021e;
                int i6 = iArr2[i2];
                int i7 = solverVariable.f254g;
                if (i6 == i7) {
                    float[] fArr = this.f2023g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f2024h) {
                            this.f2024h = this.f2022f[i2];
                        } else {
                            int[] iArr3 = this.f2022f;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            solverVariable.d(this.b);
                        }
                        if (this.f2026j) {
                            this.f2025i = i2;
                        }
                        solverVariable.q--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f2022f[i2];
            }
            int i8 = this.f2025i;
            int i9 = i8 + 1;
            if (this.f2026j) {
                int[] iArr4 = this.f2021e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f2021e;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f2021e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f2021e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f2020d * 2;
                this.f2020d = i11;
                this.f2026j = false;
                this.f2025i = i8 - 1;
                this.f2023g = Arrays.copyOf(this.f2023g, i11);
                this.f2021e = Arrays.copyOf(this.f2021e, this.f2020d);
                this.f2022f = Arrays.copyOf(this.f2022f, this.f2020d);
            }
            this.f2021e[i8] = solverVariable.f254g;
            this.f2023g[i8] = f2;
            if (i4 != -1) {
                int[] iArr8 = this.f2022f;
                iArr8[i8] = iArr8[i4];
                iArr8[i4] = i8;
            } else {
                this.f2022f[i8] = this.f2024h;
                this.f2024h = i8;
            }
            solverVariable.q++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.f2026j) {
                this.f2025i++;
            }
            int i12 = this.f2025i;
            int[] iArr9 = this.f2021e;
            if (i12 >= iArr9.length) {
                this.f2026j = true;
                this.f2025i = iArr9.length - 1;
            }
        }
    }

    @Override // e.g.a.b.a
    public void g() {
        int i2 = this.f2024h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            float[] fArr = this.f2023g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2022f[i2];
        }
    }

    @Override // e.g.a.b.a
    public float h(int i2) {
        int i3 = this.f2024h;
        for (int i4 = 0; i3 != -1 && i4 < this.a; i4++) {
            if (i4 == i2) {
                return this.f2023g[i3];
            }
            i3 = this.f2022f[i3];
        }
        return 0.0f;
    }

    @Override // e.g.a.b.a
    public final float i(SolverVariable solverVariable, boolean z) {
        int i2 = this.f2024h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f2021e[i2] == solverVariable.f254g) {
                if (i2 == this.f2024h) {
                    this.f2024h = this.f2022f[i2];
                } else {
                    int[] iArr = this.f2022f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.d(this.b);
                }
                solverVariable.q--;
                this.a--;
                this.f2021e[i2] = -1;
                if (this.f2026j) {
                    this.f2025i = i2;
                }
                return this.f2023g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2022f[i2];
        }
        return 0.0f;
    }

    @Override // e.g.a.b.a
    public final float j(SolverVariable solverVariable) {
        int i2 = this.f2024h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (this.f2021e[i2] == solverVariable.f254g) {
                return this.f2023g[i2];
            }
            i2 = this.f2022f[i2];
        }
        return 0.0f;
    }

    @Override // e.g.a.b.a
    public void k(float f2) {
        int i2 = this.f2024h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            float[] fArr = this.f2023g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2022f[i2];
        }
    }

    public String toString() {
        int i2 = this.f2024h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            StringBuilder A = f.a.b.a.a.A(f.a.b.a.a.p(str, " -> "));
            A.append(this.f2023g[i2]);
            A.append(" : ");
            StringBuilder A2 = f.a.b.a.a.A(A.toString());
            A2.append(this.c.f2029d[this.f2021e[i2]]);
            str = A2.toString();
            i2 = this.f2022f[i2];
        }
        return str;
    }
}

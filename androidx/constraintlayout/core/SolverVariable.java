package androidx.constraintlayout.core;

import e.g.a.b;
import e.g.a.d;
import f.a.b.a.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public static int s = 1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f253f;

    /* renamed from: j  reason: collision with root package name */
    public float f257j;
    public Type n;

    /* renamed from: g  reason: collision with root package name */
    public int f254g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f255h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f256i = 0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f258k = false;

    /* renamed from: l  reason: collision with root package name */
    public float[] f259l = new float[9];

    /* renamed from: m  reason: collision with root package name */
    public float[] f260m = new float[9];
    public b[] o = new b[16];
    public int p = 0;
    public int q = 0;
    public int r = -1;

    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.n = type;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.p;
            if (i2 < i3) {
                if (this.o[i2] == bVar) {
                    return;
                }
                i2++;
            } else {
                b[] bVarArr = this.o;
                if (i3 >= bVarArr.length) {
                    this.o = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.o;
                int i4 = this.p;
                bVarArr2[i4] = bVar;
                this.p = i4 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f254g - solverVariable.f254g;
    }

    public final void d(b bVar) {
        int i2 = this.p;
        int i3 = 0;
        while (i3 < i2) {
            if (this.o[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.o;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.p--;
                return;
            }
            i3++;
        }
    }

    public void f() {
        this.n = Type.UNKNOWN;
        this.f256i = 0;
        this.f254g = -1;
        this.f255h = -1;
        this.f257j = 0.0f;
        this.f258k = false;
        this.r = -1;
        int i2 = this.p;
        for (int i3 = 0; i3 < i2; i3++) {
            this.o[i3] = null;
        }
        this.p = 0;
        this.q = 0;
        this.f253f = false;
        Arrays.fill(this.f260m, 0.0f);
    }

    public void g(d dVar, float f2) {
        this.f257j = f2;
        this.f258k = true;
        this.r = -1;
        int i2 = this.p;
        this.f255h = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.o[i3].k(dVar, this, false);
        }
        this.p = 0;
    }

    public final void i(d dVar, b bVar) {
        int i2 = this.p;
        for (int i3 = 0; i3 < i2; i3++) {
            this.o[i3].l(dVar, bVar, false);
        }
        this.p = 0;
    }

    public String toString() {
        StringBuilder A = a.A("");
        A.append(this.f254g);
        return A.toString();
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.i.j.h0.d;
import e.u.b.n;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean G;
    public int H;
    public int[] I;
    public View[] J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public c M;
    public final Rect N;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int b(int i2, int i3) {
            return i2 % i3;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int c(int i2) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public int a(int i2, int i3) {
            int c = c(i2);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int c2 = c(i6);
                i4 += c2;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = c2;
                }
            }
            return i4 + c > i3 ? i5 + 1 : i5;
        }

        public int b(int i2, int i3) {
            int c = c(i2);
            if (c == i3) {
                return 0;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int c2 = c(i5);
                i4 += c2;
                if (i4 == i3) {
                    i4 = 0;
                } else if (i4 > i3) {
                    i4 = c2;
                }
            }
            if (c + i4 <= i3) {
                return i4;
            }
            return 0;
        }

        public abstract int c(int i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        S1(RecyclerView.m.T(context, attributeSet, i2, i3).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int C(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 1) {
            return this.H;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return N1(tVar, xVar, xVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G1(boolean z) {
        if (!z) {
            e(null);
            if (this.x) {
                this.x = false;
                M0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void K1(int i2) {
        int i3;
        int[] iArr = this.I;
        int i4 = this.H;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.I = iArr;
    }

    public final void L1() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public int M1(int i2, int i3) {
        if (this.r == 1 && w1()) {
            int[] iArr = this.I;
            int i4 = this.H;
            return iArr[i4 - i2] - iArr[(i4 - i2) - i3];
        }
        int[] iArr2 = this.I;
        return iArr2[i3 + i2] - iArr2[i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int N0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        T1();
        L1();
        if (this.r == 1) {
            return 0;
        }
        return D1(i2, tVar, xVar);
    }

    public final int N1(RecyclerView.t tVar, RecyclerView.x xVar, int i2) {
        if (!xVar.f517g) {
            return this.M.a(i2, this.H);
        }
        int c2 = tVar.c(i2);
        if (c2 == -1) {
            f.a.b.a.a.O("Cannot find span size for pre layout position. ", i2, "GridLayoutManager");
            return 0;
        }
        return this.M.a(c2, this.H);
    }

    public final int O1(RecyclerView.t tVar, RecyclerView.x xVar, int i2) {
        if (!xVar.f517g) {
            return this.M.b(i2, this.H);
        }
        int i3 = this.L.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int c2 = tVar.c(i2);
        if (c2 == -1) {
            f.a.b.a.a.O("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i2, "GridLayoutManager");
            return 0;
        }
        return this.M.b(c2, this.H);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        T1();
        L1();
        if (this.r == 0) {
            return 0;
        }
        return D1(i2, tVar, xVar);
    }

    public final int P1(RecyclerView.t tVar, RecyclerView.x xVar, int i2) {
        if (!xVar.f517g) {
            return this.M.c(i2);
        }
        int i3 = this.K.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int c2 = tVar.c(i2);
        if (c2 == -1) {
            f.a.b.a.a.O("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i2, "GridLayoutManager");
            return 1;
        }
        return this.M.c(c2);
    }

    public final void Q1(View view, int i2, boolean z) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int M1 = M1(bVar.f456e, bVar.f457f);
        if (this.r == 1) {
            i4 = RecyclerView.m.B(M1, i2, i6, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.m.B(this.t.l(), this.o, i5, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int B = RecyclerView.m.B(M1, i2, i5, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int B2 = RecyclerView.m.B(this.t.l(), this.n, i6, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = B;
            i4 = B2;
        }
        R1(view, i4, i3, z);
    }

    public final void R1(View view, int i2, int i3, boolean z) {
        boolean V0;
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z) {
            V0 = X0(view, i2, i3, nVar);
        } else {
            V0 = V0(view, i2, i3, nVar);
        }
        if (V0) {
            view.measure(i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void S0(Rect rect, int i2, int i3) {
        int j2;
        int j3;
        if (this.I == null) {
            super.S0(rect, i2, i3);
        }
        int Q = Q() + P();
        int O = O() + R();
        if (this.r == 1) {
            j3 = RecyclerView.m.j(i3, rect.height() + O, M());
            int[] iArr = this.I;
            j2 = RecyclerView.m.j(i2, iArr[iArr.length - 1] + Q, N());
        } else {
            j2 = RecyclerView.m.j(i2, rect.width() + Q, N());
            int[] iArr2 = this.I;
            j3 = RecyclerView.m.j(i3, iArr2[iArr2.length - 1] + O, M());
        }
        this.b.setMeasuredDimension(j2, j3);
    }

    public void S1(int i2) {
        if (i2 == this.H) {
            return;
        }
        this.G = true;
        if (i2 >= 1) {
            this.H = i2;
            this.M.a.clear();
            M0();
            return;
        }
        throw new IllegalArgumentException(f.a.b.a.a.i("Span count should be at least 1. Provided ", i2));
    }

    public final void T1() {
        int O;
        int R;
        if (this.r == 1) {
            O = this.p - Q();
            R = P();
        } else {
            O = this.q - O();
            R = R();
        }
        K1(O - R);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int U(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 0) {
            return this.H;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return N1(tVar, xVar, xVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean a1() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void c1(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i2 = this.H;
        for (int i3 = 0; i3 < this.H && cVar.b(xVar) && i2 > 0; i3++) {
            int i4 = cVar.f464d;
            ((n.b) cVar2).a(i4, Math.max(0, cVar.f467g));
            i2 -= this.M.c(i4);
            cVar.f464d += cVar.f465e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean i(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View j0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.j0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return e1(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return f1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void o0(RecyclerView.t tVar, RecyclerView.x xVar, View view, d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            n0(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int N1 = N1(tVar, xVar, bVar.a());
        if (this.r == 0) {
            dVar.n(d.c.a(bVar.f456e, bVar.f457f, N1, 1, false, false));
        } else {
            dVar.n(d.c.a(N1, 1, bVar.f456e, bVar.f457f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int q(RecyclerView.x xVar) {
        return e1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void q0(RecyclerView recyclerView, int i2, int i3) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int r(RecyclerView.x xVar) {
        return f1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void r0(RecyclerView recyclerView) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View r1(RecyclerView.t tVar, RecyclerView.x xVar, int i2, int i3, int i4) {
        h1();
        int k2 = this.t.k();
        int g2 = this.t.g();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View z = z(i2);
            int S = S(z);
            if (S >= 0 && S < i4 && O1(tVar, xVar, S) == 0) {
                if (((RecyclerView.n) z.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = z;
                    }
                } else if (this.t.e(z) < g2 && this.t.b(z) >= k2) {
                    return z;
                } else {
                    if (view == null) {
                        view = z;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void s0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void t0(RecyclerView recyclerView, int i2, int i3) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w() {
        if (this.r == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void w0(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (xVar.f517g) {
            int A = A();
            for (int i2 = 0; i2 < A; i2++) {
                b bVar = (b) z(i2).getLayoutParams();
                int a2 = bVar.a();
                this.K.put(a2, bVar.f457f);
                this.L.put(a2, bVar.f456e);
            }
        }
        super.w0(tVar, xVar);
        this.K.clear();
        this.L.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n x(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void x0(RecyclerView.x xVar) {
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
        this.G = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x1(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.x r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.x1(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void y1(RecyclerView.t tVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i2) {
        T1();
        if (xVar.b() > 0 && !xVar.f517g) {
            boolean z = i2 == 1;
            int O1 = O1(tVar, xVar, aVar.b);
            if (z) {
                while (O1 > 0) {
                    int i3 = aVar.b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    aVar.b = i4;
                    O1 = O1(tVar, xVar, i4);
                }
            } else {
                int b2 = xVar.b() - 1;
                int i5 = aVar.b;
                while (i5 < b2) {
                    int i6 = i5 + 1;
                    int O12 = O1(tVar, xVar, i6);
                    if (O12 <= O1) {
                        break;
                    }
                    i5 = i6;
                    O1 = O12;
                }
                aVar.b = i5;
            }
        }
        L1();
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f456e;

        /* renamed from: f  reason: collision with root package name */
        public int f457f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f456e = -1;
            this.f457f = 0;
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.f456e = -1;
            this.f457f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f456e = -1;
            this.f457f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f456e = -1;
            this.f457f = 0;
        }
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(i3, z);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        S1(i2);
    }

    public GridLayoutManager(Context context, int i2) {
        super(1, false);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        S1(i2);
    }
}

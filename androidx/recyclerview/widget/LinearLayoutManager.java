package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import e.u.b.n;
import e.u.b.o;
import e.u.b.r;
import e.u.b.v;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements o.g, RecyclerView.w.b {
    public int A;
    public SavedState B;
    public final a C;
    public final b D;
    public int E;
    public int[] F;
    public int r;
    public c s;
    public v t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f458f;

        /* renamed from: g  reason: collision with root package name */
        public int f459g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f460h;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        public boolean b() {
            return this.f458f >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f458f);
            parcel.writeInt(this.f459g);
            parcel.writeInt(this.f460h ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f458f = parcel.readInt();
            this.f459g = parcel.readInt();
            this.f460h = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f458f = savedState.f458f;
            this.f459g = savedState.f459g;
            this.f460h = savedState.f460h;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public v a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f461d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f462e;

        public a() {
            d();
        }

        public void a() {
            int k2;
            if (this.f461d) {
                k2 = this.a.g();
            } else {
                k2 = this.a.k();
            }
            this.c = k2;
        }

        public void b(View view, int i2) {
            if (this.f461d) {
                this.c = this.a.m() + this.a.b(view);
            } else {
                this.c = this.a.e(view);
            }
            this.b = i2;
        }

        public void c(View view, int i2) {
            int m2 = this.a.m();
            if (m2 >= 0) {
                b(view, i2);
                return;
            }
            this.b = i2;
            if (this.f461d) {
                int g2 = (this.a.g() - m2) - this.a.b(view);
                this.c = this.a.g() - g2;
                if (g2 > 0) {
                    int c = this.c - this.a.c(view);
                    int k2 = this.a.k();
                    int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
                    if (min < 0) {
                        this.c = Math.min(g2, -min) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e2 = this.a.e(view);
            int k3 = e2 - this.a.k();
            this.c = e2;
            if (k3 > 0) {
                int g3 = (this.a.g() - Math.min(0, (this.a.g() - m2) - this.a.b(view))) - (this.a.c(view) + e2);
                if (g3 < 0) {
                    this.c -= Math.min(k3, -g3);
                }
            }
        }

        public void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.f461d = false;
            this.f462e = false;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("AnchorInfo{mPosition=");
            A.append(this.b);
            A.append(", mCoordinate=");
            A.append(this.c);
            A.append(", mLayoutFromEnd=");
            A.append(this.f461d);
            A.append(", mValid=");
            A.append(this.f462e);
            A.append('}');
            return A.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f463d;
    }

    /* loaded from: classes.dex */
    public static class c {
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f464d;

        /* renamed from: e  reason: collision with root package name */
        public int f465e;

        /* renamed from: f  reason: collision with root package name */
        public int f466f;

        /* renamed from: g  reason: collision with root package name */
        public int f467g;

        /* renamed from: j  reason: collision with root package name */
        public int f470j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f472l;
        public boolean a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f468h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f469i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.a0> f471k = null;

        public void a(View view) {
            int a;
            int size = this.f471k.size();
            View view2 = null;
            int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f471k.get(i3).itemView;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a = (nVar.a() - this.f464d) * this.f465e) >= 0 && a < i2) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i2 = a;
                }
            }
            if (view2 == null) {
                this.f464d = -1;
            } else {
                this.f464d = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
        }

        public boolean b(RecyclerView.x xVar) {
            int i2 = this.f464d;
            return i2 >= 0 && i2 < xVar.b();
        }

        public View c(RecyclerView.t tVar) {
            List<RecyclerView.a0> list = this.f471k;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.f471k.get(i2).itemView;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.c() && this.f464d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = tVar.j(this.f464d, false, Long.MAX_VALUE).itemView;
            this.f464d += this.f465e;
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    public final void A1(RecyclerView.t tVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                J0(i2, tVar);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            J0(i4, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void B0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.B = (SavedState) parcelable;
            M0();
        }
    }

    public boolean B1() {
        return this.t.i() == 0 && this.t.f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable C0() {
        SavedState savedState = this.B;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (A() > 0) {
            h1();
            boolean z = this.u ^ this.w;
            savedState2.f460h = z;
            if (z) {
                View u1 = u1();
                savedState2.f459g = this.t.g() - this.t.b(u1);
                savedState2.f458f = S(u1);
            } else {
                View v1 = v1();
                savedState2.f458f = S(v1);
                savedState2.f459g = this.t.e(v1) - this.t.k();
            }
        } else {
            savedState2.f458f = -1;
        }
        return savedState2;
    }

    public final void C1() {
        if (this.r != 1 && w1()) {
            this.w = !this.v;
        } else {
            this.w = this.v;
        }
    }

    public int D1(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (A() == 0 || i2 == 0) {
            return 0;
        }
        h1();
        this.s.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        H1(i3, abs, true, xVar);
        c cVar = this.s;
        int i1 = i1(tVar, cVar, xVar, false) + cVar.f467g;
        if (i1 < 0) {
            return 0;
        }
        if (abs > i1) {
            i2 = i3 * i1;
        }
        this.t.p(-i2);
        this.s.f470j = i2;
        return i2;
    }

    public void E1(int i2, int i3) {
        this.z = i2;
        this.A = i3;
        SavedState savedState = this.B;
        if (savedState != null) {
            savedState.f458f = -1;
        }
        M0();
    }

    public void F1(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(f.a.b.a.a.i("invalid orientation:", i2));
        }
        e(null);
        if (i2 != this.r || this.t == null) {
            v a2 = v.a(this, i2);
            this.t = a2;
            this.C.a = a2;
            this.r = i2;
            M0();
        }
    }

    public void G1(boolean z) {
        e(null);
        if (this.x == z) {
            return;
        }
        this.x = z;
        M0();
    }

    public final void H1(int i2, int i3, boolean z, RecyclerView.x xVar) {
        int k2;
        this.s.f472l = B1();
        this.s.f466f = i2;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        b1(xVar, iArr);
        int max = Math.max(0, this.F[0]);
        int max2 = Math.max(0, this.F[1]);
        boolean z2 = i2 == 1;
        c cVar = this.s;
        int i4 = z2 ? max2 : max;
        cVar.f468h = i4;
        if (!z2) {
            max = max2;
        }
        cVar.f469i = max;
        if (z2) {
            cVar.f468h = this.t.h() + i4;
            View u1 = u1();
            c cVar2 = this.s;
            cVar2.f465e = this.w ? -1 : 1;
            int S = S(u1);
            c cVar3 = this.s;
            cVar2.f464d = S + cVar3.f465e;
            cVar3.b = this.t.b(u1);
            k2 = this.t.b(u1) - this.t.g();
        } else {
            View v1 = v1();
            c cVar4 = this.s;
            cVar4.f468h = this.t.k() + cVar4.f468h;
            c cVar5 = this.s;
            cVar5.f465e = this.w ? 1 : -1;
            int S2 = S(v1);
            c cVar6 = this.s;
            cVar5.f464d = S2 + cVar6.f465e;
            cVar6.b = this.t.e(v1);
            k2 = (-this.t.e(v1)) + this.t.k();
        }
        c cVar7 = this.s;
        cVar7.c = i3;
        if (z) {
            cVar7.c = i3 - k2;
        }
        cVar7.f467g = k2;
    }

    public final void I1(int i2, int i3) {
        this.s.c = this.t.g() - i3;
        c cVar = this.s;
        cVar.f465e = this.w ? -1 : 1;
        cVar.f464d = i2;
        cVar.f466f = 1;
        cVar.b = i3;
        cVar.f467g = Integer.MIN_VALUE;
    }

    public final void J1(int i2, int i3) {
        this.s.c = i3 - this.t.k();
        c cVar = this.s;
        cVar.f464d = i2;
        cVar.f465e = this.w ? 1 : -1;
        cVar.f466f = -1;
        cVar.b = i3;
        cVar.f467g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int N0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 1) {
            return 0;
        }
        return D1(i2, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(int i2) {
        this.z = i2;
        this.A = Integer.MIN_VALUE;
        SavedState savedState = this.B;
        if (savedState != null) {
            savedState.f458f = -1;
        }
        M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 0) {
            return 0;
        }
        return D1(i2, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean W0() {
        boolean z;
        if (this.o != 1073741824 && this.n != 1073741824) {
            int A = A();
            int i2 = 0;
            while (true) {
                if (i2 >= A) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = z(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean X() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, RecyclerView.x xVar, int i2) {
        r rVar = new r(recyclerView.getContext());
        rVar.a = i2;
        Z0(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public PointF a(int i2) {
        if (A() == 0) {
            return null;
        }
        int i3 = (i2 < S(z(0))) != this.w ? -1 : 1;
        if (this.r == 0) {
            return new PointF(i3, 0.0f);
        }
        return new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a1() {
        return this.B == null && this.u == this.x;
    }

    @Override // e.u.b.o.g
    public void b(View view, View view2, int i2, int i3) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.b) != null) {
            recyclerView.i("Cannot drop a view during a scroll or layout calculation");
        }
        h1();
        C1();
        int S = S(view);
        int S2 = S(view2);
        char c2 = S < S2 ? (char) 1 : (char) 65535;
        if (this.w) {
            if (c2 == 1) {
                E1(S2, this.t.g() - (this.t.c(view) + this.t.e(view2)));
            } else {
                E1(S2, this.t.g() - this.t.b(view2));
            }
        } else if (c2 == 65535) {
            E1(S2, this.t.e(view2));
        } else {
            E1(S2, this.t.b(view2) - this.t.c(view));
        }
    }

    public void b1(RecyclerView.x xVar, int[] iArr) {
        int i2;
        int l2 = xVar.a != -1 ? this.t.l() : 0;
        if (this.s.f466f == -1) {
            i2 = 0;
        } else {
            i2 = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i2;
    }

    public void c1(RecyclerView.x xVar, c cVar, RecyclerView.m.c cVar2) {
        int i2 = cVar.f464d;
        if (i2 < 0 || i2 >= xVar.b()) {
            return;
        }
        ((n.b) cVar2).a(i2, Math.max(0, cVar.f467g));
    }

    public final int d1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        h1();
        return e.p.a.b(xVar, this.t, l1(!this.y, true), k1(!this.y, true), this, this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void e(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    public final int e1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        h1();
        return e.p.a.c(xVar, this.t, l1(!this.y, true), k1(!this.y, true), this, this.y, this.w);
    }

    public final int f1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        h1();
        return e.p.a.d(xVar, this.t, l1(!this.y, true), k1(!this.y, true), this, this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g() {
        return this.r == 0;
    }

    public int g1(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.r == 1) ? 1 : Integer.MIN_VALUE : this.r == 0 ? 1 : Integer.MIN_VALUE : this.r == 1 ? -1 : Integer.MIN_VALUE : this.r == 0 ? -1 : Integer.MIN_VALUE : (this.r != 1 && w1()) ? -1 : 1 : (this.r != 1 && w1()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean h() {
        return this.r == 1;
    }

    public void h1() {
        if (this.s == null) {
            this.s = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i0(RecyclerView recyclerView, RecyclerView.t tVar) {
        h0();
    }

    public int i1(RecyclerView.t tVar, c cVar, RecyclerView.x xVar, boolean z) {
        int i2 = cVar.c;
        int i3 = cVar.f467g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f467g = i3 + i2;
            }
            z1(tVar, cVar);
        }
        int i4 = cVar.c + cVar.f468h;
        b bVar = this.D;
        while (true) {
            if ((!cVar.f472l && i4 <= 0) || !cVar.b(xVar)) {
                break;
            }
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.f463d = false;
            x1(tVar, xVar, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f466f * i6) + i5;
                if (!bVar.c || cVar.f471k != null || !xVar.f517g) {
                    cVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.f467g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f467g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.f467g = i8 + i9;
                    }
                    z1(tVar, cVar);
                }
                if (z && bVar.f463d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View j0(View view, int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        int g1;
        View p1;
        View u1;
        C1();
        if (A() == 0 || (g1 = g1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        h1();
        H1(g1, (int) (this.t.l() * 0.33333334f), false, xVar);
        c cVar = this.s;
        cVar.f467g = Integer.MIN_VALUE;
        cVar.a = false;
        i1(tVar, cVar, xVar, true);
        if (g1 == -1) {
            if (this.w) {
                p1 = p1(A() - 1, -1);
            } else {
                p1 = p1(0, A());
            }
        } else if (this.w) {
            p1 = p1(0, A());
        } else {
            p1 = p1(A() - 1, -1);
        }
        if (g1 == -1) {
            u1 = v1();
        } else {
            u1 = u1();
        }
        if (u1.hasFocusable()) {
            if (p1 == null) {
                return null;
            }
            return u1;
        }
        return p1;
    }

    public final View j1(RecyclerView.t tVar, RecyclerView.x xVar) {
        return r1(tVar, xVar, 0, A(), xVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k(int i2, int i3, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        if (this.r != 0) {
            i2 = i3;
        }
        if (A() == 0 || i2 == 0) {
            return;
        }
        h1();
        H1(i2 > 0 ? 1 : -1, Math.abs(i2), true, xVar);
        c1(xVar, this.s, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.t tVar = this.b.f474g;
        l0(accessibilityEvent);
        if (A() > 0) {
            accessibilityEvent.setFromIndex(m1());
            accessibilityEvent.setToIndex(o1());
        }
    }

    public View k1(boolean z, boolean z2) {
        if (this.w) {
            return q1(0, A(), z, z2);
        }
        return q1(A() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l(int i2, RecyclerView.m.c cVar) {
        boolean z;
        int i3;
        SavedState savedState = this.B;
        if (savedState != null && savedState.b()) {
            SavedState savedState2 = this.B;
            z = savedState2.f460h;
            i3 = savedState2.f458f;
        } else {
            C1();
            z = this.w;
            i3 = this.z;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < this.E && i3 >= 0 && i3 < i2; i5++) {
            ((n.b) cVar).a(i3, 0);
            i3 += i4;
        }
    }

    public View l1(boolean z, boolean z2) {
        if (this.w) {
            return q1(A() - 1, -1, z, z2);
        }
        return q1(0, A(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return d1(xVar);
    }

    public int m1() {
        View q1 = q1(0, A(), false, true);
        if (q1 == null) {
            return -1;
        }
        return S(q1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return e1(xVar);
    }

    public final View n1(RecyclerView.t tVar, RecyclerView.x xVar) {
        return r1(tVar, xVar, A() - 1, -1, xVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return f1(xVar);
    }

    public int o1() {
        View q1 = q1(A() - 1, -1, false, true);
        if (q1 == null) {
            return -1;
        }
        return S(q1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return d1(xVar);
    }

    public View p1(int i2, int i3) {
        int i4;
        int i5;
        h1();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return z(i2);
        }
        if (this.t.e(z(i2)) < this.t.k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        if (this.r == 0) {
            return this.f488e.a(i2, i3, i4, i5);
        }
        return this.f489f.a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int q(RecyclerView.x xVar) {
        return e1(xVar);
    }

    public View q1(int i2, int i3, boolean z, boolean z2) {
        h1();
        int i4 = z ? 24579 : 320;
        int i5 = z2 ? 320 : 0;
        if (this.r == 0) {
            return this.f488e.a(i2, i3, i4, i5);
        }
        return this.f489f.a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int r(RecyclerView.x xVar) {
        return f1(xVar);
    }

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
            if (S >= 0 && S < i4) {
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

    public final int s1(int i2, RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int g2;
        int g3 = this.t.g() - i2;
        if (g3 > 0) {
            int i3 = -D1(-g3, tVar, xVar);
            int i4 = i2 + i3;
            if (!z || (g2 = this.t.g() - i4) <= 0) {
                return i3;
            }
            this.t.p(g2);
            return g2 + i3;
        }
        return 0;
    }

    public final int t1(int i2, RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int k2;
        int k3 = i2 - this.t.k();
        if (k3 > 0) {
            int i3 = -D1(k3, tVar, xVar);
            int i4 = i2 + i3;
            if (!z || (k2 = i4 - this.t.k()) <= 0) {
                return i3;
            }
            this.t.p(-k2);
            return i3 - k2;
        }
        return 0;
    }

    public final View u1() {
        return z(this.w ? 0 : A() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View v(int i2) {
        int A = A();
        if (A == 0) {
            return null;
        }
        int S = i2 - S(z(0));
        if (S >= 0 && S < A) {
            View z = z(S);
            if (S(z) == i2) {
                return z;
            }
        }
        return super.v(i2);
    }

    public final View v1() {
        return z(this.w ? A() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w() {
        return new RecyclerView.n(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w0(androidx.recyclerview.widget.RecyclerView.t r17, androidx.recyclerview.widget.RecyclerView.x r18) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.w0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public boolean w1() {
        return L() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void x0(RecyclerView.x xVar) {
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
    }

    public void x1(RecyclerView.t tVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int d2;
        View c2 = cVar.c(tVar);
        if (c2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) c2.getLayoutParams();
        if (cVar.f471k == null) {
            if (this.w == (cVar.f466f == -1)) {
                d(c2, -1, false);
            } else {
                d(c2, 0, false);
            }
        } else {
            if (this.w == (cVar.f466f == -1)) {
                d(c2, -1, true);
            } else {
                d(c2, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) c2.getLayoutParams();
        Rect O = this.b.O(c2);
        int B = RecyclerView.m.B(this.p, this.n, Q() + P() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + O.left + O.right + 0, ((ViewGroup.MarginLayoutParams) nVar2).width, g());
        int B2 = RecyclerView.m.B(this.q, this.o, O() + R() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + O.top + O.bottom + 0, ((ViewGroup.MarginLayoutParams) nVar2).height, h());
        if (V0(c2, B, B2, nVar2)) {
            c2.measure(B, B2);
        }
        bVar.a = this.t.c(c2);
        if (this.r == 1) {
            if (w1()) {
                d2 = this.p - Q();
                i5 = d2 - this.t.d(c2);
            } else {
                i5 = P();
                d2 = this.t.d(c2) + i5;
            }
            if (cVar.f466f == -1) {
                int i6 = cVar.b;
                i4 = i6;
                i3 = d2;
                i2 = i6 - bVar.a;
            } else {
                int i7 = cVar.b;
                i2 = i7;
                i3 = d2;
                i4 = bVar.a + i7;
            }
        } else {
            int R = R();
            int d3 = this.t.d(c2) + R;
            if (cVar.f466f == -1) {
                int i8 = cVar.b;
                i3 = i8;
                i2 = R;
                i4 = d3;
                i5 = i8 - bVar.a;
            } else {
                int i9 = cVar.b;
                i2 = R;
                i3 = bVar.a + i9;
                i4 = d3;
                i5 = i9;
            }
        }
        b0(c2, i5, i2, i3, i4);
        if (nVar.c() || nVar.b()) {
            bVar.c = true;
        }
        bVar.f463d = c2.hasFocusable();
    }

    public void y1(RecyclerView.t tVar, RecyclerView.x xVar, a aVar, int i2) {
    }

    public final void z1(RecyclerView.t tVar, c cVar) {
        if (!cVar.a || cVar.f472l) {
            return;
        }
        int i2 = cVar.f467g;
        int i3 = cVar.f469i;
        if (cVar.f466f == -1) {
            int A = A();
            if (i2 < 0) {
                return;
            }
            int f2 = (this.t.f() - i2) + i3;
            if (this.w) {
                for (int i4 = 0; i4 < A; i4++) {
                    View z = z(i4);
                    if (this.t.e(z) < f2 || this.t.o(z) < f2) {
                        A1(tVar, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = A - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View z2 = z(i6);
                if (this.t.e(z2) < f2 || this.t.o(z2) < f2) {
                    A1(tVar, i5, i6);
                    return;
                }
            }
        } else if (i2 >= 0) {
            int i7 = i2 - i3;
            int A2 = A();
            if (!this.w) {
                for (int i8 = 0; i8 < A2; i8++) {
                    View z3 = z(i8);
                    if (this.t.b(z3) > i7 || this.t.n(z3) > i7) {
                        A1(tVar, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = A2 - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View z4 = z(i10);
                if (this.t.b(z4) > i7 || this.t.n(z4) > i7) {
                    A1(tVar, i9, i10);
                    return;
                }
            }
        }
    }

    public LinearLayoutManager(int i2, boolean z) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        F1(i2);
        e(null);
        if (z == this.v) {
            return;
        }
        this.v = z;
        M0();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        RecyclerView.m.d T = RecyclerView.m.T(context, attributeSet, i2, i3);
        F1(T.a);
        boolean z = T.c;
        e(null);
        if (z != this.v) {
            this.v = z;
            M0();
        }
        G1(T.f497d);
    }
}

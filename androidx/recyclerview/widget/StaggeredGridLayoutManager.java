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
import e.i.j.h0.d;
import e.u.b.n;
import e.u.b.q;
import e.u.b.r;
import e.u.b.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public BitSet A;
    public boolean F;
    public boolean G;
    public SavedState H;
    public int I;
    public int[] M;
    public int r;
    public d[] s;
    public v t;
    public v u;
    public int v;
    public int w;
    public final q x;
    public boolean y;
    public boolean z = false;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public LazySpanLookup D = new LazySpanLookup();
    public int E = 2;
    public final Rect J = new Rect();
    public final b K = new b();
    public boolean L = true;
    public final Runnable N = new a();

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f535f;

        /* renamed from: g  reason: collision with root package name */
        public int f536g;

        /* renamed from: h  reason: collision with root package name */
        public int f537h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f538i;

        /* renamed from: j  reason: collision with root package name */
        public int f539j;

        /* renamed from: k  reason: collision with root package name */
        public int[] f540k;

        /* renamed from: l  reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f541l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f542m;
        public boolean n;
        public boolean o;

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

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f535f);
            parcel.writeInt(this.f536g);
            parcel.writeInt(this.f537h);
            if (this.f537h > 0) {
                parcel.writeIntArray(this.f538i);
            }
            parcel.writeInt(this.f539j);
            if (this.f539j > 0) {
                parcel.writeIntArray(this.f540k);
            }
            parcel.writeInt(this.f542m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeList(this.f541l);
        }

        public SavedState(Parcel parcel) {
            this.f535f = parcel.readInt();
            this.f536g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f537h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f538i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f539j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f540k = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f542m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            this.o = parcel.readInt() == 1;
            this.f541l = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f537h = savedState.f537h;
            this.f535f = savedState.f535f;
            this.f536g = savedState.f536g;
            this.f538i = savedState.f538i;
            this.f539j = savedState.f539j;
            this.f540k = savedState.f540k;
            this.f542m = savedState.f542m;
            this.n = savedState.n;
            this.o = savedState.o;
            this.f541l = savedState.f541l;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.c1();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f544d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f545e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f546f;

        public b() {
            b();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.t.g() : StaggeredGridLayoutManager.this.t.k();
        }

        public void b() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.f544d = false;
            this.f545e = false;
            int[] iArr = this.f546f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public d f548e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f549d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f550e;

        public d(int i2) {
            this.f550e = i2;
        }

        public void a(View view) {
            c j2 = j(view);
            j2.f548e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f549d = StaggeredGridLayoutManager.this.t.c(view) + this.f549d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c j2 = j(view);
            this.c = StaggeredGridLayoutManager.this.t.b(view);
            Objects.requireNonNull(j2);
        }

        public void c() {
            View view = this.a.get(0);
            c j2 = j(view);
            this.b = StaggeredGridLayoutManager.this.t.e(view);
            Objects.requireNonNull(j2);
        }

        public void d() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.f549d = 0;
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.y) {
                return g(this.a.size() - 1, -1, true);
            }
            return g(0, this.a.size(), true);
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.y) {
                return g(0, this.a.size(), true);
            }
            return g(this.a.size() - 1, -1, true);
        }

        public int g(int i2, int i3, boolean z) {
            int k2 = StaggeredGridLayoutManager.this.t.k();
            int g2 = StaggeredGridLayoutManager.this.t.g();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int e2 = StaggeredGridLayoutManager.this.t.e(view);
                int b = StaggeredGridLayoutManager.this.t.b(view);
                boolean z2 = false;
                boolean z3 = !z ? e2 >= g2 : e2 > g2;
                if (!z ? b > k2 : b >= k2) {
                    z2 = true;
                }
                if (z3 && z2 && (e2 < k2 || b > g2)) {
                    return StaggeredGridLayoutManager.this.S(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public int h(int i2) {
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            b();
            return this.c;
        }

        public View i(int i2, int i3) {
            View view = null;
            if (i3 == -1) {
                int size = this.a.size();
                int i4 = 0;
                while (i4 < size) {
                    View view2 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.S(view2) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.S(view2) >= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view2;
                }
            } else {
                int size2 = this.a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.S(view3) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.S(view3) <= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i2) {
            int i3 = this.b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            c();
            return this.b;
        }

        public void l() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c j2 = j(remove);
            j2.f548e = null;
            if (j2.c() || j2.b()) {
                this.f549d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.a.remove(0);
            c j2 = j(remove);
            j2.f548e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f549d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j2 = j(view);
            j2.f548e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f549d = StaggeredGridLayoutManager.this.t.c(view) + this.f549d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.r = -1;
        this.y = false;
        RecyclerView.m.d T = RecyclerView.m.T(context, attributeSet, i2, i3);
        int i4 = T.a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        e(null);
        if (i4 != this.v) {
            this.v = i4;
            v vVar = this.t;
            this.t = this.u;
            this.u = vVar;
            M0();
        }
        int i5 = T.b;
        e(null);
        if (i5 != this.r) {
            this.D.a();
            M0();
            this.r = i5;
            this.A = new BitSet(this.r);
            this.s = new d[this.r];
            for (int i6 = 0; i6 < this.r; i6++) {
                this.s[i6] = new d(i6);
            }
            M0();
        }
        boolean z = T.c;
        e(null);
        SavedState savedState = this.H;
        if (savedState != null && savedState.f542m != z) {
            savedState.f542m = z;
        }
        this.y = z;
        M0();
        this.x = new q();
        this.t = v.a(this, this.v);
        this.u = v.a(this, 1 - this.v);
    }

    public int A1(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (A() == 0 || i2 == 0) {
            return 0;
        }
        v1(i2, xVar);
        int g1 = g1(tVar, this.x, xVar);
        if (this.x.b >= g1) {
            i2 = i2 < 0 ? -g1 : g1;
        }
        this.t.p(-i2);
        this.F = this.z;
        q qVar = this.x;
        qVar.b = 0;
        w1(tVar, qVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void B0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.H = (SavedState) parcelable;
            M0();
        }
    }

    public final void B1(int i2) {
        q qVar = this.x;
        qVar.f2922e = i2;
        qVar.f2921d = this.z != (i2 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int C(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.v == 1) {
            return this.r;
        }
        return super.C(tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable C0() {
        int k2;
        int k3;
        int[] iArr;
        SavedState savedState = this.H;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f542m = this.y;
        savedState2.n = this.F;
        savedState2.o = this.G;
        LazySpanLookup lazySpanLookup = this.D;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.a) != null) {
            savedState2.f540k = iArr;
            savedState2.f539j = iArr.length;
            savedState2.f541l = lazySpanLookup.b;
        } else {
            savedState2.f539j = 0;
        }
        if (A() > 0) {
            savedState2.f535f = this.F ? m1() : l1();
            View h1 = this.z ? h1(true) : i1(true);
            savedState2.f536g = h1 != null ? S(h1) : -1;
            int i2 = this.r;
            savedState2.f537h = i2;
            savedState2.f538i = new int[i2];
            for (int i3 = 0; i3 < this.r; i3++) {
                if (this.F) {
                    k2 = this.s[i3].h(Integer.MIN_VALUE);
                    if (k2 != Integer.MIN_VALUE) {
                        k3 = this.t.g();
                        k2 -= k3;
                        savedState2.f538i[i3] = k2;
                    } else {
                        savedState2.f538i[i3] = k2;
                    }
                } else {
                    k2 = this.s[i3].k(Integer.MIN_VALUE);
                    if (k2 != Integer.MIN_VALUE) {
                        k3 = this.t.k();
                        k2 -= k3;
                        savedState2.f538i[i3] = k2;
                    } else {
                        savedState2.f538i[i3] = k2;
                    }
                }
            }
        } else {
            savedState2.f535f = -1;
            savedState2.f536g = -1;
            savedState2.f537h = 0;
        }
        return savedState2;
    }

    public final void C1(int i2, int i3) {
        for (int i4 = 0; i4 < this.r; i4++) {
            if (!this.s[i4].a.isEmpty()) {
                E1(this.s[i4], i2, i3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void D0(int i2) {
        if (i2 == 0) {
            c1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1(int r5, androidx.recyclerview.widget.RecyclerView.x r6) {
        /*
            r4 = this;
            e.u.b.q r0 = r4.x
            r1 = 0
            r0.b = r1
            r0.c = r5
            androidx.recyclerview.widget.RecyclerView$w r0 = r4.f490g
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.f506e
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L33
            int r6 = r6.a
            r0 = -1
            if (r6 == r0) goto L33
            boolean r0 = r4.z
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r0 != r5) goto L2a
            e.u.b.v r5 = r4.t
            int r5 = r5.l()
            goto L34
        L2a:
            e.u.b.v r5 = r4.t
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            if (r0 == 0) goto L3f
            boolean r0 = r0.f479l
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L59
            e.u.b.q r0 = r4.x
            e.u.b.v r3 = r4.t
            int r3 = r3.k()
            int r3 = r3 - r6
            r0.f2923f = r3
            e.u.b.q r6 = r4.x
            e.u.b.v r0 = r4.t
            int r0 = r0.g()
            int r0 = r0 + r5
            r6.f2924g = r0
            goto L69
        L59:
            e.u.b.q r0 = r4.x
            e.u.b.v r3 = r4.t
            int r3 = r3.f()
            int r3 = r3 + r5
            r0.f2924g = r3
            e.u.b.q r5 = r4.x
            int r6 = -r6
            r5.f2923f = r6
        L69:
            e.u.b.q r5 = r4.x
            r5.f2925h = r1
            r5.a = r2
            e.u.b.v r6 = r4.t
            int r6 = r6.i()
            if (r6 != 0) goto L80
            e.u.b.v r6 = r4.t
            int r6 = r6.f()
            if (r6 != 0) goto L80
            r1 = 1
        L80:
            r5.f2926i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.D1(int, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void E1(d dVar, int i2, int i3) {
        int i4 = dVar.f549d;
        if (i2 == -1) {
            int i5 = dVar.b;
            if (i5 == Integer.MIN_VALUE) {
                dVar.c();
                i5 = dVar.b;
            }
            if (i5 + i4 <= i3) {
                this.A.set(dVar.f550e, false);
                return;
            }
            return;
        }
        int i6 = dVar.c;
        if (i6 == Integer.MIN_VALUE) {
            dVar.b();
            i6 = dVar.c;
        }
        if (i6 - i4 >= i3) {
            this.A.set(dVar.f550e, false);
        }
    }

    public final int F1(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int N0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        return A1(i2, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(int i2) {
        SavedState savedState = this.H;
        if (savedState != null && savedState.f535f != i2) {
            savedState.f538i = null;
            savedState.f537h = 0;
            savedState.f535f = -1;
            savedState.f536g = -1;
        }
        this.B = i2;
        this.C = Integer.MIN_VALUE;
        M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        return A1(i2, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void S0(Rect rect, int i2, int i3) {
        int j2;
        int j3;
        int Q = Q() + P();
        int O = O() + R();
        if (this.v == 1) {
            j3 = RecyclerView.m.j(i3, rect.height() + O, M());
            j2 = RecyclerView.m.j(i2, (this.w * this.r) + Q, N());
        } else {
            j2 = RecyclerView.m.j(i2, rect.width() + Q, N());
            j3 = RecyclerView.m.j(i3, (this.w * this.r) + O, M());
        }
        this.b.setMeasuredDimension(j2, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int U(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.v == 0) {
            return this.r;
        }
        return super.U(tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean X() {
        return this.E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, RecyclerView.x xVar, int i2) {
        r rVar = new r(recyclerView.getContext());
        rVar.a = i2;
        Z0(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public PointF a(int i2) {
        int b1 = b1(i2);
        PointF pointF = new PointF();
        if (b1 == 0) {
            return null;
        }
        if (this.v == 0) {
            pointF.x = b1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = b1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a1() {
        return this.H == null;
    }

    public final int b1(int i2) {
        if (A() == 0) {
            return this.z ? 1 : -1;
        }
        return (i2 < l1()) != this.z ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c0(int i2) {
        super.c0(i2);
        for (int i3 = 0; i3 < this.r; i3++) {
            d dVar = this.s[i3];
            int i4 = dVar.b;
            if (i4 != Integer.MIN_VALUE) {
                dVar.b = i4 + i2;
            }
            int i5 = dVar.c;
            if (i5 != Integer.MIN_VALUE) {
                dVar.c = i5 + i2;
            }
        }
    }

    public boolean c1() {
        int l1;
        if (A() != 0 && this.E != 0 && this.f492i) {
            if (this.z) {
                l1 = m1();
                l1();
            } else {
                l1 = l1();
                m1();
            }
            if (l1 == 0 && q1() != null) {
                this.D.a();
                this.f491h = true;
                M0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d0(int i2) {
        super.d0(i2);
        for (int i3 = 0; i3 < this.r; i3++) {
            d dVar = this.s[i3];
            int i4 = dVar.b;
            if (i4 != Integer.MIN_VALUE) {
                dVar.b = i4 + i2;
            }
            int i5 = dVar.c;
            if (i5 != Integer.MIN_VALUE) {
                dVar.c = i5 + i2;
            }
        }
    }

    public final int d1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        return e.p.a.b(xVar, this.t, i1(!this.L), h1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void e(String str) {
        RecyclerView recyclerView;
        if (this.H != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    public final int e1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        return e.p.a.c(xVar, this.t, i1(!this.L), h1(!this.L), this, this.L, this.z);
    }

    public final int f1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        return e.p.a.d(xVar, this.t, i1(!this.L), h1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g() {
        return this.v == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    public final int g1(RecyclerView.t tVar, q qVar, RecyclerView.x xVar) {
        int i2;
        int i3;
        int k2;
        int n1;
        d dVar;
        ?? r2;
        int i4;
        int c2;
        int k3;
        int c3;
        int i5;
        int i6;
        int i7;
        boolean z = false;
        this.A.set(0, this.r, true);
        if (this.x.f2926i) {
            i3 = qVar.f2922e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            if (qVar.f2922e == 1) {
                i2 = qVar.f2924g + qVar.b;
            } else {
                i2 = qVar.f2923f - qVar.b;
            }
            i3 = i2;
        }
        C1(qVar.f2922e, i3);
        if (this.z) {
            k2 = this.t.g();
        } else {
            k2 = this.t.k();
        }
        int i8 = k2;
        boolean z2 = false;
        while (true) {
            int i9 = qVar.c;
            if (!(i9 >= 0 && i9 < xVar.b()) || (!this.x.f2926i && this.A.isEmpty())) {
                break;
            }
            View view = tVar.j(qVar.c, z, Long.MAX_VALUE).itemView;
            qVar.c += qVar.f2921d;
            c cVar = (c) view.getLayoutParams();
            int a2 = cVar.a();
            int[] iArr = this.D.a;
            int i10 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
            if (i10 == -1) {
                if (u1(qVar.f2922e)) {
                    i6 = this.r - 1;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i5 = this.r;
                    i6 = 0;
                    i7 = 1;
                }
                d dVar2 = null;
                if (qVar.f2922e == 1) {
                    int k4 = this.t.k();
                    int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i6 != i5) {
                        d dVar3 = this.s[i6];
                        int h2 = dVar3.h(k4);
                        if (h2 < i11) {
                            dVar2 = dVar3;
                            i11 = h2;
                        }
                        i6 += i7;
                    }
                } else {
                    int g2 = this.t.g();
                    int i12 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        d dVar4 = this.s[i6];
                        int k5 = dVar4.k(g2);
                        if (k5 > i12) {
                            dVar2 = dVar4;
                            i12 = k5;
                        }
                        i6 += i7;
                    }
                }
                dVar = dVar2;
                LazySpanLookup lazySpanLookup = this.D;
                lazySpanLookup.b(a2);
                lazySpanLookup.a[a2] = dVar.f550e;
            } else {
                dVar = this.s[i10];
            }
            d dVar5 = dVar;
            cVar.f548e = dVar5;
            if (qVar.f2922e == 1) {
                r2 = 0;
                d(view, -1, false);
            } else {
                r2 = 0;
                d(view, 0, false);
            }
            if (this.v == 1) {
                s1(view, RecyclerView.m.B(this.w, this.n, r2, ((ViewGroup.MarginLayoutParams) cVar).width, r2), RecyclerView.m.B(this.q, this.o, O() + R(), ((ViewGroup.MarginLayoutParams) cVar).height, true), r2);
            } else {
                s1(view, RecyclerView.m.B(this.p, this.n, Q() + P(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.m.B(this.w, this.o, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), false);
            }
            if (qVar.f2922e == 1) {
                int h3 = dVar5.h(i8);
                c2 = h3;
                i4 = this.t.c(view) + h3;
            } else {
                int k6 = dVar5.k(i8);
                i4 = k6;
                c2 = k6 - this.t.c(view);
            }
            if (qVar.f2922e == 1) {
                cVar.f548e.a(view);
            } else {
                cVar.f548e.n(view);
            }
            if (r1() && this.v == 1) {
                c3 = this.u.g() - (((this.r - 1) - dVar5.f550e) * this.w);
                k3 = c3 - this.u.c(view);
            } else {
                k3 = this.u.k() + (dVar5.f550e * this.w);
                c3 = this.u.c(view) + k3;
            }
            int i13 = c3;
            int i14 = k3;
            if (this.v == 1) {
                b0(view, i14, c2, i13, i4);
            } else {
                b0(view, c2, i14, i4, i13);
            }
            E1(dVar5, this.x.f2922e, i3);
            w1(tVar, this.x);
            if (this.x.f2925h && view.hasFocusable()) {
                this.A.set(dVar5.f550e, false);
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            w1(tVar, this.x);
        }
        if (this.x.f2922e == -1) {
            n1 = this.t.k() - o1(this.t.k());
        } else {
            n1 = n1(this.t.g()) - this.t.g();
        }
        if (n1 > 0) {
            return Math.min(qVar.b, n1);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean h() {
        return this.v == 1;
    }

    public View h1(boolean z) {
        int k2 = this.t.k();
        int g2 = this.t.g();
        View view = null;
        for (int A = A() - 1; A >= 0; A--) {
            View z2 = z(A);
            int e2 = this.t.e(z2);
            int b2 = this.t.b(z2);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z) {
                    return z2;
                }
                if (view == null) {
                    view = z2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean i(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i0(RecyclerView recyclerView, RecyclerView.t tVar) {
        h0();
        Runnable runnable = this.N;
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.r; i2++) {
            this.s[i2].d();
        }
        recyclerView.requestLayout();
    }

    public View i1(boolean z) {
        int k2 = this.t.k();
        int g2 = this.t.g();
        int A = A();
        View view = null;
        for (int i2 = 0; i2 < A; i2++) {
            View z2 = z(i2);
            int e2 = this.t.e(z2);
            if (this.t.b(z2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z) {
                    return z2;
                }
                if (view == null) {
                    view = z2;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r8.v == 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
        if (r8.v == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
        if (r1() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0058, code lost:
        if (r1() == false) goto L111;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View j0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.t r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.j0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final void j1(RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int g2;
        int n1 = n1(Integer.MIN_VALUE);
        if (n1 != Integer.MIN_VALUE && (g2 = this.t.g() - n1) > 0) {
            int i2 = g2 - (-A1(-g2, tVar, xVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.t.p(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k(int i2, int i3, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        int h2;
        int i4;
        if (this.v != 0) {
            i2 = i3;
        }
        if (A() == 0 || i2 == 0) {
            return;
        }
        v1(i2, xVar);
        int[] iArr = this.M;
        if (iArr == null || iArr.length < this.r) {
            this.M = new int[this.r];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.r; i6++) {
            q qVar = this.x;
            if (qVar.f2921d == -1) {
                h2 = qVar.f2923f;
                i4 = this.s[i6].k(h2);
            } else {
                h2 = this.s[i6].h(qVar.f2924g);
                i4 = this.x.f2924g;
            }
            int i7 = h2 - i4;
            if (i7 >= 0) {
                this.M[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.M, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = this.x.c;
            if (!(i9 >= 0 && i9 < xVar.b())) {
                return;
            }
            ((n.b) cVar).a(this.x.c, this.M[i8]);
            q qVar2 = this.x;
            qVar2.c += qVar2.f2921d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.t tVar = this.b.f474g;
        l0(accessibilityEvent);
        if (A() > 0) {
            View i1 = i1(false);
            View h1 = h1(false);
            if (i1 == null || h1 == null) {
                return;
            }
            int S = S(i1);
            int S2 = S(h1);
            if (S < S2) {
                accessibilityEvent.setFromIndex(S);
                accessibilityEvent.setToIndex(S2);
                return;
            }
            accessibilityEvent.setFromIndex(S2);
            accessibilityEvent.setToIndex(S);
        }
    }

    public final void k1(RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int k2;
        int o1 = o1(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (o1 != Integer.MAX_VALUE && (k2 = o1 - this.t.k()) > 0) {
            int A1 = k2 - A1(k2, tVar, xVar);
            if (!z || A1 <= 0) {
                return;
            }
            this.t.p(-A1);
        }
    }

    public int l1() {
        if (A() == 0) {
            return 0;
        }
        return S(z(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return d1(xVar);
    }

    public int m1() {
        int A = A();
        if (A == 0) {
            return 0;
        }
        return S(z(A - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return e1(xVar);
    }

    public final int n1(int i2) {
        int h2 = this.s[0].h(i2);
        for (int i3 = 1; i3 < this.r; i3++) {
            int h3 = this.s[i3].h(i2);
            if (h3 > h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return f1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void o0(RecyclerView.t tVar, RecyclerView.x xVar, View view, e.i.j.h0.d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            n0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.v == 0) {
            d dVar2 = cVar.f548e;
            dVar.n(d.c.a(dVar2 == null ? -1 : dVar2.f550e, 1, -1, -1, false, false));
            return;
        }
        d dVar3 = cVar.f548e;
        dVar.n(d.c.a(-1, -1, dVar3 == null ? -1 : dVar3.f550e, 1, false, false));
    }

    public final int o1(int i2) {
        int k2 = this.s[0].k(i2);
        for (int i3 = 1; i3 < this.r; i3++) {
            int k3 = this.s[i3].k(i2);
            if (k3 < k2) {
                k2 = k3;
            }
        }
        return k2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return d1(xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.z
            if (r0 == 0) goto L9
            int r0 = r6.m1()
            goto Ld
        L9:
            int r0 = r6.l1()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.D
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.D
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.D
            r7.e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.D
            r9.f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.D
            r9.e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.z
            if (r7 == 0) goto L4d
            int r7 = r6.l1()
            goto L51
        L4d:
            int r7 = r6.m1()
        L51:
            if (r3 > r7) goto L56
            r6.M0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int q(RecyclerView.x xVar) {
        return e1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void q0(RecyclerView recyclerView, int i2, int i3) {
        p1(i2, i3, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View q1() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int r(RecyclerView.x xVar) {
        return f1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void r0(RecyclerView recyclerView) {
        this.D.a();
        M0();
    }

    public boolean r1() {
        return L() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void s0(RecyclerView recyclerView, int i2, int i3, int i4) {
        p1(i2, i3, 8);
    }

    public final void s1(View view, int i2, int i3, boolean z) {
        boolean V0;
        f(view, this.J);
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.J;
        int F1 = F1(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.J;
        int F12 = F1(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            V0 = X0(view, F1, F12, cVar);
        } else {
            V0 = V0(view, F1, F12, cVar);
        }
        if (V0) {
            view.measure(F1, F12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void t0(RecyclerView recyclerView, int i2, int i3) {
        p1(i2, i3, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x0417, code lost:
        if (c1() != false) goto L257;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t1(androidx.recyclerview.widget.RecyclerView.t r12, androidx.recyclerview.widget.RecyclerView.x r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.t1(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    public final boolean u1(int i2) {
        if (this.v == 0) {
            return (i2 == -1) != this.z;
        }
        return ((i2 == -1) == this.z) == r1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        p1(i2, i3, 4);
    }

    public void v1(int i2, RecyclerView.x xVar) {
        int l1;
        int i3;
        if (i2 > 0) {
            l1 = m1();
            i3 = 1;
        } else {
            l1 = l1();
            i3 = -1;
        }
        this.x.a = true;
        D1(l1, xVar);
        B1(i3);
        q qVar = this.x;
        qVar.c = l1 + qVar.f2921d;
        qVar.b = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w() {
        if (this.v == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void w0(RecyclerView.t tVar, RecyclerView.x xVar) {
        t1(tVar, xVar, true);
    }

    public final void w1(RecyclerView.t tVar, q qVar) {
        int min;
        int min2;
        if (!qVar.a || qVar.f2926i) {
            return;
        }
        if (qVar.b == 0) {
            if (qVar.f2922e == -1) {
                x1(tVar, qVar.f2924g);
                return;
            } else {
                y1(tVar, qVar.f2923f);
                return;
            }
        }
        int i2 = 1;
        if (qVar.f2922e == -1) {
            int i3 = qVar.f2923f;
            int k2 = this.s[0].k(i3);
            while (i2 < this.r) {
                int k3 = this.s[i2].k(i3);
                if (k3 > k2) {
                    k2 = k3;
                }
                i2++;
            }
            int i4 = i3 - k2;
            if (i4 < 0) {
                min2 = qVar.f2924g;
            } else {
                min2 = qVar.f2924g - Math.min(i4, qVar.b);
            }
            x1(tVar, min2);
            return;
        }
        int i5 = qVar.f2924g;
        int h2 = this.s[0].h(i5);
        while (i2 < this.r) {
            int h3 = this.s[i2].h(i5);
            if (h3 < h2) {
                h2 = h3;
            }
            i2++;
        }
        int i6 = h2 - qVar.f2924g;
        if (i6 < 0) {
            min = qVar.f2923f;
        } else {
            min = Math.min(i6, qVar.b) + qVar.f2923f;
        }
        y1(tVar, min);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n x(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void x0(RecyclerView.x xVar) {
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.b();
    }

    public final void x1(RecyclerView.t tVar, int i2) {
        for (int A = A() - 1; A >= 0; A--) {
            View z = z(A);
            if (this.t.e(z) < i2 || this.t.o(z) < i2) {
                return;
            }
            c cVar = (c) z.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f548e.a.size() == 1) {
                return;
            }
            cVar.f548e.l();
            I0(z, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public final void y1(RecyclerView.t tVar, int i2) {
        while (A() > 0) {
            View z = z(0);
            if (this.t.b(z) > i2 || this.t.n(z) > i2) {
                return;
            }
            c cVar = (c) z.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f548e.a.size() == 1) {
                return;
            }
            cVar.f548e.m();
            I0(z, tVar);
        }
    }

    public final void z1() {
        if (this.v != 1 && r1()) {
            this.z = !this.y;
        } else {
            this.z = this.y;
        }
    }

    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        public int[] a;
        public List<FullSpanItem> b;

        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void b(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int length = iArr.length;
                while (length <= i2) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public FullSpanItem c(int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.f531f == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
                if (r0 != 0) goto L10
            Le:
                r0 = -1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f531f
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = -1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.b
                r3.remove(r2)
                int r0 = r0.f531f
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.a
                int r5 = r5.length
                return r5
            L52:
                int[] r2 = r4.a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.d(int):int");
        }

        public void e(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            b(i4);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.a, i2, i4, -1);
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i5 = fullSpanItem.f531f;
                if (i5 >= i2) {
                    fullSpanItem.f531f = i5 + i3;
                }
            }
        }

        public void f(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            b(i4);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i5 = fullSpanItem.f531f;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.f531f = i5 - i3;
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: f  reason: collision with root package name */
            public int f531f;

            /* renamed from: g  reason: collision with root package name */
            public int f532g;

            /* renamed from: h  reason: collision with root package name */
            public int[] f533h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f534i;

            /* loaded from: classes.dex */
            public static class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f531f = parcel.readInt();
                this.f532g = parcel.readInt();
                this.f534i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f533h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder A = f.a.b.a.a.A("FullSpanItem{mPosition=");
                A.append(this.f531f);
                A.append(", mGapDir=");
                A.append(this.f532g);
                A.append(", mHasUnwantedGapAfter=");
                A.append(this.f534i);
                A.append(", mGapPerSpan=");
                A.append(Arrays.toString(this.f533h));
                A.append('}');
                return A.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f531f);
                parcel.writeInt(this.f532g);
                parcel.writeInt(this.f534i ? 1 : 0);
                int[] iArr = this.f533h;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f533h);
                    return;
                }
                parcel.writeInt(0);
            }

            public FullSpanItem() {
            }
        }
    }
}

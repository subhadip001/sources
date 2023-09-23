package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.android.gms.common.api.Api;
import e.g.a.h.c;
import e.g.a.h.d;
import e.g.a.h.e;
import e.g.a.h.j.b;
import e.g.c.f;
import e.g.c.h;
import e.g.c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static i y;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<View> f282f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<e.g.c.a> f283g;

    /* renamed from: h  reason: collision with root package name */
    public c f284h;

    /* renamed from: i  reason: collision with root package name */
    public int f285i;

    /* renamed from: j  reason: collision with root package name */
    public int f286j;

    /* renamed from: k  reason: collision with root package name */
    public int f287k;

    /* renamed from: l  reason: collision with root package name */
    public int f288l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f289m;
    public int n;
    public e.g.c.c o;
    public e.g.c.b p;
    public int q;
    public HashMap<String, Integer> r;
    public int s;
    public int t;
    public SparseArray<ConstraintWidget> u;
    public b v;
    public int w;
    public int x;

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0033b {
        public ConstraintLayout a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f300d;

        /* renamed from: e  reason: collision with root package name */
        public int f301e;

        /* renamed from: f  reason: collision with root package name */
        public int f302f;

        /* renamed from: g  reason: collision with root package name */
        public int f303g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public final boolean a(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:124:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x01ef A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.constraintlayout.core.widgets.ConstraintWidget r18, e.g.a.h.j.b.a r19) {
            /*
                Method dump skipped, instructions count: 743
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(androidx.constraintlayout.core.widgets.ConstraintWidget, e.g.a.h.j.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f282f = new SparseArray<>();
        this.f283g = new ArrayList<>(4);
        this.f284h = new c();
        this.f285i = 0;
        this.f286j = 0;
        this.f287k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f288l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f289m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap<>();
        this.s = -1;
        this.t = -1;
        this.u = new SparseArray<>();
        this.v = new b(this);
        this.w = 0;
        this.x = 0;
        f(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static i getSharedValues() {
        if (y == null) {
            y = new i();
        }
        return y;
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i2, Object obj) {
        if (i2 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.r;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.r.get(str);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i2) {
        return this.f282f.get(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<e.g.c.a> arrayList = this.f283g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f283g.get(i2).n();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public final ConstraintWidget e(View view) {
        if (view == this) {
            return this.f284h;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).q0;
            }
            return null;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2, int i3) {
        c cVar = this.f284h;
        cVar.h0 = this;
        b bVar = this.v;
        cVar.v0 = bVar;
        cVar.t0.f2066f = bVar;
        this.f282f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.b, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f285i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f285i);
                } else if (index == 17) {
                    this.f286j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f286j);
                } else if (index == 14) {
                    this.f287k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f287k);
                } else if (index == 15) {
                    this.f288l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f288l);
                } else if (index == 113) {
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            h(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e.g.c.c cVar2 = new e.g.c.c();
                        this.o = cVar2;
                        cVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f284h.h0(this.n);
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f289m = true;
        this.s = -1;
        this.t = -1;
        super.forceLayout();
    }

    public boolean g() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f288l;
    }

    public int getMaxWidth() {
        return this.f287k;
    }

    public int getMinHeight() {
        return this.f286j;
    }

    public int getMinWidth() {
        return this.f285i;
    }

    public int getOptimizationLevel() {
        return this.f284h.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f284h.f273j == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f284h.f273j = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f284h.f273j = "parent";
            }
        }
        c cVar = this.f284h;
        if (cVar.j0 == null) {
            cVar.j0 = cVar.f273j;
            StringBuilder A = f.a.b.a.a.A(" setDebugName ");
            A.append(this.f284h.j0);
            Log.v("ConstraintLayout", A.toString());
        }
        Iterator<ConstraintWidget> it = this.f284h.r0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.h0;
            if (view != null) {
                if (next.f273j == null && (id = view.getId()) != -1) {
                    next.f273j = getContext().getResources().getResourceEntryName(id);
                }
                if (next.j0 == null) {
                    next.j0 = next.f273j;
                    StringBuilder A2 = f.a.b.a.a.A(" setDebugName ");
                    A2.append(next.j0);
                    Log.v("ConstraintLayout", A2.toString());
                }
            }
        }
        this.f284h.q(sb);
        return sb.toString();
    }

    public void h(int i2) {
        this.p = new e.g.c.b(getContext(), this, i2);
    }

    public void i(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        b bVar = this.v;
        int i6 = bVar.f301e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + bVar.f300d, i2, 0);
        int min = Math.min(this.f287k, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f288l, ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.s = min;
        this.t = min2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = aVar.q0;
            if ((childAt.getVisibility() != 8 || aVar.d0 || aVar.e0 || isInEditMode) && !aVar.f0) {
                int v = constraintWidget.v();
                int w = constraintWidget.w();
                int u = constraintWidget.u() + v;
                int l2 = constraintWidget.l() + w;
                childAt.layout(v, w, u, l2);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v, w, u, l2);
                }
            }
        }
        int size = this.f283g.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f283g.get(i7).l(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0555 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget e2 = e(view);
        if ((view instanceof Guideline) && !(e2 instanceof d)) {
            a aVar = (a) view.getLayoutParams();
            d dVar = new d();
            aVar.q0 = dVar;
            aVar.d0 = true;
            dVar.X(aVar.V);
        }
        if (view instanceof e.g.c.a) {
            e.g.c.a aVar2 = (e.g.c.a) view;
            aVar2.o();
            ((a) view.getLayoutParams()).e0 = true;
            if (!this.f283g.contains(aVar2)) {
                this.f283g.add(aVar2);
            }
        }
        this.f282f.put(view.getId(), view);
        this.f289m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f282f.remove(view.getId());
        ConstraintWidget e2 = e(view);
        this.f284h.r0.remove(e2);
        e2.G();
        this.f283g.remove(view);
        this.f289m = true;
    }

    public void p(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.r == null) {
                this.r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void q(ConstraintWidget constraintWidget, a aVar, SparseArray<ConstraintWidget> sparseArray, int i2, ConstraintAnchor.Type type) {
        View view = this.f282f.get(i2);
        ConstraintWidget constraintWidget2 = sparseArray.get(i2);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            a aVar2 = (a) view.getLayoutParams();
            aVar2.c0 = true;
            aVar2.q0.E = true;
        }
        constraintWidget.i(type2).a(constraintWidget2.i(type), aVar.D, aVar.C, true);
        constraintWidget.E = true;
        constraintWidget.i(ConstraintAnchor.Type.TOP).h();
        constraintWidget.i(ConstraintAnchor.Type.BOTTOM).h();
    }

    public final boolean r() {
        boolean z;
        boolean z2;
        int i2;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        int i3;
        int i4;
        float parseFloat;
        int i5;
        int i6;
        String str;
        int i7;
        ConstraintWidget constraintWidget5;
        ConstraintLayout constraintLayout = this;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            z = true;
            if (i9 >= childCount) {
                z2 = false;
                break;
            } else if (constraintLayout.getChildAt(i9).isLayoutRequested()) {
                z2 = true;
                break;
            } else {
                i9++;
            }
        }
        if (z2) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                ConstraintWidget e2 = constraintLayout.e(constraintLayout.getChildAt(i10));
                if (e2 != null) {
                    e2.G();
                }
            }
            Object obj = null;
            if (isInEditMode) {
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt = constraintLayout.getChildAt(i11);
                    try {
                        String resourceName = getResources().getResourceName(childAt.getId());
                        constraintLayout.p(0, resourceName, Integer.valueOf(childAt.getId()));
                        int indexOf = resourceName.indexOf(47);
                        if (indexOf != -1) {
                            resourceName = resourceName.substring(indexOf + 1);
                        }
                        int id = childAt.getId();
                        if (id == 0) {
                            constraintWidget5 = constraintLayout.f284h;
                        } else {
                            View view = constraintLayout.f282f.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view == constraintLayout) {
                                constraintWidget5 = constraintLayout.f284h;
                            } else {
                                constraintWidget5 = view == null ? null : ((a) view.getLayoutParams()).q0;
                            }
                        }
                        constraintWidget5.j0 = resourceName;
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            if (constraintLayout.q != -1) {
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = constraintLayout.getChildAt(i12);
                    if (childAt2.getId() == constraintLayout.q && (childAt2 instanceof e.g.c.d)) {
                        constraintLayout.o = ((e.g.c.d) childAt2).getConstraintSet();
                    }
                }
            }
            e.g.c.c cVar = constraintLayout.o;
            if (cVar != null) {
                cVar.b(constraintLayout, true);
            }
            constraintLayout.f284h.r0.clear();
            int size = constraintLayout.f283g.size();
            if (size > 0) {
                int i13 = 0;
                while (i13 < size) {
                    e.g.c.a aVar = constraintLayout.f283g.get(i13);
                    if (aVar.isInEditMode()) {
                        aVar.setIds(aVar.f2117j);
                    }
                    e eVar = aVar.f2116i;
                    if (eVar != null) {
                        e.g.a.h.f fVar = (e.g.a.h.f) eVar;
                        fVar.s0 = i8;
                        Arrays.fill(fVar.r0, obj);
                        for (int i14 = 0; i14 < aVar.f2114g; i14++) {
                            int i15 = aVar.f2113f[i14];
                            View d2 = constraintLayout.d(i15);
                            if (d2 == null && (i7 = aVar.i(constraintLayout, (str = aVar.f2120m.get(Integer.valueOf(i15))))) != 0) {
                                aVar.f2113f[i14] = i7;
                                aVar.f2120m.put(Integer.valueOf(i7), str);
                                d2 = constraintLayout.d(i7);
                            }
                            if (d2 != null) {
                                e eVar2 = aVar.f2116i;
                                ConstraintWidget e3 = constraintLayout.e(d2);
                                e.g.a.h.f fVar2 = (e.g.a.h.f) eVar2;
                                Objects.requireNonNull(fVar2);
                                if (e3 != fVar2 && e3 != null) {
                                    int i16 = fVar2.s0 + 1;
                                    ConstraintWidget[] constraintWidgetArr = fVar2.r0;
                                    if (i16 > constraintWidgetArr.length) {
                                        fVar2.r0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                    }
                                    ConstraintWidget[] constraintWidgetArr2 = fVar2.r0;
                                    int i17 = fVar2.s0;
                                    constraintWidgetArr2[i17] = e3;
                                    fVar2.s0 = i17 + 1;
                                }
                            }
                        }
                        aVar.f2116i.a(constraintLayout.f284h);
                    }
                    i13++;
                    obj = null;
                    i8 = 0;
                }
            }
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt3 = constraintLayout.getChildAt(i18);
                if (childAt3 instanceof f) {
                    f fVar3 = (f) childAt3;
                    if (fVar3.f2176f == -1 && !fVar3.isInEditMode()) {
                        fVar3.setVisibility(fVar3.f2178h);
                    }
                    View findViewById = constraintLayout.findViewById(fVar3.f2176f);
                    fVar3.f2177g = findViewById;
                    if (findViewById != null) {
                        ((a) findViewById.getLayoutParams()).f0 = true;
                        fVar3.f2177g.setVisibility(0);
                        fVar3.setVisibility(0);
                    }
                }
            }
            constraintLayout.u.clear();
            constraintLayout.u.put(0, constraintLayout.f284h);
            constraintLayout.u.put(getId(), constraintLayout.f284h);
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt4 = constraintLayout.getChildAt(i19);
                constraintLayout.u.put(childAt4.getId(), constraintLayout.e(childAt4));
            }
            int i20 = 0;
            while (i20 < childCount2) {
                View childAt5 = constraintLayout.getChildAt(i20);
                ConstraintWidget e4 = constraintLayout.e(childAt5);
                if (e4 != null) {
                    a aVar2 = (a) childAt5.getLayoutParams();
                    c cVar2 = constraintLayout.f284h;
                    cVar2.r0.add(e4);
                    ConstraintWidget constraintWidget6 = e4.V;
                    if (constraintWidget6 != null) {
                        ((e.g.a.h.i) constraintWidget6).r0.remove(e4);
                        e4.G();
                    }
                    e4.V = cVar2;
                    SparseArray<ConstraintWidget> sparseArray = constraintLayout.u;
                    aVar2.a();
                    e4.i0 = childAt5.getVisibility();
                    if (aVar2.f0) {
                        e4.F = z;
                        e4.i0 = 8;
                    }
                    e4.h0 = childAt5;
                    if (childAt5 instanceof e.g.c.a) {
                        ((e.g.c.a) childAt5).k(e4, constraintLayout.f284h.w0);
                    }
                    if (aVar2.d0) {
                        d dVar = (d) e4;
                        int i21 = aVar2.n0;
                        int i22 = aVar2.o0;
                        float f2 = aVar2.p0;
                        int i23 = (f2 > (-1.0f) ? 1 : (f2 == (-1.0f) ? 0 : -1));
                        if (i23 != 0) {
                            if (i23 > 0) {
                                dVar.r0 = f2;
                                dVar.s0 = -1;
                                dVar.t0 = -1;
                            }
                        } else if (i21 != -1) {
                            if (i21 > -1) {
                                dVar.r0 = -1.0f;
                                dVar.s0 = i21;
                                dVar.t0 = -1;
                            }
                        } else if (i22 != -1 && i22 > -1) {
                            dVar.r0 = -1.0f;
                            dVar.s0 = -1;
                            dVar.t0 = i22;
                        }
                    } else {
                        int i24 = aVar2.g0;
                        int i25 = aVar2.h0;
                        int i26 = aVar2.i0;
                        int i27 = aVar2.j0;
                        int i28 = aVar2.k0;
                        int i29 = aVar2.l0;
                        float f3 = aVar2.m0;
                        int i30 = aVar2.p;
                        i2 = childCount2;
                        if (i30 != -1) {
                            ConstraintWidget constraintWidget7 = sparseArray.get(i30);
                            if (constraintWidget7 != null) {
                                float f4 = aVar2.r;
                                int i31 = aVar2.q;
                                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                                e4.z(type, constraintWidget7, type, i31, 0);
                                e4.D = f4;
                            }
                        } else {
                            if (i24 != -1) {
                                ConstraintWidget constraintWidget8 = sparseArray.get(i24);
                                if (constraintWidget8 != null) {
                                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                                    e4.z(type2, constraintWidget8, type2, ((ViewGroup.MarginLayoutParams) aVar2).leftMargin, i28);
                                }
                            } else if (i25 != -1 && (constraintWidget = sparseArray.get(i25)) != null) {
                                e4.z(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) aVar2).leftMargin, i28);
                            }
                            if (i26 != -1) {
                                ConstraintWidget constraintWidget9 = sparseArray.get(i26);
                                if (constraintWidget9 != null) {
                                    e4.z(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, i29);
                                }
                            } else if (i27 != -1 && (constraintWidget2 = sparseArray.get(i27)) != null) {
                                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                                e4.z(type3, constraintWidget2, type3, ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, i29);
                            }
                            int i32 = aVar2.f295i;
                            if (i32 != -1) {
                                ConstraintWidget constraintWidget10 = sparseArray.get(i32);
                                if (constraintWidget10 != null) {
                                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                                    e4.z(type4, constraintWidget10, type4, ((ViewGroup.MarginLayoutParams) aVar2).topMargin, aVar2.x);
                                }
                            } else {
                                int i33 = aVar2.f296j;
                                if (i33 != -1 && (constraintWidget3 = sparseArray.get(i33)) != null) {
                                    e4.z(ConstraintAnchor.Type.TOP, constraintWidget3, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) aVar2).topMargin, aVar2.x);
                                }
                            }
                            int i34 = aVar2.f297k;
                            if (i34 != -1) {
                                ConstraintWidget constraintWidget11 = sparseArray.get(i34);
                                if (constraintWidget11 != null) {
                                    e4.z(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin, aVar2.z);
                                }
                            } else {
                                int i35 = aVar2.f298l;
                                if (i35 != -1 && (constraintWidget4 = sparseArray.get(i35)) != null) {
                                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                                    e4.z(type5, constraintWidget4, type5, ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin, aVar2.z);
                                }
                            }
                            int i36 = aVar2.f299m;
                            if (i36 != -1) {
                                q(e4, aVar2, sparseArray, i36, ConstraintAnchor.Type.BASELINE);
                            } else {
                                int i37 = aVar2.n;
                                if (i37 != -1) {
                                    q(e4, aVar2, sparseArray, i37, ConstraintAnchor.Type.TOP);
                                } else {
                                    int i38 = aVar2.o;
                                    if (i38 != -1) {
                                        q(e4, aVar2, sparseArray, i38, ConstraintAnchor.Type.BOTTOM);
                                    }
                                }
                            }
                            if (f3 >= 0.0f) {
                                e4.f0 = f3;
                            }
                            float f5 = aVar2.F;
                            if (f5 >= 0.0f) {
                                e4.g0 = f5;
                            }
                        }
                        if (isInEditMode && ((i6 = aVar2.T) != -1 || aVar2.U != -1)) {
                            int i39 = aVar2.U;
                            e4.a0 = i6;
                            e4.b0 = i39;
                        }
                        if (!aVar2.a0) {
                            if (((ViewGroup.MarginLayoutParams) aVar2).width == -1) {
                                if (aVar2.W) {
                                    e4.P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                                } else {
                                    e4.P(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                                }
                                e4.i(ConstraintAnchor.Type.LEFT).f264g = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                                e4.i(ConstraintAnchor.Type.RIGHT).f264g = ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                            } else {
                                e4.P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                                e4.T(0);
                            }
                        } else {
                            e4.P(ConstraintWidget.DimensionBehaviour.FIXED);
                            e4.T(((ViewGroup.MarginLayoutParams) aVar2).width);
                            if (((ViewGroup.MarginLayoutParams) aVar2).width == -2) {
                                e4.P(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                            }
                        }
                        if (!aVar2.b0) {
                            if (((ViewGroup.MarginLayoutParams) aVar2).height == -1) {
                                if (aVar2.X) {
                                    e4.S(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                                } else {
                                    e4.S(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                                }
                                e4.i(ConstraintAnchor.Type.TOP).f264g = ((ViewGroup.MarginLayoutParams) aVar2).topMargin;
                                e4.i(ConstraintAnchor.Type.BOTTOM).f264g = ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                            } else {
                                e4.S(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                                e4.O(0);
                            }
                        } else {
                            e4.S(ConstraintWidget.DimensionBehaviour.FIXED);
                            e4.O(((ViewGroup.MarginLayoutParams) aVar2).height);
                            if (((ViewGroup.MarginLayoutParams) aVar2).height == -2) {
                                e4.S(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                            }
                        }
                        String str2 = aVar2.G;
                        if (str2 != null && str2.length() != 0) {
                            int length = str2.length();
                            int indexOf2 = str2.indexOf(44);
                            if (indexOf2 <= 0 || indexOf2 >= length - 1) {
                                i3 = -1;
                                i4 = 0;
                            } else {
                                String substring = str2.substring(0, indexOf2);
                                if (substring.equalsIgnoreCase("W")) {
                                    i5 = 0;
                                } else {
                                    i5 = substring.equalsIgnoreCase("H") ? 1 : -1;
                                }
                                int i40 = i5;
                                i4 = indexOf2 + 1;
                                i3 = i40;
                            }
                            int indexOf3 = str2.indexOf(58);
                            if (indexOf3 >= 0 && indexOf3 < length - 1) {
                                String substring2 = str2.substring(i4, indexOf3);
                                String substring3 = str2.substring(indexOf3 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat2 = Float.parseFloat(substring2);
                                        float parseFloat3 = Float.parseFloat(substring3);
                                        if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                            if (i3 == 1) {
                                                parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                            } else {
                                                parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                                parseFloat = 0.0f;
                            } else {
                                String substring4 = str2.substring(i4);
                                if (substring4.length() > 0) {
                                    parseFloat = Float.parseFloat(substring4);
                                }
                                parseFloat = 0.0f;
                            }
                            if (parseFloat > 0.0f) {
                                e4.Y = parseFloat;
                                e4.Z = i3;
                            }
                        } else {
                            e4.Y = 0.0f;
                        }
                        float f6 = aVar2.H;
                        float[] fArr = e4.m0;
                        fArr[0] = f6;
                        fArr[1] = aVar2.I;
                        e4.k0 = aVar2.J;
                        e4.l0 = aVar2.K;
                        int i41 = aVar2.Z;
                        if (i41 >= 0 && i41 <= 3) {
                            e4.q = i41;
                        }
                        int i42 = aVar2.L;
                        int i43 = aVar2.N;
                        int i44 = aVar2.P;
                        float f7 = aVar2.R;
                        e4.r = i42;
                        e4.u = i43;
                        if (i44 == Integer.MAX_VALUE) {
                            i44 = 0;
                        }
                        e4.v = i44;
                        e4.w = f7;
                        if (f7 > 0.0f && f7 < 1.0f && i42 == 0) {
                            e4.r = 2;
                        }
                        int i45 = aVar2.M;
                        int i46 = aVar2.O;
                        int i47 = aVar2.Q;
                        float f8 = aVar2.S;
                        e4.s = i45;
                        e4.x = i46;
                        if (i47 == Integer.MAX_VALUE) {
                            i47 = 0;
                        }
                        e4.y = i47;
                        e4.z = f8;
                        if (f8 > 0.0f && f8 < 1.0f && i45 == 0) {
                            e4.s = 2;
                        }
                        i20++;
                        constraintLayout = this;
                        childCount2 = i2;
                        z = true;
                    }
                }
                i2 = childCount2;
                i20++;
                constraintLayout = this;
                childCount2 = i2;
                z = true;
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f289m = true;
        this.s = -1;
        this.t = -1;
        super.requestLayout();
    }

    public void setConstraintSet(e.g.c.c cVar) {
        this.o = cVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f282f.remove(getId());
        super.setId(i2);
        this.f282f.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f288l) {
            return;
        }
        this.f288l = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f287k) {
            return;
        }
        this.f287k = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f286j) {
            return;
        }
        this.f286j = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f285i) {
            return;
        }
        this.f285i = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(e.g.c.e eVar) {
        e.g.c.b bVar = this.p;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.n = i2;
        c cVar = this.f284h;
        cVar.E0 = i2;
        e.g.a.d.p = cVar.g0(512);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f282f = new SparseArray<>();
        this.f283g = new ArrayList<>(4);
        this.f284h = new c();
        this.f285i = 0;
        this.f286j = 0;
        this.f287k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f288l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f289m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap<>();
        this.s = -1;
        this.t = -1;
        this.u = new SparseArray<>();
        this.v = new b(this);
        this.w = 0;
        this.x = 0;
        f(attributeSet, i2, 0);
    }

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f290d;
        public boolean d0;

        /* renamed from: e  reason: collision with root package name */
        public int f291e;
        public boolean e0;

        /* renamed from: f  reason: collision with root package name */
        public int f292f;
        public boolean f0;

        /* renamed from: g  reason: collision with root package name */
        public int f293g;
        public int g0;

        /* renamed from: h  reason: collision with root package name */
        public int f294h;
        public int h0;

        /* renamed from: i  reason: collision with root package name */
        public int f295i;
        public int i0;

        /* renamed from: j  reason: collision with root package name */
        public int f296j;
        public int j0;

        /* renamed from: k  reason: collision with root package name */
        public int f297k;
        public int k0;

        /* renamed from: l  reason: collision with root package name */
        public int f298l;
        public int l0;

        /* renamed from: m  reason: collision with root package name */
        public int f299m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public ConstraintWidget q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.f290d = true;
            this.f291e = -1;
            this.f292f = -1;
            this.f293g = -1;
            this.f294h = -1;
            this.f295i = -1;
            this.f296j = -1;
            this.f297k = -1;
            this.f298l = -1;
            this.f299m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0001a.a.get(index);
                switch (i3) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f2;
                        if (f2 < 0.0f) {
                            this.r = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f291e);
                        this.f291e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f291e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f292f);
                        this.f292f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f292f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f293g);
                        this.f293g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f293g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f294h);
                        this.f294h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f294h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f295i);
                        this.f295i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f295i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f296j);
                        this.f296j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f296j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f297k);
                        this.f297k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f297k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f298l);
                        this.f298l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f298l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f299m);
                        this.f299m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f299m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                e.g.c.c.h(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i3) {
                                    case 64:
                                        e.g.c.c.g(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                    case 65:
                                        e.g.c.c.g(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f290d = obtainStyledAttributes.getBoolean(index, this.f290d);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.a0 = false;
                if (i2 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.b0 = false;
                if (i3 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.q0 instanceof d)) {
                this.q0 = new d();
            }
            ((d) this.q0).X(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.f290d = true;
            this.f291e = -1;
            this.f292f = -1;
            this.f293g = -1;
            this.f294h = -1;
            this.f295i = -1;
            this.f296j = -1;
            this.f297k = -1;
            this.f298l = -1;
            this.f299m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.f290d = true;
            this.f291e = -1;
            this.f292f = -1;
            this.f293g = -1;
            this.f294h = -1;
            this.f295i = -1;
            this.f296j = -1;
            this.f297k = -1;
            this.f298l = -1;
            this.f299m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ConstraintWidget();
        }
    }
}

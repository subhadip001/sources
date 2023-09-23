package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import e.b.c.v;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.m;
import e.b.g.i.n;
import e.b.h.f1;
import e.i.j.k;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements g.b, n {
    public g.a A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public e F;
    public g u;
    public Context v;
    public int w;
    public boolean x;
    public ActionMenuPresenter y;
    public m.a z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements m.a {
        @Override // e.b.g.i.m.a
        public void b(g gVar, boolean z) {
        }

        @Override // e.b.g.i.m.a
        public boolean c(g gVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f147d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f148e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f149f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements g.a {
        public d() {
        }

        @Override // e.b.g.i.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            boolean z;
            boolean onMenuItemSelected;
            e eVar = ActionMenuView.this.F;
            if (eVar != null) {
                Toolbar.a aVar = (Toolbar.a) eVar;
                Iterator<k> it = Toolbar.this.L.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (it.next().a(menuItem)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    onMenuItemSelected = true;
                } else {
                    Toolbar.f fVar = Toolbar.this.N;
                    onMenuItemSelected = fVar != null ? v.this.b.onMenuItemSelected(0, menuItem) : false;
                }
                if (onMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // e.b.g.i.g.a
        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.A;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.D = (int) (56.0f * f2);
        this.E = (int) (f2 * 4.0f);
        this.v = context;
        this.w = 0;
    }

    public static int t(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.c();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (!cVar.a && z2) {
            z = true;
        }
        cVar.f147d = z;
        cVar.b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, CommonUtils.BYTES_IN_A_GIGABYTE), makeMeasureSpec);
        return i6;
    }

    @Override // e.b.g.i.g.b
    public boolean a(i iVar) {
        return this.u.s(iVar, null, 0);
    }

    @Override // e.b.g.i.n
    public void b(g gVar) {
        this.u = gVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.u == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.u = gVar;
            gVar.f1652e = new d();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.y = actionMenuPresenter;
            actionMenuPresenter.r = true;
            actionMenuPresenter.s = true;
            m.a aVar = this.z;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter.f1619j = aVar;
            this.u.b(actionMenuPresenter, this.v);
            ActionMenuPresenter actionMenuPresenter2 = this.y;
            actionMenuPresenter2.f1622m = this;
            this.u = actionMenuPresenter2.f1617h;
        }
        return this.u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.y;
        ActionMenuPresenter.d dVar = actionMenuPresenter.o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.q) {
            return actionMenuPresenter.p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public LinearLayoutCompat.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.c(false);
            if (this.y.o()) {
                this.y.k();
                this.y.p();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.B) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = f1.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (s(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    s(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        ?? r3;
        g gVar;
        boolean z3 = this.B;
        boolean z4 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.B = z4;
        if (z3 != z4) {
            this.C = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.B && (gVar = this.u) != null && size != this.C) {
            this.C = size;
            gVar.q(true);
        }
        int childCount = getChildCount();
        if (this.B && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i3);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
            int i8 = size2 - paddingRight;
            int i9 = this.D;
            int i10 = i8 / i9;
            int i11 = i8 % i9;
            if (i10 == 0) {
                setMeasuredDimension(i8, 0);
                return;
            }
            int i12 = (i11 / i10) + i9;
            int childCount2 = getChildCount();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            boolean z5 = false;
            long j2 = 0;
            while (i17 < childCount2) {
                View childAt = getChildAt(i17);
                int i18 = size3;
                int i19 = i8;
                if (childAt.getVisibility() != 8) {
                    boolean z6 = childAt instanceof ActionMenuItemView;
                    int i20 = i13 + 1;
                    if (z6) {
                        int i21 = this.E;
                        i7 = i20;
                        r3 = 0;
                        childAt.setPadding(i21, 0, i21, 0);
                    } else {
                        i7 = i20;
                        r3 = 0;
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f149f = r3;
                    cVar.c = r3;
                    cVar.b = r3;
                    cVar.f147d = r3;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = r3;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = r3;
                    cVar.f148e = z6 && ((ActionMenuItemView) childAt).c();
                    int t = t(childAt, i12, cVar.a ? 1 : i10, childMeasureSpec, paddingBottom);
                    i15 = Math.max(i15, t);
                    if (cVar.f147d) {
                        i16++;
                    }
                    if (cVar.a) {
                        z5 = true;
                    }
                    i10 -= t;
                    i14 = Math.max(i14, childAt.getMeasuredHeight());
                    if (t == 1) {
                        j2 |= 1 << i17;
                    }
                    i13 = i7;
                }
                i17++;
                size3 = i18;
                i8 = i19;
            }
            int i22 = i8;
            int i23 = size3;
            boolean z7 = z5 && i13 == 2;
            boolean z8 = false;
            while (i16 > 0 && i10 > 0) {
                int i24 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int i25 = 0;
                int i26 = 0;
                long j3 = 0;
                while (i25 < childCount2) {
                    int i27 = i14;
                    c cVar2 = (c) getChildAt(i25).getLayoutParams();
                    boolean z9 = z8;
                    if (cVar2.f147d) {
                        int i28 = cVar2.b;
                        if (i28 < i24) {
                            j3 = 1 << i25;
                            i24 = i28;
                            i26 = 1;
                        } else if (i28 == i24) {
                            i26++;
                            j3 |= 1 << i25;
                        }
                    }
                    i25++;
                    z8 = z9;
                    i14 = i27;
                }
                i4 = i14;
                z = z8;
                j2 |= j3;
                if (i26 > i10) {
                    break;
                }
                int i29 = i24 + 1;
                int i30 = 0;
                while (i30 < childCount2) {
                    View childAt2 = getChildAt(i30);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i31 = i16;
                    long j4 = 1 << i30;
                    if ((j3 & j4) == 0) {
                        if (cVar3.b == i29) {
                            j2 |= j4;
                        }
                        z2 = z7;
                    } else {
                        if (z7 && cVar3.f148e && i10 == 1) {
                            int i32 = this.E;
                            z2 = z7;
                            childAt2.setPadding(i32 + i12, 0, i32, 0);
                        } else {
                            z2 = z7;
                        }
                        cVar3.b++;
                        cVar3.f149f = true;
                        i10--;
                    }
                    i30++;
                    i16 = i31;
                    z7 = z2;
                }
                i14 = i4;
                z8 = true;
            }
            i4 = i14;
            z = z8;
            boolean z10 = !z5 && i13 == 1;
            if (i10 > 0 && j2 != 0 && (i10 < i13 - 1 || z10 || i15 > 1)) {
                float bitCount = Long.bitCount(j2);
                if (!z10) {
                    if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f148e) {
                        bitCount -= 0.5f;
                    }
                    int i33 = childCount2 - 1;
                    if ((j2 & (1 << i33)) != 0 && !((c) getChildAt(i33).getLayoutParams()).f148e) {
                        bitCount -= 0.5f;
                    }
                }
                int i34 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : 0;
                for (int i35 = 0; i35 < childCount2; i35++) {
                    if ((j2 & (1 << i35)) != 0) {
                        View childAt3 = getChildAt(i35);
                        c cVar4 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar4.c = i34;
                            cVar4.f149f = true;
                            if (i35 == 0 && !cVar4.f148e) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i34) / 2;
                            }
                        } else if (cVar4.a) {
                            cVar4.c = i34;
                            cVar4.f149f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i34) / 2;
                        } else {
                            if (i35 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i34 / 2;
                            }
                            if (i35 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i34 / 2;
                            }
                        }
                        z = true;
                    }
                }
            }
            if (z) {
                for (int i36 = 0; i36 < childCount2; i36++) {
                    View childAt4 = getChildAt(i36);
                    c cVar5 = (c) childAt4.getLayoutParams();
                    if (cVar5.f149f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i12) + cVar5.c, CommonUtils.BYTES_IN_A_GIGABYTE), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i6 = i22;
                i5 = i4;
            } else {
                i5 = i23;
                i6 = i22;
            }
            setMeasuredDimension(i6, i5);
            return;
        }
        for (int i37 = 0; i37 < childCount; i37++) {
            c cVar6 = (c) getChildAt(i37).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar6).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar6).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: q */
    public c h() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: r */
    public c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return h();
    }

    public boolean s(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.y.w = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.y;
        ActionMenuPresenter.d dVar = actionMenuPresenter.o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.q = true;
        actionMenuPresenter.p = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.x = z;
    }

    public void setPopupTheme(int i2) {
        if (this.w != i2) {
            this.w = i2;
            if (i2 == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.y = actionMenuPresenter;
        actionMenuPresenter.f1622m = this;
        this.u = actionMenuPresenter.f1617h;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}

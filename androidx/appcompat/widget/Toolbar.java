package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.b.c.a;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.m;
import e.b.g.i.r;
import e.b.h.b1;
import e.b.h.d0;
import e.b.h.r0;
import e.b.h.z0;
import e.i.j.j;
import e.i.j.k;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList<View> I;
    public final ArrayList<View> J;
    public final int[] K;
    public final j L;
    public ArrayList<MenuItem> M;
    public f N;
    public final ActionMenuView.e O;
    public b1 P;
    public ActionMenuPresenter Q;
    public d R;
    public m.a S;
    public g.a T;
    public boolean U;
    public final Runnable V;

    /* renamed from: f  reason: collision with root package name */
    public ActionMenuView f231f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f232g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f233h;

    /* renamed from: i  reason: collision with root package name */
    public ImageButton f234i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f235j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f236k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f237l;

    /* renamed from: m  reason: collision with root package name */
    public ImageButton f238m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public r0 y;
    public int z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.w();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.R;
            i iVar = dVar == null ? null : dVar.f244g;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements m {

        /* renamed from: f  reason: collision with root package name */
        public g f243f;

        /* renamed from: g  reason: collision with root package name */
        public i f244g;

        public d() {
        }

        @Override // e.b.g.i.m
        public void b(g gVar, boolean z) {
        }

        @Override // e.b.g.i.m
        public void c(boolean z) {
            if (this.f244g != null) {
                g gVar = this.f243f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f243f.getItem(i2) == this.f244g) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                e(this.f243f, this.f244g);
            }
        }

        @Override // e.b.g.i.m
        public boolean d() {
            return false;
        }

        @Override // e.b.g.i.m
        public boolean e(g gVar, i iVar) {
            View view = Toolbar.this.n;
            if (view instanceof e.b.g.b) {
                ((e.b.g.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f238m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.n = null;
            int size = toolbar3.J.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.J.get(size));
                } else {
                    toolbar3.J.clear();
                    this.f244g = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
            }
        }

        @Override // e.b.g.i.m
        public boolean f(g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f238m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f238m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f238m);
            }
            Toolbar.this.n = iVar.getActionView();
            this.f244g = iVar;
            ViewParent parent2 = Toolbar.this.n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.n);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.s & 112);
                generateDefaultLayoutParams.b = 2;
                toolbar4.n.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.n);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).b != 2 && childAt != toolbar6.f231f) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.J.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            View view = Toolbar.this.n;
            if (view instanceof e.b.g.b) {
                ((e.b.g.b) view).c();
            }
            return true;
        }

        @Override // e.b.g.i.m
        public int getId() {
            return 0;
        }

        @Override // e.b.g.i.m
        public void i(Context context, g gVar) {
            i iVar;
            g gVar2 = this.f243f;
            if (gVar2 != null && (iVar = this.f244g) != null) {
                gVar2.d(iVar);
            }
            this.f243f = gVar;
        }

        @Override // e.b.g.i.m
        public void j(Parcelable parcelable) {
        }

        @Override // e.b.g.i.m
        public boolean l(r rVar) {
            return false;
        }

        @Override // e.b.g.i.m
        public Parcelable m() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new e.b.g.f(getContext());
    }

    public final void a(List<View> list, int i2) {
        AtomicInteger atomicInteger = z.a;
        boolean z = z.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, z.e.d(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && v(childAt) && j(eVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && v(childAt2) && j(eVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.b = 1;
        if (z && this.n != null) {
            view.setLayoutParams(eVar);
            this.J.add(view);
            return;
        }
        addView(view, eVar);
    }

    public void c() {
        if (this.f238m == null) {
            e.b.h.m mVar = new e.b.h.m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f238m = mVar;
            mVar.setImageDrawable(this.f236k);
            this.f238m.setContentDescription(this.f237l);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.s & 112);
            generateDefaultLayoutParams.b = 2;
            this.f238m.setLayoutParams(generateDefaultLayoutParams);
            this.f238m.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.y == null) {
            this.y = new r0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f231f;
        if (actionMenuView.u == null) {
            g gVar = (g) actionMenuView.getMenu();
            if (this.R == null) {
                this.R = new d();
            }
            this.f231f.setExpandedActionViewsExclusive(true);
            gVar.b(this.R, this.o);
        }
    }

    public final void f() {
        if (this.f231f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f231f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f231f.setOnMenuItemClickListener(this.O);
            ActionMenuView actionMenuView2 = this.f231f;
            m.a aVar = this.S;
            g.a aVar2 = this.T;
            actionMenuView2.z = aVar;
            actionMenuView2.A = aVar2;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.s & 112);
            this.f231f.setLayoutParams(generateDefaultLayoutParams);
            b(this.f231f, false);
        }
    }

    public final void g() {
        if (this.f234i == null) {
            this.f234i = new e.b.h.m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.s & 112);
            this.f234i.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f238m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f238m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r0 r0Var = this.y;
        if (r0Var != null) {
            return r0Var.f1834g ? r0Var.a : r0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.A;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r0 r0Var = this.y;
        if (r0Var != null) {
            return r0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        r0 r0Var = this.y;
        if (r0Var != null) {
            return r0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        r0 r0Var = this.y;
        if (r0Var != null) {
            return r0Var.f1834g ? r0Var.b : r0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        g gVar;
        ActionMenuView actionMenuView = this.f231f;
        if ((actionMenuView == null || (gVar = actionMenuView.u) == null || !gVar.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.A, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = z.a;
        if (z.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = z.a;
        if (z.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.z, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f235j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f235j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f231f.getMenu();
    }

    public View getNavButtonView() {
        return this.f234i;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f234i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f234i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f231f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.f233h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    public final TextView getTitleTextView() {
        return this.f232g;
    }

    public d0 getWrapper() {
        if (this.P == null) {
            this.P = new b1(this, true);
        }
        return this.P;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0022a) {
            return new e((a.C0022a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final int j(int i2) {
        AtomicInteger atomicInteger = z.a;
        int d2 = z.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, d2) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : d2 == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.B & 112;
        }
        if (i4 != 48) {
            if (i4 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i5 < i6) {
                    i5 = i6;
                } else {
                    int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i7 < i8) {
                        i5 = Math.max(0, i5 - (i8 - i7));
                    }
                }
                return paddingTop + i5;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void o() {
        Iterator<MenuItem> it = this.M.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        j jVar = this.L;
        Menu menu = getMenu();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<k> it2 = jVar.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a1 A[LOOP:0: B:104:0x029f->B:105:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3 A[LOOP:1: B:107:0x02c1->B:108:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e8 A[LOOP:2: B:110:0x02e6->B:111:0x02e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a A[LOOP:3: B:119:0x0338->B:120:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0296  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        ActionMenuView actionMenuView = this.f231f;
        g gVar = actionMenuView != null ? actionMenuView.u : null;
        int i2 = savedState.f239h;
        if (i2 != 0 && this.R != null && gVar != null && (findItem = gVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f240i) {
            removeCallbacks(this.V);
            post(this.V);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        r0 r0Var = this.y;
        boolean z = i2 == 1;
        if (z == r0Var.f1834g) {
            return;
        }
        r0Var.f1834g = z;
        if (!r0Var.f1835h) {
            r0Var.a = r0Var.f1832e;
            r0Var.b = r0Var.f1833f;
        } else if (z) {
            int i3 = r0Var.f1831d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = r0Var.f1832e;
            }
            r0Var.a = i3;
            int i4 = r0Var.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = r0Var.f1833f;
            }
            r0Var.b = i4;
        } else {
            int i5 = r0Var.c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = r0Var.f1832e;
            }
            r0Var.a = i5;
            int i6 = r0Var.f1831d;
            if (i6 == Integer.MIN_VALUE) {
                i6 = r0Var.f1833f;
            }
            r0Var.b = i6;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.R;
        if (dVar != null && (iVar = dVar.f244g) != null) {
            savedState.f239h = iVar.a;
        }
        savedState.f240i = q();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public boolean q() {
        ActionMenuView actionMenuView = this.f231f;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.y;
            if (actionMenuPresenter != null && actionMenuPresenter.o()) {
                return true;
            }
        }
        return false;
    }

    public final int r(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int s(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.b.a.b(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.U = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.A) {
            this.A = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.b.a.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.b.a.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f234i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.N = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f231f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.p != i2) {
            this.p = i2;
            if (i2 == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.x = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final int t(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f231f;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.y;
            if (actionMenuPresenter != null && actionMenuPresenter.p()) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0022a {
        public int b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.b = 0;
            this.a = 8388627;
        }

        public e(e eVar) {
            super((a.C0022a) eVar);
            this.b = 0;
            this.b = eVar.b;
        }

        public e(a.C0022a c0022a) {
            super(c0022a);
            this.b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = 8388627;
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.K = new int[2];
        this.L = new j(new Runnable() { // from class: e.b.h.a
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.o();
            }
        });
        this.M = new ArrayList<>();
        this.O = new a();
        this.V = new b();
        Context context2 = getContext();
        int[] iArr = e.b.b.z;
        z0 q = z0.q(context2, attributeSet, iArr, i2, 0);
        z.v(this, context, iArr, attributeSet, q.b, i2, 0);
        this.q = q.l(28, 0);
        this.r = q.l(19, 0);
        this.B = q.b.getInteger(0, this.B);
        this.s = q.b.getInteger(2, 48);
        int e2 = q.e(22, 0);
        e2 = q.o(27) ? q.e(27, e2) : e2;
        this.x = e2;
        this.w = e2;
        this.v = e2;
        this.u = e2;
        int e3 = q.e(25, -1);
        if (e3 >= 0) {
            this.u = e3;
        }
        int e4 = q.e(24, -1);
        if (e4 >= 0) {
            this.v = e4;
        }
        int e5 = q.e(26, -1);
        if (e5 >= 0) {
            this.w = e5;
        }
        int e6 = q.e(23, -1);
        if (e6 >= 0) {
            this.x = e6;
        }
        this.t = q.f(13, -1);
        int e7 = q.e(9, Integer.MIN_VALUE);
        int e8 = q.e(5, Integer.MIN_VALUE);
        int f2 = q.f(7, 0);
        int f3 = q.f(8, 0);
        d();
        r0 r0Var = this.y;
        r0Var.f1835h = false;
        if (f2 != Integer.MIN_VALUE) {
            r0Var.f1832e = f2;
            r0Var.a = f2;
        }
        if (f3 != Integer.MIN_VALUE) {
            r0Var.f1833f = f3;
            r0Var.b = f3;
        }
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            r0Var.a(e7, e8);
        }
        this.z = q.e(10, Integer.MIN_VALUE);
        this.A = q.e(6, Integer.MIN_VALUE);
        this.f236k = q.g(4);
        this.f237l = q.n(3);
        CharSequence n = q.n(21);
        if (!TextUtils.isEmpty(n)) {
            setTitle(n);
        }
        CharSequence n2 = q.n(18);
        if (!TextUtils.isEmpty(n2)) {
            setSubtitle(n2);
        }
        this.o = getContext();
        setPopupTheme(q.l(17, 0));
        Drawable g2 = q.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence n3 = q.n(15);
        if (!TextUtils.isEmpty(n3)) {
            setNavigationContentDescription(n3);
        }
        Drawable g3 = q.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence n4 = q.n(12);
        if (!TextUtils.isEmpty(n4)) {
            setLogoDescription(n4);
        }
        if (q.o(29)) {
            setTitleTextColor(q.c(29));
        }
        if (q.o(20)) {
            setSubtitleTextColor(q.c(20));
        }
        if (q.o(14)) {
            getMenuInflater().inflate(q.l(14, 0), getMenu());
        }
        q.b.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f238m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f238m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f238m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f236k);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f235j == null) {
                this.f235j = new AppCompatImageView(getContext());
            }
            if (!p(this.f235j)) {
                b(this.f235j, true);
            }
        } else {
            ImageView imageView = this.f235j;
            if (imageView != null && p(imageView)) {
                removeView(this.f235j);
                this.J.remove(this.f235j);
            }
        }
        ImageView imageView2 = this.f235j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f235j == null) {
            this.f235j = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.f235j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f234i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e.b.a.d(this.f234i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f234i)) {
                b(this.f234i, true);
            }
        } else {
            ImageButton imageButton = this.f234i;
            if (imageButton != null && p(imageButton)) {
                removeView(this.f234i);
                this.J.remove(this.f234i);
            }
        }
        ImageButton imageButton2 = this.f234i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f233h == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f233h = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f233h.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.r;
                if (i2 != 0) {
                    this.f233h.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f233h.setTextColor(colorStateList);
                }
            }
            if (!p(this.f233h)) {
                b(this.f233h, true);
            }
        } else {
            TextView textView = this.f233h;
            if (textView != null && p(textView)) {
                removeView(this.f233h);
                this.J.remove(this.f233h);
            }
        }
        TextView textView2 = this.f233h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.f233h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f232g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f232g = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f232g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.q;
                if (i2 != 0) {
                    this.f232g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f232g.setTextColor(colorStateList);
                }
            }
            if (!p(this.f232g)) {
                b(this.f232g, true);
            }
        } else {
            TextView textView = this.f232g;
            if (textView != null && p(textView)) {
                removeView(this.f232g);
                this.J.remove(this.f232g);
            }
        }
        TextView textView2 = this.f232g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f232g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f239h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f240i;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f239h = parcel.readInt();
            this.f240i = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeInt(this.f239h);
            parcel.writeInt(this.f240i ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}

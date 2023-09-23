package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.b.g.f;
import e.b.g.i.i;
import e.b.h.z0;
import e.i.j.f0;
import e.i.j.z;
import f.h.b.c.b;
import f.h.b.c.s.j;
import f.h.b.c.s.k;
import f.h.b.c.s.m;
import f.h.b.c.s.r;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import f.h.b.c.y.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class NavigationView extends m {
    public static final int[] x = {16842912};
    public static final int[] y = {-16842910};

    /* renamed from: k  reason: collision with root package name */
    public final j f1176k;

    /* renamed from: l  reason: collision with root package name */
    public final k f1177l;

    /* renamed from: m  reason: collision with root package name */
    public a f1178m;
    public final int n;
    public final int[] o;
    public MenuInflater p;
    public ViewTreeObserver.OnGlobalLayoutListener q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public Path v;
    public final RectF w;

    /* loaded from: classes.dex */
    public interface a {
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.navigationViewStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_NavigationView), attributeSet, R.attr.navigationViewStyle);
        ColorStateList b;
        k kVar = new k();
        this.f1177l = kVar;
        this.o = new int[2];
        this.r = true;
        this.s = true;
        this.t = 0;
        this.u = 0;
        this.w = new RectF();
        Context context2 = getContext();
        j jVar = new j(context2);
        this.f1176k = jVar;
        int[] iArr = b.A;
        r.a(context2, attributeSet, R.attr.navigationViewStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_NavigationView);
        r.b(context2, attributeSet, iArr, R.attr.navigationViewStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_NavigationView, new int[0]);
        z0 z0Var = new z0(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.navigationViewStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_NavigationView));
        if (z0Var.o(1)) {
            Drawable g2 = z0Var.g(1);
            AtomicInteger atomicInteger = z.a;
            z.d.q(this, g2);
        }
        this.u = z0Var.f(7, 0);
        this.t = z0Var.j(0, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            f.h.b.c.y.j a2 = f.h.b.c.y.j.b(context2, attributeSet, R.attr.navigationViewStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_NavigationView, new f.h.b.c.y.a(0)).a();
            Drawable background = getBackground();
            g gVar = new g(a2);
            if (background instanceof ColorDrawable) {
                gVar.r(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.f5480f.b = new f.h.b.c.p.a(context2);
            gVar.z();
            AtomicInteger atomicInteger2 = z.a;
            z.d.q(this, gVar);
        }
        if (z0Var.o(8)) {
            setElevation(z0Var.f(8, 0));
        }
        setFitsSystemWindows(z0Var.a(2, false));
        this.n = z0Var.f(3, 0);
        ColorStateList c = z0Var.o(30) ? z0Var.c(30) : null;
        int l2 = z0Var.o(33) ? z0Var.l(33, 0) : 0;
        if (l2 == 0 && c == null) {
            c = b(16842808);
        }
        if (z0Var.o(14)) {
            b = z0Var.c(14);
        } else {
            b = b(16842808);
        }
        int l3 = z0Var.o(24) ? z0Var.l(24, 0) : 0;
        if (z0Var.o(13)) {
            setItemIconSize(z0Var.f(13, 0));
        }
        ColorStateList c2 = z0Var.o(25) ? z0Var.c(25) : null;
        if (l3 == 0 && c2 == null) {
            c2 = b(16842806);
        }
        Drawable g3 = z0Var.g(10);
        if (g3 == null) {
            if (z0Var.o(17) || z0Var.o(18)) {
                g3 = c(z0Var, f.h.b.c.a.o0(getContext(), z0Var, 19));
                ColorStateList o0 = f.h.b.c.a.o0(context2, z0Var, 16);
                if (o0 != null) {
                    kVar.r = new RippleDrawable(f.h.b.c.w.b.b(o0), null, c(z0Var, null));
                    kVar.c(false);
                }
            }
        }
        if (z0Var.o(11)) {
            setItemHorizontalPadding(z0Var.f(11, 0));
        }
        if (z0Var.o(26)) {
            setItemVerticalPadding(z0Var.f(26, 0));
        }
        setDividerInsetStart(z0Var.f(6, 0));
        setDividerInsetEnd(z0Var.f(5, 0));
        setSubheaderInsetStart(z0Var.f(32, 0));
        setSubheaderInsetEnd(z0Var.f(31, 0));
        setTopInsetScrimEnabled(z0Var.a(34, this.r));
        setBottomInsetScrimEnabled(z0Var.a(4, this.s));
        int f2 = z0Var.f(12, 0);
        setItemMaxLines(z0Var.j(15, 1));
        jVar.f1652e = new f.h.b.c.t.a(this);
        kVar.f5416i = 1;
        kVar.i(context2, jVar);
        if (l2 != 0) {
            kVar.f5419l = l2;
            kVar.c(false);
        }
        kVar.f5420m = c;
        kVar.c(false);
        kVar.p = b;
        kVar.c(false);
        int overScrollMode = getOverScrollMode();
        kVar.E = overScrollMode;
        NavigationMenuView navigationMenuView = kVar.f5413f;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (l3 != 0) {
            kVar.n = l3;
            kVar.c(false);
        }
        kVar.o = c2;
        kVar.c(false);
        kVar.q = g3;
        kVar.c(false);
        kVar.a(f2);
        jVar.b(kVar, jVar.a);
        if (kVar.f5413f == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) kVar.f5418k.inflate(R.layout.design_navigation_menu, (ViewGroup) this, false);
            kVar.f5413f = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new k.h(kVar.f5413f));
            if (kVar.f5417j == null) {
                kVar.f5417j = new k.c();
            }
            int i2 = kVar.E;
            if (i2 != -1) {
                kVar.f5413f.setOverScrollMode(i2);
            }
            kVar.f5414g = (LinearLayout) kVar.f5418k.inflate(R.layout.design_navigation_item_header, (ViewGroup) kVar.f5413f, false);
            kVar.f5413f.setAdapter(kVar.f5417j);
        }
        addView(kVar.f5413f);
        if (z0Var.o(27)) {
            int l4 = z0Var.l(27, 0);
            kVar.h(true);
            getMenuInflater().inflate(l4, jVar);
            kVar.h(false);
            kVar.c(false);
        }
        if (z0Var.o(9)) {
            kVar.f5414g.addView(kVar.f5418k.inflate(z0Var.l(9, 0), (ViewGroup) kVar.f5414g, false));
            NavigationMenuView navigationMenuView3 = kVar.f5413f;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        z0Var.b.recycle();
        this.q = new f.h.b.c.t.b(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.q);
    }

    private MenuInflater getMenuInflater() {
        if (this.p == null) {
            this.p = new f(getContext());
        }
        return this.p;
    }

    @Override // f.h.b.c.s.m
    public void a(f0 f0Var) {
        k kVar = this.f1177l;
        Objects.requireNonNull(kVar);
        int f2 = f0Var.f();
        if (kVar.C != f2) {
            kVar.C = f2;
            kVar.k();
        }
        NavigationMenuView navigationMenuView = kVar.f5413f;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, f0Var.c());
        z.e(kVar.f5414g, f0Var);
    }

    public final ColorStateList b(int i2) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            ColorStateList colorStateList = e.i.c.a.getColorStateList(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i3 = typedValue.data;
                int defaultColor = colorStateList.getDefaultColor();
                int[] iArr = y;
                return new ColorStateList(new int[][]{iArr, x, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i3, defaultColor});
            }
            return null;
        }
        return null;
    }

    public final Drawable c(z0 z0Var, ColorStateList colorStateList) {
        g gVar = new g(f.h.b.c.y.j.a(getContext(), z0Var.l(17, 0), z0Var.l(18, 0), new f.h.b.c.y.a(0)).a());
        gVar.r(colorStateList);
        return new InsetDrawable((Drawable) gVar, z0Var.f(22, 0), z0Var.f(23, 0), z0Var.f(21, 0), z0Var.f(20, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.v == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.v);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f1177l.f5417j.b;
    }

    public int getDividerInsetEnd() {
        return this.f1177l.x;
    }

    public int getDividerInsetStart() {
        return this.f1177l.w;
    }

    public int getHeaderCount() {
        return this.f1177l.f5414g.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f1177l.q;
    }

    public int getItemHorizontalPadding() {
        return this.f1177l.s;
    }

    public int getItemIconPadding() {
        return this.f1177l.u;
    }

    public ColorStateList getItemIconTintList() {
        return this.f1177l.p;
    }

    public int getItemMaxLines() {
        return this.f1177l.B;
    }

    public ColorStateList getItemTextColor() {
        return this.f1177l.o;
    }

    public int getItemVerticalPadding() {
        return this.f1177l.t;
    }

    public Menu getMenu() {
        return this.f1176k;
    }

    public int getSubheaderInsetEnd() {
        Objects.requireNonNull(this.f1177l);
        return 0;
    }

    public int getSubheaderInsetStart() {
        return this.f1177l.y;
    }

    @Override // f.h.b.c.s.m, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            f.h.b.c.a.V0(this, (g) background);
        }
    }

    @Override // f.h.b.c.s.m, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.q);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.n), CommonUtils.BYTES_IN_A_GIGABYTE);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.n, CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        j jVar = this.f1176k;
        Bundle bundle = savedState.f1179h;
        Objects.requireNonNull(jVar);
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || jVar.u.isEmpty()) {
            return;
        }
        Iterator<WeakReference<e.b.g.i.m>> it = jVar.u.iterator();
        while (it.hasNext()) {
            WeakReference<e.b.g.i.m> next = it.next();
            e.b.g.i.m mVar = next.get();
            if (mVar == null) {
                jVar.u.remove(next);
            } else {
                int id = mVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    mVar.j(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable m2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f1179h = bundle;
        j jVar = this.f1176k;
        if (!jVar.u.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<e.b.g.i.m>> it = jVar.u.iterator();
            while (it.hasNext()) {
                WeakReference<e.b.g.i.m> next = it.next();
                e.b.g.i.m mVar = next.get();
                if (mVar == null) {
                    jVar.u.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (m2 = mVar.m()) != null) {
                        sparseArray.put(id, m2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if ((getParent() instanceof DrawerLayout) && this.u > 0 && (getBackground() instanceof g)) {
            g gVar = (g) getBackground();
            f.h.b.c.y.j jVar = gVar.f5480f.a;
            Objects.requireNonNull(jVar);
            j.b bVar = new j.b(jVar);
            int i6 = this.t;
            AtomicInteger atomicInteger = z.a;
            if (Gravity.getAbsoluteGravity(i6, z.e.d(this)) == 3) {
                bVar.g(this.u);
                bVar.e(this.u);
            } else {
                bVar.f(this.u);
                bVar.d(this.u);
            }
            gVar.f5480f.a = bVar.a();
            gVar.invalidateSelf();
            if (this.v == null) {
                this.v = new Path();
            }
            this.v.reset();
            this.w.set(0.0f, 0.0f, i2, i3);
            f.h.b.c.y.k kVar = k.a.a;
            g.b bVar2 = gVar.f5480f;
            kVar.a(bVar2.a, bVar2.f5495k, this.w, this.v);
            invalidate();
            return;
        }
        this.v = null;
        this.w.setEmpty();
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.s = z;
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f1176k.findItem(i2);
        if (findItem != null) {
            this.f1177l.f5417j.o((i) findItem);
        }
    }

    public void setDividerInsetEnd(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.x = i2;
        kVar.c(false);
    }

    public void setDividerInsetStart(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.w = i2;
        kVar.c(false);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f.h.b.c.a.T0(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.q = drawable;
        kVar.c(false);
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(e.i.c.a.getDrawable(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.s = i2;
        kVar.c(false);
    }

    public void setItemHorizontalPaddingResource(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.s = getResources().getDimensionPixelSize(i2);
        kVar.c(false);
    }

    public void setItemIconPadding(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.u = i2;
        kVar.c(false);
    }

    public void setItemIconPaddingResource(int i2) {
        this.f1177l.a(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        if (kVar.v != i2) {
            kVar.v = i2;
            kVar.z = true;
            kVar.c(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.p = colorStateList;
        kVar.c(false);
    }

    public void setItemMaxLines(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.B = i2;
        kVar.c(false);
    }

    public void setItemTextAppearance(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.n = i2;
        kVar.c(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.o = colorStateList;
        kVar.c(false);
    }

    public void setItemVerticalPadding(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.t = i2;
        kVar.c(false);
    }

    public void setItemVerticalPaddingResource(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.t = getResources().getDimensionPixelSize(i2);
        kVar.c(false);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.f1178m = aVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        f.h.b.c.s.k kVar = this.f1177l;
        if (kVar != null) {
            kVar.E = i2;
            NavigationMenuView navigationMenuView = kVar.f5413f;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i2);
            }
        }
    }

    public void setSubheaderInsetEnd(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.y = i2;
        kVar.c(false);
    }

    public void setSubheaderInsetStart(int i2) {
        f.h.b.c.s.k kVar = this.f1177l;
        kVar.y = i2;
        kVar.c(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.r = z;
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public Bundle f1179h;

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
            this.f1179h = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeBundle(this.f1179h);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f1176k.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f1177l.f5417j.o((i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}

package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import com.video_converter.video_compressor.R;
import e.i.j.f0;
import e.i.j.h0.d;
import e.i.j.h0.f;
import e.i.j.z;
import e.k.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] I = {16843828};
    public static final int[] J = {16842931};
    public static final boolean K;
    public static final boolean L;
    public static boolean M;
    public float A;
    public Drawable B;
    public Object C;
    public boolean D;
    public final ArrayList<View> E;
    public Rect F;
    public Matrix G;
    public final e.i.j.h0.f H;

    /* renamed from: f  reason: collision with root package name */
    public final c f349f;

    /* renamed from: g  reason: collision with root package name */
    public float f350g;

    /* renamed from: h  reason: collision with root package name */
    public int f351h;

    /* renamed from: i  reason: collision with root package name */
    public int f352i;

    /* renamed from: j  reason: collision with root package name */
    public float f353j;

    /* renamed from: k  reason: collision with root package name */
    public Paint f354k;

    /* renamed from: l  reason: collision with root package name */
    public final e.k.a.e f355l;

    /* renamed from: m  reason: collision with root package name */
    public final e.k.a.e f356m;
    public final f n;
    public final f o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public d x;
    public List<d> y;
    public float z;

    /* loaded from: classes.dex */
    public class a implements e.i.j.h0.f {
        public a() {
        }

        @Override // e.i.j.h0.f
        public boolean a(View view, f.a aVar) {
            if (!DrawerLayout.this.n(view) || DrawerLayout.this.h(view) == 2) {
                return false;
            }
            DrawerLayout.this.b(view, true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends e.i.j.c {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f362d = new Rect();

        public b() {
        }

        @Override // e.i.j.c
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.getText();
                View f2 = DrawerLayout.this.f();
                if (f2 != null) {
                    int i2 = DrawerLayout.this.i(f2);
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    Objects.requireNonNull(drawerLayout);
                    AtomicInteger atomicInteger = z.a;
                    Gravity.getAbsoluteGravity(i2, z.e.d(drawerLayout));
                    return true;
                }
                return true;
            }
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // e.i.j.c
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            if (DrawerLayout.K) {
                this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(dVar.a);
                this.a.onInitializeAccessibilityNodeInfo(view, obtain);
                dVar.c = -1;
                dVar.a.setSource(view);
                AtomicInteger atomicInteger = z.a;
                ViewParent f2 = z.d.f(view);
                if (f2 instanceof View) {
                    dVar.p((View) f2);
                }
                Rect rect = this.f362d;
                obtain.getBoundsInScreen(rect);
                dVar.a.setBoundsInScreen(rect);
                dVar.a.setVisibleToUser(obtain.isVisibleToUser());
                dVar.a.setPackageName(obtain.getPackageName());
                dVar.a.setClassName(obtain.getClassName());
                dVar.a.setContentDescription(obtain.getContentDescription());
                dVar.a.setEnabled(obtain.isEnabled());
                dVar.a.setFocused(obtain.isFocused());
                dVar.a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                dVar.a.setSelected(obtain.isSelected());
                dVar.a.addAction(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (DrawerLayout.k(childAt)) {
                        dVar.a.addChild(childAt);
                    }
                }
            }
            dVar.a.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            dVar.a.setFocusable(false);
            dVar.a.setFocused(false);
            dVar.k(d.a.f2532e);
            dVar.k(d.a.f2533f);
        }

        @Override // e.i.j.c
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.K || DrawerLayout.k(view)) {
                return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e.i.j.c {
        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            if (DrawerLayout.k(view)) {
                return;
            }
            dVar.p(null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(View view);

        void b(View view);

        void c(int i2);

        void d(View view, float f2);
    }

    /* loaded from: classes.dex */
    public class f extends e.c {
        public final int a;
        public e.k.a.e b;
        public final Runnable c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View d2;
                int width;
                f fVar = f.this;
                int i2 = fVar.b.o;
                boolean z = fVar.a == 3;
                if (z) {
                    d2 = DrawerLayout.this.d(3);
                    width = (d2 != null ? -d2.getWidth() : 0) + i2;
                } else {
                    d2 = DrawerLayout.this.d(5);
                    width = DrawerLayout.this.getWidth() - i2;
                }
                if (d2 != null) {
                    if (((!z || d2.getLeft() >= width) && (z || d2.getLeft() <= width)) || DrawerLayout.this.h(d2) != 0) {
                        return;
                    }
                    fVar.b.x(d2, width, d2.getTop());
                    ((e) d2.getLayoutParams()).c = true;
                    DrawerLayout.this.invalidate();
                    fVar.m();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (drawerLayout.w) {
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    drawerLayout.w = true;
                }
            }
        }

        public f(int i2) {
            this.a = i2;
        }

        @Override // e.k.a.e.c
        public int a(View view, int i2, int i3) {
            if (DrawerLayout.this.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i2, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i2, width));
        }

        @Override // e.k.a.e.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // e.k.a.e.c
        public int c(View view) {
            if (DrawerLayout.this.o(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // e.k.a.e.c
        public void e(int i2, int i3) {
            View d2;
            if ((i2 & 1) == 1) {
                d2 = DrawerLayout.this.d(3);
            } else {
                d2 = DrawerLayout.this.d(5);
            }
            if (d2 == null || DrawerLayout.this.h(d2) != 0) {
                return;
            }
            this.b.b(d2, i3);
        }

        @Override // e.k.a.e.c
        public boolean f(int i2) {
            return false;
        }

        @Override // e.k.a.e.c
        public void g(int i2, int i3) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // e.k.a.e.c
        public void h(View view, int i2) {
            ((e) view.getLayoutParams()).c = false;
            m();
        }

        @Override // e.k.a.e.c
        public void i(int i2) {
            DrawerLayout.this.x(i2, this.b.t);
        }

        @Override // e.k.a.e.c
        public void j(View view, int i2, int i3, int i4, int i5) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? i2 + width : DrawerLayout.this.getWidth() - i2) / width;
            DrawerLayout.this.u(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // e.k.a.e.c
        public void k(View view, float f2, float f3) {
            int i2;
            Objects.requireNonNull(DrawerLayout.this);
            float f4 = ((e) view.getLayoutParams()).b;
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                i2 = (i3 > 0 || (i3 == 0 && f4 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && f4 > 0.5f)) {
                    width2 -= width;
                }
                i2 = width2;
            }
            this.b.v(i2, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // e.k.a.e.c
        public boolean l(View view, int i2) {
            return DrawerLayout.this.o(view) && DrawerLayout.this.a(view, this.a) && DrawerLayout.this.h(view) == 0;
        }

        public final void m() {
            View d2 = DrawerLayout.this.d(this.a == 3 ? 5 : 3);
            if (d2 != null) {
                DrawerLayout.this.b(d2, true);
            }
        }

        public void n() {
            DrawerLayout.this.removeCallbacks(this.c);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        K = true;
        L = true;
        M = i2 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.drawerLayoutStyle);
        this.f349f = new c();
        this.f352i = -1728053248;
        this.f354k = new Paint();
        this.r = true;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.v = 3;
        this.H = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f351h = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        f fVar = new f(3);
        this.n = fVar;
        f fVar2 = new f(5);
        this.o = fVar2;
        e.k.a.e j2 = e.k.a.e.j(this, 1.0f, fVar);
        this.f355l = j2;
        j2.q = 1;
        j2.n = f3;
        fVar.b = j2;
        e.k.a.e j3 = e.k.a.e.j(this, 1.0f, fVar2);
        this.f356m = j3;
        j3.q = 2;
        j3.n = f3;
        fVar2.b = j3;
        setFocusableInTouchMode(true);
        AtomicInteger atomicInteger = z.a;
        z.d.s(this, 1);
        z.w(this, new b());
        setMotionEventSplittingEnabled(false);
        if (z.d.b(this)) {
            setOnApplyWindowInsetsListener(new e.m.b.a(this));
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(I);
            try {
                this.B = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.m.a.a, R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f350g = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f350g = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.E = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String j(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    public static boolean k(View view) {
        AtomicInteger atomicInteger = z.a;
        return (z.d.c(view) == 4 || z.d.c(view) == 2) ? false : true;
    }

    public boolean a(View view, int i2) {
        return (i(view) & i2) == i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (o(childAt)) {
                if (n(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z = true;
                }
            } else {
                this.E.add(childAt);
            }
        }
        if (!z) {
            int size = this.E.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.E.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.E.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (e() == null && !o(view)) {
            AtomicInteger atomicInteger = z.a;
            z.d.s(view, 1);
        } else {
            AtomicInteger atomicInteger2 = z.a;
            z.d.s(view, 4);
        }
        if (K) {
            return;
        }
        z.w(view, this.f349f);
    }

    public void b(View view, boolean z) {
        if (o(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.r) {
                eVar.b = 0.0f;
                eVar.f364d = 0;
            } else if (z) {
                eVar.f364d |= 4;
                if (a(view, 3)) {
                    this.f355l.x(view, -view.getWidth(), view.getTop());
                } else {
                    this.f356m.x(view, getWidth(), view.getTop());
                }
            } else {
                q(view, 0.0f);
                x(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void c(boolean z) {
        boolean x;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (o(childAt) && (!z || eVar.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    x = this.f355l.x(childAt, -width, childAt.getTop());
                } else {
                    x = this.f356m.x(childAt, getWidth(), childAt.getTop());
                }
                z2 |= x;
                eVar.c = false;
            }
        }
        this.n.n();
        this.o.n();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((e) getChildAt(i2).getLayoutParams()).b);
        }
        this.f353j = f2;
        boolean i3 = this.f355l.i(true);
        boolean i4 = this.f356m.i(true);
        if (i3 || i4) {
            AtomicInteger atomicInteger = z.a;
            z.d.k(this);
        }
    }

    public View d(int i2) {
        AtomicInteger atomicInteger = z.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, z.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f353j > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i2 = childCount - 1; i2 >= 0; i2--) {
                    View childAt = getChildAt(i2);
                    if (this.F == null) {
                        this.F = new Rect();
                    }
                    childAt.getHitRect(this.F);
                    if (this.F.contains((int) x, (int) y) && !l(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.G == null) {
                                    this.G = new Matrix();
                                }
                                matrix.invert(this.G);
                                obtain.transform(this.G);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX, scrollY);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX, -scrollY);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int height = getHeight();
        boolean l2 = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (l2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && o(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.f353j;
        if (f2 > 0.0f && l2) {
            int i5 = this.f352i;
            this.f354k.setColor((((int) ((((-16777216) & i5) >>> 24) * f2)) << 24) | (i5 & 16777215));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.f354k);
        }
        return drawChild;
    }

    public View e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((e) childAt.getLayoutParams()).f364d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View f() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (o(childAt) && p(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int g(int i2) {
        AtomicInteger atomicInteger = z.a;
        int d2 = z.e.d(this);
        if (i2 == 3) {
            int i3 = this.s;
            if (i3 != 3) {
                return i3;
            }
            int i4 = d2 == 0 ? this.u : this.v;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.t;
            if (i5 != 3) {
                return i5;
            }
            int i6 = d2 == 0 ? this.v : this.u;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.u;
            if (i7 != 3) {
                return i7;
            }
            int i8 = d2 == 0 ? this.s : this.t;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.v;
            if (i9 != 3) {
                return i9;
            }
            int i10 = d2 == 0 ? this.t : this.s;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (L) {
            return this.f350g;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    public int h(View view) {
        if (o(view)) {
            return g(((e) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public int i(View view) {
        int i2 = ((e) view.getLayoutParams()).a;
        AtomicInteger atomicInteger = z.a;
        return Gravity.getAbsoluteGravity(i2, z.e.d(this));
    }

    public boolean l(View view) {
        return ((e) view.getLayoutParams()).a == 0;
    }

    public boolean m(int i2) {
        View d2 = d(i2);
        if (d2 != null) {
            return n(d2);
        }
        return false;
    }

    public boolean n(View view) {
        if (o(view)) {
            return (((e) view.getLayoutParams()).f364d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean o(View view) {
        int i2 = ((e) view.getLayoutParams()).a;
        AtomicInteger atomicInteger = z.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, z.e.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.B == null) {
            return;
        }
        Object obj = this.C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.B.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[LOOP:1: B:11:0x0024->B:21:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0052 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            e.k.a.e r1 = r8.f355l
            boolean r1 = r1.w(r9)
            e.k.a.e r2 = r8.f356m
            boolean r2 = r2.w(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L6c
            if (r0 == r2) goto L65
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L65
            goto L6a
        L1e:
            e.k.a.e r9 = r8.f355l
            float[] r0 = r9.f2598d
            int r0 = r0.length
            r4 = 0
        L24:
            if (r4 >= r0) goto L57
            boolean r5 = r9.n(r4)
            if (r5 != 0) goto L2d
            goto L4f
        L2d:
            float[] r5 = r9.f2600f
            r5 = r5[r4]
            float[] r6 = r9.f2598d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f2601g
            r6 = r6[r4]
            float[] r7 = r9.f2599e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 == 0) goto L54
            r9 = 1
            goto L58
        L54:
            int r4 = r4 + 1
            goto L24
        L57:
            r9 = 0
        L58:
            if (r9 == 0) goto L6a
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.n
            r9.n()
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.o
            r9.n()
            goto L6a
        L65:
            r8.c(r2)
            r8.w = r3
        L6a:
            r9 = 0
            goto L94
        L6c:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.z = r0
            r8.A = r9
            float r4 = r8.f353j
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L91
            e.k.a.e r4 = r8.f355l
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.l(r0, r9)
            if (r9 == 0) goto L91
            boolean r9 = r8.l(r9)
            if (r9 == 0) goto L91
            r9 = 1
            goto L92
        L91:
            r9 = 0
        L92:
            r8.w = r3
        L94:
            if (r1 != 0) goto Lbb
            if (r9 != 0) goto Lbb
            int r9 = r8.getChildCount()
            r0 = 0
        L9d:
            if (r0 >= r9) goto Lb2
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.e) r1
            boolean r1 = r1.c
            if (r1 == 0) goto Laf
            r9 = 1
            goto Lb3
        Laf:
            int r0 = r0 + 1
            goto L9d
        Lb2:
            r9 = 0
        Lb3:
            if (r9 != 0) goto Lbb
            boolean r9 = r8.w
            if (r9 == 0) goto Lba
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            View f2 = f();
            if (f2 != null && h(f2) == 0) {
                c(false);
            }
            return f2 != null;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        int i6;
        float f2;
        int i7;
        this.q = true;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i7 = (-measuredWidth) + ((int) (eVar.b * f3));
                        f2 = (measuredWidth + i7) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i8 - i6) / f4;
                        i7 = i8 - ((int) (eVar.b * f4));
                    }
                    boolean z2 = f2 != eVar.b;
                    int i11 = eVar.a & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = i12 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i15 > i16) {
                                i13 = i16 - measuredHeight;
                            }
                        }
                        childAt.layout(i7, i13, measuredWidth + i7, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i7, i17, measuredWidth + i7, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i7, (i18 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i18 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z2) {
                        u(childAt, f2);
                    }
                    int i19 = eVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        if (M && (rootWindowInsets = getRootWindowInsets()) != null) {
            e.i.d.b i20 = f0.k(rootWindowInsets, null).a.i();
            e.k.a.e eVar2 = this.f355l;
            eVar2.o = Math.max(eVar2.p, i20.a);
            e.k.a.e eVar3 = this.f356m;
            eVar3.o = Math.max(eVar3.p, i20.c);
        }
        this.q = false;
        this.r = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View d2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        int i2 = savedState.f357h;
        if (i2 != 0 && (d2 = d(i2)) != null) {
            s(d2, true);
        }
        int i3 = savedState.f358i;
        if (i3 != 3) {
            t(i3, 3);
        }
        int i4 = savedState.f359j;
        if (i4 != 3) {
            t(i4, 5);
        }
        int i5 = savedState.f360k;
        if (i5 != 3) {
            t(i5, 8388611);
        }
        int i6 = savedState.f361l;
        if (i6 != 3) {
            t(i6, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (L) {
            return;
        }
        AtomicInteger atomicInteger = z.a;
        z.e.d(this);
        z.e.d(this);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            e eVar = (e) getChildAt(i2).getLayoutParams();
            int i3 = eVar.f364d;
            boolean z = i3 == 1;
            boolean z2 = i3 == 2;
            if (z || z2) {
                savedState.f357h = eVar.a;
                break;
            }
        }
        savedState.f358i = this.s;
        savedState.f359j = this.t;
        savedState.f360k = this.u;
        savedState.f361l = this.v;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (h(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            e.k.a.e r0 = r6.f355l
            r0.p(r7)
            e.k.a.e r0 = r6.f356m
            r0.p(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6e
        L1a:
            r6.c(r2)
            r6.w = r1
            goto L6e
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            e.k.a.e r3 = r6.f355l
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.l(r4, r5)
            if (r3 == 0) goto L5b
            boolean r3 = r6.l(r3)
            if (r3 == 0) goto L5b
            float r3 = r6.z
            float r0 = r0 - r3
            float r3 = r6.A
            float r7 = r7 - r3
            e.k.a.e r3 = r6.f355l
            int r3 = r3.b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L5b
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L5b
            int r7 = r6.h(r7)
            r0 = 2
            if (r7 != r0) goto L5c
        L5b:
            r1 = 1
        L5c:
            r6.c(r1)
            goto L6e
        L60:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.z = r0
            r6.A = r7
            r6.w = r1
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(View view) {
        if (o(view)) {
            return ((e) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void q(View view, float f2) {
        float f3 = ((e) view.getLayoutParams()).b;
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        u(view, f2);
    }

    public void r(int i2) {
        View d2 = d(i2);
        if (d2 != null) {
            s(d2, true);
            return;
        }
        StringBuilder A = f.a.b.a.a.A("No drawer view found with gravity ");
        A.append(j(i2));
        throw new IllegalArgumentException(A.toString());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.q) {
            return;
        }
        super.requestLayout();
    }

    public void s(View view, boolean z) {
        if (o(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.r) {
                eVar.b = 1.0f;
                eVar.f364d = 1;
                w(view, true);
                v(view);
            } else if (z) {
                eVar.f364d |= 2;
                if (a(view, 3)) {
                    this.f355l.x(view, 0, view.getTop());
                } else {
                    this.f356m.x(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                q(view, 1.0f);
                x(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void setDrawerElevation(float f2) {
        this.f350g = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (o(childAt)) {
                float f3 = this.f350g;
                AtomicInteger atomicInteger = z.a;
                z.i.s(childAt, f3);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        List<d> list;
        d dVar2 = this.x;
        if (dVar2 != null && (list = this.y) != null) {
            list.remove(dVar2);
        }
        if (dVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(dVar);
        }
        this.x = dVar;
    }

    public void setDrawerLockMode(int i2) {
        t(i2, 3);
        t(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.f352i = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.B = new ColorDrawable(i2);
        invalidate();
    }

    public void t(int i2, int i3) {
        View d2;
        AtomicInteger atomicInteger = z.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, z.e.d(this));
        if (i3 == 3) {
            this.s = i2;
        } else if (i3 == 5) {
            this.t = i2;
        } else if (i3 == 8388611) {
            this.u = i2;
        } else if (i3 == 8388613) {
            this.v = i2;
        }
        if (i2 != 0) {
            (absoluteGravity == 3 ? this.f355l : this.f356m).a();
        }
        if (i2 != 1) {
            if (i2 == 2 && (d2 = d(absoluteGravity)) != null) {
                s(d2, true);
                return;
            }
            return;
        }
        View d3 = d(absoluteGravity);
        if (d3 != null) {
            b(d3, true);
        }
    }

    public void u(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.b) {
            return;
        }
        eVar.b = f2;
        List<d> list = this.y;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.y.get(size).d(view, f2);
        }
    }

    public final void v(View view) {
        d.a aVar = d.a.f2539l;
        z.t(aVar.a(), view);
        z.n(view, 0);
        if (!n(view) || h(view) == 2) {
            return;
        }
        z.u(view, aVar, null, this.H);
    }

    public final void w(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !o(childAt)) || (z && childAt == view)) {
                AtomicInteger atomicInteger = z.a;
                z.d.s(childAt, 1);
            } else {
                AtomicInteger atomicInteger2 = z.a;
                z.d.s(childAt, 4);
            }
        }
    }

    public void x(int i2, View view) {
        View rootView;
        int i3 = this.f355l.a;
        int i4 = this.f356m.a;
        int i5 = 2;
        if (i3 == 1 || i4 == 1) {
            i5 = 1;
        } else if (i3 != 2 && i4 != 2) {
            i5 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((e) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.f364d & 1) == 1) {
                    eVar.f364d = 0;
                    List<d> list = this.y;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            this.y.get(size).b(view);
                        }
                    }
                    w(view, false);
                    v(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.f364d & 1) == 0) {
                    eVar2.f364d = 1;
                    List<d> list2 = this.y;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            this.y.get(size2).a(view);
                        }
                    }
                    w(view, true);
                    v(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i5 != this.p) {
            this.p = i5;
            List<d> list3 = this.y;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    this.y.get(size3).c(i5);
                }
            }
        }
    }

    public void setStatusBarBackground(int i2) {
        this.B = i2 != 0 ? e.i.c.a.getDrawable(getContext(), i2) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f364d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.J);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.a = 0;
            this.a = eVar.a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f357h;

        /* renamed from: i  reason: collision with root package name */
        public int f358i;

        /* renamed from: j  reason: collision with root package name */
        public int f359j;

        /* renamed from: k  reason: collision with root package name */
        public int f360k;

        /* renamed from: l  reason: collision with root package name */
        public int f361l;

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
            this.f357h = 0;
            this.f357h = parcel.readInt();
            this.f358i = parcel.readInt();
            this.f359j = parcel.readInt();
            this.f360k = parcel.readInt();
            this.f361l = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeInt(this.f357h);
            parcel.writeInt(this.f358i);
            parcel.writeInt(this.f359j);
            parcel.writeInt(this.f360k);
            parcel.writeInt(this.f361l);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f357h = 0;
        }
    }
}

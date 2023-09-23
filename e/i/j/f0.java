package e.i.j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import e.i.j.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class f0 {
    public static final f0 b;
    public final k a;

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f2513d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                f2513d = true;
            } catch (ReflectiveOperationException e2) {
                StringBuilder A = f.a.b.a.a.A("Failed to get visible insets from AttachInfo ");
                A.append(e2.getMessage());
                Log.w("WindowInsetsCompat", A.toString(), e2);
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(f0 f0Var) {
            super(f0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f2518h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f2519i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f2520j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f2521k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f2522l;
        public final WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        public e.i.d.b[] f2523d;

        /* renamed from: e  reason: collision with root package name */
        public e.i.d.b f2524e;

        /* renamed from: f  reason: collision with root package name */
        public f0 f2525f;

        /* renamed from: g  reason: collision with root package name */
        public e.i.d.b f2526g;

        public f(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var);
            this.f2524e = null;
            this.c = windowInsets;
        }

        @Override // e.i.j.f0.k
        public void d(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2518h) {
                    try {
                        f2519i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                        Class<?> cls = Class.forName("android.view.View$AttachInfo");
                        f2520j = cls;
                        f2521k = cls.getDeclaredField("mVisibleInsets");
                        f2522l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                        f2521k.setAccessible(true);
                        f2522l.setAccessible(true);
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder A = f.a.b.a.a.A("Failed to get visible insets. (Reflection error). ");
                        A.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", A.toString(), e2);
                    }
                    f2518h = true;
                }
                Method method = f2519i;
                e.i.d.b bVar = null;
                if (method != null && f2520j != null && f2521k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        } else {
                            Rect rect = (Rect) f2521k.get(f2522l.get(invoke));
                            if (rect != null) {
                                bVar = e.i.d.b.b(rect.left, rect.top, rect.right, rect.bottom);
                            }
                        }
                    } catch (ReflectiveOperationException e3) {
                        StringBuilder A2 = f.a.b.a.a.A("Failed to get visible insets. (Reflection error). ");
                        A2.append(e3.getMessage());
                        Log.e("WindowInsetsCompat", A2.toString(), e3);
                    }
                }
                if (bVar == null) {
                    bVar = e.i.d.b.f2450e;
                }
                this.f2526g = bVar;
                return;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // e.i.j.f0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2526g, ((f) obj).f2526g);
            }
            return false;
        }

        @Override // e.i.j.f0.k
        public e.i.d.b f(int i2) {
            e.i.d.b b;
            e.i.d.b h2;
            int i3;
            e.i.j.f e2;
            e.i.d.b bVar = e.i.d.b.f2450e;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        b = e.i.d.b.b(0, j().b, 0, 0);
                    } else if (i4 == 2) {
                        e.i.d.b j2 = j();
                        f0 f0Var = this.f2525f;
                        h2 = f0Var != null ? f0Var.a.h() : null;
                        int i5 = j2.f2451d;
                        if (h2 != null) {
                            i5 = Math.min(i5, h2.f2451d);
                        }
                        b = e.i.d.b.b(j2.a, 0, j2.c, i5);
                    } else if (i4 == 8) {
                        e.i.d.b[] bVarArr = this.f2523d;
                        h2 = bVarArr != null ? bVarArr[e.i.a.H(8)] : null;
                        if (h2 != null) {
                            b = h2;
                        } else {
                            e.i.d.b j3 = j();
                            e.i.d.b r = r();
                            int i6 = j3.f2451d;
                            if (i6 > r.f2451d) {
                                b = e.i.d.b.b(0, 0, 0, i6);
                            } else {
                                e.i.d.b bVar2 = this.f2526g;
                                if (bVar2 != null && !bVar2.equals(e.i.d.b.f2450e) && (i3 = this.f2526g.f2451d) > r.f2451d) {
                                    b = e.i.d.b.b(0, 0, 0, i3);
                                } else {
                                    b = e.i.d.b.f2450e;
                                }
                            }
                        }
                    } else if (i4 == 16) {
                        b = i();
                    } else if (i4 == 32) {
                        b = g();
                    } else if (i4 == 64) {
                        b = k();
                    } else if (i4 != 128) {
                        b = e.i.d.b.f2450e;
                    } else {
                        f0 f0Var2 = this.f2525f;
                        if (f0Var2 != null) {
                            e2 = f0Var2.a.e();
                        } else {
                            e2 = e();
                        }
                        if (e2 != null) {
                            int i7 = Build.VERSION.SDK_INT;
                            b = e.i.d.b.b(i7 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetLeft() : 0, i7 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetTop() : 0, i7 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetRight() : 0, i7 >= 28 ? ((DisplayCutout) e2.a).getSafeInsetBottom() : 0);
                        } else {
                            b = e.i.d.b.f2450e;
                        }
                    }
                    bVar = e.i.d.b.a(bVar, b);
                }
            }
            return bVar;
        }

        @Override // e.i.j.f0.k
        public final e.i.d.b j() {
            if (this.f2524e == null) {
                this.f2524e = e.i.d.b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.f2524e;
        }

        @Override // e.i.j.f0.k
        public f0 l(int i2, int i3, int i4, int i5) {
            e bVar;
            f0 j2 = f0.j(this.c);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                bVar = new d(j2);
            } else if (i6 >= 29) {
                bVar = new c(j2);
            } else {
                bVar = new b(j2);
            }
            bVar.c(f0.g(j(), i2, i3, i4, i5));
            bVar.b(f0.g(h(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // e.i.j.f0.k
        public boolean n() {
            return this.c.isRound();
        }

        @Override // e.i.j.f0.k
        public void o(e.i.d.b[] bVarArr) {
            this.f2523d = bVarArr;
        }

        @Override // e.i.j.f0.k
        public void p(f0 f0Var) {
            this.f2525f = f0Var;
        }

        public final e.i.d.b r() {
            f0 f0Var = this.f2525f;
            if (f0Var != null) {
                return f0Var.a.h();
            }
            return e.i.d.b.f2450e;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public e.i.d.b f2527m;

        public g(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
            this.f2527m = null;
        }

        @Override // e.i.j.f0.k
        public f0 b() {
            return f0.j(this.c.consumeStableInsets());
        }

        @Override // e.i.j.f0.k
        public f0 c() {
            return f0.j(this.c.consumeSystemWindowInsets());
        }

        @Override // e.i.j.f0.k
        public final e.i.d.b h() {
            if (this.f2527m == null) {
                this.f2527m = e.i.d.b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.f2527m;
        }

        @Override // e.i.j.f0.k
        public boolean m() {
            return this.c.isConsumed();
        }

        @Override // e.i.j.f0.k
        public void q(e.i.d.b bVar) {
            this.f2527m = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        @Override // e.i.j.f0.k
        public f0 a() {
            return f0.j(this.c.consumeDisplayCutout());
        }

        @Override // e.i.j.f0.k
        public e.i.j.f e() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new e.i.j.f(displayCutout);
        }

        @Override // e.i.j.f0.f, e.i.j.f0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.c, hVar.c) && Objects.equals(this.f2526g, hVar.f2526g);
            }
            return false;
        }

        @Override // e.i.j.f0.k
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class i extends h {
        public e.i.d.b n;
        public e.i.d.b o;
        public e.i.d.b p;

        public i(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // e.i.j.f0.k
        public e.i.d.b g() {
            if (this.o == null) {
                this.o = e.i.d.b.c(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // e.i.j.f0.k
        public e.i.d.b i() {
            if (this.n == null) {
                this.n = e.i.d.b.c(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // e.i.j.f0.k
        public e.i.d.b k() {
            if (this.p == null) {
                this.p = e.i.d.b.c(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // e.i.j.f0.f, e.i.j.f0.k
        public f0 l(int i2, int i3, int i4, int i5) {
            return f0.j(this.c.inset(i2, i3, i4, i5));
        }

        @Override // e.i.j.f0.g, e.i.j.f0.k
        public void q(e.i.d.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class j extends i {
        public static final f0 q = f0.j(WindowInsets.CONSUMED);

        public j(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        @Override // e.i.j.f0.f, e.i.j.f0.k
        public final void d(View view) {
        }

        @Override // e.i.j.f0.f, e.i.j.f0.k
        public e.i.d.b f(int i2) {
            int statusBars;
            WindowInsets windowInsets = this.c;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= statusBars;
                }
            }
            return e.i.d.b.c(windowInsets.getInsets(i3));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static final f0 b;
        public final f0 a;

        static {
            e bVar;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                bVar = new d();
            } else if (i2 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            b = bVar.a().a.a().a.b().a();
        }

        public k(f0 f0Var) {
            this.a = f0Var;
        }

        public f0 a() {
            return this.a;
        }

        public f0 b() {
            return this.a;
        }

        public f0 c() {
            return this.a;
        }

        public void d(View view) {
        }

        public e.i.j.f e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return n() == kVar.n() && m() == kVar.m() && Objects.equals(j(), kVar.j()) && Objects.equals(h(), kVar.h()) && Objects.equals(e(), kVar.e());
            }
            return false;
        }

        public e.i.d.b f(int i2) {
            return e.i.d.b.f2450e;
        }

        public e.i.d.b g() {
            return j();
        }

        public e.i.d.b h() {
            return e.i.d.b.f2450e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public e.i.d.b i() {
            return j();
        }

        public e.i.d.b j() {
            return e.i.d.b.f2450e;
        }

        public e.i.d.b k() {
            return j();
        }

        public f0 l(int i2, int i3, int i4, int i5) {
            return b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(e.i.d.b[] bVarArr) {
        }

        public void p(f0 f0Var) {
        }

        public void q(e.i.d.b bVar) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = j.q;
        } else {
            b = k.b;
        }
    }

    public f0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new i(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new h(this, windowInsets);
        } else {
            this.a = new g(this, windowInsets);
        }
    }

    public static e.i.d.b g(e.i.d.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.a - i2);
        int max2 = Math.max(0, bVar.b - i3);
        int max3 = Math.max(0, bVar.c - i4);
        int max4 = Math.max(0, bVar.f2451d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : e.i.d.b.b(max, max2, max3, max4);
    }

    public static f0 j(WindowInsets windowInsets) {
        return k(windowInsets, null);
    }

    public static f0 k(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        f0 f0Var = new f0(windowInsets);
        if (view != null) {
            AtomicInteger atomicInteger = z.a;
            if (z.g.b(view)) {
                f0Var.a.p(z.m(view));
                f0Var.a.d(view.getRootView());
            }
        }
        return f0Var;
    }

    @Deprecated
    public f0 a() {
        return this.a.c();
    }

    public e.i.d.b b(int i2) {
        return this.a.f(i2);
    }

    @Deprecated
    public int c() {
        return this.a.j().f2451d;
    }

    @Deprecated
    public int d() {
        return this.a.j().a;
    }

    @Deprecated
    public int e() {
        return this.a.j().c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return Objects.equals(this.a, ((f0) obj).a);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.a.j().b;
    }

    public boolean h() {
        return this.a.m();
    }

    public int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public WindowInsets i() {
        k kVar = this.a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {
        public final WindowInsets.Builder b;

        public c() {
            this.b = new WindowInsets.Builder();
        }

        @Override // e.i.j.f0.e
        public f0 a() {
            f0 j2 = f0.j(this.b.build());
            j2.a.o(null);
            return j2;
        }

        @Override // e.i.j.f0.e
        public void b(e.i.d.b bVar) {
            this.b.setStableInsets(bVar.d());
        }

        @Override // e.i.j.f0.e
        public void c(e.i.d.b bVar) {
            this.b.setSystemWindowInsets(bVar.d());
        }

        public c(f0 f0Var) {
            super(f0Var);
            WindowInsets.Builder builder;
            WindowInsets i2 = f0Var.i();
            if (i2 != null) {
                builder = new WindowInsets.Builder(i2);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public final f0 a;

        public e() {
            this.a = new f0((f0) null);
        }

        public f0 a() {
            throw null;
        }

        public void b(e.i.d.b bVar) {
            throw null;
        }

        public void c(e.i.d.b bVar) {
            throw null;
        }

        public e(f0 f0Var) {
            this.a = f0Var;
        }
    }

    public f0(f0 f0Var) {
        this.a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        public static Field f2514d = null;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f2515e = false;

        /* renamed from: f  reason: collision with root package name */
        public static Constructor<WindowInsets> f2516f = null;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f2517g = false;
        public WindowInsets b;
        public e.i.d.b c;

        public b() {
            WindowInsets windowInsets;
            if (!f2515e) {
                try {
                    f2514d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2515e = true;
            }
            Field field = f2514d;
            WindowInsets windowInsets2 = null;
            if (field != null) {
                try {
                    windowInsets = (WindowInsets) field.get(null);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
                if (windowInsets != null) {
                    windowInsets2 = new WindowInsets(windowInsets);
                    this.b = windowInsets2;
                }
            }
            if (!f2517g) {
                try {
                    f2516f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f2517g = true;
            }
            Constructor<WindowInsets> constructor = f2516f;
            if (constructor != null) {
                try {
                    windowInsets2 = constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            this.b = windowInsets2;
        }

        @Override // e.i.j.f0.e
        public f0 a() {
            f0 j2 = f0.j(this.b);
            j2.a.o(null);
            j2.a.q(this.c);
            return j2;
        }

        @Override // e.i.j.f0.e
        public void b(e.i.d.b bVar) {
            this.c = bVar;
        }

        @Override // e.i.j.f0.e
        public void c(e.i.d.b bVar) {
            WindowInsets windowInsets = this.b;
            if (windowInsets != null) {
                this.b = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.f2451d);
            }
        }

        public b(f0 f0Var) {
            super(f0Var);
            this.b = f0Var.i();
        }
    }
}

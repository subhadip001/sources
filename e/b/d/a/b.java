package e.b.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import e.b.d.a.e;
import java.util.Objects;

/* compiled from: DrawableContainer.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int r = 0;

    /* renamed from: f  reason: collision with root package name */
    public c f1545f;

    /* renamed from: g  reason: collision with root package name */
    public Rect f1546g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1547h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f1548i;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1550k;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1552m;
    public Runnable n;
    public long o;
    public long p;
    public C0025b q;

    /* renamed from: j  reason: collision with root package name */
    public int f1549j = 255;

    /* renamed from: l  reason: collision with root package name */
    public int f1551l = -1;

    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainer.java */
    /* renamed from: e.b.d.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025b implements Drawable.Callback {

        /* renamed from: f  reason: collision with root package name */
        public Drawable.Callback f1554f;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f1554f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f1554f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b a;
        public Resources b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1555d;

        /* renamed from: e  reason: collision with root package name */
        public int f1556e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f1557f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f1558g;

        /* renamed from: h  reason: collision with root package name */
        public int f1559h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1560i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1561j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f1562k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1563l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1564m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            this.f1560i = false;
            this.f1563l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.b : null;
            }
            this.b = resources2;
            int i2 = cVar != null ? cVar.c : 0;
            int i3 = b.r;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? 160 : i2;
            this.c = i2;
            if (cVar != null) {
                this.f1555d = cVar.f1555d;
                this.f1556e = cVar.f1556e;
                this.v = true;
                this.w = true;
                this.f1560i = cVar.f1560i;
                this.f1563l = cVar.f1563l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.c == i2) {
                    if (cVar.f1561j) {
                        this.f1562k = cVar.f1562k != null ? new Rect(cVar.f1562k) : null;
                        this.f1561j = true;
                    }
                    if (cVar.f1564m) {
                        this.n = cVar.n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.f1564m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.f1558g;
                this.f1558g = new Drawable[drawableArr.length];
                this.f1559h = cVar.f1559h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f1557f;
                if (sparseArray != null) {
                    this.f1557f = sparseArray.clone();
                } else {
                    this.f1557f = new SparseArray<>(this.f1559h);
                }
                int i4 = this.f1559h;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5] != null) {
                        Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                        if (constantState != null) {
                            this.f1557f.put(i5, constantState);
                        } else {
                            this.f1558g[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.f1558g = new Drawable[10];
            this.f1559h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f1559h;
            if (i2 >= this.f1558g.length) {
                int i3 = i2 + 10;
                e.a aVar = (e.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                Drawable[] drawableArr2 = aVar.f1558g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
                }
                aVar.f1558g = drawableArr;
                int[][] iArr = new int[i3];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f1558g[i2] = drawable;
            this.f1559h++;
            this.f1556e = drawable.getChangingConfigurations() | this.f1556e;
            this.r = false;
            this.t = false;
            this.f1562k = null;
            this.f1561j = false;
            this.f1564m = false;
            this.v = false;
            return i2;
        }

        public void b() {
            this.f1564m = true;
            c();
            int i2 = this.f1559h;
            Drawable[] drawableArr = this.f1558g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1557f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f1557f.keyAt(i2);
                    Drawable[] drawableArr = this.f1558g;
                    Drawable newDrawable = this.f1557f.valueAt(i2).newDrawable(this.b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        e.i.a.X(newDrawable, this.z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.a);
                    drawableArr[keyAt] = mutate;
                }
                this.f1557f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f1559h;
            Drawable[] drawableArr = this.f1558g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    if (drawable.canApplyTheme()) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f1557f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Drawable d(int i2) {
            int indexOfKey;
            Drawable drawable = this.f1558g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1557f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f1557f.valueAt(indexOfKey).newDrawable(this.b);
            if (Build.VERSION.SDK_INT >= 23) {
                e.i.a.X(newDrawable, this.z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.a);
            this.f1558g[i2] = mutate;
            this.f1557f.removeAt(indexOfKey);
            if (this.f1557f.size() == 0) {
                this.f1557f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int i2 = b.r;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = this.c;
                this.c = i3;
                if (i4 != i3) {
                    this.f1564m = false;
                    this.f1561j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1555d | this.f1556e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f1550k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f1547h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f1549j
            r3.setAlpha(r9)
            r13.o = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.b.d.a.b$c r9 = r13.f1545f
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f1549j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.o = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f1548i
            if (r9 == 0) goto L65
            long r10 = r13.p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f1548i = r0
            r13.p = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.b.d.a.b$c r4 = r13.f1545f
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f1549j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.p = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.a.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f1545f;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i2 = cVar.f1559h;
            Drawable[] drawableArr = cVar.f1558g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                    drawableArr[i3].applyTheme(theme);
                    cVar.f1556e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.q == null) {
            this.q = new C0025b();
        }
        C0025b c0025b = this.q;
        c0025b.f1554f = drawable.getCallback();
        drawable.setCallback(c0025b);
        try {
            if (this.f1545f.A <= 0 && this.f1550k) {
                drawable.setAlpha(this.f1549j);
            }
            c cVar = this.f1545f;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    drawable.setTintList(cVar.F);
                }
                c cVar2 = this.f1545f;
                if (cVar2.I) {
                    drawable.setTintMode(cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1545f.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                e.i.a.X(drawable, e.i.a.A(this));
            }
            drawable.setAutoMirrored(this.f1545f.C);
            Rect rect = this.f1546g;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0025b c0025b2 = this.q;
            Drawable.Callback callback = c0025b2.f1554f;
            c0025b2.f1554f = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f1545f.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1551l
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.b.d.a.b$c r0 = r9.f1545f
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f1548i
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f1547h
            if (r0 == 0) goto L29
            r9.f1548i = r0
            e.b.d.a.b$c r0 = r9.f1545f
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.p = r0
            goto L35
        L29:
            r9.f1548i = r4
            r9.p = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f1547h
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            e.b.d.a.b$c r0 = r9.f1545f
            int r1 = r0.f1559h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f1547h = r0
            r9.f1551l = r10
            if (r0 == 0) goto L5a
            e.b.d.a.b$c r10 = r9.f1545f
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.o = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f1547h = r4
            r10 = -1
            r9.f1551l = r10
        L5a:
            long r0 = r9.o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.n
            if (r0 != 0) goto L73
            e.b.d.a.b$a r0 = new e.b.d.a.b$a
            r0.<init>()
            r9.n = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.a.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1548i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1549j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1545f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f1545f;
        boolean z = false;
        if (cVar.v) {
            z = cVar.w;
        } else {
            cVar.c();
            cVar.v = true;
            int i2 = cVar.f1559h;
            Drawable[] drawableArr = cVar.f1558g;
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    if (drawableArr[i3].getConstantState() == null) {
                        cVar.w = false;
                        break;
                    }
                    i3++;
                } else {
                    cVar.w = true;
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f1545f.f1555d = getChangingConfigurations();
            return this.f1545f;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1547h;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1546g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f1545f;
        if (cVar.f1563l) {
            if (!cVar.f1564m) {
                cVar.b();
            }
            return cVar.o;
        }
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f1545f;
        if (cVar.f1563l) {
            if (!cVar.f1564m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f1545f;
        if (cVar.f1563l) {
            if (!cVar.f1564m) {
                cVar.b();
            }
            return cVar.q;
        }
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f1545f;
        if (cVar.f1563l) {
            if (!cVar.f1564m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1547h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f1545f;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i2 = cVar.f1559h;
        Drawable[] drawableArr = cVar.f1558g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        cVar.s = opacity;
        cVar.r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f1545f;
        Rect rect2 = null;
        boolean z = true;
        if (!cVar.f1560i) {
            Rect rect3 = cVar.f1562k;
            if (rect3 != null || cVar.f1561j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i2 = cVar.f1559h;
                Drawable[] drawableArr = cVar.f1558g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.f1561j = true;
                cVar.f1562k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f1547h;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if ((this.f1545f.C && e.i.a.A(this) == 1) ? false : false) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f1545f;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable != this.f1547h || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1545f.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1548i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1548i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1547h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1550k) {
                this.f1547h.setAlpha(this.f1549j);
            }
        }
        if (this.p != 0) {
            this.p = 0L;
            z = true;
        }
        if (this.o != 0) {
            this.o = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1552m && super.mutate() == this) {
            c b = b();
            b.e();
            e(b);
            this.f1552m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1548i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1547h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        c cVar = this.f1545f;
        int i3 = this.f1551l;
        int i4 = cVar.f1559h;
        Drawable[] drawableArr = cVar.f1558g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean X = Build.VERSION.SDK_INT >= 23 ? e.i.a.X(drawableArr[i5], i2) : false;
                if (i5 == i3) {
                    z = X;
                }
            }
        }
        cVar.z = i2;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f1548i;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1547h;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1548i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1547h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f1547h || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f1550k && this.f1549j == i2) {
            return;
        }
        this.f1550k = true;
        this.f1549j = i2;
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            if (this.o == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f1545f;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f1547h;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f1545f;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f1547h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f1545f;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f1547h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1546g;
        if (rect == null) {
            this.f1546g = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1547h;
        if (drawable != null) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f1545f;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            e.i.a.d0(this.f1547h, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f1545f;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            e.i.a.e0(this.f1547h, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1548i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1547h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f1547h || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}

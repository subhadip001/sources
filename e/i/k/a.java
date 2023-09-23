package e.i.k;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int v = ViewConfiguration.getTapTimeout();

    /* renamed from: f  reason: collision with root package name */
    public final C0046a f2556f;

    /* renamed from: g  reason: collision with root package name */
    public final Interpolator f2557g;

    /* renamed from: h  reason: collision with root package name */
    public final View f2558h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f2559i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f2560j;

    /* renamed from: k  reason: collision with root package name */
    public float[] f2561k;

    /* renamed from: l  reason: collision with root package name */
    public int f2562l;

    /* renamed from: m  reason: collision with root package name */
    public int f2563m;
    public float[] n;
    public float[] o;
    public float[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: e.i.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0046a {
        public int a;
        public int b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f2564d;

        /* renamed from: j  reason: collision with root package name */
        public float f2570j;

        /* renamed from: k  reason: collision with root package name */
        public int f2571k;

        /* renamed from: e  reason: collision with root package name */
        public long f2565e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public long f2569i = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f2566f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f2567g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2568h = 0;

        public final float a(long j2) {
            long j3 = this.f2565e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f2569i;
            if (j4 >= 0 && j2 >= j4) {
                float f2 = this.f2570j;
                return (a.b(((float) (j2 - j4)) / this.f2571k, 0.0f, 1.0f) * f2) + (1.0f - f2);
            }
            return a.b(((float) (j2 - j3)) / this.a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.t) {
                if (aVar.r) {
                    aVar.r = false;
                    C0046a c0046a = aVar.f2556f;
                    Objects.requireNonNull(c0046a);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0046a.f2565e = currentAnimationTimeMillis;
                    c0046a.f2569i = -1L;
                    c0046a.f2566f = currentAnimationTimeMillis;
                    c0046a.f2570j = 0.5f;
                    c0046a.f2567g = 0;
                    c0046a.f2568h = 0;
                }
                C0046a c0046a2 = a.this.f2556f;
                if (!(c0046a2.f2569i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0046a2.f2569i + ((long) c0046a2.f2571k)) && a.this.e()) {
                    a aVar2 = a.this;
                    if (aVar2.s) {
                        aVar2.s = false;
                        Objects.requireNonNull(aVar2);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar2.f2558h.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0046a2.f2566f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a = c0046a2.a(currentAnimationTimeMillis2);
                        c0046a2.f2566f = currentAnimationTimeMillis2;
                        float f2 = ((float) (currentAnimationTimeMillis2 - c0046a2.f2566f)) * ((a * 4.0f) + ((-4.0f) * a * a));
                        c0046a2.f2567g = (int) (c0046a2.c * f2);
                        int i2 = (int) (f2 * c0046a2.f2564d);
                        c0046a2.f2568h = i2;
                        ((d) a.this).w.scrollListBy(i2);
                        View view = a.this.f2558h;
                        AtomicInteger atomicInteger = z.a;
                        z.d.m(view, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                a.this.t = false;
            }
        }
    }

    public a(View view) {
        C0046a c0046a = new C0046a();
        this.f2556f = c0046a;
        this.f2557g = new AccelerateInterpolator();
        this.f2560j = new float[]{0.0f, 0.0f};
        this.f2561k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = new float[]{0.0f, 0.0f};
        this.o = new float[]{0.0f, 0.0f};
        this.p = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2558h = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.p;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.o;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f2562l = 1;
        float[] fArr3 = this.f2561k;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2560j;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.n;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2563m = v;
        c0046a.a = 500;
        c0046a.b = 500;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2560j
            r0 = r0[r4]
            float[] r1 = r3.f2561k
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f2557g
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f2557g
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r0 = r3.n
            r0 = r0[r4]
            float[] r1 = r3.o
            r1 = r1[r4]
            float[] r2 = r3.p
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L56
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L56:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.k.a.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2562l;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.t && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.r) {
            this.t = false;
            return;
        }
        C0046a c0046a = this.f2556f;
        Objects.requireNonNull(c0046a);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - c0046a.f2565e);
        int i4 = c0046a.b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0046a.f2571k = i2;
        c0046a.f2570j = c0046a.a(currentAnimationTimeMillis);
        c0046a.f2569i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r9 = this;
            e.i.k.a$a r0 = r9.f2556f
            float r1 = r0.f2564d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            e.i.k.d r4 = (e.i.k.d) r4
            android.widget.ListView r4 = r4.w
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = 0
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.k.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.d()
            goto L7f
        L1a:
            r5.s = r2
            r5.q = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2558h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2558h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            e.i.k.a$a r7 = r5.f2556f
            r7.c = r0
            r7.f2564d = r6
            boolean r6 = r5.t
            if (r6 != 0) goto L7f
            boolean r6 = r5.e()
            if (r6 == 0) goto L7f
            java.lang.Runnable r6 = r5.f2559i
            if (r6 != 0) goto L61
            e.i.k.a$b r6 = new e.i.k.a$b
            r6.<init>()
            r5.f2559i = r6
        L61:
            r5.t = r2
            r5.r = r2
            boolean r6 = r5.q
            if (r6 != 0) goto L78
            int r6 = r5.f2563m
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f2558h
            java.lang.Runnable r0 = r5.f2559i
            long r3 = (long) r6
            java.util.concurrent.atomic.AtomicInteger r6 = e.i.j.z.a
            e.i.j.z.d.n(r7, r0, r3)
            goto L7d
        L78:
            java.lang.Runnable r6 = r5.f2559i
            r6.run()
        L7d:
            r5.q = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.k.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

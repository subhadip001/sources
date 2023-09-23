package e.k.a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.logging.type.LogSeverity;
import e.i.j.z;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class e {
    public static final Interpolator x = new a();
    public int a;
    public int b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f2598d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2599e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2600f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2601g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f2602h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2603i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2604j;

    /* renamed from: k  reason: collision with root package name */
    public int f2605k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f2606l;

    /* renamed from: m  reason: collision with root package name */
    public float f2607m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final Runnable w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.u(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(int i2, int i3) {
        }

        public boolean f(int i2) {
            return false;
        }

        public void g(int i2, int i3) {
        }

        public void h(View view, int i2) {
        }

        public abstract void i(int i2);

        public abstract void j(View view, int i2, int i3, int i4, int i5);

        public abstract void k(View view, float f2, float f3);

        public abstract boolean l(View view, int i2);
    }

    public e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.p = i2;
            this.o = i2;
            this.b = viewConfiguration.getScaledTouchSlop();
            this.f2607m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public static e j(ViewGroup viewGroup, float f2, c cVar) {
        e eVar = new e(viewGroup.getContext(), viewGroup, cVar);
        eVar.b = (int) ((1.0f / f2) * eVar.b);
        return eVar;
    }

    public void a() {
        this.c = -1;
        float[] fArr = this.f2598d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2599e, 0.0f);
            Arrays.fill(this.f2600f, 0.0f);
            Arrays.fill(this.f2601g, 0.0f);
            Arrays.fill(this.f2602h, 0);
            Arrays.fill(this.f2603i, 0);
            Arrays.fill(this.f2604j, 0);
            this.f2605k = 0;
        }
        VelocityTracker velocityTracker = this.f2606l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2606l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.c = i2;
            this.s.h(view, i2);
            u(1);
            return;
        }
        StringBuilder A = f.a.b.a.a.A("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A.append(this.v);
        A.append(")");
        throw new IllegalArgumentException(A.toString());
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2602h[i2] & i3) != i3 || (this.q & i3) == 0 || (this.f2604j[i2] & i3) == i3 || (this.f2603i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.b;
        if (abs > i4 || abs2 > i4) {
            if (abs >= abs2 * 0.5f || !this.s.f(i3)) {
                return (this.f2603i[i2] & i3) == 0 && abs > ((float) this.b);
            }
            int[] iArr = this.f2604j;
            iArr[i2] = iArr[i2] | i3;
            return false;
        }
        return false;
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.c(view) > 0;
        boolean z2 = this.s.d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        float f4 = f3 * f3;
        int i2 = this.b;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void g(int i2) {
        if (this.f2598d == null || !n(i2)) {
            return;
        }
        this.f2598d[i2] = 0.0f;
        this.f2599e[i2] = 0.0f;
        this.f2600f[i2] = 0.0f;
        this.f2601g[i2] = 0.0f;
        this.f2602h[i2] = 0;
        this.f2603i[i2] = 0;
        this.f2604j[i2] = 0;
        this.f2605k = (~(1 << i2)) & this.f2605k;
    }

    public final int h(int i2, int i3, int i4) {
        int width;
        int abs;
        if (i2 == 0) {
            return 0;
        }
        float width2 = this.v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f);
        }
        return Math.min(abs, (int) LogSeverity.CRITICAL_VALUE);
    }

    public boolean i(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                z.o(this.t, left);
            }
            if (top != 0) {
                z.p(this.t, top);
            }
            if (left != 0 || top != 0) {
                this.s.j(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    u(0);
                }
            }
        }
        return this.a == 2;
    }

    public final void k(float f2, float f3) {
        this.u = true;
        this.s.k(this.t, f2, f3);
        this.u = false;
        if (this.a == 1) {
            u(0);
        }
    }

    public View l(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            Objects.requireNonNull(this.s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean m(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            u(0);
            return false;
        }
        View view = this.t;
        int f6 = f(i4, (int) this.n, (int) this.f2607m);
        int f7 = f(i5, (int) this.n, (int) this.f2607m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f2 = abs3;
            f3 = i8;
        } else {
            f2 = abs;
            f3 = i9;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f4 = abs4;
            f5 = i8;
        } else {
            f4 = abs2;
            f5 = i9;
        }
        int h2 = h(i6, f6, this.s.c(view));
        this.r.startScroll(left, top, i6, i7, (int) ((h(i7, f7, this.s.d(view)) * (f4 / f5)) + (h2 * f8)));
        u(2);
        return true;
    }

    public boolean n(int i2) {
        return ((1 << i2) & this.f2605k) != 0;
    }

    public final boolean o(int i2) {
        if (n(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void p(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2606l == null) {
            this.f2606l = VelocityTracker.obtain();
        }
        this.f2606l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View l2 = l((int) x2, (int) y);
            s(x2, y, pointerId);
            y(l2, pointerId);
            int i4 = this.f2602h[pointerId];
            int i5 = this.q;
            if ((i4 & i5) != 0) {
                this.s.g(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                q();
            }
            a();
        } else if (actionMasked == 2) {
            if (this.a == 1) {
                if (o(this.c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2600f;
                    int i6 = this.c;
                    int i7 = (int) (x3 - fArr[i6]);
                    int i8 = (int) (y2 - this.f2601g[i6]);
                    int left = this.t.getLeft() + i7;
                    int top = this.t.getTop() + i8;
                    int left2 = this.t.getLeft();
                    int top2 = this.t.getTop();
                    if (i7 != 0) {
                        left = this.s.a(this.t, left, i7);
                        z.o(this.t, left - left2);
                    }
                    int i9 = left;
                    if (i8 != 0) {
                        top = this.s.b(this.t, top, i8);
                        z.p(this.t, top - top2);
                    }
                    int i10 = top;
                    if (i7 != 0 || i8 != 0) {
                        this.s.j(this.t, i9, i10, i9 - left2, i10 - top2);
                    }
                    t(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (o(pointerId2)) {
                    float x4 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x4 - this.f2598d[pointerId2];
                    float f3 = y3 - this.f2599e[pointerId2];
                    r(f2, f3, pointerId2);
                    if (this.a != 1) {
                        View l3 = l((int) x4, (int) y3);
                        if (d(l3, f2, f3) && y(l3, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            t(motionEvent);
        } else if (actionMasked == 3) {
            if (this.a == 1) {
                k(0.0f, 0.0f);
            }
            a();
        } else if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount2) {
                        i2 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (pointerId4 != this.c) {
                        View l4 = l((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view = this.t;
                        if (l4 == view && y(view, pointerId4)) {
                            i2 = this.c;
                            break;
                        }
                    }
                    i3++;
                }
                if (i2 == -1) {
                    q();
                }
            }
            g(pointerId3);
        } else {
            int pointerId5 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            s(x5, y4, pointerId5);
            if (this.a == 0) {
                y(l((int) x5, (int) y4), pointerId5);
                int i11 = this.f2602h[pointerId5];
                int i12 = this.q;
                if ((i11 & i12) != 0) {
                    this.s.g(i11 & i12, pointerId5);
                    return;
                }
                return;
            }
            int i13 = (int) x5;
            int i14 = (int) y4;
            View view2 = this.t;
            if (view2 != null && i13 >= view2.getLeft() && i13 < view2.getRight() && i14 >= view2.getTop() && i14 < view2.getBottom()) {
                i3 = 1;
            }
            if (i3 != 0) {
                y(this.t, pointerId5);
            }
        }
    }

    public final void q() {
        this.f2606l.computeCurrentVelocity(1000, this.f2607m);
        k(e(this.f2606l.getXVelocity(this.c), this.n, this.f2607m), e(this.f2606l.getYVelocity(this.c), this.n, this.f2607m));
    }

    public final void r(float f2, float f3, int i2) {
        int i3 = c(f2, f3, i2, 1) ? 1 : 0;
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f2603i;
            iArr[i2] = iArr[i2] | i3;
            this.s.e(i3, i2);
        }
    }

    public final void s(float f2, float f3, int i2) {
        float[] fArr = this.f2598d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2599e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2600f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2601g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2602h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2603i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2604j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2598d = fArr2;
            this.f2599e = fArr3;
            this.f2600f = fArr4;
            this.f2601g = fArr5;
            this.f2602h = iArr;
            this.f2603i = iArr2;
            this.f2604j = iArr3;
        }
        float[] fArr9 = this.f2598d;
        this.f2600f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f2599e;
        this.f2601g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f2602h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = i4 < this.v.getLeft() + this.o ? 1 : 0;
        if (i5 < this.v.getTop() + this.o) {
            i6 |= 4;
        }
        if (i4 > this.v.getRight() - this.o) {
            i6 |= 2;
        }
        if (i5 > this.v.getBottom() - this.o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f2605k |= 1 << i2;
    }

    public final void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (o(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2600f[pointerId] = x2;
                this.f2601g[pointerId] = y;
            }
        }
    }

    public void u(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.a != i2) {
            this.a = i2;
            this.s.i(i2);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public boolean v(int i2, int i3) {
        if (this.u) {
            return m(i2, i3, (int) this.f2606l.getXVelocity(this.c), (int) this.f2606l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean w(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.a.e.w(android.view.MotionEvent):boolean");
    }

    public boolean x(View view, int i2, int i3) {
        this.t = view;
        this.c = -1;
        boolean m2 = m(i2, i3, 0, 0);
        if (!m2 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return m2;
    }

    public boolean y(View view, int i2) {
        if (view == this.t && this.c == i2) {
            return true;
        }
        if (view == null || !this.s.l(view, i2)) {
            return false;
        }
        this.c = i2;
        b(view, i2);
        return true;
    }
}

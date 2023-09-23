package e.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import e.i.j.z;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public class m extends RecyclerView.l implements RecyclerView.q {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.r C;
    public final int a;
    public final int b;
    public final StateListDrawable c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2875d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2876e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2877f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f2878g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2879h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2880i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2881j;

    /* renamed from: k  reason: collision with root package name */
    public int f2882k;

    /* renamed from: l  reason: collision with root package name */
    public int f2883l;

    /* renamed from: m  reason: collision with root package name */
    public float f2884m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            int i2 = mVar.A;
            if (i2 == 1) {
                mVar.z.cancel();
            } else if (i2 != 2) {
                return;
            }
            mVar.A = 3;
            ValueAnimator valueAnimator = mVar.z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            mVar.z.setDuration(500);
            mVar.z.start();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(RecyclerView recyclerView, int i2, int i3) {
            m mVar = m.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = mVar.s.computeVerticalScrollRange();
            int i4 = mVar.r;
            mVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= mVar.a;
            int computeHorizontalScrollRange = mVar.s.computeHorizontalScrollRange();
            int i5 = mVar.q;
            boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= mVar.a;
            mVar.u = z;
            boolean z2 = mVar.t;
            if (!z2 && !z) {
                if (mVar.v != 0) {
                    mVar.m(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f2 = i4;
                mVar.f2883l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
                mVar.f2882k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (mVar.u) {
                float f3 = computeHorizontalScrollOffset;
                float f4 = i5;
                mVar.o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
                mVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = mVar.v;
            if (i6 == 0 || i6 == 1) {
                mVar.m(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) m.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.m(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.s.invalidate();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.c.setAlpha(floatValue);
            m.this.f2875d.setAlpha(floatValue);
            m.this.s.invalidate();
        }
    }

    public m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.c = stateListDrawable;
        this.f2875d = drawable;
        this.f2878g = stateListDrawable2;
        this.f2879h = drawable2;
        this.f2876e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2877f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2880i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2881j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.h0(this);
            RecyclerView recyclerView3 = this.s;
            recyclerView3.u.remove(this);
            if (recyclerView3.v == this) {
                recyclerView3.v = null;
            }
            List<RecyclerView.r> list = this.s.o0;
            if (list != null) {
                list.remove(bVar);
            }
            i();
        }
        this.s = recyclerView;
        recyclerView.g(this);
        this.s.u.add(this);
        this.s.h(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean k2 = k(motionEvent.getX(), motionEvent.getY());
            boolean j2 = j(motionEvent.getX(), motionEvent.getY());
            if (k2 || j2) {
                if (j2) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (k2) {
                    this.w = 2;
                    this.f2884m = (int) motionEvent.getY();
                }
                m(2);
            }
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.f2884m = 0.0f;
            this.p = 0.0f;
            m(1);
            this.w = 0;
        } else if (motionEvent.getAction() == 2 && this.v == 2) {
            n();
            if (this.w == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                int i2 = this.b;
                iArr[0] = i2;
                iArr[1] = this.q - i2;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.o - max) >= 2.0f) {
                    int l2 = l(this.p, max, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                    if (l2 != 0) {
                        this.s.scrollBy(l2, 0);
                    }
                    this.p = max;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                int i3 = this.b;
                iArr2[0] = i3;
                iArr2[1] = this.r - i3;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f2883l - max2) < 2.0f) {
                    return;
                }
                int l3 = l(this.f2884m, max2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                if (l3 != 0) {
                    this.s.scrollBy(0, l3);
                }
                this.f2884m = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 == 1) {
            boolean k2 = k(motionEvent.getX(), motionEvent.getY());
            boolean j2 = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (k2 || j2)) {
                if (j2) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (k2) {
                    this.w = 2;
                    this.f2884m = (int) motionEvent.getY();
                }
                m(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    int i2 = this.q;
                    int i3 = this.f2876e;
                    int i4 = i2 - i3;
                    int i5 = this.f2883l;
                    int i6 = this.f2882k;
                    int i7 = i5 - (i6 / 2);
                    this.c.setBounds(0, 0, i3, i6);
                    this.f2875d.setBounds(0, 0, this.f2877f, this.r);
                    RecyclerView recyclerView2 = this.s;
                    AtomicInteger atomicInteger = e.i.j.z.a;
                    if (z.e.d(recyclerView2) == 1) {
                        this.f2875d.draw(canvas);
                        canvas.translate(this.f2876e, i7);
                        canvas.scale(-1.0f, 1.0f);
                        this.c.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-this.f2876e, -i7);
                    } else {
                        canvas.translate(i4, 0.0f);
                        this.f2875d.draw(canvas);
                        canvas.translate(0.0f, i7);
                        this.c.draw(canvas);
                        canvas.translate(-i4, -i7);
                    }
                }
                if (this.u) {
                    int i8 = this.r;
                    int i9 = this.f2880i;
                    int i10 = i8 - i9;
                    int i11 = this.o;
                    int i12 = this.n;
                    int i13 = i11 - (i12 / 2);
                    this.f2878g.setBounds(0, 0, i12, i9);
                    this.f2879h.setBounds(0, 0, this.q, this.f2881j);
                    canvas.translate(0.0f, i10);
                    this.f2879h.draw(canvas);
                    canvas.translate(i13, 0.0f);
                    this.f2878g.draw(canvas);
                    canvas.translate(-i13, -i10);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        m(0);
    }

    public final void i() {
        this.s.removeCallbacks(this.B);
    }

    public boolean j(float f2, float f3) {
        if (f3 >= this.r - this.f2880i) {
            int i2 = this.o;
            int i3 = this.n;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    public boolean k(float f2, float f3) {
        RecyclerView recyclerView = this.s;
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (z.e.d(recyclerView) == 1) {
            if (f2 > this.f2876e / 2) {
                return false;
            }
        } else if (f2 < this.q - this.f2876e) {
            return false;
        }
        int i2 = this.f2883l;
        int i3 = this.f2882k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final int l(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void m(int i2) {
        if (i2 == 2 && this.v != 2) {
            this.c.setState(D);
            i();
        }
        if (i2 == 0) {
            this.s.invalidate();
        } else {
            n();
        }
        if (this.v == 2 && i2 != 2) {
            this.c.setState(E);
            i();
            this.s.postDelayed(this.B, 1200);
        } else if (i2 == 1) {
            i();
            this.s.postDelayed(this.B, (long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i2;
    }

    public void n() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }
}

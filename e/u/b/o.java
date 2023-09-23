package e.u.b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import e.i.j.h;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public class o extends RecyclerView.l implements RecyclerView.o {
    public Rect B;
    public long C;

    /* renamed from: d  reason: collision with root package name */
    public float f2895d;

    /* renamed from: e  reason: collision with root package name */
    public float f2896e;

    /* renamed from: f  reason: collision with root package name */
    public float f2897f;

    /* renamed from: g  reason: collision with root package name */
    public float f2898g;

    /* renamed from: h  reason: collision with root package name */
    public float f2899h;

    /* renamed from: i  reason: collision with root package name */
    public float f2900i;

    /* renamed from: j  reason: collision with root package name */
    public float f2901j;

    /* renamed from: k  reason: collision with root package name */
    public float f2902k;

    /* renamed from: m  reason: collision with root package name */
    public d f2904m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public List<RecyclerView.a0> u;
    public List<Integer> v;
    public e.i.j.h y;
    public e z;
    public final List<View> a = new ArrayList();
    public final float[] b = new float[2];
    public RecyclerView.a0 c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f2903l = -1;
    public int n = 0;
    public List<f> p = new ArrayList();
    public final Runnable s = new a();
    public View w = null;
    public int x = -1;
    public final RecyclerView.q A = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.u.b.o.a.run():void");
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            ((h.b) o.this.y.a).a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = o.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o.this.f2903l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(o.this.f2903l);
            if (findPointerIndex >= 0) {
                o.this.j(actionMasked, motionEvent, findPointerIndex);
            }
            o oVar = o.this;
            RecyclerView.a0 a0Var = oVar.c;
            if (a0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        oVar.s(motionEvent, oVar.o, findPointerIndex);
                        o.this.p(a0Var);
                        o oVar2 = o.this;
                        oVar2.r.removeCallbacks(oVar2.s);
                        o.this.s.run();
                        o.this.r.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    o oVar3 = o.this;
                    if (pointerId == oVar3.f2903l) {
                        oVar3.f2903l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o oVar4 = o.this;
                        oVar4.s(motionEvent, oVar4.o, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = oVar.t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            o.this.r(null, 0);
            o.this.f2903l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            ((h.b) o.this.y.a).a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                o.this.f2903l = motionEvent.getPointerId(0);
                o.this.f2895d = motionEvent.getX();
                o.this.f2896e = motionEvent.getY();
                o oVar = o.this;
                VelocityTracker velocityTracker = oVar.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                oVar.t = VelocityTracker.obtain();
                o oVar2 = o.this;
                if (oVar2.c == null) {
                    if (!oVar2.p.isEmpty()) {
                        View m2 = oVar2.m(motionEvent);
                        int size = oVar2.p.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = oVar2.p.get(size);
                            if (fVar2.f2909e.itemView == m2) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        o oVar3 = o.this;
                        oVar3.f2895d -= fVar.f2913i;
                        oVar3.f2896e -= fVar.f2914j;
                        oVar3.l(fVar.f2909e, true);
                        if (o.this.a.remove(fVar.f2909e.itemView)) {
                            o oVar4 = o.this;
                            oVar4.f2904m.a(oVar4.r, fVar.f2909e);
                        }
                        o.this.r(fVar.f2909e, fVar.f2910f);
                        o oVar5 = o.this;
                        oVar5.s(motionEvent, oVar5.o, 0);
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i2 = o.this.f2903l;
                if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    o.this.j(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                o oVar6 = o.this;
                oVar6.f2903l = -1;
                oVar6.r(null, 0);
            }
            VelocityTracker velocityTracker2 = o.this.t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return o.this.c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void e(boolean z) {
            if (z) {
                o.this.r(null, 0);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends f {
        public final /* synthetic */ int n;
        public final /* synthetic */ RecyclerView.a0 o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.a0 a0Var, int i2, int i3, float f2, float f3, float f4, float f5, int i4, RecyclerView.a0 a0Var2) {
            super(a0Var, i2, i3, f2, f3, f4, f5);
            this.n = i4;
            this.o = a0Var2;
        }

        @Override // e.u.b.o.f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2916l) {
                this.f2909e.setIsRecyclable(true);
            }
            this.f2916l = true;
            if (this.f2915k) {
                return;
            }
            if (this.n <= 0) {
                o oVar = o.this;
                oVar.f2904m.a(oVar.r, this.o);
            } else {
                o.this.a.add(this.o.itemView);
                this.f2912h = true;
                int i2 = this.n;
                if (i2 > 0) {
                    o oVar2 = o.this;
                    oVar2.r.post(new p(oVar2, this, i2));
                }
            }
            o oVar3 = o.this;
            View view = oVar3.w;
            View view2 = this.o.itemView;
            if (view == view2) {
                oVar3.q(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public static final Interpolator b = new a();
        public static final Interpolator c = new b();
        public int a = -1;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public static class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public static class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        public static int c(int i2, int i3) {
            int i4;
            int i5 = i2 & 789516;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= (-789517) & i7;
                i4 = (i7 & 789516) << 2;
            }
            return i6 | i4;
        }

        public abstract void a(RecyclerView recyclerView, RecyclerView.a0 a0Var);

        public int b(int i2, int i3) {
            int i4;
            int i5 = i2 & 3158064;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i4 = (i7 & 3158064) >> 2;
            }
            return i6 | i4;
        }

        public final int d(RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i2 = recyclerView.getLayoutManager() instanceof GridLayoutManager ? 983055 : 208947;
            AtomicInteger atomicInteger = e.i.j.z.a;
            return b(i2, z.e.d(recyclerView));
        }

        public int e(RecyclerView recyclerView, int i2, int i3, long j2) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int i4 = this.a;
            float min = Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2) - 1.0f;
            int signum = (int) (((int) Math.signum(i3)) * i4 * ((min * min * min * min * min) + 1.0f));
            float f2 = j2 <= 2000 ? ((float) j2) / 2000.0f : 1.0f;
            int i5 = (int) (signum * f2 * f2 * f2 * f2 * f2);
            return i5 == 0 ? i3 > 0 ? 1 : -1 : i5;
        }

        public abstract void f(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var, float f2, float f3, int i2, boolean z);
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: f  reason: collision with root package name */
        public boolean f2906f = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m2;
            RecyclerView.a0 L;
            if (!this.f2906f || (m2 = o.this.m(motionEvent)) == null || (L = o.this.r.L(m2)) == null) {
                return;
            }
            o oVar = o.this;
            if ((oVar.f2904m.d(oVar.r, L) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i2 = o.this.f2903l;
                if (pointerId == i2) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    o oVar2 = o.this;
                    oVar2.f2895d = x;
                    oVar2.f2896e = y;
                    oVar2.f2900i = 0.0f;
                    oVar2.f2899h = 0.0f;
                    Objects.requireNonNull(oVar2.f2904m);
                    o.this.r(L, 2);
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {
        public final float a;
        public final float b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2908d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.a0 f2909e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2910f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f2911g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2912h;

        /* renamed from: i  reason: collision with root package name */
        public float f2913i;

        /* renamed from: j  reason: collision with root package name */
        public float f2914j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2915k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2916l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f2917m;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.f2917m = valueAnimator.getAnimatedFraction();
            }
        }

        public f(RecyclerView.a0 a0Var, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f2910f = i3;
            this.f2909e = a0Var;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.f2908d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2911g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(a0Var.itemView);
            ofFloat.addListener(this);
            this.f2917m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2917m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2916l) {
                this.f2909e.setIsRecyclable(true);
            }
            this.f2916l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface g {
        void b(View view, View view2, int i2, int i3);
    }

    public o(d dVar) {
        this.f2904m = dVar;
    }

    public static boolean o(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(View view) {
        q(view);
        RecyclerView.a0 L = this.r.L(view);
        if (L == null) {
            return;
        }
        RecyclerView.a0 a0Var = this.c;
        if (a0Var != null && L == a0Var) {
            r(null, 0);
            return;
        }
        l(L, false);
        if (this.a.remove(L.itemView)) {
            this.f2904m.a(this.r, L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        float f2;
        float f3;
        this.x = -1;
        if (this.c != null) {
            n(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        d dVar = this.f2904m;
        RecyclerView.a0 a0Var = this.c;
        List<f> list = this.p;
        int i2 = this.n;
        Objects.requireNonNull(dVar);
        int i3 = 0;
        for (int size = list.size(); i3 < size; size = size) {
            f fVar = list.get(i3);
            float f5 = fVar.a;
            float f6 = fVar.c;
            if (f5 == f6) {
                fVar.f2913i = fVar.f2909e.itemView.getTranslationX();
            } else {
                fVar.f2913i = f.a.b.a.a.a(f6, f5, fVar.f2917m, f5);
            }
            float f7 = fVar.b;
            float f8 = fVar.f2908d;
            if (f7 == f8) {
                fVar.f2914j = fVar.f2909e.itemView.getTranslationY();
            } else {
                fVar.f2914j = f.a.b.a.a.a(f8, f7, fVar.f2917m, f7);
            }
            int save = canvas.save();
            dVar.f(canvas, recyclerView, fVar.f2909e, fVar.f2913i, fVar.f2914j, fVar.f2910f, false);
            canvas.restoreToCount(save);
            i3++;
        }
        if (a0Var != null) {
            int save2 = canvas.save();
            dVar.f(canvas, recyclerView, a0Var, f2, f3, i2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        boolean z = false;
        if (this.c != null) {
            n(this.b);
            float[] fArr = this.b;
            float f2 = fArr[0];
            float f3 = fArr[1];
        }
        d dVar = this.f2904m;
        RecyclerView.a0 a0Var = this.c;
        List<f> list = this.p;
        Objects.requireNonNull(dVar);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int save = canvas.save();
            View view = list.get(i2).f2909e.itemView;
            canvas.restoreToCount(save);
        }
        if (a0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            f fVar = list.get(i3);
            boolean z2 = fVar.f2916l;
            if (z2 && !fVar.f2912h) {
                list.remove(i3);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int i(RecyclerView.a0 a0Var, int i2) {
        if ((i2 & 12) != 0) {
            int i3 = this.f2899h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.f2903l > -1) {
                d dVar = this.f2904m;
                float f2 = this.f2898g;
                Objects.requireNonNull(dVar);
                velocityTracker.computeCurrentVelocity(1000, f2);
                float xVelocity = this.t.getXVelocity(this.f2903l);
                float yVelocity = this.t.getYVelocity(this.f2903l);
                int i4 = xVelocity > 0.0f ? 8 : 4;
                float abs = Math.abs(xVelocity);
                if ((i4 & i2) != 0 && i3 == i4) {
                    d dVar2 = this.f2904m;
                    float f3 = this.f2897f;
                    Objects.requireNonNull(dVar2);
                    if (abs >= f3 && abs > Math.abs(yVelocity)) {
                        return i4;
                    }
                }
            }
            Objects.requireNonNull(this.f2904m);
            float width = this.r.getWidth() * 0.5f;
            if ((i2 & i3) == 0 || Math.abs(this.f2899h) <= width) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    public void j(int i2, MotionEvent motionEvent, int i3) {
        int d2;
        View m2;
        if (this.c == null && i2 == 2 && this.n != 2) {
            Objects.requireNonNull(this.f2904m);
            if (this.r.getScrollState() == 1) {
                return;
            }
            RecyclerView.m layoutManager = this.r.getLayoutManager();
            int i4 = this.f2903l;
            RecyclerView.a0 a0Var = null;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f2895d);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f2896e);
                float f2 = this.q;
                if ((abs >= f2 || abs2 >= f2) && ((abs <= abs2 || !layoutManager.g()) && ((abs2 <= abs || !layoutManager.h()) && (m2 = m(motionEvent)) != null))) {
                    a0Var = this.r.L(m2);
                }
            }
            if (a0Var == null || (d2 = (this.f2904m.d(this.r, a0Var) & 65280) >> 8) == 0) {
                return;
            }
            float x = motionEvent.getX(i3);
            float y = motionEvent.getY(i3);
            float f3 = x - this.f2895d;
            float f4 = y - this.f2896e;
            float abs3 = Math.abs(f3);
            float abs4 = Math.abs(f4);
            float f5 = this.q;
            if (abs3 >= f5 || abs4 >= f5) {
                if (abs3 > abs4) {
                    if (f3 < 0.0f && (d2 & 4) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (d2 & 8) == 0) {
                        return;
                    }
                } else if (f4 < 0.0f && (d2 & 1) == 0) {
                    return;
                } else {
                    if (f4 > 0.0f && (d2 & 2) == 0) {
                        return;
                    }
                }
                this.f2900i = 0.0f;
                this.f2899h = 0.0f;
                this.f2903l = motionEvent.getPointerId(0);
                r(a0Var, 1);
            }
        }
    }

    public final int k(RecyclerView.a0 a0Var, int i2) {
        if ((i2 & 3) != 0) {
            int i3 = this.f2900i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.f2903l > -1) {
                d dVar = this.f2904m;
                float f2 = this.f2898g;
                Objects.requireNonNull(dVar);
                velocityTracker.computeCurrentVelocity(1000, f2);
                float xVelocity = this.t.getXVelocity(this.f2903l);
                float yVelocity = this.t.getYVelocity(this.f2903l);
                int i4 = yVelocity > 0.0f ? 2 : 1;
                float abs = Math.abs(yVelocity);
                if ((i4 & i2) != 0 && i4 == i3) {
                    d dVar2 = this.f2904m;
                    float f3 = this.f2897f;
                    Objects.requireNonNull(dVar2);
                    if (abs >= f3 && abs > Math.abs(xVelocity)) {
                        return i4;
                    }
                }
            }
            Objects.requireNonNull(this.f2904m);
            float height = this.r.getHeight() * 0.5f;
            if ((i2 & i3) == 0 || Math.abs(this.f2900i) <= height) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    public void l(RecyclerView.a0 a0Var, boolean z) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            f fVar = this.p.get(size);
            if (fVar.f2909e == a0Var) {
                fVar.f2915k |= z;
                if (!fVar.f2916l) {
                    fVar.f2911g.cancel();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    public View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.a0 a0Var = this.c;
        if (a0Var != null) {
            View view = a0Var.itemView;
            if (o(view, x, y, this.f2901j + this.f2899h, this.f2902k + this.f2900i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            f fVar = this.p.get(size);
            View view2 = fVar.f2909e.itemView;
            if (o(view2, x, y, fVar.f2913i, fVar.f2914j)) {
                return view2;
            }
        }
        return this.r.C(x, y);
    }

    public final void n(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.f2901j + this.f2899h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.f2902k + this.f2900i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    public void p(RecyclerView.a0 a0Var) {
        boolean z;
        List<RecyclerView.a0> list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i2;
        int i3;
        if (!this.r.isLayoutRequested() && this.n == 2) {
            Objects.requireNonNull(this.f2904m);
            int i4 = (int) (this.f2901j + this.f2899h);
            int i5 = (int) (this.f2902k + this.f2900i);
            if (Math.abs(i5 - a0Var.itemView.getTop()) >= a0Var.itemView.getHeight() * 0.5f || Math.abs(i4 - a0Var.itemView.getLeft()) >= a0Var.itemView.getWidth() * 0.5f) {
                List<RecyclerView.a0> list2 = this.u;
                if (list2 == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    list2.clear();
                    this.v.clear();
                }
                Objects.requireNonNull(this.f2904m);
                int round = Math.round(this.f2901j + this.f2899h) - 0;
                int round2 = Math.round(this.f2902k + this.f2900i) - 0;
                int width = a0Var.itemView.getWidth() + round + 0;
                int height = a0Var.itemView.getHeight() + round2 + 0;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                RecyclerView.m layoutManager = this.r.getLayoutManager();
                int A = layoutManager.A();
                int i8 = 0;
                while (i8 < A) {
                    View z2 = layoutManager.z(i8);
                    if (z2 != a0Var.itemView && z2.getBottom() >= round2 && z2.getTop() <= height && z2.getRight() >= round && z2.getLeft() <= width) {
                        RecyclerView.a0 L = this.r.L(z2);
                        Objects.requireNonNull(this.f2904m);
                        int abs5 = Math.abs(i6 - ((z2.getRight() + z2.getLeft()) / 2));
                        int abs6 = Math.abs(i7 - ((z2.getBottom() + z2.getTop()) / 2));
                        int i9 = (abs6 * abs6) + (abs5 * abs5);
                        int size = this.u.size();
                        i2 = round;
                        i3 = round2;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < size) {
                            int i12 = size;
                            if (i9 <= this.v.get(i10).intValue()) {
                                break;
                            }
                            i11++;
                            i10++;
                            size = i12;
                        }
                        this.u.add(i11, L);
                        this.v.add(i11, Integer.valueOf(i9));
                    } else {
                        i2 = round;
                        i3 = round2;
                    }
                    i8++;
                    round = i2;
                    round2 = i3;
                }
                List<RecyclerView.a0> list3 = this.u;
                if (list3.size() == 0) {
                    return;
                }
                Objects.requireNonNull(this.f2904m);
                int width2 = a0Var.itemView.getWidth() + i4;
                int height2 = a0Var.itemView.getHeight() + i5;
                int left2 = i4 - a0Var.itemView.getLeft();
                int top2 = i5 - a0Var.itemView.getTop();
                int size2 = list3.size();
                RecyclerView.a0 a0Var2 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    RecyclerView.a0 a0Var3 = list3.get(i14);
                    if (left2 <= 0 || (right = a0Var3.itemView.getRight() - width2) >= 0) {
                        list = list3;
                    } else {
                        list = list3;
                        if (a0Var3.itemView.getRight() > a0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i13) {
                            i13 = abs4;
                            a0Var2 = a0Var3;
                        }
                    }
                    if (left2 < 0 && (left = a0Var3.itemView.getLeft() - i4) > 0 && a0Var3.itemView.getLeft() < a0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i13) {
                        i13 = abs3;
                        a0Var2 = a0Var3;
                    }
                    if (top2 < 0 && (top = a0Var3.itemView.getTop() - i5) > 0 && a0Var3.itemView.getTop() < a0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i13) {
                        i13 = abs2;
                        a0Var2 = a0Var3;
                    }
                    if (top2 > 0 && (bottom = a0Var3.itemView.getBottom() - height2) < 0 && a0Var3.itemView.getBottom() > a0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i13) {
                        i13 = abs;
                        a0Var2 = a0Var3;
                    }
                    i14++;
                    list3 = list;
                }
                if (a0Var2 == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int adapterPosition = a0Var2.getAdapterPosition();
                a0Var.getAdapterPosition();
                f.n.a.v.t.a.c cVar = (f.n.a.v.t.a.c) this.f2904m;
                Objects.requireNonNull(cVar);
                if (a0Var.getItemViewType() != a0Var2.getItemViewType()) {
                    z = false;
                } else {
                    f.n.a.v.t.a.a aVar = cVar.f7466d;
                    int adapterPosition2 = a0Var.getAdapterPosition();
                    int adapterPosition3 = a0Var2.getAdapterPosition();
                    f.n.a.v.t.i.b bVar = (f.n.a.v.t.i.b) aVar;
                    Collections.swap(bVar.b, adapterPosition2, adapterPosition3);
                    bVar.notifyItemMoved(adapterPosition2, adapterPosition3);
                    z = true;
                }
                if (z) {
                    d dVar = this.f2904m;
                    RecyclerView recyclerView = this.r;
                    Objects.requireNonNull(dVar);
                    RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 instanceof g) {
                        ((g) layoutManager2).b(a0Var.itemView, a0Var2.itemView, i4, i5);
                        return;
                    }
                    if (layoutManager2.g()) {
                        if (layoutManager2.E(a0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                            recyclerView.m0(adapterPosition);
                        }
                        if (layoutManager2.H(a0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.m0(adapterPosition);
                        }
                    }
                    if (layoutManager2.h()) {
                        if (layoutManager2.I(a0Var2.itemView) <= recyclerView.getPaddingTop()) {
                            recyclerView.m0(adapterPosition);
                        }
                        if (layoutManager2.D(a0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.m0(adapterPosition);
                        }
                    }
                }
            }
        }
    }

    public void q(View view) {
        if (view == this.w) {
            this.w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r2 > 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(androidx.recyclerview.widget.RecyclerView.a0 r22, int r23) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.u.b.o.r(androidx.recyclerview.widget.RecyclerView$a0, int):void");
    }

    public void s(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f2895d;
        this.f2899h = f2;
        this.f2900i = y - this.f2896e;
        if ((i2 & 4) == 0) {
            this.f2899h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f2899h = Math.min(0.0f, this.f2899h);
        }
        if ((i2 & 1) == 0) {
            this.f2900i = Math.max(0.0f, this.f2900i);
        }
        if ((i2 & 2) == 0) {
            this.f2900i = Math.min(0.0f, this.f2900i);
        }
    }
}

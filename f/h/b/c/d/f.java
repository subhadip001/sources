package f.h.b.c.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.material.appbar.AppBarLayout;
import e.i.j.z;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes.dex */
public abstract class f<V extends View> extends h<V> {
    public Runnable c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f5229d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5230e;

    /* renamed from: f  reason: collision with root package name */
    public int f5231f;

    /* renamed from: g  reason: collision with root package name */
    public int f5232g;

    /* renamed from: h  reason: collision with root package name */
    public int f5233h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f5234i;

    /* JADX WARN: Field signature parse error: g
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* compiled from: HeaderBehavior.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final CoordinatorLayout f5235f;

        /* renamed from: g  reason: collision with root package name */
        public final View f5236g;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f5235f = coordinatorLayout;
            this.f5236g = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f5236g == null || (overScroller = f.this.f5229d) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                f fVar = f.this;
                fVar.G(this.f5235f, this.f5236g, fVar.f5229d.getCurrY());
                z.d.m(this.f5236g, this);
                return;
            }
            f fVar2 = f.this;
            CoordinatorLayout coordinatorLayout = this.f5235f;
            View view = this.f5236g;
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) fVar2;
            Objects.requireNonNull(baseBehavior);
            AppBarLayout appBarLayout = (AppBarLayout) view;
            baseBehavior.P(coordinatorLayout, appBarLayout);
            if (appBarLayout.p) {
                appBarLayout.d(appBarLayout.e(baseBehavior.K(coordinatorLayout)));
            }
        }
    }

    public f() {
        this.f5231f = -1;
        this.f5233h = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.d.f.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int E();

    public final int F(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return H(coordinatorLayout, v, E() - i2, i3, i4);
    }

    public int G(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return H(coordinatorLayout, v, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public abstract int H(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        int findPointerIndex;
        if (this.f5233h < 0) {
            this.f5233h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f5230e) {
            int i2 = this.f5231f;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f5232g) > this.f5233h) {
                this.f5232g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f5231f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AppBarLayout appBarLayout = (AppBarLayout) v;
            WeakReference<View> weakReference = ((AppBarLayout.BaseBehavior) this).n;
            boolean z = (weakReference == null || ((view = weakReference.get()) != null && view.isShown() && !view.canScrollVertically(-1))) && coordinatorLayout.q(v, x, y2);
            this.f5230e = z;
            if (z) {
                this.f5232g = y2;
                this.f5231f = motionEvent.getPointerId(0);
                if (this.f5234i == null) {
                    this.f5234i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f5229d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f5229d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f5234i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5231f = -1;
        this.f5233h = -1;
    }
}

package e.b.h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final float f1778f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1779g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1780h;

    /* renamed from: i  reason: collision with root package name */
    public final View f1781i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f1782j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f1783k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1784l;

    /* renamed from: m  reason: collision with root package name */
    public int f1785m;
    public final int[] n = new int[2];

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h0.this.f1781i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0 h0Var = h0.this;
            h0Var.a();
            View view = h0Var.f1781i;
            if (view.isEnabled() && !view.isLongClickable() && h0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                h0Var.f1784l = true;
            }
        }
    }

    public h0(View view) {
        this.f1781i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1778f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1779g = tapTimeout;
        this.f1780h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f1783k;
        if (runnable != null) {
            this.f1781i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1782j;
        if (runnable2 != null) {
            this.f1781i.removeCallbacks(runnable2);
        }
    }

    public abstract e.b.g.i.p b();

    public abstract boolean c();

    public boolean d() {
        e.b.g.i.p b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r4 != 3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.h0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1784l = false;
        this.f1785m = -1;
        Runnable runnable = this.f1782j;
        if (runnable != null) {
            this.f1781i.removeCallbacks(runnable);
        }
    }
}

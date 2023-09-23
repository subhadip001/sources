package e.b.h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public class c1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static c1 o;
    public static c1 p;

    /* renamed from: f  reason: collision with root package name */
    public final View f1734f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f1735g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1736h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f1737i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f1738j = new b();

    /* renamed from: k  reason: collision with root package name */
    public int f1739k;

    /* renamed from: l  reason: collision with root package name */
    public int f1740l;

    /* renamed from: m  reason: collision with root package name */
    public d1 f1741m;
    public boolean n;

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c1.this.d(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c1.this.b();
        }
    }

    public c1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1734f = view;
        this.f1735g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e.i.j.a0.a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1736h = scaledTouchSlop;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(c1 c1Var) {
        c1 c1Var2 = o;
        if (c1Var2 != null) {
            c1Var2.f1734f.removeCallbacks(c1Var2.f1737i);
        }
        o = c1Var;
        if (c1Var != null) {
            c1Var.f1734f.postDelayed(c1Var.f1737i, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f1739k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1740l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public void b() {
        if (p == this) {
            p = null;
            d1 d1Var = this.f1741m;
            if (d1Var != null) {
                d1Var.a();
                this.f1741m = null;
                a();
                this.f1734f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (o == this) {
            c(null);
        }
        this.f1734f.removeCallbacks(this.f1738j);
    }

    public void d(boolean z) {
        int height;
        int i2;
        long j2;
        int longPressTimeout;
        long j3;
        View view = this.f1734f;
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (z.g.b(view)) {
            c(null);
            c1 c1Var = p;
            if (c1Var != null) {
                c1Var.b();
            }
            p = this;
            this.n = z;
            d1 d1Var = new d1(this.f1734f.getContext());
            this.f1741m = d1Var;
            View view2 = this.f1734f;
            int i3 = this.f1739k;
            int i4 = this.f1740l;
            boolean z2 = this.n;
            CharSequence charSequence = this.f1735g;
            if (d1Var.b.getParent() != null) {
                d1Var.a();
            }
            d1Var.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = d1Var.f1748d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = d1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i3 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = d1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = d1Var.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(d1Var.f1749e);
                Rect rect = d1Var.f1749e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = d1Var.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    d1Var.f1749e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(d1Var.f1751g);
                view2.getLocationOnScreen(d1Var.f1750f);
                int[] iArr = d1Var.f1750f;
                int i5 = iArr[0];
                int[] iArr2 = d1Var.f1751g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                d1Var.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = d1Var.b.getMeasuredHeight();
                int[] iArr3 = d1Var.f1750f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= d1Var.f1749e.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) d1Var.a.getSystemService("window")).addView(d1Var.b, d1Var.f1748d);
            this.f1734f.addOnAttachStateChangeListener(this);
            if (this.n) {
                j3 = 2500;
            } else {
                if ((z.d.g(this.f1734f) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - longPressTimeout;
            }
            this.f1734f.removeCallbacks(this.f1738j);
            this.f1734f.postDelayed(this.f1738j, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1741m == null || !this.n) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1734f.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                    b();
                }
            } else if (this.f1734f.isEnabled() && this.f1741m == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.f1739k) > this.f1736h || Math.abs(y - this.f1740l) > this.f1736h) {
                    this.f1739k = x;
                    this.f1740l = y;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1739k = view.getWidth() / 2;
        this.f1740l = view.getHeight() / 2;
        d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}

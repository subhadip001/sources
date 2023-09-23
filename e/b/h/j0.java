package e.b.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import e.i.j.z;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class j0 implements e.b.g.i.p {
    public static Method F;
    public static Method G;
    public static Method H;
    public final Handler A;
    public Rect C;
    public boolean D;
    public PopupWindow E;

    /* renamed from: f  reason: collision with root package name */
    public Context f1797f;

    /* renamed from: g  reason: collision with root package name */
    public ListAdapter f1798g;

    /* renamed from: h  reason: collision with root package name */
    public f0 f1799h;

    /* renamed from: k  reason: collision with root package name */
    public int f1802k;

    /* renamed from: l  reason: collision with root package name */
    public int f1803l;
    public boolean n;
    public boolean o;
    public boolean p;
    public DataSetObserver t;
    public View u;
    public AdapterView.OnItemClickListener v;

    /* renamed from: i  reason: collision with root package name */
    public int f1800i = -2;

    /* renamed from: j  reason: collision with root package name */
    public int f1801j = -2;

    /* renamed from: m  reason: collision with root package name */
    public int f1804m = 1002;
    public int q = 0;
    public int r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public int s = 0;
    public final e w = new e();
    public final d x = new d();
    public final c y = new c();
    public final a z = new a();
    public final Rect B = new Rect();

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f1799h;
            if (f0Var != null) {
                f0Var.setListSelectionHidden(true);
                f0Var.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.a()) {
                j0.this.h();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1) {
                if ((j0.this.E.getInputMethodMode() == 2) || j0.this.E.getContentView() == null) {
                    return;
                }
                j0 j0Var = j0.this;
                j0Var.A.removeCallbacks(j0Var.w);
                j0.this.w.run();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.E) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.E.getWidth() && y >= 0 && y < j0.this.E.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.A.postDelayed(j0Var.w, 250L);
                return false;
            } else if (action == 1) {
                j0 j0Var2 = j0.this;
                j0Var2.A.removeCallbacks(j0Var2.w);
                return false;
            } else {
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f1799h;
            if (f0Var != null) {
                AtomicInteger atomicInteger = e.i.j.z.a;
                if (!z.g.b(f0Var) || j0.this.f1799h.getCount() <= j0.this.f1799h.getChildCount()) {
                    return;
                }
                int childCount = j0.this.f1799h.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.r) {
                    j0Var.E.setInputMethodMode(2);
                    j0.this.h();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                G = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1797f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.p, i2, i3);
        this.f1802k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1803l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i2, i3);
        this.E = pVar;
        pVar.setInputMethodMode(1);
    }

    @Override // e.b.g.i.p
    public boolean a() {
        return this.E.isShowing();
    }

    public int b() {
        return this.f1802k;
    }

    public void d(int i2) {
        this.f1802k = i2;
    }

    @Override // e.b.g.i.p
    public void dismiss() {
        this.E.dismiss();
        this.E.setContentView(null);
        this.f1799h = null;
        this.A.removeCallbacks(this.w);
    }

    public Drawable g() {
        return this.E.getBackground();
    }

    @Override // e.b.g.i.p
    public void h() {
        int i2;
        int maxAvailableHeight;
        int makeMeasureSpec;
        int paddingBottom;
        f0 f0Var;
        if (this.f1799h == null) {
            f0 q = q(this.f1797f, !this.D);
            this.f1799h = q;
            q.setAdapter(this.f1798g);
            this.f1799h.setOnItemClickListener(this.v);
            this.f1799h.setFocusable(true);
            this.f1799h.setFocusableInTouchMode(true);
            this.f1799h.setOnItemSelectedListener(new i0(this));
            this.f1799h.setOnScrollListener(this.y);
            this.E.setContentView(this.f1799h);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.E.getContentView();
        }
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            Rect rect = this.B;
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.n) {
                this.f1803l = -i3;
            }
        } else {
            this.B.setEmpty();
            i2 = 0;
        }
        boolean z = this.E.getInputMethodMode() == 2;
        View view = this.u;
        int i4 = this.f1803l;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = G;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.E, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = this.E.getMaxAvailableHeight(view, i4);
        } else {
            maxAvailableHeight = this.E.getMaxAvailableHeight(view, i4, z);
        }
        if (this.f1800i == -1) {
            paddingBottom = maxAvailableHeight + i2;
        } else {
            int i5 = this.f1801j;
            if (i5 == -2) {
                int i6 = this.f1797f.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.B;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i5 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, CommonUtils.BYTES_IN_A_GIGABYTE);
            } else {
                int i7 = this.f1797f.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.B;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect3.left + rect3.right), CommonUtils.BYTES_IN_A_GIGABYTE);
            }
            int a2 = this.f1799h.a(makeMeasureSpec, maxAvailableHeight - 0, -1);
            paddingBottom = a2 + (a2 > 0 ? this.f1799h.getPaddingBottom() + this.f1799h.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z2 = this.E.getInputMethodMode() == 2;
        e.i.a.f0(this.E, this.f1804m);
        if (this.E.isShowing()) {
            View view2 = this.u;
            AtomicInteger atomicInteger = e.i.j.z.a;
            if (z.g.b(view2)) {
                int i8 = this.f1801j;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.u.getWidth();
                }
                int i9 = this.f1800i;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.E.setWidth(this.f1801j == -1 ? -1 : 0);
                        this.E.setHeight(0);
                    } else {
                        this.E.setWidth(this.f1801j == -1 ? -1 : 0);
                        this.E.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.E.setOutsideTouchable(true);
                this.E.update(this.u, this.f1802k, this.f1803l, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i10 = this.f1801j;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.u.getWidth();
        }
        int i11 = this.f1800i;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.E.setWidth(i10);
        this.E.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = F;
            if (method2 != null) {
                try {
                    method2.invoke(this.E, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.E.setIsClippedToScreen(true);
        }
        this.E.setOutsideTouchable(true);
        this.E.setTouchInterceptor(this.x);
        if (this.p) {
            e.i.a.Z(this.E, this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = H;
            if (method3 != null) {
                try {
                    method3.invoke(this.E, this.C);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.E.setEpicenterBounds(this.C);
        }
        e.i.k.e.a(this.E, this.u, this.f1802k, this.f1803l, this.q);
        this.f1799h.setSelection(-1);
        if ((!this.D || this.f1799h.isInTouchMode()) && (f0Var = this.f1799h) != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    public void j(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    @Override // e.b.g.i.p
    public ListView k() {
        return this.f1799h;
    }

    public void l(int i2) {
        this.f1803l = i2;
        this.n = true;
    }

    public int o() {
        if (this.n) {
            return this.f1803l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new b();
        } else {
            ListAdapter listAdapter2 = this.f1798g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1798g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        f0 f0Var = this.f1799h;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1798g);
        }
    }

    public f0 q(Context context, boolean z) {
        return new f0(context, z);
    }

    public void r(int i2) {
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            Rect rect = this.B;
            this.f1801j = rect.left + rect.right + i2;
            return;
        }
        this.f1801j = i2;
    }

    public void s(boolean z) {
        this.D = z;
        this.E.setFocusable(z);
    }
}

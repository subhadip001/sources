package f.h.b.c.h;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.database.core.ValidationPath;
import com.video_converter.video_compressor.R;
import e.b.c.s;
import e.i.j.f0;
import e.i.j.q;
import e.i.j.z;
import f.h.b.c.y.g;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public class d extends s {

    /* renamed from: h  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f5268h;

    /* renamed from: i  reason: collision with root package name */
    public FrameLayout f5269i;

    /* renamed from: j  reason: collision with root package name */
    public CoordinatorLayout f5270j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f5271k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5272l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5273m;
    public boolean n;
    public BottomSheetBehavior.c o;
    public boolean p;
    public BottomSheetBehavior.c q;

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public class a implements q {
        public a() {
        }

        @Override // e.i.j.q
        public f0 a(View view, f0 f0Var) {
            d dVar = d.this;
            BottomSheetBehavior.c cVar = dVar.o;
            if (cVar != null) {
                dVar.f5268h.T.remove(cVar);
            }
            d dVar2 = d.this;
            dVar2.o = new f(dVar2.f5271k, f0Var, null);
            d dVar3 = d.this;
            dVar3.f5268h.B(dVar3.o);
            return f0Var;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f5272l && dVar.isShowing()) {
                d dVar2 = d.this;
                if (!dVar2.n) {
                    TypedArray obtainStyledAttributes = dVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    dVar2.f5273m = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    dVar2.n = true;
                }
                if (dVar2.f5273m) {
                    d.this.cancel();
                }
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public class c extends e.i.j.c {
        public c() {
        }

        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            if (d.this.f5272l) {
                dVar.a.addAction(CommonUtils.BYTES_IN_A_MEGABYTE);
                dVar.a.setDismissable(true);
                return;
            }
            dVar.a.setDismissable(false);
        }

        @Override // e.i.j.c
        public boolean g(View view, int i2, Bundle bundle) {
            if (i2 == 1048576) {
                d dVar = d.this;
                if (dVar.f5272l) {
                    dVar.cancel();
                    return true;
                }
            }
            return super.g(view, i2, bundle);
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: f.h.b.c.h.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0120d implements View.OnTouchListener {
        public View$OnTouchListenerC0120d(d dVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public class e extends BottomSheetBehavior.c {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void b(View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void c(View view, int i2) {
            if (i2 == 5) {
                d.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public static class f extends BottomSheetBehavior.c {
        public final boolean a;
        public final boolean b;
        public final f0 c;

        public f(View view, f0 f0Var, a aVar) {
            ColorStateList g2;
            this.c = f0Var;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.b = z;
            g gVar = BottomSheetBehavior.G(view).f1091h;
            if (gVar != null) {
                g2 = gVar.f5480f.f5488d;
            } else {
                AtomicInteger atomicInteger = z.a;
                g2 = z.i.g(view);
            }
            if (g2 != null) {
                this.a = f.h.b.c.a.u0(g2.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.a = f.h.b.c.a.u0(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.a = z;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void b(View view, float f2) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void c(View view, int i2) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.c.f()) {
                d.f(view, this.a);
                view.setPadding(view.getPaddingLeft(), this.c.f() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                d.f(view, this.b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968689(0x7f040071, float:1.7546039E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2131952229(0x7f130265, float:1.9540895E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f5272l = r0
            r3.f5273m = r0
            f.h.b.c.h.d$e r4 = new f.h.b.c.h.d$e
            r4.<init>()
            r3.q = r4
            r3.c(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130968955(0x7f04017b, float:1.7546578E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.h.d.<init>(android.content.Context, int):void");
    }

    public static void f(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f5268h == null) {
            d();
        }
        super.cancel();
    }

    public final FrameLayout d() {
        if (this.f5269i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f5269i = frameLayout;
            this.f5270j = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f5269i.findViewById(R.id.design_bottom_sheet);
            this.f5271k = frameLayout2;
            BottomSheetBehavior<FrameLayout> G = BottomSheetBehavior.G(frameLayout2);
            this.f5268h = G;
            G.B(this.q);
            this.f5268h.L(this.f5272l);
        }
        return this.f5269i;
    }

    public final View g(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f5269i.findViewById(R.id.coordinator);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        if (this.p) {
            FrameLayout frameLayout = this.f5271k;
            a aVar = new a();
            AtomicInteger atomicInteger = z.a;
            z.i.u(frameLayout, aVar);
        }
        this.f5271k.removeAllViews();
        if (layoutParams == null) {
            this.f5271k.addView(view);
        } else {
            this.f5271k.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        z.w(this.f5271k, new c());
        this.f5271k.setOnTouchListener(new View$OnTouchListenerC0120d(this));
        return this.f5269i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f5269i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f5270j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(ValidationPath.MAX_PATH_LENGTH_BYTES);
            }
        }
    }

    @Override // e.b.c.s, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i2 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i2 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f5268h;
        if (bottomSheetBehavior == null || bottomSheetBehavior.J != 5) {
            return;
        }
        bottomSheetBehavior.N(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f5272l != z) {
            this.f5272l = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f5268h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f5272l) {
            this.f5272l = true;
        }
        this.f5273m = z;
        this.n = true;
    }

    @Override // e.b.c.s, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(g(i2, null, null));
    }

    @Override // e.b.c.s, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(g(0, view, null));
    }

    @Override // e.b.c.s, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(0, view, layoutParams));
    }
}

package e.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import com.video_converter.video_compressor.R;
import e.b.c.a;
import e.b.g.a;
import e.b.g.i.g;
import e.b.h.d0;
import e.i.j.b0;
import e.i.j.c0;
import e.i.j.e0;
import e.i.j.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class y extends e.b.c.a implements ActionBarOverlayLayout.d {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f1530d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f1531e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f1532f;

    /* renamed from: g  reason: collision with root package name */
    public View f1533g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1534h;

    /* renamed from: i  reason: collision with root package name */
    public d f1535i;

    /* renamed from: j  reason: collision with root package name */
    public e.b.g.a f1536j;

    /* renamed from: k  reason: collision with root package name */
    public a.InterfaceC0026a f1537k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1538l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f1539m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public e.b.g.g t;
    public boolean u;
    public boolean v;
    public final c0 w;
    public final c0 x;
    public final e0 y;
    public static final Interpolator z = new AccelerateInterpolator();
    public static final Interpolator A = new DecelerateInterpolator();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends e.i.j.d0 {
        public a() {
        }

        @Override // e.i.j.c0
        public void b(View view) {
            View view2;
            y yVar = y.this;
            if (yVar.p && (view2 = yVar.f1533g) != null) {
                view2.setTranslationY(0.0f);
                y.this.f1530d.setTranslationY(0.0f);
            }
            y.this.f1530d.setVisibility(8);
            y.this.f1530d.setTransitioning(false);
            y yVar2 = y.this;
            yVar2.t = null;
            a.InterfaceC0026a interfaceC0026a = yVar2.f1537k;
            if (interfaceC0026a != null) {
                interfaceC0026a.a(yVar2.f1536j);
                yVar2.f1536j = null;
                yVar2.f1537k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = y.this.c;
            if (actionBarOverlayLayout != null) {
                AtomicInteger atomicInteger = z.a;
                z.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends e.i.j.d0 {
        public b() {
        }

        @Override // e.i.j.c0
        public void b(View view) {
            y yVar = y.this;
            yVar.t = null;
            yVar.f1530d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements e0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends e.b.g.a implements g.a {

        /* renamed from: h  reason: collision with root package name */
        public final Context f1540h;

        /* renamed from: i  reason: collision with root package name */
        public final e.b.g.i.g f1541i;

        /* renamed from: j  reason: collision with root package name */
        public a.InterfaceC0026a f1542j;

        /* renamed from: k  reason: collision with root package name */
        public WeakReference<View> f1543k;

        public d(Context context, a.InterfaceC0026a interfaceC0026a) {
            this.f1540h = context;
            this.f1542j = interfaceC0026a;
            e.b.g.i.g gVar = new e.b.g.i.g(context);
            gVar.f1659l = 1;
            this.f1541i = gVar;
            gVar.f1652e = this;
        }

        @Override // e.b.g.i.g.a
        public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
            a.InterfaceC0026a interfaceC0026a = this.f1542j;
            if (interfaceC0026a != null) {
                return interfaceC0026a.d(this, menuItem);
            }
            return false;
        }

        @Override // e.b.g.i.g.a
        public void b(e.b.g.i.g gVar) {
            if (this.f1542j == null) {
                return;
            }
            i();
            ActionMenuPresenter actionMenuPresenter = y.this.f1532f.f1716i;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.p();
            }
        }

        @Override // e.b.g.a
        public void c() {
            y yVar = y.this;
            if (yVar.f1535i != this) {
                return;
            }
            if (!(!yVar.q)) {
                yVar.f1536j = this;
                yVar.f1537k = this.f1542j;
            } else {
                this.f1542j.a(this);
            }
            this.f1542j = null;
            y.this.t(false);
            ActionBarContextView actionBarContextView = y.this.f1532f;
            if (actionBarContextView.p == null) {
                actionBarContextView.h();
            }
            y yVar2 = y.this;
            yVar2.c.setHideOnContentScrollEnabled(yVar2.v);
            y.this.f1535i = null;
        }

        @Override // e.b.g.a
        public View d() {
            WeakReference<View> weakReference = this.f1543k;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // e.b.g.a
        public Menu e() {
            return this.f1541i;
        }

        @Override // e.b.g.a
        public MenuInflater f() {
            return new e.b.g.f(this.f1540h);
        }

        @Override // e.b.g.a
        public CharSequence g() {
            return y.this.f1532f.getSubtitle();
        }

        @Override // e.b.g.a
        public CharSequence h() {
            return y.this.f1532f.getTitle();
        }

        @Override // e.b.g.a
        public void i() {
            if (y.this.f1535i != this) {
                return;
            }
            this.f1541i.z();
            try {
                this.f1542j.c(this, this.f1541i);
            } finally {
                this.f1541i.y();
            }
        }

        @Override // e.b.g.a
        public boolean j() {
            return y.this.f1532f.x;
        }

        @Override // e.b.g.a
        public void k(View view) {
            y.this.f1532f.setCustomView(view);
            this.f1543k = new WeakReference<>(view);
        }

        @Override // e.b.g.a
        public void l(int i2) {
            y.this.f1532f.setSubtitle(y.this.a.getResources().getString(i2));
        }

        @Override // e.b.g.a
        public void m(CharSequence charSequence) {
            y.this.f1532f.setSubtitle(charSequence);
        }

        @Override // e.b.g.a
        public void n(int i2) {
            o(y.this.a.getResources().getString(i2));
        }

        @Override // e.b.g.a
        public void o(CharSequence charSequence) {
            y.this.f1532f.setTitle(charSequence);
        }

        @Override // e.b.g.a
        public void p(boolean z) {
            this.f1578g = z;
            y.this.f1532f.setTitleOptional(z);
        }
    }

    public y(Activity activity, boolean z2) {
        new ArrayList();
        this.f1539m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z2) {
            return;
        }
        this.f1533g = decorView.findViewById(16908290);
    }

    @Override // e.b.c.a
    public boolean b() {
        d0 d0Var = this.f1531e;
        if (d0Var == null || !d0Var.j()) {
            return false;
        }
        this.f1531e.collapseActionView();
        return true;
    }

    @Override // e.b.c.a
    public void c(boolean z2) {
        if (z2 == this.f1538l) {
            return;
        }
        this.f1538l = z2;
        int size = this.f1539m.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1539m.get(i2).a(z2);
        }
    }

    @Override // e.b.c.a
    public int d() {
        return this.f1531e.t();
    }

    @Override // e.b.c.a
    public Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // e.b.c.a
    public void g(Configuration configuration) {
        v(this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // e.b.c.a
    public boolean i(int i2, KeyEvent keyEvent) {
        e.b.g.i.g gVar;
        d dVar = this.f1535i;
        if (dVar == null || (gVar = dVar.f1541i) == null) {
            return false;
        }
        gVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return gVar.performShortcut(i2, keyEvent, 0);
    }

    @Override // e.b.c.a
    public void l(boolean z2) {
        if (this.f1534h) {
            return;
        }
        m(z2);
    }

    @Override // e.b.c.a
    public void m(boolean z2) {
        int i2 = z2 ? 4 : 0;
        int t = this.f1531e.t();
        this.f1534h = true;
        this.f1531e.k((i2 & 4) | ((-5) & t));
    }

    @Override // e.b.c.a
    public void n(int i2) {
        this.f1531e.u(i2);
    }

    @Override // e.b.c.a
    public void o(Drawable drawable) {
        this.f1531e.x(drawable);
    }

    @Override // e.b.c.a
    public void p(boolean z2) {
        e.b.g.g gVar;
        this.u = z2;
        if (z2 || (gVar = this.t) == null) {
            return;
        }
        gVar.a();
    }

    @Override // e.b.c.a
    public void q(CharSequence charSequence) {
        this.f1531e.setTitle(charSequence);
    }

    @Override // e.b.c.a
    public void r(CharSequence charSequence) {
        this.f1531e.setWindowTitle(charSequence);
    }

    @Override // e.b.c.a
    public e.b.g.a s(a.InterfaceC0026a interfaceC0026a) {
        d dVar = this.f1535i;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f1532f.h();
        d dVar2 = new d(this.f1532f.getContext(), interfaceC0026a);
        dVar2.f1541i.z();
        try {
            if (dVar2.f1542j.b(dVar2, dVar2.f1541i)) {
                this.f1535i = dVar2;
                dVar2.i();
                this.f1532f.f(dVar2);
                t(true);
                return dVar2;
            }
            return null;
        } finally {
            dVar2.f1541i.y();
        }
    }

    public void t(boolean z2) {
        b0 o;
        b0 e2;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        ActionBarContainer actionBarContainer = this.f1530d;
        AtomicInteger atomicInteger = z.a;
        if (!z.g.c(actionBarContainer)) {
            if (z2) {
                this.f1531e.q(4);
                this.f1532f.setVisibility(0);
                return;
            }
            this.f1531e.q(0);
            this.f1532f.setVisibility(8);
            return;
        }
        if (z2) {
            e2 = this.f1531e.o(4, 100L);
            o = this.f1532f.e(0, 200L);
        } else {
            o = this.f1531e.o(0, 200L);
            e2 = this.f1532f.e(8, 100L);
        }
        e.b.g.g gVar = new e.b.g.g();
        gVar.a.add(e2);
        View view = e2.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = o.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.a.add(o);
        gVar.b();
    }

    public final void u(View view) {
        d0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof d0) {
            wrapper = (d0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder A2 = f.a.b.a.a.A("Can't make a decor toolbar out of ");
            A2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(A2.toString());
        }
        this.f1531e = wrapper;
        this.f1532f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1530d = actionBarContainer;
        d0 d0Var = this.f1531e;
        if (d0Var != null && this.f1532f != null && actionBarContainer != null) {
            this.a = d0Var.getContext();
            boolean z2 = (this.f1531e.t() & 4) != 0;
            if (z2) {
                this.f1534h = true;
            }
            Context context = this.a;
            this.f1531e.s((context.getApplicationInfo().targetSdkVersion < 14) || z2);
            v(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, e.b.b.a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.f137m) {
                    this.v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f1530d;
                AtomicInteger atomicInteger = z.a;
                z.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(y.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    public final void v(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.f1531e.i(null);
            this.f1530d.setTabContainer(null);
        } else {
            this.f1530d.setTabContainer(null);
            this.f1531e.i(null);
        }
        boolean z3 = true;
        boolean z4 = this.f1531e.n() == 2;
        this.f1531e.y(!this.n && z4);
        this.c.setHasNonEmbeddedTabs((this.n || !z4) ? false : false);
    }

    public final void w(boolean z2) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (this.r || !this.q) {
            if (this.s) {
                return;
            }
            this.s = true;
            e.b.g.g gVar = this.t;
            if (gVar != null) {
                gVar.a();
            }
            this.f1530d.setVisibility(0);
            if (this.o == 0 && (this.u || z2)) {
                this.f1530d.setTranslationY(0.0f);
                float f2 = -this.f1530d.getHeight();
                if (z2) {
                    this.f1530d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr2[1];
                }
                this.f1530d.setTranslationY(f2);
                e.b.g.g gVar2 = new e.b.g.g();
                b0 b2 = z.b(this.f1530d);
                b2.g(0.0f);
                b2.f(this.y);
                if (!gVar2.f1602e) {
                    gVar2.a.add(b2);
                }
                if (this.p && (view3 = this.f1533g) != null) {
                    view3.setTranslationY(f2);
                    b0 b3 = z.b(this.f1533g);
                    b3.g(0.0f);
                    if (!gVar2.f1602e) {
                        gVar2.a.add(b3);
                    }
                }
                Interpolator interpolator = A;
                boolean z3 = gVar2.f1602e;
                if (!z3) {
                    gVar2.c = interpolator;
                }
                if (!z3) {
                    gVar2.b = 250L;
                }
                c0 c0Var = this.x;
                if (!z3) {
                    gVar2.f1601d = c0Var;
                }
                this.t = gVar2;
                gVar2.b();
            } else {
                this.f1530d.setAlpha(1.0f);
                this.f1530d.setTranslationY(0.0f);
                if (this.p && (view2 = this.f1533g) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.x.b(null);
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                AtomicInteger atomicInteger = z.a;
                z.h.c(actionBarOverlayLayout);
            }
        } else if (this.s) {
            this.s = false;
            e.b.g.g gVar3 = this.t;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.o == 0 && (this.u || z2)) {
                this.f1530d.setAlpha(1.0f);
                this.f1530d.setTransitioning(true);
                e.b.g.g gVar4 = new e.b.g.g();
                float f3 = -this.f1530d.getHeight();
                if (z2) {
                    this.f1530d.getLocationInWindow(new int[]{0, 0});
                    f3 -= iArr[1];
                }
                b0 b4 = z.b(this.f1530d);
                b4.g(f3);
                b4.f(this.y);
                if (!gVar4.f1602e) {
                    gVar4.a.add(b4);
                }
                if (this.p && (view = this.f1533g) != null) {
                    b0 b5 = z.b(view);
                    b5.g(f3);
                    if (!gVar4.f1602e) {
                        gVar4.a.add(b5);
                    }
                }
                Interpolator interpolator2 = z;
                boolean z4 = gVar4.f1602e;
                if (!z4) {
                    gVar4.c = interpolator2;
                }
                if (!z4) {
                    gVar4.b = 250L;
                }
                c0 c0Var2 = this.w;
                if (!z4) {
                    gVar4.f1601d = c0Var2;
                }
                this.t = gVar4;
                gVar4.b();
                return;
            }
            this.w.b(null);
        }
    }

    public y(Dialog dialog) {
        new ArrayList();
        this.f1539m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        u(dialog.getWindow().getDecorView());
    }
}

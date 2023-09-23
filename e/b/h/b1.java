package e.b.h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.video_converter.video_compressor.R;
import e.b.g.i.g;
import e.b.g.i.m;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class b1 implements d0 {
    public Toolbar a;
    public int b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View f1724d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1725e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1726f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1727g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1728h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1729i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1730j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1731k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1732l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1733m;
    public ActionMenuPresenter n;
    public int o;
    public Drawable p;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    public class a extends e.i.j.d0 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i2) {
            this.b = i2;
        }

        @Override // e.i.j.d0, e.i.j.c0
        public void a(View view) {
            this.a = true;
        }

        @Override // e.i.j.c0
        public void b(View view) {
            if (this.a) {
                return;
            }
            b1.this.a.setVisibility(this.b);
        }

        @Override // e.i.j.d0, e.i.j.c0
        public void c(View view) {
            b1.this.a.setVisibility(0);
        }
    }

    public b1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.o = 0;
        this.a = toolbar;
        this.f1729i = toolbar.getTitle();
        this.f1730j = toolbar.getSubtitle();
        this.f1728h = this.f1729i != null;
        this.f1727g = toolbar.getNavigationIcon();
        z0 q = z0.q(toolbar.getContext(), null, e.b.b.a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.p = q.g(15);
        if (z) {
            CharSequence n = q.n(27);
            if (!TextUtils.isEmpty(n)) {
                setTitle(n);
            }
            CharSequence n2 = q.n(25);
            if (!TextUtils.isEmpty(n2)) {
                this.f1730j = n2;
                if ((this.b & 8) != 0) {
                    this.a.setSubtitle(n2);
                }
            }
            Drawable g2 = q.g(20);
            if (g2 != null) {
                this.f1726f = g2;
                C();
            }
            Drawable g3 = q.g(17);
            if (g3 != null) {
                this.f1725e = g3;
                C();
            }
            if (this.f1727g == null && (drawable = this.p) != null) {
                this.f1727g = drawable;
                B();
            }
            k(q.j(10, 0));
            int l2 = q.l(9, 0);
            if (l2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(l2, (ViewGroup) this.a, false);
                View view = this.f1724d;
                if (view != null && (this.b & 16) != 0) {
                    this.a.removeView(view);
                }
                this.f1724d = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    this.a.addView(inflate);
                }
                k(this.b | 16);
            }
            int k2 = q.k(13, 0);
            if (k2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = k2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = q.e(7, -1);
            int e3 = q.e(3, -1);
            if (e2 >= 0 || e3 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(e2, 0);
                int max2 = Math.max(e3, 0);
                toolbar2.d();
                toolbar2.y.a(max, max2);
            }
            int l3 = q.l(28, 0);
            if (l3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.q = l3;
                TextView textView = toolbar3.f232g;
                if (textView != null) {
                    textView.setTextAppearance(context, l3);
                }
            }
            int l4 = q.l(26, 0);
            if (l4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.r = l4;
                TextView textView2 = toolbar4.f233h;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l4);
                }
            }
            int l5 = q.l(22, 0);
            if (l5 != 0) {
                this.a.setPopupTheme(l5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        q.b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                u(this.o);
            }
        }
        this.f1731k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a1(this));
    }

    public final void A() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1731k)) {
                this.a.setNavigationContentDescription(this.o);
            } else {
                this.a.setNavigationContentDescription(this.f1731k);
            }
        }
    }

    public final void B() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.f1727g;
            if (drawable == null) {
                drawable = this.p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    public final void C() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1726f;
            if (drawable == null) {
                drawable = this.f1725e;
            }
        } else {
            drawable = this.f1725e;
        }
        this.a.setLogo(drawable);
    }

    @Override // e.b.h.d0
    public void a(Menu menu, m.a aVar) {
        e.b.g.i.i iVar;
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.n = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.n;
        actionMenuPresenter2.f1619j = aVar;
        Toolbar toolbar = this.a;
        e.b.g.i.g gVar = (e.b.g.i.g) menu;
        if (gVar == null && toolbar.f231f == null) {
            return;
        }
        toolbar.f();
        e.b.g.i.g gVar2 = toolbar.f231f.u;
        if (gVar2 == gVar) {
            return;
        }
        if (gVar2 != null) {
            gVar2.u(toolbar.Q);
            gVar2.u(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new Toolbar.d();
        }
        actionMenuPresenter2.w = true;
        if (gVar != null) {
            gVar.b(actionMenuPresenter2, toolbar.o);
            gVar.b(toolbar.R, toolbar.o);
        } else {
            actionMenuPresenter2.i(toolbar.o, null);
            Toolbar.d dVar = toolbar.R;
            e.b.g.i.g gVar3 = dVar.f243f;
            if (gVar3 != null && (iVar = dVar.f244g) != null) {
                gVar3.d(iVar);
            }
            dVar.f243f = null;
            actionMenuPresenter2.c(true);
            toolbar.R.c(true);
        }
        toolbar.f231f.setPopupTheme(toolbar.p);
        toolbar.f231f.setPresenter(actionMenuPresenter2);
        toolbar.Q = actionMenuPresenter2;
    }

    @Override // e.b.h.d0
    public boolean b() {
        return this.a.q();
    }

    @Override // e.b.h.d0
    public void c() {
        this.f1733m = true;
    }

    @Override // e.b.h.d0
    public void collapseActionView() {
        Toolbar.d dVar = this.a.R;
        e.b.g.i.i iVar = dVar == null ? null : dVar.f244g;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // e.b.h.d0
    public boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f231f) != null && actionMenuView.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // e.b.h.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f231f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.y
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.ActionMenuPresenter$c r3 = r0.B
            if (r3 != 0) goto L19
            boolean r0 = r0.o()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.b1.e():boolean");
    }

    @Override // e.b.h.d0
    public boolean f() {
        ActionMenuView actionMenuView = this.a.f231f;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.y;
            return actionMenuPresenter != null && actionMenuPresenter.k();
        }
        return false;
    }

    @Override // e.b.h.d0
    public boolean g() {
        return this.a.w();
    }

    @Override // e.b.h.d0
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // e.b.h.d0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // e.b.h.d0
    public void h() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.f231f;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.y) == null) {
            return;
        }
        actionMenuPresenter.a();
    }

    @Override // e.b.h.d0
    public void i(s0 s0Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = null;
    }

    @Override // e.b.h.d0
    public boolean j() {
        Toolbar.d dVar = this.a.R;
        return (dVar == null || dVar.f244g == null) ? false : true;
    }

    @Override // e.b.h.d0
    public void k(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    A();
                }
                B();
            }
            if ((i3 & 3) != 0) {
                C();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f1729i);
                    this.a.setSubtitle(this.f1730j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f1724d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // e.b.h.d0
    public Menu l() {
        return this.a.getMenu();
    }

    @Override // e.b.h.d0
    public void m(int i2) {
        this.f1726f = i2 != 0 ? e.b.a.b(getContext(), i2) : null;
        C();
    }

    @Override // e.b.h.d0
    public int n() {
        return 0;
    }

    @Override // e.b.h.d0
    public e.i.j.b0 o(int i2, long j2) {
        e.i.j.b0 b = e.i.j.z.b(this.a);
        b.a(i2 == 0 ? 1.0f : 0.0f);
        b.c(j2);
        a aVar = new a(i2);
        View view = b.a.get();
        if (view != null) {
            b.e(view, aVar);
        }
        return b;
    }

    @Override // e.b.h.d0
    public void p(m.a aVar, g.a aVar2) {
        Toolbar toolbar = this.a;
        toolbar.S = aVar;
        toolbar.T = aVar2;
        ActionMenuView actionMenuView = toolbar.f231f;
        if (actionMenuView != null) {
            actionMenuView.z = aVar;
            actionMenuView.A = aVar2;
        }
    }

    @Override // e.b.h.d0
    public void q(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // e.b.h.d0
    public ViewGroup r() {
        return this.a;
    }

    @Override // e.b.h.d0
    public void s(boolean z) {
    }

    @Override // e.b.h.d0
    public void setIcon(int i2) {
        this.f1725e = i2 != 0 ? e.b.a.b(getContext(), i2) : null;
        C();
    }

    @Override // e.b.h.d0
    public void setTitle(CharSequence charSequence) {
        this.f1728h = true;
        z(charSequence);
    }

    @Override // e.b.h.d0
    public void setWindowCallback(Window.Callback callback) {
        this.f1732l = callback;
    }

    @Override // e.b.h.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1728h) {
            return;
        }
        z(charSequence);
    }

    @Override // e.b.h.d0
    public int t() {
        return this.b;
    }

    @Override // e.b.h.d0
    public void u(int i2) {
        this.f1731k = i2 == 0 ? null : getContext().getString(i2);
        A();
    }

    @Override // e.b.h.d0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // e.b.h.d0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // e.b.h.d0
    public void x(Drawable drawable) {
        this.f1727g = drawable;
        B();
    }

    @Override // e.b.h.d0
    public void y(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void z(CharSequence charSequence) {
        this.f1729i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.f1728h) {
                e.i.j.z.x(this.a.getRootView(), charSequence);
            }
        }
    }

    @Override // e.b.h.d0
    public void setIcon(Drawable drawable) {
        this.f1725e = drawable;
        C();
    }
}

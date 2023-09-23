package e.b.g.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.video_converter.video_compressor.R;
import e.b.g.i.m;
import e.b.h.k0;
import e.b.h.l0;
import e.i.j.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public m.a C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;

    /* renamed from: g  reason: collision with root package name */
    public final Context f1623g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1624h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1625i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1626j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1627k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f1628l;
    public View t;
    public View u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    /* renamed from: m  reason: collision with root package name */
    public final List<g> f1629m = new ArrayList();
    public final List<C0027d> n = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener o = new a();
    public final View.OnAttachStateChangeListener p = new b();
    public final k0 q = new c();
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.n.size() <= 0 || d.this.n.get(0).a.D) {
                return;
            }
            View view = d.this.u;
            if (view != null && view.isShown()) {
                for (C0027d c0027d : d.this.n) {
                    c0027d.a.h();
                }
                return;
            }
            d.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.D = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.D.removeGlobalOnLayoutListener(dVar.o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements k0 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ C0027d f1633f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ MenuItem f1634g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ g f1635h;

            public a(C0027d c0027d, MenuItem menuItem, g gVar) {
                this.f1633f = c0027d;
                this.f1634g = menuItem;
                this.f1635h = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0027d c0027d = this.f1633f;
                if (c0027d != null) {
                    d.this.F = true;
                    c0027d.b.c(false);
                    d.this.F = false;
                }
                if (this.f1634g.isEnabled() && this.f1634g.hasSubMenu()) {
                    this.f1635h.r(this.f1634g, 4);
                }
            }
        }

        public c() {
        }

        @Override // e.b.h.k0
        public void c(g gVar, MenuItem menuItem) {
            d.this.f1628l.removeCallbacksAndMessages(null);
            int size = d.this.n.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.n.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            d.this.f1628l.postAtTime(new a(i3 < d.this.n.size() ? d.this.n.get(i3) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // e.b.h.k0
        public void f(g gVar, MenuItem menuItem) {
            d.this.f1628l.removeCallbacksAndMessages(gVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: e.b.g.i.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0027d {
        public final l0 a;
        public final g b;
        public final int c;

        public C0027d(l0 l0Var, g gVar, int i2) {
            this.a = l0Var;
            this.b = gVar;
            this.c = i2;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
        this.f1623g = context;
        this.t = view;
        this.f1625i = i2;
        this.f1626j = i3;
        this.f1627k = z;
        AtomicInteger atomicInteger = z.a;
        this.v = z.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1624h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1628l = new Handler();
    }

    @Override // e.b.g.i.p
    public boolean a() {
        return this.n.size() > 0 && this.n.get(0).a.a();
    }

    @Override // e.b.g.i.m
    public void b(g gVar, boolean z) {
        int size = this.n.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (gVar == this.n.get(i2).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.n.size()) {
            this.n.get(i3).b.c(false);
        }
        C0027d remove = this.n.remove(i2);
        remove.b.u(this);
        if (this.F) {
            l0 l0Var = remove.a;
            Objects.requireNonNull(l0Var);
            if (Build.VERSION.SDK_INT >= 23) {
                l0Var.E.setExitTransition(null);
            }
            remove.a.E.setAnimationStyle(0);
        }
        remove.a.dismiss();
        int size2 = this.n.size();
        if (size2 > 0) {
            this.v = this.n.get(size2 - 1).c;
        } else {
            View view = this.t;
            AtomicInteger atomicInteger = z.a;
            this.v = z.e.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.n.get(0).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.C;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.o);
            }
            this.D = null;
        }
        this.u.removeOnAttachStateChangeListener(this.p);
        this.E.onDismiss();
    }

    @Override // e.b.g.i.m
    public void c(boolean z) {
        for (C0027d c0027d : this.n) {
            ListAdapter adapter = c0027d.a.f1799h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // e.b.g.i.m
    public boolean d() {
        return false;
    }

    @Override // e.b.g.i.p
    public void dismiss() {
        int size = this.n.size();
        if (size > 0) {
            C0027d[] c0027dArr = (C0027d[]) this.n.toArray(new C0027d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0027d c0027d = c0027dArr[i2];
                if (c0027d.a.a()) {
                    c0027d.a.dismiss();
                }
            }
        }
    }

    @Override // e.b.g.i.m
    public void g(m.a aVar) {
        this.C = aVar;
    }

    @Override // e.b.g.i.p
    public void h() {
        if (a()) {
            return;
        }
        for (g gVar : this.f1629m) {
            y(gVar);
        }
        this.f1629m.clear();
        View view = this.t;
        this.u = view;
        if (view != null) {
            boolean z = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.o);
            }
            this.u.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override // e.b.g.i.m
    public void j(Parcelable parcelable) {
    }

    @Override // e.b.g.i.p
    public ListView k() {
        if (this.n.isEmpty()) {
            return null;
        }
        List<C0027d> list = this.n;
        return list.get(list.size() - 1).a.f1799h;
    }

    @Override // e.b.g.i.m
    public boolean l(r rVar) {
        for (C0027d c0027d : this.n) {
            if (rVar == c0027d.b) {
                c0027d.a.f1799h.requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            rVar.b(this, this.f1623g);
            if (a()) {
                y(rVar);
            } else {
                this.f1629m.add(rVar);
            }
            m.a aVar = this.C;
            if (aVar != null) {
                aVar.c(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // e.b.g.i.m
    public Parcelable m() {
        return null;
    }

    @Override // e.b.g.i.k
    public void n(g gVar) {
        gVar.b(this, this.f1623g);
        if (a()) {
            y(gVar);
        } else {
            this.f1629m.add(gVar);
        }
    }

    @Override // e.b.g.i.k
    public boolean o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0027d c0027d;
        int size = this.n.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0027d = null;
                break;
            }
            c0027d = this.n.get(i2);
            if (!c0027d.a.a()) {
                break;
            }
            i2++;
        }
        if (c0027d != null) {
            c0027d.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // e.b.g.i.k
    public void q(View view) {
        if (this.t != view) {
            this.t = view;
            int i2 = this.r;
            AtomicInteger atomicInteger = z.a;
            this.s = Gravity.getAbsoluteGravity(i2, z.e.d(view));
        }
    }

    @Override // e.b.g.i.k
    public void r(boolean z) {
        this.A = z;
    }

    @Override // e.b.g.i.k
    public void s(int i2) {
        if (this.r != i2) {
            this.r = i2;
            View view = this.t;
            AtomicInteger atomicInteger = z.a;
            this.s = Gravity.getAbsoluteGravity(i2, z.e.d(view));
        }
    }

    @Override // e.b.g.i.k
    public void t(int i2) {
        this.w = true;
        this.y = i2;
    }

    @Override // e.b.g.i.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // e.b.g.i.k
    public void v(boolean z) {
        this.B = z;
    }

    @Override // e.b.g.i.k
    public void w(int i2) {
        this.x = true;
        this.z = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(e.b.g.i.g r17) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.d.y(e.b.g.i.g):void");
    }
}

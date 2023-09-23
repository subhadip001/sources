package e.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import e.b.c.a;
import e.b.c.n;
import e.b.g.i.g;
import e.b.g.i.m;
import e.b.h.b1;
import e.b.h.d0;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public class v extends e.b.c.a {
    public final d0 a;
    public final Window.Callback b;
    public final n.c c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1518d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1519e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1520f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<a.b> f1521g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f1522h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Toolbar.f f1523i;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = v.this;
            Menu t = vVar.t();
            e.b.g.i.g gVar = t instanceof e.b.g.i.g ? (e.b.g.i.g) t : null;
            if (gVar != null) {
                gVar.z();
            }
            try {
                t.clear();
                if (!vVar.b.onCreatePanelMenu(0, t) || !vVar.b.onPreparePanel(0, null, t)) {
                    t.clear();
                }
            } finally {
                if (gVar != null) {
                    gVar.y();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class b implements Toolbar.f {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: f  reason: collision with root package name */
        public boolean f1525f;

        public c() {
        }

        @Override // e.b.g.i.m.a
        public void b(e.b.g.i.g gVar, boolean z) {
            if (this.f1525f) {
                return;
            }
            this.f1525f = true;
            v.this.a.h();
            v.this.b.onPanelClosed(108, gVar);
            this.f1525f = false;
        }

        @Override // e.b.g.i.m.a
        public boolean c(e.b.g.i.g gVar) {
            v.this.b.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        public d() {
        }

        @Override // e.b.g.i.g.a
        public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // e.b.g.i.g.a
        public void b(e.b.g.i.g gVar) {
            if (v.this.a.b()) {
                v.this.b.onPanelClosed(108, gVar);
            } else if (v.this.b.onPreparePanel(0, null, gVar)) {
                v.this.b.onMenuOpened(108, gVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class e implements n.c {
        public e() {
        }
    }

    public v(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f1523i = bVar;
        b1 b1Var = new b1(toolbar, false);
        this.a = b1Var;
        Objects.requireNonNull(callback);
        this.b = callback;
        b1Var.f1732l = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!b1Var.f1728h) {
            b1Var.z(charSequence);
        }
        this.c = new e();
    }

    @Override // e.b.c.a
    public boolean a() {
        return this.a.f();
    }

    @Override // e.b.c.a
    public boolean b() {
        if (this.a.j()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // e.b.c.a
    public void c(boolean z) {
        if (z == this.f1520f) {
            return;
        }
        this.f1520f = z;
        int size = this.f1521g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1521g.get(i2).a(z);
        }
    }

    @Override // e.b.c.a
    public int d() {
        return this.a.t();
    }

    @Override // e.b.c.a
    public Context e() {
        return this.a.getContext();
    }

    @Override // e.b.c.a
    public boolean f() {
        this.a.r().removeCallbacks(this.f1522h);
        ViewGroup r = this.a.r();
        Runnable runnable = this.f1522h;
        AtomicInteger atomicInteger = z.a;
        z.d.m(r, runnable);
        return true;
    }

    @Override // e.b.c.a
    public void g(Configuration configuration) {
    }

    @Override // e.b.c.a
    public void h() {
        this.a.r().removeCallbacks(this.f1522h);
    }

    @Override // e.b.c.a
    public boolean i(int i2, KeyEvent keyEvent) {
        Menu t = t();
        if (t != null) {
            t.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return t.performShortcut(i2, keyEvent, 0);
        }
        return false;
    }

    @Override // e.b.c.a
    public boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.a.g();
        }
        return true;
    }

    @Override // e.b.c.a
    public boolean k() {
        return this.a.g();
    }

    @Override // e.b.c.a
    public void l(boolean z) {
    }

    @Override // e.b.c.a
    public void m(boolean z) {
        this.a.k(((z ? 4 : 0) & 4) | ((-5) & this.a.t()));
    }

    @Override // e.b.c.a
    public void n(int i2) {
        this.a.u(i2);
    }

    @Override // e.b.c.a
    public void o(Drawable drawable) {
        this.a.x(drawable);
    }

    @Override // e.b.c.a
    public void p(boolean z) {
    }

    @Override // e.b.c.a
    public void q(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // e.b.c.a
    public void r(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu t() {
        if (!this.f1519e) {
            this.a.p(new c(), new d());
            this.f1519e = true;
        }
        return this.a.l();
    }
}

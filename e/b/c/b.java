package e.b.c;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: ActionBarDrawerToggle.java */
/* loaded from: classes.dex */
public class b implements DrawerLayout.d {
    public final a a;
    public final DrawerLayout b;
    public e.b.d.a.d c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1468d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1469e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1470f = false;

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        Context b();

        void c(Drawable drawable, int i2);

        Drawable d();

        void e(int i2);
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: e.b.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0023b {
        a f();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public static class c implements a {
        public final Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        @Override // e.b.c.b.a
        public boolean a() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // e.b.c.b.a
        public Context b() {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.a;
        }

        @Override // e.b.c.b.a
        public void c(Drawable drawable, int i2) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i2);
            }
        }

        @Override // e.b.c.b.a
        public Drawable d() {
            Context context;
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.a;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // e.b.c.b.a
        public void e(int i2) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i2);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, int i2, int i3) {
        if (activity instanceof InterfaceC0023b) {
            this.a = ((InterfaceC0023b) activity).f();
        } else {
            this.a = new c(activity);
        }
        this.b = drawerLayout;
        this.f1468d = i2;
        this.f1469e = i3;
        this.c = new e.b.d.a.d(this.a.b());
        this.a.d();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(View view) {
        e(1.0f);
        this.a.e(this.f1469e);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view) {
        e(0.0f);
        this.a.e(this.f1468d);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(int i2) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view, float f2) {
        e(Math.min(1.0f, Math.max(0.0f, f2)));
    }

    public final void e(float f2) {
        if (f2 == 1.0f) {
            e.b.d.a.d dVar = this.c;
            if (!dVar.f1572i) {
                dVar.f1572i = true;
                dVar.invalidateSelf();
            }
        } else if (f2 == 0.0f) {
            e.b.d.a.d dVar2 = this.c;
            if (dVar2.f1572i) {
                dVar2.f1572i = false;
                dVar2.invalidateSelf();
            }
        }
        e.b.d.a.d dVar3 = this.c;
        if (dVar3.f1573j != f2) {
            dVar3.f1573j = f2;
            dVar3.invalidateSelf();
        }
    }
}

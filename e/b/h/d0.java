package e.b.h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import e.b.g.i.g;
import e.b.g.i.m;

/* compiled from: DecorToolbar.java */
/* loaded from: classes.dex */
public interface d0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(s0 s0Var);

    boolean j();

    void k(int i2);

    Menu l();

    void m(int i2);

    int n();

    e.i.j.b0 o(int i2, long j2);

    void p(m.a aVar, g.a aVar2);

    void q(int i2);

    ViewGroup r();

    void s(boolean z);

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    void u(int i2);

    void v();

    void w();

    void x(Drawable drawable);

    void y(boolean z);
}

package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public class e {
    public final View a;

    /* renamed from: d  reason: collision with root package name */
    public x0 f1752d;

    /* renamed from: e  reason: collision with root package name */
    public x0 f1753e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f1754f;
    public int c = -1;
    public final i b = i.a();

    public e(View view) {
        this.a = view;
    }

    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 ? i2 == 21 : this.f1752d != null) {
                if (this.f1754f == null) {
                    this.f1754f = new x0();
                }
                x0 x0Var = this.f1754f;
                x0Var.a = null;
                x0Var.f1856d = false;
                x0Var.b = null;
                x0Var.c = false;
                View view = this.a;
                AtomicInteger atomicInteger = e.i.j.z.a;
                ColorStateList g2 = z.i.g(view);
                if (g2 != null) {
                    x0Var.f1856d = true;
                    x0Var.a = g2;
                }
                PorterDuff.Mode h2 = z.i.h(this.a);
                if (h2 != null) {
                    x0Var.c = true;
                    x0Var.b = h2;
                }
                if (x0Var.f1856d || x0Var.c) {
                    i.f(background, x0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            x0 x0Var2 = this.f1753e;
            if (x0Var2 != null) {
                i.f(background, x0Var2, this.a.getDrawableState());
                return;
            }
            x0 x0Var3 = this.f1752d;
            if (x0Var3 != null) {
                i.f(background, x0Var3, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        x0 x0Var = this.f1753e;
        if (x0Var != null) {
            return x0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        x0 x0Var = this.f1753e;
        if (x0Var != null) {
            return x0Var.b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = e.b.b.B;
        boolean z = false;
        z0 q = z0.q(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        e.i.j.z.v(view, view.getContext(), iArr, attributeSet, q.b, i2, 0);
        try {
            if (q.o(0)) {
                this.c = q.l(0, -1);
                ColorStateList d2 = this.b.d(this.a.getContext(), this.c);
                if (d2 != null) {
                    g(d2);
                }
            }
            if (q.o(1)) {
                e.i.j.z.y(this.a, q.c(1));
            }
            if (q.o(2)) {
                View view2 = this.a;
                PorterDuff.Mode e2 = e0.e(q.j(2, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                z.i.r(view2, e2);
                if (i3 == 21) {
                    Drawable background = view2.getBackground();
                    z = (z.i.g(view2) == null && z.i.h(view2) == null) ? true : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        z.d.q(view2, background);
                    }
                }
            }
            q.b.recycle();
        } catch (Throwable th) {
            q.b.recycle();
            throw th;
        }
    }

    public void e() {
        this.c = -1;
        g(null);
        a();
    }

    public void f(int i2) {
        this.c = i2;
        i iVar = this.b;
        g(iVar != null ? iVar.d(this.a.getContext(), i2) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1752d == null) {
                this.f1752d = new x0();
            }
            x0 x0Var = this.f1752d;
            x0Var.a = colorStateList;
            x0Var.f1856d = true;
        } else {
            this.f1752d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f1753e == null) {
            this.f1753e = new x0();
        }
        x0 x0Var = this.f1753e;
        x0Var.a = colorStateList;
        x0Var.f1856d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f1753e == null) {
            this.f1753e = new x0();
        }
        x0 x0Var = this.f1753e;
        x0Var.b = mode;
        x0Var.c = true;
        a();
    }
}

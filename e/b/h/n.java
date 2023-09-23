package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class n {
    public final ImageView a;
    public x0 b;
    public x0 c;

    /* renamed from: d  reason: collision with root package name */
    public int f1812d = 0;

    public n(ImageView imageView) {
        this.a = imageView;
    }

    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 && i2 == 21) {
                if (this.c == null) {
                    this.c = new x0();
                }
                x0 x0Var = this.c;
                x0Var.a = null;
                x0Var.f1856d = false;
                x0Var.b = null;
                x0Var.c = false;
                ColorStateList imageTintList = this.a.getImageTintList();
                if (imageTintList != null) {
                    x0Var.f1856d = true;
                    x0Var.a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.a.getImageTintMode();
                if (imageTintMode != null) {
                    x0Var.c = true;
                    x0Var.b = imageTintMode;
                }
                if (x0Var.f1856d || x0Var.c) {
                    i.f(drawable, x0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            x0 x0Var2 = this.b;
            if (x0Var2 != null) {
                i.f(drawable, x0Var2, this.a.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        int l2;
        Context context = this.a.getContext();
        int[] iArr = e.b.b.f1460f;
        z0 q = z0.q(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        e.i.j.z.v(imageView, imageView.getContext(), iArr, attributeSet, q.b, i2, 0);
        try {
            Drawable drawable3 = this.a.getDrawable();
            if (drawable3 == null && (l2 = q.l(1, -1)) != -1 && (drawable3 = e.b.a.b(this.a.getContext(), l2)) != null) {
                this.a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                e0.b(drawable3);
            }
            if (q.o(2)) {
                ImageView imageView2 = this.a;
                ColorStateList c = q.c(2);
                int i3 = Build.VERSION.SDK_INT;
                imageView2.setImageTintList(c);
                if (i3 == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (q.o(3)) {
                ImageView imageView3 = this.a;
                PorterDuff.Mode e2 = e0.e(q.j(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                imageView3.setImageTintMode(e2);
                if (i4 == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
            q.b.recycle();
        } catch (Throwable th) {
            q.b.recycle();
            throw th;
        }
    }

    public void c(int i2) {
        if (i2 != 0) {
            Drawable b = e.b.a.b(this.a.getContext(), i2);
            if (b != null) {
                e0.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new x0();
        }
        x0 x0Var = this.b;
        x0Var.a = colorStateList;
        x0Var.f1856d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new x0();
        }
        x0 x0Var = this.b;
        x0Var.b = mode;
        x0Var.c = true;
        a();
    }
}

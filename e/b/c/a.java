package e.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import e.b.g.a;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g(Configuration configuration);

    public void h() {
    }

    public abstract boolean i(int i2, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(int i2);

    public abstract void o(Drawable drawable);

    public abstract void p(boolean z);

    public abstract void q(CharSequence charSequence);

    public abstract void r(CharSequence charSequence);

    public e.b.g.a s(a.InterfaceC0026a interfaceC0026a) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: e.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0022a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0022a(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.a = 8388627;
        }

        public C0022a(C0022a c0022a) {
            super((ViewGroup.MarginLayoutParams) c0022a);
            this.a = 0;
            this.a = c0022a.a;
        }

        public C0022a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}

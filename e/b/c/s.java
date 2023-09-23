package e.b.c;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import e.b.g.a;
import e.i.j.i;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class s extends Dialog implements l {

    /* renamed from: f  reason: collision with root package name */
    public m f1506f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a f1507g;

    /* compiled from: AppCompatDialog.java */
    /* loaded from: classes.dex */
    public class a implements i.a {
        public a() {
        }

        @Override // e.i.j.i.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return s.this.b(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968917(0x7f040155, float:1.7546501E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            e.b.c.s$a r2 = new e.b.c.s$a
            r2.<init>()
            r4.f1507g = r2
            e.b.c.m r2 = r4.a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.B(r6)
            r5 = 0
            r2.n(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.s.<init>(android.content.Context, int):void");
    }

    public m a() {
        if (this.f1506f == null) {
            int i2 = m.f1480f;
            this.f1506f = new n(getContext(), getWindow(), this, this);
        }
        return this.f1506f;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean c(int i2) {
        return a().v(i2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.i.j.i.b(this.f1507g, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // e.b.c.l
    public void e(e.b.g.a aVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().f(i2);
    }

    @Override // e.b.c.l
    public void i(e.b.g.a aVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().l();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().k();
        super.onCreate(bundle);
        a().n(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().t();
    }

    @Override // e.b.c.l
    public e.b.g.a r(a.InterfaceC0026a interfaceC0026a) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().w(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().C(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().x(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().y(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().C(getContext().getString(i2));
    }
}

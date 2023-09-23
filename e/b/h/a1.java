package e.b.h;

import android.view.View;
import android.view.Window;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class a1 implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final e.b.g.i.a f1711f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b1 f1712g;

    public a1(b1 b1Var) {
        this.f1712g = b1Var;
        this.f1711f = new e.b.g.i.a(b1Var.a.getContext(), 0, 16908332, 0, b1Var.f1729i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b1 b1Var = this.f1712g;
        Window.Callback callback = b1Var.f1732l;
        if (callback == null || !b1Var.f1733m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1711f);
    }
}

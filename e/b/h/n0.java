package e.b.h;

import android.widget.PopupWindow;
import java.util.Objects;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public class n0 implements PopupWindow.OnDismissListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f1813f;

    public n0(o0 o0Var) {
        this.f1813f = o0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        Objects.requireNonNull(this.f1813f);
    }
}

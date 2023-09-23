package f.h.b.c.s;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class t implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f5443f;

    public t(View view) {
        this.f5443f = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InputMethodManager) this.f5443f.getContext().getSystemService("input_method")).showSoftInput(this.f5443f, 1);
    }
}

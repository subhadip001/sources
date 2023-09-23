package f.l.a.c;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

/* compiled from: NcFragmentSearchBinding.java */
/* loaded from: classes2.dex */
public final class f implements e.d0.a {
    public final LinearLayout a;
    public final ImageButton b;
    public final FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f6621d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f6622e;

    public f(LinearLayout linearLayout, ImageButton imageButton, FrameLayout frameLayout, ProgressBar progressBar, EditText editText) {
        this.a = linearLayout;
        this.b = imageButton;
        this.c = frameLayout;
        this.f6621d = progressBar;
        this.f6622e = editText;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}

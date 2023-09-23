package f.n.a.v.c.d;

import android.content.Context;
import android.view.View;

/* compiled from: BaseView.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: f  reason: collision with root package name */
    public View f7131f;

    public <T extends View> T a(int i2) {
        return (T) this.f7131f.findViewById(i2);
    }

    public Context b() {
        return this.f7131f.getContext();
    }
}

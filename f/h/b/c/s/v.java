package f.h.b.c.s;

import android.view.View;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class v implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AtomicInteger atomicInteger = z.a;
        z.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}

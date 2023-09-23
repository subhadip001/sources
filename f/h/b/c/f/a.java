package f.h.b.c.f;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e.i.j.h0.f;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes.dex */
public class a implements f {
    public final /* synthetic */ SwipeDismissBehavior a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // e.i.j.h0.f
    public boolean a(View view, f.a aVar) {
        boolean z = false;
        if (this.a.B(view)) {
            AtomicInteger atomicInteger = z.a;
            boolean z2 = z.e.d(view) == 1;
            int i2 = this.a.f1072d;
            if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            z.o(view, width);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.b bVar = this.a.b;
            if (bVar != null) {
                ((f.h.b.c.z.a) bVar).a(view);
            }
            return true;
        }
        return false;
    }
}

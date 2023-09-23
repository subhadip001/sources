package e.b.c;

import android.view.View;
import e.i.j.d0;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class r extends d0 {
    public final /* synthetic */ n a;

    public r(n nVar) {
        this.a = nVar;
    }

    @Override // e.i.j.c0
    public void b(View view) {
        this.a.u.setAlpha(1.0f);
        this.a.x.d(null);
        this.a.x = null;
    }

    @Override // e.i.j.d0, e.i.j.c0
    public void c(View view) {
        this.a.u.setVisibility(0);
        if (this.a.u.getParent() instanceof View) {
            AtomicInteger atomicInteger = z.a;
            z.h.c((View) this.a.u.getParent());
        }
    }
}

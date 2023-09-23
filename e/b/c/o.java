package e.b.c;

import android.os.Build;
import android.view.View;
import e.i.j.f0;
import e.i.j.z;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class o implements e.i.j.q {
    public final /* synthetic */ n a;

    public o(n nVar) {
        this.a = nVar;
    }

    @Override // e.i.j.q
    public f0 a(View view, f0 f0Var) {
        f0.e bVar;
        int f2 = f0Var.f();
        int c0 = this.a.c0(f0Var, null);
        if (f2 != c0) {
            int d2 = f0Var.d();
            int e2 = f0Var.e();
            int c = f0Var.c();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                bVar = new f0.d(f0Var);
            } else if (i2 >= 29) {
                bVar = new f0.c(f0Var);
            } else {
                bVar = new f0.b(f0Var);
            }
            bVar.c(e.i.d.b.b(d2, c0, e2, c));
            f0Var = bVar.a();
        }
        return z.q(view, f0Var);
    }
}

package e.b.c;

import android.view.View;
import e.i.j.b0;
import e.i.j.d0;
import e.i.j.z;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class q implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f1505f;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a extends d0 {
        public a() {
        }

        @Override // e.i.j.c0
        public void b(View view) {
            q.this.f1505f.u.setAlpha(1.0f);
            q.this.f1505f.x.d(null);
            q.this.f1505f.x = null;
        }

        @Override // e.i.j.d0, e.i.j.c0
        public void c(View view) {
            q.this.f1505f.u.setVisibility(0);
        }
    }

    public q(n nVar) {
        this.f1505f = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        n nVar = this.f1505f;
        nVar.v.showAtLocation(nVar.u, 55, 0, 0);
        this.f1505f.M();
        if (this.f1505f.a0()) {
            this.f1505f.u.setAlpha(0.0f);
            n nVar2 = this.f1505f;
            b0 b = z.b(nVar2.u);
            b.a(1.0f);
            nVar2.x = b;
            b0 b0Var = this.f1505f.x;
            a aVar = new a();
            View view = b0Var.a.get();
            if (view != null) {
                b0Var.e(view, aVar);
                return;
            }
            return;
        }
        this.f1505f.u.setAlpha(1.0f);
        this.f1505f.u.setVisibility(0);
    }
}

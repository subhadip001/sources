package f.h.b.b;

import f.h.b.b.q0;
import java.util.Arrays;
import java.util.List;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f4480f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q0.d f4481g;

    public /* synthetic */ t(o0 o0Var, q0.d dVar) {
        this.f4480f = o0Var;
        this.f4481g = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0 o0Var = this.f4480f;
        q0.d dVar = this.f4481g;
        int i2 = o0Var.s - dVar.c;
        o0Var.s = i2;
        if (dVar.f4458d) {
            o0Var.t = true;
            o0Var.u = dVar.f4459e;
        }
        if (dVar.f4460f) {
            o0Var.v = dVar.f4461g;
        }
        if (i2 == 0) {
            q1 q1Var = dVar.b.a;
            if (!o0Var.x.a.q() && q1Var.q()) {
                o0Var.y = -1;
                o0Var.z = 0L;
            }
            if (!q1Var.q()) {
                List asList = Arrays.asList(((h1) q1Var).f4317i);
                f.h.b.b.e2.j.g(asList.size() == o0Var.f4415j.size());
                for (int i3 = 0; i3 < asList.size(); i3++) {
                    o0Var.f4415j.get(i3).b = (q1) asList.get(i3);
                }
            }
            boolean z = o0Var.t;
            o0Var.t = false;
            o0Var.S(dVar.b, z, o0Var.u, 1, o0Var.v, false);
        }
    }
}

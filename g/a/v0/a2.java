package g.a.v0;

import g.a.c0;
import g.a.k0;
import java.util.Map;

/* compiled from: PickFirstLoadBalancerProvider.java */
/* loaded from: classes2.dex */
public final class a2 extends g.a.d0 {
    @Override // g.a.c0.c
    public g.a.c0 a(c0.d dVar) {
        return new z1(dVar);
    }

    @Override // g.a.d0
    public String b() {
        return "pick_first";
    }

    @Override // g.a.d0
    public int c() {
        return 5;
    }

    @Override // g.a.d0
    public boolean d() {
        return true;
    }

    @Override // g.a.d0
    public k0.b e(Map<String, ?> map) {
        return new k0.b("no service config");
    }
}

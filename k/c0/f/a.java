package k.c0.f;

import java.io.IOException;
import java.util.Objects;
import k.s;
import k.t;
import k.v;
import k.y;
import okhttp3.internal.connection.RouteException;

/* compiled from: ConnectInterceptor.java */
/* loaded from: classes2.dex */
public final class a implements s {
    public final t a;

    public a(t tVar) {
        this.a = tVar;
    }

    @Override // k.s
    public y a(s.a aVar) {
        k.c0.g.f fVar = (k.c0.g.f) aVar;
        v vVar = fVar.f8940f;
        f fVar2 = fVar.b;
        boolean z = !vVar.b.equals("GET");
        t tVar = this.a;
        Objects.requireNonNull(fVar2);
        int i2 = fVar.f8943i;
        int i3 = fVar.f8944j;
        int i4 = fVar.f8945k;
        Objects.requireNonNull(tVar);
        try {
            k.c0.g.c i5 = fVar2.e(i2, i3, i4, 0, tVar.z, z).i(tVar, aVar, fVar2);
            synchronized (fVar2.f8927d) {
                fVar2.f8936m = i5;
            }
            return fVar.b(vVar, fVar2, i5, fVar2.b());
        } catch (IOException e2) {
            throw new RouteException(e2);
        }
    }
}

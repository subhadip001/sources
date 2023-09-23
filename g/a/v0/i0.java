package g.a.v0;

import g.a.k0;
import g.a.v0.n2;
import io.grpc.internal.GrpcUtil;
import java.net.URI;
import java.util.concurrent.Executor;

/* compiled from: DnsNameResolverProvider.java */
/* loaded from: classes2.dex */
public final class i0 extends g.a.l0 {
    @Override // g.a.k0.c
    public String a() {
        return "dns";
    }

    @Override // g.a.k0.c
    public g.a.k0 b(URI uri, k0.a aVar) {
        boolean z;
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            f.h.b.c.a.x(path, "targetPath");
            f.h.b.c.a.r(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            n2.c<Executor> cVar = GrpcUtil.f8708m;
            f.h.c.a.o oVar = new f.h.c.a.o();
            try {
                Class.forName("android.app.Application", false, i0.class.getClassLoader());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            return new h0(substring, aVar, cVar, oVar, z);
        }
        return null;
    }

    @Override // g.a.l0
    public boolean c() {
        return true;
    }

    @Override // g.a.l0
    public int d() {
        return 5;
    }
}

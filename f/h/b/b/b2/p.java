package f.h.b.b.b2;

import android.net.Uri;
import f.h.b.b.b2.z;
import f.h.b.b.f2.i;
import f.h.b.b.q1;
import f.h.b.b.u0;
import f.h.b.b.v0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: ExtractorMediaSource.java */
@Deprecated
/* loaded from: classes.dex */
public final class p extends m<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final d0 f3894j;

    public p(Uri uri, i.a aVar, f.h.b.b.y1.l lVar, f.h.b.b.f2.r rVar, String str, int i2, Object obj, a aVar2) {
        String str2;
        u0.f fVar;
        Collections.emptyList();
        Collections.emptyMap();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        f.h.b.b.e2.j.g(true);
        if (uri != null) {
            fVar = new u0.f(uri, null, null, null, emptyList, null, emptyList2, obj, null);
            str2 = uri.toString();
        } else {
            str2 = null;
            fVar = null;
        }
        Objects.requireNonNull(str2);
        this.f3894j = new d0(new u0(str2, new u0.c(0L, Long.MIN_VALUE, false, false, false, null), fVar, new u0.e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), new v0(null, null), null), aVar, lVar, f.h.b.b.x1.c.a, rVar, i2);
    }

    @Override // f.h.b.b.b2.z
    public u0 e() {
        return this.f3894j.f3833g;
    }

    @Override // f.h.b.b.b2.z
    public void i(w wVar) {
        this.f3894j.i(wVar);
    }

    @Override // f.h.b.b.b2.z
    public w m(z.a aVar, f.h.b.b.f2.k kVar, long j2) {
        return this.f3894j.m(aVar, kVar, j2);
    }

    @Override // f.h.b.b.b2.j
    public void p(f.h.b.b.f2.t tVar) {
        this.f3889i = tVar;
        this.f3888h = f.h.b.b.g2.b0.j();
        u(null, this.f3894j);
    }

    @Override // f.h.b.b.b2.m
    public void t(Void r1, z zVar, q1 q1Var) {
        q(q1Var);
    }
}

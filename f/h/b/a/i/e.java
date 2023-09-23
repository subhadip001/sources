package f.h.b.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import f.h.b.a.i.i;
import f.h.b.a.i.w.h.s;
import f.h.b.a.i.w.h.t;
import f.h.b.a.i.w.h.u;
import f.h.b.a.i.w.h.v;
import f.h.b.a.i.w.h.w;
import f.h.b.a.i.w.i.c0;
import f.h.b.a.i.w.i.d0;
import f.h.b.a.i.w.i.e0;
import f.h.b.a.i.w.i.f0;
import f.h.b.a.i.w.i.h0;
import f.h.b.a.i.w.i.i0;
import f.h.b.a.i.w.i.k0;
import f.h.b.a.i.y.b;
import f.h.b.a.i.y.c;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: f  reason: collision with root package name */
    public h.a.a<Executor> f3700f;

    /* renamed from: g  reason: collision with root package name */
    public h.a.a<Context> f3701g;

    /* renamed from: h  reason: collision with root package name */
    public h.a.a f3702h;

    /* renamed from: i  reason: collision with root package name */
    public h.a.a f3703i;

    /* renamed from: j  reason: collision with root package name */
    public h.a.a f3704j;

    /* renamed from: k  reason: collision with root package name */
    public h.a.a<String> f3705k;

    /* renamed from: l  reason: collision with root package name */
    public h.a.a<h0> f3706l;

    /* renamed from: m  reason: collision with root package name */
    public h.a.a<SchedulerConfig> f3707m;
    public h.a.a<w> n;
    public h.a.a<f.h.b.a.i.w.c> o;
    public h.a.a<s> p;
    public h.a.a<u> q;
    public h.a.a<p> r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [f.h.b.a.i.t.a.a] */
    public e(Context context, a aVar) {
        h.a.a aVar2 = i.a.a;
        Object obj = f.h.b.a.i.t.a.a.c;
        this.f3700f = aVar2 instanceof f.h.b.a.i.t.a.a ? aVar2 : new f.h.b.a.i.t.a.a(aVar2);
        Objects.requireNonNull(context, "instance cannot be null");
        f.h.b.a.i.t.a.b bVar = new f.h.b.a.i.t.a.b(context);
        this.f3701g = bVar;
        f.h.b.a.i.y.b bVar2 = b.a.a;
        f.h.b.a.i.y.c cVar = c.a.a;
        f.h.b.a.i.s.i iVar = new f.h.b.a.i.s.i(bVar, bVar2, cVar);
        this.f3702h = iVar;
        h.a.a kVar = new f.h.b.a.i.s.k(bVar, iVar);
        this.f3703i = kVar instanceof f.h.b.a.i.t.a.a ? kVar : new f.h.b.a.i.t.a.a(kVar);
        h.a.a<Context> aVar3 = this.f3701g;
        this.f3704j = new k0(aVar3, c0.a.a, e0.a.a);
        h.a.a d0Var = new d0(aVar3);
        h.a.a aVar4 = d0Var instanceof f.h.b.a.i.t.a.a ? d0Var : new f.h.b.a.i.t.a.a(d0Var);
        this.f3705k = aVar4;
        i0 i0Var = new i0(bVar2, cVar, f0.a.a, this.f3704j, aVar4);
        i0Var = i0Var instanceof f.h.b.a.i.t.a.a ? i0Var : new f.h.b.a.i.t.a.a(i0Var);
        this.f3706l = i0Var;
        f.h.b.a.i.w.f fVar = new f.h.b.a.i.w.f(bVar2);
        this.f3707m = fVar;
        h.a.a<Context> aVar5 = this.f3701g;
        f.h.b.a.i.w.g gVar = new f.h.b.a.i.w.g(aVar5, i0Var, fVar, cVar);
        this.n = gVar;
        h.a.a<Executor> aVar6 = this.f3700f;
        h.a.a aVar7 = this.f3703i;
        f.h.b.a.i.w.d dVar = new f.h.b.a.i.w.d(aVar6, aVar7, gVar, i0Var, i0Var);
        this.o = dVar;
        t tVar = new t(aVar5, aVar7, i0Var, gVar, aVar6, i0Var, bVar2, cVar, i0Var);
        this.p = tVar;
        v vVar = new v(aVar6, i0Var, gVar, i0Var);
        this.q = vVar;
        h.a.a rVar = new r(bVar2, cVar, dVar, tVar, vVar);
        this.r = rVar instanceof f.h.b.a.i.t.a.a ? rVar : new f.h.b.a.i.t.a.a(rVar);
    }
}

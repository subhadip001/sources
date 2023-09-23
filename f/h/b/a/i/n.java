package f.h.b.a.i;

import f.h.b.a.i.c;
import f.h.b.a.i.h;
import java.util.Objects;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
public final class n<T> implements f.h.b.a.e<T> {
    public final l a;
    public final String b;
    public final f.h.b.a.b c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.a.d<T, byte[]> f3710d;

    /* renamed from: e  reason: collision with root package name */
    public final o f3711e;

    public n(l lVar, String str, f.h.b.a.b bVar, f.h.b.a.d<T, byte[]> dVar, o oVar) {
        this.a = lVar;
        this.b = str;
        this.c = bVar;
        this.f3710d = dVar;
        this.f3711e = oVar;
    }

    public void a(f.h.b.a.c<T> cVar, f.h.b.a.g gVar) {
        o oVar = this.f3711e;
        l lVar = this.a;
        Objects.requireNonNull(lVar, "Null transportContext");
        Objects.requireNonNull(cVar, "Null event");
        String str = this.b;
        Objects.requireNonNull(str, "Null transportName");
        f.h.b.a.d<T, byte[]> dVar = this.f3710d;
        Objects.requireNonNull(dVar, "Null transformer");
        f.h.b.a.b bVar = this.c;
        Objects.requireNonNull(bVar, "Null encoding");
        p pVar = (p) oVar;
        f.h.b.a.i.w.e eVar = pVar.c;
        l e2 = lVar.e(cVar.c());
        h.a a = h.a();
        a.e(pVar.a.getTime());
        a.g(pVar.b.getTime());
        a.f(str);
        a.d(new g(bVar, dVar.apply(cVar.b())));
        c.b bVar2 = (c.b) a;
        bVar2.b = cVar.a();
        eVar.a(e2, bVar2.b(), gVar);
    }
}

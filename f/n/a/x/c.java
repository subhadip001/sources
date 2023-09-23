package f.n.a.x;

import f.h.f.k;
import f.h.f.l;
import f.h.f.w;
import f.h.f.x;
import f.h.f.z.z.m;
import f.h.f.z.z.o;
import f.h.f.z.z.p;
import java.util.List;
import java.util.Objects;

/* compiled from: JSONManagingTask.java */
/* loaded from: classes2.dex */
public class c {
    public k a = new k();

    public void a(Class cls, Object obj) {
        k kVar = this.a;
        Objects.requireNonNull(kVar);
        f.h.b.c.a.s(true);
        if (obj instanceof l) {
            kVar.f6232d.put(cls, (l) obj);
        }
        f.h.f.a0.a aVar = new f.h.f.a0.a(cls);
        kVar.f6233e.add(new m.c(obj, aVar, aVar.b == aVar.a, null));
        if (obj instanceof w) {
            List<x> list = kVar.f6233e;
            w<Class> wVar = o.a;
            list.add(new p(new f.h.f.a0.a(cls), (w) obj));
        }
    }
}

package f.h.b.a.i;

import android.content.Context;
import f.h.b.a.i.d;
import f.h.b.a.i.l;
import f.h.b.a.i.w.h.s;
import f.h.b.a.i.w.h.u;
import f.h.b.a.i.x.a;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public class p implements o {

    /* renamed from: e  reason: collision with root package name */
    public static volatile q f3712e;
    public final f.h.b.a.i.y.a a;
    public final f.h.b.a.i.y.a b;
    public final f.h.b.a.i.w.e c;

    /* renamed from: d  reason: collision with root package name */
    public final s f3713d;

    public p(f.h.b.a.i.y.a aVar, f.h.b.a.i.y.a aVar2, f.h.b.a.i.w.e eVar, s sVar, final u uVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.f3713d = sVar;
        uVar.a.execute(new Runnable() { // from class: f.h.b.a.i.w.h.n
            @Override // java.lang.Runnable
            public final void run() {
                final u uVar2 = u.this;
                uVar2.f3751d.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.m
                    @Override // f.h.b.a.i.x.a.InterfaceC0099a
                    public final Object a() {
                        u uVar3 = u.this;
                        for (f.h.b.a.i.l lVar : uVar3.b.w()) {
                            uVar3.c.a(lVar, 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static p a() {
        q qVar = f3712e;
        if (qVar != null) {
            return ((e) qVar).r.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f3712e == null) {
            synchronized (p.class) {
                if (f3712e == null) {
                    Objects.requireNonNull(context);
                    f3712e = new e(context, null);
                }
            }
        }
    }

    public f.h.b.a.f c(f fVar) {
        Set singleton;
        if (fVar instanceof f) {
            Objects.requireNonNull((f.h.b.a.h.c) fVar);
            singleton = Collections.unmodifiableSet(f.h.b.a.h.c.f3645f);
        } else {
            singleton = Collections.singleton(new f.h.b.a.b("proto"));
        }
        l.a a = l.a();
        Objects.requireNonNull(fVar);
        a.b("cct");
        d.b bVar = (d.b) a;
        bVar.b = ((f.h.b.a.h.c) fVar).b();
        return new m(singleton, bVar.a(), this);
    }
}

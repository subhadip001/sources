package f.h.b.a.i.w;

import f.h.b.a.i.h;
import f.h.b.a.i.l;
import f.h.b.a.i.p;
import f.h.b.a.i.w.h.w;
import f.h.b.a.i.w.i.a0;
import f.h.b.a.i.x.a;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f3724f = Logger.getLogger(p.class.getName());
    public final w a;
    public final Executor b;
    public final f.h.b.a.i.s.e c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f3725d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.a.i.x.a f3726e;

    public c(Executor executor, f.h.b.a.i.s.e eVar, w wVar, a0 a0Var, f.h.b.a.i.x.a aVar) {
        this.b = executor;
        this.c = eVar;
        this.a = wVar;
        this.f3725d = a0Var;
        this.f3726e = aVar;
    }

    @Override // f.h.b.a.i.w.e
    public void a(final l lVar, final h hVar, final f.h.b.a.g gVar) {
        this.b.execute(new Runnable() { // from class: f.h.b.a.i.w.a
            @Override // java.lang.Runnable
            public final void run() {
                final c cVar = c.this;
                final l lVar2 = lVar;
                f.h.b.a.g gVar2 = gVar;
                h hVar2 = hVar;
                Objects.requireNonNull(cVar);
                try {
                    f.h.b.a.i.s.l a = cVar.c.a(lVar2.b());
                    if (a == null) {
                        String format = String.format("Transport backend '%s' is not registered", lVar2.b());
                        c.f3724f.warning(format);
                        gVar2.a(new IllegalArgumentException(format));
                    } else {
                        final h b = a.b(hVar2);
                        cVar.f3726e.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.b
                            @Override // f.h.b.a.i.x.a.InterfaceC0099a
                            public final Object a() {
                                c cVar2 = c.this;
                                l lVar3 = lVar2;
                                cVar2.f3725d.U(lVar3, b);
                                cVar2.a.a(lVar3, 1);
                                return null;
                            }
                        });
                        gVar2.a(null);
                    }
                } catch (Exception e2) {
                    Logger logger = c.f3724f;
                    StringBuilder A = f.a.b.a.a.A("Error scheduling event ");
                    A.append(e2.getMessage());
                    logger.warning(A.toString());
                    gVar2.a(e2);
                }
            }
        });
    }
}

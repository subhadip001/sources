package e.g0.t.q;

import android.content.Context;
import e.g0.k;
import e.g0.t.q.e.c;
import e.g0.t.q.e.e;
import e.g0.t.q.e.f;
import e.g0.t.q.e.g;
import e.g0.t.q.e.h;
import e.g0.t.s.p;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f2299d = k.e("WorkConstraintsTracker");
    public final c a;
    public final e.g0.t.q.e.c<?>[] b;
    public final Object c;

    public d(Context context, e.g0.t.t.t.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = cVar;
        this.b = new e.g0.t.q.e.c[]{new e.g0.t.q.e.a(applicationContext, aVar), new e.g0.t.q.e.b(applicationContext, aVar), new h(applicationContext, aVar), new e.g0.t.q.e.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.c = new Object();
    }

    public boolean a(String str) {
        e.g0.t.q.e.c<?>[] cVarArr;
        synchronized (this.c) {
            for (e.g0.t.q.e.c<?> cVar : this.b) {
                Object obj = cVar.b;
                if (obj != null && cVar.c(obj) && cVar.a.contains(str)) {
                    k.c().a(f2299d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(Iterable<p> iterable) {
        e.g0.t.q.e.c<?>[] cVarArr;
        e.g0.t.q.e.c<?>[] cVarArr2;
        synchronized (this.c) {
            for (e.g0.t.q.e.c<?> cVar : this.b) {
                if (cVar.f2300d != null) {
                    cVar.f2300d = null;
                    cVar.e(null, cVar.b);
                }
            }
            for (e.g0.t.q.e.c<?> cVar2 : this.b) {
                cVar2.d(iterable);
            }
            for (e.g0.t.q.e.c<?> cVar3 : this.b) {
                if (cVar3.f2300d != this) {
                    cVar3.f2300d = this;
                    cVar3.e(this, cVar3.b);
                }
            }
        }
    }

    public void c() {
        e.g0.t.q.e.c<?>[] cVarArr;
        synchronized (this.c) {
            for (e.g0.t.q.e.c<?> cVar : this.b) {
                if (!cVar.a.isEmpty()) {
                    cVar.a.clear();
                    cVar.c.b(cVar);
                }
            }
        }
    }
}

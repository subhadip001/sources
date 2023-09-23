package e.g0.t.p.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import e.g0.k;
import e.g0.t.e;
import e.g0.t.l;
import e.g0.t.q.d;
import e.g0.t.s.p;
import e.g0.t.t.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public class c implements e, e.g0.t.q.c, e.g0.t.b {
    public static final String n = k.e("GreedyScheduler");

    /* renamed from: f  reason: collision with root package name */
    public final Context f2256f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2257g;

    /* renamed from: h  reason: collision with root package name */
    public final d f2258h;

    /* renamed from: j  reason: collision with root package name */
    public b f2260j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2261k;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f2263m;

    /* renamed from: i  reason: collision with root package name */
    public final Set<p> f2259i = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    public final Object f2262l = new Object();

    public c(Context context, e.g0.b bVar, e.g0.t.t.t.a aVar, l lVar) {
        this.f2256f = context;
        this.f2257g = lVar;
        this.f2258h = new d(context, aVar, this);
        this.f2260j = new b(this, bVar.f2191e);
    }

    @Override // e.g0.t.e
    public void a(p... pVarArr) {
        if (this.f2263m == null) {
            this.f2263m = Boolean.valueOf(i.a(this.f2256f, this.f2257g.b));
        }
        if (!this.f2263m.booleanValue()) {
            k.c().d(n, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f2261k) {
            this.f2257g.f2230f.a(this);
            this.f2261k = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    b bVar = this.f2260j;
                    if (bVar != null) {
                        Runnable remove = bVar.c.remove(pVar.a);
                        if (remove != null) {
                            bVar.b.a.removeCallbacks(remove);
                        }
                        a aVar = new a(bVar, pVar);
                        bVar.c.put(pVar.a, aVar);
                        bVar.b.a.postDelayed(aVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && pVar.f2342j.c) {
                        k.c().a(n, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i2 >= 24 && pVar.f2342j.a()) {
                        k.c().a(n, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.a);
                    }
                } else {
                    k.c().a(n, String.format("Starting work for %s", pVar.a), new Throwable[0]);
                    l lVar = this.f2257g;
                    ((e.g0.t.t.t.b) lVar.f2228d).a.execute(new e.g0.t.t.k(lVar, pVar.a, null));
                }
            }
        }
        synchronized (this.f2262l) {
            if (!hashSet.isEmpty()) {
                k.c().a(n, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f2259i.addAll(hashSet);
                this.f2258h.b(this.f2259i);
            }
        }
    }

    @Override // e.g0.t.q.c
    public void b(List<String> list) {
        for (String str : list) {
            k.c().a(n, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f2257g.f(str);
        }
    }

    @Override // e.g0.t.e
    public boolean c() {
        return false;
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        synchronized (this.f2262l) {
            Iterator<p> it = this.f2259i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.a.equals(str)) {
                    k.c().a(n, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f2259i.remove(next);
                    this.f2258h.b(this.f2259i);
                    break;
                }
            }
        }
    }

    @Override // e.g0.t.e
    public void e(String str) {
        Runnable remove;
        if (this.f2263m == null) {
            this.f2263m = Boolean.valueOf(i.a(this.f2256f, this.f2257g.b));
        }
        if (!this.f2263m.booleanValue()) {
            k.c().d(n, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f2261k) {
            this.f2257g.f2230f.a(this);
            this.f2261k = true;
        }
        k.c().a(n, String.format("Cancelling work ID %s", str), new Throwable[0]);
        b bVar = this.f2260j;
        if (bVar != null && (remove = bVar.c.remove(str)) != null) {
            bVar.b.a.removeCallbacks(remove);
        }
        this.f2257g.f(str);
    }

    @Override // e.g0.t.q.c
    public void f(List<String> list) {
        for (String str : list) {
            k.c().a(n, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            l lVar = this.f2257g;
            ((e.g0.t.t.t.b) lVar.f2228d).a.execute(new e.g0.t.t.k(lVar, str, null));
        }
    }
}

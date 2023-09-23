package e.g0.t.t;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import e.g0.m;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final e.g0.t.c f2359f = new e.g0.t.c();

    public void a(e.g0.t.l lVar, String str) {
        boolean z;
        WorkDatabase workDatabase = lVar.c;
        e.g0.t.s.q r = workDatabase.r();
        e.g0.t.s.b m2 = workDatabase.m();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            e.g0.t.s.r rVar = (e.g0.t.s.r) r;
            WorkInfo$State f2 = rVar.f(str2);
            if (f2 != WorkInfo$State.SUCCEEDED && f2 != WorkInfo$State.FAILED) {
                rVar.p(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((e.g0.t.s.c) m2).a(str2));
        }
        e.g0.t.d dVar = lVar.f2230f;
        synchronized (dVar.p) {
            e.g0.k.c().a(e.g0.t.d.q, String.format("Processor cancelling %s", str), new Throwable[0]);
            dVar.n.add(str);
            e.g0.t.o remove = dVar.f2208k.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = dVar.f2209l.remove(str);
            }
            e.g0.t.d.b(str, remove);
            if (z) {
                dVar.h();
            }
        }
        for (e.g0.t.e eVar : lVar.f2229e) {
            eVar.e(str);
        }
    }

    public void b(e.g0.t.l lVar) {
        e.g0.t.f.a(lVar.b, lVar.c, lVar.f2229e);
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            c();
            this.f2359f.a(e.g0.m.a);
        } catch (Throwable th) {
            this.f2359f.a(new m.b.a(th));
        }
    }
}

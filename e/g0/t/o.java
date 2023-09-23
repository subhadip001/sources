package e.g0.t;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import e.g0.t.s.p;
import e.g0.t.s.q;
import e.g0.t.s.r;
import e.g0.t.s.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class o implements Runnable {
    public static final String y = e.g0.k.e("WorkerWrapper");

    /* renamed from: f  reason: collision with root package name */
    public Context f2240f;

    /* renamed from: g  reason: collision with root package name */
    public String f2241g;

    /* renamed from: h  reason: collision with root package name */
    public List<e> f2242h;

    /* renamed from: i  reason: collision with root package name */
    public WorkerParameters.a f2243i;

    /* renamed from: j  reason: collision with root package name */
    public p f2244j;

    /* renamed from: l  reason: collision with root package name */
    public e.g0.t.t.t.a f2246l;
    public e.g0.b n;
    public e.g0.t.r.a o;
    public WorkDatabase p;
    public q q;
    public e.g0.t.s.b r;
    public t s;
    public List<String> t;
    public String u;
    public volatile boolean x;

    /* renamed from: m  reason: collision with root package name */
    public ListenableWorker.a f2247m = new ListenableWorker.a.C0002a();
    public e.g0.t.t.s.c<Boolean> v = new e.g0.t.t.s.c<>();
    public f.h.c.g.a.c<ListenableWorker.a> w = null;

    /* renamed from: k  reason: collision with root package name */
    public ListenableWorker f2245k = null;

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class a {
        public Context a;
        public e.g0.t.r.a b;
        public e.g0.t.t.t.a c;

        /* renamed from: d  reason: collision with root package name */
        public e.g0.b f2248d;

        /* renamed from: e  reason: collision with root package name */
        public WorkDatabase f2249e;

        /* renamed from: f  reason: collision with root package name */
        public String f2250f;

        /* renamed from: g  reason: collision with root package name */
        public List<e> f2251g;

        /* renamed from: h  reason: collision with root package name */
        public WorkerParameters.a f2252h = new WorkerParameters.a();

        public a(Context context, e.g0.b bVar, e.g0.t.t.t.a aVar, e.g0.t.r.a aVar2, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = aVar;
            this.b = aVar2;
            this.f2248d = bVar;
            this.f2249e = workDatabase;
            this.f2250f = str;
        }
    }

    public o(a aVar) {
        this.f2240f = aVar.a;
        this.f2246l = aVar.c;
        this.o = aVar.b;
        this.f2241g = aVar.f2250f;
        this.f2242h = aVar.f2251g;
        this.f2243i = aVar.f2252h;
        this.n = aVar.f2248d;
        WorkDatabase workDatabase = aVar.f2249e;
        this.p = workDatabase;
        this.q = workDatabase.r();
        this.r = this.p.m();
        this.s = this.p.s();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            e.g0.k.c().d(y, String.format("Worker result SUCCESS for %s", this.u), new Throwable[0]);
            if (this.f2244j.c()) {
                e();
                return;
            }
            this.p.c();
            try {
                ((r) this.q).p(WorkInfo$State.SUCCEEDED, this.f2241g);
                ((r) this.q).n(this.f2241g, ((ListenableWorker.a.c) this.f2247m).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((e.g0.t.s.c) this.r).a(this.f2241g)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((r) this.q).f(str) == WorkInfo$State.BLOCKED && ((e.g0.t.s.c) this.r).b(str)) {
                        e.g0.k.c().d(y, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                        ((r) this.q).p(WorkInfo$State.ENQUEUED, str);
                        ((r) this.q).o(str, currentTimeMillis);
                    }
                }
                this.p.l();
            } finally {
                this.p.g();
                f(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            e.g0.k.c().d(y, String.format("Worker result RETRY for %s", this.u), new Throwable[0]);
            d();
        } else {
            e.g0.k.c().d(y, String.format("Worker result FAILURE for %s", this.u), new Throwable[0]);
            if (this.f2244j.c()) {
                e();
            } else {
                h();
            }
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((r) this.q).f(str2) != WorkInfo$State.CANCELLED) {
                ((r) this.q).p(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((e.g0.t.s.c) this.r).a(str2));
        }
    }

    public void c() {
        if (!i()) {
            this.p.c();
            try {
                WorkInfo$State f2 = ((r) this.q).f(this.f2241g);
                ((e.g0.t.s.o) this.p.q()).a(this.f2241g);
                if (f2 == null) {
                    f(false);
                } else if (f2 == WorkInfo$State.RUNNING) {
                    a(this.f2247m);
                } else if (!f2.isFinished()) {
                    d();
                }
                this.p.l();
            } finally {
                this.p.g();
            }
        }
        List<e> list = this.f2242h;
        if (list != null) {
            for (e eVar : list) {
                eVar.e(this.f2241g);
            }
            f.a(this.n, this.p, this.f2242h);
        }
    }

    public final void d() {
        this.p.c();
        try {
            ((r) this.q).p(WorkInfo$State.ENQUEUED, this.f2241g);
            ((r) this.q).o(this.f2241g, System.currentTimeMillis());
            ((r) this.q).l(this.f2241g, -1L);
            this.p.l();
        } finally {
            this.p.g();
            f(true);
        }
    }

    public final void e() {
        this.p.c();
        try {
            ((r) this.q).o(this.f2241g, System.currentTimeMillis());
            ((r) this.q).p(WorkInfo$State.ENQUEUED, this.f2241g);
            ((r) this.q).m(this.f2241g);
            ((r) this.q).l(this.f2241g, -1L);
            this.p.l();
        } finally {
            this.p.g();
            f(false);
        }
    }

    public final void f(boolean z) {
        ListenableWorker listenableWorker;
        this.p.c();
        try {
            r rVar = (r) this.p.r();
            Objects.requireNonNull(rVar);
            e.v.h g2 = e.v.h.g("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            rVar.a.b();
            Cursor b = e.v.n.b.b(rVar.a, g2, false, null);
            boolean z2 = b.moveToFirst() && b.getInt(0) != 0;
            b.close();
            g2.release();
            if (!z2) {
                e.g0.t.t.g.a(this.f2240f, RescheduleReceiver.class, false);
            }
            if (z) {
                ((r) this.q).p(WorkInfo$State.ENQUEUED, this.f2241g);
                ((r) this.q).l(this.f2241g, -1L);
            }
            if (this.f2244j != null && (listenableWorker = this.f2245k) != null && listenableWorker.isRunInForeground()) {
                e.g0.t.r.a aVar = this.o;
                String str = this.f2241g;
                d dVar = (d) aVar;
                synchronized (dVar.p) {
                    dVar.f2208k.remove(str);
                    dVar.h();
                }
            }
            this.p.l();
            this.p.g();
            this.v.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.p.g();
            throw th;
        }
    }

    public final void g() {
        WorkInfo$State f2 = ((r) this.q).f(this.f2241g);
        if (f2 == WorkInfo$State.RUNNING) {
            e.g0.k.c().a(y, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f2241g), new Throwable[0]);
            f(true);
            return;
        }
        e.g0.k.c().a(y, String.format("Status for %s is %s; not doing any work", this.f2241g, f2), new Throwable[0]);
        f(false);
    }

    public void h() {
        this.p.c();
        try {
            b(this.f2241g);
            e.g0.e eVar = ((ListenableWorker.a.C0002a) this.f2247m).a;
            ((r) this.q).n(this.f2241g, eVar);
            this.p.l();
        } finally {
            this.p.g();
            f(false);
        }
    }

    public final boolean i() {
        if (this.x) {
            e.g0.k.c().a(y, String.format("Work interrupted for %s", this.u), new Throwable[0]);
            WorkInfo$State f2 = ((r) this.q).f(this.f2241g);
            if (f2 == null) {
                f(false);
            } else {
                f(!f2.isFinished());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
        if ((r0.b == r3 && r0.f2343k > 0) != false) goto L95;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.t.o.run():void");
    }
}

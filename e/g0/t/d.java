package e.g0.t;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import e.g0.t.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public class d implements b, e.g0.t.r.a {
    public static final String q = e.g0.k.e("Processor");

    /* renamed from: g  reason: collision with root package name */
    public Context f2204g;

    /* renamed from: h  reason: collision with root package name */
    public e.g0.b f2205h;

    /* renamed from: i  reason: collision with root package name */
    public e.g0.t.t.t.a f2206i;

    /* renamed from: j  reason: collision with root package name */
    public WorkDatabase f2207j;

    /* renamed from: m  reason: collision with root package name */
    public List<e> f2210m;

    /* renamed from: l  reason: collision with root package name */
    public Map<String, o> f2209l = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public Map<String, o> f2208k = new HashMap();
    public Set<String> n = new HashSet();
    public final List<b> o = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public PowerManager.WakeLock f2203f = null;
    public final Object p = new Object();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public b f2211f;

        /* renamed from: g  reason: collision with root package name */
        public String f2212g;

        /* renamed from: h  reason: collision with root package name */
        public f.h.c.g.a.c<Boolean> f2213h;

        public a(b bVar, String str, f.h.c.g.a.c<Boolean> cVar) {
            this.f2211f = bVar;
            this.f2212g = str;
            this.f2213h = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.f2213h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f2211f.d(this.f2212g, z);
        }
    }

    public d(Context context, e.g0.b bVar, e.g0.t.t.t.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f2204g = context;
        this.f2205h = bVar;
        this.f2206i = aVar;
        this.f2207j = workDatabase;
        this.f2210m = list;
    }

    public static boolean b(String str, o oVar) {
        boolean z;
        if (oVar != null) {
            oVar.x = true;
            oVar.i();
            f.h.c.g.a.c<ListenableWorker.a> cVar = oVar.w;
            if (cVar != null) {
                z = cVar.isDone();
                oVar.w.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = oVar.f2245k;
            if (listenableWorker != null && !z) {
                listenableWorker.stop();
            } else {
                e.g0.k.c().a(o.y, String.format("WorkSpec %s is already done. Not interrupting.", oVar.f2244j), new Throwable[0]);
            }
            e.g0.k.c().a(q, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        e.g0.k.c().a(q, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public void a(b bVar) {
        synchronized (this.p) {
            this.o.add(bVar);
        }
    }

    public boolean c(String str) {
        boolean z;
        synchronized (this.p) {
            z = this.f2209l.containsKey(str) || this.f2208k.containsKey(str);
        }
        return z;
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        synchronized (this.p) {
            this.f2209l.remove(str);
            e.g0.k.c().a(q, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (b bVar : this.o) {
                bVar.d(str, z);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.p) {
            this.o.remove(bVar);
        }
    }

    public void f(String str, e.g0.f fVar) {
        synchronized (this.p) {
            e.g0.k.c().d(q, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            o remove = this.f2209l.remove(str);
            if (remove != null) {
                if (this.f2203f == null) {
                    PowerManager.WakeLock a2 = e.g0.t.t.m.a(this.f2204g, "ProcessorForegroundLck");
                    this.f2203f = a2;
                    a2.acquire();
                }
                this.f2208k.put(str, remove);
                e.i.c.a.startForegroundService(this.f2204g, e.g0.t.r.c.c(this.f2204g, str, fVar));
            }
        }
    }

    public boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.p) {
            if (c(str)) {
                e.g0.k.c().a(q, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            o.a aVar2 = new o.a(this.f2204g, this.f2205h, this.f2206i, this, this.f2207j, str);
            aVar2.f2251g = this.f2210m;
            if (aVar != null) {
                aVar2.f2252h = aVar;
            }
            o oVar = new o(aVar2);
            e.g0.t.t.s.c<Boolean> cVar = oVar.v;
            cVar.a(new a(this, str, cVar), ((e.g0.t.t.t.b) this.f2206i).c);
            this.f2209l.put(str, oVar);
            ((e.g0.t.t.t.b) this.f2206i).a.execute(oVar);
            e.g0.k.c().a(q, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void h() {
        synchronized (this.p) {
            if (!(!this.f2208k.isEmpty())) {
                Context context = this.f2204g;
                String str = e.g0.t.r.c.p;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f2204g.startService(intent);
                PowerManager.WakeLock wakeLock = this.f2203f;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f2203f = null;
                }
            }
        }
    }

    public boolean i(String str) {
        boolean b;
        synchronized (this.p) {
            e.g0.k.c().a(q, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            b = b(str, this.f2208k.remove(str));
        }
        return b;
    }

    public boolean j(String str) {
        boolean b;
        synchronized (this.p) {
            e.g0.k.c().a(q, String.format("Processor stopping background work %s", str), new Throwable[0]);
            b = b(str, this.f2209l.remove(str));
        }
        return b;
    }
}

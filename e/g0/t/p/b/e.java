package e.g0.t.p.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.t.j;
import e.g0.t.t.m;
import e.g0.t.t.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public class e implements e.g0.t.b {
    public static final String p = k.e("SystemAlarmDispatcher");

    /* renamed from: f  reason: collision with root package name */
    public final Context f2278f;

    /* renamed from: g  reason: collision with root package name */
    public final e.g0.t.t.t.a f2279g;

    /* renamed from: h  reason: collision with root package name */
    public final r f2280h;

    /* renamed from: i  reason: collision with root package name */
    public final e.g0.t.d f2281i;

    /* renamed from: j  reason: collision with root package name */
    public final l f2282j;

    /* renamed from: k  reason: collision with root package name */
    public final e.g0.t.p.b.b f2283k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f2284l;

    /* renamed from: m  reason: collision with root package name */
    public final List<Intent> f2285m;
    public Intent n;
    public c o;

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f2285m) {
                e eVar2 = e.this;
                eVar2.n = eVar2.f2285m.get(0);
            }
            Intent intent = e.this.n;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.n.getIntExtra("KEY_START_ID", 0);
                k c = k.c();
                String str = e.p;
                c.a(str, String.format("Processing command %s, %s", e.this.n, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a = m.a(e.this.f2278f, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    k.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a), new Throwable[0]);
                    a.acquire();
                    e eVar3 = e.this;
                    eVar3.f2283k.e(eVar3.n, intExtra, eVar3);
                    k.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                    a.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        k c2 = k.c();
                        String str2 = e.p;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        k.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        k.c().a(e.p, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        e eVar4 = e.this;
                        eVar4.f2284l.post(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.f2284l.post(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final e f2287f;

        /* renamed from: g  reason: collision with root package name */
        public final Intent f2288g;

        /* renamed from: h  reason: collision with root package name */
        public final int f2289h;

        public b(e eVar, Intent intent, int i2) {
            this.f2287f = eVar;
            this.f2288g = intent;
            this.f2289h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2287f.a(this.f2288g, this.f2289h);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final e f2290f;

        public d(e eVar) {
            this.f2290f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            e eVar = this.f2290f;
            Objects.requireNonNull(eVar);
            k c = k.c();
            String str = e.p;
            c.a(str, "Checking if commands are complete.", new Throwable[0]);
            eVar.b();
            synchronized (eVar.f2285m) {
                boolean z2 = true;
                if (eVar.n != null) {
                    k.c().a(str, String.format("Removing command %s", eVar.n), new Throwable[0]);
                    if (eVar.f2285m.remove(0).equals(eVar.n)) {
                        eVar.n = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                j jVar = ((e.g0.t.t.t.b) eVar.f2279g).a;
                e.g0.t.p.b.b bVar = eVar.f2283k;
                synchronized (bVar.f2267h) {
                    z = !bVar.f2266g.isEmpty();
                }
                if (!z && eVar.f2285m.isEmpty()) {
                    synchronized (jVar.f2365h) {
                        if (jVar.f2363f.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        k.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = eVar.o;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).c();
                        }
                    }
                }
                if (!eVar.f2285m.isEmpty()) {
                    eVar.e();
                }
            }
        }
    }

    public e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2278f = applicationContext;
        this.f2283k = new e.g0.t.p.b.b(applicationContext);
        this.f2280h = new r();
        l b2 = l.b(context);
        this.f2282j = b2;
        e.g0.t.d dVar = b2.f2230f;
        this.f2281i = dVar;
        this.f2279g = b2.f2228d;
        dVar.a(this);
        this.f2285m = new ArrayList();
        this.n = null;
        this.f2284l = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i2) {
        boolean z;
        k c2 = k.c();
        String str = p;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f2285m) {
                Iterator<Intent> it = this.f2285m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f2285m) {
            boolean z2 = this.f2285m.isEmpty() ? false : true;
            this.f2285m.add(intent);
            if (!z2) {
                e();
            }
        }
        return true;
    }

    public final void b() {
        if (this.f2284l.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        k.c().a(p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2281i.e(this);
        r rVar = this.f2280h;
        if (!rVar.b.isShutdown()) {
            rVar.b.shutdownNow();
        }
        this.o = null;
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        Context context = this.f2278f;
        String str2 = e.g0.t.p.b.b.f2264i;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.f2284l.post(new b(this, intent, 0));
    }

    public final void e() {
        b();
        PowerManager.WakeLock a2 = m.a(this.f2278f, "ProcessCommand");
        try {
            a2.acquire();
            e.g0.t.t.t.a aVar = this.f2282j.f2228d;
            ((e.g0.t.t.t.b) aVar).a.execute(new a());
        } finally {
            a2.release();
        }
    }
}

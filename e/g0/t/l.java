package e.g0.t;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.video_converter.video_compressor.R;
import e.g0.b;
import e.g0.k;
import e.g0.p;
import e.g0.t.j;
import e.g0.t.s.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: j  reason: collision with root package name */
    public static l f2225j;

    /* renamed from: k  reason: collision with root package name */
    public static l f2226k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f2227l;
    public Context a;
    public e.g0.b b;
    public WorkDatabase c;

    /* renamed from: d  reason: collision with root package name */
    public e.g0.t.t.t.a f2228d;

    /* renamed from: e  reason: collision with root package name */
    public List<e> f2229e;

    /* renamed from: f  reason: collision with root package name */
    public d f2230f;

    /* renamed from: g  reason: collision with root package name */
    public e.g0.t.t.h f2231g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2232h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f2233i;

    static {
        e.g0.k.e("WorkManagerImpl");
        f2225j = null;
        f2226k = null;
        f2227l = new Object();
    }

    public l(Context context, e.g0.b bVar, e.g0.t.t.t.a aVar) {
        RoomDatabase.a f2;
        e eVar;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        e.g0.t.t.j jVar = ((e.g0.t.t.t.b) aVar).a;
        int i2 = WorkDatabase.f640l;
        e eVar2 = null;
        if (z) {
            f2 = new RoomDatabase.a(applicationContext, WorkDatabase.class, null);
            f2.f568h = true;
        } else {
            String str = k.a;
            f2 = e.p.a.f(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            f2.f567g = new h(applicationContext);
        }
        f2.f565e = jVar;
        i iVar = new i();
        if (f2.f564d == null) {
            f2.f564d = new ArrayList<>();
        }
        f2.f564d.add(iVar);
        f2.a(j.a);
        f2.a(new j.h(applicationContext, 2, 3));
        f2.a(j.b);
        f2.a(j.c);
        f2.a(new j.h(applicationContext, 5, 6));
        f2.a(j.f2221d);
        f2.a(j.f2222e);
        f2.a(j.f2223f);
        f2.a(new j.i(applicationContext));
        f2.a(new j.h(applicationContext, 10, 11));
        f2.a(j.f2224g);
        f2.f570j = false;
        f2.f571k = true;
        WorkDatabase workDatabase = (WorkDatabase) f2.b();
        Context applicationContext2 = context.getApplicationContext();
        k.a aVar2 = new k.a(bVar.f2192f);
        synchronized (e.g0.k.class) {
            e.g0.k.a = aVar2;
        }
        e[] eVarArr = new e[2];
        String str2 = f.a;
        if (Build.VERSION.SDK_INT >= 23) {
            eVar = new e.g0.t.p.c.b(applicationContext2, this);
            e.g0.t.t.g.a(applicationContext2, SystemJobService.class, true);
            e.g0.k.c().a(f.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        } else {
            try {
                e eVar3 = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                e.g0.k.c().a(f.a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                eVar2 = eVar3;
            } catch (Throwable th) {
                e.g0.k.c().a(f.a, "Unable to create GCM Scheduler", th);
            }
            if (eVar2 == null) {
                eVar = new e.g0.t.p.b.f(applicationContext2);
                e.g0.t.t.g.a(applicationContext2, SystemAlarmService.class, true);
                e.g0.k.c().a(f.a, "Created SystemAlarmScheduler", new Throwable[0]);
            } else {
                eVar = eVar2;
            }
        }
        eVarArr[0] = eVar;
        eVarArr[1] = new e.g0.t.p.a.c(applicationContext2, bVar, aVar, this);
        List<e> asList = Arrays.asList(eVarArr);
        d dVar = new d(context, bVar, aVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.a = applicationContext3;
        this.b = bVar;
        this.f2228d = aVar;
        this.c = workDatabase;
        this.f2229e = asList;
        this.f2230f = dVar;
        this.f2231g = new e.g0.t.t.h(workDatabase);
        this.f2232h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((e.g0.t.t.t.b) this.f2228d).a.execute(new ForceStopRunnable(applicationContext3, this));
    }

    public static l b(Context context) {
        l lVar;
        Object obj = f2227l;
        synchronized (obj) {
            synchronized (obj) {
                lVar = f2225j;
                if (lVar == null) {
                    lVar = f2226k;
                }
            }
            return lVar;
        }
        if (lVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof b.InterfaceC0038b) {
                c(applicationContext, ((b.InterfaceC0038b) applicationContext).a());
                lVar = b(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (e.g0.t.l.f2226k != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        e.g0.t.l.f2226k = new e.g0.t.l(r4, r5, new e.g0.t.t.t.b(r5.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        e.g0.t.l.f2225j = e.g0.t.l.f2226k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r4, e.g0.b r5) {
        /*
            java.lang.Object r0 = e.g0.t.l.f2227l
            monitor-enter(r0)
            e.g0.t.l r1 = e.g0.t.l.f2225j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            e.g0.t.l r2 = e.g0.t.l.f2226k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            e.g0.t.l r1 = e.g0.t.l.f2226k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            e.g0.t.l r1 = new e.g0.t.l     // Catch: java.lang.Throwable -> L32
            e.g0.t.t.t.b r2 = new e.g0.t.t.t.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r3 = r5.b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            e.g0.t.l.f2226k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            e.g0.t.l r4 = e.g0.t.l.f2226k     // Catch: java.lang.Throwable -> L32
            e.g0.t.l.f2225j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.t.l.c(android.content.Context, e.g0.b):void");
    }

    public void d() {
        synchronized (f2227l) {
            this.f2232h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f2233i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f2233i = null;
            }
        }
    }

    public void e() {
        List<JobInfo> f2;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.a;
            String str = e.g0.t.p.c.b.f2293j;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (f2 = e.g0.t.p.c.b.f(context, jobScheduler)) != null && !f2.isEmpty()) {
                for (JobInfo jobInfo : f2) {
                    e.g0.t.p.c.b.b(jobScheduler, jobInfo.getId());
                }
            }
        }
        r rVar = (r) this.c.r();
        rVar.a.b();
        e.x.a.f.f a = rVar.f2351i.a();
        rVar.a.c();
        try {
            a.a();
            rVar.a.l();
            rVar.a.g();
            e.v.k kVar = rVar.f2351i;
            if (a == kVar.c) {
                kVar.a.set(false);
            }
            f.a(this.b, this.c, this.f2229e);
        } catch (Throwable th) {
            rVar.a.g();
            rVar.f2351i.c(a);
            throw th;
        }
    }

    public void f(String str) {
        e.g0.t.t.t.a aVar = this.f2228d;
        ((e.g0.t.t.t.b) aVar).a.execute(new e.g0.t.t.l(this, str, false));
    }
}

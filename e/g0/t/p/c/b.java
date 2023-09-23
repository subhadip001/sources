package e.g0.t.p.c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import e.g0.k;
import e.g0.t.e;
import e.g0.t.l;
import e.g0.t.s.g;
import e.g0.t.s.i;
import e.g0.t.s.p;
import e.g0.t.s.r;
import e.g0.t.t.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2293j = k.e("SystemJobScheduler");

    /* renamed from: f  reason: collision with root package name */
    public final Context f2294f;

    /* renamed from: g  reason: collision with root package name */
    public final JobScheduler f2295g;

    /* renamed from: h  reason: collision with root package name */
    public final l f2296h;

    /* renamed from: i  reason: collision with root package name */
    public final a f2297i;

    public b(Context context, l lVar) {
        a aVar = new a(context);
        this.f2294f = context;
        this.f2296h = lVar;
        this.f2295g = (JobScheduler) context.getSystemService("jobscheduler");
        this.f2297i = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            k.c().b(f2293j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static List<Integer> d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> f2 = f(context, jobScheduler);
        if (f2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : f2) {
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            k.c().b(f2293j, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // e.g0.t.e
    public void a(p... pVarArr) {
        int b;
        List<Integer> d2;
        int b2;
        WorkDatabase workDatabase = this.f2296h.c;
        f fVar = new f(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p i2 = ((r) workDatabase.r()).i(pVar.a);
                if (i2 == null) {
                    k.c().f(f2293j, "Skipping scheduling " + pVar.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.l();
                } else if (i2.b != WorkInfo$State.ENQUEUED) {
                    k.c().f(f2293j, "Skipping scheduling " + pVar.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.l();
                } else {
                    g a = ((i) workDatabase.o()).a(pVar.a);
                    if (a != null) {
                        b = a.b;
                    } else {
                        Objects.requireNonNull(this.f2296h.b);
                        b = fVar.b(0, this.f2296h.b.f2193g);
                    }
                    if (a == null) {
                        ((i) this.f2296h.c.o()).b(new g(pVar.a, b));
                    }
                    h(pVar, b);
                    if (Build.VERSION.SDK_INT == 23 && (d2 = d(this.f2294f, this.f2295g, pVar.a)) != null) {
                        int indexOf = d2.indexOf(Integer.valueOf(b));
                        if (indexOf >= 0) {
                            d2.remove(indexOf);
                        }
                        if (!d2.isEmpty()) {
                            b2 = d2.get(0).intValue();
                        } else {
                            Objects.requireNonNull(this.f2296h.b);
                            b2 = fVar.b(0, this.f2296h.b.f2193g);
                        }
                        h(pVar, b2);
                    }
                    workDatabase.l();
                }
                workDatabase.g();
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }

    @Override // e.g0.t.e
    public boolean c() {
        return true;
    }

    @Override // e.g0.t.e
    public void e(String str) {
        List<Integer> d2 = d(this.f2294f, this.f2295g, str);
        if (d2 == null || d2.isEmpty()) {
            return;
        }
        for (Integer num : d2) {
            b(this.f2295g, num.intValue());
        }
        ((i) this.f2296h.c.o()).c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (r5 < 26) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(e.g0.t.s.p r19, int r20) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.t.p.c.b.h(e.g0.t.s.p, int):void");
    }
}

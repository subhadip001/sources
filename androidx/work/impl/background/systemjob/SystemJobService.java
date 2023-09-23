package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import e.g0.k;
import e.g0.t.b;
import e.g0.t.d;
import e.g0.t.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f648h = k.e("SystemJobService");

    /* renamed from: f  reason: collision with root package name */
    public l f649f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, JobParameters> f650g = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        JobParameters remove;
        k.c().a(f648h, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f650g) {
            remove = this.f650g.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            l b = l.b(getApplicationContext());
            this.f649f = b;
            b.f2230f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                k.c().f(f648h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        l lVar = this.f649f;
        if (lVar != null) {
            lVar.f2230f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f649f == null) {
            k.c().a(f648h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            k.c().b(f648h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f650g) {
            if (this.f650g.containsKey(a)) {
                k.c().a(f648h, String.format("Job is already being executed by SystemJobService: %s", a), new Throwable[0]);
                return false;
            }
            k.c().a(f648h, String.format("onStartJob for %s", a), new Throwable[0]);
            this.f650g.put(a, jobParameters);
            WorkerParameters.a aVar = null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i2 >= 28) {
                    aVar.c = jobParameters.getNetwork();
                }
            }
            l lVar = this.f649f;
            ((e.g0.t.t.t.b) lVar.f2228d).a.execute(new e.g0.t.t.k(lVar, a, aVar));
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f649f == null) {
            k.c().a(f648h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            k.c().b(f648h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        k.c().a(f648h, String.format("onStopJob for %s", a), new Throwable[0]);
        synchronized (this.f650g) {
            this.f650g.remove(a);
        }
        this.f649f.f(a);
        d dVar = this.f649f.f2230f;
        synchronized (dVar.p) {
            contains = dVar.n.contains(a);
        }
        return !contains;
    }
}

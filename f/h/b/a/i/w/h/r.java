package f.h.b.a.i.w.h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import f.h.b.a.i.w.i.a0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public class r implements w {
    public final Context a;
    public final a0 b;
    public final SchedulerConfig c;

    public r(Context context, a0 a0Var, SchedulerConfig schedulerConfig) {
        this.a = context;
        this.b = a0Var;
        this.c = schedulerConfig;
    }

    @Override // f.h.b.a.i.w.h.w
    public void a(f.h.b.a.i.l lVar, int i2) {
        b(lVar, i2, false);
    }

    @Override // f.h.b.a.i.w.h.w
    public void b(f.h.b.a.i.l lVar, int i2, boolean z) {
        boolean z2;
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(lVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(f.h.b.a.i.z.a.a(lVar.d())).array());
        if (lVar.c() != null) {
            adler32.update(lVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                f.c.a.a.i.i("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
                return;
            }
        }
        long Z = this.b.Z(lVar);
        SchedulerConfig schedulerConfig = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority d2 = lVar.d();
        builder.setMinimumLatency(schedulerConfig.b(d2, Z, i2));
        Set<SchedulerConfig.Flag> c = schedulerConfig.c().get(d2).c();
        if (c.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", lVar.b());
        persistableBundle.putInt("priority", f.h.b.a.i.z.a.a(lVar.d()));
        if (lVar.c() != null) {
            persistableBundle.putString(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, Base64.encodeToString(lVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        f.c.a.a.i.j("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", lVar, Integer.valueOf(value), Long.valueOf(this.c.b(lVar.d(), Z, i2)), Long.valueOf(Z), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }
}

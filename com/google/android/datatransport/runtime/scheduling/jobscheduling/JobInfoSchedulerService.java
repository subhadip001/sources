package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f.h.b.a.i.d;
import f.h.b.a.i.l;
import f.h.b.a.i.p;
import f.h.b.a.i.w.h.s;
import f.h.b.a.i.z.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        l.a a = l.a();
        a.b(string);
        a.c(a.b(i2));
        if (string2 != null) {
            ((d.b) a).b = Base64.decode(string2, 0);
        }
        s sVar = p.a().f3713d;
        sVar.f3740e.execute(new f.h.b.a.i.w.h.d(sVar, a.a(), i3, new Runnable() { // from class: f.h.b.a.i.w.h.c
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

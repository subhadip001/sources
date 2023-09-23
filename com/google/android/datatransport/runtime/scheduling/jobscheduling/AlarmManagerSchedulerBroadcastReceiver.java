package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import f.h.b.a.i.d;
import f.h.b.a.i.l;
import f.h.b.a.i.p;
import f.h.b.a.i.w.h.s;
import f.h.b.a.i.z.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        l.a a2 = l.a();
        a2.b(queryParameter);
        a2.c(a.b(intValue));
        if (queryParameter2 != null) {
            ((d.b) a2).b = Base64.decode(queryParameter2, 0);
        }
        s sVar = p.a().f3713d;
        sVar.f3740e.execute(new f.h.b.a.i.w.h.d(sVar, a2.a(), i2, new Runnable() { // from class: f.h.b.a.i.w.h.a
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = AlarmManagerSchedulerBroadcastReceiver.a;
            }
        }));
    }
}

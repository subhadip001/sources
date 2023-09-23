package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.p.b.b;
import java.util.Objects;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = k.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        k.c().a(a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                l b = l.b(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Objects.requireNonNull(b);
                synchronized (l.f2227l) {
                    b.f2233i = goAsync;
                    if (b.f2232h) {
                        goAsync.finish();
                        b.f2233i = null;
                    }
                }
                return;
            } catch (IllegalStateException e2) {
                k.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
                return;
            }
        }
        String str = b.f2264i;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}

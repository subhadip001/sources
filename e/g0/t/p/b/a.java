package e.g0.t.p.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.s.g;
import e.g0.t.s.i;

/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public class a {
    public static final String a = k.e("Alarms");

    public static void a(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        k.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i2)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j2) {
        int intValue;
        WorkDatabase workDatabase = lVar.c;
        i iVar = (i) workDatabase.o();
        g a2 = iVar.a(str);
        if (a2 != null) {
            a(context, str, a2.b);
            c(context, str, a2.b, j2);
            return;
        }
        synchronized (e.g0.t.t.f.class) {
            workDatabase.c();
            Long a3 = ((e.g0.t.s.f) workDatabase.n()).a("next_alarm_manager_id");
            int i2 = 0;
            intValue = a3 != null ? a3.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            ((e.g0.t.s.f) workDatabase.n()).b(new e.g0.t.s.d("next_alarm_manager_id", i2));
            workDatabase.l();
            workDatabase.g();
        }
        iVar.b(new g(str, intValue));
        c(context, str, intValue, j2);
    }

    public static void c(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j2, service);
        }
    }
}

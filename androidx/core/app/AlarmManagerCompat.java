package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* loaded from: classes.dex */
public final class AlarmManagerCompat {
    private AlarmManagerCompat() {
    }

    public static void setAlarmClock(AlarmManager alarmManager, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j2, pendingIntent), pendingIntent2);
    }

    public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(i2, j2, pendingIntent);
        } else {
            alarmManager.set(i2, j2, pendingIntent);
        }
    }

    public static void setExact(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        alarmManager.setExact(i2, j2, pendingIntent);
    }

    public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i2, j2, pendingIntent);
        } else {
            setExact(alarmManager, i2, j2, pendingIntent);
        }
    }
}

package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import e.g0.b;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.t.i;
import e.i.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public static final String f660i = k.e("ForceStopRunnable");

    /* renamed from: j  reason: collision with root package name */
    public static final long f661j = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: f  reason: collision with root package name */
    public final Context f662f;

    /* renamed from: g  reason: collision with root package name */
    public final l f663g;

    /* renamed from: h  reason: collision with root package name */
    public int f664h = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = k.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            k c = k.c();
            String str = a;
            if (((k.a) c).b <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.d(context);
        }
    }

    public ForceStopRunnable(Context context, l lVar) {
        this.f662f = context.getApplicationContext();
        this.f663g = lVar;
    }

    public static PendingIntent b(Context context, int i2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i2);
    }

    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent b = b(context, a.I() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f661j;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public boolean c() {
        b bVar = this.f663g.b;
        Objects.requireNonNull(bVar);
        if (TextUtils.isEmpty(null)) {
            k.c().a(f660i, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a = i.a(this.f662f, bVar);
        k.c().a(f660i, String.format("Is default app process = %s", Boolean.valueOf(a)), new Throwable[0]);
        return a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!c()) {
                return;
            }
            while (true) {
                e.g0.t.k.a(this.f662f);
                k.c().a(f660i, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i2 = this.f664h + 1;
                    this.f664h = i2;
                    if (i2 >= 3) {
                        k.c().b(f660i, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        Objects.requireNonNull(this.f663g.b);
                        throw illegalStateException;
                    }
                    k.c().a(f660i, String.format("Retrying after %s", Long.valueOf(i2 * 300)), e2);
                    try {
                        Thread.sleep(this.f664h * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            this.f663g.d();
        }
    }
}

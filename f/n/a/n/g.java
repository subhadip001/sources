package f.n.a.n;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.batchProcessingScreen.BatchScreenActivity;
import com.video_converter.video_compressor.screens.processingScreen.ProcessingScreenActivity;

/* compiled from: NotificationHelper.java */
/* loaded from: classes2.dex */
public class g {
    public Context a;
    public NotificationCompat.Builder c;

    /* renamed from: d  reason: collision with root package name */
    public NotificationManager f7038d;
    public boolean b = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7039e = false;

    public g(Context context) {
        this.a = context;
    }

    public Notification a(boolean z, String str, String str2) {
        NotificationCompat.Builder builder;
        PendingIntent activity;
        this.f7039e = false;
        if (this.b) {
            Context context = this.a;
            String string = context.getString(R.string.notification_channel_progress);
            if (Build.VERSION.SDK_INT >= 26) {
                String string2 = context.getString(R.string.app_name);
                String string3 = context.getString(R.string.channel_description);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null && notificationManager.getNotificationChannel(string) == null) {
                    NotificationChannel notificationChannel = new NotificationChannel(string, string2, 2);
                    notificationChannel.setDescription(string3);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                builder = new NotificationCompat.Builder(context, string);
            } else {
                builder = new NotificationCompat.Builder(context);
            }
            this.c = builder;
            Log.d("NOTIFICATION_HELPER", "buildForegroundNotification: " + z);
            if (!z) {
                Intent intent = new Intent(this.a, ProcessingScreenActivity.class);
                intent.putExtra("FROM_NOTIFICATION_KEY", true);
                intent.setFlags(603979776);
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
            } else {
                Intent intent2 = new Intent(this.a, BatchScreenActivity.class);
                intent2.putExtra("FROM_NOTIFICATION_KEY", true);
                intent2.setFlags(603979776);
                intent2.setAction("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                activity = PendingIntent.getActivity(this.a, 0, intent2, 201326592);
            }
            this.c.setOngoing(true).setAutoCancel(false).setOnlyAlertOnce(true).setSmallIcon(R.drawable.ic_inverse_push_notification).setContentTitle(str).setContentText(str2).setContentIntent(activity).setPriority(-1);
            this.b = false;
        } else {
            this.c.setContentTitle(str);
            this.c.setContentText(str2);
        }
        return this.c.build();
    }

    public final NotificationManager b() {
        if (this.f7038d == null) {
            this.f7038d = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f7038d;
    }

    public void c(String str, String str2) {
        b().cancel(111);
        this.c.setPriority(0);
        this.c.setContentTitle(str);
        this.c.setContentText(str2);
        this.c.setAutoCancel(true);
        this.c.setProgress(0, 0, false);
        b().notify(222, this.c.build());
    }
}

package f.i.a;

import android.app.Notification;
import android.util.Log;
import android.widget.RemoteViews;
import com.inverse.pushnotification.NotificationViewType;
import com.squareup.picasso.Picasso;
import com.video_converter.video_compressor.R;
import i.l.b.i;

/* compiled from: NotificationHelper.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final void a(f fVar, int i2, Notification notification, RemoteViews remoteViews, NotificationViewType notificationViewType, String str) {
        i.e(fVar, "pushNotification");
        i.e(notification, "notification");
        i.e(remoteViews, "notificationView");
        i.e(notificationViewType, "notificationViewType");
        i.e(str, "tag");
        try {
            int ordinal = notificationViewType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && fVar.f6445e != null) {
                    Picasso.d().f(fVar.f6445e).e(remoteViews, R.id.iv_feature, i2, notification);
                }
            } else {
                Picasso.d().f(fVar.f6444d).e(remoteViews, R.id.iv_icon, i2, notification);
            }
        } catch (Exception e2) {
            Log.e(str, "sendNotification: logo load error", e2);
        }
    }
}

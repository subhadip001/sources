package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import d.a.b.a.a;

/* loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    /* loaded from: classes.dex */
    public class NotificationSideChannelStub extends a.AbstractBinderC0014a {
        public NotificationSideChannelStub() {
        }

        @Override // d.a.b.a.a
        public void cancel(String str, int i2, String str2) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i2, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // d.a.b.a.a
        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // d.a.b.a.a
        public void notify(String str, int i2, String str2, Notification notification) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i2, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void cancel(String str, int i2, String str2);

    public abstract void cancelAll(String str);

    public void checkPermission(int i2, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i2 + " is not authorized for package " + str);
    }

    public abstract void notify(String str, int i2, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL)) {
        }
        return null;
    }
}

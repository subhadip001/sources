package e.g0;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final int b;
    public final Notification c;

    public f(int i2, Notification notification, int i3) {
        this.a = i2;
        this.c = notification;
        this.b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.a && this.b == fVar.b) {
            return this.c.equals(fVar.c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

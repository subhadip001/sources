package g.a;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: InternalLogId.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLong f8114d = new AtomicLong();
    public final String a;
    public final String b;
    public final long c;

    public y(String str, String str2, long j2) {
        f.h.b.c.a.x(str, "typeName");
        f.h.b.c.a.m(!str.isEmpty(), "empty type");
        this.a = str;
        this.b = str2;
        this.c = j2;
    }

    public static y a(Class<?> cls, String str) {
        f.h.b.c.a.x(cls, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static y b(String str, String str2) {
        return new y(str, str2, f8114d.incrementAndGet());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a + "<" + this.c + ">");
        if (this.b != null) {
            sb.append(": (");
            sb.append(this.b);
            sb.append(')');
        }
        return sb.toString();
    }
}

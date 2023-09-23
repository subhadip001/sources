package f.l.a.d.d;

import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import i.l.b.i;

/* compiled from: MediaModel.kt */
/* loaded from: classes2.dex */
public class e {
    @f.h.f.y.b("title")
    private final String a;
    @f.h.f.y.b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)
    private final String b;
    @f.h.f.y.b(MediaInformation.KEY_SIZE)
    private final long c;
    @f.h.f.y.b("path")

    /* renamed from: d  reason: collision with root package name */
    private final String f6661d;
    @f.h.f.y.b("selected")

    /* renamed from: e  reason: collision with root package name */
    private boolean f6662e;

    public e(String str, String str2, long j2, String str3, boolean z) {
        i.e(str, "title");
        i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f6661d = str3;
        this.f6662e = z;
    }

    public String a() {
        return this.f6661d;
    }

    public boolean b() {
        return this.f6662e;
    }

    public long c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public void f(boolean z) {
        this.f6662e = z;
    }

    public /* synthetic */ e(String str, String str2, long j2, String str3, boolean z, int i2) {
        this(str, str2, j2, str3, (i2 & 16) != 0 ? false : z);
    }
}

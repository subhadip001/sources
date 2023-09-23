package f.l.a.d.d;

import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import i.l.b.i;

/* compiled from: AudioModel.kt */
/* loaded from: classes2.dex */
public final class a extends e {
    @f.h.f.y.b("title")

    /* renamed from: f  reason: collision with root package name */
    private final String f6643f;
    @f.h.f.y.b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)

    /* renamed from: g  reason: collision with root package name */
    private final String f6644g;
    @f.h.f.y.b(MediaInformation.KEY_SIZE)

    /* renamed from: h  reason: collision with root package name */
    private final long f6645h;
    @f.h.f.y.b("path")

    /* renamed from: i  reason: collision with root package name */
    private final String f6646i;
    @f.h.f.y.b(MediaInformation.KEY_DURATION)

    /* renamed from: j  reason: collision with root package name */
    private final long f6647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, long j2, String str3, long j3) {
        super(str, str2, j2, str3, false, 16);
        i.e(str, "title");
        i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f6643f = str;
        this.f6644g = str2;
        this.f6645h = j2;
        this.f6646i = str3;
        this.f6647j = j3;
    }

    @Override // f.l.a.d.d.e
    public String a() {
        return this.f6646i;
    }

    @Override // f.l.a.d.d.e
    public long c() {
        return this.f6645h;
    }

    @Override // f.l.a.d.d.e
    public String d() {
        return this.f6643f;
    }

    @Override // f.l.a.d.d.e
    public String e() {
        return this.f6644g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return i.a(this.f6643f, aVar.f6643f) && i.a(this.f6644g, aVar.f6644g) && this.f6645h == aVar.f6645h && i.a(this.f6646i, aVar.f6646i) && this.f6647j == aVar.f6647j;
        }
        return false;
    }

    public final long g() {
        return this.f6647j;
    }

    public int hashCode() {
        int a = (defpackage.c.a(this.f6645h) + f.a.b.a.a.I(this.f6644g, this.f6643f.hashCode() * 31, 31)) * 31;
        String str = this.f6646i;
        return defpackage.c.a(this.f6647j) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("AudioModel(title=");
        A.append(this.f6643f);
        A.append(", uri=");
        A.append(this.f6644g);
        A.append(", size=");
        A.append(this.f6645h);
        A.append(", path=");
        A.append((Object) this.f6646i);
        A.append(", duration=");
        A.append(this.f6647j);
        A.append(')');
        return A.toString();
    }
}

package f.l.a.d.d;

import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import com.arthenica.ffmpegkit.StreamInformation;
import i.l.b.i;

/* compiled from: VideoModel.kt */
/* loaded from: classes2.dex */
public final class g extends e {
    @f.h.f.y.b("title")

    /* renamed from: f  reason: collision with root package name */
    private final String f6668f;
    @f.h.f.y.b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)

    /* renamed from: g  reason: collision with root package name */
    private final String f6669g;
    @f.h.f.y.b(MediaInformation.KEY_SIZE)

    /* renamed from: h  reason: collision with root package name */
    private final long f6670h;
    @f.h.f.y.b("path")

    /* renamed from: i  reason: collision with root package name */
    private final String f6671i;
    @f.h.f.y.b(StreamInformation.KEY_WIDTH)

    /* renamed from: j  reason: collision with root package name */
    private String f6672j;
    @f.h.f.y.b(StreamInformation.KEY_HEIGHT)

    /* renamed from: k  reason: collision with root package name */
    private String f6673k;
    @f.h.f.y.b(MediaInformation.KEY_DURATION)

    /* renamed from: l  reason: collision with root package name */
    private Long f6674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, long j2, String str3, String str4, String str5, Long l2) {
        super(str, str2, j2, str3, false, 16);
        i.e(str, "title");
        i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f6668f = str;
        this.f6669g = str2;
        this.f6670h = j2;
        this.f6671i = str3;
        this.f6672j = str4;
        this.f6673k = str5;
        this.f6674l = l2;
    }

    @Override // f.l.a.d.d.e
    public String a() {
        return this.f6671i;
    }

    @Override // f.l.a.d.d.e
    public long c() {
        return this.f6670h;
    }

    @Override // f.l.a.d.d.e
    public String d() {
        return this.f6668f;
    }

    @Override // f.l.a.d.d.e
    public String e() {
        return this.f6669g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return i.a(this.f6668f, gVar.f6668f) && i.a(this.f6669g, gVar.f6669g) && this.f6670h == gVar.f6670h && i.a(this.f6671i, gVar.f6671i) && i.a(this.f6672j, gVar.f6672j) && i.a(this.f6673k, gVar.f6673k) && i.a(this.f6674l, gVar.f6674l);
        }
        return false;
    }

    public final Long g() {
        return this.f6674l;
    }

    public final String h() {
        return this.f6673k;
    }

    public int hashCode() {
        int a = (defpackage.c.a(this.f6670h) + f.a.b.a.a.I(this.f6669g, this.f6668f.hashCode() * 31, 31)) * 31;
        String str = this.f6671i;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6672j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6673k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f6674l;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String i() {
        return this.f6672j;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("VideoModel(title=");
        A.append(this.f6668f);
        A.append(", uri=");
        A.append(this.f6669g);
        A.append(", size=");
        A.append(this.f6670h);
        A.append(", path=");
        A.append((Object) this.f6671i);
        A.append(", width=");
        A.append((Object) this.f6672j);
        A.append(", height=");
        A.append((Object) this.f6673k);
        A.append(", duration=");
        A.append(this.f6674l);
        A.append(')');
        return A.toString();
    }
}

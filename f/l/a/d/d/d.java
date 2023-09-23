package f.l.a.d.d;

import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import com.arthenica.ffmpegkit.StreamInformation;
import i.l.b.i;

/* compiled from: ImageModel.kt */
/* loaded from: classes2.dex */
public final class d extends e {
    @f.h.f.y.b("title")

    /* renamed from: f  reason: collision with root package name */
    private final String f6655f;
    @f.h.f.y.b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)

    /* renamed from: g  reason: collision with root package name */
    private final String f6656g;
    @f.h.f.y.b(MediaInformation.KEY_SIZE)

    /* renamed from: h  reason: collision with root package name */
    private final long f6657h;
    @f.h.f.y.b("path")

    /* renamed from: i  reason: collision with root package name */
    private final String f6658i;
    @f.h.f.y.b(StreamInformation.KEY_WIDTH)

    /* renamed from: j  reason: collision with root package name */
    private final String f6659j;
    @f.h.f.y.b(StreamInformation.KEY_HEIGHT)

    /* renamed from: k  reason: collision with root package name */
    private final String f6660k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, long j2, String str3, String str4, String str5) {
        super(str, str2, j2, str3, false, 16);
        i.e(str, "title");
        i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f6655f = str;
        this.f6656g = str2;
        this.f6657h = j2;
        this.f6658i = str3;
        this.f6659j = str4;
        this.f6660k = str5;
    }

    @Override // f.l.a.d.d.e
    public String a() {
        return this.f6658i;
    }

    @Override // f.l.a.d.d.e
    public long c() {
        return this.f6657h;
    }

    @Override // f.l.a.d.d.e
    public String d() {
        return this.f6655f;
    }

    @Override // f.l.a.d.d.e
    public String e() {
        return this.f6656g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return i.a(this.f6655f, dVar.f6655f) && i.a(this.f6656g, dVar.f6656g) && this.f6657h == dVar.f6657h && i.a(this.f6658i, dVar.f6658i) && i.a(this.f6659j, dVar.f6659j) && i.a(this.f6660k, dVar.f6660k);
        }
        return false;
    }

    public int hashCode() {
        int a = (defpackage.c.a(this.f6657h) + f.a.b.a.a.I(this.f6656g, this.f6655f.hashCode() * 31, 31)) * 31;
        String str = this.f6658i;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6659j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6660k;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ImageModel(title=");
        A.append(this.f6655f);
        A.append(", uri=");
        A.append(this.f6656g);
        A.append(", size=");
        A.append(this.f6657h);
        A.append(", path=");
        A.append((Object) this.f6658i);
        A.append(", width=");
        A.append((Object) this.f6659j);
        A.append(", height=");
        A.append((Object) this.f6660k);
        A.append(')');
        return A.toString();
    }
}

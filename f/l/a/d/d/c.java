package f.l.a.d.d;

import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import i.l.b.i;

/* compiled from: FolderModel.kt */
/* loaded from: classes2.dex */
public final class c extends e {
    @f.h.f.y.b("title")

    /* renamed from: f  reason: collision with root package name */
    private final String f6649f;
    @f.h.f.y.b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)

    /* renamed from: g  reason: collision with root package name */
    private final String f6650g;
    @f.h.f.y.b(MediaInformation.KEY_SIZE)

    /* renamed from: h  reason: collision with root package name */
    private final long f6651h;
    @f.h.f.y.b("path")

    /* renamed from: i  reason: collision with root package name */
    private final String f6652i;
    @f.h.f.y.b("thumb")

    /* renamed from: j  reason: collision with root package name */
    private final String f6653j;
    @f.h.f.y.b("fileCount")

    /* renamed from: k  reason: collision with root package name */
    private final int f6654k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, long j2, String str3, String str4, int i2) {
        super(str, str2, j2, str3, false, 16);
        i.e(str, "title");
        i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        i.e(str4, "thumb");
        this.f6649f = str;
        this.f6650g = str2;
        this.f6651h = j2;
        this.f6652i = str3;
        this.f6653j = str4;
        this.f6654k = i2;
    }

    @Override // f.l.a.d.d.e
    public String a() {
        return this.f6652i;
    }

    @Override // f.l.a.d.d.e
    public long c() {
        return this.f6651h;
    }

    @Override // f.l.a.d.d.e
    public String d() {
        return this.f6649f;
    }

    @Override // f.l.a.d.d.e
    public String e() {
        return this.f6650g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return i.a(this.f6649f, cVar.f6649f) && i.a(this.f6650g, cVar.f6650g) && this.f6651h == cVar.f6651h && i.a(this.f6652i, cVar.f6652i) && i.a(this.f6653j, cVar.f6653j) && this.f6654k == cVar.f6654k;
        }
        return false;
    }

    public final int g() {
        return this.f6654k;
    }

    public final String h() {
        return this.f6653j;
    }

    public int hashCode() {
        int a = (defpackage.c.a(this.f6651h) + f.a.b.a.a.I(this.f6650g, this.f6649f.hashCode() * 31, 31)) * 31;
        String str = this.f6652i;
        return f.a.b.a.a.I(this.f6653j, (a + (str == null ? 0 : str.hashCode())) * 31, 31) + this.f6654k;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("FolderModel(title=");
        A.append(this.f6649f);
        A.append(", uri=");
        A.append(this.f6650g);
        A.append(", size=");
        A.append(this.f6651h);
        A.append(", path=");
        A.append((Object) this.f6652i);
        A.append(", thumb=");
        A.append(this.f6653j);
        A.append(", fileCount=");
        A.append(this.f6654k);
        A.append(')');
        return A.toString();
    }
}

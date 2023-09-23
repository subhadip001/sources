package f.l.a.d.d;

import androidx.core.app.NotificationCompat;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import java.io.Serializable;

/* compiled from: FilterOption.kt */
/* loaded from: classes2.dex */
public final class f implements Serializable {
    @f.h.f.y.b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)

    /* renamed from: f  reason: collision with root package name */
    private String f6663f;
    @f.h.f.y.b("folderName")

    /* renamed from: g  reason: collision with root package name */
    private String f6664g;
    @f.h.f.y.b("file_name")

    /* renamed from: h  reason: collision with root package name */
    private String f6665h;
    @f.h.f.y.b("sortMode")

    /* renamed from: i  reason: collision with root package name */
    private SortMode f6666i;
    @f.h.f.y.b("sortOrder")

    /* renamed from: j  reason: collision with root package name */
    private SortOrder f6667j;

    public f() {
        this(null, null, null, null, null, 31);
    }

    public f(String str, String str2, String str3, SortMode sortMode, SortOrder sortOrder) {
        this.f6663f = null;
        this.f6664g = str2;
        this.f6665h = str3;
        this.f6666i = null;
        this.f6667j = null;
    }

    public final String a() {
        return this.f6663f;
    }

    public final String b() {
        return this.f6665h;
    }

    public final String c() {
        return this.f6664g;
    }

    public final SortMode d() {
        return this.f6666i;
    }

    public final SortOrder e() {
        return this.f6667j;
    }

    public f(String str, String str2, String str3, SortMode sortMode, SortOrder sortOrder, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        int i3 = i2 & 4;
        int i4 = i2 & 8;
        int i5 = i2 & 16;
        this.f6663f = str;
        this.f6664g = str2;
        this.f6665h = null;
        this.f6666i = null;
        this.f6667j = null;
    }
}

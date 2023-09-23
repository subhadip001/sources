package f.l.a.d.d;

import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;

/* compiled from: FilterOption.kt */
/* loaded from: classes2.dex */
public final class b {
    @f.h.f.y.b("mediaType")
    private MediaType a;
    @f.h.f.y.b("folderName")
    private String b;
    @f.h.f.y.b("sortMode")
    private SortMode c;
    @f.h.f.y.b("sortOrder")

    /* renamed from: d  reason: collision with root package name */
    private SortOrder f6648d;

    public b() {
        this(null, null, null, null, 15);
    }

    public b(MediaType mediaType, String str, SortMode sortMode, SortOrder sortOrder, int i2) {
        mediaType = (i2 & 1) != 0 ? null : mediaType;
        str = (i2 & 2) != 0 ? null : str;
        if ((i2 & 4) != 0) {
            f.l.a.d.a aVar = f.l.a.d.a.a;
            sortMode = f.l.a.d.a.b;
        }
        if ((i2 & 8) != 0) {
            f.l.a.d.a aVar2 = f.l.a.d.a.a;
            sortOrder = f.l.a.d.a.c;
        }
        this.a = mediaType;
        this.b = str;
        this.c = sortMode;
        this.f6648d = sortOrder;
    }

    public final String a() {
        return this.b;
    }

    public final MediaType b() {
        return this.a;
    }

    public final SortMode c() {
        return this.c;
    }

    public final SortOrder d() {
        return this.f6648d;
    }
}

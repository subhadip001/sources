package f.l.a.d;

import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;

/* compiled from: AppConstants.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final a a = null;
    public static final SortMode b = SortMode.BY_DATE_MODIFIED;
    public static final SortOrder c = SortOrder.DESC;

    /* renamed from: d  reason: collision with root package name */
    public static final LayoutMode f6631d = LayoutMode.GRID;

    public static final boolean a(int i2) {
        return i2 >= 9 && ((i2 + 1) - (i2 / 9)) % 9 == 0;
    }
}

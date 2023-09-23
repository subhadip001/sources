package f.l.a.f;

import i.l.b.i;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: ViewExtension.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final String a(Long l2) {
        if (l2 == null) {
            return "--";
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return l2.longValue() == 0 ? "" : ((float) l2.longValue()) < 1048576.0f ? i.g(decimalFormat.format(Float.valueOf(((float) l2.longValue()) / 1024.0f)), " KB") : ((float) l2.longValue()) < 1.0737418E9f ? i.g(decimalFormat.format(Float.valueOf(((float) l2.longValue()) / 1048576.0f)), " MB") : ((float) l2.longValue()) < 1.0995116E12f ? i.g(decimalFormat.format(Float.valueOf(((float) l2.longValue()) / 1.0737418E9f)), " GB") : "--";
    }

    public static final String b(Long l2) {
        if (l2 == null) {
            return "--";
        }
        if (l2.longValue() < 0) {
            return "00:00:00";
        }
        long j2 = 60;
        String format = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((l2.longValue() / 3600000) % 24), Long.valueOf((l2.longValue() / 60000) % j2), Long.valueOf((l2.longValue() / 1000) % j2)}, 3));
        i.d(format, "format(format, *args)");
        return format;
    }
}

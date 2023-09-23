package f.h.b.b.c2.q;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.Chapter;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;

/* compiled from: SsaDialogueFormat.java */
/* loaded from: classes.dex */
public final class b {
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4014d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4015e;

    public b(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.f4014d = i5;
        this.f4015e = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c;
        j.c(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String I = b0.I(split[i6].trim());
            I.hashCode();
            switch (I.hashCode()) {
                case 100571:
                    if (I.equals(Chapter.KEY_END)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (I.equals(NotificationCompat.MessagingStyle.Message.KEY_TEXT)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (I.equals(Chapter.KEY_START)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (I.equals("style")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i3 = i6;
            } else if (c == 1) {
                i5 = i6;
            } else if (c == 2) {
                i2 = i6;
            } else if (c == 3) {
                i4 = i6;
            }
        }
        if (i2 == -1 || i3 == -1) {
            return null;
        }
        return new b(i2, i3, i4, i5, split.length);
    }
}

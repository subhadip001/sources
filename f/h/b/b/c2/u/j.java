package f.h.b.b.c2.u;

import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil.java */
/* loaded from: classes.dex */
public final class j {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i2 = b0.a;
        String[] split = str.split("\\.", 2);
        long j2 = 0;
        for (String str2 : b0.G(split[0], ":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }

    public static void c(t tVar) {
        int i2 = tVar.b;
        String g2 = tVar.g();
        if (g2 != null && g2.startsWith("WEBVTT")) {
            return;
        }
        tVar.C(i2);
        String valueOf = String.valueOf(tVar.g());
        throw new ParserException(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
    }
}

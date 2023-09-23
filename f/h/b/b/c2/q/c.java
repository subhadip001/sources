package f.h.b.b.c2.q;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.m;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaStyle.java */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final int b;
    public final Integer c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4016d;

    /* compiled from: SsaStyle.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4017d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4018e;

        public a(int i2, int i3, int i4, int i5, int i6) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.f4017d = i5;
            this.f4018e = i6;
        }
    }

    /* compiled from: SsaStyle.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final Pattern c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        public static final Pattern f4019d = Pattern.compile(b0.k("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        public static final Pattern f4020e = Pattern.compile(b0.k("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        public static final Pattern f4021f = Pattern.compile("\\\\an(\\d+)");
        public final int a;
        public final PointF b;

        public b(int i2, PointF pointF) {
            this.a = i2;
            this.b = pointF;
        }

        public static PointF a(String str) {
            String group;
            String group2;
            Matcher matcher = f4019d.matcher(str);
            Matcher matcher2 = f4020e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(str.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.i("SsaStyle.Overrides", sb.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            Objects.requireNonNull(group);
            float parseFloat = Float.parseFloat(group.trim());
            Objects.requireNonNull(group2);
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public c(String str, int i2, Integer num, float f2) {
        this.a = str;
        this.b = i2;
        this.c = num;
        this.f4016d = f2;
    }

    public static int a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        Log.w("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static Integer b(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            j.c(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(f.h.b.c.a.E(((parseLong >> 24) & 255) ^ 255), f.h.b.c.a.E(parseLong & 255), f.h.b.c.a.E((parseLong >> 8) & 255), f.h.b.c.a.E((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            m.c("SsaStyle", f.a.b.a.a.g(f.a.b.a.a.x(str, 36), "Failed to parse color expression: '", str, "'"), e2);
            return null;
        }
    }
}

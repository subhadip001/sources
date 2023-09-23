package k;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Cookie.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f9121j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f9122k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f9123l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f9124m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9125d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9126e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9127f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9128g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9129h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9130i;

    public j(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f9125d = str3;
        this.f9126e = str4;
        this.f9127f = z;
        this.f9128g = z2;
        this.f9130i = z3;
        this.f9129h = z4;
    }

    public static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long b(String str, int i2, int i3) {
        int a = a(str, i2, i3, false);
        Matcher matcher = f9124m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a < i3) {
            int a2 = a(str, a + 1, i3, true);
            matcher.region(a, a2);
            if (i5 == -1 && matcher.usePattern(f9124m).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 == -1 && matcher.usePattern(f9123l).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else {
                if (i7 == -1) {
                    Pattern pattern = f9122k;
                    if (matcher.usePattern(pattern).matches()) {
                        i7 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(f9121j).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
            }
            a = a(str, a2 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 >= 1601) {
            if (i7 != -1) {
                if (i6 < 1 || i6 > 31) {
                    throw new IllegalArgumentException();
                }
                if (i5 < 0 || i5 > 23) {
                    throw new IllegalArgumentException();
                }
                if (i8 < 0 || i8 > 59) {
                    throw new IllegalArgumentException();
                }
                if (i9 >= 0 && i9 <= 59) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(k.c0.c.f8880e);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, i4);
                    gregorianCalendar.set(2, i7 - 1);
                    gregorianCalendar.set(5, i6);
                    gregorianCalendar.set(11, i5);
                    gregorianCalendar.set(12, i8);
                    gregorianCalendar.set(13, i9);
                    gregorianCalendar.set(14, 0);
                    return gregorianCalendar.getTimeInMillis();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jVar.a.equals(this.a) && jVar.b.equals(this.b) && jVar.f9125d.equals(this.f9125d) && jVar.f9126e.equals(this.f9126e) && jVar.c == this.c && jVar.f9127f == this.f9127f && jVar.f9128g == this.f9128g && jVar.f9129h == this.f9129h && jVar.f9130i == this.f9130i;
        }
        return false;
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.f9126e, f.a.b.a.a.I(this.f9125d, f.a.b.a.a.I(this.b, f.a.b.a.a.I(this.a, 527, 31), 31), 31), 31);
        long j2 = this.c;
        return ((((((((I + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f9127f ? 1 : 0)) * 31) + (!this.f9128g ? 1 : 0)) * 31) + (!this.f9129h ? 1 : 0)) * 31) + (!this.f9130i ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.f9129h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(k.c0.g.d.a.get().format(new Date(this.c)));
            }
        }
        if (!this.f9130i) {
            sb.append("; domain=");
            sb.append(this.f9125d);
        }
        sb.append("; path=");
        sb.append(this.f9126e);
        if (this.f9127f) {
            sb.append("; secure");
        }
        if (this.f9128g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}

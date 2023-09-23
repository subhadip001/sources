package k;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpUrl.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f9133j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9134d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9135e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f9136f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f9137g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9138h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9139i;

    /* compiled from: HttpUrl.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public String a;

        /* renamed from: d  reason: collision with root package name */
        public String f9140d;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f9142f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f9143g;

        /* renamed from: h  reason: collision with root package name */
        public String f9144h;
        public String b = "";
        public String c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f9141e = -1;

        /* compiled from: HttpUrl.java */
        /* renamed from: k.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0236a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f9142f = arrayList;
            arrayList.add("");
        }

        public r a() {
            if (this.a != null) {
                if (this.f9140d != null) {
                    return new r(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public a b(String str) {
            this.f9143g = str != null ? r.n(r.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x01e0, code lost:
            if (r1 <= 65535) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
            if (r7 == ':') goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x030a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x024d -> B:135:0x024e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public k.r.a.EnumC0236a c(k.r r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 854
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k.r.a.c(k.r, java.lang.String):k.r$a$a");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.f9140d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f9140d);
                sb.append(']');
            } else {
                sb.append(this.f9140d);
            }
            int i2 = this.f9141e;
            if (i2 == -1) {
                i2 = r.c(this.a);
            }
            if (i2 != r.c(this.a)) {
                sb.append(':');
                sb.append(i2);
            }
            List<String> list = this.f9142f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append('/');
                sb.append(list.get(i3));
            }
            if (this.f9143g != null) {
                sb.append('?');
                r.i(sb, this.f9143g);
            }
            if (this.f9144h != null) {
                sb.append('#');
                sb.append(this.f9144h);
            }
            return sb.toString();
        }
    }

    public r(a aVar) {
        this.a = aVar.a;
        this.b = k(aVar.b, false);
        this.c = k(aVar.c, false);
        this.f9134d = aVar.f9140d;
        int i2 = aVar.f9141e;
        this.f9135e = i2 == -1 ? c(aVar.a) : i2;
        this.f9136f = l(aVar.f9142f, false);
        List<String> list = aVar.f9143g;
        this.f9137g = list != null ? l(list, true) : null;
        String str = aVar.f9144h;
        this.f9138h = str != null ? j(str, 0, str.length(), false) : null;
        this.f9139i = aVar.toString();
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m(str, i4, i3)))) && (codePointAt != 43 || !z3)))) {
                i4 += Character.charCount(codePointAt);
            } else {
                l.f fVar = new l.f();
                fVar.v0(str, i2, i4);
                l.f fVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            fVar.u0(z ? "+" : "%2B");
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z4) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z && (!z2 || m(str, i4, i3)))))) {
                            fVar.w0(codePointAt2);
                        } else {
                            if (fVar2 == null) {
                                fVar2 = new l.f();
                            }
                            fVar2.w0(codePointAt2);
                            while (!fVar2.s()) {
                                int readByte = fVar2.readByte() & 255;
                                fVar.m0(37);
                                char[] cArr = f9133j;
                                fVar.m0(cArr[(readByte >> 4) & 15]);
                                fVar.m0(cArr[readByte & 15]);
                            }
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return fVar.N();
            }
        }
        return str.substring(i2, i3);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void i(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String j(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                l.f fVar = new l.f();
                fVar.v0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int f2 = k.c0.c.f(str.charAt(i5 + 1));
                        int f3 = k.c0.c.f(str.charAt(i4));
                        if (f2 != -1 && f3 != -1) {
                            fVar.m0((f2 << 4) + f3);
                            i5 = i4;
                        }
                        fVar.w0(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            fVar.m0(32);
                        }
                        fVar.w0(codePointAt);
                    }
                    i5 += Character.charCount(codePointAt);
                }
                return fVar.N();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static String k(String str, boolean z) {
        return j(str, 0, str.length(), z);
    }

    public static boolean m(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && k.c0.c.f(str.charAt(i2 + 1)) != -1 && k.c0.c.f(str.charAt(i4)) != -1;
    }

    public static List<String> n(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public String d() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.f9139i.indexOf(64);
        return this.f9139i.substring(this.f9139i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public String e() {
        int indexOf = this.f9139i.indexOf(47, this.a.length() + 3);
        String str = this.f9139i;
        return this.f9139i.substring(indexOf, k.c0.c.i(str, indexOf, str.length(), "?#"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).f9139i.equals(this.f9139i);
    }

    public List<String> f() {
        int indexOf = this.f9139i.indexOf(47, this.a.length() + 3);
        String str = this.f9139i;
        int i2 = k.c0.c.i(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < i2) {
            int i3 = indexOf + 1;
            int h2 = k.c0.c.h(this.f9139i, i3, i2, '/');
            arrayList.add(this.f9139i.substring(i3, h2));
            indexOf = h2;
        }
        return arrayList;
    }

    public String g() {
        if (this.f9137g == null) {
            return null;
        }
        int indexOf = this.f9139i.indexOf(63) + 1;
        String str = this.f9139i;
        return this.f9139i.substring(indexOf, k.c0.c.h(str, indexOf, str.length(), '#'));
    }

    public String h() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f9139i;
        return this.f9139i.substring(length, k.c0.c.i(str, length, str.length(), ":@"));
    }

    public int hashCode() {
        return this.f9139i.hashCode();
    }

    public final List<String> l(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? j(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public URI o() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = h();
        aVar.c = d();
        aVar.f9140d = this.f9134d;
        aVar.f9141e = this.f9135e != c(this.a) ? this.f9135e : -1;
        aVar.f9142f.clear();
        aVar.f9142f.addAll(f());
        aVar.b(g());
        aVar.f9144h = this.f9138h == null ? null : this.f9139i.substring(this.f9139i.indexOf(35) + 1);
        int size = aVar.f9142f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f9142f.set(i2, b(aVar.f9142f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = aVar.f9143g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = aVar.f9143g.get(i3);
                if (str != null) {
                    aVar.f9143g.set(i3, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = aVar.f9144h;
        if (str2 != null) {
            aVar.f9144h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f9139i;
    }
}

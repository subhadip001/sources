package f.m.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.f;

/* compiled from: HttpUrl.java */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final int b;
    public final List<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6808d;

    /* compiled from: HttpUrl.java */
    /* renamed from: f.m.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0165b {
        public String a;
        public String b;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f6809d;

        public C0165b() {
            ArrayList arrayList = new ArrayList();
            this.f6809d = arrayList;
            arrayList.add("");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (this.b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.b);
                sb.append(']');
            } else {
                sb.append(this.b);
            }
            int i2 = this.c;
            if (i2 == -1) {
                i2 = b.b(this.a);
            }
            if (i2 != b.b(this.a)) {
                sb.append(':');
                sb.append(i2);
            }
            List<String> list = this.f6809d;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append('/');
                sb.append(list.get(i3));
            }
            return sb.toString();
        }
    }

    public b(C0165b c0165b, a aVar) {
        c("", 0, 0, false);
        c("", 0, 0, false);
        this.a = c0165b.b;
        int i2 = c0165b.c;
        this.b = i2 == -1 ? b(c0165b.a) : i2;
        this.c = d(c0165b.f6809d, false);
        this.f6808d = c0165b.toString();
    }

    public static int a(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return -1;
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String c(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                f fVar = new f();
                fVar.v0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int a2 = a(str.charAt(i5 + 1));
                        int a3 = a(str.charAt(i4));
                        if (a2 != -1 && a3 != -1) {
                            fVar.m0((a2 << 4) + a3);
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

    public final List<String> d(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? c(next, 0, next.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f6808d.equals(this.f6808d);
    }

    public int hashCode() {
        return this.f6808d.hashCode();
    }

    public String toString() {
        return this.f6808d;
    }
}

package f.m.a;

import f.m.a.a;
import java.util.Objects;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class c {
    public final f.m.a.b a;
    public final f.m.a.a b;
    public final Object c = this;

    /* compiled from: Request.java */
    /* loaded from: classes2.dex */
    public static class b {
        public f.m.a.b a;
        public a.b b = new a.b();

        public b a(String str, String str2) {
            a.b bVar = this.b;
            Objects.requireNonNull(bVar);
            if (!str.isEmpty()) {
                int length = str.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str.charAt(i3);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        char charAt2 = str2.charAt(i4);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i4), str2));
                        }
                    }
                    while (i2 < bVar.a.size()) {
                        if (str.equalsIgnoreCase(bVar.a.get(i2))) {
                            bVar.a.remove(i2);
                            bVar.a.remove(i2);
                            i2 -= 2;
                        }
                        i2 += 2;
                    }
                    bVar.a.add(str);
                    bVar.a.add(str2.trim());
                    return this;
                }
                throw new IllegalArgumentException("value == null");
            }
            throw new IllegalArgumentException("name is empty");
        }
    }

    public c(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = new f.m.a.a(bVar.b, null);
    }

    public String toString() {
        StringBuilder E = f.a.b.a.a.E("Request{method=", "GET", ", url=");
        E.append(this.a);
        E.append(", tag=");
        Object obj = this.c;
        if (obj == this) {
            obj = null;
        }
        E.append(obj);
        E.append('}');
        return E.toString();
    }
}

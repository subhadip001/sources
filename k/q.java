package k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Headers.java */
/* loaded from: classes2.dex */
public final class q {
    public final String[] a;

    /* compiled from: Headers.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final List<String> a = new ArrayList(20);

        public a a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                String substring = str.substring(1);
                this.a.add("");
                this.a.add(substring.trim());
                return this;
            } else {
                this.a.add("");
                this.a.add(str.trim());
                return this;
            }
        }

        public a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public final void c(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(k.c0.c.l("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char charAt2 = str2.charAt(i3);
                        if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                            throw new IllegalArgumentException(k.c0.c.l("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str, str2));
                        }
                    }
                    return;
                }
                throw new NullPointerException(f.a.b.a.a.q("value for name ", str, " == null"));
            }
            throw new IllegalArgumentException("name is empty");
        }

        public String d(String str) {
            for (int size = this.a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.a.get(size))) {
                    return this.a.get(size + 1);
                }
            }
            return null;
        }

        public a e(String str) {
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i2))) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public q(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public String b(int i2) {
        return this.a[i2 * 2];
    }

    public a c() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public int d() {
        return this.a.length / 2;
    }

    public String e(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && Arrays.equals(((q) obj).a, this.a);
    }

    public List<String> f(String str) {
        int d2 = d();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < d2; i2++) {
            if (str.equalsIgnoreCase(b(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i2));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int d2 = d();
        for (int i2 = 0; i2 < d2; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(e(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}

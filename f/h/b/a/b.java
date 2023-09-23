package f.h.b.a;

import java.util.Objects;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class b {
    public final String a;

    public b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return f.a.b.a.a.u(f.a.b.a.a.A("Encoding{name=\""), this.a, "\"}");
    }
}

package e.i.j;

import java.util.Objects;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes.dex */
public final class f {
    public final Object a;

    public f(Object obj) {
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((f) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("DisplayCutoutCompat{");
        A.append(this.a);
        A.append("}");
        return A.toString();
    }
}

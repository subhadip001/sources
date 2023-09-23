package e.i.i;

import java.util.Objects;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class b<F, S> {
    public final F a;
    public final S b;

    public b(F f2, S s) {
        this.a = f2;
        this.b = s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Objects.equals(bVar.a, this.a) && Objects.equals(bVar.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        F f2 = this.a;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Pair{");
        A.append(this.a);
        A.append(" ");
        A.append(this.b);
        A.append("}");
        return A.toString();
    }
}

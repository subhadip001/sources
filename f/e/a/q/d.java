package f.e.a.q;

import f.e.a.l.j;
import java.security.MessageDigest;
import java.util.Objects;

/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class d implements j {
    public final Object b;

    public d(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(j.a));
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.b.equals(((d) obj).b);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ObjectKey{object=");
        A.append(this.b);
        A.append('}');
        return A.toString();
    }
}

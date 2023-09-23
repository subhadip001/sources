package f.e.a.r;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public class k {
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;

    public k() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b.equals(kVar.b) && l.b(this.c, kVar.c);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("MultiClassKey{first=");
        A.append(this.a);
        A.append(", second=");
        A.append(this.b);
        A.append('}');
        return A.toString();
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }
}

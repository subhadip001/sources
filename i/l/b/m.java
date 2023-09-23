package i.l.b;

/* compiled from: PropertyReference.java */
/* loaded from: classes2.dex */
public abstract class m extends a implements i.o.e {
    public m() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return g().equals(mVar.g()) && this.f8642i.equals(mVar.f8642i) && this.f8643j.equals(mVar.f8643j) && i.a(this.f8640g, mVar.f8640g);
        } else if (obj instanceof i.o.e) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.f8643j.hashCode() + f.a.b.a.a.I(this.f8642i, g().hashCode() * 31, 31);
    }

    public String toString() {
        i.o.a a = a();
        if (a != this) {
            return a.toString();
        }
        return f.a.b.a.a.u(f.a.b.a.a.A("property "), this.f8642i, " (Kotlin reflection is not available)");
    }

    public m(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }
}

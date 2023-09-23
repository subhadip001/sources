package i.l.b;

import java.util.Objects;

/* compiled from: FunctionReference.java */
/* loaded from: classes2.dex */
public class g extends a implements f, i.o.d {

    /* renamed from: l  reason: collision with root package name */
    public final int f8648l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8649m;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f8648l = i2;
        this.f8649m = i3 >> 1;
    }

    @Override // i.l.b.f
    public int d() {
        return this.f8648l;
    }

    @Override // i.l.b.a
    public i.o.a e() {
        Objects.requireNonNull(o.a);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f8642i.equals(gVar.f8642i) && this.f8643j.equals(gVar.f8643j) && this.f8649m == gVar.f8649m && this.f8648l == gVar.f8648l && i.a(this.f8640g, gVar.f8640g) && i.a(g(), gVar.g());
        } else if (obj instanceof i.o.d) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.f8643j.hashCode() + f.a.b.a.a.I(this.f8642i, g() == null ? 0 : g().hashCode() * 31, 31);
    }

    public String toString() {
        i.o.a a = a();
        if (a != this) {
            return a.toString();
        }
        return "<init>".equals(this.f8642i) ? "constructor (Kotlin reflection is not available)" : f.a.b.a.a.u(f.a.b.a.a.A("function "), this.f8642i, " (Kotlin reflection is not available)");
    }
}

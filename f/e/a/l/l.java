package f.e.a.l;

import f.e.a.l.k;
import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class l implements j {
    public final e.f.a<k<?>, Object> b = new f.e.a.r.b();

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            e.f.a<k<?>, Object> aVar = this.b;
            if (i2 >= aVar.f2001h) {
                return;
            }
            k<?> h2 = aVar.h(i2);
            Object l2 = this.b.l(i2);
            k.b<?> bVar = h2.b;
            if (h2.f3237d == null) {
                h2.f3237d = h2.c.getBytes(j.a);
            }
            bVar.a(h2.f3237d, l2, messageDigest);
            i2++;
        }
    }

    public <T> T c(k<T> kVar) {
        if (this.b.e(kVar) >= 0) {
            return (T) this.b.getOrDefault(kVar, null);
        }
        return kVar.a;
    }

    public void d(l lVar) {
        this.b.i(lVar.b);
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.b.equals(((l) obj).b);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Options{values=");
        A.append(this.b);
        A.append('}');
        return A.toString();
    }
}

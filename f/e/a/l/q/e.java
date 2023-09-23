package f.e.a.l.q;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
public final class e implements f.e.a.l.j {
    public final f.e.a.l.j b;
    public final f.e.a.l.j c;

    public e(f.e.a.l.j jVar, f.e.a.l.j jVar2) {
        this.b = jVar;
        this.c = jVar2;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.b.equals(eVar.b) && this.c.equals(eVar.c);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("DataCacheKey{sourceKey=");
        A.append(this.b);
        A.append(", signature=");
        A.append(this.c);
        A.append('}');
        return A.toString();
    }
}

package f.e.a.l.q;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
public final class x implements f.e.a.l.j {

    /* renamed from: j  reason: collision with root package name */
    public static final f.e.a.r.i<Class<?>, byte[]> f3400j = new f.e.a.r.i<>(50);
    public final f.e.a.l.q.b0.b b;
    public final f.e.a.l.j c;

    /* renamed from: d  reason: collision with root package name */
    public final f.e.a.l.j f3401d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3402e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3403f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f3404g;

    /* renamed from: h  reason: collision with root package name */
    public final f.e.a.l.l f3405h;

    /* renamed from: i  reason: collision with root package name */
    public final f.e.a.l.o<?> f3406i;

    public x(f.e.a.l.q.b0.b bVar, f.e.a.l.j jVar, f.e.a.l.j jVar2, int i2, int i3, f.e.a.l.o<?> oVar, Class<?> cls, f.e.a.l.l lVar) {
        this.b = bVar;
        this.c = jVar;
        this.f3401d = jVar2;
        this.f3402e = i2;
        this.f3403f = i3;
        this.f3406i = oVar;
        this.f3404g = cls;
        this.f3405h = lVar;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3402e).putInt(this.f3403f).array();
        this.f3401d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        f.e.a.l.o<?> oVar = this.f3406i;
        if (oVar != null) {
            oVar.a(messageDigest);
        }
        this.f3405h.a(messageDigest);
        f.e.a.r.i<Class<?>, byte[]> iVar = f3400j;
        byte[] a = iVar.a(this.f3404g);
        if (a == null) {
            a = this.f3404g.getName().getBytes(f.e.a.l.j.a);
            iVar.d(this.f3404g, a);
        }
        messageDigest.update(a);
        this.b.d(bArr);
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f3403f == xVar.f3403f && this.f3402e == xVar.f3402e && f.e.a.r.l.b(this.f3406i, xVar.f3406i) && this.f3404g.equals(xVar.f3404g) && this.c.equals(xVar.c) && this.f3401d.equals(xVar.f3401d) && this.f3405h.equals(xVar.f3405h);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        int hashCode = ((((this.f3401d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.f3402e) * 31) + this.f3403f;
        f.e.a.l.o<?> oVar = this.f3406i;
        if (oVar != null) {
            hashCode = (hashCode * 31) + oVar.hashCode();
        }
        int hashCode2 = this.f3404g.hashCode();
        return this.f3405h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ResourceCacheKey{sourceKey=");
        A.append(this.c);
        A.append(", signature=");
        A.append(this.f3401d);
        A.append(", width=");
        A.append(this.f3402e);
        A.append(", height=");
        A.append(this.f3403f);
        A.append(", decodedResourceClass=");
        A.append(this.f3404g);
        A.append(", transformation='");
        A.append(this.f3406i);
        A.append('\'');
        A.append(", options=");
        A.append(this.f3405h);
        A.append('}');
        return A.toString();
    }
}

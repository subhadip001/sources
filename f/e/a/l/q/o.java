package f.e.a.l.q;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
public class o implements f.e.a.l.j {
    public final Object b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3373d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f3374e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f3375f;

    /* renamed from: g  reason: collision with root package name */
    public final f.e.a.l.j f3376g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, f.e.a.l.o<?>> f3377h;

    /* renamed from: i  reason: collision with root package name */
    public final f.e.a.l.l f3378i;

    /* renamed from: j  reason: collision with root package name */
    public int f3379j;

    public o(Object obj, f.e.a.l.j jVar, int i2, int i3, Map<Class<?>, f.e.a.l.o<?>> map, Class<?> cls, Class<?> cls2, f.e.a.l.l lVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
        Objects.requireNonNull(jVar, "Signature must not be null");
        this.f3376g = jVar;
        this.c = i2;
        this.f3373d = i3;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f3377h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f3374e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f3375f = cls2;
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.f3378i = lVar;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.b.equals(oVar.b) && this.f3376g.equals(oVar.f3376g) && this.f3373d == oVar.f3373d && this.c == oVar.c && this.f3377h.equals(oVar.f3377h) && this.f3374e.equals(oVar.f3374e) && this.f3375f.equals(oVar.f3375f) && this.f3378i.equals(oVar.f3378i);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        if (this.f3379j == 0) {
            int hashCode = this.b.hashCode();
            this.f3379j = hashCode;
            int hashCode2 = this.f3376g.hashCode() + (hashCode * 31);
            this.f3379j = hashCode2;
            int i2 = (hashCode2 * 31) + this.c;
            this.f3379j = i2;
            int i3 = (i2 * 31) + this.f3373d;
            this.f3379j = i3;
            int hashCode3 = this.f3377h.hashCode() + (i3 * 31);
            this.f3379j = hashCode3;
            int hashCode4 = this.f3374e.hashCode() + (hashCode3 * 31);
            this.f3379j = hashCode4;
            int hashCode5 = this.f3375f.hashCode() + (hashCode4 * 31);
            this.f3379j = hashCode5;
            this.f3379j = this.f3378i.hashCode() + (hashCode5 * 31);
        }
        return this.f3379j;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("EngineKey{model=");
        A.append(this.b);
        A.append(", width=");
        A.append(this.c);
        A.append(", height=");
        A.append(this.f3373d);
        A.append(", resourceClass=");
        A.append(this.f3374e);
        A.append(", transcodeClass=");
        A.append(this.f3375f);
        A.append(", signature=");
        A.append(this.f3376g);
        A.append(", hashCode=");
        A.append(this.f3379j);
        A.append(", transformations=");
        A.append(this.f3377h);
        A.append(", options=");
        A.append(this.f3378i);
        A.append('}');
        return A.toString();
    }
}

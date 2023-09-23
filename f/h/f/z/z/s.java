package f.h.f.z.z;

import f.h.f.w;
import f.h.f.x;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public class s implements x {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f6317f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Class f6318g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w f6319h;

    public s(Class cls, Class cls2, w wVar) {
        this.f6317f = cls;
        this.f6318g = cls2;
        this.f6319h = wVar;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        if (cls == this.f6317f || cls == this.f6318g) {
            return this.f6319h;
        }
        return null;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Factory[type=");
        A.append(this.f6317f.getName());
        A.append("+");
        A.append(this.f6318g.getName());
        A.append(",adapter=");
        A.append(this.f6319h);
        A.append("]");
        return A.toString();
    }
}

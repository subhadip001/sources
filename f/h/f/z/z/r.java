package f.h.f.z.z;

import f.h.f.w;
import f.h.f.x;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public class r implements x {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f6314f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Class f6315g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w f6316h;

    public r(Class cls, Class cls2, w wVar) {
        this.f6314f = cls;
        this.f6315g = cls2;
        this.f6316h = wVar;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        if (cls == this.f6314f || cls == this.f6315g) {
            return this.f6316h;
        }
        return null;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Factory[type=");
        A.append(this.f6315g.getName());
        A.append("+");
        A.append(this.f6314f.getName());
        A.append(",adapter=");
        A.append(this.f6316h);
        A.append("]");
        return A.toString();
    }
}

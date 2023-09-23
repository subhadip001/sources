package f.h.f.z.z;

import f.h.f.w;
import f.h.f.x;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public class q implements x {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f6312f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f6313g;

    public q(Class cls, w wVar) {
        this.f6312f = cls;
        this.f6313g = wVar;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        if (aVar.a == this.f6312f) {
            return this.f6313g;
        }
        return null;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Factory[type=");
        A.append(this.f6312f.getName());
        A.append(",adapter=");
        A.append(this.f6313g);
        A.append("]");
        return A.toString();
    }
}

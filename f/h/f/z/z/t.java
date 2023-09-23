package f.h.f.z.z;

import com.google.gson.JsonSyntaxException;
import f.h.f.w;
import f.h.f.x;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public class t implements x {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f6320f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f6321g;

    /* JADX INFO: Add missing generic type declarations: [T1] */
    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class a<T1> extends w<T1> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        @Override // f.h.f.w
        public T1 a(f.h.f.b0.a aVar) {
            T1 t1 = (T1) t.this.f6321g.a(aVar);
            if (t1 == null || this.a.isInstance(t1)) {
                return t1;
            }
            StringBuilder A = f.a.b.a.a.A("Expected a ");
            A.append(this.a.getName());
            A.append(" but was ");
            A.append(t1.getClass().getName());
            throw new JsonSyntaxException(A.toString());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, T1 t1) {
            t.this.f6321g.b(bVar, t1);
        }
    }

    public t(Class cls, w wVar) {
        this.f6320f = cls;
        this.f6321g = wVar;
    }

    @Override // f.h.f.x
    public <T2> w<T2> a(f.h.f.j jVar, f.h.f.a0.a<T2> aVar) {
        Class<? super T2> cls = aVar.a;
        if (this.f6320f.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Factory[typeHierarchy=");
        A.append(this.f6320f.getName());
        A.append(",adapter=");
        A.append(this.f6321g);
        A.append("]");
        return A.toString();
    }
}

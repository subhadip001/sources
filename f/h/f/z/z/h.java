package f.h.f.z.z;

import f.h.f.w;
import f.h.f.x;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes2.dex */
public final class h extends w<Object> {
    public static final x b = new a();
    public final f.h.f.j a;

    /* compiled from: ObjectTypeAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements x {
        @Override // f.h.f.x
        public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            if (aVar.a == Object.class) {
                return new h(jVar);
            }
            return null;
        }
    }

    public h(f.h.f.j jVar) {
        this.a = jVar;
    }

    @Override // f.h.f.w
    public Object a(f.h.f.b0.a aVar) {
        int ordinal = aVar.s0().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.F()) {
                arrayList.add(a(aVar));
            }
            aVar.p();
            return arrayList;
        } else if (ordinal == 2) {
            f.h.f.z.s sVar = new f.h.f.z.s();
            aVar.f();
            while (aVar.F()) {
                sVar.put(aVar.d0(), a(aVar));
            }
            aVar.q();
            return sVar;
        } else if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        aVar.i0();
                        return null;
                    }
                    throw new IllegalStateException();
                }
                return Boolean.valueOf(aVar.O());
            }
            return Double.valueOf(aVar.T());
        } else {
            return aVar.q0();
        }
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Object obj) {
        if (obj == null) {
            bVar.F();
            return;
        }
        f.h.f.j jVar = this.a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(jVar);
        w e2 = jVar.e(new f.h.f.a0.a(cls));
        if (e2 instanceof h) {
            bVar.g();
            bVar.q();
            return;
        }
        e2.b(bVar, obj);
    }
}

package f.e.a.l.s.h;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public class f {
    public final List<a<?, ?>> a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final e<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.a = cls;
            this.b = cls2;
            this.c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }
}

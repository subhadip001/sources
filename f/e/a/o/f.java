package f.e.a.o;

import f.e.a.l.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public class f {
    public final List<a<?>> a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final Class<T> a;
        public final n<T> b;

        public a(Class<T> cls, n<T> nVar) {
            this.a = cls;
            this.b = nVar;
        }
    }

    public synchronized <Z> n<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a<?> aVar = this.a.get(i2);
            if (aVar.a.isAssignableFrom(cls)) {
                return (n<Z>) aVar.b;
            }
        }
        return null;
    }
}

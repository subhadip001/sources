package f.e.a.l.p;

import f.e.a.l.p.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public class f {
    public static final e.a<?> b = new a();
    public final Map<Class<?>, e.a<?>> a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public class a implements e.a<Object> {
        @Override // f.e.a.l.p.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // f.e.a.l.p.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public static final class b implements e<Object> {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // f.e.a.l.p.e
        public Object a() {
            return this.a;
        }

        @Override // f.e.a.l.p.e
        public void b() {
        }
    }
}

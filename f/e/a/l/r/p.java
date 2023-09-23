package f.e.a.l.r;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public class p {
    public final r a;
    public final a b;

    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: classes.dex */
    public static class a {
        public final Map<Class<?>, C0082a<?>> a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: f.e.a.l.r.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0082a<Model> {
            public final List<n<Model, ?>> a;

            public C0082a(List<n<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public p(e.i.i.c<List<Throwable>> cVar) {
        r rVar = new r(cVar);
        this.b = new a();
        this.a = rVar;
    }
}

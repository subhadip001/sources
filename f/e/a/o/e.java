package f.e.a.o;

import f.e.a.l.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public class e {
    public final List<String> a = new ArrayList();
    public final Map<String, List<a<?, ?>>> b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: classes.dex */
    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final m<T, R> c;

        public a(Class<T> cls, Class<R> cls2, m<T, R> mVar) {
            this.a = cls;
            this.b = cls2;
            this.c = mVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}

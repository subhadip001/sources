package f.h.c.b;

import f.h.c.b.s;
import f.h.c.b.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableListMultimap.java */
/* loaded from: classes.dex */
public class r<K, V> extends u<K, V> implements Object<K, V> {

    /* compiled from: ImmutableListMultimap.java */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends u.a<K, V> {
        public r<K, V> a() {
            Set<Map.Entry<K, Collection<V>>> entrySet = this.a.entrySet();
            if (entrySet.isEmpty()) {
                return n.f5957k;
            }
            s.a aVar = new s.a(entrySet.size());
            int i2 = 0;
            for (Map.Entry<K, Collection<V>> entry : entrySet) {
                K key = entry.getKey();
                q m2 = q.m(entry.getValue());
                if (!m2.isEmpty()) {
                    aVar.c(key, m2);
                    i2 += m2.size();
                }
            }
            return new r<>(aVar.a(), i2);
        }

        public a<K, V> b(K k2, V... vArr) {
            List<V> asList = Arrays.asList(vArr);
            Collection<V> collection = this.a.get(k2);
            if (collection != null) {
                for (V v : asList) {
                    f.h.b.c.a.v(k2, v);
                    collection.add(v);
                }
            } else {
                Iterator it = asList.iterator();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        Object next = it.next();
                        f.h.b.c.a.v(k2, next);
                        arrayList.add(next);
                    }
                    this.a.put(k2, arrayList);
                }
            }
            return this;
        }
    }

    public r(s<K, q<V>> sVar, int i2) {
        super(sVar, i2);
    }

    public static <K, V> a<K, V> f() {
        return new a<>();
    }
}

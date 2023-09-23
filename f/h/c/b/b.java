package f.h.c.b;

import java.util.Collection;
import java.util.Map;

/* compiled from: AbstractListMultimap.java */
/* loaded from: classes.dex */
public abstract class b<K, V> extends c<K, V> implements Object<K, V> {
    public b(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // f.h.c.b.e, f.h.c.b.g0
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f5923h;
        if (map == null) {
            Map<K, Collection<V>> c = c();
            this.f5923h = c;
            return c;
        }
        return map;
    }

    @Override // f.h.c.b.e, java.lang.Object
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

package f.h.c.b;

import f.h.c.b.c;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: Maps.java */
/* loaded from: classes.dex */
public abstract class f0<K, V> extends AbstractMap<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f5926f;

    /* renamed from: g  reason: collision with root package name */
    public transient Collection<V> f5927g;

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f5926f;
        if (set == null) {
            c.b.a aVar = new c.b.a();
            this.f5926f = aVar;
            return aVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f5927g;
        if (collection == null) {
            e0 e0Var = new e0(this);
            this.f5927g = e0Var;
            return e0Var;
        }
        return collection;
    }
}

package f.h.c.b;

import f.h.c.b.c;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: Multimaps.java */
/* loaded from: classes.dex */
public class i0<K, V> extends b<K, V> {

    /* renamed from: k  reason: collision with root package name */
    public transient f.h.c.a.p<? extends List<V>> f5931k;

    public i0(Map<K, Collection<V>> map, f.h.c.a.p<? extends List<V>> pVar) {
        super(map);
        Objects.requireNonNull(pVar);
        this.f5931k = pVar;
    }

    @Override // f.h.c.b.e
    public Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.f5888i;
        if (map instanceof NavigableMap) {
            return new c.e((NavigableMap) this.f5888i);
        }
        if (map instanceof SortedMap) {
            return new c.h((SortedMap) this.f5888i);
        }
        return new c.b(this.f5888i);
    }

    @Override // f.h.c.b.e
    public Set<K> d() {
        Map<K, Collection<V>> map = this.f5888i;
        if (map instanceof NavigableMap) {
            return new c.f((NavigableMap) this.f5888i);
        }
        if (map instanceof SortedMap) {
            return new c.i((SortedMap) this.f5888i);
        }
        return new c.d(this.f5888i);
    }

    @Override // f.h.c.b.c
    public Collection j() {
        return this.f5931k.get();
    }
}

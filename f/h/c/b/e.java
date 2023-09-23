package f.h.c.b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractMultimap.java */
/* loaded from: classes.dex */
public abstract class e<K, V> implements g0<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public transient Set<K> f5921f;

    /* renamed from: g  reason: collision with root package name */
    public transient Collection<V> f5922g;

    /* renamed from: h  reason: collision with root package name */
    public transient Map<K, Collection<V>> f5923h;

    /* compiled from: AbstractMultimap.java */
    /* loaded from: classes.dex */
    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return e.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e.this.size();
        }
    }

    @Override // f.h.c.b.g0
    public abstract Map<K, Collection<V>> a();

    public boolean b(Object obj) {
        for (Collection<V> collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> c();

    public abstract Set<K> d();

    public abstract Iterator<V> e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return a().equals(((g0) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}

package f.h.c.b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: Maps.java */
/* loaded from: classes.dex */
public class e0<K, V> extends AbstractCollection<V> {

    /* renamed from: f  reason: collision with root package name */
    public final Map<K, V> f5925f;

    public e0(Map<K, V> map) {
        this.f5925f = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f5925f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f5925f.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f5925f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new b0(this.f5925f.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry<K, V> entry : this.f5925f.entrySet()) {
                if (f.h.b.c.a.i0(obj, entry.getValue())) {
                    this.f5925f.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f5925f.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f5925f.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f5925f.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f5925f.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f5925f.size();
    }
}

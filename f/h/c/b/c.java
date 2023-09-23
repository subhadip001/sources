package f.h.c.b;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: classes.dex */
public abstract class c<K, V> extends f.h.c.b.e<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public transient Map<K, Collection<V>> f5888i;

    /* renamed from: j  reason: collision with root package name */
    public transient int f5889j;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class a extends c<K, V>.AbstractC0134c<V> {
        public a(c cVar) {
            super();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class b extends f0<K, Collection<V>> {

        /* renamed from: h  reason: collision with root package name */
        public final transient Map<K, Collection<V>> f5890h;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a extends c0<K, Collection<V>> {
            public a() {
            }

            @Override // f.h.c.b.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = b.this.f5890h.entrySet();
                Objects.requireNonNull(entrySet);
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0133b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Collection<V> collection;
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    c cVar = c.this;
                    Object key = entry.getKey();
                    Map<K, Collection<V>> map = cVar.f5888i;
                    Objects.requireNonNull(map);
                    try {
                        collection = map.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        collection = null;
                    }
                    Collection<V> collection2 = collection;
                    if (collection2 != null) {
                        int size = collection2.size();
                        collection2.clear();
                        cVar.f5889j -= size;
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: f.h.c.b.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0133b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: f  reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f5893f;

            /* renamed from: g  reason: collision with root package name */
            public Collection<V> f5894g;

            public C0133b() {
                this.f5893f = b.this.f5890h.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5893f.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry<K, Collection<V>> next = this.f5893f.next();
                this.f5894g = next.getValue();
                return b.this.a(next);
            }

            @Override // java.util.Iterator
            public void remove() {
                f.h.b.c.a.C(this.f5894g != null, "no calls to next() since the last call to remove()");
                this.f5893f.remove();
                c.i(c.this, this.f5894g.size());
                this.f5894g.clear();
                this.f5894g = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f5890h = map;
        }

        public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            Object kVar;
            K key = entry.getKey();
            f.h.c.b.b bVar = (f.h.c.b.b) c.this;
            Objects.requireNonNull(bVar);
            List list = (List) entry.getValue();
            if (list instanceof RandomAccess) {
                kVar = new g(bVar, key, list, null);
            } else {
                kVar = new k(key, list, null);
            }
            return new p(key, kVar);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<K, Collection<V>> map = this.f5890h;
            c cVar = c.this;
            if (map == cVar.f5888i) {
                cVar.clear();
                return;
            }
            C0133b c0133b = new C0133b();
            while (c0133b.hasNext()) {
                c0133b.next();
                c0133b.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f5890h;
            Objects.requireNonNull(map);
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f5890h.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Collection<V> collection;
            Object kVar;
            Map<K, Collection<V>> map = this.f5890h;
            Objects.requireNonNull(map);
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            f.h.c.b.b bVar = (f.h.c.b.b) c.this;
            Objects.requireNonNull(bVar);
            List list = (List) collection2;
            if (list instanceof RandomAccess) {
                kVar = new g(bVar, obj, list, null);
            } else {
                kVar = new k(obj, list, null);
            }
            return kVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f5890h.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            c cVar = c.this;
            Set<K> set = cVar.f5921f;
            if (set == null) {
                Set<K> d2 = cVar.d();
                cVar.f5921f = d2;
                return d2;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            Collection<V> remove = this.f5890h.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> j2 = c.this.j();
            j2.addAll(remove);
            c.i(c.this, remove.size());
            remove.clear();
            return j2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f5890h.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f5890h.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: f.h.c.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public abstract class AbstractC0134c<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f5896f;

        /* renamed from: g  reason: collision with root package name */
        public K f5897g = null;

        /* renamed from: h  reason: collision with root package name */
        public Collection<V> f5898h = null;

        /* renamed from: i  reason: collision with root package name */
        public Iterator<V> f5899i = y.INSTANCE;

        public AbstractC0134c() {
            this.f5896f = c.this.f5888i.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5896f.hasNext() || this.f5899i.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (!this.f5899i.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f5896f.next();
                this.f5897g = next.getKey();
                Collection<V> value = next.getValue();
                this.f5898h = value;
                this.f5899i = value.iterator();
            }
            return this.f5899i.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f5899i.remove();
            Collection<V> collection = this.f5898h;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f5896f.remove();
            }
            c.g(c.this);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class d extends d0<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a implements Iterator<K> {

            /* renamed from: f  reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f5902f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Iterator f5903g;

            public a(Iterator it) {
                this.f5903g = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5903g.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f5903g.next();
                this.f5902f = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                f.h.b.c.a.C(this.f5902f != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f5902f.getValue();
                this.f5903g.remove();
                c.i(c.this, value.size());
                value.clear();
                this.f5902f = null;
            }
        }

        public d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f5920f.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || this.f5920f.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f5920f.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.f5920f.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i2;
            Collection collection = (Collection) this.f5920f.remove(obj);
            if (collection != null) {
                i2 = collection.size();
                collection.clear();
                c.i(c.this, i2);
            } else {
                i2 = 0;
            }
            return i2 > 0;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class e extends c<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // f.h.c.b.c.h
        public SortedSet b() {
            return new f(d());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, Collection<V>> ceilingEntry = d().ceilingEntry(k2);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return d().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return ((e) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(d().descendingMap());
        }

        @Override // f.h.c.b.c.h, f.h.c.b.c.b, java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public NavigableSet<K> keySet() {
            SortedSet<K> sortedSet = this.f5907j;
            if (sortedSet == null) {
                sortedSet = b();
                this.f5907j = sortedSet;
            }
            return (NavigableSet) sortedSet;
        }

        public Map.Entry<K, Collection<V>> f(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> j2 = c.this.j();
                j2.addAll(next.getValue());
                it.remove();
                K key = next.getKey();
                Objects.requireNonNull((f.h.c.b.b) c.this);
                return new p(key, Collections.unmodifiableList((List) j2));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, Collection<V>> floorEntry = d().floorEntry(k2);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return d().floorKey(k2);
        }

        @Override // f.h.c.b.c.h
        /* renamed from: g */
        public NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.f5890h);
        }

        @Override // f.h.c.b.c.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, Collection<V>> higherEntry = d().higherEntry(k2);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return d().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, Collection<V>> lowerEntry = d().lowerEntry(k2);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return d().lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(((f0) descendingMap()).entrySet().iterator());
        }

        @Override // f.h.c.b.c.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // f.h.c.b.c.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
            return new e(d().headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
            return new e(d().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
            return new e(d().tailMap(k2, z));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class f extends c<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // f.h.c.b.c.i
        /* renamed from: b */
        public NavigableMap<K, Collection<V>> a() {
            return (NavigableMap) ((SortedMap) this.f5920f);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return a().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return ((d) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(a().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return a().floorKey(k2);
        }

        @Override // f.h.c.b.c.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return a().higherKey(k2);
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return a().lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            d.a aVar = (d.a) iterator();
            if (aVar.hasNext()) {
                K k2 = (K) aVar.next();
                aVar.remove();
                return k2;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            d.a aVar = (d.a) descendingIterator();
            if (aVar.hasNext()) {
                K k2 = (K) aVar.next();
                aVar.remove();
                return k2;
            }
            return null;
        }

        @Override // f.h.c.b.c.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // f.h.c.b.c.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
            return new f(a().headMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return new f(a().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
            return new f(a().tailMap(k2, z));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class g extends c<K, V>.k implements RandomAccess {
        public g(c cVar, K k2, List<V> list, c<K, V>.j jVar) {
            super(k2, list, jVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class h extends c<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: j  reason: collision with root package name */
        public SortedSet<K> f5907j;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> b() {
            return new i(d());
        }

        @Override // f.h.c.b.c.b, java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f5907j;
            if (sortedSet == null) {
                SortedSet<K> b = b();
                this.f5907j = b;
                return b;
            }
            return sortedSet;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f5890h;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new h(d().headMap(k2));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new h(d().subMap(k2, k3));
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new h(d().tailMap(k2));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class i extends c<K, V>.d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.f5920f;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return a().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new i(a().headMap(k2));
        }

        @Override // java.util.SortedSet
        public K last() {
            return a().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new i(a().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new i(a().tailMap(k2));
        }
    }

    public c(Map<K, Collection<V>> map) {
        f.h.b.c.a.l(map.isEmpty());
        this.f5888i = map;
    }

    public static /* synthetic */ int f(c cVar) {
        int i2 = cVar.f5889j;
        cVar.f5889j = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int g(c cVar) {
        int i2 = cVar.f5889j;
        cVar.f5889j = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int h(c cVar, int i2) {
        int i3 = cVar.f5889j + i2;
        cVar.f5889j = i3;
        return i3;
    }

    public static /* synthetic */ int i(c cVar, int i2) {
        int i3 = cVar.f5889j - i2;
        cVar.f5889j = i3;
        return i3;
    }

    @Override // f.h.c.b.g0
    public void clear() {
        for (Collection<V> collection : this.f5888i.values()) {
            collection.clear();
        }
        this.f5888i.clear();
        this.f5889j = 0;
    }

    @Override // f.h.c.b.e
    public Iterator<V> e() {
        return new a(this);
    }

    public abstract Collection<V> j();

    @Override // f.h.c.b.g0
    public int size() {
        return this.f5889j;
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class k extends c<K, V>.j implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a extends c<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean isEmpty = k.this.isEmpty();
                b().add(v);
                c.f(c.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f5915f;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                b().set(v);
            }

            public a(int i2) {
                super(((List) k.this.f5911g).listIterator(i2));
            }
        }

        public k(K k2, List<V> list, c<K, V>.j jVar) {
            super(k2, list, jVar);
        }

        @Override // java.util.List
        public void add(int i2, V v) {
            b();
            boolean isEmpty = this.f5911g.isEmpty();
            ((List) this.f5911g).add(i2, v);
            c.f(c.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f5911g).addAll(i2, collection);
            if (addAll) {
                c.h(c.this, this.f5911g.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i2) {
            b();
            return (V) ((List) this.f5911g).get(i2);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            b();
            return ((List) this.f5911g).indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            b();
            return ((List) this.f5911g).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            b();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i2) {
            b();
            V v = (V) ((List) this.f5911g).remove(i2);
            c.g(c.this);
            c();
            return v;
        }

        @Override // java.util.List
        public V set(int i2, V v) {
            b();
            return (V) ((List) this.f5911g).set(i2, v);
        }

        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
            b();
            c cVar = c.this;
            K k2 = this.f5910f;
            List subList = ((List) this.f5911g).subList(i2, i3);
            c<K, V>.j jVar = this.f5912h;
            if (jVar == null) {
                jVar = this;
            }
            Objects.requireNonNull(cVar);
            if (subList instanceof RandomAccess) {
                return new g(cVar, k2, subList, jVar);
            }
            return new k(k2, subList, jVar);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
            b();
            return new a(i2);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: classes.dex */
    public class j extends AbstractCollection<V> {

        /* renamed from: f  reason: collision with root package name */
        public final K f5910f;

        /* renamed from: g  reason: collision with root package name */
        public Collection<V> f5911g;

        /* renamed from: h  reason: collision with root package name */
        public final c<K, V>.j f5912h;

        /* renamed from: i  reason: collision with root package name */
        public final Collection<V> f5913i;

        public j(K k2, Collection<V> collection, c<K, V>.j jVar) {
            this.f5910f = k2;
            this.f5911g = collection;
            this.f5912h = jVar;
            this.f5913i = jVar == null ? null : jVar.f5911g;
        }

        public void a() {
            c<K, V>.j jVar = this.f5912h;
            if (jVar != null) {
                jVar.a();
            } else {
                c.this.f5888i.put(this.f5910f, this.f5911g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            b();
            boolean isEmpty = this.f5911g.isEmpty();
            boolean add = this.f5911g.add(v);
            if (add) {
                c.f(c.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f5911g.addAll(collection);
            if (addAll) {
                c.h(c.this, this.f5911g.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public void b() {
            Collection<V> collection;
            c<K, V>.j jVar = this.f5912h;
            if (jVar != null) {
                jVar.b();
                if (this.f5912h.f5911g != this.f5913i) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f5911g.isEmpty() || (collection = c.this.f5888i.get(this.f5910f)) == null) {
            } else {
                this.f5911g = collection;
            }
        }

        public void c() {
            c<K, V>.j jVar = this.f5912h;
            if (jVar != null) {
                jVar.c();
            } else if (this.f5911g.isEmpty()) {
                c.this.f5888i.remove(this.f5910f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f5911g.clear();
            c.i(c.this, size);
            c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            b();
            return this.f5911g.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            b();
            return this.f5911g.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            b();
            return this.f5911g.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            b();
            return this.f5911g.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            b();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            b();
            boolean remove = this.f5911g.remove(obj);
            if (remove) {
                c.g(c.this);
                c();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f5911g.removeAll(collection);
            if (removeAll) {
                c.h(c.this, this.f5911g.size() - size);
                c();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean retainAll = this.f5911g.retainAll(collection);
            if (retainAll) {
                c.h(c.this, this.f5911g.size() - size);
                c();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            b();
            return this.f5911g.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            b();
            return this.f5911g.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: classes.dex */
        public class a implements Iterator<V> {

            /* renamed from: f  reason: collision with root package name */
            public final Iterator<V> f5915f;

            /* renamed from: g  reason: collision with root package name */
            public final Collection<V> f5916g;

            public a() {
                Iterator<V> it;
                Collection<V> collection = j.this.f5911g;
                this.f5916g = collection;
                if (collection instanceof List) {
                    it = ((List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.f5915f = it;
            }

            public void a() {
                j.this.b();
                if (j.this.f5911g != this.f5916g) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f5915f.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                a();
                return this.f5915f.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f5915f.remove();
                c.g(c.this);
                j.this.c();
            }

            public a(Iterator<V> it) {
                this.f5916g = j.this.f5911g;
                this.f5915f = it;
            }
        }
    }
}

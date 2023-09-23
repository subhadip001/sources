package e.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
public abstract class g<K, V> {
    public g<K, V>.b a;
    public g<K, V>.c b;
    public g<K, V>.e c;

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        public final int f1983f;

        /* renamed from: g  reason: collision with root package name */
        public int f1984g;

        /* renamed from: h  reason: collision with root package name */
        public int f1985h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1986i = false;

        public a(int i2) {
            this.f1983f = i2;
            this.f1984g = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1985h < this.f1984g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) g.this.b(this.f1985h, this.f1983f);
                this.f1985h++;
                this.f1986i = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1986i) {
                int i2 = this.f1985h - 1;
                this.f1985h = i2;
                this.f1984g--;
                this.f1986i = false;
                g.this.h(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d2 = g.this.d();
            for (Map.Entry<K, V> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d2 != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e2 = g.this.e(entry.getKey());
                if (e2 < 0) {
                    return false;
                }
                return e.f.d.c(g.this.b(e2, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int d2 = g.this.d() - 1; d2 >= 0; d2--) {
                Object b = g.this.b(d2, 0);
                Object b2 = g.this.b(d2, 1);
                i2 += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> c = g.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int d2 = g.this.d() - 1; d2 >= 0; d2--) {
                Object b = g.this.b(d2, 0);
                i2 += b == null ? 0 : b.hashCode();
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e2 = g.this.e(obj);
            if (e2 >= 0) {
                g.this.h(e2);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> c = g.this.c();
            int size = c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c.remove(it.next());
            }
            return size != c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.m(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public int f1990f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1992h = false;

        /* renamed from: g  reason: collision with root package name */
        public int f1991g = -1;

        public d() {
            this.f1990f = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f1992h) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return e.f.d.c(entry.getKey(), g.this.b(this.f1991g, 0)) && e.f.d.c(entry.getValue(), g.this.b(this.f1991g, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1992h) {
                return (K) g.this.b(this.f1991g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1992h) {
                return (V) g.this.b(this.f1991g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1991g < this.f1990f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f1992h) {
                Object b = g.this.b(this.f1991g, 0);
                Object b2 = g.this.b(this.f1991g, 1);
                return (b == null ? 0 : b.hashCode()) ^ (b2 != null ? b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.f1991g++;
                this.f1992h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1992h) {
                g.this.h(this.f1991g);
                this.f1991g--;
                this.f1990f--;
                this.f1992h = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f1992h) {
                return (V) g.this.i(this.f1991g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f2 = g.this.f(obj);
            if (f2 >= 0) {
                g.this.h(f2);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d2 = g.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < d2) {
                if (collection.contains(g.this.b(i2, 1))) {
                    g.this.h(i2);
                    i2--;
                    d2--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d2 = g.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < d2) {
                if (!collection.contains(g.this.b(i2, 1))) {
                    g.this.h(i2);
                    i2--;
                    d2--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.m(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i2, int i3);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k2, V v);

    public abstract void h(int i2);

    public abstract V i(int i2, V v);

    public Object[] l(int i2) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] m(T[] tArr, int i2) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2));
        }
        for (int i3 = 0; i3 < d2; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}

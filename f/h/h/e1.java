package f.h.h;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes2.dex */
public class e1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f6331m = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f6332f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6335i;

    /* renamed from: j  reason: collision with root package name */
    public volatile e1<K, V>.f f6336j;

    /* renamed from: l  reason: collision with root package name */
    public volatile e1<K, V>.b f6338l;

    /* renamed from: g  reason: collision with root package name */
    public List<e1<K, V>.d> f6333g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public Map<K, V> f6334h = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    public Map<K, V> f6337k = Collections.emptyMap();

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        public int f6339f;

        /* renamed from: g  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6340g;

        public a(d1 d1Var) {
            this.f6339f = e1.this.f6333g.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6340g == null) {
                this.f6340g = e1.this.f6337k.entrySet().iterator();
            }
            return this.f6340g;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f6339f;
            return (i2 > 0 && i2 <= e1.this.f6333g.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<e1<K, V>.d> list = e1.this.f6333g;
            int i2 = this.f6339f - 1;
            this.f6339f = i2;
            return list.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class b extends e1<K, V>.f {
        public b(d1 d1Var) {
            super(null);
        }

        @Override // f.h.h.e1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(null);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public static class c {
        public static final Iterator<Object> a = new a();
        public static final Iterable<Object> b = new b();

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes2.dex */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes2.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return c.a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        public int f6346f = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6347g;

        /* renamed from: h  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6348h;

        public e(d1 d1Var) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6348h == null) {
                this.f6348h = e1.this.f6334h.entrySet().iterator();
            }
            return this.f6348h;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6346f + 1 >= e1.this.f6333g.size()) {
                return !e1.this.f6334h.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            this.f6347g = true;
            int i2 = this.f6346f + 1;
            this.f6346f = i2;
            if (i2 < e1.this.f6333g.size()) {
                return e1.this.f6333g.get(this.f6346f);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f6347g) {
                this.f6347g = false;
                e1 e1Var = e1.this;
                int i2 = e1.f6331m;
                e1Var.b();
                if (this.f6346f < e1.this.f6333g.size()) {
                    e1 e1Var2 = e1.this;
                    int i3 = this.f6346f;
                    this.f6346f = i3 - 1;
                    e1Var2.i(i3);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f(d1 d1Var) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            e1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = e1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                e1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e1.this.size();
        }
    }

    public e1(int i2, d1 d1Var) {
        this.f6332f = i2;
    }

    public final int a(K k2) {
        int size = this.f6333g.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f6333g.get(size).f6343f);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f6333g.get(i3).f6343f);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public final void b() {
        if (this.f6335i) {
            throw new UnsupportedOperationException();
        }
    }

    public Map.Entry<K, V> c(int i2) {
        return this.f6333g.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f6333g.isEmpty()) {
            this.f6333g.clear();
        }
        if (this.f6334h.isEmpty()) {
            return;
        }
        this.f6334h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6334h.containsKey(comparable);
    }

    public int d() {
        return this.f6333g.size();
    }

    public Iterable<Map.Entry<K, V>> e() {
        if (this.f6334h.isEmpty()) {
            return (Iterable<Map.Entry<K, V>>) c.b;
        }
        return this.f6334h.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f6336j == null) {
            this.f6336j = new f(null);
        }
        return this.f6336j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        int size = size();
        if (size != e1Var.size()) {
            return false;
        }
        int d2 = d();
        if (d2 != e1Var.d()) {
            return entrySet().equals(e1Var.entrySet());
        }
        for (int i2 = 0; i2 < d2; i2++) {
            if (!c(i2).equals(e1Var.c(i2))) {
                return false;
            }
        }
        if (d2 != size) {
            return this.f6334h.equals(e1Var.f6334h);
        }
        return true;
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.f6334h.isEmpty() && !(this.f6334h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6334h = treeMap;
            this.f6337k = treeMap.descendingMap();
        }
        return (SortedMap) this.f6334h;
    }

    public void g() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f6335i) {
            return;
        }
        if (this.f6334h.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f6334h);
        }
        this.f6334h = unmodifiableMap;
        if (this.f6337k.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f6337k);
        }
        this.f6337k = unmodifiableMap2;
        this.f6335i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return this.f6333g.get(a2).f6344g;
        }
        return this.f6334h.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h */
    public V put(K k2, V v) {
        b();
        int a2 = a(k2);
        if (a2 >= 0) {
            e1<K, V>.d dVar = this.f6333g.get(a2);
            e1.this.b();
            V v2 = dVar.f6344g;
            dVar.f6344g = v;
            return v2;
        }
        b();
        if (this.f6333g.isEmpty() && !(this.f6333g instanceof ArrayList)) {
            this.f6333g = new ArrayList(this.f6332f);
        }
        int i2 = -(a2 + 1);
        if (i2 >= this.f6332f) {
            return f().put(k2, v);
        }
        int size = this.f6333g.size();
        int i3 = this.f6332f;
        if (size == i3) {
            e1<K, V>.d remove = this.f6333g.remove(i3 - 1);
            f().put(remove.f6343f, remove.f6344g);
        }
        this.f6333g.add(i2, new d(k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int d2 = d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            i2 += this.f6333g.get(i3).hashCode();
        }
        return this.f6334h.size() > 0 ? i2 + this.f6334h.hashCode() : i2;
    }

    public final V i(int i2) {
        b();
        V v = this.f6333g.remove(i2).f6344g;
        if (!this.f6334h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            this.f6333g.add(new d(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) i(a2);
        }
        if (this.f6334h.isEmpty()) {
            return null;
        }
        return this.f6334h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6334h.size() + this.f6333g.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class d implements Map.Entry<K, V>, Comparable<e1<K, V>.d> {

        /* renamed from: f  reason: collision with root package name */
        public final K f6343f;

        /* renamed from: g  reason: collision with root package name */
        public V f6344g;

        public d(e1 e1Var, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            e1.this = e1Var;
            this.f6343f = entry.getKey();
            this.f6344g = value;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f6343f.compareTo(((d) obj).f6343f);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k2 = this.f6343f;
                Object key = entry.getKey();
                if (k2 == null) {
                    equals = key == null;
                } else {
                    equals = k2.equals(key);
                }
                if (equals) {
                    V v = this.f6344g;
                    Object value = entry.getValue();
                    if (v == null) {
                        equals2 = value == null;
                    } else {
                        equals2 = v.equals(value);
                    }
                    if (equals2) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f6343f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6344g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f6343f;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f6344g;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            e1 e1Var = e1.this;
            int i2 = e1.f6331m;
            e1Var.b();
            V v2 = this.f6344g;
            this.f6344g = v;
            return v2;
        }

        public String toString() {
            return this.f6343f + "=" + this.f6344g;
        }

        public d(K k2, V v) {
            this.f6343f = k2;
            this.f6344g = v;
        }
    }
}

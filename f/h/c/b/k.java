package f.h.c.b;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactHashMap.java */
/* loaded from: classes.dex */
public class k<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object o = new Object();

    /* renamed from: f  reason: collision with root package name */
    public transient Object f5933f;

    /* renamed from: g  reason: collision with root package name */
    public transient int[] f5934g;

    /* renamed from: h  reason: collision with root package name */
    public transient Object[] f5935h;

    /* renamed from: i  reason: collision with root package name */
    public transient Object[] f5936i;

    /* renamed from: j  reason: collision with root package name */
    public transient int f5937j;

    /* renamed from: k  reason: collision with root package name */
    public transient int f5938k;

    /* renamed from: l  reason: collision with root package name */
    public transient Set<K> f5939l;

    /* renamed from: m  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f5940m;
    public transient Collection<V> n;

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> c = k.this.c();
            if (c != null) {
                return c.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int f2 = k.this.f(entry.getKey());
                return f2 != -1 && f.h.b.c.a.i0(k.b(k.this, f2), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            k kVar = k.this;
            Map<K, V> c = kVar.c();
            if (c != null) {
                return c.entrySet().iterator();
            }
            return new i(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            k kVar;
            Map<K, V> c = k.this.c();
            if (c != null) {
                return c.entrySet().remove(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (k.this.i()) {
                    return false;
                }
                int d2 = k.this.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = k.this.f5933f;
                Objects.requireNonNull(obj2);
                int O0 = f.h.b.c.a.O0(key, value, d2, obj2, k.this.k(), k.this.l(), k.this.m());
                if (O0 == -1) {
                    return false;
                }
                k.this.h(O0, d2);
                kVar.f5938k--;
                k.this.e();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        public int f5942f;

        /* renamed from: g  reason: collision with root package name */
        public int f5943g;

        /* renamed from: h  reason: collision with root package name */
        public int f5944h;

        public b(h hVar) {
            this.f5942f = k.this.f5937j;
            this.f5943g = k.this.isEmpty() ? -1 : 0;
            this.f5944h = -1;
        }

        public abstract T a(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5943g >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (k.this.f5937j == this.f5942f) {
                if (hasNext()) {
                    int i2 = this.f5943g;
                    this.f5944h = i2;
                    T a = a(i2);
                    k kVar = k.this;
                    int i3 = this.f5943g + 1;
                    if (i3 >= kVar.f5938k) {
                        i3 = -1;
                    }
                    this.f5943g = i3;
                    return a;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (k.this.f5937j == this.f5942f) {
                f.h.b.c.a.C(this.f5944h >= 0, "no calls to next() since the last call to remove()");
                this.f5942f += 32;
                k kVar = k.this;
                kVar.remove(k.a(kVar, this.f5944h));
                k kVar2 = k.this;
                int i2 = this.f5943g;
                Objects.requireNonNull(kVar2);
                this.f5943g = i2 - 1;
                this.f5944h = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            k kVar = k.this;
            Map<K, V> c = kVar.c();
            if (c != null) {
                return c.keySet().iterator();
            }
            return new h(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> c = k.this.c();
            if (c != null) {
                return c.keySet().remove(obj);
            }
            Object j2 = k.this.j(obj);
            Object obj2 = k.o;
            return j2 != k.o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public final class d extends f.h.c.b.d<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public final K f5947f;

        /* renamed from: g  reason: collision with root package name */
        public int f5948g;

        public d(int i2) {
            Object obj = k.o;
            this.f5947f = (K) k.this.l()[i2];
            this.f5948g = i2;
        }

        public final void a() {
            int i2 = this.f5948g;
            if (i2 == -1 || i2 >= k.this.size() || !f.h.b.c.a.i0(this.f5947f, k.a(k.this, this.f5948g))) {
                k kVar = k.this;
                K k2 = this.f5947f;
                Object obj = k.o;
                this.f5948g = kVar.f(k2);
            }
        }

        @Override // f.h.c.b.d, java.util.Map.Entry
        public K getKey() {
            return this.f5947f;
        }

        @Override // f.h.c.b.d, java.util.Map.Entry
        public V getValue() {
            Map<K, V> c = k.this.c();
            if (c != null) {
                return c.get(this.f5947f);
            }
            a();
            int i2 = this.f5948g;
            if (i2 == -1) {
                return null;
            }
            return (V) k.b(k.this, i2);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> c = k.this.c();
            if (c != null) {
                return c.put(this.f5947f, v);
            }
            a();
            int i2 = this.f5948g;
            if (i2 == -1) {
                k.this.put(this.f5947f, v);
                return null;
            }
            V v2 = (V) k.b(k.this, i2);
            k kVar = k.this;
            kVar.m()[this.f5948g] = v;
            return v2;
        }
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes.dex */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            k kVar = k.this;
            Map<K, V> c = kVar.c();
            if (c != null) {
                return c.values().iterator();
            }
            return new j(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return k.this.size();
        }
    }

    public k() {
        f.h.b.c.a.m(true, "Expected size must be >= 0");
        this.f5937j = f.h.b.c.a.F(3, 1, 1073741823);
    }

    public static Object a(k kVar, int i2) {
        return kVar.l()[i2];
    }

    public static Object b(k kVar, int i2) {
        return kVar.m()[i2];
    }

    public Map<K, V> c() {
        Object obj = this.f5933f;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (i()) {
            return;
        }
        e();
        Map<K, V> c2 = c();
        if (c2 != null) {
            this.f5937j = f.h.b.c.a.F(size(), 3, 1073741823);
            c2.clear();
            this.f5933f = null;
            this.f5938k = 0;
            return;
        }
        Arrays.fill(l(), 0, this.f5938k, (Object) null);
        Arrays.fill(m(), 0, this.f5938k, (Object) null);
        Object obj = this.f5933f;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(k(), 0, this.f5938k, 0);
        this.f5938k = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.containsKey(obj);
        }
        return f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f5938k; i2++) {
            if (f.h.b.c.a.i0(obj, o(i2))) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f5937j & 31)) - 1;
    }

    public void e() {
        this.f5937j += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f5940m;
        if (set == null) {
            a aVar = new a();
            this.f5940m = aVar;
            return aVar;
        }
        return set;
    }

    public final int f(Object obj) {
        if (i()) {
            return -1;
        }
        int Y0 = f.h.b.c.a.Y0(obj);
        int d2 = d();
        Object obj2 = this.f5933f;
        Objects.requireNonNull(obj2);
        int Z0 = f.h.b.c.a.Z0(obj2, Y0 & d2);
        if (Z0 == 0) {
            return -1;
        }
        int i2 = ~d2;
        int i3 = Y0 & i2;
        do {
            int i4 = Z0 - 1;
            int i5 = k()[i4];
            if ((i5 & i2) == i3 && f.h.b.c.a.i0(obj, g(i4))) {
                return i4;
            }
            Z0 = i5 & d2;
        } while (Z0 != 0);
        return -1;
    }

    public final K g(int i2) {
        return (K) l()[i2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.get(obj);
        }
        int f2 = f(obj);
        if (f2 == -1) {
            return null;
        }
        return o(f2);
    }

    public void h(int i2, int i3) {
        Object obj = this.f5933f;
        Objects.requireNonNull(obj);
        int[] k2 = k();
        Object[] l2 = l();
        Object[] m2 = m();
        int size = size() - 1;
        if (i2 < size) {
            Object obj2 = l2[size];
            l2[i2] = obj2;
            m2[i2] = m2[size];
            l2[size] = null;
            m2[size] = null;
            k2[i2] = k2[size];
            k2[size] = 0;
            int Y0 = f.h.b.c.a.Y0(obj2) & i3;
            int Z0 = f.h.b.c.a.Z0(obj, Y0);
            int i4 = size + 1;
            if (Z0 == i4) {
                f.h.b.c.a.a1(obj, Y0, i2 + 1);
                return;
            }
            while (true) {
                int i5 = Z0 - 1;
                int i6 = k2[i5];
                int i7 = i6 & i3;
                if (i7 == i4) {
                    k2[i5] = f.h.b.c.a.G0(i6, i2 + 1, i3);
                    return;
                }
                Z0 = i7;
            }
        } else {
            l2[i2] = null;
            m2[i2] = null;
            k2[i2] = 0;
        }
    }

    public boolean i() {
        return this.f5933f == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (i()) {
            return o;
        }
        int d2 = d();
        Object obj2 = this.f5933f;
        Objects.requireNonNull(obj2);
        int O0 = f.h.b.c.a.O0(obj, null, d2, obj2, k(), l(), null);
        if (O0 == -1) {
            return o;
        }
        V o2 = o(O0);
        h(O0, d2);
        this.f5938k--;
        e();
        return o2;
    }

    public final int[] k() {
        int[] iArr = this.f5934g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f5939l;
        if (set == null) {
            c cVar = new c();
            this.f5939l = cVar;
            return cVar;
        }
        return set;
    }

    public final Object[] l() {
        Object[] objArr = this.f5935h;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] m() {
        Object[] objArr = this.f5936i;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int n(int i2, int i3, int i4, int i5) {
        Object I = f.h.b.c.a.I(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            f.h.b.c.a.a1(I, i4 & i6, i5 + 1);
        }
        Object obj = this.f5933f;
        Objects.requireNonNull(obj);
        int[] k2 = k();
        for (int i7 = 0; i7 <= i2; i7++) {
            int Z0 = f.h.b.c.a.Z0(obj, i7);
            while (Z0 != 0) {
                int i8 = Z0 - 1;
                int i9 = k2[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int Z02 = f.h.b.c.a.Z0(I, i11);
                f.h.b.c.a.a1(I, i11, Z0);
                k2[i8] = f.h.b.c.a.G0(i10, Z02, i6);
                Z0 = i9 & i2;
            }
        }
        this.f5933f = I;
        this.f5937j = f.h.b.c.a.G0(this.f5937j, 32 - Integer.numberOfLeadingZeros(i6), 31);
        return i6;
    }

    public final V o(int i2) {
        return (V) m()[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f6 -> B:42:0x00f9). Please submit an issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V put(K r21, V r22) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.k.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> c2 = c();
        if (c2 != null) {
            return c2.remove(obj);
        }
        V v = (V) j(obj);
        if (v == o) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> c2 = c();
        return c2 != null ? c2.size() : this.f5938k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.n;
        if (collection == null) {
            e eVar = new e();
            this.n = eVar;
            return eVar;
        }
        return collection;
    }
}

package f.h.f.z;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes2.dex */
public final class s<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final Comparator<Comparable> f6253m = new a();

    /* renamed from: f  reason: collision with root package name */
    public Comparator<? super K> f6254f;

    /* renamed from: g  reason: collision with root package name */
    public e<K, V> f6255g;

    /* renamed from: h  reason: collision with root package name */
    public int f6256h;

    /* renamed from: i  reason: collision with root package name */
    public int f6257i;

    /* renamed from: j  reason: collision with root package name */
    public final e<K, V> f6258j;

    /* renamed from: k  reason: collision with root package name */
    public s<K, V>.b f6259k;

    /* renamed from: l  reason: collision with root package name */
    public s<K, V>.c f6260l;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes2.dex */
        public class a extends s<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> b;
            if ((obj instanceof Map.Entry) && (b = s.this.b((Map.Entry) obj)) != null) {
                s.this.e(b, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f6256h;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes2.dex */
        public class a extends s<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f6272k;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return s.this.c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            s sVar = s.this;
            e<K, V> c = sVar.c(obj);
            if (c != null) {
                sVar.e(c, true);
            }
            return c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f6256h;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f6263f;

        /* renamed from: g  reason: collision with root package name */
        public e<K, V> f6264g = null;

        /* renamed from: h  reason: collision with root package name */
        public int f6265h;

        public d() {
            this.f6263f = s.this.f6258j.f6270i;
            this.f6265h = s.this.f6257i;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f6263f;
            s sVar = s.this;
            if (eVar != sVar.f6258j) {
                if (sVar.f6257i == this.f6265h) {
                    this.f6263f = eVar.f6270i;
                    this.f6264g = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6263f != s.this.f6258j;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f6264g;
            if (eVar != null) {
                s.this.e(eVar, true);
                this.f6264g = null;
                this.f6265h = s.this.f6257i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public s() {
        Comparator<Comparable> comparator = f6253m;
        this.f6256h = 0;
        this.f6257i = 0;
        this.f6258j = new e<>();
        this.f6254f = comparator;
    }

    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f6254f;
        e<K, V> eVar2 = this.f6255g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f6253m ? (Comparable) k2 : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(eVar2.f6272k);
                } else {
                    i2 = comparator.compare(k2, (K) eVar2.f6272k);
                }
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f6268g : eVar2.f6269h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (z) {
            e<K, V> eVar4 = this.f6258j;
            if (eVar2 == null) {
                if (comparator == f6253m && !(k2 instanceof Comparable)) {
                    throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k2, eVar4, eVar4.f6271j);
                this.f6255g = eVar;
            } else {
                eVar = new e<>(eVar2, k2, eVar4, eVar4.f6271j);
                if (i2 < 0) {
                    eVar2.f6268g = eVar;
                } else {
                    eVar2.f6269h = eVar;
                }
                d(eVar2, true);
            }
            this.f6256h++;
            this.f6257i++;
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f.h.f.z.s.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            f.h.f.z.s$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f6273l
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.z.s.b(java.util.Map$Entry):f.h.f.z.s$e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> c(Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f6255g = null;
        this.f6256h = 0;
        this.f6257i++;
        e<K, V> eVar = this.f6258j;
        eVar.f6271j = eVar;
        eVar.f6270i = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f6268g;
            e<K, V> eVar3 = eVar.f6269h;
            int i2 = eVar2 != null ? eVar2.f6274m : 0;
            int i3 = eVar3 != null ? eVar3.f6274m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f6268g;
                e<K, V> eVar5 = eVar3.f6269h;
                int i5 = (eVar4 != null ? eVar4.f6274m : 0) - (eVar5 != null ? eVar5.f6274m : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    h(eVar3);
                    g(eVar);
                } else {
                    g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f6268g;
                e<K, V> eVar7 = eVar2.f6269h;
                int i6 = (eVar6 != null ? eVar6.f6274m : 0) - (eVar7 != null ? eVar7.f6274m : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    g(eVar2);
                    h(eVar);
                } else {
                    h(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f6274m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f6274m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f6267f;
        }
    }

    public void e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i2;
        if (z) {
            e<K, V> eVar4 = eVar.f6271j;
            eVar4.f6270i = eVar.f6270i;
            eVar.f6270i.f6271j = eVar4;
        }
        e<K, V> eVar5 = eVar.f6268g;
        e<K, V> eVar6 = eVar.f6269h;
        e<K, V> eVar7 = eVar.f6267f;
        int i3 = 0;
        if (eVar5 != null && eVar6 != null) {
            if (eVar5.f6274m > eVar6.f6274m) {
                e<K, V> eVar8 = eVar5.f6269h;
                while (true) {
                    e<K, V> eVar9 = eVar8;
                    eVar3 = eVar5;
                    eVar5 = eVar9;
                    if (eVar5 == null) {
                        break;
                    }
                    eVar8 = eVar5.f6269h;
                }
            } else {
                e<K, V> eVar10 = eVar6.f6268g;
                while (true) {
                    eVar2 = eVar6;
                    eVar6 = eVar10;
                    if (eVar6 == null) {
                        break;
                    }
                    eVar10 = eVar6.f6268g;
                }
                eVar3 = eVar2;
            }
            e(eVar3, false);
            e<K, V> eVar11 = eVar.f6268g;
            if (eVar11 != null) {
                i2 = eVar11.f6274m;
                eVar3.f6268g = eVar11;
                eVar11.f6267f = eVar3;
                eVar.f6268g = null;
            } else {
                i2 = 0;
            }
            e<K, V> eVar12 = eVar.f6269h;
            if (eVar12 != null) {
                i3 = eVar12.f6274m;
                eVar3.f6269h = eVar12;
                eVar12.f6267f = eVar3;
                eVar.f6269h = null;
            }
            eVar3.f6274m = Math.max(i2, i3) + 1;
            f(eVar, eVar3);
            return;
        }
        if (eVar5 != null) {
            f(eVar, eVar5);
            eVar.f6268g = null;
        } else if (eVar6 != null) {
            f(eVar, eVar6);
            eVar.f6269h = null;
        } else {
            f(eVar, null);
        }
        d(eVar7, false);
        this.f6256h--;
        this.f6257i++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.f6259k;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.f6259k = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f6267f;
        eVar.f6267f = null;
        if (eVar2 != null) {
            eVar2.f6267f = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f6268g == eVar) {
                eVar3.f6268g = eVar2;
                return;
            } else {
                eVar3.f6269h = eVar2;
                return;
            }
        }
        this.f6255g = eVar2;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6268g;
        e<K, V> eVar3 = eVar.f6269h;
        e<K, V> eVar4 = eVar3.f6268g;
        e<K, V> eVar5 = eVar3.f6269h;
        eVar.f6269h = eVar4;
        if (eVar4 != null) {
            eVar4.f6267f = eVar;
        }
        f(eVar, eVar3);
        eVar3.f6268g = eVar;
        eVar.f6267f = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f6274m : 0, eVar4 != null ? eVar4.f6274m : 0) + 1;
        eVar.f6274m = max;
        eVar3.f6274m = Math.max(max, eVar5 != null ? eVar5.f6274m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> c2 = c(obj);
        if (c2 != null) {
            return c2.f6273l;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6268g;
        e<K, V> eVar3 = eVar.f6269h;
        e<K, V> eVar4 = eVar2.f6268g;
        e<K, V> eVar5 = eVar2.f6269h;
        eVar.f6268g = eVar5;
        if (eVar5 != null) {
            eVar5.f6267f = eVar;
        }
        f(eVar, eVar2);
        eVar2.f6269h = eVar;
        eVar.f6267f = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f6274m : 0, eVar5 != null ? eVar5.f6274m : 0) + 1;
        eVar.f6274m = max;
        eVar2.f6274m = Math.max(max, eVar4 != null ? eVar4.f6274m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.c cVar = this.f6260l;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.f6260l = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e<K, V> a2 = a(k2, true);
        V v2 = a2.f6273l;
        a2.f6273l = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> c2 = c(obj);
        if (c2 != null) {
            e(c2, true);
        }
        if (c2 != null) {
            return c2.f6273l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6256h;
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f6267f;

        /* renamed from: g  reason: collision with root package name */
        public e<K, V> f6268g;

        /* renamed from: h  reason: collision with root package name */
        public e<K, V> f6269h;

        /* renamed from: i  reason: collision with root package name */
        public e<K, V> f6270i;

        /* renamed from: j  reason: collision with root package name */
        public e<K, V> f6271j;

        /* renamed from: k  reason: collision with root package name */
        public final K f6272k;

        /* renamed from: l  reason: collision with root package name */
        public V f6273l;

        /* renamed from: m  reason: collision with root package name */
        public int f6274m;

        public e() {
            this.f6272k = null;
            this.f6271j = this;
            this.f6270i = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k2 = this.f6272k;
                if (k2 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k2.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f6273l;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6272k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6273l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f6272k;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f6273l;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f6273l;
            this.f6273l = v;
            return v2;
        }

        public String toString() {
            return this.f6272k + "=" + this.f6273l;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f6267f = eVar;
            this.f6272k = k2;
            this.f6274m = 1;
            this.f6270i = eVar2;
            this.f6271j = eVar3;
            eVar3.f6270i = this;
            eVar2.f6271j = this;
        }
    }
}

package e.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f  reason: collision with root package name */
    public c<K, V> f1937f;

    /* renamed from: g  reason: collision with root package name */
    public c<K, V> f1938g;

    /* renamed from: h  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f1939h = new WeakHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public int f1940i = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // e.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1944i;
        }

        @Override // e.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1943h;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: e.c.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031b<K, V> extends e<K, V> {
        public C0031b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // e.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1943h;
        }

        @Override // e.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1944i;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public final K f1941f;

        /* renamed from: g  reason: collision with root package name */
        public final V f1942g;

        /* renamed from: h  reason: collision with root package name */
        public c<K, V> f1943h;

        /* renamed from: i  reason: collision with root package name */
        public c<K, V> f1944i;

        public c(K k2, V v) {
            this.f1941f = k2;
            this.f1942g = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f1941f.equals(cVar.f1941f) && this.f1942g.equals(cVar.f1942g);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1941f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1942g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1941f.hashCode() ^ this.f1942g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1941f + "=" + this.f1942g;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f1945f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1946g = true;

        public d() {
        }

        @Override // e.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f1945f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1944i;
                this.f1945f = cVar3;
                this.f1946g = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1946g) {
                return b.this.f1937f != null;
            }
            c<K, V> cVar = this.f1945f;
            return (cVar == null || cVar.f1943h == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1946g) {
                this.f1946g = false;
                this.f1945f = b.this.f1937f;
            } else {
                c<K, V> cVar = this.f1945f;
                this.f1945f = cVar != null ? cVar.f1943h : null;
            }
            return this.f1945f;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f1948f;

        /* renamed from: g  reason: collision with root package name */
        public c<K, V> f1949g;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f1948f = cVar2;
            this.f1949g = cVar;
        }

        @Override // e.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f1948f == cVar && cVar == this.f1949g) {
                this.f1949g = null;
                this.f1948f = null;
            }
            c<K, V> cVar3 = this.f1948f;
            if (cVar3 == cVar) {
                this.f1948f = b(cVar3);
            }
            c<K, V> cVar4 = this.f1949g;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f1948f;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f1949g = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1949g != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f1949g;
            c<K, V> cVar2 = this.f1948f;
            this.f1949g = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k2) {
        c<K, V> cVar = this.f1937f;
        while (cVar != null && !cVar.f1941f.equals(k2)) {
            cVar = cVar.f1943h;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f1939h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f1940i++;
        c<K, V> cVar2 = this.f1938g;
        if (cVar2 == null) {
            this.f1937f = cVar;
            this.f1938g = cVar;
            return cVar;
        }
        cVar2.f1943h = cVar;
        cVar.f1944i = cVar2;
        this.f1938g = cVar;
        return cVar;
    }

    public V d(K k2, V v) {
        c<K, V> a2 = a(k2);
        if (a2 != null) {
            return a2.f1942g;
        }
        c(k2, v);
        return null;
    }

    public V e(K k2) {
        c<K, V> a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f1940i--;
        if (!this.f1939h.isEmpty()) {
            for (f<K, V> fVar : this.f1939h.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f1944i;
        if (cVar != null) {
            cVar.f1943h = a2.f1943h;
        } else {
            this.f1937f = a2.f1943h;
        }
        c<K, V> cVar2 = a2.f1943h;
        if (cVar2 != null) {
            cVar2.f1944i = cVar;
        } else {
            this.f1938g = cVar;
        }
        a2.f1943h = null;
        a2.f1944i = null;
        return a2.f1942g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((e.c.a.b.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof e.c.a.b.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e.c.a.b.b r7 = (e.c.a.b.b) r7
            int r1 = r6.f1940i
            int r3 = r7.f1940i
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            e.c.a.b.b$e r3 = (e.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            e.c.a.b.b$e r4 = (e.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            e.c.a.b.b$e r7 = (e.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1937f, this.f1938g);
        this.f1939h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                A.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    A.append(", ");
                }
            } else {
                A.append("]");
                return A.toString();
            }
        }
    }
}

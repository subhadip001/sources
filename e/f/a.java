package e.f;

import e.f.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public g<K, V> f1967m;

    /* compiled from: ArrayMap.java */
    /* renamed from: e.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0032a extends g<K, V> {
        public C0032a() {
        }

        @Override // e.f.g
        public void a() {
            a.this.clear();
        }

        @Override // e.f.g
        public Object b(int i2, int i3) {
            return a.this.f2000g[(i2 << 1) + i3];
        }

        @Override // e.f.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // e.f.g
        public int d() {
            return a.this.f2001h;
        }

        @Override // e.f.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // e.f.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // e.f.g
        public void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // e.f.g
        public void h(int i2) {
            a.this.j(i2);
        }

        @Override // e.f.g
        public V i(int i2, V v) {
            return a.this.k(i2, v);
        }
    }

    public a() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> m2 = m();
        if (m2.a == null) {
            m2.a = new g.b();
        }
        return m2.a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> m2 = m();
        if (m2.b == null) {
            m2.b = new g.c();
        }
        return m2.b;
    }

    public final g<K, V> m() {
        if (this.f1967m == null) {
            this.f1967m = new C0032a();
        }
        return this.f1967m;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f2001h);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> m2 = m();
        if (m2.c == null) {
            m2.c = new g.e();
        }
        return m2.c;
    }

    public a(int i2) {
        super(i2);
    }

    public a(h hVar) {
        if (hVar != null) {
            i(hVar);
        }
    }
}

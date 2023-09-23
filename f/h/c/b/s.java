package f.h.c.b;

import com.arthenica.ffmpegkit.MediaInformation;
import f.h.c.b.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: ImmutableMap.java */
/* loaded from: classes.dex */
public abstract class s<K, V> implements Map<K, V>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public transient v<Map.Entry<K, V>> f5987f;

    /* renamed from: g  reason: collision with root package name */
    public transient v<K> f5988g;

    /* renamed from: h  reason: collision with root package name */
    public transient o<V> f5989h;

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        public Object[] a;
        public int b = 0;
        public boolean c = false;

        /* renamed from: d  reason: collision with root package name */
        public C0136a f5990d;

        /* compiled from: ImmutableMap.java */
        /* renamed from: f.h.c.b.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0136a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0136a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.a);
                String valueOf4 = String.valueOf(this.c);
                return new IllegalArgumentException(f.a.b.a.a.w(f.a.b.a.a.z(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39, "Multiple entries with same key: ", valueOf, "=", valueOf2), " and ", valueOf3, "=", valueOf4));
            }
        }

        public a(int i2) {
            this.a = new Object[i2 * 2];
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f.h.c.b.s<K, V> a() {
            /*
                Method dump skipped, instructions count: 462
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.s.a.a():f.h.c.b.s");
        }

        public final void b(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.a;
            if (i3 > objArr.length) {
                this.a = Arrays.copyOf(objArr, o.b.a(objArr.length, i3));
                this.c = false;
            }
        }

        public a<K, V> c(K k2, V v) {
            b(this.b + 1);
            f.h.b.c.a.v(k2, v);
            Object[] objArr = this.a;
            int i2 = this.b;
            objArr[i2 * 2] = k2;
            objArr[(i2 * 2) + 1] = v;
            this.b = i2 + 1;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> s<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof s) && !(map instanceof SortedMap)) {
            s<K, V> sVar = (s) map;
            if (!sVar.e()) {
                return sVar;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        boolean z = entrySet instanceof Collection;
        a aVar = new a(z ? entrySet.size() : 4);
        if (z) {
            aVar.b(entrySet.size() + aVar.b);
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.c(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public abstract v<Map.Entry<K, V>> b();

    public abstract v<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract o<V> d();

    public abstract boolean e();

    @Override // java.util.Map
    public Set entrySet() {
        v<Map.Entry<K, V>> vVar = this.f5987f;
        if (vVar == null) {
            v<Map.Entry<K, V>> b = b();
            this.f5987f = b;
            return b;
        }
        return vVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public o<V> values() {
        o<V> oVar = this.f5989h;
        if (oVar == null) {
            o<V> d2 = d();
            this.f5989h = d2;
            return d2;
        }
        return oVar;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        v<Map.Entry<K, V>> vVar = this.f5987f;
        if (vVar == null) {
            vVar = b();
            this.f5987f = vVar;
        }
        return g.a(vVar);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public Set keySet() {
        v<K> vVar = this.f5988g;
        if (vVar == null) {
            v<K> c = c();
            this.f5988g = c;
            return c;
        }
        return vVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        f.h.b.c.a.w(size, MediaInformation.KEY_SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }
}

package f.h.h;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes2.dex */
public class z extends a0 {

    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: f  reason: collision with root package name */
        public Map.Entry<K, z> f6437f;

        public b(Map.Entry entry, a aVar) {
            this.f6437f = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6437f.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            z value = this.f6437f.getValue();
            if (value == null) {
                return null;
            }
            return value.c();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof n0) {
                z value = this.f6437f.getValue();
                n0 n0Var = value.a;
                value.b = null;
                value.a = (n0) obj;
                return n0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f6438f;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f6438f = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6438f.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.f6438f.next();
            return next.getValue() instanceof z ? new b(next, null) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6438f.remove();
        }
    }

    public n0 c() {
        return a(null);
    }

    @Override // f.h.h.a0
    public boolean equals(Object obj) {
        return c().equals(obj);
    }

    @Override // f.h.h.a0
    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c().toString();
    }
}

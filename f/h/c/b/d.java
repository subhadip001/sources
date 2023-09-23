package f.h.c.b;

import java.util.Map;

/* compiled from: AbstractMapEntry.java */
/* loaded from: classes.dex */
public abstract class d<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return f.h.b.c.a.i0(getKey(), entry.getKey()) && f.h.b.c.a.i0(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return f.a.b.a.a.g(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }
}

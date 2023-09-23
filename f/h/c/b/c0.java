package f.h.c.b;

import com.google.android.gms.common.api.Api;
import f.h.c.b.c;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: Maps.java */
/* loaded from: classes.dex */
public abstract class c0<K, V> extends r0<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        c.b.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return c.b.this.isEmpty();
    }

    @Override // f.h.c.b.r0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            return g.b(this, collection.iterator());
        }
    }

    @Override // f.h.c.b.r0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        int i2;
        try {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                f.h.b.c.a.w(size, "expectedSize");
                i2 = size + 1;
            } else {
                i2 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            HashSet hashSet = new HashSet(i2);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return c.b.this.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return c.b.this.size();
    }
}

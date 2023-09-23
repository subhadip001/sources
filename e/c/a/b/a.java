package e.c.a.b;

import e.c.a.b.b;
import java.util.HashMap;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: j  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f1936j = new HashMap<>();

    @Override // e.c.a.b.b
    public b.c<K, V> a(K k2) {
        return this.f1936j.get(k2);
    }

    public boolean contains(K k2) {
        return this.f1936j.containsKey(k2);
    }

    @Override // e.c.a.b.b
    public V d(K k2, V v) {
        b.c<K, V> cVar = this.f1936j.get(k2);
        if (cVar != null) {
            return cVar.f1942g;
        }
        this.f1936j.put(k2, c(k2, v));
        return null;
    }

    @Override // e.c.a.b.b
    public V e(K k2) {
        V v = (V) super.e(k2);
        this.f1936j.remove(k2);
        return v;
    }
}

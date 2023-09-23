package f.h.c.b;

import java.util.Map;
import java.util.Objects;

/* compiled from: Maps.java */
/* loaded from: classes.dex */
public class d0<K, V> extends r0<K> {

    /* renamed from: f  reason: collision with root package name */
    public final Map<K, V> f5920f;

    public d0(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f5920f = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f5920f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5920f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f5920f.size();
    }
}

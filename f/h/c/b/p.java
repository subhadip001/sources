package f.h.c.b;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
/* loaded from: classes.dex */
public class p<K, V> extends d<K, V> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final K f5978f;

    /* renamed from: g  reason: collision with root package name */
    public final V f5979g;

    public p(K k2, V v) {
        this.f5978f = k2;
        this.f5979g = v;
    }

    @Override // f.h.c.b.d, java.util.Map.Entry
    public final K getKey() {
        return this.f5978f;
    }

    @Override // f.h.c.b.d, java.util.Map.Entry
    public final V getValue() {
        return this.f5979g;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}

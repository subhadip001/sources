package f.h.c.b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableMultimap.java */
/* loaded from: classes.dex */
public abstract class u<K, V> extends f<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final transient s<K, ? extends o<V>> f5996i;

    /* renamed from: j  reason: collision with root package name */
    public final transient int f5997j;

    /* compiled from: ImmutableMultimap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final Map<K, Collection<V>> a = new k();
    }

    public u(s<K, ? extends o<V>> sVar, int i2) {
        this.f5996i = sVar;
        this.f5997j = i2;
    }

    @Override // f.h.c.b.e, f.h.c.b.g0
    public Map a() {
        return this.f5996i;
    }

    @Override // f.h.c.b.e
    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // f.h.c.b.e
    public Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // f.h.c.b.g0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // f.h.c.b.e
    public Set<K> d() {
        throw new AssertionError("unreachable");
    }

    @Override // f.h.c.b.e
    public Iterator e() {
        return new t(this);
    }

    @Override // f.h.c.b.g0
    public int size() {
        return this.f5997j;
    }
}

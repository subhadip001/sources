package f.e.a.r;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends e.f.a<K, V> {
    public int n;

    @Override // e.f.h, java.util.Map
    public void clear() {
        this.n = 0;
        super.clear();
    }

    @Override // e.f.h, java.util.Map
    public int hashCode() {
        if (this.n == 0) {
            this.n = super.hashCode();
        }
        return this.n;
    }

    @Override // e.f.h
    public void i(e.f.h<? extends K, ? extends V> hVar) {
        this.n = 0;
        super.i(hVar);
    }

    @Override // e.f.h
    public V j(int i2) {
        this.n = 0;
        return (V) super.j(i2);
    }

    @Override // e.f.h
    public V k(int i2, V v) {
        this.n = 0;
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2000g;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    @Override // e.f.h, java.util.Map
    public V put(K k2, V v) {
        this.n = 0;
        return (V) super.put(k2, v);
    }
}

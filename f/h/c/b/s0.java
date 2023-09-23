package f.h.c.b;

import java.util.Objects;

/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes.dex */
public final class s0<E> extends v<E> {

    /* renamed from: i  reason: collision with root package name */
    public final transient E f5991i;

    public s0(E e2) {
        Objects.requireNonNull(e2);
        this.f5991i = e2;
    }

    @Override // f.h.c.b.v, f.h.c.b.o
    public q<E> a() {
        return q.r(this.f5991i);
    }

    @Override // f.h.c.b.o
    public int b(Object[] objArr, int i2) {
        objArr[i2] = this.f5991i;
        return i2 + 1;
    }

    @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f5991i.equals(obj);
    }

    @Override // f.h.c.b.o
    public boolean h() {
        return false;
    }

    @Override // f.h.c.b.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5991i.hashCode();
    }

    @Override // f.h.c.b.v, f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public u0<E> iterator() {
        return new w(this.f5991i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f5991i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}

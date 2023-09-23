package f.h.c.b;

import java.util.Objects;

/* compiled from: RegularImmutableList.java */
/* loaded from: classes.dex */
public class m0<E> extends q<E> {

    /* renamed from: j  reason: collision with root package name */
    public static final q<Object> f5954j = new m0(new Object[0], 0);

    /* renamed from: h  reason: collision with root package name */
    public final transient Object[] f5955h;

    /* renamed from: i  reason: collision with root package name */
    public final transient int f5956i;

    public m0(Object[] objArr, int i2) {
        this.f5955h = objArr;
        this.f5956i = i2;
    }

    @Override // f.h.c.b.q, f.h.c.b.o
    public int b(Object[] objArr, int i2) {
        System.arraycopy(this.f5955h, 0, objArr, i2, this.f5956i);
        return i2 + this.f5956i;
    }

    @Override // f.h.c.b.o
    public Object[] c() {
        return this.f5955h;
    }

    @Override // f.h.c.b.o
    public int d() {
        return this.f5956i;
    }

    @Override // f.h.c.b.o
    public int e() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i2) {
        f.h.b.c.a.t(i2, this.f5956i);
        E e2 = (E) this.f5955h[i2];
        Objects.requireNonNull(e2);
        return e2;
    }

    @Override // f.h.c.b.o
    public boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5956i;
    }
}

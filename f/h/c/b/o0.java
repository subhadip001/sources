package f.h.c.b;

/* compiled from: RegularImmutableSet.java */
/* loaded from: classes.dex */
public final class o0<E> extends v<E> {
    public static final Object[] n;
    public static final o0<Object> o;

    /* renamed from: i  reason: collision with root package name */
    public final transient Object[] f5973i;

    /* renamed from: j  reason: collision with root package name */
    public final transient int f5974j;

    /* renamed from: k  reason: collision with root package name */
    public final transient Object[] f5975k;

    /* renamed from: l  reason: collision with root package name */
    public final transient int f5976l;

    /* renamed from: m  reason: collision with root package name */
    public final transient int f5977m;

    static {
        Object[] objArr = new Object[0];
        n = objArr;
        o = new o0<>(objArr, 0, objArr, 0, 0);
    }

    public o0(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f5973i = objArr;
        this.f5974j = i2;
        this.f5975k = objArr2;
        this.f5976l = i3;
        this.f5977m = i4;
    }

    @Override // f.h.c.b.o
    public int b(Object[] objArr, int i2) {
        System.arraycopy(this.f5973i, 0, objArr, i2, this.f5977m);
        return i2 + this.f5977m;
    }

    @Override // f.h.c.b.o
    public Object[] c() {
        return this.f5973i;
    }

    @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f5975k;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int Y0 = f.h.b.c.a.Y0(obj);
        while (true) {
            int i2 = Y0 & this.f5976l;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            Y0 = i2 + 1;
        }
    }

    @Override // f.h.c.b.o
    public int d() {
        return this.f5977m;
    }

    @Override // f.h.c.b.o
    public int e() {
        return 0;
    }

    @Override // f.h.c.b.o
    public boolean h() {
        return false;
    }

    @Override // f.h.c.b.v, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f5974j;
    }

    @Override // f.h.c.b.v, f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public u0<E> iterator() {
        return a().listIterator();
    }

    @Override // f.h.c.b.v
    public q<E> m() {
        return q.k(this.f5973i, this.f5977m);
    }

    @Override // f.h.c.b.v
    public boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f5977m;
    }
}

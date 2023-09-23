package f.h.c.b;

import f.h.c.b.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes.dex */
public abstract class q<E> extends o<E> implements List<E>, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    public static final f.h.c.b.a<Object> f5981g = new b(m0.f5954j, 0);

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public static final class a<E> extends o.a<E> {
        public a() {
            super(4);
        }

        public a<E> b(E e2) {
            Objects.requireNonNull(e2);
            int i2 = this.b + 1;
            Object[] objArr = this.a;
            if (objArr.length < i2) {
                this.a = Arrays.copyOf(objArr, o.b.a(objArr.length, i2));
                this.c = false;
            } else if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
            }
            Object[] objArr2 = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            objArr2[i3] = e2;
            return this;
        }

        public q<E> c() {
            this.c = true;
            return q.k(this.a, this.b);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public static class b<E> extends f.h.c.b.a<E> {

        /* renamed from: h  reason: collision with root package name */
        public final q<E> f5982h;

        public b(q<E> qVar, int i2) {
            super(qVar.size(), i2);
            this.f5982h = qVar;
        }

        @Override // f.h.c.b.a
        public E a(int i2) {
            return this.f5982h.get(i2);
        }
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: classes.dex */
    public class c extends q<E> {

        /* renamed from: h  reason: collision with root package name */
        public final transient int f5983h;

        /* renamed from: i  reason: collision with root package name */
        public final transient int f5984i;

        public c(int i2, int i3) {
            this.f5983h = i2;
            this.f5984i = i3;
        }

        @Override // f.h.c.b.o
        public Object[] c() {
            return q.this.c();
        }

        @Override // f.h.c.b.o
        public int d() {
            return q.this.e() + this.f5983h + this.f5984i;
        }

        @Override // f.h.c.b.o
        public int e() {
            return q.this.e() + this.f5983h;
        }

        @Override // java.util.List
        public E get(int i2) {
            f.h.b.c.a.t(i2, this.f5984i);
            return q.this.get(i2 + this.f5983h);
        }

        @Override // f.h.c.b.o
        public boolean h() {
            return true;
        }

        @Override // f.h.c.b.q, f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return listIterator();
        }

        @Override // f.h.c.b.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f5984i;
        }

        @Override // f.h.c.b.q, java.util.List
        /* renamed from: t */
        public q<E> subList(int i2, int i3) {
            f.h.b.c.a.A(i2, i3, this.f5984i);
            q qVar = q.this;
            int i4 = this.f5983h;
            return qVar.subList(i2 + i4, i3 + i4);
        }

        @Override // f.h.c.b.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }
    }

    public static <E> q<E> j(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    public static <E> q<E> k(Object[] objArr, int i2) {
        if (i2 == 0) {
            return (q<E>) m0.f5954j;
        }
        return new m0(objArr, i2);
    }

    public static <E> q<E> l(Object... objArr) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            f.h.b.c.a.u(objArr[i2], i2);
        }
        return k(objArr, objArr.length);
    }

    public static <E> q<E> m(Collection<? extends E> collection) {
        if (collection instanceof o) {
            q<E> a2 = ((o) collection).a();
            return a2.h() ? j(a2.toArray()) : a2;
        }
        return l(collection.toArray());
    }

    public static <E> q<E> r(E e2) {
        return l(e2);
    }

    public static <E> q<E> s(E e2, E e3, E e4, E e5, E e6) {
        return l(e2, e3, e4, e5, e6);
    }

    @Override // f.h.c.b.o
    @Deprecated
    public final q<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // f.h.c.b.o
    public int b(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != r6) goto L6
        L4:
            r0 = 1
            goto L5b
        L6:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L5b
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L4
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = f.h.b.c.a.i0(r4, r5)
            if (r4 != 0) goto L2e
            goto L5b
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L5b
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = f.h.b.c.a.i0(r3, r4)
            if (r3 != 0) goto L39
            goto L5b
        L55:
            boolean r7 = r7.hasNext()
            r0 = r7 ^ 1
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.q.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    @Override // f.h.c.b.o
    public u0<E> i() {
        return listIterator();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: n */
    public f.h.c.b.a<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: o */
    public f.h.c.b.a<E> listIterator(int i2) {
        f.h.b.c.a.z(i2, size());
        if (isEmpty()) {
            return (f.h.c.b.a<E>) f5981g;
        }
        return new b(this, i2);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public q<E> subList(int i2, int i3) {
        f.h.b.c.a.A(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return (q<E>) m0.f5954j;
        }
        return new c(i2, i4);
    }
}

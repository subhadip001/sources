package f.h.c.b;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: ImmutableCollection.java */
/* loaded from: classes.dex */
public abstract class o<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f5972f = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes.dex */
    public static abstract class a<E> extends b<E> {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i2) {
            f.h.b.c.a.w(i2, "initialCapacity");
            this.a = new Object[i2];
            this.b = 0;
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes.dex */
    public static abstract class b<E> {
        public static int a(int i2, int i3) {
            if (i3 >= 0) {
                int i4 = i2 + (i2 >> 1) + 1;
                if (i4 < i3) {
                    i4 = Integer.highestOneBit(i3 - 1) << 1;
                }
                return i4 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    public q<E> a() {
        if (isEmpty()) {
            f.h.c.b.a<Object> aVar = q.f5981g;
            return (q<E>) m0.f5954j;
        }
        return q.j(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i2) {
        u0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public abstract u0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f5972f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] c = c();
            if (c != null) {
                return (T[]) Arrays.copyOfRange(c, e(), d(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr, 0);
        return tArr;
    }
}

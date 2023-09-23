package f.h.c.b;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ImmutableSet.java */
/* loaded from: classes.dex */
public abstract class v<E> extends o<E> implements Set<E> {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f5998h = 0;

    /* renamed from: g  reason: collision with root package name */
    public transient q<E> f5999g;

    public static int j(int i2) {
        int max = Math.max(i2, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        f.h.b.c.a.m(max < 1073741824, "collection too large");
        return CommonUtils.BYTES_IN_A_GIGABYTE;
    }

    public static <E> v<E> k(int i2, Object... objArr) {
        if (i2 != 0) {
            if (i2 != 1) {
                int j2 = j(i2);
                Object[] objArr2 = new Object[j2];
                int i3 = j2 - 1;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    Object obj = objArr[i6];
                    f.h.b.c.a.u(obj, i6);
                    int hashCode = obj.hashCode();
                    int X0 = f.h.b.c.a.X0(hashCode);
                    while (true) {
                        int i7 = X0 & i3;
                        Object obj2 = objArr2[i7];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i7] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            X0++;
                        }
                    }
                }
                Arrays.fill(objArr, i5, i2, (Object) null);
                if (i5 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new s0(obj3);
                } else if (j(i5) < j2 / 2) {
                    return k(i5, objArr);
                } else {
                    int length = objArr.length;
                    if (i5 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    return new o0(objArr, i4, objArr2, i3, i5);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new s0(obj4);
        }
        return o0.o;
    }

    public static <E> v<E> l(Collection<? extends E> collection) {
        if ((collection instanceof v) && !(collection instanceof SortedSet)) {
            v<E> vVar = (v) collection;
            if (!vVar.h()) {
                return vVar;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    @Override // f.h.c.b.o
    public q<E> a() {
        q<E> qVar = this.f5999g;
        if (qVar == null) {
            q<E> m2 = m();
            this.f5999g = m2;
            return m2;
        }
        return qVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && n() && ((v) obj).n() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g.a(this);
    }

    @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public q<E> m() {
        return q.j(toArray());
    }

    public boolean n() {
        return false;
    }
}

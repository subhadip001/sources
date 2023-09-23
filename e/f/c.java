package e.f;

import e.f.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1970j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public static final Object[] f1971k = new Object[0];

    /* renamed from: l  reason: collision with root package name */
    public static Object[] f1972l;

    /* renamed from: m  reason: collision with root package name */
    public static int f1973m;
    public static Object[] n;
    public static int o;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1974f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f1975g;

    /* renamed from: h  reason: collision with root package name */
    public int f1976h;

    /* renamed from: i  reason: collision with root package name */
    public g<E, E> f1977i;

    public c() {
        this(0);
    }

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (o < 10) {
                    objArr[0] = n;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    n = objArr;
                    o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f1973m < 10) {
                    objArr[0] = f1972l;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1972l = objArr;
                    f1973m++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = n;
                if (objArr != null) {
                    this.f1975g = objArr;
                    n = (Object[]) objArr[0];
                    this.f1974f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    o--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f1972l;
                if (objArr2 != null) {
                    this.f1975g = objArr2;
                    f1972l = (Object[]) objArr2[0];
                    this.f1974f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1973m--;
                    return;
                }
            }
        }
        this.f1974f = new int[i2];
        this.f1975g = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int c;
        if (e2 == null) {
            c = d();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            c = c(e2, hashCode);
        }
        if (c >= 0) {
            return false;
        }
        int i3 = ~c;
        int i4 = this.f1976h;
        int[] iArr = this.f1974f;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1975g;
            a(i5);
            int[] iArr2 = this.f1974f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1975g, 0, objArr.length);
            }
            b(iArr, objArr, this.f1976h);
        }
        int i6 = this.f1976h;
        if (i3 < i6) {
            int[] iArr3 = this.f1974f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1975g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1976h - i3);
        }
        this.f1974f[i3] = i2;
        this.f1975g[i3] = e2;
        this.f1976h++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f1976h;
        int[] iArr = this.f1974f;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1975g;
            a(size);
            int i2 = this.f1976h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1974f, 0, i2);
                System.arraycopy(objArr, 0, this.f1975g, 0, this.f1976h);
            }
            b(iArr, objArr, this.f1976h);
        }
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    public final int c(Object obj, int i2) {
        int i3 = this.f1976h;
        if (i3 == 0) {
            return -1;
        }
        int a = d.a(this.f1974f, i3, i2);
        if (a >= 0 && !obj.equals(this.f1975g[a])) {
            int i4 = a + 1;
            while (i4 < i3 && this.f1974f[i4] == i2) {
                if (obj.equals(this.f1975g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a - 1; i5 >= 0 && this.f1974f[i5] == i2; i5--) {
                if (obj.equals(this.f1975g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        }
        return a;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f1976h;
        if (i2 != 0) {
            b(this.f1974f, this.f1975g, i2);
            this.f1974f = f1970j;
            this.f1975g = f1971k;
            this.f1976h = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f1976h;
        if (i2 == 0) {
            return -1;
        }
        int a = d.a(this.f1974f, i2, 0);
        if (a >= 0 && this.f1975g[a] != null) {
            int i3 = a + 1;
            while (i3 < i2 && this.f1974f[i3] == 0) {
                if (this.f1975g[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a - 1; i4 >= 0 && this.f1974f[i4] == 0; i4--) {
                if (this.f1975g[i4] == null) {
                    return i4;
                }
            }
            return ~i3;
        }
        return a;
    }

    public E e(int i2) {
        Object[] objArr = this.f1975g;
        E e2 = (E) objArr[i2];
        int i3 = this.f1976h;
        if (i3 <= 1) {
            b(this.f1974f, objArr, i3);
            this.f1974f = f1970j;
            this.f1975g = f1971k;
            this.f1976h = 0;
        } else {
            int[] iArr = this.f1974f;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f1976h--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1974f, 0, i2);
                    System.arraycopy(objArr, 0, this.f1975g, 0, i2);
                }
                int i4 = this.f1976h;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, this.f1974f, i2, i4 - i2);
                    System.arraycopy(objArr, i5, this.f1975g, i2, this.f1976h - i2);
                }
            } else {
                int i6 = i3 - 1;
                this.f1976h = i6;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, iArr, i2, i6 - i2);
                    Object[] objArr2 = this.f1975g;
                    System.arraycopy(objArr2, i7, objArr2, i2, this.f1976h - i2);
                }
                this.f1975g[this.f1976h] = null;
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1976h != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1976h; i2++) {
                try {
                    if (!set.contains(this.f1975g[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1974f;
        int i2 = this.f1976h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? d() : c(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1976h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f1977i == null) {
            this.f1977i = new b(this);
        }
        g<E, E> gVar = this.f1977i;
        if (gVar.b == null) {
            gVar.b = new g.c();
        }
        return gVar.b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1976h - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1975g[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1976h;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f1976h;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1975g, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1976h * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1976h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1975g[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public c(int i2) {
        if (i2 == 0) {
            this.f1974f = f1970j;
            this.f1975g = f1971k;
        } else {
            a(i2);
        }
        this.f1976h = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1976h) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1976h));
        }
        System.arraycopy(this.f1975g, 0, tArr, 0, this.f1976h);
        int length = tArr.length;
        int i2 = this.f1976h;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}

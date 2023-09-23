package e.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f1995i;

    /* renamed from: j  reason: collision with root package name */
    public static int f1996j;

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f1997k;

    /* renamed from: l  reason: collision with root package name */
    public static int f1998l;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1999f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f2000g;

    /* renamed from: h  reason: collision with root package name */
    public int f2001h;

    public h() {
        this.f1999f = d.a;
        this.f2000g = d.c;
        this.f2001h = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f1998l < 10) {
                    objArr[0] = f1997k;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1997k = objArr;
                    f1998l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f1996j < 10) {
                    objArr[0] = f1995i;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1995i = objArr;
                    f1996j++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (h.class) {
                Object[] objArr = f1997k;
                if (objArr != null) {
                    this.f2000g = objArr;
                    f1997k = (Object[]) objArr[0];
                    this.f1999f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1998l--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f1995i;
                if (objArr2 != null) {
                    this.f2000g = objArr2;
                    f1995i = (Object[]) objArr2[0];
                    this.f1999f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1996j--;
                    return;
                }
            }
        }
        this.f1999f = new int[i2];
        this.f2000g = new Object[i2 << 1];
    }

    public void b(int i2) {
        int i3 = this.f2001h;
        int[] iArr = this.f1999f;
        if (iArr.length < i2) {
            Object[] objArr = this.f2000g;
            a(i2);
            if (this.f2001h > 0) {
                System.arraycopy(iArr, 0, this.f1999f, 0, i3);
                System.arraycopy(objArr, 0, this.f2000g, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f2001h != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f2001h;
        if (i2 > 0) {
            int[] iArr = this.f1999f;
            Object[] objArr = this.f2000g;
            this.f1999f = d.a;
            this.f2000g = d.c;
            this.f2001h = 0;
            c(iArr, objArr, i2);
        }
        if (this.f2001h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i2) {
        int i3 = this.f2001h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.f1999f, i3, i2);
            if (a >= 0 && !obj.equals(this.f2000g[a << 1])) {
                int i4 = a + 1;
                while (i4 < i3 && this.f1999f[i4] == i2) {
                    if (obj.equals(this.f2000g[i4 << 1])) {
                        return i4;
                    }
                    i4++;
                }
                for (int i5 = a - 1; i5 >= 0 && this.f1999f[i5] == i2; i5--) {
                    if (obj.equals(this.f2000g[i5 << 1])) {
                        return i5;
                    }
                }
                return ~i4;
            }
            return a;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f2001h != hVar.f2001h) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2001h; i2++) {
                try {
                    K h2 = h(i2);
                    V l2 = l(i2);
                    Object obj2 = hVar.get(h2);
                    if (l2 == null) {
                        if (obj2 != null || !hVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!l2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2001h != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2001h; i3++) {
                try {
                    K h3 = h(i3);
                    V l3 = l(i3);
                    Object obj3 = map.get(h3);
                    if (l3 == null) {
                        if (obj3 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!l3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i2 = this.f2001h;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.f1999f, i2, 0);
            if (a >= 0 && this.f2000g[a << 1] != null) {
                int i3 = a + 1;
                while (i3 < i2 && this.f1999f[i3] == 0) {
                    if (this.f2000g[i3 << 1] == null) {
                        return i3;
                    }
                    i3++;
                }
                for (int i4 = a - 1; i4 >= 0 && this.f1999f[i4] == 0; i4--) {
                    if (this.f2000g[i4 << 1] == null) {
                        return i4;
                    }
                }
                return ~i3;
            }
            return a;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i2 = this.f2001h * 2;
        Object[] objArr = this.f2000g;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int e2 = e(obj);
        return e2 >= 0 ? (V) this.f2000g[(e2 << 1) + 1] : v;
    }

    public K h(int i2) {
        return (K) this.f2000g[i2 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f1999f;
        Object[] objArr = this.f2000g;
        int i2 = this.f2001h;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public void i(h<? extends K, ? extends V> hVar) {
        int i2 = hVar.f2001h;
        b(this.f2001h + i2);
        if (this.f2001h != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(hVar.h(i3), hVar.l(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(hVar.f1999f, 0, this.f1999f, 0, i2);
            System.arraycopy(hVar.f2000g, 0, this.f2000g, 0, i2 << 1);
            this.f2001h = i2;
        }
    }

    public boolean isEmpty() {
        return this.f2001h <= 0;
    }

    public V j(int i2) {
        Object[] objArr = this.f2000g;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f2001h;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f1999f, objArr, i4);
            this.f1999f = d.a;
            this.f2000g = d.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f1999f;
            if (iArr.length > 8 && i4 < iArr.length / 3) {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f2001h) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1999f, 0, i2);
                    System.arraycopy(objArr, 0, this.f2000g, 0, i3);
                }
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, this.f1999f, i2, i8);
                    System.arraycopy(objArr, i7 << 1, this.f2000g, i3, i8 << 1);
                }
            } else {
                if (i2 < i6) {
                    int i9 = i2 + 1;
                    int i10 = i6 - i2;
                    System.arraycopy(iArr, i9, iArr, i2, i10);
                    Object[] objArr2 = this.f2000g;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i3, i10 << 1);
                }
                Object[] objArr3 = this.f2000g;
                int i11 = i6 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            i5 = i6;
        }
        if (i4 == this.f2001h) {
            this.f2001h = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2000g;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public V l(int i2) {
        return (V) this.f2000g[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int d2;
        int i3 = this.f2001h;
        if (k2 == null) {
            d2 = f();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            d2 = d(k2, hashCode);
        }
        if (d2 >= 0) {
            int i4 = (d2 << 1) + 1;
            Object[] objArr = this.f2000g;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~d2;
        int[] iArr = this.f1999f;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f2000g;
            a(i6);
            if (i3 == this.f2001h) {
                int[] iArr2 = this.f1999f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2000g, 0, objArr2.length);
                }
                c(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1999f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2000g;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2001h - i5) << 1);
        }
        int i8 = this.f2001h;
        if (i3 == i8) {
            int[] iArr4 = this.f1999f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f2000g;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v;
                this.f2001h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V orDefault = getOrDefault(k2, null);
        return orDefault == null ? put(k2, v) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return j(e2);
        }
        return null;
    }

    public V replace(K k2, V v) {
        int e2 = e(k2);
        if (e2 >= 0) {
            return k(e2, v);
        }
        return null;
    }

    public int size() {
        return this.f2001h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2001h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2001h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l2 = l(i2);
            if (l2 != this) {
                sb.append(l2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            V l2 = l(e2);
            if (obj2 == l2 || (obj2 != null && obj2.equals(l2))) {
                j(e2);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k2, V v, V v2) {
        int e2 = e(k2);
        if (e2 >= 0) {
            V l2 = l(e2);
            if (l2 == v || (v != null && v.equals(l2))) {
                k(e2, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public h(int i2) {
        if (i2 == 0) {
            this.f1999f = d.a;
            this.f2000g = d.c;
        } else {
            a(i2);
        }
        this.f2001h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h<K, V> hVar) {
        this();
        if (hVar != 0) {
            i(hVar);
        }
    }
}

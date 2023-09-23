package f.h.h;

import com.google.android.gms.common.api.Api;
import f.h.h.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* loaded from: classes2.dex */
public final class g extends c<Boolean> implements y.a, RandomAccess, v0 {

    /* renamed from: i  reason: collision with root package name */
    public static final g f6354i;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f6355g;

    /* renamed from: h  reason: collision with root package name */
    public int f6356h;

    static {
        g gVar = new g(new boolean[0], 0);
        f6354i = gVar;
        gVar.f6325f = false;
    }

    public g() {
        this.f6355g = new boolean[10];
        this.f6356h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f6356h)) {
            boolean[] zArr = this.f6355g;
            if (i3 < zArr.length) {
                System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
            } else {
                boolean[] zArr2 = new boolean[f.a.b.a.a.m(i3, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i2);
                System.arraycopy(this.f6355g, i2, zArr2, i2 + 1, this.f6356h - i2);
                this.f6355g = zArr2;
            }
            this.f6355g[i2] = booleanValue;
            this.f6356h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i2));
    }

    @Override // f.h.h.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = y.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i2 = gVar.f6356h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f6356h;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f6355g;
            if (i4 > zArr.length) {
                this.f6355g = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(gVar.f6355g, 0, this.f6355g, this.f6356h, gVar.f6356h);
            this.f6356h = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void b(boolean z) {
        a();
        int i2 = this.f6356h;
        boolean[] zArr = this.f6355g;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[f.a.b.a.a.m(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f6355g = zArr2;
        }
        boolean[] zArr3 = this.f6355g;
        int i3 = this.f6356h;
        this.f6356h = i3 + 1;
        zArr3[i3] = z;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f6356h) {
            throw new IndexOutOfBoundsException(d(i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i2) {
        StringBuilder B = f.a.b.a.a.B("Index:", i2, ", Size:");
        B.append(this.f6356h);
        return B.toString();
    }

    @Override // f.h.h.y.i
    /* renamed from: e */
    public y.a p(int i2) {
        if (i2 >= this.f6356h) {
            return new g(Arrays.copyOf(this.f6355g, i2), this.f6356h);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f6356h != gVar.f6356h) {
            return false;
        }
        boolean[] zArr = gVar.f6355g;
        for (int i2 = 0; i2 < this.f6356h; i2++) {
            if (this.f6355g[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        c(i2);
        return Boolean.valueOf(this.f6355g[i2]);
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f6356h; i3++) {
            i2 = (i2 * 31) + y.a(this.f6355g[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i2 = this.f6356h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f6355g[i3] == booleanValue) {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        int i3;
        a();
        c(i2);
        boolean[] zArr = this.f6355g;
        boolean z = zArr[i2];
        if (i2 < this.f6356h - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f6356h--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            boolean[] zArr = this.f6355g;
            System.arraycopy(zArr, i3, zArr, i2, this.f6356h - i3);
            this.f6356h -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i2);
        boolean[] zArr = this.f6355g;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6356h;
    }

    public g(boolean[] zArr, int i2) {
        this.f6355g = zArr;
        this.f6356h = i2;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}

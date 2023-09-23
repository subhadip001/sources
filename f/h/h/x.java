package f.h.h;

import com.google.android.gms.common.api.Api;
import f.h.h.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* loaded from: classes2.dex */
public final class x extends c<Integer> implements y.g, RandomAccess, v0 {

    /* renamed from: i  reason: collision with root package name */
    public static final x f6430i;

    /* renamed from: g  reason: collision with root package name */
    public int[] f6431g;

    /* renamed from: h  reason: collision with root package name */
    public int f6432h;

    static {
        x xVar = new x(new int[0], 0);
        f6430i = xVar;
        xVar.f6325f = false;
    }

    public x() {
        this.f6431g = new int[10];
        this.f6432h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f6432h)) {
            int[] iArr = this.f6431g;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
            } else {
                int[] iArr2 = new int[f.a.b.a.a.m(i3, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.f6431g, i2, iArr2, i2 + 1, this.f6432h - i2);
                this.f6431g = iArr2;
            }
            this.f6431g[i2] = intValue;
            this.f6432h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i2));
    }

    @Override // f.h.h.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = y.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i2 = xVar.f6432h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f6432h;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f6431g;
            if (i4 > iArr.length) {
                this.f6431g = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(xVar.f6431g, 0, this.f6431g, this.f6432h, xVar.f6432h);
            this.f6432h = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void b(int i2) {
        a();
        int i3 = this.f6432h;
        int[] iArr = this.f6431g;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[f.a.b.a.a.m(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f6431g = iArr2;
        }
        int[] iArr3 = this.f6431g;
        int i4 = this.f6432h;
        this.f6432h = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f6432h) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public int d(int i2) {
        c(i2);
        return this.f6431g[i2];
    }

    public final String e(int i2) {
        StringBuilder B = f.a.b.a.a.B("Index:", i2, ", Size:");
        B.append(this.f6432h);
        return B.toString();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f6432h != xVar.f6432h) {
            return false;
        }
        int[] iArr = xVar.f6431g;
        for (int i2 = 0; i2 < this.f6432h; i2++) {
            if (this.f6431g[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        c(i2);
        return Integer.valueOf(this.f6431g[i2]);
    }

    @Override // f.h.h.y.i
    /* renamed from: h */
    public y.g p(int i2) {
        if (i2 >= this.f6432h) {
            return new x(Arrays.copyOf(this.f6431g, i2), this.f6432h);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f6432h; i3++) {
            i2 = (i2 * 31) + this.f6431g[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.f6432h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f6431g[i3] == intValue) {
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
        int[] iArr = this.f6431g;
        int i4 = iArr[i2];
        if (i2 < this.f6432h - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i3 - i2) - 1);
        }
        this.f6432h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            int[] iArr = this.f6431g;
            System.arraycopy(iArr, i3, iArr, i2, this.f6432h - i3);
            this.f6432h -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i2);
        int[] iArr = this.f6431g;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6432h;
    }

    public x(int[] iArr, int i2) {
        this.f6431g = iArr;
        this.f6432h = i2;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}

package f.h.h;

import com.google.android.gms.common.api.Api;
import f.h.h.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* loaded from: classes2.dex */
public final class n extends c<Double> implements y.b, RandomAccess, v0 {

    /* renamed from: i  reason: collision with root package name */
    public static final n f6412i;

    /* renamed from: g  reason: collision with root package name */
    public double[] f6413g;

    /* renamed from: h  reason: collision with root package name */
    public int f6414h;

    static {
        n nVar = new n(new double[0], 0);
        f6412i = nVar;
        nVar.f6325f = false;
    }

    public n() {
        this.f6413g = new double[10];
        this.f6414h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f6414h)) {
            double[] dArr = this.f6413g;
            if (i3 < dArr.length) {
                System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
            } else {
                double[] dArr2 = new double[f.a.b.a.a.m(i3, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i2);
                System.arraycopy(this.f6413g, i2, dArr2, i2 + 1, this.f6414h - i2);
                this.f6413g = dArr2;
            }
            this.f6413g[i2] = doubleValue;
            this.f6414h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i2));
    }

    @Override // f.h.h.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = y.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i2 = nVar.f6414h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f6414h;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f6413g;
            if (i4 > dArr.length) {
                this.f6413g = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(nVar.f6413g, 0, this.f6413g, this.f6414h, nVar.f6414h);
            this.f6414h = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void b(double d2) {
        a();
        int i2 = this.f6414h;
        double[] dArr = this.f6413g;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[f.a.b.a.a.m(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f6413g = dArr2;
        }
        double[] dArr3 = this.f6413g;
        int i3 = this.f6414h;
        this.f6414h = i3 + 1;
        dArr3[i3] = d2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f6414h) {
            throw new IndexOutOfBoundsException(d(i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i2) {
        StringBuilder B = f.a.b.a.a.B("Index:", i2, ", Size:");
        B.append(this.f6414h);
        return B.toString();
    }

    @Override // f.h.h.y.i
    /* renamed from: e */
    public y.b p(int i2) {
        if (i2 >= this.f6414h) {
            return new n(Arrays.copyOf(this.f6413g, i2), this.f6414h);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f6414h != nVar.f6414h) {
            return false;
        }
        double[] dArr = nVar.f6413g;
        for (int i2 = 0; i2 < this.f6414h; i2++) {
            if (Double.doubleToLongBits(this.f6413g[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        c(i2);
        return Double.valueOf(this.f6413g[i2]);
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f6414h; i3++) {
            i2 = (i2 * 31) + y.b(Double.doubleToLongBits(this.f6413g[i3]));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i2 = this.f6414h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f6413g[i3] == doubleValue) {
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
        double[] dArr = this.f6413g;
        double d2 = dArr[i2];
        if (i2 < this.f6414h - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f6414h--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            double[] dArr = this.f6413g;
            System.arraycopy(dArr, i3, dArr, i2, this.f6414h - i3);
            this.f6414h -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i2);
        double[] dArr = this.f6413g;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6414h;
    }

    public n(double[] dArr, int i2) {
        this.f6413g = dArr;
        this.f6414h = i2;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}

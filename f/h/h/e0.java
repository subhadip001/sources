package f.h.h;

import com.google.android.gms.common.api.Api;
import f.h.h.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes2.dex */
public final class e0 extends c<Long> implements y.h, RandomAccess, v0 {

    /* renamed from: i  reason: collision with root package name */
    public static final e0 f6328i;

    /* renamed from: g  reason: collision with root package name */
    public long[] f6329g;

    /* renamed from: h  reason: collision with root package name */
    public int f6330h;

    static {
        e0 e0Var = new e0(new long[0], 0);
        f6328i = e0Var;
        e0Var.f6325f = false;
    }

    public e0() {
        this.f6329g = new long[10];
        this.f6330h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f6330h)) {
            long[] jArr = this.f6329g;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[f.a.b.a.a.m(i3, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.f6329g, i2, jArr2, i2 + 1, this.f6330h - i2);
                this.f6329g = jArr2;
            }
            this.f6329g[i2] = longValue;
            this.f6330h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i2));
    }

    @Override // f.h.h.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = y.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof e0)) {
            return super.addAll(collection);
        }
        e0 e0Var = (e0) collection;
        int i2 = e0Var.f6330h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f6330h;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f6329g;
            if (i4 > jArr.length) {
                this.f6329g = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(e0Var.f6329g, 0, this.f6329g, this.f6330h, e0Var.f6330h);
            this.f6330h = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void b(long j2) {
        a();
        int i2 = this.f6330h;
        long[] jArr = this.f6329g;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[f.a.b.a.a.m(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f6329g = jArr2;
        }
        long[] jArr3 = this.f6329g;
        int i3 = this.f6330h;
        this.f6330h = i3 + 1;
        jArr3[i3] = j2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f6330h) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public long d(int i2) {
        c(i2);
        return this.f6329g[i2];
    }

    public final String e(int i2) {
        StringBuilder B = f.a.b.a.a.B("Index:", i2, ", Size:");
        B.append(this.f6330h);
        return B.toString();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        if (this.f6330h != e0Var.f6330h) {
            return false;
        }
        long[] jArr = e0Var.f6329g;
        for (int i2 = 0; i2 < this.f6330h; i2++) {
            if (this.f6329g[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        c(i2);
        return Long.valueOf(this.f6329g[i2]);
    }

    @Override // f.h.h.y.i
    /* renamed from: h */
    public y.h p(int i2) {
        if (i2 >= this.f6330h) {
            return new e0(Arrays.copyOf(this.f6329g, i2), this.f6330h);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f6330h; i3++) {
            i2 = (i2 * 31) + y.b(this.f6329g[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i2 = this.f6330h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f6329g[i3] == longValue) {
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
        long[] jArr = this.f6329g;
        long j2 = jArr[i2];
        if (i2 < this.f6330h - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f6330h--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            long[] jArr = this.f6329g;
            System.arraycopy(jArr, i3, jArr, i2, this.f6330h - i3);
            this.f6330h -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i2);
        long[] jArr = this.f6329g;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6330h;
    }

    public e0(long[] jArr, int i2) {
        this.f6329g = jArr;
        this.f6330h = i2;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}

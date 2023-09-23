package f.h.c.e;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: Ints.java */
/* loaded from: classes.dex */
public class a extends AbstractList<Integer> implements RandomAccess, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final int[] f6007f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6008g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6009h;

    public a(int[] iArr, int i2, int i3) {
        this.f6007f = iArr;
        this.f6008g = i2;
        this.f6009h = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f6007f;
            int intValue = ((Integer) obj).intValue();
            int i2 = this.f6008g;
            int i3 = this.f6009h;
            while (true) {
                if (i2 >= i3) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == intValue) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f6007f[this.f6008g + i2] != aVar.f6007f[aVar.f6008g + i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        f.h.b.c.a.t(i2, size());
        return Integer.valueOf(this.f6007f[this.f6008g + i2]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f6008g; i3 < this.f6009h; i3++) {
            i2 = (i2 * 31) + this.f6007f[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f6007f;
            int intValue = ((Integer) obj).intValue();
            int i2 = this.f6008g;
            int i3 = this.f6009h;
            while (true) {
                if (i2 >= i3) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == intValue) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f6008g;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f6007f;
            int intValue = ((Integer) obj).intValue();
            int i2 = this.f6008g;
            int i3 = this.f6009h - 1;
            while (true) {
                if (i3 < i2) {
                    i3 = -1;
                    break;
                } else if (iArr[i3] == intValue) {
                    break;
                } else {
                    i3--;
                }
            }
            if (i3 >= 0) {
                return i3 - this.f6008g;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        Integer num = (Integer) obj;
        f.h.b.c.a.t(i2, size());
        int[] iArr = this.f6007f;
        int i3 = this.f6008g + i2;
        int i4 = iArr[i3];
        Objects.requireNonNull(num);
        iArr[i3] = num.intValue();
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6009h - this.f6008g;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Integer> subList(int i2, int i3) {
        f.h.b.c.a.A(i2, i3, size());
        if (i2 == i3) {
            return Collections.emptyList();
        }
        int[] iArr = this.f6007f;
        int i4 = this.f6008g;
        return new a(iArr, i2 + i4, i4 + i3);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append(this.f6007f[this.f6008g]);
        int i2 = this.f6008g;
        while (true) {
            i2++;
            if (i2 < this.f6009h) {
                sb.append(", ");
                sb.append(this.f6007f[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}

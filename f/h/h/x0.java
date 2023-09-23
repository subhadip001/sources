package f.h.h;

import f.h.h.y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes2.dex */
public final class x0<E> extends c<E> implements RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public static final x0<Object> f6433i;

    /* renamed from: g  reason: collision with root package name */
    public E[] f6434g;

    /* renamed from: h  reason: collision with root package name */
    public int f6435h;

    static {
        x0<Object> x0Var = new x0<>(new Object[0], 0);
        f6433i = x0Var;
        x0Var.f6325f = false;
    }

    public x0(E[] eArr, int i2) {
        this.f6434g = eArr;
        this.f6435h = i2;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        a();
        int i2 = this.f6435h;
        E[] eArr = this.f6434g;
        if (i2 == eArr.length) {
            this.f6434g = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6434g;
        int i3 = this.f6435h;
        this.f6435h = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f6435h) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    public final String c(int i2) {
        StringBuilder B = f.a.b.a.a.B("Index:", i2, ", Size:");
        B.append(this.f6435h);
        return B.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        b(i2);
        return this.f6434g[i2];
    }

    @Override // f.h.h.y.i
    public y.i p(int i2) {
        if (i2 >= this.f6435h) {
            return new x0(Arrays.copyOf(this.f6434g, i2), this.f6435h);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.List
    public E remove(int i2) {
        int i3;
        a();
        b(i2);
        E[] eArr = this.f6434g;
        E e2 = eArr[i2];
        if (i2 < this.f6435h - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f6435h--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        a();
        b(i2);
        E[] eArr = this.f6434g;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6435h;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f6435h)) {
            E[] eArr = this.f6434g;
            if (i3 < eArr.length) {
                System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
            } else {
                E[] eArr2 = (E[]) new Object[f.a.b.a.a.m(i3, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i2);
                System.arraycopy(this.f6434g, i2, eArr2, i2 + 1, this.f6435h - i2);
                this.f6434g = eArr2;
            }
            this.f6434g[i2] = e2;
            this.f6435h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(c(i2));
    }
}

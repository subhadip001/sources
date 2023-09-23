package f.h.c.b;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX WARN: Incorrect class signature, class is equals to this class: <E:Ljava/lang/Object;>Lf/h/c/b/a<TE;>; */
/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: classes.dex */
public abstract class a<E> extends u0 implements ListIterator {

    /* renamed from: f  reason: collision with root package name */
    public final int f5851f;

    /* renamed from: g  reason: collision with root package name */
    public int f5852g;

    public a(int i2, int i3) {
        f.h.b.c.a.z(i3, i2);
        this.f5851f = i2;
        this.f5852g = i3;
    }

    public abstract E a(int i2);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5852g < this.f5851f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5852g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i2 = this.f5852g;
            this.f5852g = i2 + 1;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5852g;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i2 = this.f5852g - 1;
            this.f5852g = i2;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5852g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

package f.h.h;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes2.dex */
public class j1 extends AbstractList<String> implements c0, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public final c0 f6372f;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes2.dex */
    public class a implements ListIterator<String> {

        /* renamed from: f  reason: collision with root package name */
        public ListIterator<String> f6373f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f6374g;

        public a(int i2) {
            this.f6374g = i2;
            this.f6373f = j1.this.f6372f.listIterator(i2);
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f6373f.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f6373f.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f6373f.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f6373f.nextIndex();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.f6373f.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f6373f.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes2.dex */
    public class b implements Iterator<String> {

        /* renamed from: f  reason: collision with root package name */
        public Iterator<String> f6376f;

        public b() {
            this.f6376f = j1.this.f6372f.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6376f.hasNext();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.f6376f.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public j1(c0 c0Var) {
        this.f6372f = c0Var;
    }

    @Override // f.h.h.c0
    public List<?> C() {
        return this.f6372f.C();
    }

    @Override // f.h.h.c0
    public c0 W() {
        return this;
    }

    @Override // f.h.h.c0
    public Object d0(int i2) {
        return this.f6372f.d0(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        return (String) this.f6372f.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    @Override // f.h.h.c0
    public void q(j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6372f.size();
    }
}

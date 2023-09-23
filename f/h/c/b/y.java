package f.h.c.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* loaded from: classes.dex */
public enum y implements Iterator<Object> {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        f.h.b.c.a.C(false, "no calls to next() since the last call to remove()");
    }
}

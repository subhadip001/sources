package f.h.c.b;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: TransformedIterator.java */
/* loaded from: classes.dex */
public abstract class t0<F, T> implements Iterator<T> {

    /* renamed from: f  reason: collision with root package name */
    public final Iterator<? extends F> f5995f;

    public t0(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f5995f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5995f.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f5995f.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5995f.remove();
    }
}

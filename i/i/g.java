package i.i;

import java.util.Iterator;

/* compiled from: Iterators.kt */
/* loaded from: classes2.dex */
public abstract class g implements Iterator<Integer> {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

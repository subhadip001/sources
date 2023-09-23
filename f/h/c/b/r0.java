package f.h.c.b;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: Sets.java */
/* loaded from: classes.dex */
public abstract class r0<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof j0) {
            collection = ((j0) collection).g();
        }
        if ((collection instanceof Set) && collection.size() > size()) {
            Iterator<E> it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return g.b(this, collection.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}

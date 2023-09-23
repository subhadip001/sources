package i.p;

import i.l.b.i;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes2.dex */
public final class a<T> implements b<T> {
    public final AtomicReference<b<T>> a;

    public a(b<? extends T> bVar) {
        i.e(bVar, "sequence");
        this.a = new AtomicReference<>(bVar);
    }

    @Override // i.p.b
    public Iterator<T> iterator() {
        b<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

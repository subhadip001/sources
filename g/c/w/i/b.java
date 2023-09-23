package g.c.w.i;

import g.c.w.c.g;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BasicQueueSubscription.java */
/* loaded from: classes2.dex */
public abstract class b<T> extends AtomicLong implements g<T> {
    @Override // g.c.w.c.j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

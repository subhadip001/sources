package g.c.w.d;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BasicIntQueueDisposable.java */
/* loaded from: classes2.dex */
public abstract class b<T> extends AtomicInteger implements g.c.w.c.e<T> {
    @Override // g.c.w.c.j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}

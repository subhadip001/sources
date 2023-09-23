package j.a.y1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
/* loaded from: classes2.dex */
public abstract class c<T> extends o {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = b.a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.a.y1.o
    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = b.a;
        if (obj2 == obj3) {
            obj2 = c(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!a.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract Object c(T t);
}
